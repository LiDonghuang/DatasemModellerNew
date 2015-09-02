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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelBuilder'", "'Description'", "'ExperimentModel'", "'Path'", "'OrganizationalModel'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkSources'", "'end WorkSources'", "'WorkItemNetworks'", "'end WorkItemNetworks'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'end ExperimentSettings'", "'end ExperimentModel'", "'SystemLibraries'", "'EventTypes'", "'end EventTypes'", "'ConditionTypes'", "'end ConditionTypes'", "'TransitionTypes'", "'end TransitionTypes'", "'GovernanceLibrary'", "'WIAcceptanceRuleTypes'", "'{'", "'}'", "'WISelectionRuleTypes'", "'WIAssignmentRuleTypes'", "'ResourceAllocationRuleTypes'", "'ResourceOutsourcingRuleTypes'", "'end GovernanceLibrary'", "'TaskLibrary'", "'ProcessModels'", "'end ProcessModels'", "'ValueFunctions'", "'end ValueFunctions'", "'end TaskLibrary'", "'end SystemLibraries'", "'UserLibraries'", "'WorkItemTypes'", "'end WorkItemTypes'", "'ClassOfServices'", "'end ClassOfServices'", "'Services'", "'end Services'", "'GovernanceStrategies'", "'end GovernanceStrategies'", "'end UserLibraries'", "'.'", "'Random.'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'Normal'", "'Uniform'", "'Exponential'", "'['", "']'", "'EventType'", "'ConditionType'", "'TransitionType'", "'ProcessModel'", "'Events'", "'Event'", "'Conditions'", "'Transitions'", "'='", "'WINReplicationSetting'", "'WorkItemNetwork'", "'NumReplications'", "'Indicators'", "'GovernanceStrategy'", "'Mechanisms'", "'WIAcceptance'", "'BackLogLimit'", "'WIPLimit'", "'WISelection'", "'WIAssignment'", "'ResourceAllocation'", "'ResourceOutsourcing'", "'RuleType'", "'Mechanism'", "'Attributes'", "'WorkSource'", "'AssignTo'", "'WorkItems'", "'WorkItem'", "'Type'", "'Predecessors'", "'Subtasks'", "'CausalTriggers'", "'RequiredServices'", "'Efforts'", "'Value'", "'ClassOfService'", "'ArrivalTime'", "'DueDate'", "'=>'", "'->'", "'AtProgress'", "'OnProbability'", "'WorkItemType'", "'ValueFunction'", "'Disruptive:'", "'TRUE'", "'FALSE'", "'Service'", "'ServiceProvider'", "'Group'", "'OutsourceFrom'", "'TeamService'", "'Resources'", "'Resource'", "'SkillSet'", "'Efficiency'"
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
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=5;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
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
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
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

                if ( (LA2_0==RULE_INT||(LA2_0>=124 && LA2_0<=125)) ) {
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

                if ( (LA3_0==RULE_INT||LA3_0==100) ) {
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

                if ( (LA4_0==RULE_INT||LA4_0==85) ) {
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:402:1: ruleSystemLibraries returns [EObject current=null] : (otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'TransitionTypes' ( (lv_TransitionTypes_8_0= ruleTransitionType ) )+ otherlv_9= 'end TransitionTypes' otherlv_10= 'GovernanceLibrary' otherlv_11= 'WIAcceptanceRuleTypes' otherlv_12= '{' ( (lv_WIAcceptanceRuleTypes_13_0= ruleWIAcceptanceRuleType ) )+ otherlv_14= '}' otherlv_15= 'WISelectionRuleTypes' otherlv_16= '{' ( (lv_WISelectionRuleTypes_17_0= ruleWISelectionRuleType ) )+ otherlv_18= '}' otherlv_19= 'WIAssignmentRuleTypes' otherlv_20= '{' ( (lv_WIAssignmentRuleTypes_21_0= ruleWIAssignmentRuleType ) )+ otherlv_22= '}' otherlv_23= 'ResourceAllocationRuleTypes' otherlv_24= '{' ( (lv_ResourceAllocationRuleTypes_25_0= ruleResourceAllocationRuleType ) )+ otherlv_26= '}' otherlv_27= 'ResourceOutsourcingRuleTypes' otherlv_28= '{' ( (lv_ResourceOutsourcingRuleTypes_29_0= ruleResourceOutsourcingRuleType ) )+ otherlv_30= '}' otherlv_31= 'end GovernanceLibrary' otherlv_32= 'TaskLibrary' otherlv_33= 'ProcessModels' ( (lv_ProcessModels_34_0= ruleProcessModel ) )+ otherlv_35= 'end ProcessModels' otherlv_36= 'ValueFunctions' ( (lv_ValueFunctions_37_0= ruleValueFunction ) )+ otherlv_38= 'end ValueFunctions' otherlv_39= 'end TaskLibrary' otherlv_40= 'end SystemLibraries' ) ;
    public final EObject ruleSystemLibraries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        EObject lv_EventTypes_2_0 = null;

        EObject lv_ConditionTypes_5_0 = null;

        EObject lv_TransitionTypes_8_0 = null;

        EObject lv_WIAcceptanceRuleTypes_13_0 = null;

        EObject lv_WISelectionRuleTypes_17_0 = null;

        EObject lv_WIAssignmentRuleTypes_21_0 = null;

        EObject lv_ResourceAllocationRuleTypes_25_0 = null;

        EObject lv_ResourceOutsourcingRuleTypes_29_0 = null;

        EObject lv_ProcessModels_34_0 = null;

        EObject lv_ValueFunctions_37_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:405:28: ( (otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'TransitionTypes' ( (lv_TransitionTypes_8_0= ruleTransitionType ) )+ otherlv_9= 'end TransitionTypes' otherlv_10= 'GovernanceLibrary' otherlv_11= 'WIAcceptanceRuleTypes' otherlv_12= '{' ( (lv_WIAcceptanceRuleTypes_13_0= ruleWIAcceptanceRuleType ) )+ otherlv_14= '}' otherlv_15= 'WISelectionRuleTypes' otherlv_16= '{' ( (lv_WISelectionRuleTypes_17_0= ruleWISelectionRuleType ) )+ otherlv_18= '}' otherlv_19= 'WIAssignmentRuleTypes' otherlv_20= '{' ( (lv_WIAssignmentRuleTypes_21_0= ruleWIAssignmentRuleType ) )+ otherlv_22= '}' otherlv_23= 'ResourceAllocationRuleTypes' otherlv_24= '{' ( (lv_ResourceAllocationRuleTypes_25_0= ruleResourceAllocationRuleType ) )+ otherlv_26= '}' otherlv_27= 'ResourceOutsourcingRuleTypes' otherlv_28= '{' ( (lv_ResourceOutsourcingRuleTypes_29_0= ruleResourceOutsourcingRuleType ) )+ otherlv_30= '}' otherlv_31= 'end GovernanceLibrary' otherlv_32= 'TaskLibrary' otherlv_33= 'ProcessModels' ( (lv_ProcessModels_34_0= ruleProcessModel ) )+ otherlv_35= 'end ProcessModels' otherlv_36= 'ValueFunctions' ( (lv_ValueFunctions_37_0= ruleValueFunction ) )+ otherlv_38= 'end ValueFunctions' otherlv_39= 'end TaskLibrary' otherlv_40= 'end SystemLibraries' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:406:1: (otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'TransitionTypes' ( (lv_TransitionTypes_8_0= ruleTransitionType ) )+ otherlv_9= 'end TransitionTypes' otherlv_10= 'GovernanceLibrary' otherlv_11= 'WIAcceptanceRuleTypes' otherlv_12= '{' ( (lv_WIAcceptanceRuleTypes_13_0= ruleWIAcceptanceRuleType ) )+ otherlv_14= '}' otherlv_15= 'WISelectionRuleTypes' otherlv_16= '{' ( (lv_WISelectionRuleTypes_17_0= ruleWISelectionRuleType ) )+ otherlv_18= '}' otherlv_19= 'WIAssignmentRuleTypes' otherlv_20= '{' ( (lv_WIAssignmentRuleTypes_21_0= ruleWIAssignmentRuleType ) )+ otherlv_22= '}' otherlv_23= 'ResourceAllocationRuleTypes' otherlv_24= '{' ( (lv_ResourceAllocationRuleTypes_25_0= ruleResourceAllocationRuleType ) )+ otherlv_26= '}' otherlv_27= 'ResourceOutsourcingRuleTypes' otherlv_28= '{' ( (lv_ResourceOutsourcingRuleTypes_29_0= ruleResourceOutsourcingRuleType ) )+ otherlv_30= '}' otherlv_31= 'end GovernanceLibrary' otherlv_32= 'TaskLibrary' otherlv_33= 'ProcessModels' ( (lv_ProcessModels_34_0= ruleProcessModel ) )+ otherlv_35= 'end ProcessModels' otherlv_36= 'ValueFunctions' ( (lv_ValueFunctions_37_0= ruleValueFunction ) )+ otherlv_38= 'end ValueFunctions' otherlv_39= 'end TaskLibrary' otherlv_40= 'end SystemLibraries' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:406:1: (otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'TransitionTypes' ( (lv_TransitionTypes_8_0= ruleTransitionType ) )+ otherlv_9= 'end TransitionTypes' otherlv_10= 'GovernanceLibrary' otherlv_11= 'WIAcceptanceRuleTypes' otherlv_12= '{' ( (lv_WIAcceptanceRuleTypes_13_0= ruleWIAcceptanceRuleType ) )+ otherlv_14= '}' otherlv_15= 'WISelectionRuleTypes' otherlv_16= '{' ( (lv_WISelectionRuleTypes_17_0= ruleWISelectionRuleType ) )+ otherlv_18= '}' otherlv_19= 'WIAssignmentRuleTypes' otherlv_20= '{' ( (lv_WIAssignmentRuleTypes_21_0= ruleWIAssignmentRuleType ) )+ otherlv_22= '}' otherlv_23= 'ResourceAllocationRuleTypes' otherlv_24= '{' ( (lv_ResourceAllocationRuleTypes_25_0= ruleResourceAllocationRuleType ) )+ otherlv_26= '}' otherlv_27= 'ResourceOutsourcingRuleTypes' otherlv_28= '{' ( (lv_ResourceOutsourcingRuleTypes_29_0= ruleResourceOutsourcingRuleType ) )+ otherlv_30= '}' otherlv_31= 'end GovernanceLibrary' otherlv_32= 'TaskLibrary' otherlv_33= 'ProcessModels' ( (lv_ProcessModels_34_0= ruleProcessModel ) )+ otherlv_35= 'end ProcessModels' otherlv_36= 'ValueFunctions' ( (lv_ValueFunctions_37_0= ruleValueFunction ) )+ otherlv_38= 'end ValueFunctions' otherlv_39= 'end TaskLibrary' otherlv_40= 'end SystemLibraries' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:406:3: otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'TransitionTypes' ( (lv_TransitionTypes_8_0= ruleTransitionType ) )+ otherlv_9= 'end TransitionTypes' otherlv_10= 'GovernanceLibrary' otherlv_11= 'WIAcceptanceRuleTypes' otherlv_12= '{' ( (lv_WIAcceptanceRuleTypes_13_0= ruleWIAcceptanceRuleType ) )+ otherlv_14= '}' otherlv_15= 'WISelectionRuleTypes' otherlv_16= '{' ( (lv_WISelectionRuleTypes_17_0= ruleWISelectionRuleType ) )+ otherlv_18= '}' otherlv_19= 'WIAssignmentRuleTypes' otherlv_20= '{' ( (lv_WIAssignmentRuleTypes_21_0= ruleWIAssignmentRuleType ) )+ otherlv_22= '}' otherlv_23= 'ResourceAllocationRuleTypes' otherlv_24= '{' ( (lv_ResourceAllocationRuleTypes_25_0= ruleResourceAllocationRuleType ) )+ otherlv_26= '}' otherlv_27= 'ResourceOutsourcingRuleTypes' otherlv_28= '{' ( (lv_ResourceOutsourcingRuleTypes_29_0= ruleResourceOutsourcingRuleType ) )+ otherlv_30= '}' otherlv_31= 'end GovernanceLibrary' otherlv_32= 'TaskLibrary' otherlv_33= 'ProcessModels' ( (lv_ProcessModels_34_0= ruleProcessModel ) )+ otherlv_35= 'end ProcessModels' otherlv_36= 'ValueFunctions' ( (lv_ValueFunctions_37_0= ruleValueFunction ) )+ otherlv_38= 'end ValueFunctions' otherlv_39= 'end TaskLibrary' otherlv_40= 'end SystemLibraries'
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

                if ( (LA5_0==75) ) {
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

                if ( (LA6_0==76) ) {
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

                	newLeafNode(otherlv_7, grammarAccess.getSystemLibrariesAccess().getTransitionTypesKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:466:1: ( (lv_TransitionTypes_8_0= ruleTransitionType ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==77) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:467:1: (lv_TransitionTypes_8_0= ruleTransitionType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:467:1: (lv_TransitionTypes_8_0= ruleTransitionType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:468:3: lv_TransitionTypes_8_0= ruleTransitionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getTransitionTypesTransitionTypeParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransitionType_in_ruleSystemLibraries854);
            	    lv_TransitionTypes_8_0=ruleTransitionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TransitionTypes",
            	            		lv_TransitionTypes_8_0, 
            	            		"TransitionType");
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

            otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleSystemLibraries867); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemLibrariesAccess().getEndTransitionTypesKeyword_9());
                
            otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleSystemLibraries879); 

                	newLeafNode(otherlv_10, grammarAccess.getSystemLibrariesAccess().getGovernanceLibraryKeyword_10());
                
            otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleSystemLibraries891); 

                	newLeafNode(otherlv_11, grammarAccess.getSystemLibrariesAccess().getWIAcceptanceRuleTypesKeyword_11());
                
            otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleSystemLibraries903); 

                	newLeafNode(otherlv_12, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_12());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:500:1: ( (lv_WIAcceptanceRuleTypes_13_0= ruleWIAcceptanceRuleType ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==97) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:501:1: (lv_WIAcceptanceRuleTypes_13_0= ruleWIAcceptanceRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:501:1: (lv_WIAcceptanceRuleTypes_13_0= ruleWIAcceptanceRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:502:3: lv_WIAcceptanceRuleTypes_13_0= ruleWIAcceptanceRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getWIAcceptanceRuleTypesWIAcceptanceRuleTypeParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWIAcceptanceRuleType_in_ruleSystemLibraries924);
            	    lv_WIAcceptanceRuleTypes_13_0=ruleWIAcceptanceRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WIAcceptanceRuleTypes",
            	            		lv_WIAcceptanceRuleTypes_13_0, 
            	            		"WIAcceptanceRuleType");
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

            otherlv_14=(Token)match(input,39,FOLLOW_39_in_ruleSystemLibraries937); 

                	newLeafNode(otherlv_14, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_15=(Token)match(input,40,FOLLOW_40_in_ruleSystemLibraries949); 

                	newLeafNode(otherlv_15, grammarAccess.getSystemLibrariesAccess().getWISelectionRuleTypesKeyword_15());
                
            otherlv_16=(Token)match(input,38,FOLLOW_38_in_ruleSystemLibraries961); 

                	newLeafNode(otherlv_16, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_16());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:530:1: ( (lv_WISelectionRuleTypes_17_0= ruleWISelectionRuleType ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==97) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:531:1: (lv_WISelectionRuleTypes_17_0= ruleWISelectionRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:531:1: (lv_WISelectionRuleTypes_17_0= ruleWISelectionRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:532:3: lv_WISelectionRuleTypes_17_0= ruleWISelectionRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getWISelectionRuleTypesWISelectionRuleTypeParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWISelectionRuleType_in_ruleSystemLibraries982);
            	    lv_WISelectionRuleTypes_17_0=ruleWISelectionRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WISelectionRuleTypes",
            	            		lv_WISelectionRuleTypes_17_0, 
            	            		"WISelectionRuleType");
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

            otherlv_18=(Token)match(input,39,FOLLOW_39_in_ruleSystemLibraries995); 

                	newLeafNode(otherlv_18, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_18());
                
            otherlv_19=(Token)match(input,41,FOLLOW_41_in_ruleSystemLibraries1007); 

                	newLeafNode(otherlv_19, grammarAccess.getSystemLibrariesAccess().getWIAssignmentRuleTypesKeyword_19());
                
            otherlv_20=(Token)match(input,38,FOLLOW_38_in_ruleSystemLibraries1019); 

                	newLeafNode(otherlv_20, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_20());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:560:1: ( (lv_WIAssignmentRuleTypes_21_0= ruleWIAssignmentRuleType ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==97) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:561:1: (lv_WIAssignmentRuleTypes_21_0= ruleWIAssignmentRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:561:1: (lv_WIAssignmentRuleTypes_21_0= ruleWIAssignmentRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:562:3: lv_WIAssignmentRuleTypes_21_0= ruleWIAssignmentRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getWIAssignmentRuleTypesWIAssignmentRuleTypeParserRuleCall_21_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWIAssignmentRuleType_in_ruleSystemLibraries1040);
            	    lv_WIAssignmentRuleTypes_21_0=ruleWIAssignmentRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WIAssignmentRuleTypes",
            	            		lv_WIAssignmentRuleTypes_21_0, 
            	            		"WIAssignmentRuleType");
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

            otherlv_22=(Token)match(input,39,FOLLOW_39_in_ruleSystemLibraries1053); 

                	newLeafNode(otherlv_22, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_22());
                
            otherlv_23=(Token)match(input,42,FOLLOW_42_in_ruleSystemLibraries1065); 

                	newLeafNode(otherlv_23, grammarAccess.getSystemLibrariesAccess().getResourceAllocationRuleTypesKeyword_23());
                
            otherlv_24=(Token)match(input,38,FOLLOW_38_in_ruleSystemLibraries1077); 

                	newLeafNode(otherlv_24, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_24());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:590:1: ( (lv_ResourceAllocationRuleTypes_25_0= ruleResourceAllocationRuleType ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==97) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:591:1: (lv_ResourceAllocationRuleTypes_25_0= ruleResourceAllocationRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:591:1: (lv_ResourceAllocationRuleTypes_25_0= ruleResourceAllocationRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:592:3: lv_ResourceAllocationRuleTypes_25_0= ruleResourceAllocationRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getResourceAllocationRuleTypesResourceAllocationRuleTypeParserRuleCall_25_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceAllocationRuleType_in_ruleSystemLibraries1098);
            	    lv_ResourceAllocationRuleTypes_25_0=ruleResourceAllocationRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ResourceAllocationRuleTypes",
            	            		lv_ResourceAllocationRuleTypes_25_0, 
            	            		"ResourceAllocationRuleType");
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

            otherlv_26=(Token)match(input,39,FOLLOW_39_in_ruleSystemLibraries1111); 

                	newLeafNode(otherlv_26, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_26());
                
            otherlv_27=(Token)match(input,43,FOLLOW_43_in_ruleSystemLibraries1123); 

                	newLeafNode(otherlv_27, grammarAccess.getSystemLibrariesAccess().getResourceOutsourcingRuleTypesKeyword_27());
                
            otherlv_28=(Token)match(input,38,FOLLOW_38_in_ruleSystemLibraries1135); 

                	newLeafNode(otherlv_28, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_28());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:620:1: ( (lv_ResourceOutsourcingRuleTypes_29_0= ruleResourceOutsourcingRuleType ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==97) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:621:1: (lv_ResourceOutsourcingRuleTypes_29_0= ruleResourceOutsourcingRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:621:1: (lv_ResourceOutsourcingRuleTypes_29_0= ruleResourceOutsourcingRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:622:3: lv_ResourceOutsourcingRuleTypes_29_0= ruleResourceOutsourcingRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getResourceOutsourcingRuleTypesResourceOutsourcingRuleTypeParserRuleCall_29_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceOutsourcingRuleType_in_ruleSystemLibraries1156);
            	    lv_ResourceOutsourcingRuleTypes_29_0=ruleResourceOutsourcingRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ResourceOutsourcingRuleTypes",
            	            		lv_ResourceOutsourcingRuleTypes_29_0, 
            	            		"ResourceOutsourcingRuleType");
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

            otherlv_30=(Token)match(input,39,FOLLOW_39_in_ruleSystemLibraries1169); 

                	newLeafNode(otherlv_30, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_30());
                
            otherlv_31=(Token)match(input,44,FOLLOW_44_in_ruleSystemLibraries1181); 

                	newLeafNode(otherlv_31, grammarAccess.getSystemLibrariesAccess().getEndGovernanceLibraryKeyword_31());
                
            otherlv_32=(Token)match(input,45,FOLLOW_45_in_ruleSystemLibraries1193); 

                	newLeafNode(otherlv_32, grammarAccess.getSystemLibrariesAccess().getTaskLibraryKeyword_32());
                
            otherlv_33=(Token)match(input,46,FOLLOW_46_in_ruleSystemLibraries1205); 

                	newLeafNode(otherlv_33, grammarAccess.getSystemLibrariesAccess().getProcessModelsKeyword_33());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:654:1: ( (lv_ProcessModels_34_0= ruleProcessModel ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==78) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:655:1: (lv_ProcessModels_34_0= ruleProcessModel )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:655:1: (lv_ProcessModels_34_0= ruleProcessModel )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:656:3: lv_ProcessModels_34_0= ruleProcessModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getProcessModelsProcessModelParserRuleCall_34_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessModel_in_ruleSystemLibraries1226);
            	    lv_ProcessModels_34_0=ruleProcessModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ProcessModels",
            	            		lv_ProcessModels_34_0, 
            	            		"ProcessModel");
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

                	newLeafNode(otherlv_35, grammarAccess.getSystemLibrariesAccess().getEndProcessModelsKeyword_35());
                
            otherlv_36=(Token)match(input,48,FOLLOW_48_in_ruleSystemLibraries1251); 

                	newLeafNode(otherlv_36, grammarAccess.getSystemLibrariesAccess().getValueFunctionsKeyword_36());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:680:1: ( (lv_ValueFunctions_37_0= ruleValueFunction ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==119) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:681:1: (lv_ValueFunctions_37_0= ruleValueFunction )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:681:1: (lv_ValueFunctions_37_0= ruleValueFunction )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:682:3: lv_ValueFunctions_37_0= ruleValueFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getValueFunctionsValueFunctionParserRuleCall_37_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueFunction_in_ruleSystemLibraries1272);
            	    lv_ValueFunctions_37_0=ruleValueFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ValueFunctions",
            	            		lv_ValueFunctions_37_0, 
            	            		"ValueFunction");
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

            otherlv_38=(Token)match(input,49,FOLLOW_49_in_ruleSystemLibraries1285); 

                	newLeafNode(otherlv_38, grammarAccess.getSystemLibrariesAccess().getEndValueFunctionsKeyword_38());
                
            otherlv_39=(Token)match(input,50,FOLLOW_50_in_ruleSystemLibraries1297); 

                	newLeafNode(otherlv_39, grammarAccess.getSystemLibrariesAccess().getEndTaskLibraryKeyword_39());
                
            otherlv_40=(Token)match(input,51,FOLLOW_51_in_ruleSystemLibraries1309); 

                	newLeafNode(otherlv_40, grammarAccess.getSystemLibrariesAccess().getEndSystemLibrariesKeyword_40());
                

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:718:1: entryRuleUserLibraries returns [EObject current=null] : iv_ruleUserLibraries= ruleUserLibraries EOF ;
    public final EObject entryRuleUserLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserLibraries = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:719:2: (iv_ruleUserLibraries= ruleUserLibraries EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:720:2: iv_ruleUserLibraries= ruleUserLibraries EOF
            {
             newCompositeNode(grammarAccess.getUserLibrariesRule()); 
            pushFollow(FOLLOW_ruleUserLibraries_in_entryRuleUserLibraries1345);
            iv_ruleUserLibraries=ruleUserLibraries();

            state._fsp--;

             current =iv_ruleUserLibraries; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserLibraries1355); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:727:1: ruleUserLibraries returns [EObject current=null] : (otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:730:28: ( (otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:1: (otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:1: (otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:3: otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleUserLibraries1392); 

                	newLeafNode(otherlv_0, grammarAccess.getUserLibrariesAccess().getUserLibrariesKeyword_0());
                
            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleUserLibraries1404); 

                	newLeafNode(otherlv_1, grammarAccess.getUserLibrariesAccess().getWorkItemTypesKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:739:1: ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT||LA15_0==118) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:740:1: (lv_WorkItemTypes_2_0= ruleWorkItemType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:740:1: (lv_WorkItemTypes_2_0= ruleWorkItemType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:741:3: lv_WorkItemTypes_2_0= ruleWorkItemType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getWorkItemTypesWorkItemTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItemType_in_ruleUserLibraries1425);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleUserLibraries1438); 

                	newLeafNode(otherlv_3, grammarAccess.getUserLibrariesAccess().getEndWorkItemTypesKeyword_3());
                
            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleUserLibraries1450); 

                	newLeafNode(otherlv_4, grammarAccess.getUserLibrariesAccess().getClassOfServicesKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:765:1: ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT||LA16_0==111) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:766:1: (lv_ClassOfServices_5_0= ruleClassOfService )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:766:1: (lv_ClassOfServices_5_0= ruleClassOfService )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:767:3: lv_ClassOfServices_5_0= ruleClassOfService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getClassOfServicesClassOfServiceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassOfService_in_ruleUserLibraries1471);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleUserLibraries1484); 

                	newLeafNode(otherlv_6, grammarAccess.getUserLibrariesAccess().getEndClassOfServicesKeyword_6());
                
            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleUserLibraries1496); 

                	newLeafNode(otherlv_7, grammarAccess.getUserLibrariesAccess().getServicesKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:791:1: ( (lv_Services_8_0= ruleService ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT||LA17_0==123) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:792:1: (lv_Services_8_0= ruleService )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:792:1: (lv_Services_8_0= ruleService )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:793:3: lv_Services_8_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getServicesServiceParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleUserLibraries1517);
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleUserLibraries1530); 

                	newLeafNode(otherlv_9, grammarAccess.getUserLibrariesAccess().getEndServicesKeyword_9());
                
            otherlv_10=(Token)match(input,59,FOLLOW_59_in_ruleUserLibraries1542); 

                	newLeafNode(otherlv_10, grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesKeyword_10());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:817:1: ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT||LA18_0==88) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:818:1: (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:818:1: (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:819:3: lv_GovernanceStrategies_11_0= ruleGovernanceStrategy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesGovernanceStrategyParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGovernanceStrategy_in_ruleUserLibraries1563);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_12=(Token)match(input,60,FOLLOW_60_in_ruleUserLibraries1576); 

                	newLeafNode(otherlv_12, grammarAccess.getUserLibrariesAccess().getEndGovernanceStrategiesKeyword_12());
                
            otherlv_13=(Token)match(input,61,FOLLOW_61_in_ruleUserLibraries1588); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:851:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:852:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:853:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1625);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1636); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:860:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:863:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:864:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:864:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:864:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1676); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:871:1: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==62) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_ID) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:872:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleQualifiedName1695); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1710); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:884:3: (kw= '.' this_INT_4= RULE_INT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==62) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:885:2: kw= '.' this_INT_4= RULE_INT
            	    {
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleQualifiedName1731); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualifiedName1746); 

            	    		current.merge(this_INT_4);
            	        
            	     
            	        newLeafNode(this_INT_4, grammarAccess.getQualifiedNameAccess().getINTTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:905:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:906:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:907:2: iv_ruleNumExpression= ruleNumExpression EOF
            {
             newCompositeNode(grammarAccess.getNumExpressionRule()); 
            pushFollow(FOLLOW_ruleNumExpression_in_entryRuleNumExpression1793);
            iv_ruleNumExpression=ruleNumExpression();

            state._fsp--;

             current =iv_ruleNumExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumExpression1803); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:914:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= RULE_DOUBLE ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_numValue_0_0=null;
        Token lv_distribution_1_0=null;
        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:917:28: ( ( ( (lv_numValue_0_0= RULE_DOUBLE ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:918:1: ( ( (lv_numValue_0_0= RULE_DOUBLE ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:918:1: ( ( (lv_numValue_0_0= RULE_DOUBLE ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DOUBLE) ) {
                alt21=1;
            }
            else if ( (LA21_0==63) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:918:2: ( (lv_numValue_0_0= RULE_DOUBLE ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:918:2: ( (lv_numValue_0_0= RULE_DOUBLE ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:919:1: (lv_numValue_0_0= RULE_DOUBLE )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:919:1: (lv_numValue_0_0= RULE_DOUBLE )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:920:3: lv_numValue_0_0= RULE_DOUBLE
                    {
                    lv_numValue_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNumExpression1845); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:937:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:937:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:937:7: ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:937:7: ( (lv_distribution_1_0= 'Random.' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:938:1: (lv_distribution_1_0= 'Random.' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:938:1: (lv_distribution_1_0= 'Random.' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:939:3: lv_distribution_1_0= 'Random.'
                    {
                    lv_distribution_1_0=(Token)match(input,63,FOLLOW_63_in_ruleNumExpression1875); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionRandomKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:952:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:953:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:953:1: (lv_numDist_2_0= ruleDistribution )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:954:3: lv_numDist_2_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumDistDistributionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleNumExpression1909);
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


    // $ANTLR start "entryRuleOperator"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:978:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:979:2: (iv_ruleOperator= ruleOperator EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:980:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1946);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1956); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:987:1: ruleOperator returns [EObject current=null] : ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_equalTo_0_0=null;
        Token lv_largerThan_1_0=null;
        Token lv_smallerThan_2_0=null;
        Token lv_largerOrEqualTo_3_0=null;
        Token lv_smallerOrEqualTo_4_0=null;
        Token lv_notEqualTo_5_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:990:28: ( ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:991:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:991:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt22=1;
                }
                break;
            case 65:
                {
                alt22=2;
                }
                break;
            case 66:
                {
                alt22=3;
                }
                break;
            case 67:
                {
                alt22=4;
                }
                break;
            case 68:
                {
                alt22=5;
                }
                break;
            case 69:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:991:2: ( (lv_equalTo_0_0= '==' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:991:2: ( (lv_equalTo_0_0= '==' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:992:1: (lv_equalTo_0_0= '==' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:992:1: (lv_equalTo_0_0= '==' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:993:3: lv_equalTo_0_0= '=='
                    {
                    lv_equalTo_0_0=(Token)match(input,64,FOLLOW_64_in_ruleOperator1999); 

                            newLeafNode(lv_equalTo_0_0, grammarAccess.getOperatorAccess().getEqualToEqualsSignEqualsSignKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "equalTo", true, "==");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1007:6: ( (lv_largerThan_1_0= '>' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1007:6: ( (lv_largerThan_1_0= '>' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1008:1: (lv_largerThan_1_0= '>' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1008:1: (lv_largerThan_1_0= '>' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1009:3: lv_largerThan_1_0= '>'
                    {
                    lv_largerThan_1_0=(Token)match(input,65,FOLLOW_65_in_ruleOperator2036); 

                            newLeafNode(lv_largerThan_1_0, grammarAccess.getOperatorAccess().getLargerThanGreaterThanSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "largerThan", true, ">");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1023:6: ( (lv_smallerThan_2_0= '<' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1023:6: ( (lv_smallerThan_2_0= '<' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1024:1: (lv_smallerThan_2_0= '<' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1024:1: (lv_smallerThan_2_0= '<' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1025:3: lv_smallerThan_2_0= '<'
                    {
                    lv_smallerThan_2_0=(Token)match(input,66,FOLLOW_66_in_ruleOperator2073); 

                            newLeafNode(lv_smallerThan_2_0, grammarAccess.getOperatorAccess().getSmallerThanLessThanSignKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "smallerThan", true, "<");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1039:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1039:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1040:1: (lv_largerOrEqualTo_3_0= '>=' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1040:1: (lv_largerOrEqualTo_3_0= '>=' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1041:3: lv_largerOrEqualTo_3_0= '>='
                    {
                    lv_largerOrEqualTo_3_0=(Token)match(input,67,FOLLOW_67_in_ruleOperator2110); 

                            newLeafNode(lv_largerOrEqualTo_3_0, grammarAccess.getOperatorAccess().getLargerOrEqualToGreaterThanSignEqualsSignKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "largerOrEqualTo", true, ">=");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1055:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1055:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1056:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1056:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1057:3: lv_smallerOrEqualTo_4_0= '<='
                    {
                    lv_smallerOrEqualTo_4_0=(Token)match(input,68,FOLLOW_68_in_ruleOperator2147); 

                            newLeafNode(lv_smallerOrEqualTo_4_0, grammarAccess.getOperatorAccess().getSmallerOrEqualToLessThanSignEqualsSignKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "smallerOrEqualTo", true, "<=");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1071:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1071:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (lv_notEqualTo_5_0= '!=' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (lv_notEqualTo_5_0= '!=' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1073:3: lv_notEqualTo_5_0= '!='
                    {
                    lv_notEqualTo_5_0=(Token)match(input,69,FOLLOW_69_in_ruleOperator2184); 

                            newLeafNode(lv_notEqualTo_5_0, grammarAccess.getOperatorAccess().getNotEqualToExclamationMarkEqualsSignKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "notEqualTo", true, "!=");
                    	    

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleParameter"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1094:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1095:2: (iv_ruleParameter= ruleParameter EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1096:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2234);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2245); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1103:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;
        Token this_STRING_2=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1106:28: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1107:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1107:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID )
            int alt23=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt23=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt23=2;
                }
                break;
            case RULE_STRING:
                {
                alt23=3;
                }
                break;
            case RULE_ID:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1107:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameter2285); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getParameterAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1115:10: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleParameter2311); 

                    		current.merge(this_DOUBLE_1);
                        
                     
                        newLeafNode(this_DOUBLE_1, grammarAccess.getParameterAccess().getDOUBLETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1123:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter2337); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getParameterAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1131:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2363); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1146:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1147:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1148:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution2408);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution2418); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1155:1: ruleDistribution returns [EObject current=null] : ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1158:28: ( ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1159:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1159:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1159:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1159:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt24=1;
                }
                break;
            case 71:
                {
                alt24=2;
                }
                break;
            case 72:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1159:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1159:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1160:1: (lv_isNormal_0_0= 'Normal' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1160:1: (lv_isNormal_0_0= 'Normal' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1161:3: lv_isNormal_0_0= 'Normal'
                    {
                    lv_isNormal_0_0=(Token)match(input,70,FOLLOW_70_in_ruleDistribution2462); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1175:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1175:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1176:1: (lv_isUniform_1_0= 'Uniform' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1176:1: (lv_isUniform_1_0= 'Uniform' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1177:3: lv_isUniform_1_0= 'Uniform'
                    {
                    lv_isUniform_1_0=(Token)match(input,71,FOLLOW_71_in_ruleDistribution2499); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1191:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1191:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1192:1: (lv_isExponential_2_0= 'Exponential' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1192:1: (lv_isExponential_2_0= 'Exponential' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1193:3: lv_isExponential_2_0= 'Exponential'
                    {
                    lv_isExponential_2_0=(Token)match(input,72,FOLLOW_72_in_ruleDistribution2536); 

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

            otherlv_3=(Token)match(input,73,FOLLOW_73_in_ruleDistribution2562); 

                	newLeafNode(otherlv_3, grammarAccess.getDistributionAccess().getLeftSquareBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1210:1: ( (lv_parameters_4_0= ruleParameter ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_DOUBLE)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1211:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1211:1: (lv_parameters_4_0= ruleParameter )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1212:3: lv_parameters_4_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleDistribution2583);
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
            	    break loop25;
                }
            } while (true);

            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleDistribution2596); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1240:1: entryRuleEventType returns [EObject current=null] : iv_ruleEventType= ruleEventType EOF ;
    public final EObject entryRuleEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1241:2: (iv_ruleEventType= ruleEventType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1242:2: iv_ruleEventType= ruleEventType EOF
            {
             newCompositeNode(grammarAccess.getEventTypeRule()); 
            pushFollow(FOLLOW_ruleEventType_in_entryRuleEventType2632);
            iv_ruleEventType=ruleEventType();

            state._fsp--;

             current =iv_ruleEventType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventType2642); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1249:1: ruleEventType returns [EObject current=null] : (otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleEventType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1252:28: ( (otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1253:1: (otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1253:1: (otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1253:3: otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleEventType2679); 

                	newLeafNode(otherlv_0, grammarAccess.getEventTypeAccess().getEventTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1257:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1258:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1258:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1259:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventType2696); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1275:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1276:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1276:1: (lv_description_2_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1277:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventType2718); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1301:1: entryRuleConditionType returns [EObject current=null] : iv_ruleConditionType= ruleConditionType EOF ;
    public final EObject entryRuleConditionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1302:2: (iv_ruleConditionType= ruleConditionType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1303:2: iv_ruleConditionType= ruleConditionType EOF
            {
             newCompositeNode(grammarAccess.getConditionTypeRule()); 
            pushFollow(FOLLOW_ruleConditionType_in_entryRuleConditionType2760);
            iv_ruleConditionType=ruleConditionType();

            state._fsp--;

             current =iv_ruleConditionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionType2770); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1310:1: ruleConditionType returns [EObject current=null] : (otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleConditionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1313:28: ( (otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1314:1: (otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1314:1: (otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1314:3: otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleConditionType2807); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionTypeAccess().getConditionTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1318:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1319:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1319:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1320:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConditionType2824); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1336:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1337:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1337:1: (lv_description_2_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1338:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConditionType2846); 

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


    // $ANTLR start "entryRuleTransitionType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1362:1: entryRuleTransitionType returns [EObject current=null] : iv_ruleTransitionType= ruleTransitionType EOF ;
    public final EObject entryRuleTransitionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1363:2: (iv_ruleTransitionType= ruleTransitionType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1364:2: iv_ruleTransitionType= ruleTransitionType EOF
            {
             newCompositeNode(grammarAccess.getTransitionTypeRule()); 
            pushFollow(FOLLOW_ruleTransitionType_in_entryRuleTransitionType2888);
            iv_ruleTransitionType=ruleTransitionType();

            state._fsp--;

             current =iv_ruleTransitionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionType2898); 

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
    // $ANTLR end "entryRuleTransitionType"


    // $ANTLR start "ruleTransitionType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1371:1: ruleTransitionType returns [EObject current=null] : (otherlv_0= 'TransitionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleTransitionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1374:28: ( (otherlv_0= 'TransitionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1375:1: (otherlv_0= 'TransitionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1375:1: (otherlv_0= 'TransitionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1375:3: otherlv_0= 'TransitionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleTransitionType2935); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionTypeAccess().getTransitionTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1379:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1380:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1380:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1381:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionType2952); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTransitionTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1397:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1398:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1398:1: (lv_description_2_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1399:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransitionType2974); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getTransitionTypeAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionTypeRule());
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
    // $ANTLR end "ruleTransitionType"


    // $ANTLR start "entryRuleProcessModel"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1423:1: entryRuleProcessModel returns [EObject current=null] : iv_ruleProcessModel= ruleProcessModel EOF ;
    public final EObject entryRuleProcessModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessModel = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1424:2: (iv_ruleProcessModel= ruleProcessModel EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1425:2: iv_ruleProcessModel= ruleProcessModel EOF
            {
             newCompositeNode(grammarAccess.getProcessModelRule()); 
            pushFollow(FOLLOW_ruleProcessModel_in_entryRuleProcessModel3016);
            iv_ruleProcessModel=ruleProcessModel();

            state._fsp--;

             current =iv_ruleProcessModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessModel3026); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1432:1: ruleProcessModel returns [EObject current=null] : (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'Events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleProcessModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_events_7_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1435:28: ( (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'Events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= '}' otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1436:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'Events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= '}' otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1436:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'Events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= '}' otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1436:3: otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'Events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) )+ otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleProcessModel3063); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessModelAccess().getProcessModelKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1440:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1441:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1441:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1442:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessModel3080); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleProcessModel3097); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1462:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1462:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProcessModel3110); 

                        	newLeafNode(otherlv_3, grammarAccess.getProcessModelAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1466:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1467:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1467:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1468:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessModel3127); 

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

            otherlv_5=(Token)match(input,79,FOLLOW_79_in_ruleProcessModel3146); 

                	newLeafNode(otherlv_5, grammarAccess.getProcessModelAccess().getEventsKeyword_4());
                
            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleProcessModel3158); 

                	newLeafNode(otherlv_6, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1492:1: ( (lv_events_7_0= ruleEvent ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==80) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1493:1: (lv_events_7_0= ruleEvent )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1493:1: (lv_events_7_0= ruleEvent )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1494:3: lv_events_7_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessModelAccess().getEventsEventParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleProcessModel3179);
            	    lv_events_7_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_7_0, 
            	            		"Event");
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

            otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleProcessModel3192); 

                	newLeafNode(otherlv_8, grammarAccess.getProcessModelAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleProcessModel3204); 

                	newLeafNode(otherlv_9, grammarAccess.getProcessModelAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleEvent"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1526:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1527:2: (iv_ruleEvent= ruleEvent EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1528:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent3240);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent3250); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1535:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'Conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= '}' otherlv_6= 'Transitions' otherlv_7= '{' ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_conditions_4_0 = null;

        EObject lv_transitions_8_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1538:28: ( (otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'Conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= '}' otherlv_6= 'Transitions' otherlv_7= '{' ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}' otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1539:1: (otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'Conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= '}' otherlv_6= 'Transitions' otherlv_7= '{' ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}' otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1539:1: (otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'Conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= '}' otherlv_6= 'Transitions' otherlv_7= '{' ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}' otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1539:3: otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'Conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= '}' otherlv_6= 'Transitions' otherlv_7= '{' ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleEvent3287); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleEvent3299); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,81,FOLLOW_81_in_ruleEvent3311); 

                	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getConditionsKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleEvent3323); 

                	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1555:1: ( (lv_conditions_4_0= ruleCondition ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1556:1: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1556:1: (lv_conditions_4_0= ruleCondition )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1557:3: lv_conditions_4_0= ruleCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventAccess().getConditionsConditionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondition_in_ruleEvent3344);
            	    lv_conditions_4_0=ruleCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditions",
            	            		lv_conditions_4_0, 
            	            		"Condition");
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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleEvent3357); 

                	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,82,FOLLOW_82_in_ruleEvent3369); 

                	newLeafNode(otherlv_6, grammarAccess.getEventAccess().getTransitionsKeyword_6());
                
            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleEvent3381); 

                	newLeafNode(otherlv_7, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1585:1: ( (lv_transitions_8_0= ruleTransition ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1586:1: (lv_transitions_8_0= ruleTransition )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1586:1: (lv_transitions_8_0= ruleTransition )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1587:3: lv_transitions_8_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventAccess().getTransitionsTransitionParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleEvent3402);
            	    lv_transitions_8_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_8_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleEvent3415); 

                	newLeafNode(otherlv_9, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_10=(Token)match(input,39,FOLLOW_39_in_ruleEvent3427); 

                	newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleCondition"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1619:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1620:2: (iv_ruleCondition= ruleCondition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1621:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition3463);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition3473); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1628:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1631:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1632:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1632:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleParameter ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1632:2: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleParameter ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1632:2: ( (otherlv_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1633:1: (otherlv_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1633:1: (otherlv_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1634:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCondition3518); 

            		newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getTypeConditionTypeCrossReference_0_0()); 
            	

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1645:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1646:1: (lv_operator_1_0= ruleOperator )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1646:1: (lv_operator_1_0= ruleOperator )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1647:3: lv_operator_1_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleCondition3539);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1663:2: ( (lv_value_2_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1664:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1664:1: (lv_value_2_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1665:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCondition3560);
            lv_value_2_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTransition"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1689:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1690:2: (iv_ruleTransition= ruleTransition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1691:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition3596);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition3606); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1698:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1701:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1702:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1702:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1702:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1702:2: ( (otherlv_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1703:1: (otherlv_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1703:1: (otherlv_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1704:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3651); 

            		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTypeTransitionTypeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleTransition3663); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1719:1: ( (lv_value_2_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1720:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1720:1: (lv_value_2_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1721:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleTransition3684);
            lv_value_2_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleWINReplicationSetting"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1747:1: entryRuleWINReplicationSetting returns [EObject current=null] : iv_ruleWINReplicationSetting= ruleWINReplicationSetting EOF ;
    public final EObject entryRuleWINReplicationSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWINReplicationSetting = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1748:2: (iv_ruleWINReplicationSetting= ruleWINReplicationSetting EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1749:2: iv_ruleWINReplicationSetting= ruleWINReplicationSetting EOF
            {
             newCompositeNode(grammarAccess.getWINReplicationSettingRule()); 
            pushFollow(FOLLOW_ruleWINReplicationSetting_in_entryRuleWINReplicationSetting3722);
            iv_ruleWINReplicationSetting=ruleWINReplicationSetting();

            state._fsp--;

             current =iv_ruleWINReplicationSetting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWINReplicationSetting3732); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1756:1: ruleWINReplicationSetting returns [EObject current=null] : (otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}' ) ;
    public final EObject ruleWINReplicationSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_WINReplications_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1759:28: ( (otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1760:1: (otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1760:1: (otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1760:3: otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleWINReplicationSetting3769); 

                	newLeafNode(otherlv_0, grammarAccess.getWINReplicationSettingAccess().getWINReplicationSettingKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleWINReplicationSetting3781); 

                	newLeafNode(otherlv_1, grammarAccess.getWINReplicationSettingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1768:1: ( (lv_WINReplications_2_0= ruleWINReplication ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==85) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1769:1: (lv_WINReplications_2_0= ruleWINReplication )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1769:1: (lv_WINReplications_2_0= ruleWINReplication )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1770:3: lv_WINReplications_2_0= ruleWINReplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWINReplicationSettingAccess().getWINReplicationsWINReplicationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWINReplication_in_ruleWINReplicationSetting3802);
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
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleWINReplicationSetting3815); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1798:1: entryRuleWINReplication returns [EObject current=null] : iv_ruleWINReplication= ruleWINReplication EOF ;
    public final EObject entryRuleWINReplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWINReplication = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1799:2: (iv_ruleWINReplication= ruleWINReplication EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1800:2: iv_ruleWINReplication= ruleWINReplication EOF
            {
             newCompositeNode(grammarAccess.getWINReplicationRule()); 
            pushFollow(FOLLOW_ruleWINReplication_in_entryRuleWINReplication3851);
            iv_ruleWINReplication=ruleWINReplication();

            state._fsp--;

             current =iv_ruleWINReplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWINReplication3861); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1807:1: ruleWINReplication returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) ;
    public final EObject ruleWINReplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numReplications_3_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1810:28: ( (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1811:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1811:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1811:3: otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleWINReplication3898); 

                	newLeafNode(otherlv_0, grammarAccess.getWINReplicationAccess().getWorkItemNetworkKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1815:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1816:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1816:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1817:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWINReplication3918); 

            		newLeafNode(otherlv_1, grammarAccess.getWINReplicationAccess().getWorkItemNetworkWorkItemNetworkCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleWINReplication3930); 

                	newLeafNode(otherlv_2, grammarAccess.getWINReplicationAccess().getNumReplicationsKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1832:1: ( (lv_numReplications_3_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1833:1: (lv_numReplications_3_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1833:1: (lv_numReplications_3_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1834:3: lv_numReplications_3_0= RULE_INT
            {
            lv_numReplications_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWINReplication3947); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1858:1: entryRuleIndicators returns [EObject current=null] : iv_ruleIndicators= ruleIndicators EOF ;
    public final EObject entryRuleIndicators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicators = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1859:2: (iv_ruleIndicators= ruleIndicators EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1860:2: iv_ruleIndicators= ruleIndicators EOF
            {
             newCompositeNode(grammarAccess.getIndicatorsRule()); 
            pushFollow(FOLLOW_ruleIndicators_in_entryRuleIndicators3988);
            iv_ruleIndicators=ruleIndicators();

            state._fsp--;

             current =iv_ruleIndicators; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicators3998); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1867:1: ruleIndicators returns [EObject current=null] : (otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}' ) ;
    public final EObject ruleIndicators() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_Indicators_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1870:28: ( (otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1871:1: (otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1871:1: (otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1871:3: otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleIndicators4035); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorsAccess().getIndicatorsKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleIndicators4047); 

                	newLeafNode(otherlv_1, grammarAccess.getIndicatorsAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1879:1: ( (lv_Indicators_2_0= RULE_ID ) )+
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
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1880:1: (lv_Indicators_2_0= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1880:1: (lv_Indicators_2_0= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1881:3: lv_Indicators_2_0= RULE_ID
            	    {
            	    lv_Indicators_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicators4064); 

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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleIndicators4082); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1909:1: entryRuleGovernanceStrategy returns [EObject current=null] : iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF ;
    public final EObject entryRuleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceStrategy = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1910:2: (iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1911:2: iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF
            {
             newCompositeNode(grammarAccess.getGovernanceStrategyRule()); 
            pushFollow(FOLLOW_ruleGovernanceStrategy_in_entryRuleGovernanceStrategy4118);
            iv_ruleGovernanceStrategy=ruleGovernanceStrategy();

            state._fsp--;

             current =iv_ruleGovernanceStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGovernanceStrategy4128); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1918:1: ruleGovernanceStrategy returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1921:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1922:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1922:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1922:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1922:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1923:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1923:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1924:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGovernanceStrategy4170); 

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

            otherlv_1=(Token)match(input,88,FOLLOW_88_in_ruleGovernanceStrategy4188); 

                	newLeafNode(otherlv_1, grammarAccess.getGovernanceStrategyAccess().getGovernanceStrategyKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1944:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1945:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1945:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1946:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGovernanceStrategy4205); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleGovernanceStrategy4222); 

                	newLeafNode(otherlv_3, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1966:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1966:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGovernanceStrategy4235); 

                        	newLeafNode(otherlv_4, grammarAccess.getGovernanceStrategyAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1970:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1971:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1971:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1972:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGovernanceStrategy4252); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1988:4: ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==90) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1988:5: ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1988:5: ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1989:1: (lv_WIAcceptanceRule_6_0= ruleWIAcceptance )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1989:1: (lv_WIAcceptanceRule_6_0= ruleWIAcceptance )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1990:3: lv_WIAcceptanceRule_6_0= ruleWIAcceptance
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getWIAcceptanceRuleWIAcceptanceParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAcceptance_in_ruleGovernanceStrategy4281);
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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2006:2: ( (lv_WISelectionRule_7_0= ruleWISelection ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2007:1: (lv_WISelectionRule_7_0= ruleWISelection )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2007:1: (lv_WISelectionRule_7_0= ruleWISelection )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2008:3: lv_WISelectionRule_7_0= ruleWISelection
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getWISelectionRuleWISelectionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWISelection_in_ruleGovernanceStrategy4302);
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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2024:2: ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2025:1: (lv_WIAssignmentRule_8_0= ruleWIAssignment )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2025:1: (lv_WIAssignmentRule_8_0= ruleWIAssignment )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2026:3: lv_WIAssignmentRule_8_0= ruleWIAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getWIAssignmentRuleWIAssignmentParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleGovernanceStrategy4323);
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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2042:2: ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2043:1: (lv_ResourceAllocationRule_9_0= ruleResourceAllocation )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2043:1: (lv_ResourceAllocationRule_9_0= ruleResourceAllocation )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2044:3: lv_ResourceAllocationRule_9_0= ruleResourceAllocation
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getResourceAllocationRuleResourceAllocationParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResourceAllocation_in_ruleGovernanceStrategy4344);
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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2060:2: ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2061:1: (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2061:1: (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2062:3: lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getResourceOutsourcingRuleResourceOutsourcingParserRuleCall_5_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleGovernanceStrategy4365);
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

            otherlv_11=(Token)match(input,89,FOLLOW_89_in_ruleGovernanceStrategy4379); 

                	newLeafNode(otherlv_11, grammarAccess.getGovernanceStrategyAccess().getMechanismsKeyword_6());
                
            otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleGovernanceStrategy4391); 

                	newLeafNode(otherlv_12, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2086:1: ( (lv_Mechanisms_13_0= ruleMechanism ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==98) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2087:1: (lv_Mechanisms_13_0= ruleMechanism )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2087:1: (lv_Mechanisms_13_0= ruleMechanism )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2088:3: lv_Mechanisms_13_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getMechanismsMechanismParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMechanism_in_ruleGovernanceStrategy4412);
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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_14=(Token)match(input,39,FOLLOW_39_in_ruleGovernanceStrategy4425); 

                	newLeafNode(otherlv_14, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_15=(Token)match(input,39,FOLLOW_39_in_ruleGovernanceStrategy4437); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2120:1: entryRuleWIAcceptance returns [EObject current=null] : iv_ruleWIAcceptance= ruleWIAcceptance EOF ;
    public final EObject entryRuleWIAcceptance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAcceptance = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2121:2: (iv_ruleWIAcceptance= ruleWIAcceptance EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2122:2: iv_ruleWIAcceptance= ruleWIAcceptance EOF
            {
             newCompositeNode(grammarAccess.getWIAcceptanceRule()); 
            pushFollow(FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance4473);
            iv_ruleWIAcceptance=ruleWIAcceptance();

            state._fsp--;

             current =iv_ruleWIAcceptance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptance4483); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2129:1: ruleWIAcceptance returns [EObject current=null] : (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2132:28: ( (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2133:1: (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2133:1: (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2133:3: otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_90_in_ruleWIAcceptance4520); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceAccess().getWIAcceptanceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2137:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2138:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2138:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2139:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAcceptanceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptance4540); 

            		newLeafNode(otherlv_1, grammarAccess.getWIAcceptanceAccess().getTypeWIAcceptanceRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWIAcceptance4552); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2154:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2154:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWIAcceptance4565); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2158:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2159:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2159:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2160:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptance4582); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2176:4: (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==91) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2176:6: otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,91,FOLLOW_91_in_ruleWIAcceptance4602); 

                        	newLeafNode(otherlv_5, grammarAccess.getWIAcceptanceAccess().getBackLogLimitKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2180:1: ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2181:1: (lv_backlogQLimit_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2181:1: (lv_backlogQLimit_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2182:3: lv_backlogQLimit_6_0= RULE_INT
                    {
                    lv_backlogQLimit_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance4619); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2198:4: (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==92) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2198:6: otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,92,FOLLOW_92_in_ruleWIAcceptance4639); 

                        	newLeafNode(otherlv_7, grammarAccess.getWIAcceptanceAccess().getWIPLimitKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2202:1: ( (lv_readyQLimit_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2203:1: (lv_readyQLimit_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2203:1: (lv_readyQLimit_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2204:3: lv_readyQLimit_8_0= RULE_INT
                    {
                    lv_readyQLimit_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance4656); 

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

            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleWIAcceptance4675); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2232:1: entryRuleWISelection returns [EObject current=null] : iv_ruleWISelection= ruleWISelection EOF ;
    public final EObject entryRuleWISelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWISelection = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2233:2: (iv_ruleWISelection= ruleWISelection EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2234:2: iv_ruleWISelection= ruleWISelection EOF
            {
             newCompositeNode(grammarAccess.getWISelectionRule()); 
            pushFollow(FOLLOW_ruleWISelection_in_entryRuleWISelection4711);
            iv_ruleWISelection=ruleWISelection();

            state._fsp--;

             current =iv_ruleWISelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelection4721); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2241:1: ruleWISelection returns [EObject current=null] : (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2244:28: ( (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2245:1: (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2245:1: (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2245:3: otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleWISelection4758); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionAccess().getWISelectionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2249:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2250:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2250:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2251:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWISelectionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelection4778); 

            		newLeafNode(otherlv_1, grammarAccess.getWISelectionAccess().getTypeWISelectionRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWISelection4790); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2266:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2266:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWISelection4803); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2270:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2271:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2271:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2272:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelection4820); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleWISelection4839); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2300:1: entryRuleWIAssignment returns [EObject current=null] : iv_ruleWIAssignment= ruleWIAssignment EOF ;
    public final EObject entryRuleWIAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAssignment = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2301:2: (iv_ruleWIAssignment= ruleWIAssignment EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2302:2: iv_ruleWIAssignment= ruleWIAssignment EOF
            {
             newCompositeNode(grammarAccess.getWIAssignmentRule()); 
            pushFollow(FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment4875);
            iv_ruleWIAssignment=ruleWIAssignment();

            state._fsp--;

             current =iv_ruleWIAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignment4885); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2309:1: ruleWIAssignment returns [EObject current=null] : (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2312:28: ( (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2313:1: (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2313:1: (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2313:3: otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleWIAssignment4922); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentAccess().getWIAssignmentKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2317:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2318:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2318:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2319:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAssignmentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignment4942); 

            		newLeafNode(otherlv_1, grammarAccess.getWIAssignmentAccess().getTypeWIAssignmentRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWIAssignment4954); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2334:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2334:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWIAssignment4967); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2338:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2339:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2339:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2340:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignment4984); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleWIAssignment5003); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2368:1: entryRuleResourceAllocation returns [EObject current=null] : iv_ruleResourceAllocation= ruleResourceAllocation EOF ;
    public final EObject entryRuleResourceAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAllocation = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2369:2: (iv_ruleResourceAllocation= ruleResourceAllocation EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2370:2: iv_ruleResourceAllocation= ruleResourceAllocation EOF
            {
             newCompositeNode(grammarAccess.getResourceAllocationRule()); 
            pushFollow(FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation5039);
            iv_ruleResourceAllocation=ruleResourceAllocation();

            state._fsp--;

             current =iv_ruleResourceAllocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocation5049); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2377:1: ruleResourceAllocation returns [EObject current=null] : (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2380:28: ( (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2381:1: (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2381:1: (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2381:3: otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleResourceAllocation5086); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationAccess().getResourceAllocationKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2385:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2386:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2386:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2387:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceAllocationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocation5106); 

            		newLeafNode(otherlv_1, grammarAccess.getResourceAllocationAccess().getTypeResourceAllocationRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleResourceAllocation5118); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2402:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==13) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2402:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleResourceAllocation5131); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2406:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2407:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2407:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2408:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocation5148); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleResourceAllocation5167); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2436:1: entryRuleResourceOutsourcing returns [EObject current=null] : iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF ;
    public final EObject entryRuleResourceOutsourcing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOutsourcing = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2437:2: (iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2438:2: iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF
            {
             newCompositeNode(grammarAccess.getResourceOutsourcingRule()); 
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing5203);
            iv_ruleResourceOutsourcing=ruleResourceOutsourcing();

            state._fsp--;

             current =iv_ruleResourceOutsourcing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcing5213); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2445:1: ruleResourceOutsourcing returns [EObject current=null] : (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2448:28: ( (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2449:1: (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2449:1: (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2449:3: otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleResourceOutsourcing5250); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingAccess().getResourceOutsourcingKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2453:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2454:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2454:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2455:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceOutsourcingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcing5270); 

            		newLeafNode(otherlv_1, grammarAccess.getResourceOutsourcingAccess().getTypeResourceOutsourcingRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleResourceOutsourcing5282); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2470:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==13) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2470:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleResourceOutsourcing5295); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2474:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2475:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2475:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2476:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcing5312); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleResourceOutsourcing5331); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2504:1: entryRuleWIAcceptanceRuleType returns [EObject current=null] : iv_ruleWIAcceptanceRuleType= ruleWIAcceptanceRuleType EOF ;
    public final EObject entryRuleWIAcceptanceRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAcceptanceRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2505:2: (iv_ruleWIAcceptanceRuleType= ruleWIAcceptanceRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2506:2: iv_ruleWIAcceptanceRuleType= ruleWIAcceptanceRuleType EOF
            {
             newCompositeNode(grammarAccess.getWIAcceptanceRuleTypeRule()); 
            pushFollow(FOLLOW_ruleWIAcceptanceRuleType_in_entryRuleWIAcceptanceRuleType5367);
            iv_ruleWIAcceptanceRuleType=ruleWIAcceptanceRuleType();

            state._fsp--;

             current =iv_ruleWIAcceptanceRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptanceRuleType5377); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2513:1: ruleWIAcceptanceRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2516:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2517:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2517:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2517:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleWIAcceptanceRuleType5414); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2521:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2522:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2522:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2523:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptanceRuleType5431); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWIAcceptanceRuleType5448); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2543:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==13) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2543:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWIAcceptanceRuleType5461); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2547:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2548:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2548:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2549:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptanceRuleType5478); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleWIAcceptanceRuleType5497); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2577:1: entryRuleWISelectionRuleType returns [EObject current=null] : iv_ruleWISelectionRuleType= ruleWISelectionRuleType EOF ;
    public final EObject entryRuleWISelectionRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWISelectionRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2578:2: (iv_ruleWISelectionRuleType= ruleWISelectionRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2579:2: iv_ruleWISelectionRuleType= ruleWISelectionRuleType EOF
            {
             newCompositeNode(grammarAccess.getWISelectionRuleTypeRule()); 
            pushFollow(FOLLOW_ruleWISelectionRuleType_in_entryRuleWISelectionRuleType5533);
            iv_ruleWISelectionRuleType=ruleWISelectionRuleType();

            state._fsp--;

             current =iv_ruleWISelectionRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelectionRuleType5543); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2586:1: ruleWISelectionRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2589:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2590:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2590:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2590:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleWISelectionRuleType5580); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2594:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2595:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2595:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2596:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelectionRuleType5597); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWISelectionRuleType5614); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2616:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==13) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2616:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWISelectionRuleType5627); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2620:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2621:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2621:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2622:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelectionRuleType5644); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleWISelectionRuleType5663); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2650:1: entryRuleWIAssignmentRuleType returns [EObject current=null] : iv_ruleWIAssignmentRuleType= ruleWIAssignmentRuleType EOF ;
    public final EObject entryRuleWIAssignmentRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAssignmentRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2651:2: (iv_ruleWIAssignmentRuleType= ruleWIAssignmentRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2652:2: iv_ruleWIAssignmentRuleType= ruleWIAssignmentRuleType EOF
            {
             newCompositeNode(grammarAccess.getWIAssignmentRuleTypeRule()); 
            pushFollow(FOLLOW_ruleWIAssignmentRuleType_in_entryRuleWIAssignmentRuleType5699);
            iv_ruleWIAssignmentRuleType=ruleWIAssignmentRuleType();

            state._fsp--;

             current =iv_ruleWIAssignmentRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignmentRuleType5709); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2659:1: ruleWIAssignmentRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2662:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2663:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2663:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2663:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleWIAssignmentRuleType5746); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2667:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2668:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2668:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2669:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignmentRuleType5763); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWIAssignmentRuleType5780); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2689:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==13) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2689:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWIAssignmentRuleType5793); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2693:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2694:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2694:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2695:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignmentRuleType5810); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleWIAssignmentRuleType5829); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2723:1: entryRuleResourceAllocationRuleType returns [EObject current=null] : iv_ruleResourceAllocationRuleType= ruleResourceAllocationRuleType EOF ;
    public final EObject entryRuleResourceAllocationRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAllocationRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2724:2: (iv_ruleResourceAllocationRuleType= ruleResourceAllocationRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2725:2: iv_ruleResourceAllocationRuleType= ruleResourceAllocationRuleType EOF
            {
             newCompositeNode(grammarAccess.getResourceAllocationRuleTypeRule()); 
            pushFollow(FOLLOW_ruleResourceAllocationRuleType_in_entryRuleResourceAllocationRuleType5865);
            iv_ruleResourceAllocationRuleType=ruleResourceAllocationRuleType();

            state._fsp--;

             current =iv_ruleResourceAllocationRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocationRuleType5875); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2732:1: ruleResourceAllocationRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2735:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2736:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2736:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2736:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleResourceAllocationRuleType5912); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2740:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2741:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2741:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2742:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocationRuleType5929); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleResourceAllocationRuleType5946); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2762:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==13) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2762:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleResourceAllocationRuleType5959); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2766:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2767:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2767:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2768:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocationRuleType5976); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleResourceAllocationRuleType5995); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2796:1: entryRuleResourceOutsourcingRuleType returns [EObject current=null] : iv_ruleResourceOutsourcingRuleType= ruleResourceOutsourcingRuleType EOF ;
    public final EObject entryRuleResourceOutsourcingRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOutsourcingRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2797:2: (iv_ruleResourceOutsourcingRuleType= ruleResourceOutsourcingRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2798:2: iv_ruleResourceOutsourcingRuleType= ruleResourceOutsourcingRuleType EOF
            {
             newCompositeNode(grammarAccess.getResourceOutsourcingRuleTypeRule()); 
            pushFollow(FOLLOW_ruleResourceOutsourcingRuleType_in_entryRuleResourceOutsourcingRuleType6031);
            iv_ruleResourceOutsourcingRuleType=ruleResourceOutsourcingRuleType();

            state._fsp--;

             current =iv_ruleResourceOutsourcingRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcingRuleType6041); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2805:1: ruleResourceOutsourcingRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2808:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2809:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2809:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2809:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleResourceOutsourcingRuleType6078); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2813:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2814:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2814:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2815:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcingRuleType6095); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleResourceOutsourcingRuleType6112); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2835:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==13) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2835:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleResourceOutsourcingRuleType6125); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2839:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2840:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2840:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2841:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcingRuleType6142); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleResourceOutsourcingRuleType6161); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2869:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2870:2: (iv_ruleMechanism= ruleMechanism EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2871:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_ruleMechanism_in_entryRuleMechanism6197);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanism6207); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2878:1: ruleMechanism returns [EObject current=null] : (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2881:28: ( (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2882:1: (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2882:1: (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2882:3: otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_98_in_ruleMechanism6244); 

                	newLeafNode(otherlv_0, grammarAccess.getMechanismAccess().getMechanismKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2886:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2887:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2887:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2888:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechanism6261); 

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

            otherlv_2=(Token)match(input,83,FOLLOW_83_in_ruleMechanism6278); 

                	newLeafNode(otherlv_2, grammarAccess.getMechanismAccess().getEqualsSignKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2908:1: ( (lv_value_3_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2909:1: (lv_value_3_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2909:1: (lv_value_3_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2910:3: lv_value_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAccess().getValueParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleMechanism6299);
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

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleMechanism6311); 

                	newLeafNode(otherlv_4, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2930:1: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2930:3: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMechanism6324); 

                        	newLeafNode(otherlv_5, grammarAccess.getMechanismAccess().getDescriptionKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2934:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2935:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2935:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2936:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanism6341); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2952:4: (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==99) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2952:6: otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,99,FOLLOW_99_in_ruleMechanism6361); 

                        	newLeafNode(otherlv_7, grammarAccess.getMechanismAccess().getAttributesKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleMechanism6373); 

                        	newLeafNode(otherlv_8, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2960:1: ( (lv_attributes_9_0= ruleMechanismAttribute ) )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==RULE_STRING) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2961:1: (lv_attributes_9_0= ruleMechanismAttribute )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2961:1: (lv_attributes_9_0= ruleMechanismAttribute )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2962:3: lv_attributes_9_0= ruleMechanismAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMechanismAttribute_in_ruleMechanism6394);
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
                    	    if ( cnt52 >= 1 ) break loop52;
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);

                    otherlv_10=(Token)match(input,39,FOLLOW_39_in_ruleMechanism6407); 

                        	newLeafNode(otherlv_10, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleMechanism6421); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2994:1: entryRuleMechanismAttribute returns [EObject current=null] : iv_ruleMechanismAttribute= ruleMechanismAttribute EOF ;
    public final EObject entryRuleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanismAttribute = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2995:2: (iv_ruleMechanismAttribute= ruleMechanismAttribute EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2996:2: iv_ruleMechanismAttribute= ruleMechanismAttribute EOF
            {
             newCompositeNode(grammarAccess.getMechanismAttributeRule()); 
            pushFollow(FOLLOW_ruleMechanismAttribute_in_entryRuleMechanismAttribute6457);
            iv_ruleMechanismAttribute=ruleMechanismAttribute();

            state._fsp--;

             current =iv_ruleMechanismAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanismAttribute6467); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3003:1: ruleMechanismAttribute returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3006:28: ( ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3007:1: ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3007:1: ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3007:2: ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3007:2: ( (lv_attribute_0_0= RULE_STRING ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3008:1: (lv_attribute_0_0= RULE_STRING )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3008:1: (lv_attribute_0_0= RULE_STRING )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3009:3: lv_attribute_0_0= RULE_STRING
            {
            lv_attribute_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanismAttribute6509); 

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

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleMechanismAttribute6526); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAttributeAccess().getEqualsSignKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3029:1: ( (lv_value_2_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3030:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3030:1: (lv_value_2_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3031:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAttributeAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleMechanismAttribute6547);
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3055:1: entryRuleWorkSource returns [EObject current=null] : iv_ruleWorkSource= ruleWorkSource EOF ;
    public final EObject entryRuleWorkSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSource = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3056:2: (iv_ruleWorkSource= ruleWorkSource EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3057:2: iv_ruleWorkSource= ruleWorkSource EOF
            {
             newCompositeNode(grammarAccess.getWorkSourceRule()); 
            pushFollow(FOLLOW_ruleWorkSource_in_entryRuleWorkSource6583);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSource6593); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3064:1: ruleWorkSource returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3067:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3068:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3068:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3068:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3068:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3069:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3069:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3070:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkSource6635); 

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

            otherlv_1=(Token)match(input,100,FOLLOW_100_in_ruleWorkSource6653); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3090:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3091:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3091:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3092:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource6670); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleWorkSource6687); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3112:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==13) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3112:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWorkSource6700); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkSourceAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3116:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3117:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3117:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3118:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkSource6717); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3134:4: (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==101) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3134:6: otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,101,FOLLOW_101_in_ruleWorkSource6737); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getAssignToKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleWorkSource6749); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3142:1: ( (otherlv_8= RULE_ID ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_ID) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3143:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3143:1: (otherlv_8= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3144:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource6769); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getAssignToServiceProviderCrossReference_5_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);

                    otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleWorkSource6782); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3159:3: ( (lv_assignmentRule_10_0= ruleWIAssignment ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==94) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3160:1: (lv_assignmentRule_10_0= ruleWIAssignment )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3160:1: (lv_assignmentRule_10_0= ruleWIAssignment )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3161:3: lv_assignmentRule_10_0= ruleWIAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkSourceAccess().getAssignmentRuleWIAssignmentParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleWorkSource6805);
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

            otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleWorkSource6818); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3189:1: entryRuleWorkItemNetwork returns [EObject current=null] : iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF ;
    public final EObject entryRuleWorkItemNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemNetwork = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3190:2: (iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3191:2: iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF
            {
             newCompositeNode(grammarAccess.getWorkItemNetworkRule()); 
            pushFollow(FOLLOW_ruleWorkItemNetwork_in_entryRuleWorkItemNetwork6854);
            iv_ruleWorkItemNetwork=ruleWorkItemNetwork();

            state._fsp--;

             current =iv_ruleWorkItemNetwork; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemNetwork6864); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3198:1: ruleWorkItemNetwork returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3201:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3202:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3202:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3202:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3202:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_INT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3203:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3203:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3204:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemNetwork6906); 

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

            otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleWorkItemNetwork6924); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkItemNetworkAccess().getWorkItemNetworkKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3224:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3225:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3225:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3226:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemNetwork6941); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleWorkItemNetwork6958); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3246:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3246:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWorkItemNetwork6971); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkItemNetworkAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3250:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3251:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3251:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3252:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemNetwork6988); 

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

            otherlv_6=(Token)match(input,102,FOLLOW_102_in_ruleWorkItemNetwork7007); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemNetworkAccess().getWorkItemsKeyword_5());
                
            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleWorkItemNetwork7019); 

                	newLeafNode(otherlv_7, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_6());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3276:1: ( (lv_workItems_8_0= ruleWorkItem ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_INT||LA61_0==103) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3277:1: (lv_workItems_8_0= ruleWorkItem )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3277:1: (lv_workItems_8_0= ruleWorkItem )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3278:3: lv_workItems_8_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkItemNetworkAccess().getWorkItemsWorkItemParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItem_in_ruleWorkItemNetwork7040);
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
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleWorkItemNetwork7053); 

                	newLeafNode(otherlv_9, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,39,FOLLOW_39_in_ruleWorkItemNetwork7065); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3310:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3311:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3312:2: iv_ruleWorkItem= ruleWorkItem EOF
            {
             newCompositeNode(grammarAccess.getWorkItemRule()); 
            pushFollow(FOLLOW_ruleWorkItem_in_entryRuleWorkItem7101);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItem7111); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3319:1: ruleWorkItem returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3322:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3323:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3323:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3323:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3323:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_INT) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3324:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3324:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3325:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem7153); 

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

            otherlv_1=(Token)match(input,103,FOLLOW_103_in_ruleWorkItem7171); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkItemAccess().getWorkItemKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3345:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3346:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3346:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3347:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem7188); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleWorkItem7205); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3367:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==13) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3367:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWorkItem7218); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3371:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3372:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3372:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3373:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItem7235); 

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

            otherlv_6=(Token)match(input,104,FOLLOW_104_in_ruleWorkItem7254); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemAccess().getTypeKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3393:1: ( (otherlv_7= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3394:1: (otherlv_7= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3394:1: (otherlv_7= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3395:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem7274); 

            		newLeafNode(otherlv_7, grammarAccess.getWorkItemAccess().getTypeWorkItemTypeCrossReference_6_0()); 
            	

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3406:2: ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==105) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3406:3: ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3406:3: ( (lv_hasPredecessors_8_0= 'Predecessors' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3407:1: (lv_hasPredecessors_8_0= 'Predecessors' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3407:1: (lv_hasPredecessors_8_0= 'Predecessors' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3408:3: lv_hasPredecessors_8_0= 'Predecessors'
                    {
                    lv_hasPredecessors_8_0=(Token)match(input,105,FOLLOW_105_in_ruleWorkItem7293); 

                            newLeafNode(lv_hasPredecessors_8_0, grammarAccess.getWorkItemAccess().getHasPredecessorsPredecessorsKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasPredecessors", true, "Predecessors");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleWorkItem7318); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3425:1: ( (otherlv_10= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3426:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3426:1: (otherlv_10= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3427:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem7338); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_7_2_0()); 
                    	    	

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

                    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleWorkItem7351); 

                        	newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3442:3: ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==106) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3442:4: ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3442:4: ( (lv_isAggregationNode_12_0= 'Subtasks' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3443:1: (lv_isAggregationNode_12_0= 'Subtasks' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3443:1: (lv_isAggregationNode_12_0= 'Subtasks' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3444:3: lv_isAggregationNode_12_0= 'Subtasks'
                    {
                    lv_isAggregationNode_12_0=(Token)match(input,106,FOLLOW_106_in_ruleWorkItem7372); 

                            newLeafNode(lv_isAggregationNode_12_0, grammarAccess.getWorkItemAccess().getIsAggregationNodeSubtasksKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "isAggregationNode", true, "Subtasks");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,38,FOLLOW_38_in_ruleWorkItem7397); 

                        	newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3461:1: ( (otherlv_14= RULE_ID ) )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==RULE_ID) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3462:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3462:1: (otherlv_14= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3463:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem7417); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_8_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt66 >= 1 ) break loop66;
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
                    } while (true);

                    otherlv_15=(Token)match(input,39,FOLLOW_39_in_ruleWorkItem7430); 

                        	newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3478:3: (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==107) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3478:5: otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )*
                    {
                    otherlv_16=(Token)match(input,107,FOLLOW_107_in_ruleWorkItem7445); 

                        	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getCausalTriggersKeyword_9_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3482:1: ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( ((LA68_0>=114 && LA68_0<=115)) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3483:1: (lv_causalTriggers_17_0= ruleCausalTrigger )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3483:1: (lv_causalTriggers_17_0= ruleCausalTrigger )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3484:3: lv_causalTriggers_17_0= ruleCausalTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getCausalTriggersCausalTriggerParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausalTrigger_in_ruleWorkItem7466);
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
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,108,FOLLOW_108_in_ruleWorkItem7481); 

                	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getRequiredServicesKeyword_10());
                
            otherlv_19=(Token)match(input,38,FOLLOW_38_in_ruleWorkItem7493); 

                	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_11());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3508:1: ( (otherlv_20= RULE_ID ) )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_ID) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3509:1: (otherlv_20= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3509:1: (otherlv_20= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3510:3: otherlv_20= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getWorkItemRule());
            	    	        }
            	            
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem7513); 

            	    		newLeafNode(otherlv_20, grammarAccess.getWorkItemAccess().getRequiredServicesServiceCrossReference_12_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
            } while (true);

            otherlv_21=(Token)match(input,39,FOLLOW_39_in_ruleWorkItem7526); 

                	newLeafNode(otherlv_21, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_13());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3525:1: (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==109) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3525:3: otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) )
                    {
                    otherlv_22=(Token)match(input,109,FOLLOW_109_in_ruleWorkItem7539); 

                        	newLeafNode(otherlv_22, grammarAccess.getWorkItemAccess().getEffortsKeyword_14_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3529:1: ( (lv_efforts_23_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3530:1: (lv_efforts_23_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3530:1: (lv_efforts_23_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3531:3: lv_efforts_23_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getEffortsNumExpressionParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItem7560);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3547:4: (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==110) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3547:6: otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) )
                    {
                    otherlv_24=(Token)match(input,110,FOLLOW_110_in_ruleWorkItem7575); 

                        	newLeafNode(otherlv_24, grammarAccess.getWorkItemAccess().getValueKeyword_15_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3551:1: ( (lv_value_25_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3552:1: (lv_value_25_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3552:1: (lv_value_25_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3553:3: lv_value_25_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getValueNumExpressionParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItem7596);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3569:4: (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==111) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3569:6: otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) )
                    {
                    otherlv_26=(Token)match(input,111,FOLLOW_111_in_ruleWorkItem7611); 

                        	newLeafNode(otherlv_26, grammarAccess.getWorkItemAccess().getClassOfServiceKeyword_16_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3573:1: ( (otherlv_27= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3574:1: (otherlv_27= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3574:1: (otherlv_27= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3575:3: otherlv_27= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem7631); 

                    		newLeafNode(otherlv_27, grammarAccess.getWorkItemAccess().getClassOfServiceClassOfServiceCrossReference_16_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3586:4: (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==100) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3586:6: otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) )
                    {
                    otherlv_28=(Token)match(input,100,FOLLOW_100_in_ruleWorkItem7646); 

                        	newLeafNode(otherlv_28, grammarAccess.getWorkItemAccess().getWorkSourceKeyword_17_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3590:1: ( (otherlv_29= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3591:1: (otherlv_29= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3591:1: (otherlv_29= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3592:3: otherlv_29= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem7666); 

                    		newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getWorkSourceWorkSourceCrossReference_17_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3603:4: (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==112) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3603:6: otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) )
                    {
                    otherlv_30=(Token)match(input,112,FOLLOW_112_in_ruleWorkItem7681); 

                        	newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getArrivalTimeKeyword_18_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3607:1: ( (lv_arrivalTime_31_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3608:1: (lv_arrivalTime_31_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3608:1: (lv_arrivalTime_31_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3609:3: lv_arrivalTime_31_0= RULE_INT
                    {
                    lv_arrivalTime_31_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem7698); 

                    			newLeafNode(lv_arrivalTime_31_0, grammarAccess.getWorkItemAccess().getArrivalTimeINTTerminalRuleCall_18_1_0()); 
                    		

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3625:4: (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==113) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3625:6: otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) )
                    {
                    otherlv_32=(Token)match(input,113,FOLLOW_113_in_ruleWorkItem7718); 

                        	newLeafNode(otherlv_32, grammarAccess.getWorkItemAccess().getDueDateKeyword_19_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3629:1: ( (lv_dueDate_33_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3630:1: (lv_dueDate_33_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3630:1: (lv_dueDate_33_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3631:3: lv_dueDate_33_0= RULE_INT
                    {
                    lv_dueDate_33_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem7735); 

                    			newLeafNode(lv_dueDate_33_0, grammarAccess.getWorkItemAccess().getDueDateINTTerminalRuleCall_19_1_0()); 
                    		

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

            otherlv_34=(Token)match(input,39,FOLLOW_39_in_ruleWorkItem7754); 

                	newLeafNode(otherlv_34, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_20());
                

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3659:1: entryRuleCausalTrigger returns [EObject current=null] : iv_ruleCausalTrigger= ruleCausalTrigger EOF ;
    public final EObject entryRuleCausalTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCausalTrigger = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3660:2: (iv_ruleCausalTrigger= ruleCausalTrigger EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3661:2: iv_ruleCausalTrigger= ruleCausalTrigger EOF
            {
             newCompositeNode(grammarAccess.getCausalTriggerRule()); 
            pushFollow(FOLLOW_ruleCausalTrigger_in_entryRuleCausalTrigger7790);
            iv_ruleCausalTrigger=ruleCausalTrigger();

            state._fsp--;

             current =iv_ruleCausalTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCausalTrigger7800); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3668:1: ruleCausalTrigger returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3671:28: ( ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3672:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3672:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3672:2: (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3672:2: (otherlv_0= '=>' | otherlv_1= '->' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==114) ) {
                alt77=1;
            }
            else if ( (LA77_0==115) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3672:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,114,FOLLOW_114_in_ruleCausalTrigger7838); 

                        	newLeafNode(otherlv_0, grammarAccess.getCausalTriggerAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3677:7: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,115,FOLLOW_115_in_ruleCausalTrigger7856); 

                        	newLeafNode(otherlv_1, grammarAccess.getCausalTriggerAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleCausalTrigger7869); 

                	newLeafNode(otherlv_2, grammarAccess.getCausalTriggerAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3685:1: ( (otherlv_3= RULE_ID ) )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_ID) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3686:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3686:1: (otherlv_3= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3687:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCausalTriggerRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCausalTrigger7889); 

            	    		newLeafNode(otherlv_3, grammarAccess.getCausalTriggerAccess().getTriggeredWorkItemCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt78 >= 1 ) break loop78;
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
            } while (true);

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleCausalTrigger7902); 

                	newLeafNode(otherlv_4, grammarAccess.getCausalTriggerAccess().getRightCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3702:1: (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==116) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3702:3: otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) )
                    {
                    otherlv_5=(Token)match(input,116,FOLLOW_116_in_ruleCausalTrigger7915); 

                        	newLeafNode(otherlv_5, grammarAccess.getCausalTriggerAccess().getAtProgressKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3706:1: ( (lv_atProgress_6_0= RULE_DOUBLE ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3707:1: (lv_atProgress_6_0= RULE_DOUBLE )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3707:1: (lv_atProgress_6_0= RULE_DOUBLE )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3708:3: lv_atProgress_6_0= RULE_DOUBLE
                    {
                    lv_atProgress_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCausalTrigger7932); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3724:4: (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==117) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3724:6: otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) )
                    {
                    otherlv_7=(Token)match(input,117,FOLLOW_117_in_ruleCausalTrigger7952); 

                        	newLeafNode(otherlv_7, grammarAccess.getCausalTriggerAccess().getOnProbabilityKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3728:1: ( (lv_onProbability_8_0= RULE_DOUBLE ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3729:1: (lv_onProbability_8_0= RULE_DOUBLE )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3729:1: (lv_onProbability_8_0= RULE_DOUBLE )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3730:3: lv_onProbability_8_0= RULE_DOUBLE
                    {
                    lv_onProbability_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCausalTrigger7969); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3754:1: entryRuleWorkItemType returns [EObject current=null] : iv_ruleWorkItemType= ruleWorkItemType EOF ;
    public final EObject entryRuleWorkItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3755:2: (iv_ruleWorkItemType= ruleWorkItemType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3756:2: iv_ruleWorkItemType= ruleWorkItemType EOF
            {
             newCompositeNode(grammarAccess.getWorkItemTypeRule()); 
            pushFollow(FOLLOW_ruleWorkItemType_in_entryRuleWorkItemType8012);
            iv_ruleWorkItemType=ruleWorkItemType();

            state._fsp--;

             current =iv_ruleWorkItemType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemType8022); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3763:1: ruleWorkItemType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3766:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3767:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3767:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3767:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3767:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_INT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3768:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3768:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3769:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemType8064); 

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

            otherlv_1=(Token)match(input,118,FOLLOW_118_in_ruleWorkItemType8082); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkItemTypeAccess().getWorkItemTypeKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3789:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3790:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3790:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3791:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemType8099); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleWorkItemType8116); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkItemTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3811:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==13) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3811:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWorkItemType8129); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkItemTypeAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3815:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3816:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3816:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3817:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemType8146); 

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

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleWorkItemType8165); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3845:1: entryRuleValueFunction returns [EObject current=null] : iv_ruleValueFunction= ruleValueFunction EOF ;
    public final EObject entryRuleValueFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueFunction = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3846:2: (iv_ruleValueFunction= ruleValueFunction EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3847:2: iv_ruleValueFunction= ruleValueFunction EOF
            {
             newCompositeNode(grammarAccess.getValueFunctionRule()); 
            pushFollow(FOLLOW_ruleValueFunction_in_entryRuleValueFunction8201);
            iv_ruleValueFunction=ruleValueFunction();

            state._fsp--;

             current =iv_ruleValueFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueFunction8211); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3854:1: ruleValueFunction returns [EObject current=null] : (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3857:28: ( (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3858:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3858:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3858:3: otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_119_in_ruleValueFunction8248); 

                	newLeafNode(otherlv_0, grammarAccess.getValueFunctionAccess().getValueFunctionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3862:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3863:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3863:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3864:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueFunction8265); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleValueFunction8282); 

                	newLeafNode(otherlv_2, grammarAccess.getValueFunctionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3884:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==13) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3884:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleValueFunction8295); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueFunctionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3888:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3889:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3889:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3890:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueFunction8312); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleValueFunction8331); 

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


    // $ANTLR start "entryRuleClassOfService"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3918:1: entryRuleClassOfService returns [EObject current=null] : iv_ruleClassOfService= ruleClassOfService EOF ;
    public final EObject entryRuleClassOfService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOfService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3919:2: (iv_ruleClassOfService= ruleClassOfService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3920:2: iv_ruleClassOfService= ruleClassOfService EOF
            {
             newCompositeNode(grammarAccess.getClassOfServiceRule()); 
            pushFollow(FOLLOW_ruleClassOfService_in_entryRuleClassOfService8367);
            iv_ruleClassOfService=ruleClassOfService();

            state._fsp--;

             current =iv_ruleClassOfService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOfService8377); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3927:1: ruleClassOfService returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_disruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}' ) ;
    public final EObject ruleClassOfService() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_disruptive_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3930:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_disruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3931:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_disruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3931:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_disruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3931:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_disruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3931:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_INT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3932:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3932:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3933:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleClassOfService8419); 

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

            otherlv_1=(Token)match(input,111,FOLLOW_111_in_ruleClassOfService8437); 

                	newLeafNode(otherlv_1, grammarAccess.getClassOfServiceAccess().getClassOfServiceKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3953:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3954:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3954:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3955:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassOfService8454); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleClassOfService8471); 

                	newLeafNode(otherlv_3, grammarAccess.getClassOfServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3975:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==13) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3975:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleClassOfService8484); 

                        	newLeafNode(otherlv_4, grammarAccess.getClassOfServiceAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3979:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3980:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3980:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3981:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassOfService8501); 

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

            otherlv_6=(Token)match(input,120,FOLLOW_120_in_ruleClassOfService8520); 

                	newLeafNode(otherlv_6, grammarAccess.getClassOfServiceAccess().getDisruptiveKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4001:1: ( ( (lv_disruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==121) ) {
                alt86=1;
            }
            else if ( (LA86_0==122) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4001:2: ( (lv_disruptive_7_0= 'TRUE' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4001:2: ( (lv_disruptive_7_0= 'TRUE' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4002:1: (lv_disruptive_7_0= 'TRUE' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4002:1: (lv_disruptive_7_0= 'TRUE' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4003:3: lv_disruptive_7_0= 'TRUE'
                    {
                    lv_disruptive_7_0=(Token)match(input,121,FOLLOW_121_in_ruleClassOfService8539); 

                            newLeafNode(lv_disruptive_7_0, grammarAccess.getClassOfServiceAccess().getDisruptiveTRUEKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(current, "disruptive", true, "TRUE");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4017:7: otherlv_8= 'FALSE'
                    {
                    otherlv_8=(Token)match(input,122,FOLLOW_122_in_ruleClassOfService8570); 

                        	newLeafNode(otherlv_8, grammarAccess.getClassOfServiceAccess().getFALSEKeyword_6_1());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleClassOfService8583); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4033:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4034:2: (iv_ruleService= ruleService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4035:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService8619);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService8629); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4042:1: ruleService returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4045:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4046:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4046:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4046:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4046:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_INT) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4047:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4047:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4048:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleService8671); 

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

            otherlv_1=(Token)match(input,123,FOLLOW_123_in_ruleService8689); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4068:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4069:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4069:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4070:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService8706); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4086:2: (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==38) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4086:4: otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleService8724); 

                        	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4090:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==13) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4090:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleService8737); 

                                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getDescriptionKeyword_3_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4094:1: ( (lv_description_5_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4095:1: (lv_description_5_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4095:1: (lv_description_5_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4096:3: lv_description_5_0= RULE_STRING
                            {
                            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService8754); 

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

                    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleService8773); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4124:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4125:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4126:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider8811);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProvider8821); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4133:1: ruleServiceProvider returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4136:28: ( ( ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4137:1: ( ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4137:1: ( ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4137:2: ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4137:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_INT) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4138:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4138:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4139:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceProvider8863); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4155:3: (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==124) ) {
                alt91=1;
            }
            else if ( (LA91_0==125) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4155:5: otherlv_1= 'ServiceProvider'
                    {
                    otherlv_1=(Token)match(input,124,FOLLOW_124_in_ruleServiceProvider8882); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getServiceProviderKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4160:7: otherlv_2= 'Group'
                    {
                    otherlv_2=(Token)match(input,125,FOLLOW_125_in_ruleServiceProvider8900); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceProviderAccess().getGroupKeyword_1_1());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4164:2: ( (lv_name_3_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4165:1: (lv_name_3_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4165:1: (lv_name_3_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4166:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider8918); 

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

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider8935); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4186:1: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==13) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4186:3: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleServiceProvider8948); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4190:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4191:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4191:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4192:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceProvider8965); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4208:4: (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==101) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4208:6: otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,101,FOLLOW_101_in_ruleServiceProvider8985); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getAssignToKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider8997); 

                        	newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4216:1: ( (otherlv_9= RULE_ID ) )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==RULE_ID) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4217:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4217:1: (otherlv_9= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4218:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider9017); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_5_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt93 >= 1 ) break loop93;
                                EarlyExitException eee =
                                    new EarlyExitException(93, input);
                                throw eee;
                        }
                        cnt93++;
                    } while (true);

                    otherlv_10=(Token)match(input,39,FOLLOW_39_in_ruleServiceProvider9030); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4233:3: (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==126) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4233:5: otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,126,FOLLOW_126_in_ruleServiceProvider9045); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getOutsourceFromKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider9057); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4241:1: ( (otherlv_13= RULE_ID ) )+
                    int cnt95=0;
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==RULE_ID) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4242:1: (otherlv_13= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4242:1: (otherlv_13= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4243:3: otherlv_13= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider9077); 

                    	    		newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getOutsourceFromServiceProviderCrossReference_6_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt95 >= 1 ) break loop95;
                                EarlyExitException eee =
                                    new EarlyExitException(95, input);
                                throw eee;
                        }
                        cnt95++;
                    } while (true);

                    otherlv_14=(Token)match(input,39,FOLLOW_39_in_ruleServiceProvider9090); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,127,FOLLOW_127_in_ruleServiceProvider9104); 

                	newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getTeamServiceKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4262:1: ( (otherlv_16= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4263:1: (otherlv_16= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4263:1: (otherlv_16= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4264:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceProviderRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider9124); 

            		newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getTeamServiceServiceCrossReference_8_0()); 
            	

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4275:2: (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==88) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4275:4: otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}'
                    {
                    otherlv_17=(Token)match(input,88,FOLLOW_88_in_ruleServiceProvider9137); 

                        	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getGovernanceStrategyKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider9149); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4283:1: ( (otherlv_19= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4284:1: (otherlv_19= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4284:1: (otherlv_19= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4285:3: otherlv_19= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider9169); 

                    		newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getGovernanceStrategyGovernanceStrategyCrossReference_9_2_0()); 
                    	

                    }


                    }

                    otherlv_20=(Token)match(input,39,FOLLOW_39_in_ruleServiceProvider9181); 

                        	newLeafNode(otherlv_20, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4300:3: (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==128) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4300:5: otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}'
                    {
                    otherlv_21=(Token)match(input,128,FOLLOW_128_in_ruleServiceProvider9196); 

                        	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getResourcesKeyword_10_0());
                        
                    otherlv_22=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider9208); 

                        	newLeafNode(otherlv_22, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4308:1: ( (lv_resources_23_0= ruleAsset ) )+
                    int cnt98=0;
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==RULE_INT||LA98_0==129) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4309:1: (lv_resources_23_0= ruleAsset )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4309:1: (lv_resources_23_0= ruleAsset )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4310:3: lv_resources_23_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleServiceProvider9229);
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
                    	    if ( cnt98 >= 1 ) break loop98;
                                EarlyExitException eee =
                                    new EarlyExitException(98, input);
                                throw eee;
                        }
                        cnt98++;
                    } while (true);

                    otherlv_24=(Token)match(input,39,FOLLOW_39_in_ruleServiceProvider9242); 

                        	newLeafNode(otherlv_24, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_10_3());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,39,FOLLOW_39_in_ruleServiceProvider9256); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4342:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4343:2: (iv_ruleAsset= ruleAsset EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4344:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset9292);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset9302); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4351:1: ruleAsset returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4354:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4355:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4355:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4355:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4355:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_INT) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4356:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4356:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4357:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAsset9344); 

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

            otherlv_1=(Token)match(input,129,FOLLOW_129_in_ruleAsset9362); 

                	newLeafNode(otherlv_1, grammarAccess.getAssetAccess().getResourceKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4377:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4378:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4378:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4379:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset9379); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleAsset9396); 

                	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4399:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==13) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4399:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAsset9409); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4403:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4404:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4404:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4405:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAsset9426); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4421:4: (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==130) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4421:6: otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,130,FOLLOW_130_in_ruleAsset9446); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssetAccess().getSkillSetKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleAsset9458); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4429:1: ( (lv_skillSet_8_0= ruleSkill ) )+
                    int cnt102=0;
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==123) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4430:1: (lv_skillSet_8_0= ruleSkill )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4430:1: (lv_skillSet_8_0= ruleSkill )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4431:3: lv_skillSet_8_0= ruleSkill
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSkill_in_ruleAsset9479);
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
                    	    if ( cnt102 >= 1 ) break loop102;
                                EarlyExitException eee =
                                    new EarlyExitException(102, input);
                                throw eee;
                        }
                        cnt102++;
                    } while (true);

                    otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleAsset9492); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,39,FOLLOW_39_in_ruleAsset9506); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4463:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4464:2: (iv_ruleSkill= ruleSkill EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4465:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_ruleSkill_in_entryRuleSkill9542);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkill9552); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4472:1: ruleSkill returns [EObject current=null] : (otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_efficiency_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4475:28: ( (otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4476:1: (otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4476:1: (otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4476:3: otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,123,FOLLOW_123_in_ruleSkill9589); 

                	newLeafNode(otherlv_0, grammarAccess.getSkillAccess().getServiceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4480:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4481:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4481:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4482:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkillRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkill9609); 

            		newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getServiceServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,131,FOLLOW_131_in_ruleSkill9621); 

                	newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getEfficiencyKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4497:1: ( (lv_efficiency_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4498:1: (lv_efficiency_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4498:1: (lv_efficiency_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4499:3: lv_efficiency_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getSkillAccess().getEfficiencyNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleSkill9642);
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
    public static final BitSet FOLLOW_ruleSystemLibraries_in_ruleModelBuilder199 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleUserLibraries_in_ruleModelBuilder220 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleExperimentModel_in_ruleModelBuilder241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentModel_in_entryRuleExperimentModel277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentModel287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleExperimentModel324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperimentModel341 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleExperimentModel359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleExperimentModel380 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentModel394 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExperimentModel406 = new BitSet(new long[]{0x0000000000000040L,0x3000000000000000L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_ruleExperimentModel427 = new BitSet(new long[]{0x0000000000040040L,0x3000000000000000L});
    public static final BitSet FOLLOW_18_in_ruleExperimentModel440 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExperimentModel452 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExperimentModel464 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExperimentModel476 = new BitSet(new long[]{0x0000000000000040L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleWorkSource_in_ruleExperimentModel497 = new BitSet(new long[]{0x0000000000400040L,0x0000001000000000L});
    public static final BitSet FOLLOW_22_in_ruleExperimentModel510 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleExperimentModel522 = new BitSet(new long[]{0x0000000000000040L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleWorkItemNetwork_in_ruleExperimentModel543 = new BitSet(new long[]{0x0000000001000040L,0x0000000000200000L});
    public static final BitSet FOLLOW_24_in_ruleExperimentModel556 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExperimentModel568 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExperimentModel580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleWINReplicationSetting_in_ruleExperimentModel601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleIndicators_in_ruleExperimentModel622 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleExperimentModel634 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleExperimentModel646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemLibraries_in_entryRuleSystemLibraries682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemLibraries692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSystemLibraries729 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSystemLibraries741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleEventType_in_ruleSystemLibraries762 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_31_in_ruleSystemLibraries775 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSystemLibraries787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleConditionType_in_ruleSystemLibraries808 = new BitSet(new long[]{0x0000000200000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_33_in_ruleSystemLibraries821 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSystemLibraries833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleSystemLibraries854 = new BitSet(new long[]{0x0000000800000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_35_in_ruleSystemLibraries867 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSystemLibraries879 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSystemLibraries891 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSystemLibraries903 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleWIAcceptanceRuleType_in_ruleSystemLibraries924 = new BitSet(new long[]{0x0000008000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_39_in_ruleSystemLibraries937 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSystemLibraries949 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSystemLibraries961 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleWISelectionRuleType_in_ruleSystemLibraries982 = new BitSet(new long[]{0x0000008000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_39_in_ruleSystemLibraries995 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSystemLibraries1007 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSystemLibraries1019 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleWIAssignmentRuleType_in_ruleSystemLibraries1040 = new BitSet(new long[]{0x0000008000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_39_in_ruleSystemLibraries1053 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSystemLibraries1065 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSystemLibraries1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleResourceAllocationRuleType_in_ruleSystemLibraries1098 = new BitSet(new long[]{0x0000008000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_39_in_ruleSystemLibraries1111 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSystemLibraries1123 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSystemLibraries1135 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleResourceOutsourcingRuleType_in_ruleSystemLibraries1156 = new BitSet(new long[]{0x0000008000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_39_in_ruleSystemLibraries1169 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSystemLibraries1181 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleSystemLibraries1193 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleSystemLibraries1205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleProcessModel_in_ruleSystemLibraries1226 = new BitSet(new long[]{0x0000800000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_47_in_ruleSystemLibraries1239 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleSystemLibraries1251 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_ruleValueFunction_in_ruleSystemLibraries1272 = new BitSet(new long[]{0x0002000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_49_in_ruleSystemLibraries1285 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleSystemLibraries1297 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleSystemLibraries1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserLibraries_in_entryRuleUserLibraries1345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserLibraries1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUserLibraries1392 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleUserLibraries1404 = new BitSet(new long[]{0x0000000000000040L,0x0040000000000000L});
    public static final BitSet FOLLOW_ruleWorkItemType_in_ruleUserLibraries1425 = new BitSet(new long[]{0x0040000000000040L,0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleUserLibraries1438 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleUserLibraries1450 = new BitSet(new long[]{0x0000000000000040L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleClassOfService_in_ruleUserLibraries1471 = new BitSet(new long[]{0x0100000000000040L,0x0000800000000000L});
    public static final BitSet FOLLOW_56_in_ruleUserLibraries1484 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleUserLibraries1496 = new BitSet(new long[]{0x0000000000000040L,0x0800000000000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleUserLibraries1517 = new BitSet(new long[]{0x0400000000000040L,0x0800000000000000L});
    public static final BitSet FOLLOW_58_in_ruleUserLibraries1530 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleUserLibraries1542 = new BitSet(new long[]{0x0000000000000040L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleGovernanceStrategy_in_ruleUserLibraries1563 = new BitSet(new long[]{0x1000000000000040L,0x0000000001000000L});
    public static final BitSet FOLLOW_60_in_ruleUserLibraries1576 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleUserLibraries1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1676 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleQualifiedName1695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1710 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleQualifiedName1731 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualifiedName1746 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleNumExpression_in_entryRuleNumExpression1793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumExpression1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNumExpression1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleNumExpression1875 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleNumExpression1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOperator1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperator2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperator2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperator2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperator2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperator2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameter2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleParameter2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution2408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDistribution2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_71_in_ruleDistribution2499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_72_in_ruleDistribution2536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleDistribution2562 = new BitSet(new long[]{0x00000000000000F0L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDistribution2583 = new BitSet(new long[]{0x00000000000000F0L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleDistribution2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventType_in_entryRuleEventType2632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventType2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleEventType2679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventType2696 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventType2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionType_in_entryRuleConditionType2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionType2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleConditionType2807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConditionType2824 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConditionType2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_entryRuleTransitionType2888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionType2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTransitionType2935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionType2952 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransitionType2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessModel_in_entryRuleProcessModel3016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessModel3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleProcessModel3063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessModel3080 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleProcessModel3097 = new BitSet(new long[]{0x0000000000002000L,0x0000000000008000L});
    public static final BitSet FOLLOW_13_in_ruleProcessModel3110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessModel3127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleProcessModel3146 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleProcessModel3158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleProcessModel3179 = new BitSet(new long[]{0x0000008000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_39_in_ruleProcessModel3192 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleProcessModel3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleEvent3287 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEvent3299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleEvent3311 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEvent3323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleEvent3344 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleEvent3357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleEvent3369 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEvent3381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleEvent3402 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleEvent3415 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEvent3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition3463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCondition3518 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleOperator_in_ruleCondition3539 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCondition3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleTransition3663 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTransition3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWINReplicationSetting_in_entryRuleWINReplicationSetting3722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWINReplicationSetting3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleWINReplicationSetting3769 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWINReplicationSetting3781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleWINReplication_in_ruleWINReplicationSetting3802 = new BitSet(new long[]{0x0000008000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_39_in_ruleWINReplicationSetting3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWINReplication_in_entryRuleWINReplication3851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWINReplication3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleWINReplication3898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWINReplication3918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleWINReplication3930 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWINReplication3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicators_in_entryRuleIndicators3988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicators3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleIndicators4035 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleIndicators4047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicators4064 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleIndicators4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGovernanceStrategy_in_entryRuleGovernanceStrategy4118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGovernanceStrategy4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGovernanceStrategy4170 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleGovernanceStrategy4188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGovernanceStrategy4205 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleGovernanceStrategy4222 = new BitSet(new long[]{0x0000000000002000L,0x0000000006000000L});
    public static final BitSet FOLLOW_13_in_ruleGovernanceStrategy4235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGovernanceStrategy4252 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleGovernanceStrategy4281 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleGovernanceStrategy4302 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleGovernanceStrategy4323 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleGovernanceStrategy4344 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleGovernanceStrategy4365 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleGovernanceStrategy4379 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleGovernanceStrategy4391 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ruleMechanism_in_ruleGovernanceStrategy4412 = new BitSet(new long[]{0x0000008000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_39_in_ruleGovernanceStrategy4425 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleGovernanceStrategy4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance4473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptance4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleWIAcceptance4520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptance4540 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWIAcceptance4552 = new BitSet(new long[]{0x0000008000002000L,0x0000000018000000L});
    public static final BitSet FOLLOW_13_in_ruleWIAcceptance4565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptance4582 = new BitSet(new long[]{0x0000008000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_91_in_ruleWIAcceptance4602 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance4619 = new BitSet(new long[]{0x0000008000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleWIAcceptance4639 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance4656 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWIAcceptance4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelection_in_entryRuleWISelection4711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelection4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleWISelection4758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelection4778 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWISelection4790 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleWISelection4803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelection4820 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWISelection4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment4875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignment4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleWIAssignment4922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignment4942 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWIAssignment4954 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleWIAssignment4967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignment4984 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWIAssignment5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation5039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocation5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleResourceAllocation5086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocation5106 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleResourceAllocation5118 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceAllocation5131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocation5148 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleResourceAllocation5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing5203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcing5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleResourceOutsourcing5250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcing5270 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleResourceOutsourcing5282 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceOutsourcing5295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcing5312 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleResourceOutsourcing5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptanceRuleType_in_entryRuleWIAcceptanceRuleType5367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptanceRuleType5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleWIAcceptanceRuleType5414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptanceRuleType5431 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWIAcceptanceRuleType5448 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleWIAcceptanceRuleType5461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptanceRuleType5478 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWIAcceptanceRuleType5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelectionRuleType_in_entryRuleWISelectionRuleType5533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelectionRuleType5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleWISelectionRuleType5580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelectionRuleType5597 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWISelectionRuleType5614 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleWISelectionRuleType5627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelectionRuleType5644 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWISelectionRuleType5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignmentRuleType_in_entryRuleWIAssignmentRuleType5699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignmentRuleType5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleWIAssignmentRuleType5746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignmentRuleType5763 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWIAssignmentRuleType5780 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleWIAssignmentRuleType5793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignmentRuleType5810 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWIAssignmentRuleType5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocationRuleType_in_entryRuleResourceAllocationRuleType5865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocationRuleType5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleResourceAllocationRuleType5912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocationRuleType5929 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleResourceAllocationRuleType5946 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceAllocationRuleType5959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocationRuleType5976 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleResourceAllocationRuleType5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcingRuleType_in_entryRuleResourceOutsourcingRuleType6031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcingRuleType6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleResourceOutsourcingRuleType6078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcingRuleType6095 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleResourceOutsourcingRuleType6112 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceOutsourcingRuleType6125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcingRuleType6142 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleResourceOutsourcingRuleType6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanism_in_entryRuleMechanism6197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanism6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleMechanism6244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechanism6261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleMechanism6278 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMechanism6299 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMechanism6311 = new BitSet(new long[]{0x0000008000002000L,0x0000000800000000L});
    public static final BitSet FOLLOW_13_in_ruleMechanism6324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanism6341 = new BitSet(new long[]{0x0000008000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleMechanism6361 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMechanism6373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMechanismAttribute_in_ruleMechanism6394 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_39_in_ruleMechanism6407 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleMechanism6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanismAttribute_in_entryRuleMechanismAttribute6457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanismAttribute6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanismAttribute6509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleMechanismAttribute6526 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMechanismAttribute6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSource_in_entryRuleWorkSource6583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSource6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkSource6635 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleWorkSource6653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource6670 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkSource6687 = new BitSet(new long[]{0x0000008000002000L,0x0000002040000000L});
    public static final BitSet FOLLOW_13_in_ruleWorkSource6700 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkSource6717 = new BitSet(new long[]{0x0000008000000000L,0x0000002040000000L});
    public static final BitSet FOLLOW_101_in_ruleWorkSource6737 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkSource6749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource6769 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleWorkSource6782 = new BitSet(new long[]{0x0000008000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleWorkSource6805 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWorkSource6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemNetwork_in_entryRuleWorkItemNetwork6854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemNetwork6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemNetwork6906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleWorkItemNetwork6924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemNetwork6941 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItemNetwork6958 = new BitSet(new long[]{0x0000000000002000L,0x0000004000000000L});
    public static final BitSet FOLLOW_13_in_ruleWorkItemNetwork6971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemNetwork6988 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleWorkItemNetwork7007 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItemNetwork7019 = new BitSet(new long[]{0x0000000000000040L,0x0000008000000000L});
    public static final BitSet FOLLOW_ruleWorkItem_in_ruleWorkItemNetwork7040 = new BitSet(new long[]{0x0000008000000040L,0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWorkItemNetwork7053 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWorkItemNetwork7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItem_in_entryRuleWorkItem7101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItem7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem7153 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleWorkItem7171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem7188 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItem7205 = new BitSet(new long[]{0x0000000000002000L,0x0000010000000000L});
    public static final BitSet FOLLOW_13_in_ruleWorkItem7218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItem7235 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleWorkItem7254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem7274 = new BitSet(new long[]{0x0000000000000000L,0x00001E0000000000L});
    public static final BitSet FOLLOW_105_in_ruleWorkItem7293 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItem7318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem7338 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleWorkItem7351 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_106_in_ruleWorkItem7372 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItem7397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem7417 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleWorkItem7430 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_107_in_ruleWorkItem7445 = new BitSet(new long[]{0x0000000000000000L,0x000C100000000000L});
    public static final BitSet FOLLOW_ruleCausalTrigger_in_ruleWorkItem7466 = new BitSet(new long[]{0x0000000000000000L,0x000C100000000000L});
    public static final BitSet FOLLOW_108_in_ruleWorkItem7481 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItem7493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem7513 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleWorkItem7526 = new BitSet(new long[]{0x0000008000000000L,0x0003E01000000000L});
    public static final BitSet FOLLOW_109_in_ruleWorkItem7539 = new BitSet(new long[]{0x8000000000000080L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItem7560 = new BitSet(new long[]{0x0000008000000000L,0x0003C01000000000L});
    public static final BitSet FOLLOW_110_in_ruleWorkItem7575 = new BitSet(new long[]{0x8000000000000080L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItem7596 = new BitSet(new long[]{0x0000008000000000L,0x0003801000000000L});
    public static final BitSet FOLLOW_111_in_ruleWorkItem7611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem7631 = new BitSet(new long[]{0x0000008000000000L,0x0003001000000000L});
    public static final BitSet FOLLOW_100_in_ruleWorkItem7646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem7666 = new BitSet(new long[]{0x0000008000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_ruleWorkItem7681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem7698 = new BitSet(new long[]{0x0000008000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleWorkItem7718 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem7735 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWorkItem7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCausalTrigger_in_entryRuleCausalTrigger7790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCausalTrigger7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleCausalTrigger7838 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_115_in_ruleCausalTrigger7856 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCausalTrigger7869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCausalTrigger7889 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleCausalTrigger7902 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L});
    public static final BitSet FOLLOW_116_in_ruleCausalTrigger7915 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCausalTrigger7932 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleCausalTrigger7952 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCausalTrigger7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemType_in_entryRuleWorkItemType8012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemType8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemType8064 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleWorkItemType8082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemType8099 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItemType8116 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleWorkItemType8129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemType8146 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWorkItemType8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueFunction_in_entryRuleValueFunction8201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueFunction8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleValueFunction8248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueFunction8265 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleValueFunction8282 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleValueFunction8295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueFunction8312 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleValueFunction8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOfService_in_entryRuleClassOfService8367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOfService8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleClassOfService8419 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleClassOfService8437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassOfService8454 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleClassOfService8471 = new BitSet(new long[]{0x0000000000002000L,0x0100000000000000L});
    public static final BitSet FOLLOW_13_in_ruleClassOfService8484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassOfService8501 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleClassOfService8520 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_ruleClassOfService8539 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_122_in_ruleClassOfService8570 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleClassOfService8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService8619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleService8671 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleService8689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService8706 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleService8724 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleService8737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService8754 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleService8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider8811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProvider8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceProvider8863 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleServiceProvider8882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_125_in_ruleServiceProvider8900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider8918 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider8935 = new BitSet(new long[]{0x0000000000002000L,0xC000002000000000L});
    public static final BitSet FOLLOW_13_in_ruleServiceProvider8948 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceProvider8965 = new BitSet(new long[]{0x0000000000000000L,0xC000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleServiceProvider8985 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider8997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider9017 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleServiceProvider9030 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleServiceProvider9045 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider9057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider9077 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_ruleServiceProvider9090 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleServiceProvider9104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider9124 = new BitSet(new long[]{0x0000008000000000L,0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_88_in_ruleServiceProvider9137 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider9149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider9169 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleServiceProvider9181 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ruleServiceProvider9196 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider9208 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleServiceProvider9229 = new BitSet(new long[]{0x0000008000000040L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleServiceProvider9242 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleServiceProvider9256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset9292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAsset9344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleAsset9362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset9379 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleAsset9396 = new BitSet(new long[]{0x0000008000002000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_13_in_ruleAsset9409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAsset9426 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleAsset9446 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleAsset9458 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ruleSkill_in_ruleAsset9479 = new BitSet(new long[]{0x0000008000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_39_in_ruleAsset9492 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAsset9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_entryRuleSkill9542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkill9552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleSkill9589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkill9609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_ruleSkill9621 = new BitSet(new long[]{0x8000000000000080L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleSkill9642 = new BitSet(new long[]{0x0000000000000002L});

}