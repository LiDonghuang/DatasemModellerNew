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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KSSModel'", "'GovernanceModel'", "'GovernanceSearchStrategies'", "'end GovernanceSearchStrategies'", "'TaskPatterns'", "'end TaskPatterns'", "'ValueFunctions'", "'end ValueFunctions'", "'end GovernanceModel'", "'OrganizationalModel'", "'ServiceTypes'", "'end ServiceTypes'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkSources'", "'end WorkSources'", "'WorkItems'", "'end WorkItems'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'Replications'", "'InterArrivalTime'", "'end ExperimentSettings'", "'end KSSModel'", "'workflowTemplate'", "'{'", "'Description'", "'Types'", "'}'", "'taskType'", "'valueFunction'", "'Mechanism'", "'ProcessType'", "'Strategy'", "'WIAcceptance'", "'BackLogLimit'", "'WIPLimit'", "'WISelection'", "'WIAssignment'", "'ResourceAllocation'", "'ResourceOutsourcing'", "'workSource'", "'targetUnits'", "'workItem'", "'Pattern'", "'Type'", "'predecessors'", "'subtasks'", "'causality'", "'serviceType'", "'baseEfforts'", "'baseValue'", "'localValues'", "'classOfService'", "'WorkSource'", "'arrivalTime'", "'dueDate'", "'=>'", "'->'", "'atProgress'", "'onProbability'", "'owner'", "'value'", "'service'", "'type'", "'efficiency'", "'serviceProvider'", "'group'", "'sourceUnits'", "'subordinateUnits'", "'services'", "'governanceSearchStrategy'", "'default'", "'specified'", "'resources'", "'resource'", "'capability'", "'requirement'", "'workItems'", "'workItemNetwork'", "'('", "','", "')'", "'events'", "'end'", "'activities'", "'state'", "'actions'", "'/'", "'['", "']'"
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
    public static final int T__11=11;
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
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
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
    public static final int T__103=103;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:76:1: ruleKanbanSchedulingSystem returns [EObject current=null] : (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GovernanceModel' ( (lv_Mechanisms_3_0= ruleMechanism ) )? (otherlv_4= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_5_0= ruleStrategy ) )+ otherlv_6= 'end GovernanceSearchStrategies' )? (otherlv_7= 'TaskPatterns' ( (lv_KSSTaskPatterns_8_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_9_0= ruleTaskType ) )+ otherlv_10= 'end TaskPatterns' )? (otherlv_11= 'ValueFunctions' ( (lv_KSSValueFunctions_12_0= ruleValueFunction ) )+ otherlv_13= 'end ValueFunctions' )? otherlv_14= 'end GovernanceModel' otherlv_15= 'OrganizationalModel' otherlv_16= 'ServiceTypes' ( (lv_SoSServices_17_0= ruleServiceType ) )+ otherlv_18= 'end ServiceTypes' otherlv_19= 'ServiceProviders' ( (lv_orgUnits_20_0= ruleServiceProvider ) )+ otherlv_21= 'end ServiceProviders' otherlv_22= 'end OrganizationalModel' otherlv_23= 'WorkItemNetworkModel' otherlv_24= 'WorkSources' ( (lv_kssSources_25_0= ruleWorkSource ) )+ otherlv_26= 'end WorkSources' otherlv_27= 'WorkItems' ( (lv_kssWItems_28_0= ruleWorkItem ) )+ otherlv_29= 'end WorkItems' otherlv_30= 'end WorkItemNetworkModel' otherlv_31= 'ExperimentSettings' otherlv_32= 'Replications' ( (lv_replications_33_0= RULE_INT ) ) otherlv_34= 'InterArrivalTime' ( (lv_interArrivalTime_35_0= RULE_INT ) ) otherlv_36= 'end ExperimentSettings' otherlv_37= 'end KSSModel' ) ;
    public final EObject ruleKanbanSchedulingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_replications_33_0=null;
        Token otherlv_34=null;
        Token lv_interArrivalTime_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        EObject lv_Mechanisms_3_0 = null;

        EObject lv_KSSSearchStrategies_5_0 = null;

        EObject lv_KSSTaskPatterns_8_0 = null;

        EObject lv_KSStaskPatternTypes_9_0 = null;

        EObject lv_KSSValueFunctions_12_0 = null;

        EObject lv_SoSServices_17_0 = null;

        EObject lv_orgUnits_20_0 = null;

        EObject lv_kssSources_25_0 = null;

        EObject lv_kssWItems_28_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:79:28: ( (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GovernanceModel' ( (lv_Mechanisms_3_0= ruleMechanism ) )? (otherlv_4= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_5_0= ruleStrategy ) )+ otherlv_6= 'end GovernanceSearchStrategies' )? (otherlv_7= 'TaskPatterns' ( (lv_KSSTaskPatterns_8_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_9_0= ruleTaskType ) )+ otherlv_10= 'end TaskPatterns' )? (otherlv_11= 'ValueFunctions' ( (lv_KSSValueFunctions_12_0= ruleValueFunction ) )+ otherlv_13= 'end ValueFunctions' )? otherlv_14= 'end GovernanceModel' otherlv_15= 'OrganizationalModel' otherlv_16= 'ServiceTypes' ( (lv_SoSServices_17_0= ruleServiceType ) )+ otherlv_18= 'end ServiceTypes' otherlv_19= 'ServiceProviders' ( (lv_orgUnits_20_0= ruleServiceProvider ) )+ otherlv_21= 'end ServiceProviders' otherlv_22= 'end OrganizationalModel' otherlv_23= 'WorkItemNetworkModel' otherlv_24= 'WorkSources' ( (lv_kssSources_25_0= ruleWorkSource ) )+ otherlv_26= 'end WorkSources' otherlv_27= 'WorkItems' ( (lv_kssWItems_28_0= ruleWorkItem ) )+ otherlv_29= 'end WorkItems' otherlv_30= 'end WorkItemNetworkModel' otherlv_31= 'ExperimentSettings' otherlv_32= 'Replications' ( (lv_replications_33_0= RULE_INT ) ) otherlv_34= 'InterArrivalTime' ( (lv_interArrivalTime_35_0= RULE_INT ) ) otherlv_36= 'end ExperimentSettings' otherlv_37= 'end KSSModel' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GovernanceModel' ( (lv_Mechanisms_3_0= ruleMechanism ) )? (otherlv_4= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_5_0= ruleStrategy ) )+ otherlv_6= 'end GovernanceSearchStrategies' )? (otherlv_7= 'TaskPatterns' ( (lv_KSSTaskPatterns_8_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_9_0= ruleTaskType ) )+ otherlv_10= 'end TaskPatterns' )? (otherlv_11= 'ValueFunctions' ( (lv_KSSValueFunctions_12_0= ruleValueFunction ) )+ otherlv_13= 'end ValueFunctions' )? otherlv_14= 'end GovernanceModel' otherlv_15= 'OrganizationalModel' otherlv_16= 'ServiceTypes' ( (lv_SoSServices_17_0= ruleServiceType ) )+ otherlv_18= 'end ServiceTypes' otherlv_19= 'ServiceProviders' ( (lv_orgUnits_20_0= ruleServiceProvider ) )+ otherlv_21= 'end ServiceProviders' otherlv_22= 'end OrganizationalModel' otherlv_23= 'WorkItemNetworkModel' otherlv_24= 'WorkSources' ( (lv_kssSources_25_0= ruleWorkSource ) )+ otherlv_26= 'end WorkSources' otherlv_27= 'WorkItems' ( (lv_kssWItems_28_0= ruleWorkItem ) )+ otherlv_29= 'end WorkItems' otherlv_30= 'end WorkItemNetworkModel' otherlv_31= 'ExperimentSettings' otherlv_32= 'Replications' ( (lv_replications_33_0= RULE_INT ) ) otherlv_34= 'InterArrivalTime' ( (lv_interArrivalTime_35_0= RULE_INT ) ) otherlv_36= 'end ExperimentSettings' otherlv_37= 'end KSSModel' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GovernanceModel' ( (lv_Mechanisms_3_0= ruleMechanism ) )? (otherlv_4= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_5_0= ruleStrategy ) )+ otherlv_6= 'end GovernanceSearchStrategies' )? (otherlv_7= 'TaskPatterns' ( (lv_KSSTaskPatterns_8_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_9_0= ruleTaskType ) )+ otherlv_10= 'end TaskPatterns' )? (otherlv_11= 'ValueFunctions' ( (lv_KSSValueFunctions_12_0= ruleValueFunction ) )+ otherlv_13= 'end ValueFunctions' )? otherlv_14= 'end GovernanceModel' otherlv_15= 'OrganizationalModel' otherlv_16= 'ServiceTypes' ( (lv_SoSServices_17_0= ruleServiceType ) )+ otherlv_18= 'end ServiceTypes' otherlv_19= 'ServiceProviders' ( (lv_orgUnits_20_0= ruleServiceProvider ) )+ otherlv_21= 'end ServiceProviders' otherlv_22= 'end OrganizationalModel' otherlv_23= 'WorkItemNetworkModel' otherlv_24= 'WorkSources' ( (lv_kssSources_25_0= ruleWorkSource ) )+ otherlv_26= 'end WorkSources' otherlv_27= 'WorkItems' ( (lv_kssWItems_28_0= ruleWorkItem ) )+ otherlv_29= 'end WorkItems' otherlv_30= 'end WorkItemNetworkModel' otherlv_31= 'ExperimentSettings' otherlv_32= 'Replications' ( (lv_replications_33_0= RULE_INT ) ) otherlv_34= 'InterArrivalTime' ( (lv_interArrivalTime_35_0= RULE_INT ) ) otherlv_36= 'end ExperimentSettings' otherlv_37= 'end KSSModel' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:3: otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'GovernanceModel' ( (lv_Mechanisms_3_0= ruleMechanism ) )? (otherlv_4= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_5_0= ruleStrategy ) )+ otherlv_6= 'end GovernanceSearchStrategies' )? (otherlv_7= 'TaskPatterns' ( (lv_KSSTaskPatterns_8_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_9_0= ruleTaskType ) )+ otherlv_10= 'end TaskPatterns' )? (otherlv_11= 'ValueFunctions' ( (lv_KSSValueFunctions_12_0= ruleValueFunction ) )+ otherlv_13= 'end ValueFunctions' )? otherlv_14= 'end GovernanceModel' otherlv_15= 'OrganizationalModel' otherlv_16= 'ServiceTypes' ( (lv_SoSServices_17_0= ruleServiceType ) )+ otherlv_18= 'end ServiceTypes' otherlv_19= 'ServiceProviders' ( (lv_orgUnits_20_0= ruleServiceProvider ) )+ otherlv_21= 'end ServiceProviders' otherlv_22= 'end OrganizationalModel' otherlv_23= 'WorkItemNetworkModel' otherlv_24= 'WorkSources' ( (lv_kssSources_25_0= ruleWorkSource ) )+ otherlv_26= 'end WorkSources' otherlv_27= 'WorkItems' ( (lv_kssWItems_28_0= ruleWorkItem ) )+ otherlv_29= 'end WorkItems' otherlv_30= 'end WorkItemNetworkModel' otherlv_31= 'ExperimentSettings' otherlv_32= 'Replications' ( (lv_replications_33_0= RULE_INT ) ) otherlv_34= 'InterArrivalTime' ( (lv_interArrivalTime_35_0= RULE_INT ) ) otherlv_36= 'end ExperimentSettings' otherlv_37= 'end KSSModel'
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

                	newLeafNode(otherlv_2, grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceModelKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:106:1: ( (lv_Mechanisms_3_0= ruleMechanism ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:107:1: (lv_Mechanisms_3_0= ruleMechanism )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:107:1: (lv_Mechanisms_3_0= ruleMechanism )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:108:3: lv_Mechanisms_3_0= ruleMechanism
                    {
                     
                    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getMechanismsMechanismParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMechanism_in_ruleKanbanSchedulingSystem177);
                    lv_Mechanisms_3_0=ruleMechanism();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	        }
                           		add(
                           			current, 
                           			"Mechanisms",
                            		lv_Mechanisms_3_0, 
                            		"Mechanism");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:124:3: (otherlv_4= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_5_0= ruleStrategy ) )+ otherlv_6= 'end GovernanceSearchStrategies' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:124:5: otherlv_4= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_5_0= ruleStrategy ) )+ otherlv_6= 'end GovernanceSearchStrategies'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleKanbanSchedulingSystem191); 

                        	newLeafNode(otherlv_4, grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceSearchStrategiesKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:128:1: ( (lv_KSSSearchStrategies_5_0= ruleStrategy ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==46) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:129:1: (lv_KSSSearchStrategies_5_0= ruleStrategy )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:129:1: (lv_KSSSearchStrategies_5_0= ruleStrategy )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:130:3: lv_KSSSearchStrategies_5_0= ruleStrategy
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKSSSearchStrategiesStrategyParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStrategy_in_ruleKanbanSchedulingSystem212);
                    	    lv_KSSSearchStrategies_5_0=ruleStrategy();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"KSSSearchStrategies",
                    	            		lv_KSSSearchStrategies_5_0, 
                    	            		"Strategy");
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

                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleKanbanSchedulingSystem225); 

                        	newLeafNode(otherlv_6, grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceSearchStrategiesKeyword_4_2());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:150:3: (otherlv_7= 'TaskPatterns' ( (lv_KSSTaskPatterns_8_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_9_0= ruleTaskType ) )+ otherlv_10= 'end TaskPatterns' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:150:5: otherlv_7= 'TaskPatterns' ( (lv_KSSTaskPatterns_8_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_9_0= ruleTaskType ) )+ otherlv_10= 'end TaskPatterns'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleKanbanSchedulingSystem240); 

                        	newLeafNode(otherlv_7, grammarAccess.getKanbanSchedulingSystemAccess().getTaskPatternsKeyword_5_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:154:1: ( (lv_KSSTaskPatterns_8_0= ruleTaskPattern ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==37) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:155:1: (lv_KSSTaskPatterns_8_0= ruleTaskPattern )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:155:1: (lv_KSSTaskPatterns_8_0= ruleTaskPattern )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:156:3: lv_KSSTaskPatterns_8_0= ruleTaskPattern
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKSSTaskPatternsTaskPatternParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTaskPattern_in_ruleKanbanSchedulingSystem261);
                    	    lv_KSSTaskPatterns_8_0=ruleTaskPattern();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"KSSTaskPatterns",
                    	            		lv_KSSTaskPatterns_8_0, 
                    	            		"TaskPattern");
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

                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:172:3: ( (lv_KSStaskPatternTypes_9_0= ruleTaskType ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==42) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:173:1: (lv_KSStaskPatternTypes_9_0= ruleTaskType )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:173:1: (lv_KSStaskPatternTypes_9_0= ruleTaskType )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:174:3: lv_KSStaskPatternTypes_9_0= ruleTaskType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKSStaskPatternTypesTaskTypeParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTaskType_in_ruleKanbanSchedulingSystem283);
                    	    lv_KSStaskPatternTypes_9_0=ruleTaskType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"KSStaskPatternTypes",
                    	            		lv_KSStaskPatternTypes_9_0, 
                    	            		"TaskType");
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

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleKanbanSchedulingSystem296); 

                        	newLeafNode(otherlv_10, grammarAccess.getKanbanSchedulingSystemAccess().getEndTaskPatternsKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:194:3: (otherlv_11= 'ValueFunctions' ( (lv_KSSValueFunctions_12_0= ruleValueFunction ) )+ otherlv_13= 'end ValueFunctions' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:194:5: otherlv_11= 'ValueFunctions' ( (lv_KSSValueFunctions_12_0= ruleValueFunction ) )+ otherlv_13= 'end ValueFunctions'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleKanbanSchedulingSystem311); 

                        	newLeafNode(otherlv_11, grammarAccess.getKanbanSchedulingSystemAccess().getValueFunctionsKeyword_6_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:1: ( (lv_KSSValueFunctions_12_0= ruleValueFunction ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==43) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:199:1: (lv_KSSValueFunctions_12_0= ruleValueFunction )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:199:1: (lv_KSSValueFunctions_12_0= ruleValueFunction )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:200:3: lv_KSSValueFunctions_12_0= ruleValueFunction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKSSValueFunctionsValueFunctionParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValueFunction_in_ruleKanbanSchedulingSystem332);
                    	    lv_KSSValueFunctions_12_0=ruleValueFunction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"KSSValueFunctions",
                    	            		lv_KSSValueFunctions_12_0, 
                    	            		"ValueFunction");
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

                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleKanbanSchedulingSystem345); 

                        	newLeafNode(otherlv_13, grammarAccess.getKanbanSchedulingSystemAccess().getEndValueFunctionsKeyword_6_2());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleKanbanSchedulingSystem359); 

                	newLeafNode(otherlv_14, grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceModelKeyword_7());
                
            otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleKanbanSchedulingSystem371); 

                	newLeafNode(otherlv_15, grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationalModelKeyword_8());
                
            otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleKanbanSchedulingSystem383); 

                	newLeafNode(otherlv_16, grammarAccess.getKanbanSchedulingSystemAccess().getServiceTypesKeyword_9());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:232:1: ( (lv_SoSServices_17_0= ruleServiceType ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==62) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:233:1: (lv_SoSServices_17_0= ruleServiceType )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:233:1: (lv_SoSServices_17_0= ruleServiceType )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:234:3: lv_SoSServices_17_0= ruleServiceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getSoSServicesServiceTypeParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceType_in_ruleKanbanSchedulingSystem404);
            	    lv_SoSServices_17_0=ruleServiceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"SoSServices",
            	            		lv_SoSServices_17_0, 
            	            		"ServiceType");
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

            otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleKanbanSchedulingSystem417); 

                	newLeafNode(otherlv_18, grammarAccess.getKanbanSchedulingSystemAccess().getEndServiceTypesKeyword_11());
                
            otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleKanbanSchedulingSystem429); 

                	newLeafNode(otherlv_19, grammarAccess.getKanbanSchedulingSystemAccess().getServiceProvidersKeyword_12());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:258:1: ( (lv_orgUnits_20_0= ruleServiceProvider ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=79 && LA10_0<=80)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:259:1: (lv_orgUnits_20_0= ruleServiceProvider )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:259:1: (lv_orgUnits_20_0= ruleServiceProvider )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:260:3: lv_orgUnits_20_0= ruleServiceProvider
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsServiceProviderParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceProvider_in_ruleKanbanSchedulingSystem450);
            	    lv_orgUnits_20_0=ruleServiceProvider();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"orgUnits",
            	            		lv_orgUnits_20_0, 
            	            		"ServiceProvider");
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

            otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleKanbanSchedulingSystem463); 

                	newLeafNode(otherlv_21, grammarAccess.getKanbanSchedulingSystemAccess().getEndServiceProvidersKeyword_14());
                
            otherlv_22=(Token)match(input,25,FOLLOW_25_in_ruleKanbanSchedulingSystem475); 

                	newLeafNode(otherlv_22, grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationalModelKeyword_15());
                
            otherlv_23=(Token)match(input,26,FOLLOW_26_in_ruleKanbanSchedulingSystem487); 

                	newLeafNode(otherlv_23, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemNetworkModelKeyword_16());
                
            otherlv_24=(Token)match(input,27,FOLLOW_27_in_ruleKanbanSchedulingSystem499); 

                	newLeafNode(otherlv_24, grammarAccess.getKanbanSchedulingSystemAccess().getWorkSourcesKeyword_17());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:292:1: ( (lv_kssSources_25_0= ruleWorkSource ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==54) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:293:1: (lv_kssSources_25_0= ruleWorkSource )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:293:1: (lv_kssSources_25_0= ruleWorkSource )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:294:3: lv_kssSources_25_0= ruleWorkSource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKssSourcesWorkSourceParserRuleCall_18_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkSource_in_ruleKanbanSchedulingSystem520);
            	    lv_kssSources_25_0=ruleWorkSource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"kssSources",
            	            		lv_kssSources_25_0, 
            	            		"WorkSource");
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

            otherlv_26=(Token)match(input,28,FOLLOW_28_in_ruleKanbanSchedulingSystem533); 

                	newLeafNode(otherlv_26, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkSourcesKeyword_19());
                
            otherlv_27=(Token)match(input,29,FOLLOW_29_in_ruleKanbanSchedulingSystem545); 

                	newLeafNode(otherlv_27, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsKeyword_20());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:318:1: ( (lv_kssWItems_28_0= ruleWorkItem ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==56) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:319:1: (lv_kssWItems_28_0= ruleWorkItem )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:319:1: (lv_kssWItems_28_0= ruleWorkItem )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:320:3: lv_kssWItems_28_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKssWItemsWorkItemParserRuleCall_21_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItem_in_ruleKanbanSchedulingSystem566);
            	    lv_kssWItems_28_0=ruleWorkItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"kssWItems",
            	            		lv_kssWItems_28_0, 
            	            		"WorkItem");
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

            otherlv_29=(Token)match(input,30,FOLLOW_30_in_ruleKanbanSchedulingSystem579); 

                	newLeafNode(otherlv_29, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemsKeyword_22());
                
            otherlv_30=(Token)match(input,31,FOLLOW_31_in_ruleKanbanSchedulingSystem591); 

                	newLeafNode(otherlv_30, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemNetworkModelKeyword_23());
                
            otherlv_31=(Token)match(input,32,FOLLOW_32_in_ruleKanbanSchedulingSystem603); 

                	newLeafNode(otherlv_31, grammarAccess.getKanbanSchedulingSystemAccess().getExperimentSettingsKeyword_24());
                
            otherlv_32=(Token)match(input,33,FOLLOW_33_in_ruleKanbanSchedulingSystem615); 

                	newLeafNode(otherlv_32, grammarAccess.getKanbanSchedulingSystemAccess().getReplicationsKeyword_25());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:352:1: ( (lv_replications_33_0= RULE_INT ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:353:1: (lv_replications_33_0= RULE_INT )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:353:1: (lv_replications_33_0= RULE_INT )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:354:3: lv_replications_33_0= RULE_INT
            {
            lv_replications_33_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem632); 

            			newLeafNode(lv_replications_33_0, grammarAccess.getKanbanSchedulingSystemAccess().getReplicationsINTTerminalRuleCall_26_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"replications",
                    		lv_replications_33_0, 
                    		"INT");
            	    

            }


            }

            otherlv_34=(Token)match(input,34,FOLLOW_34_in_ruleKanbanSchedulingSystem649); 

                	newLeafNode(otherlv_34, grammarAccess.getKanbanSchedulingSystemAccess().getInterArrivalTimeKeyword_27());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:374:1: ( (lv_interArrivalTime_35_0= RULE_INT ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:375:1: (lv_interArrivalTime_35_0= RULE_INT )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:375:1: (lv_interArrivalTime_35_0= RULE_INT )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:376:3: lv_interArrivalTime_35_0= RULE_INT
            {
            lv_interArrivalTime_35_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem666); 

            			newLeafNode(lv_interArrivalTime_35_0, grammarAccess.getKanbanSchedulingSystemAccess().getInterArrivalTimeINTTerminalRuleCall_28_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"interArrivalTime",
                    		lv_interArrivalTime_35_0, 
                    		"INT");
            	    

            }


            }

            otherlv_36=(Token)match(input,35,FOLLOW_35_in_ruleKanbanSchedulingSystem683); 

                	newLeafNode(otherlv_36, grammarAccess.getKanbanSchedulingSystemAccess().getEndExperimentSettingsKeyword_29());
                
            otherlv_37=(Token)match(input,36,FOLLOW_36_in_ruleKanbanSchedulingSystem695); 

                	newLeafNode(otherlv_37, grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSModelKeyword_30());
                

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


    // $ANTLR start "entryRuleTaskPattern"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:408:1: entryRuleTaskPattern returns [EObject current=null] : iv_ruleTaskPattern= ruleTaskPattern EOF ;
    public final EObject entryRuleTaskPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskPattern = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:409:2: (iv_ruleTaskPattern= ruleTaskPattern EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:410:2: iv_ruleTaskPattern= ruleTaskPattern EOF
            {
             newCompositeNode(grammarAccess.getTaskPatternRule()); 
            pushFollow(FOLLOW_ruleTaskPattern_in_entryRuleTaskPattern731);
            iv_ruleTaskPattern=ruleTaskPattern();

            state._fsp--;

             current =iv_ruleTaskPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskPattern741); 

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
    // $ANTLR end "entryRuleTaskPattern"


    // $ANTLR start "ruleTaskPattern"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:417:1: ruleTaskPattern returns [EObject current=null] : (otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleTaskPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:420:28: ( (otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:421:1: (otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:421:1: (otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:421:3: otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTaskPattern778); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskPatternAccess().getWorkflowTemplateKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:425:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:426:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:426:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:427:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskPattern795); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTaskPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleTaskPattern812); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskPatternAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:447:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:447:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleTaskPattern825); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskPatternAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:451:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:452:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:452:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:453:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskPattern842); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getTaskPatternAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTaskPatternRule());
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:469:4: (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:469:6: otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleTaskPattern862); 

                        	newLeafNode(otherlv_5, grammarAccess.getTaskPatternAccess().getTypesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleTaskPattern874); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskPatternAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:477:1: ( (otherlv_7= RULE_ID ) )+
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
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:478:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:478:1: (otherlv_7= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:479:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskPatternRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskPattern894); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getTaskPatternAccess().getTaskpatternTypesTaskTypeCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleTaskPattern907); 

                        	newLeafNode(otherlv_8, grammarAccess.getTaskPatternAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleTaskPattern921); 

                	newLeafNode(otherlv_9, grammarAccess.getTaskPatternAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleTaskPattern"


    // $ANTLR start "entryRuleTaskType"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:506:1: entryRuleTaskType returns [EObject current=null] : iv_ruleTaskType= ruleTaskType EOF ;
    public final EObject entryRuleTaskType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskType = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:507:2: (iv_ruleTaskType= ruleTaskType EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:508:2: iv_ruleTaskType= ruleTaskType EOF
            {
             newCompositeNode(grammarAccess.getTaskTypeRule()); 
            pushFollow(FOLLOW_ruleTaskType_in_entryRuleTaskType957);
            iv_ruleTaskType=ruleTaskType();

            state._fsp--;

             current =iv_ruleTaskType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskType967); 

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
    // $ANTLR end "entryRuleTaskType"


    // $ANTLR start "ruleTaskType"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:515:1: ruleTaskType returns [EObject current=null] : (otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTaskType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:518:28: ( (otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:519:1: (otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:519:1: (otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:519:3: otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleTaskType1004); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskTypeAccess().getTaskTypeKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:523:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:524:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:524:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:525:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskType1021); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTaskTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleTaskType1038); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:545:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:545:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleTaskType1051); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:549:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:550:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:550:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:551:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskType1068); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getTaskTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTaskTypeRule());
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

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleTaskType1087); 

                	newLeafNode(otherlv_5, grammarAccess.getTaskTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleTaskType"


    // $ANTLR start "entryRuleValueFunction"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:579:1: entryRuleValueFunction returns [EObject current=null] : iv_ruleValueFunction= ruleValueFunction EOF ;
    public final EObject entryRuleValueFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueFunction = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:580:2: (iv_ruleValueFunction= ruleValueFunction EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:581:2: iv_ruleValueFunction= ruleValueFunction EOF
            {
             newCompositeNode(grammarAccess.getValueFunctionRule()); 
            pushFollow(FOLLOW_ruleValueFunction_in_entryRuleValueFunction1123);
            iv_ruleValueFunction=ruleValueFunction();

            state._fsp--;

             current =iv_ruleValueFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueFunction1133); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:588:1: ruleValueFunction returns [EObject current=null] : (otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:591:28: ( (otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:592:1: (otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:592:1: (otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:592:3: otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleValueFunction1170); 

                	newLeafNode(otherlv_0, grammarAccess.getValueFunctionAccess().getValueFunctionKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:596:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:597:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:597:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:598:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueFunction1187); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleValueFunction1204); 

                	newLeafNode(otherlv_2, grammarAccess.getValueFunctionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:618:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:618:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleValueFunction1217); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueFunctionAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:622:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:623:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:623:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:624:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueFunction1234); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleValueFunction1253); 

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


    // $ANTLR start "entryRuleMechanism"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:652:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:653:2: (iv_ruleMechanism= ruleMechanism EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:654:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_ruleMechanism_in_entryRuleMechanism1289);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanism1299); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:661:1: ruleMechanism returns [EObject current=null] : (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+ ) ;
    public final EObject ruleMechanism() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token lv_processtype_5_0=null;
        EObject lv_Strategies_6_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:664:28: ( (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+ ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:665:1: (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+ )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:665:1: (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+ )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:665:3: otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleMechanism1336); 

                	newLeafNode(otherlv_0, grammarAccess.getMechanismAccess().getMechanismKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:669:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:670:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:670:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:671:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechanism1353); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:687:2: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:687:4: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleMechanism1371); 

                        	newLeafNode(otherlv_2, grammarAccess.getMechanismAccess().getDescriptionKeyword_2_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:691:1: ( (lv_description_3_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:692:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:692:1: (lv_description_3_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:693:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanism1388); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getMechanismAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMechanismRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:709:4: (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:709:6: otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) )
            {
            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleMechanism1408); 

                	newLeafNode(otherlv_4, grammarAccess.getMechanismAccess().getProcessTypeKeyword_3_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:713:1: ( (lv_processtype_5_0= RULE_STRING ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:714:1: (lv_processtype_5_0= RULE_STRING )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:714:1: (lv_processtype_5_0= RULE_STRING )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:715:3: lv_processtype_5_0= RULE_STRING
            {
            lv_processtype_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanism1425); 

            			newLeafNode(lv_processtype_5_0, grammarAccess.getMechanismAccess().getProcesstypeSTRINGTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMechanismRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"processtype",
                    		lv_processtype_5_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:3: ( (lv_Strategies_6_0= ruleStrategy ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:732:1: (lv_Strategies_6_0= ruleStrategy )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:732:1: (lv_Strategies_6_0= ruleStrategy )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:733:3: lv_Strategies_6_0= ruleStrategy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMechanismAccess().getStrategiesStrategyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStrategy_in_ruleMechanism1452);
            	    lv_Strategies_6_0=ruleStrategy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMechanismRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Strategies",
            	            		lv_Strategies_6_0, 
            	            		"Strategy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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


    // $ANTLR start "entryRuleStrategy"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:757:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:758:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:759:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_ruleStrategy_in_entryRuleStrategy1489);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategy1499); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:766:1: ruleStrategy returns [EObject current=null] : (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_10=null;
        EObject lv_WIAcceptanceRule_5_0 = null;

        EObject lv_WISelectionRule_6_0 = null;

        EObject lv_WIAssignmentRule_7_0 = null;

        EObject lv_ResourceAllocationRule_8_0 = null;

        EObject lv_ResourceOutsourcingRule_9_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:769:28: ( (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:770:1: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:770:1: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:770:3: otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleStrategy1536); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getStrategyKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:774:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:775:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:775:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:776:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategy1553); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleStrategy1570); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:796:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:796:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleStrategy1583); 

                        	newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:800:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:801:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:801:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:802:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStrategy1600); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getStrategyAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStrategyRule());
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:818:4: ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:819:1: (lv_WIAcceptanceRule_5_0= ruleWIAcceptance )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:819:1: (lv_WIAcceptanceRule_5_0= ruleWIAcceptance )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:820:3: lv_WIAcceptanceRule_5_0= ruleWIAcceptance
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getWIAcceptanceRuleWIAcceptanceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleWIAcceptance_in_ruleStrategy1628);
            lv_WIAcceptanceRule_5_0=ruleWIAcceptance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"WIAcceptanceRule",
                    		lv_WIAcceptanceRule_5_0, 
                    		"WIAcceptance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:836:2: ( (lv_WISelectionRule_6_0= ruleWISelection ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:837:1: (lv_WISelectionRule_6_0= ruleWISelection )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:837:1: (lv_WISelectionRule_6_0= ruleWISelection )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:838:3: lv_WISelectionRule_6_0= ruleWISelection
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getWISelectionRuleWISelectionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleWISelection_in_ruleStrategy1649);
            lv_WISelectionRule_6_0=ruleWISelection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"WISelectionRule",
                    		lv_WISelectionRule_6_0, 
                    		"WISelection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:854:2: ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:855:1: (lv_WIAssignmentRule_7_0= ruleWIAssignment )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:855:1: (lv_WIAssignmentRule_7_0= ruleWIAssignment )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:856:3: lv_WIAssignmentRule_7_0= ruleWIAssignment
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getWIAssignmentRuleWIAssignmentParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleWIAssignment_in_ruleStrategy1670);
            lv_WIAssignmentRule_7_0=ruleWIAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"WIAssignmentRule",
                    		lv_WIAssignmentRule_7_0, 
                    		"WIAssignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:872:2: ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:873:1: (lv_ResourceAllocationRule_8_0= ruleResourceAllocation )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:873:1: (lv_ResourceAllocationRule_8_0= ruleResourceAllocation )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:874:3: lv_ResourceAllocationRule_8_0= ruleResourceAllocation
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getResourceAllocationRuleResourceAllocationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceAllocation_in_ruleStrategy1691);
            lv_ResourceAllocationRule_8_0=ruleResourceAllocation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"ResourceAllocationRule",
                    		lv_ResourceAllocationRule_8_0, 
                    		"ResourceAllocation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:890:2: ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:891:1: (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:891:1: (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:892:3: lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getResourceOutsourcingRuleResourceOutsourcingParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleStrategy1712);
            lv_ResourceOutsourcingRule_9_0=ruleResourceOutsourcing();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"ResourceOutsourcingRule",
                    		lv_ResourceOutsourcingRule_9_0, 
                    		"ResourceOutsourcing");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,41,FOLLOW_41_in_ruleStrategy1724); 

                	newLeafNode(otherlv_10, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleWIAcceptance"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:920:1: entryRuleWIAcceptance returns [EObject current=null] : iv_ruleWIAcceptance= ruleWIAcceptance EOF ;
    public final EObject entryRuleWIAcceptance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAcceptance = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:921:2: (iv_ruleWIAcceptance= ruleWIAcceptance EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:922:2: iv_ruleWIAcceptance= ruleWIAcceptance EOF
            {
             newCompositeNode(grammarAccess.getWIAcceptanceRule()); 
            pushFollow(FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance1760);
            iv_ruleWIAcceptance=ruleWIAcceptance();

            state._fsp--;

             current =iv_ruleWIAcceptance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptance1770); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:929:1: ruleWIAcceptance returns [EObject current=null] : (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleWIAcceptance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:932:28: ( (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:933:1: (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:933:1: (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:933:3: otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleWIAcceptance1807); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceAccess().getWIAcceptanceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:937:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:938:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:938:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:939:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptance1824); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWIAcceptanceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAcceptanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWIAcceptance1841); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:959:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:959:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleWIAcceptance1854); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:963:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:964:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:964:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:965:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptance1871); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:981:4: (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:981:6: otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleWIAcceptance1891); 

                        	newLeafNode(otherlv_5, grammarAccess.getWIAcceptanceAccess().getBackLogLimitKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:985:1: ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:986:1: (lv_backlogQLimit_6_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:986:1: (lv_backlogQLimit_6_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:987:3: lv_backlogQLimit_6_0= RULE_INT
                    {
                    lv_backlogQLimit_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance1908); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1003:4: (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1003:6: otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleWIAcceptance1928); 

                        	newLeafNode(otherlv_7, grammarAccess.getWIAcceptanceAccess().getWIPLimitKeyword_5_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1007:1: ( (lv_readyQLimit_8_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1008:1: (lv_readyQLimit_8_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1008:1: (lv_readyQLimit_8_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1009:3: lv_readyQLimit_8_0= RULE_INT
                    {
                    lv_readyQLimit_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance1945); 

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

            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleWIAcceptance1964); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1037:1: entryRuleWISelection returns [EObject current=null] : iv_ruleWISelection= ruleWISelection EOF ;
    public final EObject entryRuleWISelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWISelection = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1038:2: (iv_ruleWISelection= ruleWISelection EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1039:2: iv_ruleWISelection= ruleWISelection EOF
            {
             newCompositeNode(grammarAccess.getWISelectionRule()); 
            pushFollow(FOLLOW_ruleWISelection_in_entryRuleWISelection2000);
            iv_ruleWISelection=ruleWISelection();

            state._fsp--;

             current =iv_ruleWISelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelection2010); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1046:1: ruleWISelection returns [EObject current=null] : (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleWISelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1049:28: ( (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:1: (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:1: (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:3: otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleWISelection2047); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionAccess().getWISelectionKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1054:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1055:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1055:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1056:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelection2064); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWISelectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWISelectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWISelection2081); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1076:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1076:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleWISelection2094); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1080:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1081:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1081:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1082:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelection2111); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleWISelection2130); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1110:1: entryRuleWIAssignment returns [EObject current=null] : iv_ruleWIAssignment= ruleWIAssignment EOF ;
    public final EObject entryRuleWIAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAssignment = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1111:2: (iv_ruleWIAssignment= ruleWIAssignment EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1112:2: iv_ruleWIAssignment= ruleWIAssignment EOF
            {
             newCompositeNode(grammarAccess.getWIAssignmentRule()); 
            pushFollow(FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment2166);
            iv_ruleWIAssignment=ruleWIAssignment();

            state._fsp--;

             current =iv_ruleWIAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignment2176); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1119:1: ruleWIAssignment returns [EObject current=null] : (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleWIAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1122:28: ( (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1123:1: (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1123:1: (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1123:3: otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleWIAssignment2213); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentAccess().getWIAssignmentKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1127:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1128:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1128:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1129:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignment2230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWIAssignmentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWIAssignment2247); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1149:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1149:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleWIAssignment2260); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1153:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1154:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1154:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1155:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignment2277); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleWIAssignment2296); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1183:1: entryRuleResourceAllocation returns [EObject current=null] : iv_ruleResourceAllocation= ruleResourceAllocation EOF ;
    public final EObject entryRuleResourceAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAllocation = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1184:2: (iv_ruleResourceAllocation= ruleResourceAllocation EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1185:2: iv_ruleResourceAllocation= ruleResourceAllocation EOF
            {
             newCompositeNode(grammarAccess.getResourceAllocationRule()); 
            pushFollow(FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation2332);
            iv_ruleResourceAllocation=ruleResourceAllocation();

            state._fsp--;

             current =iv_ruleResourceAllocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocation2342); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1192:1: ruleResourceAllocation returns [EObject current=null] : (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleResourceAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1195:28: ( (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1196:1: (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1196:1: (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1196:3: otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleResourceAllocation2379); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationAccess().getResourceAllocationKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1200:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1201:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1201:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1202:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocation2396); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAllocationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceAllocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleResourceAllocation2413); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1222:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1222:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleResourceAllocation2426); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1226:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1227:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1227:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1228:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocation2443); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleResourceAllocation2462); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1256:1: entryRuleResourceOutsourcing returns [EObject current=null] : iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF ;
    public final EObject entryRuleResourceOutsourcing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOutsourcing = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1257:2: (iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1258:2: iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF
            {
             newCompositeNode(grammarAccess.getResourceOutsourcingRule()); 
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing2498);
            iv_ruleResourceOutsourcing=ruleResourceOutsourcing();

            state._fsp--;

             current =iv_ruleResourceOutsourcing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcing2508); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1265:1: ruleResourceOutsourcing returns [EObject current=null] : (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleResourceOutsourcing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1268:28: ( (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1269:1: (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1269:1: (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1269:3: otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleResourceOutsourcing2545); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingAccess().getResourceOutsourcingKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1273:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1274:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1274:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1275:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcing2562); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceOutsourcingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceOutsourcingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleResourceOutsourcing2579); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1295:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1295:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleResourceOutsourcing2592); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1299:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1300:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1300:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1301:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcing2609); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleResourceOutsourcing2628); 

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


    // $ANTLR start "entryRuleWorkSource"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1329:1: entryRuleWorkSource returns [EObject current=null] : iv_ruleWorkSource= ruleWorkSource EOF ;
    public final EObject entryRuleWorkSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSource = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1330:2: (iv_ruleWorkSource= ruleWorkSource EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1331:2: iv_ruleWorkSource= ruleWorkSource EOF
            {
             newCompositeNode(grammarAccess.getWorkSourceRule()); 
            pushFollow(FOLLOW_ruleWorkSource_in_entryRuleWorkSource2664);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSource2674); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1338:1: ruleWorkSource returns [EObject current=null] : (otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) ;
    public final EObject ruleWorkSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_assignmentRule_9_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1341:28: ( (otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1342:1: (otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1342:1: (otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1342:3: otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleWorkSource2711); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1346:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1347:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1347:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1348:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource2728); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkSourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkSourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWorkSource2745); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1368:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1368:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleWorkSource2758); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1372:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1373:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1373:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1374:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkSource2775); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWorkSourceAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkSourceRule());
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1390:4: (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1390:6: otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleWorkSource2795); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkSourceAccess().getTargetUnitsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleWorkSource2807); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1398:1: ( (otherlv_7= RULE_ID ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1399:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1399:1: (otherlv_7= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1400:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource2827); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getTargetUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleWorkSource2840); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1415:3: ( (lv_assignmentRule_9_0= ruleWIAssignment ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1416:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1416:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1417:3: lv_assignmentRule_9_0= ruleWIAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkSourceAccess().getAssignmentRuleWIAssignmentParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleWorkSource2863);
                    lv_assignmentRule_9_0=ruleWIAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"assignmentRule",
                            		lv_assignmentRule_9_0, 
                            		"WIAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,41,FOLLOW_41_in_ruleWorkSource2876); 

                	newLeafNode(otherlv_10, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleWorkItem"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1445:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1446:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1447:2: iv_ruleWorkItem= ruleWorkItem EOF
            {
             newCompositeNode(grammarAccess.getWorkItemRule()); 
            pushFollow(FOLLOW_ruleWorkItem_in_entryRuleWorkItem2912);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItem2922); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1454:1: ruleWorkItem returns [EObject current=null] : (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Pattern' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'causality' ( (lv_causalTriggers_18_0= ruleCausality ) )* )? (otherlv_19= 'serviceType' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'baseEfforts' ( (lv_befforts_22_0= RULE_INT ) ) )? (otherlv_23= 'baseValue' ( (lv_bvalue_24_0= RULE_INT ) ) )? (otherlv_25= 'localValues' ( (lv_lvalue_26_0= ruleLocalValue ) ) )? (otherlv_27= 'classOfService' ( (lv_COS_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'arrivalTime' ( (lv_arrtime_32_0= RULE_INT ) ) )? (otherlv_33= 'dueDate' ( (lv_duedate_34_0= RULE_INT ) ) )? otherlv_35= '}' ) ;
    public final EObject ruleWorkItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
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
        Token lv_befforts_22_0=null;
        Token otherlv_23=null;
        Token lv_bvalue_24_0=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token lv_COS_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token lv_arrtime_32_0=null;
        Token otherlv_33=null;
        Token lv_duedate_34_0=null;
        Token otherlv_35=null;
        EObject lv_causalTriggers_18_0 = null;

        EObject lv_lvalue_26_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1457:28: ( (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Pattern' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'causality' ( (lv_causalTriggers_18_0= ruleCausality ) )* )? (otherlv_19= 'serviceType' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'baseEfforts' ( (lv_befforts_22_0= RULE_INT ) ) )? (otherlv_23= 'baseValue' ( (lv_bvalue_24_0= RULE_INT ) ) )? (otherlv_25= 'localValues' ( (lv_lvalue_26_0= ruleLocalValue ) ) )? (otherlv_27= 'classOfService' ( (lv_COS_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'arrivalTime' ( (lv_arrtime_32_0= RULE_INT ) ) )? (otherlv_33= 'dueDate' ( (lv_duedate_34_0= RULE_INT ) ) )? otherlv_35= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1458:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Pattern' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'causality' ( (lv_causalTriggers_18_0= ruleCausality ) )* )? (otherlv_19= 'serviceType' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'baseEfforts' ( (lv_befforts_22_0= RULE_INT ) ) )? (otherlv_23= 'baseValue' ( (lv_bvalue_24_0= RULE_INT ) ) )? (otherlv_25= 'localValues' ( (lv_lvalue_26_0= ruleLocalValue ) ) )? (otherlv_27= 'classOfService' ( (lv_COS_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'arrivalTime' ( (lv_arrtime_32_0= RULE_INT ) ) )? (otherlv_33= 'dueDate' ( (lv_duedate_34_0= RULE_INT ) ) )? otherlv_35= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1458:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Pattern' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'causality' ( (lv_causalTriggers_18_0= ruleCausality ) )* )? (otherlv_19= 'serviceType' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'baseEfforts' ( (lv_befforts_22_0= RULE_INT ) ) )? (otherlv_23= 'baseValue' ( (lv_bvalue_24_0= RULE_INT ) ) )? (otherlv_25= 'localValues' ( (lv_lvalue_26_0= ruleLocalValue ) ) )? (otherlv_27= 'classOfService' ( (lv_COS_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'arrivalTime' ( (lv_arrtime_32_0= RULE_INT ) ) )? (otherlv_33= 'dueDate' ( (lv_duedate_34_0= RULE_INT ) ) )? otherlv_35= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1458:3: otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Pattern' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'causality' ( (lv_causalTriggers_18_0= ruleCausality ) )* )? (otherlv_19= 'serviceType' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'baseEfforts' ( (lv_befforts_22_0= RULE_INT ) ) )? (otherlv_23= 'baseValue' ( (lv_bvalue_24_0= RULE_INT ) ) )? (otherlv_25= 'localValues' ( (lv_lvalue_26_0= ruleLocalValue ) ) )? (otherlv_27= 'classOfService' ( (lv_COS_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'arrivalTime' ( (lv_arrtime_32_0= RULE_INT ) ) )? (otherlv_33= 'dueDate' ( (lv_duedate_34_0= RULE_INT ) ) )? otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleWorkItem2959); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemAccess().getWorkItemKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1462:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1463:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1463:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1464:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem2976); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkItemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleWorkItem2993); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1484:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1484:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleWorkItem3006); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1488:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1489:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1489:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1490:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItem3023); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWorkItemAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1506:4: (otherlv_5= 'Pattern' ( (otherlv_6= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1506:6: otherlv_5= 'Pattern' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleWorkItem3043); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemAccess().getPatternKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1510:1: ( (otherlv_6= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1511:1: (otherlv_6= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1511:1: (otherlv_6= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1512:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem3063); 

                    		newLeafNode(otherlv_6, grammarAccess.getWorkItemAccess().getPatternTaskPatternCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1523:4: (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==58) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1523:6: otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_58_in_ruleWorkItem3078); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkItemAccess().getTypeKeyword_5_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1527:1: ( (otherlv_8= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1528:1: (otherlv_8= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1528:1: (otherlv_8= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1529:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem3098); 

                    		newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getPatternTypeTaskTypeCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1540:4: (otherlv_9= 'predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==59) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1540:6: otherlv_9= 'predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,59,FOLLOW_59_in_ruleWorkItem3113); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getPredecessorsKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleWorkItem3125); 

                        	newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1548:1: ( (otherlv_11= RULE_ID ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1549:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1549:1: (otherlv_11= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1550:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem3145); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_6_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    otherlv_12=(Token)match(input,41,FOLLOW_41_in_ruleWorkItem3158); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1565:3: (otherlv_13= 'subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1565:5: otherlv_13= 'subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,60,FOLLOW_60_in_ruleWorkItem3173); 

                        	newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getSubtasksKeyword_7_0());
                        
                    otherlv_14=(Token)match(input,38,FOLLOW_38_in_ruleWorkItem3185); 

                        	newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1573:1: ( (otherlv_15= RULE_ID ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1574:1: (otherlv_15= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1574:1: (otherlv_15= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1575:3: otherlv_15= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem3205); 

                    	    		newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_7_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    otherlv_16=(Token)match(input,41,FOLLOW_41_in_ruleWorkItem3218); 

                        	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1590:3: (otherlv_17= 'causality' ( (lv_causalTriggers_18_0= ruleCausality ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==61) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1590:5: otherlv_17= 'causality' ( (lv_causalTriggers_18_0= ruleCausality ) )*
                    {
                    otherlv_17=(Token)match(input,61,FOLLOW_61_in_ruleWorkItem3233); 

                        	newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getCausalityKeyword_8_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1594:1: ( (lv_causalTriggers_18_0= ruleCausality ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=70 && LA39_0<=71)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1595:1: (lv_causalTriggers_18_0= ruleCausality )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1595:1: (lv_causalTriggers_18_0= ruleCausality )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1596:3: lv_causalTriggers_18_0= ruleCausality
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getCausalTriggersCausalityParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausality_in_ruleWorkItem3254);
                    	    lv_causalTriggers_18_0=ruleCausality();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"causalTriggers",
                    	            		lv_causalTriggers_18_0, 
                    	            		"Causality");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1612:5: (otherlv_19= 'serviceType' ( (otherlv_20= RULE_ID ) )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==62) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1612:7: otherlv_19= 'serviceType' ( (otherlv_20= RULE_ID ) )+
                    {
                    otherlv_19=(Token)match(input,62,FOLLOW_62_in_ruleWorkItem3270); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getServiceTypeKeyword_9_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1616:1: ( (otherlv_20= RULE_ID ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1617:1: (otherlv_20= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1617:1: (otherlv_20= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1618:3: otherlv_20= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem3290); 

                    	    		newLeafNode(otherlv_20, grammarAccess.getWorkItemAccess().getReqSpecialtiesServiceTypeCrossReference_9_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1629:5: (otherlv_21= 'baseEfforts' ( (lv_befforts_22_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==63) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1629:7: otherlv_21= 'baseEfforts' ( (lv_befforts_22_0= RULE_INT ) )
                    {
                    otherlv_21=(Token)match(input,63,FOLLOW_63_in_ruleWorkItem3306); 

                        	newLeafNode(otherlv_21, grammarAccess.getWorkItemAccess().getBaseEffortsKeyword_10_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1633:1: ( (lv_befforts_22_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1634:1: (lv_befforts_22_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1634:1: (lv_befforts_22_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1635:3: lv_befforts_22_0= RULE_INT
                    {
                    lv_befforts_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem3323); 

                    			newLeafNode(lv_befforts_22_0, grammarAccess.getWorkItemAccess().getBeffortsINTTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"befforts",
                            		lv_befforts_22_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1651:4: (otherlv_23= 'baseValue' ( (lv_bvalue_24_0= RULE_INT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==64) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1651:6: otherlv_23= 'baseValue' ( (lv_bvalue_24_0= RULE_INT ) )
                    {
                    otherlv_23=(Token)match(input,64,FOLLOW_64_in_ruleWorkItem3343); 

                        	newLeafNode(otherlv_23, grammarAccess.getWorkItemAccess().getBaseValueKeyword_11_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1655:1: ( (lv_bvalue_24_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1656:1: (lv_bvalue_24_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1656:1: (lv_bvalue_24_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1657:3: lv_bvalue_24_0= RULE_INT
                    {
                    lv_bvalue_24_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem3360); 

                    			newLeafNode(lv_bvalue_24_0, grammarAccess.getWorkItemAccess().getBvalueINTTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bvalue",
                            		lv_bvalue_24_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1673:4: (otherlv_25= 'localValues' ( (lv_lvalue_26_0= ruleLocalValue ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==65) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1673:6: otherlv_25= 'localValues' ( (lv_lvalue_26_0= ruleLocalValue ) )
                    {
                    otherlv_25=(Token)match(input,65,FOLLOW_65_in_ruleWorkItem3380); 

                        	newLeafNode(otherlv_25, grammarAccess.getWorkItemAccess().getLocalValuesKeyword_12_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1677:1: ( (lv_lvalue_26_0= ruleLocalValue ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1678:1: (lv_lvalue_26_0= ruleLocalValue )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1678:1: (lv_lvalue_26_0= ruleLocalValue )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1679:3: lv_lvalue_26_0= ruleLocalValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getLvalueLocalValueParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLocalValue_in_ruleWorkItem3401);
                    lv_lvalue_26_0=ruleLocalValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"lvalue",
                            		lv_lvalue_26_0, 
                            		"LocalValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1695:4: (otherlv_27= 'classOfService' ( (lv_COS_28_0= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==66) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1695:6: otherlv_27= 'classOfService' ( (lv_COS_28_0= RULE_ID ) )
                    {
                    otherlv_27=(Token)match(input,66,FOLLOW_66_in_ruleWorkItem3416); 

                        	newLeafNode(otherlv_27, grammarAccess.getWorkItemAccess().getClassOfServiceKeyword_13_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1699:1: ( (lv_COS_28_0= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1700:1: (lv_COS_28_0= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1700:1: (lv_COS_28_0= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1701:3: lv_COS_28_0= RULE_ID
                    {
                    lv_COS_28_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem3433); 

                    			newLeafNode(lv_COS_28_0, grammarAccess.getWorkItemAccess().getCOSIDTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"COS",
                            		lv_COS_28_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1717:4: (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==67) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1717:6: otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) )
                    {
                    otherlv_29=(Token)match(input,67,FOLLOW_67_in_ruleWorkItem3453); 

                        	newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getWorkSourceKeyword_14_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1721:1: ( (otherlv_30= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1722:1: (otherlv_30= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1722:1: (otherlv_30= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1723:3: otherlv_30= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem3473); 

                    		newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getWItemSourceWorkSourceCrossReference_14_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1734:4: (otherlv_31= 'arrivalTime' ( (lv_arrtime_32_0= RULE_INT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==68) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1734:6: otherlv_31= 'arrivalTime' ( (lv_arrtime_32_0= RULE_INT ) )
                    {
                    otherlv_31=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem3488); 

                        	newLeafNode(otherlv_31, grammarAccess.getWorkItemAccess().getArrivalTimeKeyword_15_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1738:1: ( (lv_arrtime_32_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1739:1: (lv_arrtime_32_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1739:1: (lv_arrtime_32_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1740:3: lv_arrtime_32_0= RULE_INT
                    {
                    lv_arrtime_32_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem3505); 

                    			newLeafNode(lv_arrtime_32_0, grammarAccess.getWorkItemAccess().getArrtimeINTTerminalRuleCall_15_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arrtime",
                            		lv_arrtime_32_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1756:4: (otherlv_33= 'dueDate' ( (lv_duedate_34_0= RULE_INT ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==69) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1756:6: otherlv_33= 'dueDate' ( (lv_duedate_34_0= RULE_INT ) )
                    {
                    otherlv_33=(Token)match(input,69,FOLLOW_69_in_ruleWorkItem3525); 

                        	newLeafNode(otherlv_33, grammarAccess.getWorkItemAccess().getDueDateKeyword_16_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1760:1: ( (lv_duedate_34_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1761:1: (lv_duedate_34_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1761:1: (lv_duedate_34_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1762:3: lv_duedate_34_0= RULE_INT
                    {
                    lv_duedate_34_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem3542); 

                    			newLeafNode(lv_duedate_34_0, grammarAccess.getWorkItemAccess().getDuedateINTTerminalRuleCall_16_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duedate",
                            		lv_duedate_34_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_35=(Token)match(input,41,FOLLOW_41_in_ruleWorkItem3561); 

                	newLeafNode(otherlv_35, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_17());
                

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


    // $ANTLR start "entryRuleCausality"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1790:1: entryRuleCausality returns [EObject current=null] : iv_ruleCausality= ruleCausality EOF ;
    public final EObject entryRuleCausality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCausality = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1791:2: (iv_ruleCausality= ruleCausality EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1792:2: iv_ruleCausality= ruleCausality EOF
            {
             newCompositeNode(grammarAccess.getCausalityRule()); 
            pushFollow(FOLLOW_ruleCausality_in_entryRuleCausality3597);
            iv_ruleCausality=ruleCausality();

            state._fsp--;

             current =iv_ruleCausality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCausality3607); 

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
    // $ANTLR end "entryRuleCausality"


    // $ANTLR start "ruleCausality"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1799:1: ruleCausality returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleCausality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_tProgress_6_0=null;
        Token otherlv_7=null;
        Token lv_tProbability_8_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1802:28: ( ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )? ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1803:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )? )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1803:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )? )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1803:2: (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )?
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1803:2: (otherlv_0= '=>' | otherlv_1= '->' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==70) ) {
                alt50=1;
            }
            else if ( (LA50_0==71) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1803:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleCausality3645); 

                        	newLeafNode(otherlv_0, grammarAccess.getCausalityAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1808:7: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleCausality3663); 

                        	newLeafNode(otherlv_1, grammarAccess.getCausalityAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleCausality3676); 

                	newLeafNode(otherlv_2, grammarAccess.getCausalityAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1816:1: ( (otherlv_3= RULE_ID ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1817:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1817:1: (otherlv_3= RULE_ID )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1818:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCausalityRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCausality3696); 

            	    		newLeafNode(otherlv_3, grammarAccess.getCausalityAccess().getTriggeredWorkItemCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleCausality3709); 

                	newLeafNode(otherlv_4, grammarAccess.getCausalityAccess().getRightCurlyBracketKeyword_3());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1833:1: (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==72) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1833:3: otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleCausality3722); 

                        	newLeafNode(otherlv_5, grammarAccess.getCausalityAccess().getAtProgressKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1837:1: ( (lv_tProgress_6_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1838:1: (lv_tProgress_6_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1838:1: (lv_tProgress_6_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1839:3: lv_tProgress_6_0= RULE_INT
                    {
                    lv_tProgress_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausality3739); 

                    			newLeafNode(lv_tProgress_6_0, grammarAccess.getCausalityAccess().getTProgressINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCausalityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tProgress",
                            		lv_tProgress_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1855:4: (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==73) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1855:6: otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,73,FOLLOW_73_in_ruleCausality3759); 

                        	newLeafNode(otherlv_7, grammarAccess.getCausalityAccess().getOnProbabilityKeyword_5_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1859:1: ( (lv_tProbability_8_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1860:1: (lv_tProbability_8_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1860:1: (lv_tProbability_8_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1861:3: lv_tProbability_8_0= RULE_INT
                    {
                    lv_tProbability_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausality3776); 

                    			newLeafNode(lv_tProbability_8_0, grammarAccess.getCausalityAccess().getTProbabilityINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCausalityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tProbability",
                            		lv_tProbability_8_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleCausality"


    // $ANTLR start "entryRuleLocalValue"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1885:1: entryRuleLocalValue returns [EObject current=null] : iv_ruleLocalValue= ruleLocalValue EOF ;
    public final EObject entryRuleLocalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalValue = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1886:2: (iv_ruleLocalValue= ruleLocalValue EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1887:2: iv_ruleLocalValue= ruleLocalValue EOF
            {
             newCompositeNode(grammarAccess.getLocalValueRule()); 
            pushFollow(FOLLOW_ruleLocalValue_in_entryRuleLocalValue3819);
            iv_ruleLocalValue=ruleLocalValue();

            state._fsp--;

             current =iv_ruleLocalValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalValue3829); 

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
    // $ANTLR end "entryRuleLocalValue"


    // $ANTLR start "ruleLocalValue"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1894:1: ruleLocalValue returns [EObject current=null] : ( (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleLocalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1897:28: ( ( (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1898:1: ( (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1898:1: ( (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1898:2: (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1898:2: (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1898:4: otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleLocalValue3867); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalValueAccess().getOwnerKeyword_0_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1902:1: ( (otherlv_1= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1903:1: (otherlv_1= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1903:1: (otherlv_1= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1904:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalValueRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalValue3887); 

            		newLeafNode(otherlv_1, grammarAccess.getLocalValueAccess().getOwnerServiceProviderCrossReference_0_1_0()); 
            	

            }


            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1915:3: (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1915:5: otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,75,FOLLOW_75_in_ruleLocalValue3901); 

                	newLeafNode(otherlv_2, grammarAccess.getLocalValueAccess().getValueKeyword_1_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1919:1: ( (lv_value_3_0= RULE_INT ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1920:1: (lv_value_3_0= RULE_INT )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1920:1: (lv_value_3_0= RULE_INT )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1921:3: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLocalValue3918); 

            			newLeafNode(lv_value_3_0, grammarAccess.getLocalValueAccess().getValueINTTerminalRuleCall_1_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"INT");
            	    

            }


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
    // $ANTLR end "ruleLocalValue"


    // $ANTLR start "entryRuleServiceType"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1945:1: entryRuleServiceType returns [EObject current=null] : iv_ruleServiceType= ruleServiceType EOF ;
    public final EObject entryRuleServiceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceType = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1946:2: (iv_ruleServiceType= ruleServiceType EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1947:2: iv_ruleServiceType= ruleServiceType EOF
            {
             newCompositeNode(grammarAccess.getServiceTypeRule()); 
            pushFollow(FOLLOW_ruleServiceType_in_entryRuleServiceType3960);
            iv_ruleServiceType=ruleServiceType();

            state._fsp--;

             current =iv_ruleServiceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceType3970); 

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
    // $ANTLR end "entryRuleServiceType"


    // $ANTLR start "ruleServiceType"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1954:1: ruleServiceType returns [EObject current=null] : (otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) ;
    public final EObject ruleServiceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1957:28: ( (otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1958:1: (otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1958:1: (otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1958:3: otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleServiceType4007); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceTypeAccess().getServiceTypeKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1962:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1963:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1963:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1964:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceType4024); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1980:2: (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==38) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1980:4: otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleServiceType4042); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceTypeAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1984:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==39) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1984:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleServiceType4055); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceTypeAccess().getDescriptionKeyword_2_1_0());
                                
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1988:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1989:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1989:1: (lv_description_4_0= RULE_STRING )
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1990:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceType4072); 

                            			newLeafNode(lv_description_4_0, grammarAccess.getServiceTypeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceTypeRule());
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

                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleServiceType4091); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceTypeAccess().getRightCurlyBracketKeyword_2_2());
                        

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
    // $ANTLR end "ruleServiceType"


    // $ANTLR start "entryRuleService"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2018:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2019:2: (iv_ruleService= ruleService EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2020:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService4129);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService4139); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2027:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )? ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_efficiency_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2030:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )? ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2031:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )? )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2031:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )? )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2031:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleService4176); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2035:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2036:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2036:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2037:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService4193); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2053:2: (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==38) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2053:4: otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleService4211); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2057:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==39) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2057:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleService4224); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDescriptionKeyword_2_1_0());
                                
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2061:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2062:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2062:1: (lv_description_4_0= RULE_STRING )
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2063:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService4241); 

                            			newLeafNode(lv_description_4_0, grammarAccess.getServiceAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
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

                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2079:4: (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2079:6: otherlv_5= 'type' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,77,FOLLOW_77_in_ruleService4261); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getTypeKeyword_2_2_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2083:1: ( (otherlv_6= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2084:1: (otherlv_6= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2084:1: (otherlv_6= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2085:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService4281); 

                    		newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getServiceTypeServiceTypeCrossReference_2_2_1_0()); 
                    	

                    }


                    }


                    }

                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2096:3: (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==78) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2096:5: otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) )
                            {
                            otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleService4295); 

                                	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getEfficiencyKeyword_2_3_0());
                                
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2100:1: ( (lv_efficiency_8_0= RULE_INT ) )
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2101:1: (lv_efficiency_8_0= RULE_INT )
                            {
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2101:1: (lv_efficiency_8_0= RULE_INT )
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2102:3: lv_efficiency_8_0= RULE_INT
                            {
                            lv_efficiency_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleService4312); 

                            			newLeafNode(lv_efficiency_8_0, grammarAccess.getServiceAccess().getEfficiencyINTTerminalRuleCall_2_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"efficiency",
                                    		lv_efficiency_8_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleService4331); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_2_4());
                        

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2130:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2131:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2132:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider4369);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProvider4379); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2139:1: ruleServiceProvider returns [EObject current=null] : ( (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject ruleServiceProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        EObject lv_services_20_0 = null;

        EObject lv_acceptanceRule_28_0 = null;

        EObject lv_selectionRule_29_0 = null;

        EObject lv_assignmentRule_30_0 = null;

        EObject lv_allocationRule_31_0 = null;

        EObject lv_outsourcingRule_32_0 = null;

        EObject lv_resources_37_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2142:28: ( ( (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2143:1: ( (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2143:1: ( (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2143:2: (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2143:2: (otherlv_0= 'serviceProvider' | otherlv_1= 'group' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==79) ) {
                alt59=1;
            }
            else if ( (LA59_0==80) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2143:4: otherlv_0= 'serviceProvider'
                    {
                    otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleServiceProvider4417); 

                        	newLeafNode(otherlv_0, grammarAccess.getServiceProviderAccess().getServiceProviderKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2148:7: otherlv_1= 'group'
                    {
                    otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleServiceProvider4435); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getGroupKeyword_0_1());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2152:2: ( (lv_name_2_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2153:1: (lv_name_2_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2153:1: (lv_name_2_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2154:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider4453); 

            			newLeafNode(lv_name_2_0, grammarAccess.getServiceProviderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceProviderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider4470); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2174:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==39) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2174:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleServiceProvider4483); 

                        	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2178:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2179:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2179:1: (lv_description_5_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2180:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceProvider4500); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getServiceProviderAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2196:4: (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==81) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2196:6: otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,81,FOLLOW_81_in_ruleServiceProvider4520); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getSourceUnitsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider4532); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2204:1: ( (otherlv_8= RULE_ID ) )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2205:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2205:1: (otherlv_8= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2206:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider4552); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getSourceUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleServiceProvider4565); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2221:3: (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==55) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2221:5: otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleServiceProvider4580); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getTargetUnitsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider4592); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2229:1: ( (otherlv_12= RULE_ID ) )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_ID) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2230:1: (otherlv_12= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2230:1: (otherlv_12= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2231:3: otherlv_12= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider4612); 

                    	    		newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getTargetUnitsServiceProviderCrossReference_5_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt63 >= 1 ) break loop63;
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);

                    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleServiceProvider4625); 

                        	newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2246:3: (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==82) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2246:5: otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,82,FOLLOW_82_in_ruleServiceProvider4640); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getSubordinateUnitsKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider4652); 

                        	newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2254:1: ( (otherlv_16= RULE_ID ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_ID) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2255:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2255:1: (otherlv_16= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2256:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider4672); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getSubordinateUnitsServiceProviderCrossReference_6_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    otherlv_17=(Token)match(input,41,FOLLOW_41_in_ruleServiceProvider4685); 

                        	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2271:3: (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==83) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2271:5: otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,83,FOLLOW_83_in_ruleServiceProvider4700); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getServicesKeyword_7_0());
                        
                    otherlv_19=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider4712); 

                        	newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2279:1: ( (lv_services_20_0= ruleService ) )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==76) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2280:1: (lv_services_20_0= ruleService )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2280:1: (lv_services_20_0= ruleService )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2281:3: lv_services_20_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getServicesServiceParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleServiceProvider4733);
                    	    lv_services_20_0=ruleService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"services",
                    	            		lv_services_20_0, 
                    	            		"Service");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    otherlv_21=(Token)match(input,41,FOLLOW_41_in_ruleServiceProvider4746); 

                        	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2301:3: (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==84) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2301:5: otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}'
                    {
                    otherlv_22=(Token)match(input,84,FOLLOW_84_in_ruleServiceProvider4761); 

                        	newLeafNode(otherlv_22, grammarAccess.getServiceProviderAccess().getGovernanceSearchStrategyKeyword_8_0());
                        
                    otherlv_23=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider4773); 

                        	newLeafNode(otherlv_23, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    otherlv_24=(Token)match(input,85,FOLLOW_85_in_ruleServiceProvider4785); 

                        	newLeafNode(otherlv_24, grammarAccess.getServiceProviderAccess().getDefaultKeyword_8_2());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2313:1: ( (otherlv_25= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2314:1: (otherlv_25= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2314:1: (otherlv_25= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2315:3: otherlv_25= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider4805); 

                    		newLeafNode(otherlv_25, grammarAccess.getServiceProviderAccess().getDefaultStrategyStrategyCrossReference_8_3_0()); 
                    	

                    }


                    }

                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2326:2: (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==86) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2326:4: otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}'
                            {
                            otherlv_26=(Token)match(input,86,FOLLOW_86_in_ruleServiceProvider4818); 

                                	newLeafNode(otherlv_26, grammarAccess.getServiceProviderAccess().getSpecifiedKeyword_8_4_0());
                                
                            otherlv_27=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider4830); 

                                	newLeafNode(otherlv_27, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_8_4_1());
                                
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2334:1: ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )?
                            int alt69=2;
                            int LA69_0 = input.LA(1);

                            if ( (LA69_0==47) ) {
                                alt69=1;
                            }
                            switch (alt69) {
                                case 1 :
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2335:1: (lv_acceptanceRule_28_0= ruleWIAcceptance )
                                    {
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2335:1: (lv_acceptanceRule_28_0= ruleWIAcceptance )
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2336:3: lv_acceptanceRule_28_0= ruleWIAcceptance
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAcceptanceRuleWIAcceptanceParserRuleCall_8_4_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWIAcceptance_in_ruleServiceProvider4851);
                                    lv_acceptanceRule_28_0=ruleWIAcceptance();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"acceptanceRule",
                                            		lv_acceptanceRule_28_0, 
                                            		"WIAcceptance");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2352:3: ( (lv_selectionRule_29_0= ruleWISelection ) )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==50) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2353:1: (lv_selectionRule_29_0= ruleWISelection )
                                    {
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2353:1: (lv_selectionRule_29_0= ruleWISelection )
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2354:3: lv_selectionRule_29_0= ruleWISelection
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getSelectionRuleWISelectionParserRuleCall_8_4_3_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWISelection_in_ruleServiceProvider4873);
                                    lv_selectionRule_29_0=ruleWISelection();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"selectionRule",
                                            		lv_selectionRule_29_0, 
                                            		"WISelection");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2370:3: ( (lv_assignmentRule_30_0= ruleWIAssignment ) )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==51) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2371:1: (lv_assignmentRule_30_0= ruleWIAssignment )
                                    {
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2371:1: (lv_assignmentRule_30_0= ruleWIAssignment )
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2372:3: lv_assignmentRule_30_0= ruleWIAssignment
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAssignmentRuleWIAssignmentParserRuleCall_8_4_4_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleServiceProvider4895);
                                    lv_assignmentRule_30_0=ruleWIAssignment();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"assignmentRule",
                                            		lv_assignmentRule_30_0, 
                                            		"WIAssignment");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2388:3: ( (lv_allocationRule_31_0= ruleResourceAllocation ) )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==52) ) {
                                alt72=1;
                            }
                            switch (alt72) {
                                case 1 :
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2389:1: (lv_allocationRule_31_0= ruleResourceAllocation )
                                    {
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2389:1: (lv_allocationRule_31_0= ruleResourceAllocation )
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2390:3: lv_allocationRule_31_0= ruleResourceAllocation
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAllocationRuleResourceAllocationParserRuleCall_8_4_5_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleResourceAllocation_in_ruleServiceProvider4917);
                                    lv_allocationRule_31_0=ruleResourceAllocation();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"allocationRule",
                                            		lv_allocationRule_31_0, 
                                            		"ResourceAllocation");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2406:3: ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==53) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2407:1: (lv_outsourcingRule_32_0= ruleResourceOutsourcing )
                                    {
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2407:1: (lv_outsourcingRule_32_0= ruleResourceOutsourcing )
                                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2408:3: lv_outsourcingRule_32_0= ruleResourceOutsourcing
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getOutsourcingRuleResourceOutsourcingParserRuleCall_8_4_6_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleServiceProvider4939);
                                    lv_outsourcingRule_32_0=ruleResourceOutsourcing();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"outsourcingRule",
                                            		lv_outsourcingRule_32_0, 
                                            		"ResourceOutsourcing");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            otherlv_33=(Token)match(input,41,FOLLOW_41_in_ruleServiceProvider4952); 

                                	newLeafNode(otherlv_33, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_8_4_7());
                                

                            }
                            break;

                    }

                    otherlv_34=(Token)match(input,41,FOLLOW_41_in_ruleServiceProvider4966); 

                        	newLeafNode(otherlv_34, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_8_5());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2432:3: (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==87) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2432:5: otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}'
                    {
                    otherlv_35=(Token)match(input,87,FOLLOW_87_in_ruleServiceProvider4981); 

                        	newLeafNode(otherlv_35, grammarAccess.getServiceProviderAccess().getResourcesKeyword_9_0());
                        
                    otherlv_36=(Token)match(input,38,FOLLOW_38_in_ruleServiceProvider4993); 

                        	newLeafNode(otherlv_36, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2440:1: ( (lv_resources_37_0= ruleResource ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==88) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2441:1: (lv_resources_37_0= ruleResource )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2441:1: (lv_resources_37_0= ruleResource )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2442:3: lv_resources_37_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesResourceParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResource_in_ruleServiceProvider5014);
                    	    lv_resources_37_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_37_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    otherlv_38=(Token)match(input,41,FOLLOW_41_in_ruleServiceProvider5027); 

                        	newLeafNode(otherlv_38, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,41,FOLLOW_41_in_ruleServiceProvider5041); 

                	newLeafNode(otherlv_39, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleResource"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2474:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2475:2: (iv_ruleResource= ruleResource EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2476:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource5077);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource5087); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2483:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
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
        EObject lv_services_7_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2486:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2487:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2487:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2487:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleResource5124); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2491:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2492:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2492:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2493:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource5141); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleResource5158); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2513:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==39) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2513:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleResource5171); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2517:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2518:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2518:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2519:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource5188); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getResourceAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceRule());
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2535:4: (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==83) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2535:6: otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,83,FOLLOW_83_in_ruleResource5208); 

                        	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getServicesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleResource5220); 

                        	newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2543:1: ( (lv_services_7_0= ruleService ) )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==76) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2544:1: (lv_services_7_0= ruleService )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2544:1: (lv_services_7_0= ruleService )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2545:3: lv_services_7_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceAccess().getServicesServiceParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleResource5241);
                    	    lv_services_7_0=ruleService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"services",
                    	            		lv_services_7_0, 
                    	            		"Service");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt79 >= 1 ) break loop79;
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
                    } while (true);

                    otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleResource5254); 

                        	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleResource5268); 

                	newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleSkill"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2579:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2580:2: (iv_ruleSkill= ruleSkill EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2581:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_ruleSkill_in_entryRuleSkill5306);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkill5316); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2588:1: ruleSkill returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )? ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2591:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )? ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2592:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )? )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2592:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )? )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2592:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )?
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2592:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2593:1: (lv_name_0_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2593:1: (lv_name_0_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2594:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkill5358); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0_0()); 
            		

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2610:2: (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==38) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2610:4: otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleSkill5376); 

                        	newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2614:1: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==39) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2614:3: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleSkill5389); 

                                	newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getDescriptionKeyword_1_1_0());
                                
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2618:1: ( (lv_description_3_0= RULE_STRING ) )
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2619:1: (lv_description_3_0= RULE_STRING )
                            {
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2619:1: (lv_description_3_0= RULE_STRING )
                            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2620:3: lv_description_3_0= RULE_STRING
                            {
                            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSkill5406); 

                            			newLeafNode(lv_description_3_0, grammarAccess.getSkillAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSkillRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_3_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleSkill5425); 

                        	newLeafNode(otherlv_4, grammarAccess.getSkillAccess().getRightCurlyBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleSkill"


    // $ANTLR start "entryRuleCapability"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2650:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2651:2: (iv_ruleCapability= ruleCapability EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2652:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_ruleCapability_in_entryRuleCapability5465);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCapability5475); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2659:1: ruleCapability returns [EObject current=null] : (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_6=null;
        EObject lv_reqs_5_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2662:28: ( (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2663:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2663:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2663:3: otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleCapability5512); 

                	newLeafNode(otherlv_0, grammarAccess.getCapabilityAccess().getCapabilityKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2667:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2668:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2668:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2669:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCapability5529); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleCapability5546); 

                	newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2689:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==39) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2689:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleCapability5559); 

                        	newLeafNode(otherlv_3, grammarAccess.getCapabilityAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2693:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2694:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2694:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2695:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCapability5576); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getCapabilityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCapabilityRule());
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2711:4: ( (lv_reqs_5_0= ruleRequirement ) )+
            int cnt84=0;
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==90) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2712:1: (lv_reqs_5_0= ruleRequirement )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2712:1: (lv_reqs_5_0= ruleRequirement )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2713:3: lv_reqs_5_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleCapability5604);
            	    lv_reqs_5_0=ruleRequirement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCapabilityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"reqs",
            	            		lv_reqs_5_0, 
            	            		"Requirement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt84 >= 1 ) break loop84;
                        EarlyExitException eee =
                            new EarlyExitException(84, input);
                        throw eee;
                }
                cnt84++;
            } while (true);

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleCapability5617); 

                	newLeafNode(otherlv_6, grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleRequirement"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2741:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2742:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2743:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement5653);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement5663); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2750:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_dependencies_10_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2753:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2754:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2754:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2754:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_90_in_ruleRequirement5700); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2758:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2759:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2759:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2760:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement5717); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleRequirement5734); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2780:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==39) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2780:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleRequirement5747); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getDescriptionKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2784:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2785:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2785:1: (lv_description_4_0= RULE_STRING )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2786:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirement5764); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getRequirementAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRule());
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2802:4: (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2802:6: otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
            {
            otherlv_5=(Token)match(input,91,FOLLOW_91_in_ruleRequirement5784); 

                	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getWorkItemsKeyword_4_0());
                
            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleRequirement5796); 

                	newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_4_1());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2810:1: ( (otherlv_7= RULE_ID ) )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_ID) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2811:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2811:1: (otherlv_7= RULE_ID )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2812:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement5816); 

            	    		newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getRTasksWorkItemCrossReference_4_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);

            otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleRequirement5829); 

                	newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4_3());
                

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2827:2: (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==92) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2827:4: otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )*
                    {
                    otherlv_9=(Token)match(input,92,FOLLOW_92_in_ruleRequirement5843); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_5_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2831:1: ( (lv_dependencies_10_0= ruleCausality ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( ((LA87_0>=70 && LA87_0<=71)) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2832:1: (lv_dependencies_10_0= ruleCausality )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2832:1: (lv_dependencies_10_0= ruleCausality )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2833:3: lv_dependencies_10_0= ruleCausality
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesCausalityParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausality_in_ruleRequirement5864);
                    	    lv_dependencies_10_0=ruleCausality();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dependencies",
                    	            		lv_dependencies_10_0, 
                    	            		"Causality");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleRequirement5879); 

                	newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleProvision"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2863:1: entryRuleProvision returns [EObject current=null] : iv_ruleProvision= ruleProvision EOF ;
    public final EObject entryRuleProvision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvision = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2864:2: (iv_ruleProvision= ruleProvision EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2865:2: iv_ruleProvision= ruleProvision EOF
            {
             newCompositeNode(grammarAccess.getProvisionRule()); 
            pushFollow(FOLLOW_ruleProvision_in_entryRuleProvision5917);
            iv_ruleProvision=ruleProvision();

            state._fsp--;

             current =iv_ruleProvision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvision5927); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2872:1: ruleProvision returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2875:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2876:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2876:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2876:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleProvision5964); 

                	newLeafNode(otherlv_0, grammarAccess.getProvisionAccess().getLeftParenthesisKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2880:1: ( (otherlv_1= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2881:1: (otherlv_1= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2881:1: (otherlv_1= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2882:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProvisionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision5984); 

            		newLeafNode(otherlv_1, grammarAccess.getProvisionAccess().getServiceNameServiceTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,94,FOLLOW_94_in_ruleProvision5996); 

                	newLeafNode(otherlv_2, grammarAccess.getProvisionAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleProvision6008); 

                	newLeafNode(otherlv_3, grammarAccess.getProvisionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2901:1: ( (otherlv_4= RULE_ID ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==RULE_ID) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2902:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2902:1: (otherlv_4= RULE_ID )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2903:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProvisionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision6028); 

            	    		newLeafNode(otherlv_4, grammarAccess.getProvisionAccess().getProvidersServiceProviderCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleProvision6041); 

                	newLeafNode(otherlv_5, grammarAccess.getProvisionAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,95,FOLLOW_95_in_ruleProvision6053); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2930:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2931:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2932:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine6089);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine6099); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2939:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2942:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2943:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2943:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2943:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )*
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2943:2: ()
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2944:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2949:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==96) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2949:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleStatemachine6146); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2953:1: ( (lv_events_2_0= ruleEvent ) )+
                    int cnt90=0;
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==RULE_ID) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2954:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2954:1: (lv_events_2_0= ruleEvent )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2955:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine6167);
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
                    	    if ( cnt90 >= 1 ) break loop90;
                                EarlyExitException eee =
                                    new EarlyExitException(90, input);
                                throw eee;
                        }
                        cnt90++;
                    } while (true);

                    otherlv_3=(Token)match(input,97,FOLLOW_97_in_ruleStatemachine6180); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2975:3: (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==98) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2975:5: otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,98,FOLLOW_98_in_ruleStatemachine6195); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getActivitiesKeyword_2_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2979:1: ( (lv_commands_5_0= ruleCommand ) )+
                    int cnt92=0;
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==RULE_ID) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2980:1: (lv_commands_5_0= ruleCommand )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2980:1: (lv_commands_5_0= ruleCommand )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2981:3: lv_commands_5_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleStatemachine6216);
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
                    	    if ( cnt92 >= 1 ) break loop92;
                                EarlyExitException eee =
                                    new EarlyExitException(92, input);
                                throw eee;
                        }
                        cnt92++;
                    } while (true);

                    otherlv_6=(Token)match(input,97,FOLLOW_97_in_ruleStatemachine6229); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3001:3: ( (lv_states_7_0= ruleState ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==99) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3002:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3002:1: (lv_states_7_0= ruleState )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3003:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine6252);
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
            	    break loop94;
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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3027:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3028:2: (iv_ruleEvent= ruleEvent EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3029:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent6289);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent6299); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3036:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3039:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3040:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3040:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3040:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3040:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3041:1: (lv_name_0_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3041:1: (lv_name_0_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3042:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent6341); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3058:2: ( (lv_code_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3059:1: (lv_code_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3059:1: (lv_code_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3060:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent6363); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3084:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3085:2: (iv_ruleCommand= ruleCommand EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3086:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand6404);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand6414); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3093:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3096:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3097:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3097:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3097:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3097:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3098:1: (lv_name_0_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3098:1: (lv_name_0_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3099:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand6456); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3115:2: ( (lv_code_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3116:1: (lv_code_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3116:1: (lv_code_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3117:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand6478); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3141:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3142:2: (iv_ruleState= ruleState EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3143:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState6519);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState6529); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3150:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3153:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3154:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3154:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3154:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleState6566); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3158:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3159:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3159:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3160:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState6583); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3176:2: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==100) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3176:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,100,FOLLOW_100_in_ruleState6601); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleState6613); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3184:1: ( (otherlv_4= RULE_ID ) )+
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
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3185:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3185:1: (otherlv_4= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3186:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState6633); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0()); 
                    	    	

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

                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleState6646); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3201:3: ( (lv_transitions_6_0= ruleTransition ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==RULE_ID) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3202:1: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3202:1: (lv_transitions_6_0= ruleTransition )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3203:3: lv_transitions_6_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState6669);
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
            	    break loop97;
                }
            } while (true);

            otherlv_7=(Token)match(input,97,FOLLOW_97_in_ruleState6682); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3231:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3232:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3233:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition6718);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition6728); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3240:1: ruleTransition returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3243:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==70) ) {
                    alt99=1;
                }
                else if ( (LA99_1==101) ) {
                    alt99=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:3: ( (otherlv_0= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3245:1: (otherlv_0= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3245:1: (otherlv_0= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3246:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition6774); 

                    		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleTransition6786); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3261:1: ( (otherlv_2= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3262:1: (otherlv_2= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3262:1: (otherlv_2= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3263:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition6806); 

                    		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3275:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3275:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3275:7: ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3275:7: ( (otherlv_3= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3276:1: (otherlv_3= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3276:1: (otherlv_3= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3277:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition6834); 

                    		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,101,FOLLOW_101_in_ruleTransition6846); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSolidusKeyword_1_1());
                        
                    otherlv_5=(Token)match(input,102,FOLLOW_102_in_ruleTransition6858); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3296:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt98=0;
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==RULE_ID) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3297:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3297:1: (otherlv_6= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3298:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition6878); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getEventactionsCommandCrossReference_1_3_0()); 
                    	    	

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

                    otherlv_7=(Token)match(input,103,FOLLOW_103_in_ruleTransition6891); 

                        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_4());
                        
                    otherlv_8=(Token)match(input,70,FOLLOW_70_in_ruleTransition6903); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_5());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3317:1: ( (otherlv_9= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3318:1: (otherlv_9= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3318:1: (otherlv_9= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3319:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition6923); 

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
    public static final BitSet FOLLOW_12_in_ruleKanbanSchedulingSystem156 = new BitSet(new long[]{0x00001000000AA000L});
    public static final BitSet FOLLOW_ruleMechanism_in_ruleKanbanSchedulingSystem177 = new BitSet(new long[]{0x00000000000AA000L});
    public static final BitSet FOLLOW_13_in_ruleKanbanSchedulingSystem191 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleStrategy_in_ruleKanbanSchedulingSystem212 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_14_in_ruleKanbanSchedulingSystem225 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_15_in_ruleKanbanSchedulingSystem240 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleTaskPattern_in_ruleKanbanSchedulingSystem261 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_ruleTaskType_in_ruleKanbanSchedulingSystem283 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_16_in_ruleKanbanSchedulingSystem296 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleKanbanSchedulingSystem311 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleValueFunction_in_ruleKanbanSchedulingSystem332 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_18_in_ruleKanbanSchedulingSystem345 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKanbanSchedulingSystem359 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleKanbanSchedulingSystem371 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleKanbanSchedulingSystem383 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleServiceType_in_ruleKanbanSchedulingSystem404 = new BitSet(new long[]{0x4000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleKanbanSchedulingSystem417 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleKanbanSchedulingSystem429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_ruleKanbanSchedulingSystem450 = new BitSet(new long[]{0x0000000001000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_24_in_ruleKanbanSchedulingSystem463 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleKanbanSchedulingSystem475 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleKanbanSchedulingSystem487 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleKanbanSchedulingSystem499 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleWorkSource_in_ruleKanbanSchedulingSystem520 = new BitSet(new long[]{0x0040000010000000L});
    public static final BitSet FOLLOW_28_in_ruleKanbanSchedulingSystem533 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleKanbanSchedulingSystem545 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleWorkItem_in_ruleKanbanSchedulingSystem566 = new BitSet(new long[]{0x0100000040000000L});
    public static final BitSet FOLLOW_30_in_ruleKanbanSchedulingSystem579 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleKanbanSchedulingSystem591 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleKanbanSchedulingSystem603 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleKanbanSchedulingSystem615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem632 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleKanbanSchedulingSystem649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem666 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleKanbanSchedulingSystem683 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleKanbanSchedulingSystem695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskPattern_in_entryRuleTaskPattern731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskPattern741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTaskPattern778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskPattern795 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTaskPattern812 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_39_in_ruleTaskPattern825 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskPattern842 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_ruleTaskPattern862 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTaskPattern874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskPattern894 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleTaskPattern907 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleTaskPattern921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskType_in_entryRuleTaskType957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskType967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTaskType1004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskType1021 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTaskType1038 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleTaskType1051 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskType1068 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleTaskType1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueFunction_in_entryRuleValueFunction1123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueFunction1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleValueFunction1170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueFunction1187 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleValueFunction1204 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleValueFunction1217 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueFunction1234 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleValueFunction1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanism_in_entryRuleMechanism1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanism1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMechanism1336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechanism1353 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_39_in_ruleMechanism1371 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanism1388 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleMechanism1408 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanism1425 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleStrategy_in_ruleMechanism1452 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy1489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategy1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleStrategy1536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategy1553 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleStrategy1570 = new BitSet(new long[]{0x0000808000000000L});
    public static final BitSet FOLLOW_39_in_ruleStrategy1583 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStrategy1600 = new BitSet(new long[]{0x0000808000000000L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleStrategy1628 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleStrategy1649 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleStrategy1670 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleStrategy1691 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleStrategy1712 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleStrategy1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance1760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptance1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleWIAcceptance1807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptance1824 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWIAcceptance1841 = new BitSet(new long[]{0x0003028000000000L});
    public static final BitSet FOLLOW_39_in_ruleWIAcceptance1854 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptance1871 = new BitSet(new long[]{0x0003020000000000L});
    public static final BitSet FOLLOW_48_in_ruleWIAcceptance1891 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance1908 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_49_in_ruleWIAcceptance1928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance1945 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleWIAcceptance1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelection_in_entryRuleWISelection2000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelection2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleWISelection2047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelection2064 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWISelection2081 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleWISelection2094 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelection2111 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleWISelection2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignment2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleWIAssignment2213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignment2230 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWIAssignment2247 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleWIAssignment2260 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignment2277 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleWIAssignment2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation2332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocation2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleResourceAllocation2379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocation2396 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleResourceAllocation2413 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleResourceAllocation2426 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocation2443 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleResourceAllocation2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing2498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcing2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleResourceOutsourcing2545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcing2562 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleResourceOutsourcing2579 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleResourceOutsourcing2592 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcing2609 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleResourceOutsourcing2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSource_in_entryRuleWorkSource2664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSource2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleWorkSource2711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource2728 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkSource2745 = new BitSet(new long[]{0x0088028000000000L});
    public static final BitSet FOLLOW_39_in_ruleWorkSource2758 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkSource2775 = new BitSet(new long[]{0x0088020000000000L});
    public static final BitSet FOLLOW_55_in_ruleWorkSource2795 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkSource2807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource2827 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleWorkSource2840 = new BitSet(new long[]{0x0008020000000000L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleWorkSource2863 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleWorkSource2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItem_in_entryRuleWorkItem2912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItem2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleWorkItem2959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem2976 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItem2993 = new BitSet(new long[]{0xFE00028000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_39_in_ruleWorkItem3006 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItem3023 = new BitSet(new long[]{0xFE00020000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_57_in_ruleWorkItem3043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem3063 = new BitSet(new long[]{0xFC00020000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_58_in_ruleWorkItem3078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem3098 = new BitSet(new long[]{0xF800020000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_59_in_ruleWorkItem3113 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItem3125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem3145 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleWorkItem3158 = new BitSet(new long[]{0xF000020000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_60_in_ruleWorkItem3173 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleWorkItem3185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem3205 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleWorkItem3218 = new BitSet(new long[]{0xE000020000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_61_in_ruleWorkItem3233 = new BitSet(new long[]{0xC000020000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleCausality_in_ruleWorkItem3254 = new BitSet(new long[]{0xC000020000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_62_in_ruleWorkItem3270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem3290 = new BitSet(new long[]{0x8000020000000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_63_in_ruleWorkItem3306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem3323 = new BitSet(new long[]{0x0000020000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_64_in_ruleWorkItem3343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem3360 = new BitSet(new long[]{0x0000020000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_65_in_ruleWorkItem3380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleLocalValue_in_ruleWorkItem3401 = new BitSet(new long[]{0x0000020000000000L,0x000000000000003CL});
    public static final BitSet FOLLOW_66_in_ruleWorkItem3416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem3433 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleWorkItem3453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem3473 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem3488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem3505 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleWorkItem3525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem3542 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleWorkItem3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCausality_in_entryRuleCausality3597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCausality3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCausality3645 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_71_in_ruleCausality3663 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCausality3676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCausality3696 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleCausality3709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleCausality3722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausality3739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleCausality3759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausality3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalValue_in_entryRuleLocalValue3819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalValue3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleLocalValue3867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalValue3887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleLocalValue3901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLocalValue3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceType_in_entryRuleServiceType3960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceType3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleServiceType4007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceType4024 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleServiceType4042 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleServiceType4055 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceType4072 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleServiceType4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService4129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleService4176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService4193 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleService4211 = new BitSet(new long[]{0x0000008000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_39_in_ruleService4224 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService4241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleService4261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService4281 = new BitSet(new long[]{0x0000020000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleService4295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleService4312 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleService4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider4369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProvider4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleServiceProvider4417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_80_in_ruleServiceProvider4435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider4453 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider4470 = new BitSet(new long[]{0x0080028000000000L,0x00000000009E0000L});
    public static final BitSet FOLLOW_39_in_ruleServiceProvider4483 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceProvider4500 = new BitSet(new long[]{0x0080020000000000L,0x00000000009E0000L});
    public static final BitSet FOLLOW_81_in_ruleServiceProvider4520 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider4532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider4552 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleServiceProvider4565 = new BitSet(new long[]{0x0080020000000000L,0x00000000009C0000L});
    public static final BitSet FOLLOW_55_in_ruleServiceProvider4580 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider4592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider4612 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleServiceProvider4625 = new BitSet(new long[]{0x0000020000000000L,0x00000000009C0000L});
    public static final BitSet FOLLOW_82_in_ruleServiceProvider4640 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider4652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider4672 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleServiceProvider4685 = new BitSet(new long[]{0x0000020000000000L,0x0000000000980000L});
    public static final BitSet FOLLOW_83_in_ruleServiceProvider4700 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider4712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleService_in_ruleServiceProvider4733 = new BitSet(new long[]{0x0000020000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_41_in_ruleServiceProvider4746 = new BitSet(new long[]{0x0000020000000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_84_in_ruleServiceProvider4761 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider4773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleServiceProvider4785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider4805 = new BitSet(new long[]{0x0000020000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleServiceProvider4818 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider4830 = new BitSet(new long[]{0x003C828000000000L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleServiceProvider4851 = new BitSet(new long[]{0x003C020000000000L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleServiceProvider4873 = new BitSet(new long[]{0x0038020000000000L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleServiceProvider4895 = new BitSet(new long[]{0x0030020000000000L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleServiceProvider4917 = new BitSet(new long[]{0x0020020000000000L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleServiceProvider4939 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleServiceProvider4952 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleServiceProvider4966 = new BitSet(new long[]{0x0000020000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleServiceProvider4981 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleServiceProvider4993 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleResource_in_ruleServiceProvider5014 = new BitSet(new long[]{0x0000020000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_41_in_ruleServiceProvider5027 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleServiceProvider5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource5077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleResource5124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource5141 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleResource5158 = new BitSet(new long[]{0x0000028000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_39_in_ruleResource5171 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource5188 = new BitSet(new long[]{0x0000020000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleResource5208 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleResource5220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleService_in_ruleResource5241 = new BitSet(new long[]{0x0000020000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_41_in_ruleResource5254 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleResource5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_entryRuleSkill5306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkill5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkill5358 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleSkill5376 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleSkill5389 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSkill5406 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSkill5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability5465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCapability5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleCapability5512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCapability5529 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCapability5546 = new BitSet(new long[]{0x0000008000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_39_in_ruleCapability5559 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCapability5576 = new BitSet(new long[]{0x0000008000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleCapability5604 = new BitSet(new long[]{0x0000028000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_41_in_ruleCapability5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement5653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRequirement5700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement5717 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRequirement5734 = new BitSet(new long[]{0x0000008000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_39_in_ruleRequirement5747 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement5764 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleRequirement5784 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRequirement5796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement5816 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleRequirement5829 = new BitSet(new long[]{0x0000020000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRequirement5843 = new BitSet(new long[]{0x0000020000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleCausality_in_ruleRequirement5864 = new BitSet(new long[]{0x0000020000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_41_in_ruleRequirement5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvision_in_entryRuleProvision5917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvision5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleProvision5964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision5984 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleProvision5996 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleProvision6008 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision6028 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleProvision6041 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleProvision6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine6089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleStatemachine6146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine6167 = new BitSet(new long[]{0x0000000000000010L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleStatemachine6180 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_98_in_ruleStatemachine6195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatemachine6216 = new BitSet(new long[]{0x0000000000000010L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleStatemachine6229 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine6252 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent6289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent6341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand6404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand6456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState6519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleState6566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState6583 = new BitSet(new long[]{0x0000000000000010L,0x0000001200000000L});
    public static final BitSet FOLLOW_100_in_ruleState6601 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleState6613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState6633 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleState6646 = new BitSet(new long[]{0x0000000000000010L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState6669 = new BitSet(new long[]{0x0000000000000010L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleState6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition6718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition6774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleTransition6786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition6806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition6834 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleTransition6846 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleTransition6858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition6878 = new BitSet(new long[]{0x0000000000000010L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleTransition6891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleTransition6903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition6923 = new BitSet(new long[]{0x0000000000000002L});

}