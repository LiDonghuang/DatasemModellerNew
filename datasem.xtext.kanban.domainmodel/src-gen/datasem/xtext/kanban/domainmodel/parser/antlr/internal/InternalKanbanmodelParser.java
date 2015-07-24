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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KSSModel'", "'Repositories'", "'end Repositories'", "'GovernanceModel'", "'GovernanceSearchStrategies'", "'end GovernanceSearchStrategies'", "'TaskPatterns'", "'end TaskPatterns'", "'ValueFunctions'", "'end ValueFunctions'", "'end GovernanceModel'", "'OrganizationalModel'", "'ServiceTypes'", "'end ServiceTypes'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkSources'", "'end WorkSources'", "'WorkItems'", "'end WorkItems'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'Replications'", "'InterArrivalTime'", "'end ExperimentSettings'", "'end KSSModel'", "'.'", "'Distribution:'", "'['", "']'", "'Repository'", "'Profiles'", "'{'", "'}'", "'end Repository'", "'workItem'", "'Description'", "'references'", "'decompositions'", "'serviceType'", "'baseEfforts'", "'baseValue'", "'classOfService'", "'quantity'", "'workflowTemplate'", "'Types'", "'taskType'", "'valueFunction'", "'Mechanism'", "'ProcessType'", "'Strategy'", "'WIAcceptance'", "'BackLogLimit'", "'WIPLimit'", "'WISelection'", "'WIAssignment'", "'ResourceAllocation'", "'ResourceOutsourcing'", "'workSource'", "'targetUnits'", "'Profile'", "'Pattern'", "'Type'", "'predecessors'", "'subtasks'", "'causality'", "'localValues'", "'WorkSource'", "'arrivalTime'", "'dueDate'", "'=>'", "'->'", "'atProgress'", "'onProbability'", "'owner'", "'value'", "'service'", "'type'", "'efficiency'", "'serviceProvider'", "'group'", "'sourceUnits'", "'subordinateUnits'", "'services'", "'governanceSearchStrategy'", "'default'", "'specified'", "'resources'", "'resource'", "'capability'", "'requirement'", "'workItems'", "'workItemNetwork'", "'('", "','", "')'", "'events'", "'end'", "'activities'", "'state'", "'actions'", "'/'"
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
    public static final int T__114=114;
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g"; }



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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:67:1: entryRuleKanbanSchedulingSystem returns [EObject current=null] : iv_ruleKanbanSchedulingSystem= ruleKanbanSchedulingSystem EOF ;
    public final EObject entryRuleKanbanSchedulingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKanbanSchedulingSystem = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:68:2: (iv_ruleKanbanSchedulingSystem= ruleKanbanSchedulingSystem EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:69:2: iv_ruleKanbanSchedulingSystem= ruleKanbanSchedulingSystem EOF
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:76:1: ruleKanbanSchedulingSystem returns [EObject current=null] : (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? (otherlv_3= 'Repositories' ( (lv_KSSRepositories_4_0= ruleRepository ) )+ otherlv_5= 'end Repositories' )? otherlv_6= 'GovernanceModel' ( (lv_Mechanisms_7_0= ruleMechanism ) )? (otherlv_8= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_9_0= ruleStrategy ) )+ otherlv_10= 'end GovernanceSearchStrategies' )? (otherlv_11= 'TaskPatterns' ( (lv_KSSTaskPatterns_12_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_13_0= ruleTaskType ) )+ otherlv_14= 'end TaskPatterns' )? (otherlv_15= 'ValueFunctions' ( (lv_KSSValueFunctions_16_0= ruleValueFunction ) )+ otherlv_17= 'end ValueFunctions' )? otherlv_18= 'end GovernanceModel' otherlv_19= 'OrganizationalModel' otherlv_20= 'ServiceTypes' ( (lv_SoSServices_21_0= ruleServiceType ) )+ otherlv_22= 'end ServiceTypes' otherlv_23= 'ServiceProviders' ( (lv_orgUnits_24_0= ruleServiceProvider ) )+ otherlv_25= 'end ServiceProviders' otherlv_26= 'end OrganizationalModel' otherlv_27= 'WorkItemNetworkModel' otherlv_28= 'WorkSources' ( (lv_kssSources_29_0= ruleWorkSource ) )+ otherlv_30= 'end WorkSources' otherlv_31= 'WorkItems' ( (lv_kssWItems_32_0= ruleWorkItem ) )+ otherlv_33= 'end WorkItems' otherlv_34= 'end WorkItemNetworkModel' otherlv_35= 'ExperimentSettings' otherlv_36= 'Replications' ( (lv_replications_37_0= RULE_INT ) ) otherlv_38= 'InterArrivalTime' ( (lv_interArrivalTime_39_0= RULE_INT ) ) otherlv_40= 'end ExperimentSettings' otherlv_41= 'end KSSModel' ) ;
    public final EObject ruleKanbanSchedulingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_replications_37_0=null;
        Token otherlv_38=null;
        Token lv_interArrivalTime_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_TestItems_2_0 = null;

        EObject lv_KSSRepositories_4_0 = null;

        EObject lv_Mechanisms_7_0 = null;

        EObject lv_KSSSearchStrategies_9_0 = null;

        EObject lv_KSSTaskPatterns_12_0 = null;

        EObject lv_KSStaskPatternTypes_13_0 = null;

        EObject lv_KSSValueFunctions_16_0 = null;

        EObject lv_SoSServices_21_0 = null;

        EObject lv_orgUnits_24_0 = null;

        EObject lv_kssSources_29_0 = null;

        EObject lv_kssWItems_32_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:79:28: ( (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? (otherlv_3= 'Repositories' ( (lv_KSSRepositories_4_0= ruleRepository ) )+ otherlv_5= 'end Repositories' )? otherlv_6= 'GovernanceModel' ( (lv_Mechanisms_7_0= ruleMechanism ) )? (otherlv_8= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_9_0= ruleStrategy ) )+ otherlv_10= 'end GovernanceSearchStrategies' )? (otherlv_11= 'TaskPatterns' ( (lv_KSSTaskPatterns_12_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_13_0= ruleTaskType ) )+ otherlv_14= 'end TaskPatterns' )? (otherlv_15= 'ValueFunctions' ( (lv_KSSValueFunctions_16_0= ruleValueFunction ) )+ otherlv_17= 'end ValueFunctions' )? otherlv_18= 'end GovernanceModel' otherlv_19= 'OrganizationalModel' otherlv_20= 'ServiceTypes' ( (lv_SoSServices_21_0= ruleServiceType ) )+ otherlv_22= 'end ServiceTypes' otherlv_23= 'ServiceProviders' ( (lv_orgUnits_24_0= ruleServiceProvider ) )+ otherlv_25= 'end ServiceProviders' otherlv_26= 'end OrganizationalModel' otherlv_27= 'WorkItemNetworkModel' otherlv_28= 'WorkSources' ( (lv_kssSources_29_0= ruleWorkSource ) )+ otherlv_30= 'end WorkSources' otherlv_31= 'WorkItems' ( (lv_kssWItems_32_0= ruleWorkItem ) )+ otherlv_33= 'end WorkItems' otherlv_34= 'end WorkItemNetworkModel' otherlv_35= 'ExperimentSettings' otherlv_36= 'Replications' ( (lv_replications_37_0= RULE_INT ) ) otherlv_38= 'InterArrivalTime' ( (lv_interArrivalTime_39_0= RULE_INT ) ) otherlv_40= 'end ExperimentSettings' otherlv_41= 'end KSSModel' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? (otherlv_3= 'Repositories' ( (lv_KSSRepositories_4_0= ruleRepository ) )+ otherlv_5= 'end Repositories' )? otherlv_6= 'GovernanceModel' ( (lv_Mechanisms_7_0= ruleMechanism ) )? (otherlv_8= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_9_0= ruleStrategy ) )+ otherlv_10= 'end GovernanceSearchStrategies' )? (otherlv_11= 'TaskPatterns' ( (lv_KSSTaskPatterns_12_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_13_0= ruleTaskType ) )+ otherlv_14= 'end TaskPatterns' )? (otherlv_15= 'ValueFunctions' ( (lv_KSSValueFunctions_16_0= ruleValueFunction ) )+ otherlv_17= 'end ValueFunctions' )? otherlv_18= 'end GovernanceModel' otherlv_19= 'OrganizationalModel' otherlv_20= 'ServiceTypes' ( (lv_SoSServices_21_0= ruleServiceType ) )+ otherlv_22= 'end ServiceTypes' otherlv_23= 'ServiceProviders' ( (lv_orgUnits_24_0= ruleServiceProvider ) )+ otherlv_25= 'end ServiceProviders' otherlv_26= 'end OrganizationalModel' otherlv_27= 'WorkItemNetworkModel' otherlv_28= 'WorkSources' ( (lv_kssSources_29_0= ruleWorkSource ) )+ otherlv_30= 'end WorkSources' otherlv_31= 'WorkItems' ( (lv_kssWItems_32_0= ruleWorkItem ) )+ otherlv_33= 'end WorkItems' otherlv_34= 'end WorkItemNetworkModel' otherlv_35= 'ExperimentSettings' otherlv_36= 'Replications' ( (lv_replications_37_0= RULE_INT ) ) otherlv_38= 'InterArrivalTime' ( (lv_interArrivalTime_39_0= RULE_INT ) ) otherlv_40= 'end ExperimentSettings' otherlv_41= 'end KSSModel' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? (otherlv_3= 'Repositories' ( (lv_KSSRepositories_4_0= ruleRepository ) )+ otherlv_5= 'end Repositories' )? otherlv_6= 'GovernanceModel' ( (lv_Mechanisms_7_0= ruleMechanism ) )? (otherlv_8= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_9_0= ruleStrategy ) )+ otherlv_10= 'end GovernanceSearchStrategies' )? (otherlv_11= 'TaskPatterns' ( (lv_KSSTaskPatterns_12_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_13_0= ruleTaskType ) )+ otherlv_14= 'end TaskPatterns' )? (otherlv_15= 'ValueFunctions' ( (lv_KSSValueFunctions_16_0= ruleValueFunction ) )+ otherlv_17= 'end ValueFunctions' )? otherlv_18= 'end GovernanceModel' otherlv_19= 'OrganizationalModel' otherlv_20= 'ServiceTypes' ( (lv_SoSServices_21_0= ruleServiceType ) )+ otherlv_22= 'end ServiceTypes' otherlv_23= 'ServiceProviders' ( (lv_orgUnits_24_0= ruleServiceProvider ) )+ otherlv_25= 'end ServiceProviders' otherlv_26= 'end OrganizationalModel' otherlv_27= 'WorkItemNetworkModel' otherlv_28= 'WorkSources' ( (lv_kssSources_29_0= ruleWorkSource ) )+ otherlv_30= 'end WorkSources' otherlv_31= 'WorkItems' ( (lv_kssWItems_32_0= ruleWorkItem ) )+ otherlv_33= 'end WorkItems' otherlv_34= 'end WorkItemNetworkModel' otherlv_35= 'ExperimentSettings' otherlv_36= 'Replications' ( (lv_replications_37_0= RULE_INT ) ) otherlv_38= 'InterArrivalTime' ( (lv_interArrivalTime_39_0= RULE_INT ) ) otherlv_40= 'end ExperimentSettings' otherlv_41= 'end KSSModel' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:3: otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? (otherlv_3= 'Repositories' ( (lv_KSSRepositories_4_0= ruleRepository ) )+ otherlv_5= 'end Repositories' )? otherlv_6= 'GovernanceModel' ( (lv_Mechanisms_7_0= ruleMechanism ) )? (otherlv_8= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_9_0= ruleStrategy ) )+ otherlv_10= 'end GovernanceSearchStrategies' )? (otherlv_11= 'TaskPatterns' ( (lv_KSSTaskPatterns_12_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_13_0= ruleTaskType ) )+ otherlv_14= 'end TaskPatterns' )? (otherlv_15= 'ValueFunctions' ( (lv_KSSValueFunctions_16_0= ruleValueFunction ) )+ otherlv_17= 'end ValueFunctions' )? otherlv_18= 'end GovernanceModel' otherlv_19= 'OrganizationalModel' otherlv_20= 'ServiceTypes' ( (lv_SoSServices_21_0= ruleServiceType ) )+ otherlv_22= 'end ServiceTypes' otherlv_23= 'ServiceProviders' ( (lv_orgUnits_24_0= ruleServiceProvider ) )+ otherlv_25= 'end ServiceProviders' otherlv_26= 'end OrganizationalModel' otherlv_27= 'WorkItemNetworkModel' otherlv_28= 'WorkSources' ( (lv_kssSources_29_0= ruleWorkSource ) )+ otherlv_30= 'end WorkSources' otherlv_31= 'WorkItems' ( (lv_kssWItems_32_0= ruleWorkItem ) )+ otherlv_33= 'end WorkItems' otherlv_34= 'end WorkItemNetworkModel' otherlv_35= 'ExperimentSettings' otherlv_36= 'Replications' ( (lv_replications_37_0= RULE_INT ) ) otherlv_38= 'InterArrivalTime' ( (lv_interArrivalTime_39_0= RULE_INT ) ) otherlv_40= 'end ExperimentSettings' otherlv_41= 'end KSSModel'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleKanbanSchedulingSystem122); 

                	newLeafNode(otherlv_0, grammarAccess.getKanbanSchedulingSystemAccess().getKSSModelKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:85:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:86:3: lv_name_1_0= RULE_ID
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:102:2: ( (lv_TestItems_2_0= ruleQualifiedName ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:103:1: (lv_TestItems_2_0= ruleQualifiedName )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:103:1: (lv_TestItems_2_0= ruleQualifiedName )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:104:3: lv_TestItems_2_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getTestItemsQualifiedNameParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleKanbanSchedulingSystem165);
                    lv_TestItems_2_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	        }
                           		add(
                           			current, 
                           			"TestItems",
                            		lv_TestItems_2_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:120:3: (otherlv_3= 'Repositories' ( (lv_KSSRepositories_4_0= ruleRepository ) )+ otherlv_5= 'end Repositories' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:120:5: otherlv_3= 'Repositories' ( (lv_KSSRepositories_4_0= ruleRepository ) )+ otherlv_5= 'end Repositories'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleKanbanSchedulingSystem179); 

                        	newLeafNode(otherlv_3, grammarAccess.getKanbanSchedulingSystemAccess().getRepositoriesKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:124:1: ( (lv_KSSRepositories_4_0= ruleRepository ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==43) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:125:1: (lv_KSSRepositories_4_0= ruleRepository )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:125:1: (lv_KSSRepositories_4_0= ruleRepository )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:126:3: lv_KSSRepositories_4_0= ruleRepository
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKSSRepositoriesRepositoryParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRepository_in_ruleKanbanSchedulingSystem200);
                    	    lv_KSSRepositories_4_0=ruleRepository();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"KSSRepositories",
                    	            		lv_KSSRepositories_4_0, 
                    	            		"Repository");
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

                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleKanbanSchedulingSystem213); 

                        	newLeafNode(otherlv_5, grammarAccess.getKanbanSchedulingSystemAccess().getEndRepositoriesKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleKanbanSchedulingSystem227); 

                	newLeafNode(otherlv_6, grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceModelKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:150:1: ( (lv_Mechanisms_7_0= ruleMechanism ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==61) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:151:1: (lv_Mechanisms_7_0= ruleMechanism )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:151:1: (lv_Mechanisms_7_0= ruleMechanism )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:152:3: lv_Mechanisms_7_0= ruleMechanism
                    {
                     
                    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getMechanismsMechanismParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMechanism_in_ruleKanbanSchedulingSystem248);
                    lv_Mechanisms_7_0=ruleMechanism();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	        }
                           		add(
                           			current, 
                           			"Mechanisms",
                            		lv_Mechanisms_7_0, 
                            		"Mechanism");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:168:3: (otherlv_8= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_9_0= ruleStrategy ) )+ otherlv_10= 'end GovernanceSearchStrategies' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:168:5: otherlv_8= 'GovernanceSearchStrategies' ( (lv_KSSSearchStrategies_9_0= ruleStrategy ) )+ otherlv_10= 'end GovernanceSearchStrategies'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleKanbanSchedulingSystem262); 

                        	newLeafNode(otherlv_8, grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceSearchStrategiesKeyword_6_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:172:1: ( (lv_KSSSearchStrategies_9_0= ruleStrategy ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==63) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:173:1: (lv_KSSSearchStrategies_9_0= ruleStrategy )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:173:1: (lv_KSSSearchStrategies_9_0= ruleStrategy )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:174:3: lv_KSSSearchStrategies_9_0= ruleStrategy
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKSSSearchStrategiesStrategyParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStrategy_in_ruleKanbanSchedulingSystem283);
                    	    lv_KSSSearchStrategies_9_0=ruleStrategy();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"KSSSearchStrategies",
                    	            		lv_KSSSearchStrategies_9_0, 
                    	            		"Strategy");
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

                        	newLeafNode(otherlv_10, grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceSearchStrategiesKeyword_6_2());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:194:3: (otherlv_11= 'TaskPatterns' ( (lv_KSSTaskPatterns_12_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_13_0= ruleTaskType ) )+ otherlv_14= 'end TaskPatterns' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:194:5: otherlv_11= 'TaskPatterns' ( (lv_KSSTaskPatterns_12_0= ruleTaskPattern ) )+ ( (lv_KSStaskPatternTypes_13_0= ruleTaskType ) )+ otherlv_14= 'end TaskPatterns'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleKanbanSchedulingSystem311); 

                        	newLeafNode(otherlv_11, grammarAccess.getKanbanSchedulingSystemAccess().getTaskPatternsKeyword_7_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:1: ( (lv_KSSTaskPatterns_12_0= ruleTaskPattern ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==57) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:199:1: (lv_KSSTaskPatterns_12_0= ruleTaskPattern )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:199:1: (lv_KSSTaskPatterns_12_0= ruleTaskPattern )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:200:3: lv_KSSTaskPatterns_12_0= ruleTaskPattern
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKSSTaskPatternsTaskPatternParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTaskPattern_in_ruleKanbanSchedulingSystem332);
                    	    lv_KSSTaskPatterns_12_0=ruleTaskPattern();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"KSSTaskPatterns",
                    	            		lv_KSSTaskPatterns_12_0, 
                    	            		"TaskPattern");
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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:216:3: ( (lv_KSStaskPatternTypes_13_0= ruleTaskType ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==59) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:217:1: (lv_KSStaskPatternTypes_13_0= ruleTaskType )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:217:1: (lv_KSStaskPatternTypes_13_0= ruleTaskType )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:218:3: lv_KSStaskPatternTypes_13_0= ruleTaskType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKSStaskPatternTypesTaskTypeParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTaskType_in_ruleKanbanSchedulingSystem354);
                    	    lv_KSStaskPatternTypes_13_0=ruleTaskType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"KSStaskPatternTypes",
                    	            		lv_KSStaskPatternTypes_13_0, 
                    	            		"TaskType");
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

                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleKanbanSchedulingSystem367); 

                        	newLeafNode(otherlv_14, grammarAccess.getKanbanSchedulingSystemAccess().getEndTaskPatternsKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:238:3: (otherlv_15= 'ValueFunctions' ( (lv_KSSValueFunctions_16_0= ruleValueFunction ) )+ otherlv_17= 'end ValueFunctions' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:238:5: otherlv_15= 'ValueFunctions' ( (lv_KSSValueFunctions_16_0= ruleValueFunction ) )+ otherlv_17= 'end ValueFunctions'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleKanbanSchedulingSystem382); 

                        	newLeafNode(otherlv_15, grammarAccess.getKanbanSchedulingSystemAccess().getValueFunctionsKeyword_8_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:242:1: ( (lv_KSSValueFunctions_16_0= ruleValueFunction ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==60) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:243:1: (lv_KSSValueFunctions_16_0= ruleValueFunction )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:243:1: (lv_KSSValueFunctions_16_0= ruleValueFunction )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:244:3: lv_KSSValueFunctions_16_0= ruleValueFunction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKSSValueFunctionsValueFunctionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValueFunction_in_ruleKanbanSchedulingSystem403);
                    	    lv_KSSValueFunctions_16_0=ruleValueFunction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"KSSValueFunctions",
                    	            		lv_KSSValueFunctions_16_0, 
                    	            		"ValueFunction");
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

                    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleKanbanSchedulingSystem416); 

                        	newLeafNode(otherlv_17, grammarAccess.getKanbanSchedulingSystemAccess().getEndValueFunctionsKeyword_8_2());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,21,FOLLOW_21_in_ruleKanbanSchedulingSystem430); 

                	newLeafNode(otherlv_18, grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceModelKeyword_9());
                
            otherlv_19=(Token)match(input,22,FOLLOW_22_in_ruleKanbanSchedulingSystem442); 

                	newLeafNode(otherlv_19, grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationalModelKeyword_10());
                
            otherlv_20=(Token)match(input,23,FOLLOW_23_in_ruleKanbanSchedulingSystem454); 

                	newLeafNode(otherlv_20, grammarAccess.getKanbanSchedulingSystemAccess().getServiceTypesKeyword_11());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:276:1: ( (lv_SoSServices_21_0= ruleServiceType ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==52) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:277:1: (lv_SoSServices_21_0= ruleServiceType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:277:1: (lv_SoSServices_21_0= ruleServiceType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:278:3: lv_SoSServices_21_0= ruleServiceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getSoSServicesServiceTypeParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceType_in_ruleKanbanSchedulingSystem475);
            	    lv_SoSServices_21_0=ruleServiceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"SoSServices",
            	            		lv_SoSServices_21_0, 
            	            		"ServiceType");
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

            otherlv_22=(Token)match(input,24,FOLLOW_24_in_ruleKanbanSchedulingSystem488); 

                	newLeafNode(otherlv_22, grammarAccess.getKanbanSchedulingSystemAccess().getEndServiceTypesKeyword_13());
                
            otherlv_23=(Token)match(input,25,FOLLOW_25_in_ruleKanbanSchedulingSystem500); 

                	newLeafNode(otherlv_23, grammarAccess.getKanbanSchedulingSystemAccess().getServiceProvidersKeyword_14());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:302:1: ( (lv_orgUnits_24_0= ruleServiceProvider ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=92 && LA13_0<=93)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:303:1: (lv_orgUnits_24_0= ruleServiceProvider )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:303:1: (lv_orgUnits_24_0= ruleServiceProvider )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:304:3: lv_orgUnits_24_0= ruleServiceProvider
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsServiceProviderParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceProvider_in_ruleKanbanSchedulingSystem521);
            	    lv_orgUnits_24_0=ruleServiceProvider();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"orgUnits",
            	            		lv_orgUnits_24_0, 
            	            		"ServiceProvider");
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

            otherlv_25=(Token)match(input,26,FOLLOW_26_in_ruleKanbanSchedulingSystem534); 

                	newLeafNode(otherlv_25, grammarAccess.getKanbanSchedulingSystemAccess().getEndServiceProvidersKeyword_16());
                
            otherlv_26=(Token)match(input,27,FOLLOW_27_in_ruleKanbanSchedulingSystem546); 

                	newLeafNode(otherlv_26, grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationalModelKeyword_17());
                
            otherlv_27=(Token)match(input,28,FOLLOW_28_in_ruleKanbanSchedulingSystem558); 

                	newLeafNode(otherlv_27, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemNetworkModelKeyword_18());
                
            otherlv_28=(Token)match(input,29,FOLLOW_29_in_ruleKanbanSchedulingSystem570); 

                	newLeafNode(otherlv_28, grammarAccess.getKanbanSchedulingSystemAccess().getWorkSourcesKeyword_19());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:336:1: ( (lv_kssSources_29_0= ruleWorkSource ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==71) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:337:1: (lv_kssSources_29_0= ruleWorkSource )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:337:1: (lv_kssSources_29_0= ruleWorkSource )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:338:3: lv_kssSources_29_0= ruleWorkSource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKssSourcesWorkSourceParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkSource_in_ruleKanbanSchedulingSystem591);
            	    lv_kssSources_29_0=ruleWorkSource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"kssSources",
            	            		lv_kssSources_29_0, 
            	            		"WorkSource");
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

            otherlv_30=(Token)match(input,30,FOLLOW_30_in_ruleKanbanSchedulingSystem604); 

                	newLeafNode(otherlv_30, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkSourcesKeyword_21());
                
            otherlv_31=(Token)match(input,31,FOLLOW_31_in_ruleKanbanSchedulingSystem616); 

                	newLeafNode(otherlv_31, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsKeyword_22());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:362:1: ( (lv_kssWItems_32_0= ruleWorkItem ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:363:1: (lv_kssWItems_32_0= ruleWorkItem )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:363:1: (lv_kssWItems_32_0= ruleWorkItem )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:364:3: lv_kssWItems_32_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKssWItemsWorkItemParserRuleCall_23_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItem_in_ruleKanbanSchedulingSystem637);
            	    lv_kssWItems_32_0=ruleWorkItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"kssWItems",
            	            		lv_kssWItems_32_0, 
            	            		"WorkItem");
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

            otherlv_33=(Token)match(input,32,FOLLOW_32_in_ruleKanbanSchedulingSystem650); 

                	newLeafNode(otherlv_33, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemsKeyword_24());
                
            otherlv_34=(Token)match(input,33,FOLLOW_33_in_ruleKanbanSchedulingSystem662); 

                	newLeafNode(otherlv_34, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemNetworkModelKeyword_25());
                
            otherlv_35=(Token)match(input,34,FOLLOW_34_in_ruleKanbanSchedulingSystem674); 

                	newLeafNode(otherlv_35, grammarAccess.getKanbanSchedulingSystemAccess().getExperimentSettingsKeyword_26());
                
            otherlv_36=(Token)match(input,35,FOLLOW_35_in_ruleKanbanSchedulingSystem686); 

                	newLeafNode(otherlv_36, grammarAccess.getKanbanSchedulingSystemAccess().getReplicationsKeyword_27());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:396:1: ( (lv_replications_37_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:397:1: (lv_replications_37_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:397:1: (lv_replications_37_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:398:3: lv_replications_37_0= RULE_INT
            {
            lv_replications_37_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem703); 

            			newLeafNode(lv_replications_37_0, grammarAccess.getKanbanSchedulingSystemAccess().getReplicationsINTTerminalRuleCall_28_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"replications",
                    		lv_replications_37_0, 
                    		"INT");
            	    

            }


            }

            otherlv_38=(Token)match(input,36,FOLLOW_36_in_ruleKanbanSchedulingSystem720); 

                	newLeafNode(otherlv_38, grammarAccess.getKanbanSchedulingSystemAccess().getInterArrivalTimeKeyword_29());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:418:1: ( (lv_interArrivalTime_39_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:419:1: (lv_interArrivalTime_39_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:419:1: (lv_interArrivalTime_39_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:420:3: lv_interArrivalTime_39_0= RULE_INT
            {
            lv_interArrivalTime_39_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem737); 

            			newLeafNode(lv_interArrivalTime_39_0, grammarAccess.getKanbanSchedulingSystemAccess().getInterArrivalTimeINTTerminalRuleCall_30_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"interArrivalTime",
                    		lv_interArrivalTime_39_0, 
                    		"INT");
            	    

            }


            }

            otherlv_40=(Token)match(input,37,FOLLOW_37_in_ruleKanbanSchedulingSystem754); 

                	newLeafNode(otherlv_40, grammarAccess.getKanbanSchedulingSystemAccess().getEndExperimentSettingsKeyword_31());
                
            otherlv_41=(Token)match(input,38,FOLLOW_38_in_ruleKanbanSchedulingSystem766); 

                	newLeafNode(otherlv_41, grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSModelKeyword_32());
                

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:452:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:453:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:454:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName803);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName814); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:461:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:464:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:465:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:465:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:465:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName854); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:472:1: (kw= '.' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:473:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName873); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName888); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "entryRuleDouble"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:493:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:494:2: (iv_ruleDouble= ruleDouble EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:495:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble936);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble947); 

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:502:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:505:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:506:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:506:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:506:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble987); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:513:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:514:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleDouble1006); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble1021); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1()); 
                        

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleNumExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:534:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:535:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:536:2: iv_ruleNumExpression= ruleNumExpression EOF
            {
             newCompositeNode(grammarAccess.getNumExpressionRule()); 
            pushFollow(FOLLOW_ruleNumExpression_in_entryRuleNumExpression1068);
            iv_ruleNumExpression=ruleNumExpression();

            state._fsp--;

             current =iv_ruleNumExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumExpression1078); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:543:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_distribution_1_0=null;
        AntlrDatatypeRuleToken lv_numValue_0_0 = null;

        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:546:28: ( ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:547:1: ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:547:1: ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:547:2: ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:547:2: ( (lv_numValue_0_0= ruleDouble ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:548:1: (lv_numValue_0_0= ruleDouble )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:548:1: (lv_numValue_0_0= ruleDouble )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:549:3: lv_numValue_0_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumValueDoubleParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleNumExpression1124);
                    lv_numValue_0_0=ruleDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"numValue",
                            		lv_numValue_0_0, 
                            		"Double");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:565:3: ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:565:4: ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:565:4: ( (lv_distribution_1_0= 'Distribution:' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:566:1: (lv_distribution_1_0= 'Distribution:' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:566:1: (lv_distribution_1_0= 'Distribution:' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:567:3: lv_distribution_1_0= 'Distribution:'
                    {
                    lv_distribution_1_0=(Token)match(input,40,FOLLOW_40_in_ruleNumExpression1144); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionDistributionKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Distribution:");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:580:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:581:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:581:1: (lv_numDist_2_0= ruleDistribution )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:582:3: lv_numDist_2_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumDistDistributionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleNumExpression1178);
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
    // $ANTLR end "ruleNumExpression"


    // $ANTLR start "entryRuleParameter"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:606:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:607:2: (iv_ruleParameter= ruleParameter EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:608:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1217);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1228); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:615:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Double_0= ruleDouble | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Double_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:618:28: ( (this_Double_0= ruleDouble | this_ID_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:619:1: (this_Double_0= ruleDouble | this_ID_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:619:1: (this_Double_0= ruleDouble | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:620:5: this_Double_0= ruleDouble
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getDoubleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDouble_in_ruleParameter1275);
                    this_Double_0=ruleDouble();

                    state._fsp--;


                    		current.merge(this_Double_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:631:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1301); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getParameterAccess().getIDTerminalRuleCall_1()); 
                        

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:646:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:647:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:648:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution1346);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution1356); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:655:1: ruleDistribution returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:658:28: ( ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:659:1: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:659:1: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:659:2: ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:659:2: ( (lv_type_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:660:1: (lv_type_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:660:1: (lv_type_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:661:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDistribution1398); 

            			newLeafNode(lv_type_0_0, grammarAccess.getDistributionAccess().getTypeIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDistributionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleDistribution1415); 

                	newLeafNode(otherlv_1, grammarAccess.getDistributionAccess().getLeftSquareBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:681:1: ( (lv_parameters_2_0= ruleParameter ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:682:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:682:1: (lv_parameters_2_0= ruleParameter )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:683:3: lv_parameters_2_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleDistribution1436);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleDistribution1449); 

                	newLeafNode(otherlv_3, grammarAccess.getDistributionAccess().getRightSquareBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleRepository"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:711:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:712:2: (iv_ruleRepository= ruleRepository EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:713:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_ruleRepository_in_entryRuleRepository1485);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepository1495); 

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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:720:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_profiles_4_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:723:28: ( (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:724:1: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:724:1: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:724:3: otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleRepository1532); 

                	newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:728:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:729:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:729:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:730:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRepositoryRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepository1552); 

            		newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getTypeTaskTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleRepository1564); 

                	newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getProfilesKeyword_2());
                
            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleRepository1576); 

                	newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:749:1: ( (lv_profiles_4_0= ruleWorkItemProfile ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:750:1: (lv_profiles_4_0= ruleWorkItemProfile )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:750:1: (lv_profiles_4_0= ruleWorkItemProfile )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:751:3: lv_profiles_4_0= ruleWorkItemProfile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRepositoryAccess().getProfilesWorkItemProfileParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItemProfile_in_ruleRepository1597);
            	    lv_profiles_4_0=ruleWorkItemProfile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"profiles",
            	            		lv_profiles_4_0, 
            	            		"WorkItemProfile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleRepository1610); 

                	newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleRepository1622); 

                	newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getEndRepositoryKeyword_6());
                

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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleWorkItemProfile"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:783:1: entryRuleWorkItemProfile returns [EObject current=null] : iv_ruleWorkItemProfile= ruleWorkItemProfile EOF ;
    public final EObject entryRuleWorkItemProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemProfile = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:784:2: (iv_ruleWorkItemProfile= ruleWorkItemProfile EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:785:2: iv_ruleWorkItemProfile= ruleWorkItemProfile EOF
            {
             newCompositeNode(grammarAccess.getWorkItemProfileRule()); 
            pushFollow(FOLLOW_ruleWorkItemProfile_in_entryRuleWorkItemProfile1658);
            iv_ruleWorkItemProfile=ruleWorkItemProfile();

            state._fsp--;

             current =iv_ruleWorkItemProfile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemProfile1668); 

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
    // $ANTLR end "entryRuleWorkItemProfile"


    // $ANTLR start "ruleWorkItemProfile"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:792:1: ruleWorkItemProfile returns [EObject current=null] : (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'references' otherlv_6= '{' ( (lv_refTasks_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'decompositions' otherlv_10= '{' ( (lv_decTasks_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'serviceType' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'baseEfforts' ( (lv_befforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'baseValue' ( (lv_bvalue_18_0= ruleNumExpression ) ) )? (otherlv_19= 'classOfService' ( (lv_COS_20_0= RULE_ID ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleWorkItemProfile() throws RecognitionException {
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
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_COS_20_0=null;
        Token otherlv_21=null;
        EObject lv_refTasks_7_0 = null;

        EObject lv_decTasks_11_0 = null;

        EObject lv_befforts_16_0 = null;

        EObject lv_bvalue_18_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:795:28: ( (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'references' otherlv_6= '{' ( (lv_refTasks_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'decompositions' otherlv_10= '{' ( (lv_decTasks_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'serviceType' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'baseEfforts' ( (lv_befforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'baseValue' ( (lv_bvalue_18_0= ruleNumExpression ) ) )? (otherlv_19= 'classOfService' ( (lv_COS_20_0= RULE_ID ) ) )? otherlv_21= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:796:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'references' otherlv_6= '{' ( (lv_refTasks_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'decompositions' otherlv_10= '{' ( (lv_decTasks_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'serviceType' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'baseEfforts' ( (lv_befforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'baseValue' ( (lv_bvalue_18_0= ruleNumExpression ) ) )? (otherlv_19= 'classOfService' ( (lv_COS_20_0= RULE_ID ) ) )? otherlv_21= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:796:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'references' otherlv_6= '{' ( (lv_refTasks_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'decompositions' otherlv_10= '{' ( (lv_decTasks_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'serviceType' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'baseEfforts' ( (lv_befforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'baseValue' ( (lv_bvalue_18_0= ruleNumExpression ) ) )? (otherlv_19= 'classOfService' ( (lv_COS_20_0= RULE_ID ) ) )? otherlv_21= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:796:3: otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'references' otherlv_6= '{' ( (lv_refTasks_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'decompositions' otherlv_10= '{' ( (lv_decTasks_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'serviceType' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'baseEfforts' ( (lv_befforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'baseValue' ( (lv_bvalue_18_0= ruleNumExpression ) ) )? (otherlv_19= 'classOfService' ( (lv_COS_20_0= RULE_ID ) ) )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleWorkItemProfile1705); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemProfileAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:800:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:801:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:801:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:802:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile1722); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkItemProfileAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleWorkItemProfile1739); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:822:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:822:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleWorkItemProfile1752); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemProfileAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:826:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:827:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:827:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:828:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemProfile1769); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWorkItemProfileAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:844:4: (otherlv_5= 'references' otherlv_6= '{' ( (lv_refTasks_7_0= ruleWorkReference ) )+ otherlv_8= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:844:6: otherlv_5= 'references' otherlv_6= '{' ( (lv_refTasks_7_0= ruleWorkReference ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleWorkItemProfile1789); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemProfileAccess().getReferencesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleWorkItemProfile1801); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:852:1: ( (lv_refTasks_7_0= ruleWorkReference ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==48) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:853:1: (lv_refTasks_7_0= ruleWorkReference )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:853:1: (lv_refTasks_7_0= ruleWorkReference )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:854:3: lv_refTasks_7_0= ruleWorkReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getRefTasksWorkReferenceParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkReference_in_ruleWorkItemProfile1822);
                    	    lv_refTasks_7_0=ruleWorkReference();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refTasks",
                    	            		lv_refTasks_7_0, 
                    	            		"WorkReference");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleWorkItemProfile1835); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:874:3: (otherlv_9= 'decompositions' otherlv_10= '{' ( (lv_decTasks_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==51) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:874:5: otherlv_9= 'decompositions' otherlv_10= '{' ( (lv_decTasks_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,51,FOLLOW_51_in_ruleWorkItemProfile1850); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkItemProfileAccess().getDecompositionsKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,45,FOLLOW_45_in_ruleWorkItemProfile1862); 

                        	newLeafNode(otherlv_10, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:882:1: ( (lv_decTasks_11_0= ruleWorkDecomposition ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==48) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:883:1: (lv_decTasks_11_0= ruleWorkDecomposition )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:883:1: (lv_decTasks_11_0= ruleWorkDecomposition )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:884:3: lv_decTasks_11_0= ruleWorkDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getDecTasksWorkDecompositionParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkDecomposition_in_ruleWorkItemProfile1883);
                    	    lv_decTasks_11_0=ruleWorkDecomposition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"decTasks",
                    	            		lv_decTasks_11_0, 
                    	            		"WorkDecomposition");
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

                    otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleWorkItemProfile1896); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:904:3: (otherlv_13= 'serviceType' ( (otherlv_14= RULE_ID ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:904:5: otherlv_13= 'serviceType' ( (otherlv_14= RULE_ID ) )+
                    {
                    otherlv_13=(Token)match(input,52,FOLLOW_52_in_ruleWorkItemProfile1911); 

                        	newLeafNode(otherlv_13, grammarAccess.getWorkItemProfileAccess().getServiceTypeKeyword_6_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:908:1: ( (otherlv_14= RULE_ID ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:909:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:909:1: (otherlv_14= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:910:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile1931); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getWorkItemProfileAccess().getReqSpecialtiesServiceTypeCrossReference_6_1_0()); 
                    	    	

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


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:921:5: (otherlv_15= 'baseEfforts' ( (lv_befforts_16_0= ruleNumExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:921:7: otherlv_15= 'baseEfforts' ( (lv_befforts_16_0= ruleNumExpression ) )
                    {
                    otherlv_15=(Token)match(input,53,FOLLOW_53_in_ruleWorkItemProfile1947); 

                        	newLeafNode(otherlv_15, grammarAccess.getWorkItemProfileAccess().getBaseEffortsKeyword_7_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:925:1: ( (lv_befforts_16_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:926:1: (lv_befforts_16_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:926:1: (lv_befforts_16_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:927:3: lv_befforts_16_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getBeffortsNumExpressionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItemProfile1968);
                    lv_befforts_16_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		set(
                           			current, 
                           			"befforts",
                            		lv_befforts_16_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:943:4: (otherlv_17= 'baseValue' ( (lv_bvalue_18_0= ruleNumExpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:943:6: otherlv_17= 'baseValue' ( (lv_bvalue_18_0= ruleNumExpression ) )
                    {
                    otherlv_17=(Token)match(input,54,FOLLOW_54_in_ruleWorkItemProfile1983); 

                        	newLeafNode(otherlv_17, grammarAccess.getWorkItemProfileAccess().getBaseValueKeyword_8_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:947:1: ( (lv_bvalue_18_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:948:1: (lv_bvalue_18_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:948:1: (lv_bvalue_18_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:949:3: lv_bvalue_18_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getBvalueNumExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItemProfile2004);
                    lv_bvalue_18_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		set(
                           			current, 
                           			"bvalue",
                            		lv_bvalue_18_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:965:4: (otherlv_19= 'classOfService' ( (lv_COS_20_0= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:965:6: otherlv_19= 'classOfService' ( (lv_COS_20_0= RULE_ID ) )
                    {
                    otherlv_19=(Token)match(input,55,FOLLOW_55_in_ruleWorkItemProfile2019); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemProfileAccess().getClassOfServiceKeyword_9_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:969:1: ( (lv_COS_20_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:970:1: (lv_COS_20_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:970:1: (lv_COS_20_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:971:3: lv_COS_20_0= RULE_ID
                    {
                    lv_COS_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile2036); 

                    			newLeafNode(lv_COS_20_0, grammarAccess.getWorkItemProfileAccess().getCOSIDTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"COS",
                            		lv_COS_20_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,46,FOLLOW_46_in_ruleWorkItemProfile2055); 

                	newLeafNode(otherlv_21, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleWorkItemProfile"


    // $ANTLR start "entryRuleWorkReference"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:999:1: entryRuleWorkReference returns [EObject current=null] : iv_ruleWorkReference= ruleWorkReference EOF ;
    public final EObject entryRuleWorkReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkReference = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1000:2: (iv_ruleWorkReference= ruleWorkReference EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1001:2: iv_ruleWorkReference= ruleWorkReference EOF
            {
             newCompositeNode(grammarAccess.getWorkReferenceRule()); 
            pushFollow(FOLLOW_ruleWorkReference_in_entryRuleWorkReference2091);
            iv_ruleWorkReference=ruleWorkReference();

            state._fsp--;

             current =iv_ruleWorkReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkReference2101); 

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
    // $ANTLR end "entryRuleWorkReference"


    // $ANTLR start "ruleWorkReference"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1008:1: ruleWorkReference returns [EObject current=null] : (otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleWorkReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_amount_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1011:28: ( (otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1012:1: (otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1012:1: (otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1012:3: otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleWorkReference2138); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkReferenceAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1016:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1017:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1017:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1018:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkReference2158); 

            		newLeafNode(otherlv_1, grammarAccess.getWorkReferenceAccess().getWorkItemWorkItemProfileCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleWorkReference2170); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkReferenceAccess().getQuantityKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1033:1: ( (lv_amount_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1034:1: (lv_amount_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1034:1: (lv_amount_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1035:3: lv_amount_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getWorkReferenceAccess().getAmountNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkReference2191);
            lv_amount_3_0=ruleNumExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"amount",
                    		lv_amount_3_0, 
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
    // $ANTLR end "ruleWorkReference"


    // $ANTLR start "entryRuleWorkDecomposition"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1059:1: entryRuleWorkDecomposition returns [EObject current=null] : iv_ruleWorkDecomposition= ruleWorkDecomposition EOF ;
    public final EObject entryRuleWorkDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDecomposition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1060:2: (iv_ruleWorkDecomposition= ruleWorkDecomposition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1061:2: iv_ruleWorkDecomposition= ruleWorkDecomposition EOF
            {
             newCompositeNode(grammarAccess.getWorkDecompositionRule()); 
            pushFollow(FOLLOW_ruleWorkDecomposition_in_entryRuleWorkDecomposition2227);
            iv_ruleWorkDecomposition=ruleWorkDecomposition();

            state._fsp--;

             current =iv_ruleWorkDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkDecomposition2237); 

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
    // $ANTLR end "entryRuleWorkDecomposition"


    // $ANTLR start "ruleWorkDecomposition"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1068:1: ruleWorkDecomposition returns [EObject current=null] : (otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleWorkDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_amount_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1071:28: ( (otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:3: otherlv_0= 'workItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_amount_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleWorkDecomposition2274); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkDecompositionAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1076:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1077:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1077:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1078:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkDecompositionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkDecomposition2294); 

            		newLeafNode(otherlv_1, grammarAccess.getWorkDecompositionAccess().getWorkItemWorkItemProfileCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleWorkDecomposition2306); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkDecompositionAccess().getQuantityKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1093:1: ( (lv_amount_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1094:1: (lv_amount_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1094:1: (lv_amount_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1095:3: lv_amount_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getWorkDecompositionAccess().getAmountNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkDecomposition2327);
            lv_amount_3_0=ruleNumExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkDecompositionRule());
            	        }
                   		set(
                   			current, 
                   			"amount",
                    		lv_amount_3_0, 
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
    // $ANTLR end "ruleWorkDecomposition"


    // $ANTLR start "entryRuleTaskPattern"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1123:1: entryRuleTaskPattern returns [EObject current=null] : iv_ruleTaskPattern= ruleTaskPattern EOF ;
    public final EObject entryRuleTaskPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskPattern = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1124:2: (iv_ruleTaskPattern= ruleTaskPattern EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1125:2: iv_ruleTaskPattern= ruleTaskPattern EOF
            {
             newCompositeNode(grammarAccess.getTaskPatternRule()); 
            pushFollow(FOLLOW_ruleTaskPattern_in_entryRuleTaskPattern2367);
            iv_ruleTaskPattern=ruleTaskPattern();

            state._fsp--;

             current =iv_ruleTaskPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskPattern2377); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1132:1: ruleTaskPattern returns [EObject current=null] : (otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1135:28: ( (otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1136:1: (otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1136:1: (otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1136:3: otherlv_0= 'workflowTemplate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleTaskPattern2414); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskPatternAccess().getWorkflowTemplateKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1140:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1141:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1141:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1142:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskPattern2431); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleTaskPattern2448); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskPatternAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1162:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1162:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleTaskPattern2461); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskPatternAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1166:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1167:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1167:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1168:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskPattern2478); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1184:4: (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==58) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1184:6: otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_58_in_ruleTaskPattern2498); 

                        	newLeafNode(otherlv_5, grammarAccess.getTaskPatternAccess().getTypesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleTaskPattern2510); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskPatternAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1192:1: ( (otherlv_7= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1193:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1193:1: (otherlv_7= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1194:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskPatternRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskPattern2530); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getTaskPatternAccess().getTaskpatternTypesTaskTypeCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleTaskPattern2543); 

                        	newLeafNode(otherlv_8, grammarAccess.getTaskPatternAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleTaskPattern2557); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1221:1: entryRuleTaskType returns [EObject current=null] : iv_ruleTaskType= ruleTaskType EOF ;
    public final EObject entryRuleTaskType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1222:2: (iv_ruleTaskType= ruleTaskType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1223:2: iv_ruleTaskType= ruleTaskType EOF
            {
             newCompositeNode(grammarAccess.getTaskTypeRule()); 
            pushFollow(FOLLOW_ruleTaskType_in_entryRuleTaskType2593);
            iv_ruleTaskType=ruleTaskType();

            state._fsp--;

             current =iv_ruleTaskType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskType2603); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1230:1: ruleTaskType returns [EObject current=null] : (otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1233:28: ( (otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1234:1: (otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1234:1: (otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1234:3: otherlv_0= 'taskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleTaskType2640); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskTypeAccess().getTaskTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1238:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1239:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1239:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1240:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskType2657); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleTaskType2674); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1260:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1260:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleTaskType2687); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1264:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1265:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1265:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1266:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskType2704); 

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

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleTaskType2723); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1294:1: entryRuleValueFunction returns [EObject current=null] : iv_ruleValueFunction= ruleValueFunction EOF ;
    public final EObject entryRuleValueFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueFunction = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1295:2: (iv_ruleValueFunction= ruleValueFunction EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1296:2: iv_ruleValueFunction= ruleValueFunction EOF
            {
             newCompositeNode(grammarAccess.getValueFunctionRule()); 
            pushFollow(FOLLOW_ruleValueFunction_in_entryRuleValueFunction2759);
            iv_ruleValueFunction=ruleValueFunction();

            state._fsp--;

             current =iv_ruleValueFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueFunction2769); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1303:1: ruleValueFunction returns [EObject current=null] : (otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1306:28: ( (otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1307:1: (otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1307:1: (otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1307:3: otherlv_0= 'valueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleValueFunction2806); 

                	newLeafNode(otherlv_0, grammarAccess.getValueFunctionAccess().getValueFunctionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1311:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1312:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1312:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1313:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueFunction2823); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleValueFunction2840); 

                	newLeafNode(otherlv_2, grammarAccess.getValueFunctionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1333:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1333:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleValueFunction2853); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueFunctionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1337:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1338:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1338:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1339:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueFunction2870); 

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

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleValueFunction2889); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1367:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1368:2: (iv_ruleMechanism= ruleMechanism EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1369:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_ruleMechanism_in_entryRuleMechanism2925);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanism2935); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1376:1: ruleMechanism returns [EObject current=null] : (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+ ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1379:28: ( (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+ ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1380:1: (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+ )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1380:1: (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+ )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1380:3: otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) ) ( (lv_Strategies_6_0= ruleStrategy ) )+
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleMechanism2972); 

                	newLeafNode(otherlv_0, grammarAccess.getMechanismAccess().getMechanismKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1384:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1385:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1385:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1386:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechanism2989); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1402:2: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1402:4: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleMechanism3007); 

                        	newLeafNode(otherlv_2, grammarAccess.getMechanismAccess().getDescriptionKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1406:1: ( (lv_description_3_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1407:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1407:1: (lv_description_3_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1408:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanism3024); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1424:4: (otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1424:6: otherlv_4= 'ProcessType' ( (lv_processtype_5_0= RULE_STRING ) )
            {
            otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleMechanism3044); 

                	newLeafNode(otherlv_4, grammarAccess.getMechanismAccess().getProcessTypeKeyword_3_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1428:1: ( (lv_processtype_5_0= RULE_STRING ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1429:1: (lv_processtype_5_0= RULE_STRING )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1429:1: (lv_processtype_5_0= RULE_STRING )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1430:3: lv_processtype_5_0= RULE_STRING
            {
            lv_processtype_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanism3061); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1446:3: ( (lv_Strategies_6_0= ruleStrategy ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==63) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1447:1: (lv_Strategies_6_0= ruleStrategy )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1447:1: (lv_Strategies_6_0= ruleStrategy )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1448:3: lv_Strategies_6_0= ruleStrategy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMechanismAccess().getStrategiesStrategyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStrategy_in_ruleMechanism3088);
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1472:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1473:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1474:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_ruleStrategy_in_entryRuleStrategy3125);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategy3135); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1481:1: ruleStrategy returns [EObject current=null] : (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1484:28: ( (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1485:1: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1485:1: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1485:3: otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleStrategy3172); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getStrategyKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1489:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1490:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1490:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1491:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategy3189); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleStrategy3206); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1511:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1511:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleStrategy3219); 

                        	newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1515:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1516:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1516:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1517:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStrategy3236); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1533:4: ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1534:1: (lv_WIAcceptanceRule_5_0= ruleWIAcceptance )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1534:1: (lv_WIAcceptanceRule_5_0= ruleWIAcceptance )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1535:3: lv_WIAcceptanceRule_5_0= ruleWIAcceptance
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getWIAcceptanceRuleWIAcceptanceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleWIAcceptance_in_ruleStrategy3264);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1551:2: ( (lv_WISelectionRule_6_0= ruleWISelection ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1552:1: (lv_WISelectionRule_6_0= ruleWISelection )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1552:1: (lv_WISelectionRule_6_0= ruleWISelection )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1553:3: lv_WISelectionRule_6_0= ruleWISelection
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getWISelectionRuleWISelectionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleWISelection_in_ruleStrategy3285);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1569:2: ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1570:1: (lv_WIAssignmentRule_7_0= ruleWIAssignment )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1570:1: (lv_WIAssignmentRule_7_0= ruleWIAssignment )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1571:3: lv_WIAssignmentRule_7_0= ruleWIAssignment
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getWIAssignmentRuleWIAssignmentParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleWIAssignment_in_ruleStrategy3306);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1587:2: ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1588:1: (lv_ResourceAllocationRule_8_0= ruleResourceAllocation )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1588:1: (lv_ResourceAllocationRule_8_0= ruleResourceAllocation )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1589:3: lv_ResourceAllocationRule_8_0= ruleResourceAllocation
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getResourceAllocationRuleResourceAllocationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceAllocation_in_ruleStrategy3327);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1605:2: ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1606:1: (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1606:1: (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1607:3: lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getResourceOutsourcingRuleResourceOutsourcingParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleStrategy3348);
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

            otherlv_10=(Token)match(input,46,FOLLOW_46_in_ruleStrategy3360); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1635:1: entryRuleWIAcceptance returns [EObject current=null] : iv_ruleWIAcceptance= ruleWIAcceptance EOF ;
    public final EObject entryRuleWIAcceptance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAcceptance = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1636:2: (iv_ruleWIAcceptance= ruleWIAcceptance EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1637:2: iv_ruleWIAcceptance= ruleWIAcceptance EOF
            {
             newCompositeNode(grammarAccess.getWIAcceptanceRule()); 
            pushFollow(FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance3396);
            iv_ruleWIAcceptance=ruleWIAcceptance();

            state._fsp--;

             current =iv_ruleWIAcceptance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptance3406); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1644:1: ruleWIAcceptance returns [EObject current=null] : (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1647:28: ( (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1648:1: (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1648:1: (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1648:3: otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleWIAcceptance3443); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceAccess().getWIAcceptanceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1652:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1653:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1653:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1654:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptance3460); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleWIAcceptance3477); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1674:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1674:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleWIAcceptance3490); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1678:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1679:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1679:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1680:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptance3507); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1696:4: (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==65) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1696:6: otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_65_in_ruleWIAcceptance3527); 

                        	newLeafNode(otherlv_5, grammarAccess.getWIAcceptanceAccess().getBackLogLimitKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1700:1: ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1701:1: (lv_backlogQLimit_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1701:1: (lv_backlogQLimit_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1702:3: lv_backlogQLimit_6_0= RULE_INT
                    {
                    lv_backlogQLimit_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance3544); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1718:4: (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==66) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1718:6: otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,66,FOLLOW_66_in_ruleWIAcceptance3564); 

                        	newLeafNode(otherlv_7, grammarAccess.getWIAcceptanceAccess().getWIPLimitKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1722:1: ( (lv_readyQLimit_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1723:1: (lv_readyQLimit_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1723:1: (lv_readyQLimit_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1724:3: lv_readyQLimit_8_0= RULE_INT
                    {
                    lv_readyQLimit_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance3581); 

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

            otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleWIAcceptance3600); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1752:1: entryRuleWISelection returns [EObject current=null] : iv_ruleWISelection= ruleWISelection EOF ;
    public final EObject entryRuleWISelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWISelection = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1753:2: (iv_ruleWISelection= ruleWISelection EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1754:2: iv_ruleWISelection= ruleWISelection EOF
            {
             newCompositeNode(grammarAccess.getWISelectionRule()); 
            pushFollow(FOLLOW_ruleWISelection_in_entryRuleWISelection3636);
            iv_ruleWISelection=ruleWISelection();

            state._fsp--;

             current =iv_ruleWISelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelection3646); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1761:1: ruleWISelection returns [EObject current=null] : (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1764:28: ( (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1765:1: (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1765:1: (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1765:3: otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleWISelection3683); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionAccess().getWISelectionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1769:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1770:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1770:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1771:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelection3700); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleWISelection3717); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1791:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1791:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleWISelection3730); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1795:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1796:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1796:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1797:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelection3747); 

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

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleWISelection3766); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1825:1: entryRuleWIAssignment returns [EObject current=null] : iv_ruleWIAssignment= ruleWIAssignment EOF ;
    public final EObject entryRuleWIAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAssignment = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1826:2: (iv_ruleWIAssignment= ruleWIAssignment EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1827:2: iv_ruleWIAssignment= ruleWIAssignment EOF
            {
             newCompositeNode(grammarAccess.getWIAssignmentRule()); 
            pushFollow(FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment3802);
            iv_ruleWIAssignment=ruleWIAssignment();

            state._fsp--;

             current =iv_ruleWIAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignment3812); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1834:1: ruleWIAssignment returns [EObject current=null] : (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1837:28: ( (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1838:1: (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1838:1: (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1838:3: otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleWIAssignment3849); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentAccess().getWIAssignmentKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1842:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1843:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1843:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1844:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignment3866); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleWIAssignment3883); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1864:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1864:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleWIAssignment3896); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1868:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1869:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1869:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1870:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignment3913); 

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

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleWIAssignment3932); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1898:1: entryRuleResourceAllocation returns [EObject current=null] : iv_ruleResourceAllocation= ruleResourceAllocation EOF ;
    public final EObject entryRuleResourceAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAllocation = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1899:2: (iv_ruleResourceAllocation= ruleResourceAllocation EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1900:2: iv_ruleResourceAllocation= ruleResourceAllocation EOF
            {
             newCompositeNode(grammarAccess.getResourceAllocationRule()); 
            pushFollow(FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation3968);
            iv_ruleResourceAllocation=ruleResourceAllocation();

            state._fsp--;

             current =iv_ruleResourceAllocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocation3978); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1907:1: ruleResourceAllocation returns [EObject current=null] : (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1910:28: ( (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1911:1: (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1911:1: (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1911:3: otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleResourceAllocation4015); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationAccess().getResourceAllocationKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1915:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1916:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1916:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1917:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocation4032); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleResourceAllocation4049); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1937:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==49) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1937:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleResourceAllocation4062); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1941:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1942:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1942:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1943:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocation4079); 

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

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleResourceAllocation4098); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1971:1: entryRuleResourceOutsourcing returns [EObject current=null] : iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF ;
    public final EObject entryRuleResourceOutsourcing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOutsourcing = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1972:2: (iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1973:2: iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF
            {
             newCompositeNode(grammarAccess.getResourceOutsourcingRule()); 
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing4134);
            iv_ruleResourceOutsourcing=ruleResourceOutsourcing();

            state._fsp--;

             current =iv_ruleResourceOutsourcing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcing4144); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1980:1: ruleResourceOutsourcing returns [EObject current=null] : (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1983:28: ( (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1984:1: (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1984:1: (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1984:3: otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleResourceOutsourcing4181); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingAccess().getResourceOutsourcingKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1988:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1989:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1989:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1990:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcing4198); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleResourceOutsourcing4215); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2010:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2010:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleResourceOutsourcing4228); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2014:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2015:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2015:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2016:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcing4245); 

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

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleResourceOutsourcing4264); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2044:1: entryRuleWorkSource returns [EObject current=null] : iv_ruleWorkSource= ruleWorkSource EOF ;
    public final EObject entryRuleWorkSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSource = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2045:2: (iv_ruleWorkSource= ruleWorkSource EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2046:2: iv_ruleWorkSource= ruleWorkSource EOF
            {
             newCompositeNode(grammarAccess.getWorkSourceRule()); 
            pushFollow(FOLLOW_ruleWorkSource_in_entryRuleWorkSource4300);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSource4310); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2053:1: ruleWorkSource returns [EObject current=null] : (otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2056:28: ( (otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2057:1: (otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2057:1: (otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2057:3: otherlv_0= 'workSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleWorkSource4347); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2061:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2062:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2062:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2063:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4364); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleWorkSource4381); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2083:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2083:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleWorkSource4394); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2087:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2088:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2088:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2089:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkSource4411); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2105:4: (otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==72) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2105:6: otherlv_5= 'targetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleWorkSource4431); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkSourceAccess().getTargetUnitsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleWorkSource4443); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2113:1: ( (otherlv_7= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2114:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2114:1: (otherlv_7= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2115:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4463); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getTargetUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleWorkSource4476); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2130:3: ( (lv_assignmentRule_9_0= ruleWIAssignment ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==68) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2131:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2131:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2132:3: lv_assignmentRule_9_0= ruleWIAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkSourceAccess().getAssignmentRuleWIAssignmentParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleWorkSource4499);
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

            otherlv_10=(Token)match(input,46,FOLLOW_46_in_ruleWorkSource4512); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2160:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2161:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2162:2: iv_ruleWorkItem= ruleWorkItem EOF
            {
             newCompositeNode(grammarAccess.getWorkItemRule()); 
            pushFollow(FOLLOW_ruleWorkItem_in_entryRuleWorkItem4548);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItem4558); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2169:1: ruleWorkItem returns [EObject current=null] : (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'causality' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'serviceType' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'baseEfforts' ( (lv_befforts_24_0= RULE_INT ) ) )? (otherlv_25= 'baseValue' ( (lv_bvalue_26_0= RULE_INT ) ) )? (otherlv_27= 'localValues' ( (lv_lvalue_28_0= ruleLocalValue ) ) )? (otherlv_29= 'classOfService' ( (lv_COS_30_0= RULE_ID ) ) )? (otherlv_31= 'WorkSource' ( (otherlv_32= RULE_ID ) ) )? (otherlv_33= 'arrivalTime' ( (lv_arrtime_34_0= RULE_INT ) ) )? (otherlv_35= 'dueDate' ( (lv_duedate_36_0= RULE_INT ) ) )? otherlv_37= '}' ) ;
    public final EObject ruleWorkItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
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
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_befforts_24_0=null;
        Token otherlv_25=null;
        Token lv_bvalue_26_0=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token lv_COS_30_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token lv_arrtime_34_0=null;
        Token otherlv_35=null;
        Token lv_duedate_36_0=null;
        Token otherlv_37=null;
        EObject lv_causalTriggers_20_0 = null;

        EObject lv_lvalue_28_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2172:28: ( (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'causality' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'serviceType' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'baseEfforts' ( (lv_befforts_24_0= RULE_INT ) ) )? (otherlv_25= 'baseValue' ( (lv_bvalue_26_0= RULE_INT ) ) )? (otherlv_27= 'localValues' ( (lv_lvalue_28_0= ruleLocalValue ) ) )? (otherlv_29= 'classOfService' ( (lv_COS_30_0= RULE_ID ) ) )? (otherlv_31= 'WorkSource' ( (otherlv_32= RULE_ID ) ) )? (otherlv_33= 'arrivalTime' ( (lv_arrtime_34_0= RULE_INT ) ) )? (otherlv_35= 'dueDate' ( (lv_duedate_36_0= RULE_INT ) ) )? otherlv_37= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2173:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'causality' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'serviceType' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'baseEfforts' ( (lv_befforts_24_0= RULE_INT ) ) )? (otherlv_25= 'baseValue' ( (lv_bvalue_26_0= RULE_INT ) ) )? (otherlv_27= 'localValues' ( (lv_lvalue_28_0= ruleLocalValue ) ) )? (otherlv_29= 'classOfService' ( (lv_COS_30_0= RULE_ID ) ) )? (otherlv_31= 'WorkSource' ( (otherlv_32= RULE_ID ) ) )? (otherlv_33= 'arrivalTime' ( (lv_arrtime_34_0= RULE_INT ) ) )? (otherlv_35= 'dueDate' ( (lv_duedate_36_0= RULE_INT ) ) )? otherlv_37= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2173:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'causality' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'serviceType' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'baseEfforts' ( (lv_befforts_24_0= RULE_INT ) ) )? (otherlv_25= 'baseValue' ( (lv_bvalue_26_0= RULE_INT ) ) )? (otherlv_27= 'localValues' ( (lv_lvalue_28_0= ruleLocalValue ) ) )? (otherlv_29= 'classOfService' ( (lv_COS_30_0= RULE_ID ) ) )? (otherlv_31= 'WorkSource' ( (otherlv_32= RULE_ID ) ) )? (otherlv_33= 'arrivalTime' ( (lv_arrtime_34_0= RULE_INT ) ) )? (otherlv_35= 'dueDate' ( (lv_duedate_36_0= RULE_INT ) ) )? otherlv_37= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2173:3: otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'causality' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'serviceType' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'baseEfforts' ( (lv_befforts_24_0= RULE_INT ) ) )? (otherlv_25= 'baseValue' ( (lv_bvalue_26_0= RULE_INT ) ) )? (otherlv_27= 'localValues' ( (lv_lvalue_28_0= ruleLocalValue ) ) )? (otherlv_29= 'classOfService' ( (lv_COS_30_0= RULE_ID ) ) )? (otherlv_31= 'WorkSource' ( (otherlv_32= RULE_ID ) ) )? (otherlv_33= 'arrivalTime' ( (lv_arrtime_34_0= RULE_INT ) ) )? (otherlv_35= 'dueDate' ( (lv_duedate_36_0= RULE_INT ) ) )? otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleWorkItem4595); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2177:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2178:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2178:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2179:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4612); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleWorkItem4629); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2199:1: (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2199:3: otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_73_in_ruleWorkItem4642); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getProfileKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2203:1: ( (otherlv_4= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2204:1: (otherlv_4= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2204:1: (otherlv_4= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2205:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4662); 

                    		newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getProfileWorkItemProfileCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2216:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2216:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleWorkItem4677); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2220:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2221:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2221:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2222:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItem4694); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getWorkItemAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2238:4: (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==74) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2238:6: otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem4714); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkItemAccess().getPatternKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2242:1: ( (otherlv_8= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2243:1: (otherlv_8= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2243:1: (otherlv_8= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2244:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4734); 

                    		newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getPatternTaskPatternCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2255:4: (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==75) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2255:6: otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,75,FOLLOW_75_in_ruleWorkItem4749); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getTypeKeyword_6_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2259:1: ( (otherlv_10= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2260:1: (otherlv_10= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2260:1: (otherlv_10= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2261:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4769); 

                    		newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getPatternTypeTaskTypeCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2272:4: (otherlv_11= 'predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==76) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2272:6: otherlv_11= 'predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,76,FOLLOW_76_in_ruleWorkItem4784); 

                        	newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getPredecessorsKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleWorkItem4796); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2280:1: ( (otherlv_13= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2281:1: (otherlv_13= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2281:1: (otherlv_13= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2282:3: otherlv_13= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4816); 

                    	    		newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_7_2_0()); 
                    	    	

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

                    otherlv_14=(Token)match(input,46,FOLLOW_46_in_ruleWorkItem4829); 

                        	newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2297:3: (otherlv_15= 'subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==77) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2297:5: otherlv_15= 'subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,77,FOLLOW_77_in_ruleWorkItem4844); 

                        	newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getSubtasksKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,45,FOLLOW_45_in_ruleWorkItem4856); 

                        	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2305:1: ( (otherlv_17= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2306:1: (otherlv_17= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2306:1: (otherlv_17= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2307:3: otherlv_17= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4876); 

                    	    		newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_8_2_0()); 
                    	    	

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

                    otherlv_18=(Token)match(input,46,FOLLOW_46_in_ruleWorkItem4889); 

                        	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2322:3: (otherlv_19= 'causality' ( (lv_causalTriggers_20_0= ruleCausality ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==78) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2322:5: otherlv_19= 'causality' ( (lv_causalTriggers_20_0= ruleCausality ) )*
                    {
                    otherlv_19=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem4904); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getCausalityKeyword_9_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2326:1: ( (lv_causalTriggers_20_0= ruleCausality ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=83 && LA60_0<=84)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2327:1: (lv_causalTriggers_20_0= ruleCausality )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2327:1: (lv_causalTriggers_20_0= ruleCausality )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2328:3: lv_causalTriggers_20_0= ruleCausality
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getCausalTriggersCausalityParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausality_in_ruleWorkItem4925);
                    	    lv_causalTriggers_20_0=ruleCausality();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"causalTriggers",
                    	            		lv_causalTriggers_20_0, 
                    	            		"Causality");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2344:5: (otherlv_21= 'serviceType' ( (otherlv_22= RULE_ID ) )+ )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==52) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2344:7: otherlv_21= 'serviceType' ( (otherlv_22= RULE_ID ) )+
                    {
                    otherlv_21=(Token)match(input,52,FOLLOW_52_in_ruleWorkItem4941); 

                        	newLeafNode(otherlv_21, grammarAccess.getWorkItemAccess().getServiceTypeKeyword_10_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2348:1: ( (otherlv_22= RULE_ID ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_ID) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2349:1: (otherlv_22= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2349:1: (otherlv_22= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2350:3: otherlv_22= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4961); 

                    	    		newLeafNode(otherlv_22, grammarAccess.getWorkItemAccess().getReqSpecialtiesServiceTypeCrossReference_10_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2361:5: (otherlv_23= 'baseEfforts' ( (lv_befforts_24_0= RULE_INT ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==53) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2361:7: otherlv_23= 'baseEfforts' ( (lv_befforts_24_0= RULE_INT ) )
                    {
                    otherlv_23=(Token)match(input,53,FOLLOW_53_in_ruleWorkItem4977); 

                        	newLeafNode(otherlv_23, grammarAccess.getWorkItemAccess().getBaseEffortsKeyword_11_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2365:1: ( (lv_befforts_24_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2366:1: (lv_befforts_24_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2366:1: (lv_befforts_24_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2367:3: lv_befforts_24_0= RULE_INT
                    {
                    lv_befforts_24_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem4994); 

                    			newLeafNode(lv_befforts_24_0, grammarAccess.getWorkItemAccess().getBeffortsINTTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"befforts",
                            		lv_befforts_24_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2383:4: (otherlv_25= 'baseValue' ( (lv_bvalue_26_0= RULE_INT ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==54) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2383:6: otherlv_25= 'baseValue' ( (lv_bvalue_26_0= RULE_INT ) )
                    {
                    otherlv_25=(Token)match(input,54,FOLLOW_54_in_ruleWorkItem5014); 

                        	newLeafNode(otherlv_25, grammarAccess.getWorkItemAccess().getBaseValueKeyword_12_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2387:1: ( (lv_bvalue_26_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2388:1: (lv_bvalue_26_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2388:1: (lv_bvalue_26_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2389:3: lv_bvalue_26_0= RULE_INT
                    {
                    lv_bvalue_26_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem5031); 

                    			newLeafNode(lv_bvalue_26_0, grammarAccess.getWorkItemAccess().getBvalueINTTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bvalue",
                            		lv_bvalue_26_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2405:4: (otherlv_27= 'localValues' ( (lv_lvalue_28_0= ruleLocalValue ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==79) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2405:6: otherlv_27= 'localValues' ( (lv_lvalue_28_0= ruleLocalValue ) )
                    {
                    otherlv_27=(Token)match(input,79,FOLLOW_79_in_ruleWorkItem5051); 

                        	newLeafNode(otherlv_27, grammarAccess.getWorkItemAccess().getLocalValuesKeyword_13_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2409:1: ( (lv_lvalue_28_0= ruleLocalValue ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2410:1: (lv_lvalue_28_0= ruleLocalValue )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2410:1: (lv_lvalue_28_0= ruleLocalValue )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2411:3: lv_lvalue_28_0= ruleLocalValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getLvalueLocalValueParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLocalValue_in_ruleWorkItem5072);
                    lv_lvalue_28_0=ruleLocalValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"lvalue",
                            		lv_lvalue_28_0, 
                            		"LocalValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2427:4: (otherlv_29= 'classOfService' ( (lv_COS_30_0= RULE_ID ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==55) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2427:6: otherlv_29= 'classOfService' ( (lv_COS_30_0= RULE_ID ) )
                    {
                    otherlv_29=(Token)match(input,55,FOLLOW_55_in_ruleWorkItem5087); 

                        	newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getClassOfServiceKeyword_14_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2431:1: ( (lv_COS_30_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2432:1: (lv_COS_30_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2432:1: (lv_COS_30_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2433:3: lv_COS_30_0= RULE_ID
                    {
                    lv_COS_30_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5104); 

                    			newLeafNode(lv_COS_30_0, grammarAccess.getWorkItemAccess().getCOSIDTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"COS",
                            		lv_COS_30_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2449:4: (otherlv_31= 'WorkSource' ( (otherlv_32= RULE_ID ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==80) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2449:6: otherlv_31= 'WorkSource' ( (otherlv_32= RULE_ID ) )
                    {
                    otherlv_31=(Token)match(input,80,FOLLOW_80_in_ruleWorkItem5124); 

                        	newLeafNode(otherlv_31, grammarAccess.getWorkItemAccess().getWorkSourceKeyword_15_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2453:1: ( (otherlv_32= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2454:1: (otherlv_32= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2454:1: (otherlv_32= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2455:3: otherlv_32= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_32=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5144); 

                    		newLeafNode(otherlv_32, grammarAccess.getWorkItemAccess().getWItemSourceWorkSourceCrossReference_15_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2466:4: (otherlv_33= 'arrivalTime' ( (lv_arrtime_34_0= RULE_INT ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==81) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2466:6: otherlv_33= 'arrivalTime' ( (lv_arrtime_34_0= RULE_INT ) )
                    {
                    otherlv_33=(Token)match(input,81,FOLLOW_81_in_ruleWorkItem5159); 

                        	newLeafNode(otherlv_33, grammarAccess.getWorkItemAccess().getArrivalTimeKeyword_16_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2470:1: ( (lv_arrtime_34_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2471:1: (lv_arrtime_34_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2471:1: (lv_arrtime_34_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2472:3: lv_arrtime_34_0= RULE_INT
                    {
                    lv_arrtime_34_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem5176); 

                    			newLeafNode(lv_arrtime_34_0, grammarAccess.getWorkItemAccess().getArrtimeINTTerminalRuleCall_16_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arrtime",
                            		lv_arrtime_34_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2488:4: (otherlv_35= 'dueDate' ( (lv_duedate_36_0= RULE_INT ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==82) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2488:6: otherlv_35= 'dueDate' ( (lv_duedate_36_0= RULE_INT ) )
                    {
                    otherlv_35=(Token)match(input,82,FOLLOW_82_in_ruleWorkItem5196); 

                        	newLeafNode(otherlv_35, grammarAccess.getWorkItemAccess().getDueDateKeyword_17_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2492:1: ( (lv_duedate_36_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2493:1: (lv_duedate_36_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2493:1: (lv_duedate_36_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2494:3: lv_duedate_36_0= RULE_INT
                    {
                    lv_duedate_36_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem5213); 

                    			newLeafNode(lv_duedate_36_0, grammarAccess.getWorkItemAccess().getDuedateINTTerminalRuleCall_17_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duedate",
                            		lv_duedate_36_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_37=(Token)match(input,46,FOLLOW_46_in_ruleWorkItem5232); 

                	newLeafNode(otherlv_37, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_18());
                

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2522:1: entryRuleCausality returns [EObject current=null] : iv_ruleCausality= ruleCausality EOF ;
    public final EObject entryRuleCausality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCausality = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2523:2: (iv_ruleCausality= ruleCausality EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2524:2: iv_ruleCausality= ruleCausality EOF
            {
             newCompositeNode(grammarAccess.getCausalityRule()); 
            pushFollow(FOLLOW_ruleCausality_in_entryRuleCausality5268);
            iv_ruleCausality=ruleCausality();

            state._fsp--;

             current =iv_ruleCausality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCausality5278); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2531:1: ruleCausality returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2534:28: ( ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2535:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2535:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2535:2: (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2535:2: (otherlv_0= '=>' | otherlv_1= '->' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==83) ) {
                alt71=1;
            }
            else if ( (LA71_0==84) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2535:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleCausality5316); 

                        	newLeafNode(otherlv_0, grammarAccess.getCausalityAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2540:7: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleCausality5334); 

                        	newLeafNode(otherlv_1, grammarAccess.getCausalityAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleCausality5347); 

                	newLeafNode(otherlv_2, grammarAccess.getCausalityAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2548:1: ( (otherlv_3= RULE_ID ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_ID) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2549:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2549:1: (otherlv_3= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2550:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCausalityRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCausality5367); 

            	    		newLeafNode(otherlv_3, grammarAccess.getCausalityAccess().getTriggeredWorkItemCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleCausality5380); 

                	newLeafNode(otherlv_4, grammarAccess.getCausalityAccess().getRightCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2565:1: (otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==85) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2565:3: otherlv_5= 'atProgress' ( (lv_tProgress_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,85,FOLLOW_85_in_ruleCausality5393); 

                        	newLeafNode(otherlv_5, grammarAccess.getCausalityAccess().getAtProgressKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2569:1: ( (lv_tProgress_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2570:1: (lv_tProgress_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2570:1: (lv_tProgress_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2571:3: lv_tProgress_6_0= RULE_INT
                    {
                    lv_tProgress_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausality5410); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2587:4: (otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==86) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2587:6: otherlv_7= 'onProbability' ( (lv_tProbability_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,86,FOLLOW_86_in_ruleCausality5430); 

                        	newLeafNode(otherlv_7, grammarAccess.getCausalityAccess().getOnProbabilityKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2591:1: ( (lv_tProbability_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2592:1: (lv_tProbability_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2592:1: (lv_tProbability_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2593:3: lv_tProbability_8_0= RULE_INT
                    {
                    lv_tProbability_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausality5447); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2617:1: entryRuleLocalValue returns [EObject current=null] : iv_ruleLocalValue= ruleLocalValue EOF ;
    public final EObject entryRuleLocalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalValue = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2618:2: (iv_ruleLocalValue= ruleLocalValue EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2619:2: iv_ruleLocalValue= ruleLocalValue EOF
            {
             newCompositeNode(grammarAccess.getLocalValueRule()); 
            pushFollow(FOLLOW_ruleLocalValue_in_entryRuleLocalValue5490);
            iv_ruleLocalValue=ruleLocalValue();

            state._fsp--;

             current =iv_ruleLocalValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalValue5500); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2626:1: ruleLocalValue returns [EObject current=null] : ( (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleLocalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2629:28: ( ( (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2630:1: ( (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2630:1: ( (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2630:2: (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2630:2: (otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2630:4: otherlv_0= 'owner' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleLocalValue5538); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalValueAccess().getOwnerKeyword_0_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2634:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2635:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2635:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2636:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalValueRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalValue5558); 

            		newLeafNode(otherlv_1, grammarAccess.getLocalValueAccess().getOwnerServiceProviderCrossReference_0_1_0()); 
            	

            }


            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2647:3: (otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2647:5: otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,88,FOLLOW_88_in_ruleLocalValue5572); 

                	newLeafNode(otherlv_2, grammarAccess.getLocalValueAccess().getValueKeyword_1_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2651:1: ( (lv_value_3_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2652:1: (lv_value_3_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2652:1: (lv_value_3_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2653:3: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLocalValue5589); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2677:1: entryRuleServiceType returns [EObject current=null] : iv_ruleServiceType= ruleServiceType EOF ;
    public final EObject entryRuleServiceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2678:2: (iv_ruleServiceType= ruleServiceType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2679:2: iv_ruleServiceType= ruleServiceType EOF
            {
             newCompositeNode(grammarAccess.getServiceTypeRule()); 
            pushFollow(FOLLOW_ruleServiceType_in_entryRuleServiceType5631);
            iv_ruleServiceType=ruleServiceType();

            state._fsp--;

             current =iv_ruleServiceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceType5641); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2686:1: ruleServiceType returns [EObject current=null] : (otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2689:28: ( (otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2690:1: (otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2690:1: (otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2690:3: otherlv_0= 'serviceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleServiceType5678); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceTypeAccess().getServiceTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2694:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2695:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2695:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2696:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceType5695); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2712:2: (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==45) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2712:4: otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleServiceType5713); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceTypeAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2716:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==49) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2716:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleServiceType5726); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceTypeAccess().getDescriptionKeyword_2_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2720:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2721:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2721:1: (lv_description_4_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2722:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceType5743); 

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

                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleServiceType5762); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2750:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2751:2: (iv_ruleService= ruleService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2752:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService5800);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService5810); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2759:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2762:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2763:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2763:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2763:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleService5847); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2767:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2768:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2768:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2769:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService5864); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2785:2: (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==45) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2785:4: otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )? otherlv_9= '}'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleService5882); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2789:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==49) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2789:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleService5895); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDescriptionKeyword_2_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2793:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2794:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2794:1: (lv_description_4_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2795:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService5912); 

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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2811:4: (otherlv_5= 'type' ( (otherlv_6= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2811:6: otherlv_5= 'type' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,90,FOLLOW_90_in_ruleService5932); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getTypeKeyword_2_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2815:1: ( (otherlv_6= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2816:1: (otherlv_6= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2816:1: (otherlv_6= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2817:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService5952); 

                    		newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getServiceTypeServiceTypeCrossReference_2_2_1_0()); 
                    	

                    }


                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2828:3: (otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==91) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2828:5: otherlv_7= 'efficiency' ( (lv_efficiency_8_0= RULE_INT ) )
                            {
                            otherlv_7=(Token)match(input,91,FOLLOW_91_in_ruleService5966); 

                                	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getEfficiencyKeyword_2_3_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2832:1: ( (lv_efficiency_8_0= RULE_INT ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2833:1: (lv_efficiency_8_0= RULE_INT )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2833:1: (lv_efficiency_8_0= RULE_INT )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2834:3: lv_efficiency_8_0= RULE_INT
                            {
                            lv_efficiency_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleService5983); 

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

                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleService6002); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2862:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2863:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2864:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider6040);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProvider6050); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2871:1: ruleServiceProvider returns [EObject current=null] : ( (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2874:28: ( ( (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2875:1: ( (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2875:1: ( (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2875:2: (otherlv_0= 'serviceProvider' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2875:2: (otherlv_0= 'serviceProvider' | otherlv_1= 'group' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==92) ) {
                alt80=1;
            }
            else if ( (LA80_0==93) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2875:4: otherlv_0= 'serviceProvider'
                    {
                    otherlv_0=(Token)match(input,92,FOLLOW_92_in_ruleServiceProvider6088); 

                        	newLeafNode(otherlv_0, grammarAccess.getServiceProviderAccess().getServiceProviderKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2880:7: otherlv_1= 'group'
                    {
                    otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleServiceProvider6106); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getGroupKeyword_0_1());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2884:2: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2885:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2885:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2886:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6124); 

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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleServiceProvider6141); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2906:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==49) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2906:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleServiceProvider6154); 

                        	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2910:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2911:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2911:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2912:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceProvider6171); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2928:4: (otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==94) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2928:6: otherlv_6= 'sourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,94,FOLLOW_94_in_ruleServiceProvider6191); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getSourceUnitsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleServiceProvider6203); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2936:1: ( (otherlv_8= RULE_ID ) )+
                    int cnt82=0;
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==RULE_ID) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2937:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2937:1: (otherlv_8= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2938:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6223); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getSourceUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt82 >= 1 ) break loop82;
                                EarlyExitException eee =
                                    new EarlyExitException(82, input);
                                throw eee;
                        }
                        cnt82++;
                    } while (true);

                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleServiceProvider6236); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2953:3: (otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==72) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2953:5: otherlv_10= 'targetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,72,FOLLOW_72_in_ruleServiceProvider6251); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getTargetUnitsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleServiceProvider6263); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2961:1: ( (otherlv_12= RULE_ID ) )+
                    int cnt84=0;
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==RULE_ID) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2962:1: (otherlv_12= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2962:1: (otherlv_12= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2963:3: otherlv_12= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6283); 

                    	    		newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getTargetUnitsServiceProviderCrossReference_5_2_0()); 
                    	    	

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

                    otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleServiceProvider6296); 

                        	newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2978:3: (otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==95) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2978:5: otherlv_14= 'subordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,95,FOLLOW_95_in_ruleServiceProvider6311); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getSubordinateUnitsKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,45,FOLLOW_45_in_ruleServiceProvider6323); 

                        	newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2986:1: ( (otherlv_16= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2987:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2987:1: (otherlv_16= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2988:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6343); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getSubordinateUnitsServiceProviderCrossReference_6_2_0()); 
                    	    	

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

                    otherlv_17=(Token)match(input,46,FOLLOW_46_in_ruleServiceProvider6356); 

                        	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3003:3: (otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==96) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3003:5: otherlv_18= 'services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,96,FOLLOW_96_in_ruleServiceProvider6371); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getServicesKeyword_7_0());
                        
                    otherlv_19=(Token)match(input,45,FOLLOW_45_in_ruleServiceProvider6383); 

                        	newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3011:1: ( (lv_services_20_0= ruleService ) )+
                    int cnt88=0;
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==89) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3012:1: (lv_services_20_0= ruleService )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3012:1: (lv_services_20_0= ruleService )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3013:3: lv_services_20_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getServicesServiceParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleServiceProvider6404);
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
                    	    if ( cnt88 >= 1 ) break loop88;
                                EarlyExitException eee =
                                    new EarlyExitException(88, input);
                                throw eee;
                        }
                        cnt88++;
                    } while (true);

                    otherlv_21=(Token)match(input,46,FOLLOW_46_in_ruleServiceProvider6417); 

                        	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3033:3: (otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==97) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3033:5: otherlv_22= 'governanceSearchStrategy' otherlv_23= '{' otherlv_24= 'default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}'
                    {
                    otherlv_22=(Token)match(input,97,FOLLOW_97_in_ruleServiceProvider6432); 

                        	newLeafNode(otherlv_22, grammarAccess.getServiceProviderAccess().getGovernanceSearchStrategyKeyword_8_0());
                        
                    otherlv_23=(Token)match(input,45,FOLLOW_45_in_ruleServiceProvider6444); 

                        	newLeafNode(otherlv_23, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    otherlv_24=(Token)match(input,98,FOLLOW_98_in_ruleServiceProvider6456); 

                        	newLeafNode(otherlv_24, grammarAccess.getServiceProviderAccess().getDefaultKeyword_8_2());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3045:1: ( (otherlv_25= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3046:1: (otherlv_25= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3046:1: (otherlv_25= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3047:3: otherlv_25= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6476); 

                    		newLeafNode(otherlv_25, grammarAccess.getServiceProviderAccess().getDefaultStrategyStrategyCrossReference_8_3_0()); 
                    	

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3058:2: (otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==99) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3058:4: otherlv_26= 'specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}'
                            {
                            otherlv_26=(Token)match(input,99,FOLLOW_99_in_ruleServiceProvider6489); 

                                	newLeafNode(otherlv_26, grammarAccess.getServiceProviderAccess().getSpecifiedKeyword_8_4_0());
                                
                            otherlv_27=(Token)match(input,45,FOLLOW_45_in_ruleServiceProvider6501); 

                                	newLeafNode(otherlv_27, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_8_4_1());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3066:1: ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==64) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3067:1: (lv_acceptanceRule_28_0= ruleWIAcceptance )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3067:1: (lv_acceptanceRule_28_0= ruleWIAcceptance )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3068:3: lv_acceptanceRule_28_0= ruleWIAcceptance
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAcceptanceRuleWIAcceptanceParserRuleCall_8_4_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWIAcceptance_in_ruleServiceProvider6522);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3084:3: ( (lv_selectionRule_29_0= ruleWISelection ) )?
                            int alt91=2;
                            int LA91_0 = input.LA(1);

                            if ( (LA91_0==67) ) {
                                alt91=1;
                            }
                            switch (alt91) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3085:1: (lv_selectionRule_29_0= ruleWISelection )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3085:1: (lv_selectionRule_29_0= ruleWISelection )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3086:3: lv_selectionRule_29_0= ruleWISelection
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getSelectionRuleWISelectionParserRuleCall_8_4_3_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWISelection_in_ruleServiceProvider6544);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3102:3: ( (lv_assignmentRule_30_0= ruleWIAssignment ) )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==68) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3103:1: (lv_assignmentRule_30_0= ruleWIAssignment )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3103:1: (lv_assignmentRule_30_0= ruleWIAssignment )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3104:3: lv_assignmentRule_30_0= ruleWIAssignment
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAssignmentRuleWIAssignmentParserRuleCall_8_4_4_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleServiceProvider6566);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3120:3: ( (lv_allocationRule_31_0= ruleResourceAllocation ) )?
                            int alt93=2;
                            int LA93_0 = input.LA(1);

                            if ( (LA93_0==69) ) {
                                alt93=1;
                            }
                            switch (alt93) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3121:1: (lv_allocationRule_31_0= ruleResourceAllocation )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3121:1: (lv_allocationRule_31_0= ruleResourceAllocation )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3122:3: lv_allocationRule_31_0= ruleResourceAllocation
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAllocationRuleResourceAllocationParserRuleCall_8_4_5_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleResourceAllocation_in_ruleServiceProvider6588);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3138:3: ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )?
                            int alt94=2;
                            int LA94_0 = input.LA(1);

                            if ( (LA94_0==70) ) {
                                alt94=1;
                            }
                            switch (alt94) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3139:1: (lv_outsourcingRule_32_0= ruleResourceOutsourcing )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3139:1: (lv_outsourcingRule_32_0= ruleResourceOutsourcing )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3140:3: lv_outsourcingRule_32_0= ruleResourceOutsourcing
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getOutsourcingRuleResourceOutsourcingParserRuleCall_8_4_6_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleServiceProvider6610);
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

                            otherlv_33=(Token)match(input,46,FOLLOW_46_in_ruleServiceProvider6623); 

                                	newLeafNode(otherlv_33, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_8_4_7());
                                

                            }
                            break;

                    }

                    otherlv_34=(Token)match(input,46,FOLLOW_46_in_ruleServiceProvider6637); 

                        	newLeafNode(otherlv_34, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_8_5());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3164:3: (otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==100) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3164:5: otherlv_35= 'resources' otherlv_36= '{' ( (lv_resources_37_0= ruleResource ) )+ otherlv_38= '}'
                    {
                    otherlv_35=(Token)match(input,100,FOLLOW_100_in_ruleServiceProvider6652); 

                        	newLeafNode(otherlv_35, grammarAccess.getServiceProviderAccess().getResourcesKeyword_9_0());
                        
                    otherlv_36=(Token)match(input,45,FOLLOW_45_in_ruleServiceProvider6664); 

                        	newLeafNode(otherlv_36, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3172:1: ( (lv_resources_37_0= ruleResource ) )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==101) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3173:1: (lv_resources_37_0= ruleResource )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3173:1: (lv_resources_37_0= ruleResource )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3174:3: lv_resources_37_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesResourceParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResource_in_ruleServiceProvider6685);
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
                    	    if ( cnt97 >= 1 ) break loop97;
                                EarlyExitException eee =
                                    new EarlyExitException(97, input);
                                throw eee;
                        }
                        cnt97++;
                    } while (true);

                    otherlv_38=(Token)match(input,46,FOLLOW_46_in_ruleServiceProvider6698); 

                        	newLeafNode(otherlv_38, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,46,FOLLOW_46_in_ruleServiceProvider6712); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3206:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3207:2: (iv_ruleResource= ruleResource EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3208:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource6748);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource6758); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3215:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3218:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3219:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3219:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3219:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleResource6795); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3223:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3224:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3224:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3225:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource6812); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleResource6829); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3245:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==49) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3245:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleResource6842); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3249:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3250:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3250:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3251:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource6859); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3267:4: (otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==96) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3267:6: otherlv_5= 'services' otherlv_6= '{' ( (lv_services_7_0= ruleService ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,96,FOLLOW_96_in_ruleResource6879); 

                        	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getServicesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleResource6891); 

                        	newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3275:1: ( (lv_services_7_0= ruleService ) )+
                    int cnt100=0;
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==89) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3276:1: (lv_services_7_0= ruleService )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3276:1: (lv_services_7_0= ruleService )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3277:3: lv_services_7_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceAccess().getServicesServiceParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleResource6912);
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
                    	    if ( cnt100 >= 1 ) break loop100;
                                EarlyExitException eee =
                                    new EarlyExitException(100, input);
                                throw eee;
                        }
                        cnt100++;
                    } while (true);

                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleResource6925); 

                        	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleResource6939); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3311:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3312:2: (iv_ruleSkill= ruleSkill EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3313:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_ruleSkill_in_entryRuleSkill6977);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkill6987); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3320:1: ruleSkill returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )? ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3323:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3324:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3324:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3324:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3324:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3325:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3325:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3326:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkill7029); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3342:2: (otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==45) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3342:4: otherlv_1= '{' (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleSkill7047); 

                        	newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3346:1: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==49) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3346:3: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleSkill7060); 

                                	newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getDescriptionKeyword_1_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3350:1: ( (lv_description_3_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3351:1: (lv_description_3_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3351:1: (lv_description_3_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3352:3: lv_description_3_0= RULE_STRING
                            {
                            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSkill7077); 

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

                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleSkill7096); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3382:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3383:2: (iv_ruleCapability= ruleCapability EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3384:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_ruleCapability_in_entryRuleCapability7136);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCapability7146); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3391:1: ruleCapability returns [EObject current=null] : (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3394:28: ( (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3395:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3395:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3395:3: otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleCapability7183); 

                	newLeafNode(otherlv_0, grammarAccess.getCapabilityAccess().getCapabilityKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3399:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3400:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3400:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3401:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCapability7200); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleCapability7217); 

                	newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3421:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==49) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3421:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleCapability7230); 

                        	newLeafNode(otherlv_3, grammarAccess.getCapabilityAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3425:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3426:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3426:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3427:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCapability7247); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3443:4: ( (lv_reqs_5_0= ruleRequirement ) )+
            int cnt105=0;
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==103) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3444:1: (lv_reqs_5_0= ruleRequirement )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3444:1: (lv_reqs_5_0= ruleRequirement )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3445:3: lv_reqs_5_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleCapability7275);
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
            	    if ( cnt105 >= 1 ) break loop105;
                        EarlyExitException eee =
                            new EarlyExitException(105, input);
                        throw eee;
                }
                cnt105++;
            } while (true);

            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleCapability7288); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3473:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3474:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3475:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement7324);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement7334); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3482:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3485:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3486:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3486:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3486:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_103_in_ruleRequirement7371); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3490:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3491:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3491:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3492:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement7388); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleRequirement7405); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3512:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==49) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3512:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleRequirement7418); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3516:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3517:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3517:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3518:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirement7435); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3534:4: (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3534:6: otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
            {
            otherlv_5=(Token)match(input,104,FOLLOW_104_in_ruleRequirement7455); 

                	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getWorkItemsKeyword_4_0());
                
            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleRequirement7467); 

                	newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_4_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3542:1: ( (otherlv_7= RULE_ID ) )+
            int cnt107=0;
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==RULE_ID) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3543:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3543:1: (otherlv_7= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3544:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement7487); 

            	    		newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getRTasksWorkItemCrossReference_4_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt107 >= 1 ) break loop107;
                        EarlyExitException eee =
                            new EarlyExitException(107, input);
                        throw eee;
                }
                cnt107++;
            } while (true);

            otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleRequirement7500); 

                	newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4_3());
                

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3559:2: (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==105) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3559:4: otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )*
                    {
                    otherlv_9=(Token)match(input,105,FOLLOW_105_in_ruleRequirement7514); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3563:1: ( (lv_dependencies_10_0= ruleCausality ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( ((LA108_0>=83 && LA108_0<=84)) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3564:1: (lv_dependencies_10_0= ruleCausality )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3564:1: (lv_dependencies_10_0= ruleCausality )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3565:3: lv_dependencies_10_0= ruleCausality
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesCausalityParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausality_in_ruleRequirement7535);
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
                    	    break loop108;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleRequirement7550); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3595:1: entryRuleProvision returns [EObject current=null] : iv_ruleProvision= ruleProvision EOF ;
    public final EObject entryRuleProvision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvision = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3596:2: (iv_ruleProvision= ruleProvision EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3597:2: iv_ruleProvision= ruleProvision EOF
            {
             newCompositeNode(grammarAccess.getProvisionRule()); 
            pushFollow(FOLLOW_ruleProvision_in_entryRuleProvision7588);
            iv_ruleProvision=ruleProvision();

            state._fsp--;

             current =iv_ruleProvision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvision7598); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3604:1: ruleProvision returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3607:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3608:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3608:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3608:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleProvision7635); 

                	newLeafNode(otherlv_0, grammarAccess.getProvisionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3612:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3613:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3613:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3614:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProvisionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision7655); 

            		newLeafNode(otherlv_1, grammarAccess.getProvisionAccess().getServiceNameServiceTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,107,FOLLOW_107_in_ruleProvision7667); 

                	newLeafNode(otherlv_2, grammarAccess.getProvisionAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleProvision7679); 

                	newLeafNode(otherlv_3, grammarAccess.getProvisionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3633:1: ( (otherlv_4= RULE_ID ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==RULE_ID) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3634:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3634:1: (otherlv_4= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3635:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProvisionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision7699); 

            	    		newLeafNode(otherlv_4, grammarAccess.getProvisionAccess().getProvidersServiceProviderCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleProvision7712); 

                	newLeafNode(otherlv_5, grammarAccess.getProvisionAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,108,FOLLOW_108_in_ruleProvision7724); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3662:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3663:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3664:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine7760);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine7770); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3671:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3674:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3675:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3675:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3675:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )*
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3675:2: ()
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3676:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3681:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==109) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3681:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,109,FOLLOW_109_in_ruleStatemachine7817); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3685:1: ( (lv_events_2_0= ruleEvent ) )+
                    int cnt111=0;
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==RULE_ID) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3686:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3686:1: (lv_events_2_0= ruleEvent )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3687:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine7838);
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
                    	    if ( cnt111 >= 1 ) break loop111;
                                EarlyExitException eee =
                                    new EarlyExitException(111, input);
                                throw eee;
                        }
                        cnt111++;
                    } while (true);

                    otherlv_3=(Token)match(input,110,FOLLOW_110_in_ruleStatemachine7851); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3707:3: (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==111) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3707:5: otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,111,FOLLOW_111_in_ruleStatemachine7866); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getActivitiesKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3711:1: ( (lv_commands_5_0= ruleCommand ) )+
                    int cnt113=0;
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==RULE_ID) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3712:1: (lv_commands_5_0= ruleCommand )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3712:1: (lv_commands_5_0= ruleCommand )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3713:3: lv_commands_5_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleStatemachine7887);
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
                    	    if ( cnt113 >= 1 ) break loop113;
                                EarlyExitException eee =
                                    new EarlyExitException(113, input);
                                throw eee;
                        }
                        cnt113++;
                    } while (true);

                    otherlv_6=(Token)match(input,110,FOLLOW_110_in_ruleStatemachine7900); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3733:3: ( (lv_states_7_0= ruleState ) )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==112) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3734:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3734:1: (lv_states_7_0= ruleState )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3735:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine7923);
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
            	    break loop115;
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3759:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3760:2: (iv_ruleEvent= ruleEvent EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3761:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent7960);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent7970); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3768:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3771:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3772:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3772:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3772:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3772:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3773:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3773:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3774:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent8012); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3790:2: ( (lv_code_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3791:1: (lv_code_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3791:1: (lv_code_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3792:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent8034); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3816:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3817:2: (iv_ruleCommand= ruleCommand EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3818:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand8075);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand8085); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3825:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3828:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3829:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3829:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3829:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3829:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3830:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3830:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3831:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand8127); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3847:2: ( (lv_code_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3848:1: (lv_code_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3848:1: (lv_code_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3849:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand8149); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3873:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3874:2: (iv_ruleState= ruleState EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3875:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState8190);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState8200); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3882:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3885:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3886:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3886:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3886:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_112_in_ruleState8237); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3890:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3891:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3891:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3892:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState8254); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3908:2: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==113) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3908:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,113,FOLLOW_113_in_ruleState8272); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleState8284); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3916:1: ( (otherlv_4= RULE_ID ) )+
                    int cnt116=0;
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==RULE_ID) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3917:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3917:1: (otherlv_4= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3918:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState8304); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt116 >= 1 ) break loop116;
                                EarlyExitException eee =
                                    new EarlyExitException(116, input);
                                throw eee;
                        }
                        cnt116++;
                    } while (true);

                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleState8317); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3933:3: ( (lv_transitions_6_0= ruleTransition ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==RULE_ID) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3934:1: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3934:1: (lv_transitions_6_0= ruleTransition )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3935:3: lv_transitions_6_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState8340);
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
            	    break loop118;
                }
            } while (true);

            otherlv_7=(Token)match(input,110,FOLLOW_110_in_ruleState8353); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3963:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3964:2: (iv_ruleTransition= ruleTransition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3965:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition8389);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition8399); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3972:1: ruleTransition returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3975:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3976:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3976:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_ID) ) {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==114) ) {
                    alt120=2;
                }
                else if ( (LA120_1==83) ) {
                    alt120=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3976:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3976:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3976:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3976:3: ( (otherlv_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3977:1: (otherlv_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3977:1: (otherlv_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3978:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8445); 

                    		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleTransition8457); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3993:1: ( (otherlv_2= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3994:1: (otherlv_2= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3994:1: (otherlv_2= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3995:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8477); 

                    		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4007:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4007:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4007:7: ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4007:7: ( (otherlv_3= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4008:1: (otherlv_3= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4008:1: (otherlv_3= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4009:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8505); 

                    		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,114,FOLLOW_114_in_ruleTransition8517); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSolidusKeyword_1_1());
                        
                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleTransition8529); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4028:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt119=0;
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==RULE_ID) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4029:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4029:1: (otherlv_6= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4030:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8549); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getEventactionsCommandCrossReference_1_3_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt119 >= 1 ) break loop119;
                                EarlyExitException eee =
                                    new EarlyExitException(119, input);
                                throw eee;
                        }
                        cnt119++;
                    } while (true);

                    otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleTransition8562); 

                        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_4());
                        
                    otherlv_8=(Token)match(input,83,FOLLOW_83_in_ruleTransition8574); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_5());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4049:1: ( (otherlv_9= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4050:1: (otherlv_9= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4050:1: (otherlv_9= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4051:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8594); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleKanbanSchedulingSystem139 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleKanbanSchedulingSystem165 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleKanbanSchedulingSystem179 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleRepository_in_ruleKanbanSchedulingSystem200 = new BitSet(new long[]{0x0000080000002000L});
    public static final BitSet FOLLOW_13_in_ruleKanbanSchedulingSystem213 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKanbanSchedulingSystem227 = new BitSet(new long[]{0x20000000002A8000L});
    public static final BitSet FOLLOW_ruleMechanism_in_ruleKanbanSchedulingSystem248 = new BitSet(new long[]{0x00000000002A8000L});
    public static final BitSet FOLLOW_15_in_ruleKanbanSchedulingSystem262 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ruleStrategy_in_ruleKanbanSchedulingSystem283 = new BitSet(new long[]{0x8000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleKanbanSchedulingSystem296 = new BitSet(new long[]{0x00000000002A0000L});
    public static final BitSet FOLLOW_17_in_ruleKanbanSchedulingSystem311 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleTaskPattern_in_ruleKanbanSchedulingSystem332 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_ruleTaskType_in_ruleKanbanSchedulingSystem354 = new BitSet(new long[]{0x0800000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKanbanSchedulingSystem367 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleKanbanSchedulingSystem382 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleValueFunction_in_ruleKanbanSchedulingSystem403 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleKanbanSchedulingSystem416 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleKanbanSchedulingSystem430 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleKanbanSchedulingSystem442 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleKanbanSchedulingSystem454 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleServiceType_in_ruleKanbanSchedulingSystem475 = new BitSet(new long[]{0x0010000001000000L});
    public static final BitSet FOLLOW_24_in_ruleKanbanSchedulingSystem488 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleKanbanSchedulingSystem500 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_ruleKanbanSchedulingSystem521 = new BitSet(new long[]{0x0000000004000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_26_in_ruleKanbanSchedulingSystem534 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleKanbanSchedulingSystem546 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleKanbanSchedulingSystem558 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleKanbanSchedulingSystem570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleWorkSource_in_ruleKanbanSchedulingSystem591 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_30_in_ruleKanbanSchedulingSystem604 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleKanbanSchedulingSystem616 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleWorkItem_in_ruleKanbanSchedulingSystem637 = new BitSet(new long[]{0x0001000100000000L});
    public static final BitSet FOLLOW_32_in_ruleKanbanSchedulingSystem650 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleKanbanSchedulingSystem662 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleKanbanSchedulingSystem674 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleKanbanSchedulingSystem686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem703 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleKanbanSchedulingSystem720 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem737 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleKanbanSchedulingSystem754 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleKanbanSchedulingSystem766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName854 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName888 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble987 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleDouble1006 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumExpression_in_entryRuleNumExpression1068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumExpression1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleNumExpression1124 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleNumExpression1144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleNumExpression1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleParameter1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution1346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDistribution1398 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleDistribution1415 = new BitSet(new long[]{0x0000040000000030L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDistribution1436 = new BitSet(new long[]{0x0000040000000030L});
    public static final BitSet FOLLOW_42_in_ruleDistribution1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepository_in_entryRuleRepository1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepository1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRepository1532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepository1552 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleRepository1564 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleRepository1576 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_ruleWorkItemProfile_in_ruleRepository1597 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleRepository1610 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRepository1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemProfile_in_entryRuleWorkItemProfile1658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemProfile1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleWorkItemProfile1705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile1722 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWorkItemProfile1739 = new BitSet(new long[]{0x00FE400000000000L});
    public static final BitSet FOLLOW_49_in_ruleWorkItemProfile1752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemProfile1769 = new BitSet(new long[]{0x00FC400000000000L});
    public static final BitSet FOLLOW_50_in_ruleWorkItemProfile1789 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWorkItemProfile1801 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleWorkReference_in_ruleWorkItemProfile1822 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleWorkItemProfile1835 = new BitSet(new long[]{0x00F8400000000000L});
    public static final BitSet FOLLOW_51_in_ruleWorkItemProfile1850 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWorkItemProfile1862 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleWorkDecomposition_in_ruleWorkItemProfile1883 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleWorkItemProfile1896 = new BitSet(new long[]{0x00F0400000000000L});
    public static final BitSet FOLLOW_52_in_ruleWorkItemProfile1911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile1931 = new BitSet(new long[]{0x00E0400000000010L});
    public static final BitSet FOLLOW_53_in_ruleWorkItemProfile1947 = new BitSet(new long[]{0x00C0410000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItemProfile1968 = new BitSet(new long[]{0x00C0400000000000L});
    public static final BitSet FOLLOW_54_in_ruleWorkItemProfile1983 = new BitSet(new long[]{0x0080410000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItemProfile2004 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_55_in_ruleWorkItemProfile2019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile2036 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleWorkItemProfile2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkReference_in_entryRuleWorkReference2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkReference2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleWorkReference2138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkReference2158 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleWorkReference2170 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkReference2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDecomposition_in_entryRuleWorkDecomposition2227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkDecomposition2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleWorkDecomposition2274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkDecomposition2294 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleWorkDecomposition2306 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkDecomposition2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskPattern_in_entryRuleTaskPattern2367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskPattern2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTaskPattern2414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskPattern2431 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleTaskPattern2448 = new BitSet(new long[]{0x0402400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTaskPattern2461 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskPattern2478 = new BitSet(new long[]{0x0400400000000000L});
    public static final BitSet FOLLOW_58_in_ruleTaskPattern2498 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleTaskPattern2510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskPattern2530 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleTaskPattern2543 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTaskPattern2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskType_in_entryRuleTaskType2593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskType2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTaskType2640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskType2657 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleTaskType2674 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleTaskType2687 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskType2704 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTaskType2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueFunction_in_entryRuleValueFunction2759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueFunction2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleValueFunction2806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueFunction2823 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleValueFunction2840 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleValueFunction2853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueFunction2870 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleValueFunction2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanism_in_entryRuleMechanism2925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanism2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMechanism2972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechanism2989 = new BitSet(new long[]{0x4002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleMechanism3007 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanism3024 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleMechanism3044 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanism3061 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ruleStrategy_in_ruleMechanism3088 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy3125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategy3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleStrategy3172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategy3189 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleStrategy3206 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49_in_ruleStrategy3219 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStrategy3236 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleStrategy3264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleStrategy3285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleStrategy3306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleStrategy3327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleStrategy3348 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStrategy3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance3396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptance3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleWIAcceptance3443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptance3460 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWIAcceptance3477 = new BitSet(new long[]{0x0002400000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_49_in_ruleWIAcceptance3490 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptance3507 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_ruleWIAcceptance3527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance3544 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleWIAcceptance3564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance3581 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleWIAcceptance3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelection_in_entryRuleWISelection3636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelection3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleWISelection3683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelection3700 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWISelection3717 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleWISelection3730 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelection3747 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleWISelection3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment3802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignment3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleWIAssignment3849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignment3866 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWIAssignment3883 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleWIAssignment3896 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignment3913 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleWIAssignment3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation3968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocation3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleResourceAllocation4015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocation4032 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleResourceAllocation4049 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleResourceAllocation4062 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocation4079 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleResourceAllocation4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing4134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcing4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleResourceOutsourcing4181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcing4198 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleResourceOutsourcing4215 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleResourceOutsourcing4228 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcing4245 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleResourceOutsourcing4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSource_in_entryRuleWorkSource4300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSource4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleWorkSource4347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4364 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWorkSource4381 = new BitSet(new long[]{0x0002400000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_49_in_ruleWorkSource4394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkSource4411 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_72_in_ruleWorkSource4431 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWorkSource4443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4463 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleWorkSource4476 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleWorkSource4499 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleWorkSource4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItem_in_entryRuleWorkItem4548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItem4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleWorkItem4595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4612 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWorkItem4629 = new BitSet(new long[]{0x00F2400000000000L,0x000000000007FE00L});
    public static final BitSet FOLLOW_73_in_ruleWorkItem4642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4662 = new BitSet(new long[]{0x00F2400000000000L,0x000000000007FC00L});
    public static final BitSet FOLLOW_49_in_ruleWorkItem4677 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItem4694 = new BitSet(new long[]{0x00F0400000000000L,0x000000000007FC00L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem4714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4734 = new BitSet(new long[]{0x00F0400000000000L,0x000000000007F800L});
    public static final BitSet FOLLOW_75_in_ruleWorkItem4749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4769 = new BitSet(new long[]{0x00F0400000000000L,0x000000000007F000L});
    public static final BitSet FOLLOW_76_in_ruleWorkItem4784 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWorkItem4796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4816 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleWorkItem4829 = new BitSet(new long[]{0x00F0400000000000L,0x000000000007E000L});
    public static final BitSet FOLLOW_77_in_ruleWorkItem4844 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleWorkItem4856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4876 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleWorkItem4889 = new BitSet(new long[]{0x00F0400000000000L,0x000000000007C000L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem4904 = new BitSet(new long[]{0x00F0400000000000L,0x00000000001F8000L});
    public static final BitSet FOLLOW_ruleCausality_in_ruleWorkItem4925 = new BitSet(new long[]{0x00F0400000000000L,0x00000000001F8000L});
    public static final BitSet FOLLOW_52_in_ruleWorkItem4941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4961 = new BitSet(new long[]{0x00E0400000000010L,0x0000000000078000L});
    public static final BitSet FOLLOW_53_in_ruleWorkItem4977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem4994 = new BitSet(new long[]{0x00C0400000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_54_in_ruleWorkItem5014 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem5031 = new BitSet(new long[]{0x0080400000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_79_in_ruleWorkItem5051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleLocalValue_in_ruleWorkItem5072 = new BitSet(new long[]{0x0080400000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_55_in_ruleWorkItem5087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5104 = new BitSet(new long[]{0x0000400000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_80_in_ruleWorkItem5124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5144 = new BitSet(new long[]{0x0000400000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleWorkItem5159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem5176 = new BitSet(new long[]{0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleWorkItem5196 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem5213 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleWorkItem5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCausality_in_entryRuleCausality5268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCausality5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleCausality5316 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_84_in_ruleCausality5334 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCausality5347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCausality5367 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleCausality5380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_85_in_ruleCausality5393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausality5410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleCausality5430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausality5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalValue_in_entryRuleLocalValue5490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalValue5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleLocalValue5538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalValue5558 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleLocalValue5572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLocalValue5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceType_in_entryRuleServiceType5631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceType5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleServiceType5678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceType5695 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleServiceType5713 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleServiceType5726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceType5743 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleServiceType5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService5800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleService5847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService5864 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleService5882 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_49_in_ruleService5895 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService5912 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleService5932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService5952 = new BitSet(new long[]{0x0000400000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleService5966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleService5983 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleService6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider6040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProvider6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleServiceProvider6088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_93_in_ruleServiceProvider6106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6124 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleServiceProvider6141 = new BitSet(new long[]{0x0002400000000000L,0x00000013C0000100L});
    public static final BitSet FOLLOW_49_in_ruleServiceProvider6154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceProvider6171 = new BitSet(new long[]{0x0000400000000000L,0x00000013C0000100L});
    public static final BitSet FOLLOW_94_in_ruleServiceProvider6191 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleServiceProvider6203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6223 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleServiceProvider6236 = new BitSet(new long[]{0x0000400000000000L,0x0000001380000100L});
    public static final BitSet FOLLOW_72_in_ruleServiceProvider6251 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleServiceProvider6263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6283 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleServiceProvider6296 = new BitSet(new long[]{0x0000400000000000L,0x0000001380000000L});
    public static final BitSet FOLLOW_95_in_ruleServiceProvider6311 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleServiceProvider6323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6343 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleServiceProvider6356 = new BitSet(new long[]{0x0000400000000000L,0x0000001300000000L});
    public static final BitSet FOLLOW_96_in_ruleServiceProvider6371 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleServiceProvider6383 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleServiceProvider6404 = new BitSet(new long[]{0x0000400000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_46_in_ruleServiceProvider6417 = new BitSet(new long[]{0x0000400000000000L,0x0000001200000000L});
    public static final BitSet FOLLOW_97_in_ruleServiceProvider6432 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleServiceProvider6444 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleServiceProvider6456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6476 = new BitSet(new long[]{0x0000400000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleServiceProvider6489 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleServiceProvider6501 = new BitSet(new long[]{0x0002400000000000L,0x0000000000000079L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleServiceProvider6522 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleServiceProvider6544 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleServiceProvider6566 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleServiceProvider6588 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleServiceProvider6610 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleServiceProvider6623 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleServiceProvider6637 = new BitSet(new long[]{0x0000400000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleServiceProvider6652 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleServiceProvider6664 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ruleResource_in_ruleServiceProvider6685 = new BitSet(new long[]{0x0000400000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_46_in_ruleServiceProvider6698 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleServiceProvider6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource6748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleResource6795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource6812 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleResource6829 = new BitSet(new long[]{0x0002400000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_49_in_ruleResource6842 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource6859 = new BitSet(new long[]{0x0000400000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleResource6879 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleResource6891 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleResource6912 = new BitSet(new long[]{0x0000400000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_46_in_ruleResource6925 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleResource6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_entryRuleSkill6977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkill6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkill7029 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleSkill7047 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleSkill7060 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSkill7077 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleSkill7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability7136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCapability7146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleCapability7183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCapability7200 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCapability7217 = new BitSet(new long[]{0x0002000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_49_in_ruleCapability7230 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCapability7247 = new BitSet(new long[]{0x0002000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleCapability7275 = new BitSet(new long[]{0x0002400000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_46_in_ruleCapability7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement7324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleRequirement7371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement7388 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleRequirement7405 = new BitSet(new long[]{0x0002000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_49_in_ruleRequirement7418 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement7435 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleRequirement7455 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleRequirement7467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement7487 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleRequirement7500 = new BitSet(new long[]{0x0000400000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleRequirement7514 = new BitSet(new long[]{0x0000400000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleCausality_in_ruleRequirement7535 = new BitSet(new long[]{0x0000400000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_46_in_ruleRequirement7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvision_in_entryRuleProvision7588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvision7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleProvision7635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision7655 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleProvision7667 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleProvision7679 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision7699 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleProvision7712 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleProvision7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine7760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleStatemachine7817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine7838 = new BitSet(new long[]{0x0000000000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleStatemachine7851 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000000L});
    public static final BitSet FOLLOW_111_in_ruleStatemachine7866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatemachine7887 = new BitSet(new long[]{0x0000000000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleStatemachine7900 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine7923 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent7960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent8012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand8075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand8127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState8190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleState8237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState8254 = new BitSet(new long[]{0x0000000000000010L,0x0002400000000000L});
    public static final BitSet FOLLOW_113_in_ruleState8272 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleState8284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState8304 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleState8317 = new BitSet(new long[]{0x0000000000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState8340 = new BitSet(new long[]{0x0000000000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleState8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition8389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition8399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleTransition8457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8505 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleTransition8517 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleTransition8529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8549 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_42_in_ruleTransition8562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleTransition8574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8594 = new BitSet(new long[]{0x0000000000000002L});

}