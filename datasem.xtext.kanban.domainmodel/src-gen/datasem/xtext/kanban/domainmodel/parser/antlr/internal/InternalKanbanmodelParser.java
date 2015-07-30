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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KSSModel'", "'GovernanceModel'", "'ProcessModels'", "'end ProcessModels'", "'GovernanceSearchStrategies'", "'end GovernanceSearchStrategies'", "'TaskPatterns'", "'end TaskPatterns'", "'ValueFunctions'", "'end ValueFunctions'", "'end GovernanceModel'", "'OrganizationalModel'", "'ServiceTypes'", "'end ServiceTypes'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'Repositories'", "'end Repositories'", "'WorkSources'", "'end WorkSources'", "'WorkItems'", "'end WorkItems'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'Replications'", "'InterArrivalTime'", "'end ExperimentSettings'", "'end KSSModel'", "'.'", "'Distribution:'", "'['", "']'", "'Repository'", "'Profiles'", "'{'", "'}'", "'end Repository'", "'WorkItem'", "'Description'", "'References'", "'Decompositions'", "'RequiredServices'", "'Efforts'", "'Value'", "'ClassOfService'", "'AssignmentAllowed'", "'DiscardAllowed'", "'Quantity'", "'TaskPattern'", "'Types'", "'TaskType'", "'ValueFunction'", "'ProcessModel'", "'Strategy'", "'WIAcceptance'", "'BackLogLimit'", "'WIPLimit'", "'WISelection'", "'WIAssignment'", "'ResourceAllocation'", "'ResourceOutsourcing'", "'WorkSource'", "'TargetUnits'", "'Profile'", "'Pattern'", "'Type'", "'Predecessors'", "'Subtasks'", "'CausalTriggers'", "'ArrivalTime'", "'DueDate'", "'=>'", "'->'", "'AtProgress'", "'OnProbability'", "'ServiceType'", "'Service'", "'Efficiency'", "'ServiceProvider'", "'Group'", "'SourceUnits'", "'SubordinateUnits'", "'Services'", "'GovernanceSearchStrategy'", "'Default'", "'Specified'", "'Resources'", "'Resource'", "'capability'", "'requirement'", "'workItems'", "'workItemNetwork'", "'('", "','", "')'", "'events'", "'end'", "'activities'", "'state'", "'actions'", "'/'"
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:76:1: ruleKanbanSchedulingSystem returns [EObject current=null] : (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? otherlv_3= 'GovernanceModel' otherlv_4= 'ProcessModels' ( (lv_ProcessModels_5_0= ruleProcessModel ) )+ otherlv_6= 'end ProcessModels' otherlv_7= 'GovernanceSearchStrategies' ( (lv_GovernanceSearchStrategies_8_0= ruleStrategy ) )+ otherlv_9= 'end GovernanceSearchStrategies' otherlv_10= 'TaskPatterns' ( (lv_TaskPatterns_11_0= ruleTaskPattern ) )+ ( (lv_TaskTypes_12_0= ruleTaskType ) )+ otherlv_13= 'end TaskPatterns' otherlv_14= 'ValueFunctions' ( (lv_ValueFunctions_15_0= ruleValueFunction ) )+ otherlv_16= 'end ValueFunctions' otherlv_17= 'end GovernanceModel' otherlv_18= 'OrganizationalModel' otherlv_19= 'ServiceTypes' ( (lv_ServiceTypes_20_0= ruleServiceType ) )+ otherlv_21= 'end ServiceTypes' otherlv_22= 'ServiceProviders' ( (lv_ServiceProviders_23_0= ruleServiceProvider ) )+ otherlv_24= 'end ServiceProviders' otherlv_25= 'end OrganizationalModel' otherlv_26= 'WorkItemNetworkModel' otherlv_27= 'Repositories' ( (lv_Repositories_28_0= ruleRepository ) )+ otherlv_29= 'end Repositories' otherlv_30= 'WorkSources' ( (lv_WorkSources_31_0= ruleWorkSource ) )+ otherlv_32= 'end WorkSources' otherlv_33= 'WorkItems' ( (lv_WorkItems_34_0= ruleWorkItem ) )+ otherlv_35= 'end WorkItems' otherlv_36= 'end WorkItemNetworkModel' otherlv_37= 'ExperimentSettings' otherlv_38= 'Replications' ( (lv_replications_39_0= RULE_INT ) ) otherlv_40= 'InterArrivalTime' ( (lv_interArrivalTime_41_0= RULE_INT ) ) otherlv_42= 'end ExperimentSettings' otherlv_43= 'end KSSModel' ) ;
    public final EObject ruleKanbanSchedulingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_replications_39_0=null;
        Token otherlv_40=null;
        Token lv_interArrivalTime_41_0=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        AntlrDatatypeRuleToken lv_TestItems_2_0 = null;

        EObject lv_ProcessModels_5_0 = null;

        EObject lv_GovernanceSearchStrategies_8_0 = null;

        EObject lv_TaskPatterns_11_0 = null;

        EObject lv_TaskTypes_12_0 = null;

        EObject lv_ValueFunctions_15_0 = null;

        EObject lv_ServiceTypes_20_0 = null;

        EObject lv_ServiceProviders_23_0 = null;

        EObject lv_Repositories_28_0 = null;

        EObject lv_WorkSources_31_0 = null;

        EObject lv_WorkItems_34_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:79:28: ( (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? otherlv_3= 'GovernanceModel' otherlv_4= 'ProcessModels' ( (lv_ProcessModels_5_0= ruleProcessModel ) )+ otherlv_6= 'end ProcessModels' otherlv_7= 'GovernanceSearchStrategies' ( (lv_GovernanceSearchStrategies_8_0= ruleStrategy ) )+ otherlv_9= 'end GovernanceSearchStrategies' otherlv_10= 'TaskPatterns' ( (lv_TaskPatterns_11_0= ruleTaskPattern ) )+ ( (lv_TaskTypes_12_0= ruleTaskType ) )+ otherlv_13= 'end TaskPatterns' otherlv_14= 'ValueFunctions' ( (lv_ValueFunctions_15_0= ruleValueFunction ) )+ otherlv_16= 'end ValueFunctions' otherlv_17= 'end GovernanceModel' otherlv_18= 'OrganizationalModel' otherlv_19= 'ServiceTypes' ( (lv_ServiceTypes_20_0= ruleServiceType ) )+ otherlv_21= 'end ServiceTypes' otherlv_22= 'ServiceProviders' ( (lv_ServiceProviders_23_0= ruleServiceProvider ) )+ otherlv_24= 'end ServiceProviders' otherlv_25= 'end OrganizationalModel' otherlv_26= 'WorkItemNetworkModel' otherlv_27= 'Repositories' ( (lv_Repositories_28_0= ruleRepository ) )+ otherlv_29= 'end Repositories' otherlv_30= 'WorkSources' ( (lv_WorkSources_31_0= ruleWorkSource ) )+ otherlv_32= 'end WorkSources' otherlv_33= 'WorkItems' ( (lv_WorkItems_34_0= ruleWorkItem ) )+ otherlv_35= 'end WorkItems' otherlv_36= 'end WorkItemNetworkModel' otherlv_37= 'ExperimentSettings' otherlv_38= 'Replications' ( (lv_replications_39_0= RULE_INT ) ) otherlv_40= 'InterArrivalTime' ( (lv_interArrivalTime_41_0= RULE_INT ) ) otherlv_42= 'end ExperimentSettings' otherlv_43= 'end KSSModel' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? otherlv_3= 'GovernanceModel' otherlv_4= 'ProcessModels' ( (lv_ProcessModels_5_0= ruleProcessModel ) )+ otherlv_6= 'end ProcessModels' otherlv_7= 'GovernanceSearchStrategies' ( (lv_GovernanceSearchStrategies_8_0= ruleStrategy ) )+ otherlv_9= 'end GovernanceSearchStrategies' otherlv_10= 'TaskPatterns' ( (lv_TaskPatterns_11_0= ruleTaskPattern ) )+ ( (lv_TaskTypes_12_0= ruleTaskType ) )+ otherlv_13= 'end TaskPatterns' otherlv_14= 'ValueFunctions' ( (lv_ValueFunctions_15_0= ruleValueFunction ) )+ otherlv_16= 'end ValueFunctions' otherlv_17= 'end GovernanceModel' otherlv_18= 'OrganizationalModel' otherlv_19= 'ServiceTypes' ( (lv_ServiceTypes_20_0= ruleServiceType ) )+ otherlv_21= 'end ServiceTypes' otherlv_22= 'ServiceProviders' ( (lv_ServiceProviders_23_0= ruleServiceProvider ) )+ otherlv_24= 'end ServiceProviders' otherlv_25= 'end OrganizationalModel' otherlv_26= 'WorkItemNetworkModel' otherlv_27= 'Repositories' ( (lv_Repositories_28_0= ruleRepository ) )+ otherlv_29= 'end Repositories' otherlv_30= 'WorkSources' ( (lv_WorkSources_31_0= ruleWorkSource ) )+ otherlv_32= 'end WorkSources' otherlv_33= 'WorkItems' ( (lv_WorkItems_34_0= ruleWorkItem ) )+ otherlv_35= 'end WorkItems' otherlv_36= 'end WorkItemNetworkModel' otherlv_37= 'ExperimentSettings' otherlv_38= 'Replications' ( (lv_replications_39_0= RULE_INT ) ) otherlv_40= 'InterArrivalTime' ( (lv_interArrivalTime_41_0= RULE_INT ) ) otherlv_42= 'end ExperimentSettings' otherlv_43= 'end KSSModel' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? otherlv_3= 'GovernanceModel' otherlv_4= 'ProcessModels' ( (lv_ProcessModels_5_0= ruleProcessModel ) )+ otherlv_6= 'end ProcessModels' otherlv_7= 'GovernanceSearchStrategies' ( (lv_GovernanceSearchStrategies_8_0= ruleStrategy ) )+ otherlv_9= 'end GovernanceSearchStrategies' otherlv_10= 'TaskPatterns' ( (lv_TaskPatterns_11_0= ruleTaskPattern ) )+ ( (lv_TaskTypes_12_0= ruleTaskType ) )+ otherlv_13= 'end TaskPatterns' otherlv_14= 'ValueFunctions' ( (lv_ValueFunctions_15_0= ruleValueFunction ) )+ otherlv_16= 'end ValueFunctions' otherlv_17= 'end GovernanceModel' otherlv_18= 'OrganizationalModel' otherlv_19= 'ServiceTypes' ( (lv_ServiceTypes_20_0= ruleServiceType ) )+ otherlv_21= 'end ServiceTypes' otherlv_22= 'ServiceProviders' ( (lv_ServiceProviders_23_0= ruleServiceProvider ) )+ otherlv_24= 'end ServiceProviders' otherlv_25= 'end OrganizationalModel' otherlv_26= 'WorkItemNetworkModel' otherlv_27= 'Repositories' ( (lv_Repositories_28_0= ruleRepository ) )+ otherlv_29= 'end Repositories' otherlv_30= 'WorkSources' ( (lv_WorkSources_31_0= ruleWorkSource ) )+ otherlv_32= 'end WorkSources' otherlv_33= 'WorkItems' ( (lv_WorkItems_34_0= ruleWorkItem ) )+ otherlv_35= 'end WorkItems' otherlv_36= 'end WorkItemNetworkModel' otherlv_37= 'ExperimentSettings' otherlv_38= 'Replications' ( (lv_replications_39_0= RULE_INT ) ) otherlv_40= 'InterArrivalTime' ( (lv_interArrivalTime_41_0= RULE_INT ) ) otherlv_42= 'end ExperimentSettings' otherlv_43= 'end KSSModel' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:3: otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_TestItems_2_0= ruleQualifiedName ) )? otherlv_3= 'GovernanceModel' otherlv_4= 'ProcessModels' ( (lv_ProcessModels_5_0= ruleProcessModel ) )+ otherlv_6= 'end ProcessModels' otherlv_7= 'GovernanceSearchStrategies' ( (lv_GovernanceSearchStrategies_8_0= ruleStrategy ) )+ otherlv_9= 'end GovernanceSearchStrategies' otherlv_10= 'TaskPatterns' ( (lv_TaskPatterns_11_0= ruleTaskPattern ) )+ ( (lv_TaskTypes_12_0= ruleTaskType ) )+ otherlv_13= 'end TaskPatterns' otherlv_14= 'ValueFunctions' ( (lv_ValueFunctions_15_0= ruleValueFunction ) )+ otherlv_16= 'end ValueFunctions' otherlv_17= 'end GovernanceModel' otherlv_18= 'OrganizationalModel' otherlv_19= 'ServiceTypes' ( (lv_ServiceTypes_20_0= ruleServiceType ) )+ otherlv_21= 'end ServiceTypes' otherlv_22= 'ServiceProviders' ( (lv_ServiceProviders_23_0= ruleServiceProvider ) )+ otherlv_24= 'end ServiceProviders' otherlv_25= 'end OrganizationalModel' otherlv_26= 'WorkItemNetworkModel' otherlv_27= 'Repositories' ( (lv_Repositories_28_0= ruleRepository ) )+ otherlv_29= 'end Repositories' otherlv_30= 'WorkSources' ( (lv_WorkSources_31_0= ruleWorkSource ) )+ otherlv_32= 'end WorkSources' otherlv_33= 'WorkItems' ( (lv_WorkItems_34_0= ruleWorkItem ) )+ otherlv_35= 'end WorkItems' otherlv_36= 'end WorkItemNetworkModel' otherlv_37= 'ExperimentSettings' otherlv_38= 'Replications' ( (lv_replications_39_0= RULE_INT ) ) otherlv_40= 'InterArrivalTime' ( (lv_interArrivalTime_41_0= RULE_INT ) ) otherlv_42= 'end ExperimentSettings' otherlv_43= 'end KSSModel'
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleKanbanSchedulingSystem178); 

                	newLeafNode(otherlv_3, grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceModelKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleKanbanSchedulingSystem190); 

                	newLeafNode(otherlv_4, grammarAccess.getKanbanSchedulingSystemAccess().getProcessModelsKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:128:1: ( (lv_ProcessModels_5_0= ruleProcessModel ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==65) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:129:1: (lv_ProcessModels_5_0= ruleProcessModel )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:129:1: (lv_ProcessModels_5_0= ruleProcessModel )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:130:3: lv_ProcessModels_5_0= ruleProcessModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getProcessModelsProcessModelParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessModel_in_ruleKanbanSchedulingSystem211);
            	    lv_ProcessModels_5_0=ruleProcessModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ProcessModels",
            	            		lv_ProcessModels_5_0, 
            	            		"ProcessModel");
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleKanbanSchedulingSystem224); 

                	newLeafNode(otherlv_6, grammarAccess.getKanbanSchedulingSystemAccess().getEndProcessModelsKeyword_6());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleKanbanSchedulingSystem236); 

                	newLeafNode(otherlv_7, grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceSearchStrategiesKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:154:1: ( (lv_GovernanceSearchStrategies_8_0= ruleStrategy ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==66) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:155:1: (lv_GovernanceSearchStrategies_8_0= ruleStrategy )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:155:1: (lv_GovernanceSearchStrategies_8_0= ruleStrategy )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:156:3: lv_GovernanceSearchStrategies_8_0= ruleStrategy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceSearchStrategiesStrategyParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStrategy_in_ruleKanbanSchedulingSystem257);
            	    lv_GovernanceSearchStrategies_8_0=ruleStrategy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GovernanceSearchStrategies",
            	            		lv_GovernanceSearchStrategies_8_0, 
            	            		"Strategy");
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

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleKanbanSchedulingSystem270); 

                	newLeafNode(otherlv_9, grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceSearchStrategiesKeyword_9());
                
            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleKanbanSchedulingSystem282); 

                	newLeafNode(otherlv_10, grammarAccess.getKanbanSchedulingSystemAccess().getTaskPatternsKeyword_10());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:180:1: ( (lv_TaskPatterns_11_0= ruleTaskPattern ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==61) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:181:1: (lv_TaskPatterns_11_0= ruleTaskPattern )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:181:1: (lv_TaskPatterns_11_0= ruleTaskPattern )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:182:3: lv_TaskPatterns_11_0= ruleTaskPattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getTaskPatternsTaskPatternParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTaskPattern_in_ruleKanbanSchedulingSystem303);
            	    lv_TaskPatterns_11_0=ruleTaskPattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TaskPatterns",
            	            		lv_TaskPatterns_11_0, 
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:3: ( (lv_TaskTypes_12_0= ruleTaskType ) )+
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
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:199:1: (lv_TaskTypes_12_0= ruleTaskType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:199:1: (lv_TaskTypes_12_0= ruleTaskType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:200:3: lv_TaskTypes_12_0= ruleTaskType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getTaskTypesTaskTypeParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTaskType_in_ruleKanbanSchedulingSystem325);
            	    lv_TaskTypes_12_0=ruleTaskType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TaskTypes",
            	            		lv_TaskTypes_12_0, 
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

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleKanbanSchedulingSystem338); 

                	newLeafNode(otherlv_13, grammarAccess.getKanbanSchedulingSystemAccess().getEndTaskPatternsKeyword_13());
                
            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleKanbanSchedulingSystem350); 

                	newLeafNode(otherlv_14, grammarAccess.getKanbanSchedulingSystemAccess().getValueFunctionsKeyword_14());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:224:1: ( (lv_ValueFunctions_15_0= ruleValueFunction ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==64) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:225:1: (lv_ValueFunctions_15_0= ruleValueFunction )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:225:1: (lv_ValueFunctions_15_0= ruleValueFunction )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:226:3: lv_ValueFunctions_15_0= ruleValueFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getValueFunctionsValueFunctionParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueFunction_in_ruleKanbanSchedulingSystem371);
            	    lv_ValueFunctions_15_0=ruleValueFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ValueFunctions",
            	            		lv_ValueFunctions_15_0, 
            	            		"ValueFunction");
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

            otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleKanbanSchedulingSystem384); 

                	newLeafNode(otherlv_16, grammarAccess.getKanbanSchedulingSystemAccess().getEndValueFunctionsKeyword_16());
                
            otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleKanbanSchedulingSystem396); 

                	newLeafNode(otherlv_17, grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceModelKeyword_17());
                
            otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleKanbanSchedulingSystem408); 

                	newLeafNode(otherlv_18, grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationalModelKeyword_18());
                
            otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleKanbanSchedulingSystem420); 

                	newLeafNode(otherlv_19, grammarAccess.getKanbanSchedulingSystemAccess().getServiceTypesKeyword_19());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:258:1: ( (lv_ServiceTypes_20_0= ruleServiceType ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==88) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:259:1: (lv_ServiceTypes_20_0= ruleServiceType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:259:1: (lv_ServiceTypes_20_0= ruleServiceType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:260:3: lv_ServiceTypes_20_0= ruleServiceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getServiceTypesServiceTypeParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceType_in_ruleKanbanSchedulingSystem441);
            	    lv_ServiceTypes_20_0=ruleServiceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceTypes",
            	            		lv_ServiceTypes_20_0, 
            	            		"ServiceType");
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

            otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleKanbanSchedulingSystem454); 

                	newLeafNode(otherlv_21, grammarAccess.getKanbanSchedulingSystemAccess().getEndServiceTypesKeyword_21());
                
            otherlv_22=(Token)match(input,25,FOLLOW_25_in_ruleKanbanSchedulingSystem466); 

                	newLeafNode(otherlv_22, grammarAccess.getKanbanSchedulingSystemAccess().getServiceProvidersKeyword_22());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:284:1: ( (lv_ServiceProviders_23_0= ruleServiceProvider ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=91 && LA8_0<=92)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:285:1: (lv_ServiceProviders_23_0= ruleServiceProvider )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:285:1: (lv_ServiceProviders_23_0= ruleServiceProvider )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:286:3: lv_ServiceProviders_23_0= ruleServiceProvider
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getServiceProvidersServiceProviderParserRuleCall_23_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceProvider_in_ruleKanbanSchedulingSystem487);
            	    lv_ServiceProviders_23_0=ruleServiceProvider();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceProviders",
            	            		lv_ServiceProviders_23_0, 
            	            		"ServiceProvider");
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

            otherlv_24=(Token)match(input,26,FOLLOW_26_in_ruleKanbanSchedulingSystem500); 

                	newLeafNode(otherlv_24, grammarAccess.getKanbanSchedulingSystemAccess().getEndServiceProvidersKeyword_24());
                
            otherlv_25=(Token)match(input,27,FOLLOW_27_in_ruleKanbanSchedulingSystem512); 

                	newLeafNode(otherlv_25, grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationalModelKeyword_25());
                
            otherlv_26=(Token)match(input,28,FOLLOW_28_in_ruleKanbanSchedulingSystem524); 

                	newLeafNode(otherlv_26, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemNetworkModelKeyword_26());
                
            otherlv_27=(Token)match(input,29,FOLLOW_29_in_ruleKanbanSchedulingSystem536); 

                	newLeafNode(otherlv_27, grammarAccess.getKanbanSchedulingSystemAccess().getRepositoriesKeyword_27());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:318:1: ( (lv_Repositories_28_0= ruleRepository ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==45) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:319:1: (lv_Repositories_28_0= ruleRepository )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:319:1: (lv_Repositories_28_0= ruleRepository )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:320:3: lv_Repositories_28_0= ruleRepository
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getRepositoriesRepositoryParserRuleCall_28_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRepository_in_ruleKanbanSchedulingSystem557);
            	    lv_Repositories_28_0=ruleRepository();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Repositories",
            	            		lv_Repositories_28_0, 
            	            		"Repository");
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

            otherlv_29=(Token)match(input,30,FOLLOW_30_in_ruleKanbanSchedulingSystem570); 

                	newLeafNode(otherlv_29, grammarAccess.getKanbanSchedulingSystemAccess().getEndRepositoriesKeyword_29());
                
            otherlv_30=(Token)match(input,31,FOLLOW_31_in_ruleKanbanSchedulingSystem582); 

                	newLeafNode(otherlv_30, grammarAccess.getKanbanSchedulingSystemAccess().getWorkSourcesKeyword_30());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:344:1: ( (lv_WorkSources_31_0= ruleWorkSource ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==74) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:345:1: (lv_WorkSources_31_0= ruleWorkSource )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:345:1: (lv_WorkSources_31_0= ruleWorkSource )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:346:3: lv_WorkSources_31_0= ruleWorkSource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getWorkSourcesWorkSourceParserRuleCall_31_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkSource_in_ruleKanbanSchedulingSystem603);
            	    lv_WorkSources_31_0=ruleWorkSource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkSources",
            	            		lv_WorkSources_31_0, 
            	            		"WorkSource");
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

            otherlv_32=(Token)match(input,32,FOLLOW_32_in_ruleKanbanSchedulingSystem616); 

                	newLeafNode(otherlv_32, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkSourcesKeyword_32());
                
            otherlv_33=(Token)match(input,33,FOLLOW_33_in_ruleKanbanSchedulingSystem628); 

                	newLeafNode(otherlv_33, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsKeyword_33());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:370:1: ( (lv_WorkItems_34_0= ruleWorkItem ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==50) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:371:1: (lv_WorkItems_34_0= ruleWorkItem )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:371:1: (lv_WorkItems_34_0= ruleWorkItem )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:372:3: lv_WorkItems_34_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsWorkItemParserRuleCall_34_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItem_in_ruleKanbanSchedulingSystem649);
            	    lv_WorkItems_34_0=ruleWorkItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkItems",
            	            		lv_WorkItems_34_0, 
            	            		"WorkItem");
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

            otherlv_35=(Token)match(input,34,FOLLOW_34_in_ruleKanbanSchedulingSystem662); 

                	newLeafNode(otherlv_35, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemsKeyword_35());
                
            otherlv_36=(Token)match(input,35,FOLLOW_35_in_ruleKanbanSchedulingSystem674); 

                	newLeafNode(otherlv_36, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemNetworkModelKeyword_36());
                
            otherlv_37=(Token)match(input,36,FOLLOW_36_in_ruleKanbanSchedulingSystem686); 

                	newLeafNode(otherlv_37, grammarAccess.getKanbanSchedulingSystemAccess().getExperimentSettingsKeyword_37());
                
            otherlv_38=(Token)match(input,37,FOLLOW_37_in_ruleKanbanSchedulingSystem698); 

                	newLeafNode(otherlv_38, grammarAccess.getKanbanSchedulingSystemAccess().getReplicationsKeyword_38());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:404:1: ( (lv_replications_39_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:405:1: (lv_replications_39_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:405:1: (lv_replications_39_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:406:3: lv_replications_39_0= RULE_INT
            {
            lv_replications_39_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem715); 

            			newLeafNode(lv_replications_39_0, grammarAccess.getKanbanSchedulingSystemAccess().getReplicationsINTTerminalRuleCall_39_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"replications",
                    		lv_replications_39_0, 
                    		"INT");
            	    

            }


            }

            otherlv_40=(Token)match(input,38,FOLLOW_38_in_ruleKanbanSchedulingSystem732); 

                	newLeafNode(otherlv_40, grammarAccess.getKanbanSchedulingSystemAccess().getInterArrivalTimeKeyword_40());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:426:1: ( (lv_interArrivalTime_41_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:427:1: (lv_interArrivalTime_41_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:427:1: (lv_interArrivalTime_41_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:428:3: lv_interArrivalTime_41_0= RULE_INT
            {
            lv_interArrivalTime_41_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem749); 

            			newLeafNode(lv_interArrivalTime_41_0, grammarAccess.getKanbanSchedulingSystemAccess().getInterArrivalTimeINTTerminalRuleCall_41_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"interArrivalTime",
                    		lv_interArrivalTime_41_0, 
                    		"INT");
            	    

            }


            }

            otherlv_42=(Token)match(input,39,FOLLOW_39_in_ruleKanbanSchedulingSystem766); 

                	newLeafNode(otherlv_42, grammarAccess.getKanbanSchedulingSystemAccess().getEndExperimentSettingsKeyword_42());
                
            otherlv_43=(Token)match(input,40,FOLLOW_40_in_ruleKanbanSchedulingSystem778); 

                	newLeafNode(otherlv_43, grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSModelKeyword_43());
                

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:460:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:461:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:462:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName815);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName826); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:469:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:472:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:473:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:473:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:473:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName866); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:480:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:481:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleQualifiedName885); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName900); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:501:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:502:2: (iv_ruleDouble= ruleDouble EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:503:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble948);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble959); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:510:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:513:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:514:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:514:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:514:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble999); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:521:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:522:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleDouble1018); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble1033); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:542:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:543:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:544:2: iv_ruleNumExpression= ruleNumExpression EOF
            {
             newCompositeNode(grammarAccess.getNumExpressionRule()); 
            pushFollow(FOLLOW_ruleNumExpression_in_entryRuleNumExpression1080);
            iv_ruleNumExpression=ruleNumExpression();

            state._fsp--;

             current =iv_ruleNumExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumExpression1090); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:551:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_distribution_1_0=null;
        AntlrDatatypeRuleToken lv_numValue_0_0 = null;

        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:554:28: ( ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:555:1: ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:555:1: ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:555:2: ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:555:2: ( (lv_numValue_0_0= ruleDouble ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:556:1: (lv_numValue_0_0= ruleDouble )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:556:1: (lv_numValue_0_0= ruleDouble )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:557:3: lv_numValue_0_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumValueDoubleParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleNumExpression1136);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:573:3: ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:573:4: ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:573:4: ( (lv_distribution_1_0= 'Distribution:' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:574:1: (lv_distribution_1_0= 'Distribution:' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:574:1: (lv_distribution_1_0= 'Distribution:' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:575:3: lv_distribution_1_0= 'Distribution:'
                    {
                    lv_distribution_1_0=(Token)match(input,42,FOLLOW_42_in_ruleNumExpression1156); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionDistributionKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Distribution:");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:588:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:589:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:589:1: (lv_numDist_2_0= ruleDistribution )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:590:3: lv_numDist_2_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumDistDistributionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleNumExpression1190);
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:614:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:615:2: (iv_ruleParameter= ruleParameter EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:616:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1229);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1240); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:623:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Double_0= ruleDouble | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Double_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:626:28: ( (this_Double_0= ruleDouble | this_ID_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:627:1: (this_Double_0= ruleDouble | this_ID_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:627:1: (this_Double_0= ruleDouble | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:628:5: this_Double_0= ruleDouble
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getDoubleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDouble_in_ruleParameter1287);
                    this_Double_0=ruleDouble();

                    state._fsp--;


                    		current.merge(this_Double_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:639:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1313); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:654:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:655:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:656:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution1358);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution1368); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:663:1: ruleDistribution returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:666:28: ( ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:667:1: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:667:1: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:667:2: ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:667:2: ( (lv_type_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:668:1: (lv_type_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:668:1: (lv_type_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:669:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDistribution1410); 

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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleDistribution1427); 

                	newLeafNode(otherlv_1, grammarAccess.getDistributionAccess().getLeftSquareBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:689:1: ( (lv_parameters_2_0= ruleParameter ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:690:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:690:1: (lv_parameters_2_0= ruleParameter )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:691:3: lv_parameters_2_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleDistribution1448);
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
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleDistribution1461); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:719:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:720:2: (iv_ruleRepository= ruleRepository EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:721:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_ruleRepository_in_entryRuleRepository1497);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepository1507); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:728:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:28: ( (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:732:1: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:732:1: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:732:3: otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleRepository1544); 

                	newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:736:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:737:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:737:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:738:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRepositoryRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepository1564); 

            		newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getTypeTaskTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleRepository1576); 

                	newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getProfilesKeyword_2());
                
            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleRepository1588); 

                	newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:757:1: ( (lv_profiles_4_0= ruleWorkItemProfile ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:758:1: (lv_profiles_4_0= ruleWorkItemProfile )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:758:1: (lv_profiles_4_0= ruleWorkItemProfile )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:759:3: lv_profiles_4_0= ruleWorkItemProfile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRepositoryAccess().getProfilesWorkItemProfileParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItemProfile_in_ruleRepository1609);
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
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleRepository1622); 

                	newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleRepository1634); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:791:1: entryRuleWorkItemProfile returns [EObject current=null] : iv_ruleWorkItemProfile= ruleWorkItemProfile EOF ;
    public final EObject entryRuleWorkItemProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemProfile = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:792:2: (iv_ruleWorkItemProfile= ruleWorkItemProfile EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:793:2: iv_ruleWorkItemProfile= ruleWorkItemProfile EOF
            {
             newCompositeNode(grammarAccess.getWorkItemProfileRule()); 
            pushFollow(FOLLOW_ruleWorkItemProfile_in_entryRuleWorkItemProfile1670);
            iv_ruleWorkItemProfile=ruleWorkItemProfile();

            state._fsp--;

             current =iv_ruleWorkItemProfile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemProfile1680); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:800:1: ruleWorkItemProfile returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'References' otherlv_6= '{' ( (lv_references_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'Decompositions' otherlv_10= '{' ( (lv_decompositions_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'RequiredServices' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'Efforts' ( (lv_efforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'Value' ( (lv_value_18_0= ruleNumExpression ) ) )? (otherlv_19= 'ClassOfService' ( (lv_classOfService_20_0= RULE_ID ) ) )? ( (lv_allowAssignment_21_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_22_0= 'DiscardAllowed' ) )? otherlv_23= '}' ) ;
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
        Token lv_classOfService_20_0=null;
        Token lv_allowAssignment_21_0=null;
        Token lv_allowDiscard_22_0=null;
        Token otherlv_23=null;
        EObject lv_references_7_0 = null;

        EObject lv_decompositions_11_0 = null;

        EObject lv_efforts_16_0 = null;

        EObject lv_value_18_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:803:28: ( (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'References' otherlv_6= '{' ( (lv_references_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'Decompositions' otherlv_10= '{' ( (lv_decompositions_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'RequiredServices' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'Efforts' ( (lv_efforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'Value' ( (lv_value_18_0= ruleNumExpression ) ) )? (otherlv_19= 'ClassOfService' ( (lv_classOfService_20_0= RULE_ID ) ) )? ( (lv_allowAssignment_21_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_22_0= 'DiscardAllowed' ) )? otherlv_23= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:804:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'References' otherlv_6= '{' ( (lv_references_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'Decompositions' otherlv_10= '{' ( (lv_decompositions_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'RequiredServices' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'Efforts' ( (lv_efforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'Value' ( (lv_value_18_0= ruleNumExpression ) ) )? (otherlv_19= 'ClassOfService' ( (lv_classOfService_20_0= RULE_ID ) ) )? ( (lv_allowAssignment_21_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_22_0= 'DiscardAllowed' ) )? otherlv_23= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:804:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'References' otherlv_6= '{' ( (lv_references_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'Decompositions' otherlv_10= '{' ( (lv_decompositions_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'RequiredServices' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'Efforts' ( (lv_efforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'Value' ( (lv_value_18_0= ruleNumExpression ) ) )? (otherlv_19= 'ClassOfService' ( (lv_classOfService_20_0= RULE_ID ) ) )? ( (lv_allowAssignment_21_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_22_0= 'DiscardAllowed' ) )? otherlv_23= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:804:3: otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'References' otherlv_6= '{' ( (lv_references_7_0= ruleWorkReference ) )+ otherlv_8= '}' )? (otherlv_9= 'Decompositions' otherlv_10= '{' ( (lv_decompositions_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )? (otherlv_13= 'RequiredServices' ( (otherlv_14= RULE_ID ) )+ )? (otherlv_15= 'Efforts' ( (lv_efforts_16_0= ruleNumExpression ) ) )? (otherlv_17= 'Value' ( (lv_value_18_0= ruleNumExpression ) ) )? (otherlv_19= 'ClassOfService' ( (lv_classOfService_20_0= RULE_ID ) ) )? ( (lv_allowAssignment_21_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_22_0= 'DiscardAllowed' ) )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleWorkItemProfile1717); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemProfileAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:808:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:809:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:809:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:810:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile1734); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWorkItemProfile1751); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:830:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:830:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleWorkItemProfile1764); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemProfileAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:834:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:835:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:835:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:836:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemProfile1781); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:852:4: (otherlv_5= 'References' otherlv_6= '{' ( (lv_references_7_0= ruleWorkReference ) )+ otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:852:6: otherlv_5= 'References' otherlv_6= '{' ( (lv_references_7_0= ruleWorkReference ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleWorkItemProfile1801); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemProfileAccess().getReferencesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleWorkItemProfile1813); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:860:1: ( (lv_references_7_0= ruleWorkReference ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==50) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:861:1: (lv_references_7_0= ruleWorkReference )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:861:1: (lv_references_7_0= ruleWorkReference )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:862:3: lv_references_7_0= ruleWorkReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getReferencesWorkReferenceParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkReference_in_ruleWorkItemProfile1834);
                    	    lv_references_7_0=ruleWorkReference();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"references",
                    	            		lv_references_7_0, 
                    	            		"WorkReference");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleWorkItemProfile1847); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:882:3: (otherlv_9= 'Decompositions' otherlv_10= '{' ( (lv_decompositions_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==53) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:882:5: otherlv_9= 'Decompositions' otherlv_10= '{' ( (lv_decompositions_11_0= ruleWorkDecomposition ) )+ otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_53_in_ruleWorkItemProfile1862); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkItemProfileAccess().getDecompositionsKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,47,FOLLOW_47_in_ruleWorkItemProfile1874); 

                        	newLeafNode(otherlv_10, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:890:1: ( (lv_decompositions_11_0= ruleWorkDecomposition ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==50) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:891:1: (lv_decompositions_11_0= ruleWorkDecomposition )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:891:1: (lv_decompositions_11_0= ruleWorkDecomposition )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:892:3: lv_decompositions_11_0= ruleWorkDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getDecompositionsWorkDecompositionParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkDecomposition_in_ruleWorkItemProfile1895);
                    	    lv_decompositions_11_0=ruleWorkDecomposition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"decompositions",
                    	            		lv_decompositions_11_0, 
                    	            		"WorkDecomposition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

                    otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleWorkItemProfile1908); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:912:3: (otherlv_13= 'RequiredServices' ( (otherlv_14= RULE_ID ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:912:5: otherlv_13= 'RequiredServices' ( (otherlv_14= RULE_ID ) )+
                    {
                    otherlv_13=(Token)match(input,54,FOLLOW_54_in_ruleWorkItemProfile1923); 

                        	newLeafNode(otherlv_13, grammarAccess.getWorkItemProfileAccess().getRequiredServicesKeyword_6_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:916:1: ( (otherlv_14= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:917:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:917:1: (otherlv_14= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:918:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile1943); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getWorkItemProfileAccess().getRequiredServicesServiceTypeCrossReference_6_1_0()); 
                    	    	

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:929:5: (otherlv_15= 'Efforts' ( (lv_efforts_16_0= ruleNumExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:929:7: otherlv_15= 'Efforts' ( (lv_efforts_16_0= ruleNumExpression ) )
                    {
                    otherlv_15=(Token)match(input,55,FOLLOW_55_in_ruleWorkItemProfile1959); 

                        	newLeafNode(otherlv_15, grammarAccess.getWorkItemProfileAccess().getEffortsKeyword_7_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:933:1: ( (lv_efforts_16_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:934:1: (lv_efforts_16_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:934:1: (lv_efforts_16_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:935:3: lv_efforts_16_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getEffortsNumExpressionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItemProfile1980);
                    lv_efforts_16_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		set(
                           			current, 
                           			"efforts",
                            		lv_efforts_16_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:951:4: (otherlv_17= 'Value' ( (lv_value_18_0= ruleNumExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:951:6: otherlv_17= 'Value' ( (lv_value_18_0= ruleNumExpression ) )
                    {
                    otherlv_17=(Token)match(input,56,FOLLOW_56_in_ruleWorkItemProfile1995); 

                        	newLeafNode(otherlv_17, grammarAccess.getWorkItemProfileAccess().getValueKeyword_8_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:955:1: ( (lv_value_18_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:956:1: (lv_value_18_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:956:1: (lv_value_18_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:957:3: lv_value_18_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getValueNumExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItemProfile2016);
                    lv_value_18_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_18_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:973:4: (otherlv_19= 'ClassOfService' ( (lv_classOfService_20_0= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==57) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:973:6: otherlv_19= 'ClassOfService' ( (lv_classOfService_20_0= RULE_ID ) )
                    {
                    otherlv_19=(Token)match(input,57,FOLLOW_57_in_ruleWorkItemProfile2031); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemProfileAccess().getClassOfServiceKeyword_9_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:977:1: ( (lv_classOfService_20_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:978:1: (lv_classOfService_20_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:978:1: (lv_classOfService_20_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:979:3: lv_classOfService_20_0= RULE_ID
                    {
                    lv_classOfService_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile2048); 

                    			newLeafNode(lv_classOfService_20_0, grammarAccess.getWorkItemProfileAccess().getClassOfServiceIDTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"classOfService",
                            		lv_classOfService_20_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:995:4: ( (lv_allowAssignment_21_0= 'AssignmentAllowed' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:996:1: (lv_allowAssignment_21_0= 'AssignmentAllowed' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:996:1: (lv_allowAssignment_21_0= 'AssignmentAllowed' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:997:3: lv_allowAssignment_21_0= 'AssignmentAllowed'
                    {
                    lv_allowAssignment_21_0=(Token)match(input,58,FOLLOW_58_in_ruleWorkItemProfile2073); 

                            newLeafNode(lv_allowAssignment_21_0, grammarAccess.getWorkItemProfileAccess().getAllowAssignmentAssignmentAllowedKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		setWithLastConsumed(current, "allowAssignment", true, "AssignmentAllowed");
                    	    

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1010:3: ( (lv_allowDiscard_22_0= 'DiscardAllowed' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==59) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1011:1: (lv_allowDiscard_22_0= 'DiscardAllowed' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1011:1: (lv_allowDiscard_22_0= 'DiscardAllowed' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1012:3: lv_allowDiscard_22_0= 'DiscardAllowed'
                    {
                    lv_allowDiscard_22_0=(Token)match(input,59,FOLLOW_59_in_ruleWorkItemProfile2105); 

                            newLeafNode(lv_allowDiscard_22_0, grammarAccess.getWorkItemProfileAccess().getAllowDiscardDiscardAllowedKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		setWithLastConsumed(current, "allowDiscard", true, "DiscardAllowed");
                    	    

                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,48,FOLLOW_48_in_ruleWorkItemProfile2131); 

                	newLeafNode(otherlv_23, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1037:1: entryRuleWorkReference returns [EObject current=null] : iv_ruleWorkReference= ruleWorkReference EOF ;
    public final EObject entryRuleWorkReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkReference = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1038:2: (iv_ruleWorkReference= ruleWorkReference EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1039:2: iv_ruleWorkReference= ruleWorkReference EOF
            {
             newCompositeNode(grammarAccess.getWorkReferenceRule()); 
            pushFollow(FOLLOW_ruleWorkReference_in_entryRuleWorkReference2167);
            iv_ruleWorkReference=ruleWorkReference();

            state._fsp--;

             current =iv_ruleWorkReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkReference2177); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1046:1: ruleWorkReference returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleWorkReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_quantity_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1049:28: ( (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:3: otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleWorkReference2214); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkReferenceAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1054:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1055:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1055:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1056:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkReference2234); 

            		newLeafNode(otherlv_1, grammarAccess.getWorkReferenceAccess().getWorkItemWorkItemProfileCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleWorkReference2246); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkReferenceAccess().getQuantityKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1071:1: ( (lv_quantity_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (lv_quantity_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (lv_quantity_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1073:3: lv_quantity_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getWorkReferenceAccess().getQuantityNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkReference2267);
            lv_quantity_3_0=ruleNumExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"quantity",
                    		lv_quantity_3_0, 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1097:1: entryRuleWorkDecomposition returns [EObject current=null] : iv_ruleWorkDecomposition= ruleWorkDecomposition EOF ;
    public final EObject entryRuleWorkDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDecomposition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1098:2: (iv_ruleWorkDecomposition= ruleWorkDecomposition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1099:2: iv_ruleWorkDecomposition= ruleWorkDecomposition EOF
            {
             newCompositeNode(grammarAccess.getWorkDecompositionRule()); 
            pushFollow(FOLLOW_ruleWorkDecomposition_in_entryRuleWorkDecomposition2303);
            iv_ruleWorkDecomposition=ruleWorkDecomposition();

            state._fsp--;

             current =iv_ruleWorkDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkDecomposition2313); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1106:1: ruleWorkDecomposition returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleWorkDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_quantity_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1109:28: ( (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1110:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1110:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1110:3: otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleWorkDecomposition2350); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkDecompositionAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1114:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1115:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1115:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1116:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkDecompositionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkDecomposition2370); 

            		newLeafNode(otherlv_1, grammarAccess.getWorkDecompositionAccess().getWorkItemWorkItemProfileCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleWorkDecomposition2382); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkDecompositionAccess().getQuantityKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1131:1: ( (lv_quantity_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1132:1: (lv_quantity_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1132:1: (lv_quantity_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1133:3: lv_quantity_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getWorkDecompositionAccess().getQuantityNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkDecomposition2403);
            lv_quantity_3_0=ruleNumExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkDecompositionRule());
            	        }
                   		set(
                   			current, 
                   			"quantity",
                    		lv_quantity_3_0, 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1161:1: entryRuleTaskPattern returns [EObject current=null] : iv_ruleTaskPattern= ruleTaskPattern EOF ;
    public final EObject entryRuleTaskPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskPattern = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1162:2: (iv_ruleTaskPattern= ruleTaskPattern EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1163:2: iv_ruleTaskPattern= ruleTaskPattern EOF
            {
             newCompositeNode(grammarAccess.getTaskPatternRule()); 
            pushFollow(FOLLOW_ruleTaskPattern_in_entryRuleTaskPattern2443);
            iv_ruleTaskPattern=ruleTaskPattern();

            state._fsp--;

             current =iv_ruleTaskPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskPattern2453); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1170:1: ruleTaskPattern returns [EObject current=null] : (otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1173:28: ( (otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1174:1: (otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1174:1: (otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1174:3: otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleTaskPattern2490); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskPatternAccess().getTaskPatternKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1178:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1179:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1179:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1180:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskPattern2507); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleTaskPattern2524); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskPatternAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1200:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1200:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleTaskPattern2537); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskPatternAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1204:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1205:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1205:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1206:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskPattern2554); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1222:4: (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==62) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1222:6: otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleTaskPattern2574); 

                        	newLeafNode(otherlv_5, grammarAccess.getTaskPatternAccess().getTypesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleTaskPattern2586); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskPatternAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1230:1: ( (otherlv_7= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1231:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1231:1: (otherlv_7= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1232:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskPatternRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskPattern2606); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getTaskPatternAccess().getTaskTypesTaskTypeCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleTaskPattern2619); 

                        	newLeafNode(otherlv_8, grammarAccess.getTaskPatternAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleTaskPattern2633); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1259:1: entryRuleTaskType returns [EObject current=null] : iv_ruleTaskType= ruleTaskType EOF ;
    public final EObject entryRuleTaskType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1260:2: (iv_ruleTaskType= ruleTaskType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1261:2: iv_ruleTaskType= ruleTaskType EOF
            {
             newCompositeNode(grammarAccess.getTaskTypeRule()); 
            pushFollow(FOLLOW_ruleTaskType_in_entryRuleTaskType2669);
            iv_ruleTaskType=ruleTaskType();

            state._fsp--;

             current =iv_ruleTaskType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskType2679); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1268:1: ruleTaskType returns [EObject current=null] : (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1271:28: ( (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1272:1: (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1272:1: (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1272:3: otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleTaskType2716); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskTypeAccess().getTaskTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1276:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1277:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1277:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1278:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskType2733); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleTaskType2750); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1298:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1298:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleTaskType2763); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1302:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1303:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1303:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1304:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskType2780); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleTaskType2799); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1332:1: entryRuleValueFunction returns [EObject current=null] : iv_ruleValueFunction= ruleValueFunction EOF ;
    public final EObject entryRuleValueFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueFunction = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1333:2: (iv_ruleValueFunction= ruleValueFunction EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1334:2: iv_ruleValueFunction= ruleValueFunction EOF
            {
             newCompositeNode(grammarAccess.getValueFunctionRule()); 
            pushFollow(FOLLOW_ruleValueFunction_in_entryRuleValueFunction2835);
            iv_ruleValueFunction=ruleValueFunction();

            state._fsp--;

             current =iv_ruleValueFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueFunction2845); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1341:1: ruleValueFunction returns [EObject current=null] : (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1344:28: ( (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1345:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1345:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1345:3: otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleValueFunction2882); 

                	newLeafNode(otherlv_0, grammarAccess.getValueFunctionAccess().getValueFunctionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1349:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1350:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1350:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1351:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueFunction2899); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleValueFunction2916); 

                	newLeafNode(otherlv_2, grammarAccess.getValueFunctionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1371:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1371:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleValueFunction2929); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueFunctionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1375:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1376:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1376:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1377:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueFunction2946); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleValueFunction2965); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1405:1: entryRuleProcessModel returns [EObject current=null] : iv_ruleProcessModel= ruleProcessModel EOF ;
    public final EObject entryRuleProcessModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessModel = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1406:2: (iv_ruleProcessModel= ruleProcessModel EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1407:2: iv_ruleProcessModel= ruleProcessModel EOF
            {
             newCompositeNode(grammarAccess.getProcessModelRule()); 
            pushFollow(FOLLOW_ruleProcessModel_in_entryRuleProcessModel3001);
            iv_ruleProcessModel=ruleProcessModel();

            state._fsp--;

             current =iv_ruleProcessModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessModel3011); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1414:1: ruleProcessModel returns [EObject current=null] : (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleProcessModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1417:28: ( (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1418:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1418:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1418:3: otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleProcessModel3048); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessModelAccess().getProcessModelKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1422:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1423:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1423:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1424:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessModel3065); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1440:2: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1440:4: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleProcessModel3083); 

                        	newLeafNode(otherlv_2, grammarAccess.getProcessModelAccess().getDescriptionKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1444:1: ( (lv_description_3_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1445:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1445:1: (lv_description_3_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1446:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessModel3100); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getProcessModelAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcessModelRule());
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
            pushFollow(FOLLOW_ruleStrategy_in_entryRuleStrategy3145);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategy3155); 

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
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleStrategy3192); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getStrategyKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1489:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1490:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1490:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1491:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategy3209); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleStrategy3226); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1511:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1511:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleStrategy3239); 

                        	newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1515:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1516:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1516:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1517:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStrategy3256); 

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
            	    
            pushFollow(FOLLOW_ruleWIAcceptance_in_ruleStrategy3284);
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
            	    
            pushFollow(FOLLOW_ruleWISelection_in_ruleStrategy3305);
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
            	    
            pushFollow(FOLLOW_ruleWIAssignment_in_ruleStrategy3326);
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
            	    
            pushFollow(FOLLOW_ruleResourceAllocation_in_ruleStrategy3347);
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
            	    
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleStrategy3368);
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

            otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleStrategy3380); 

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
            pushFollow(FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance3416);
            iv_ruleWIAcceptance=ruleWIAcceptance();

            state._fsp--;

             current =iv_ruleWIAcceptance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptance3426); 

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
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleWIAcceptance3463); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceAccess().getWIAcceptanceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1652:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1653:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1653:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1654:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptance3480); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWIAcceptance3497); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1674:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1674:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleWIAcceptance3510); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1678:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1679:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1679:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1680:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptance3527); 

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
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==68) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1696:6: otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleWIAcceptance3547); 

                        	newLeafNode(otherlv_5, grammarAccess.getWIAcceptanceAccess().getBackLogLimitKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1700:1: ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1701:1: (lv_backlogQLimit_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1701:1: (lv_backlogQLimit_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1702:3: lv_backlogQLimit_6_0= RULE_INT
                    {
                    lv_backlogQLimit_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance3564); 

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
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==69) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1718:6: otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,69,FOLLOW_69_in_ruleWIAcceptance3584); 

                        	newLeafNode(otherlv_7, grammarAccess.getWIAcceptanceAccess().getWIPLimitKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1722:1: ( (lv_readyQLimit_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1723:1: (lv_readyQLimit_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1723:1: (lv_readyQLimit_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1724:3: lv_readyQLimit_8_0= RULE_INT
                    {
                    lv_readyQLimit_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance3601); 

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

            otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleWIAcceptance3620); 

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
            pushFollow(FOLLOW_ruleWISelection_in_entryRuleWISelection3656);
            iv_ruleWISelection=ruleWISelection();

            state._fsp--;

             current =iv_ruleWISelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelection3666); 

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
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleWISelection3703); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionAccess().getWISelectionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1769:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1770:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1770:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1771:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelection3720); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWISelection3737); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1791:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1791:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleWISelection3750); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1795:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1796:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1796:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1797:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelection3767); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleWISelection3786); 

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
            pushFollow(FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment3822);
            iv_ruleWIAssignment=ruleWIAssignment();

            state._fsp--;

             current =iv_ruleWIAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignment3832); 

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
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleWIAssignment3869); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentAccess().getWIAssignmentKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1842:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1843:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1843:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1844:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignment3886); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWIAssignment3903); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1864:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1864:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleWIAssignment3916); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1868:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1869:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1869:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1870:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignment3933); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleWIAssignment3952); 

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
            pushFollow(FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation3988);
            iv_ruleResourceAllocation=ruleResourceAllocation();

            state._fsp--;

             current =iv_ruleResourceAllocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocation3998); 

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
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleResourceAllocation4035); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationAccess().getResourceAllocationKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1915:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1916:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1916:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1917:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocation4052); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleResourceAllocation4069); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1937:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1937:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleResourceAllocation4082); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1941:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1942:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1942:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1943:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocation4099); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleResourceAllocation4118); 

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
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing4154);
            iv_ruleResourceOutsourcing=ruleResourceOutsourcing();

            state._fsp--;

             current =iv_ruleResourceOutsourcing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcing4164); 

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
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleResourceOutsourcing4201); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingAccess().getResourceOutsourcingKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1988:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1989:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1989:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1990:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcing4218); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleResourceOutsourcing4235); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2010:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2010:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleResourceOutsourcing4248); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2014:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2015:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2015:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2016:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcing4265); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleResourceOutsourcing4284); 

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
            pushFollow(FOLLOW_ruleWorkSource_in_entryRuleWorkSource4320);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSource4330); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2053:1: ruleWorkSource returns [EObject current=null] : (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2056:28: ( (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2057:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2057:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2057:3: otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleWorkSource4367); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2061:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2062:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2062:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2063:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4384); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWorkSource4401); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2083:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2083:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleWorkSource4414); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2087:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2088:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2088:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2089:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkSource4431); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2105:4: (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==75) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2105:6: otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleWorkSource4451); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkSourceAccess().getTargetUnitsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleWorkSource4463); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2113:1: ( (otherlv_7= RULE_ID ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_ID) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2114:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2114:1: (otherlv_7= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2115:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4483); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getTargetUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);

                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleWorkSource4496); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2130:3: ( (lv_assignmentRule_9_0= ruleWIAssignment ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==71) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2131:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2131:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2132:3: lv_assignmentRule_9_0= ruleWIAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkSourceAccess().getAssignmentRuleWIAssignmentParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleWorkSource4519);
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

            otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleWorkSource4532); 

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
            pushFollow(FOLLOW_ruleWorkItem_in_entryRuleWorkItem4568);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItem4578); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2169:1: ruleWorkItem returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}' ) ;
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
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token lv_classOfService_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token lv_arrivalTime_32_0=null;
        Token otherlv_33=null;
        Token lv_dueDate_34_0=null;
        Token otherlv_35=null;
        EObject lv_causalTriggers_20_0 = null;

        AntlrDatatypeRuleToken lv_efforts_24_0 = null;

        AntlrDatatypeRuleToken lv_value_26_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2172:28: ( (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2173:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2173:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2173:3: otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleWorkItem4615); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2177:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2178:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2178:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2179:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4632); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWorkItem4649); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2199:1: (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==76) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2199:3: otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_76_in_ruleWorkItem4662); 

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
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4682); 

                    		newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getProfileWorkItemProfileCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2216:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2216:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleWorkItem4697); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2220:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2221:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2221:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2222:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItem4714); 

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
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==77) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2238:6: otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,77,FOLLOW_77_in_ruleWorkItem4734); 

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
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4754); 

                    		newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getPatternTaskPatternCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2255:4: (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==78) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2255:6: otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem4769); 

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
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4789); 

                    		newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getPatternTypeTaskTypeCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2272:4: (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==79) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2272:6: otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,79,FOLLOW_79_in_ruleWorkItem4804); 

                        	newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getPredecessorsKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleWorkItem4816); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2280:1: ( (otherlv_13= RULE_ID ) )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ID) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2281:1: (otherlv_13= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2281:1: (otherlv_13= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2282:3: otherlv_13= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4836); 

                    	    		newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_7_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);

                    otherlv_14=(Token)match(input,48,FOLLOW_48_in_ruleWorkItem4849); 

                        	newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2297:3: (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==80) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2297:5: otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,80,FOLLOW_80_in_ruleWorkItem4864); 

                        	newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getSubtasksKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,47,FOLLOW_47_in_ruleWorkItem4876); 

                        	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2305:1: ( (otherlv_17= RULE_ID ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==RULE_ID) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2306:1: (otherlv_17= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2306:1: (otherlv_17= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2307:3: otherlv_17= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4896); 

                    	    		newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_8_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);

                    otherlv_18=(Token)match(input,48,FOLLOW_48_in_ruleWorkItem4909); 

                        	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2322:3: (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==81) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2322:5: otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )*
                    {
                    otherlv_19=(Token)match(input,81,FOLLOW_81_in_ruleWorkItem4924); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getCausalTriggersKeyword_9_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2326:1: ( (lv_causalTriggers_20_0= ruleCausality ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=84 && LA57_0<=85)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2327:1: (lv_causalTriggers_20_0= ruleCausality )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2327:1: (lv_causalTriggers_20_0= ruleCausality )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2328:3: lv_causalTriggers_20_0= ruleCausality
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getCausalTriggersCausalityParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausality_in_ruleWorkItem4945);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2344:5: (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==54) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2344:7: otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+
                    {
                    otherlv_21=(Token)match(input,54,FOLLOW_54_in_ruleWorkItem4961); 

                        	newLeafNode(otherlv_21, grammarAccess.getWorkItemAccess().getRequiredServicesKeyword_10_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2348:1: ( (otherlv_22= RULE_ID ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2349:1: (otherlv_22= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2349:1: (otherlv_22= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2350:3: otherlv_22= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4981); 

                    	    		newLeafNode(otherlv_22, grammarAccess.getWorkItemAccess().getRequiredServicesServiceTypeCrossReference_10_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2361:5: (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==55) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2361:7: otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) )
                    {
                    otherlv_23=(Token)match(input,55,FOLLOW_55_in_ruleWorkItem4997); 

                        	newLeafNode(otherlv_23, grammarAccess.getWorkItemAccess().getEffortsKeyword_11_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2365:1: ( (lv_efforts_24_0= ruleDouble ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2366:1: (lv_efforts_24_0= ruleDouble )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2366:1: (lv_efforts_24_0= ruleDouble )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2367:3: lv_efforts_24_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getEffortsDoubleParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleWorkItem5018);
                    lv_efforts_24_0=ruleDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"efforts",
                            		lv_efforts_24_0, 
                            		"Double");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2383:4: (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==56) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2383:6: otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) )
                    {
                    otherlv_25=(Token)match(input,56,FOLLOW_56_in_ruleWorkItem5033); 

                        	newLeafNode(otherlv_25, grammarAccess.getWorkItemAccess().getValueKeyword_12_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2387:1: ( (lv_value_26_0= ruleDouble ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2388:1: (lv_value_26_0= ruleDouble )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2388:1: (lv_value_26_0= ruleDouble )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2389:3: lv_value_26_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getValueDoubleParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleWorkItem5054);
                    lv_value_26_0=ruleDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_26_0, 
                            		"Double");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2405:4: (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==57) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2405:6: otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) )
                    {
                    otherlv_27=(Token)match(input,57,FOLLOW_57_in_ruleWorkItem5069); 

                        	newLeafNode(otherlv_27, grammarAccess.getWorkItemAccess().getClassOfServiceKeyword_13_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2409:1: ( (lv_classOfService_28_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2410:1: (lv_classOfService_28_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2410:1: (lv_classOfService_28_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2411:3: lv_classOfService_28_0= RULE_ID
                    {
                    lv_classOfService_28_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5086); 

                    			newLeafNode(lv_classOfService_28_0, grammarAccess.getWorkItemAccess().getClassOfServiceIDTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"classOfService",
                            		lv_classOfService_28_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2427:4: (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==74) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2427:6: otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) )
                    {
                    otherlv_29=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5106); 

                        	newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getWorkSourceKeyword_14_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2431:1: ( (otherlv_30= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2432:1: (otherlv_30= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2432:1: (otherlv_30= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2433:3: otherlv_30= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5126); 

                    		newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getWorkSourceWorkSourceCrossReference_14_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2444:4: (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==82) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2444:6: otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) )
                    {
                    otherlv_31=(Token)match(input,82,FOLLOW_82_in_ruleWorkItem5141); 

                        	newLeafNode(otherlv_31, grammarAccess.getWorkItemAccess().getArrivalTimeKeyword_15_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2448:1: ( (lv_arrivalTime_32_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2449:1: (lv_arrivalTime_32_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2449:1: (lv_arrivalTime_32_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2450:3: lv_arrivalTime_32_0= RULE_INT
                    {
                    lv_arrivalTime_32_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem5158); 

                    			newLeafNode(lv_arrivalTime_32_0, grammarAccess.getWorkItemAccess().getArrivalTimeINTTerminalRuleCall_15_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arrivalTime",
                            		lv_arrivalTime_32_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2466:4: (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==83) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2466:6: otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) )
                    {
                    otherlv_33=(Token)match(input,83,FOLLOW_83_in_ruleWorkItem5178); 

                        	newLeafNode(otherlv_33, grammarAccess.getWorkItemAccess().getDueDateKeyword_16_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2470:1: ( (lv_dueDate_34_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2471:1: (lv_dueDate_34_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2471:1: (lv_dueDate_34_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2472:3: lv_dueDate_34_0= RULE_INT
                    {
                    lv_dueDate_34_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem5195); 

                    			newLeafNode(lv_dueDate_34_0, grammarAccess.getWorkItemAccess().getDueDateINTTerminalRuleCall_16_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dueDate",
                            		lv_dueDate_34_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_35=(Token)match(input,48,FOLLOW_48_in_ruleWorkItem5214); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2500:1: entryRuleCausality returns [EObject current=null] : iv_ruleCausality= ruleCausality EOF ;
    public final EObject entryRuleCausality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCausality = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2501:2: (iv_ruleCausality= ruleCausality EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2502:2: iv_ruleCausality= ruleCausality EOF
            {
             newCompositeNode(grammarAccess.getCausalityRule()); 
            pushFollow(FOLLOW_ruleCausality_in_entryRuleCausality5250);
            iv_ruleCausality=ruleCausality();

            state._fsp--;

             current =iv_ruleCausality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCausality5260); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2509:1: ruleCausality returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleCausality() throws RecognitionException {
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2512:28: ( ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2513:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2513:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2513:2: (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2513:2: (otherlv_0= '=>' | otherlv_1= '->' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==84) ) {
                alt67=1;
            }
            else if ( (LA67_0==85) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2513:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleCausality5298); 

                        	newLeafNode(otherlv_0, grammarAccess.getCausalityAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2518:7: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleCausality5316); 

                        	newLeafNode(otherlv_1, grammarAccess.getCausalityAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleCausality5329); 

                	newLeafNode(otherlv_2, grammarAccess.getCausalityAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2526:1: ( (otherlv_3= RULE_ID ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2527:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2527:1: (otherlv_3= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2528:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCausalityRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCausality5349); 

            	    		newLeafNode(otherlv_3, grammarAccess.getCausalityAccess().getTriggeredWorkItemCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleCausality5362); 

                	newLeafNode(otherlv_4, grammarAccess.getCausalityAccess().getRightCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2543:1: (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==86) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2543:3: otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,86,FOLLOW_86_in_ruleCausality5375); 

                        	newLeafNode(otherlv_5, grammarAccess.getCausalityAccess().getAtProgressKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2547:1: ( (lv_atProgress_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2548:1: (lv_atProgress_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2548:1: (lv_atProgress_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2549:3: lv_atProgress_6_0= RULE_INT
                    {
                    lv_atProgress_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausality5392); 

                    			newLeafNode(lv_atProgress_6_0, grammarAccess.getCausalityAccess().getAtProgressINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCausalityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"atProgress",
                            		lv_atProgress_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2565:4: (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==87) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2565:6: otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,87,FOLLOW_87_in_ruleCausality5412); 

                        	newLeafNode(otherlv_7, grammarAccess.getCausalityAccess().getOnProbabilityKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2569:1: ( (lv_onProbability_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2570:1: (lv_onProbability_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2570:1: (lv_onProbability_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2571:3: lv_onProbability_8_0= RULE_INT
                    {
                    lv_onProbability_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausality5429); 

                    			newLeafNode(lv_onProbability_8_0, grammarAccess.getCausalityAccess().getOnProbabilityINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCausalityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"onProbability",
                            		lv_onProbability_8_0, 
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


    // $ANTLR start "entryRuleServiceType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2597:1: entryRuleServiceType returns [EObject current=null] : iv_ruleServiceType= ruleServiceType EOF ;
    public final EObject entryRuleServiceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2598:2: (iv_ruleServiceType= ruleServiceType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2599:2: iv_ruleServiceType= ruleServiceType EOF
            {
             newCompositeNode(grammarAccess.getServiceTypeRule()); 
            pushFollow(FOLLOW_ruleServiceType_in_entryRuleServiceType5474);
            iv_ruleServiceType=ruleServiceType();

            state._fsp--;

             current =iv_ruleServiceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceType5484); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2606:1: ruleServiceType returns [EObject current=null] : (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2609:28: ( (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2610:1: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2610:1: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2610:3: otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleServiceType5521); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceTypeAccess().getServiceTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2614:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2615:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2615:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2616:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceType5538); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2632:2: (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==47) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2632:4: otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleServiceType5556); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceTypeAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2636:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==51) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2636:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleServiceType5569); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceTypeAccess().getDescriptionKeyword_2_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2640:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2641:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2641:1: (lv_description_4_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2642:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceType5586); 

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

                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleServiceType5605); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2670:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2671:2: (iv_ruleService= ruleService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2672:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService5643);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService5653); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2679:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )? ) ;
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
        Token otherlv_9=null;
        EObject lv_efficiency_8_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2682:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2683:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2683:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2683:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleService5690); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2687:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2688:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2688:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2689:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService5707); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2705:2: (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==47) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2705:4: otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleService5725); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2709:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==51) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2709:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleService5738); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDescriptionKeyword_2_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2713:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2714:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2714:1: (lv_description_4_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2715:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService5755); 

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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2731:4: (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2731:6: otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleService5775); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getTypeKeyword_2_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2735:1: ( (otherlv_6= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2736:1: (otherlv_6= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2736:1: (otherlv_6= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2737:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService5795); 

                    		newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getTypeServiceTypeCrossReference_2_2_1_0()); 
                    	

                    }


                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2748:3: (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==90) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2748:5: otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) )
                            {
                            otherlv_7=(Token)match(input,90,FOLLOW_90_in_ruleService5809); 

                                	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getEfficiencyKeyword_2_3_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2752:1: ( (lv_efficiency_8_0= ruleNumExpression ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2753:1: (lv_efficiency_8_0= ruleNumExpression )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2753:1: (lv_efficiency_8_0= ruleNumExpression )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2754:3: lv_efficiency_8_0= ruleNumExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getServiceAccess().getEfficiencyNumExpressionParserRuleCall_2_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNumExpression_in_ruleService5830);
                            lv_efficiency_8_0=ruleNumExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getServiceRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"efficiency",
                                    		lv_efficiency_8_0, 
                                    		"NumExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleService5844); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2782:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2783:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2784:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider5882);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProvider5892); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2791:1: ruleServiceProvider returns [EObject current=null] : ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2794:28: ( ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2795:1: ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2795:1: ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2795:2: (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2795:2: (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==91) ) {
                alt76=1;
            }
            else if ( (LA76_0==92) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2795:4: otherlv_0= 'ServiceProvider'
                    {
                    otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleServiceProvider5930); 

                        	newLeafNode(otherlv_0, grammarAccess.getServiceProviderAccess().getServiceProviderKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2800:7: otherlv_1= 'Group'
                    {
                    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleServiceProvider5948); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getGroupKeyword_0_1());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2804:2: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2805:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2805:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2806:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider5966); 

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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider5983); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2826:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==51) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2826:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleServiceProvider5996); 

                        	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2830:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2831:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2831:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2832:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceProvider6013); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2848:4: (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==93) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2848:6: otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,93,FOLLOW_93_in_ruleServiceProvider6033); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getSourceUnitsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6045); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2856:1: ( (otherlv_8= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2857:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2857:1: (otherlv_8= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2858:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6065); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getSourceUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6078); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2873:3: (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==75) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2873:5: otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,75,FOLLOW_75_in_ruleServiceProvider6093); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getTargetUnitsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6105); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2881:1: ( (otherlv_12= RULE_ID ) )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==RULE_ID) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2882:1: (otherlv_12= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2882:1: (otherlv_12= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2883:3: otherlv_12= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6125); 

                    	    		newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getTargetUnitsServiceProviderCrossReference_5_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt80 >= 1 ) break loop80;
                                EarlyExitException eee =
                                    new EarlyExitException(80, input);
                                throw eee;
                        }
                        cnt80++;
                    } while (true);

                    otherlv_13=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6138); 

                        	newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2898:3: (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==94) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2898:5: otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,94,FOLLOW_94_in_ruleServiceProvider6153); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getSubordinateUnitsKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6165); 

                        	newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2906:1: ( (otherlv_16= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2907:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2907:1: (otherlv_16= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2908:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6185); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getSubordinateUnitsServiceProviderCrossReference_6_2_0()); 
                    	    	

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

                    otherlv_17=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6198); 

                        	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2923:3: (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==95) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2923:5: otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,95,FOLLOW_95_in_ruleServiceProvider6213); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getServicesKeyword_7_0());
                        
                    otherlv_19=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6225); 

                        	newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2931:1: ( (lv_services_20_0= ruleService ) )+
                    int cnt84=0;
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==89) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2932:1: (lv_services_20_0= ruleService )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2932:1: (lv_services_20_0= ruleService )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2933:3: lv_services_20_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getServicesServiceParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleServiceProvider6246);
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
                    	    if ( cnt84 >= 1 ) break loop84;
                                EarlyExitException eee =
                                    new EarlyExitException(84, input);
                                throw eee;
                        }
                        cnt84++;
                    } while (true);

                    otherlv_21=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6259); 

                        	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2953:3: (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==96) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2953:5: otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}'
                    {
                    otherlv_22=(Token)match(input,96,FOLLOW_96_in_ruleServiceProvider6274); 

                        	newLeafNode(otherlv_22, grammarAccess.getServiceProviderAccess().getGovernanceSearchStrategyKeyword_8_0());
                        
                    otherlv_23=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6286); 

                        	newLeafNode(otherlv_23, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    otherlv_24=(Token)match(input,97,FOLLOW_97_in_ruleServiceProvider6298); 

                        	newLeafNode(otherlv_24, grammarAccess.getServiceProviderAccess().getDefaultKeyword_8_2());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2965:1: ( (otherlv_25= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2966:1: (otherlv_25= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2966:1: (otherlv_25= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2967:3: otherlv_25= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6318); 

                    		newLeafNode(otherlv_25, grammarAccess.getServiceProviderAccess().getDefaultStrategyStrategyCrossReference_8_3_0()); 
                    	

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2978:2: (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==98) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2978:4: otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}'
                            {
                            otherlv_26=(Token)match(input,98,FOLLOW_98_in_ruleServiceProvider6331); 

                                	newLeafNode(otherlv_26, grammarAccess.getServiceProviderAccess().getSpecifiedKeyword_8_4_0());
                                
                            otherlv_27=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6343); 

                                	newLeafNode(otherlv_27, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_8_4_1());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2986:1: ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )?
                            int alt86=2;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==67) ) {
                                alt86=1;
                            }
                            switch (alt86) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2987:1: (lv_acceptanceRule_28_0= ruleWIAcceptance )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2987:1: (lv_acceptanceRule_28_0= ruleWIAcceptance )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2988:3: lv_acceptanceRule_28_0= ruleWIAcceptance
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAcceptanceRuleWIAcceptanceParserRuleCall_8_4_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWIAcceptance_in_ruleServiceProvider6364);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3004:3: ( (lv_selectionRule_29_0= ruleWISelection ) )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==70) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3005:1: (lv_selectionRule_29_0= ruleWISelection )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3005:1: (lv_selectionRule_29_0= ruleWISelection )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3006:3: lv_selectionRule_29_0= ruleWISelection
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getSelectionRuleWISelectionParserRuleCall_8_4_3_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWISelection_in_ruleServiceProvider6386);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3022:3: ( (lv_assignmentRule_30_0= ruleWIAssignment ) )?
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==71) ) {
                                alt88=1;
                            }
                            switch (alt88) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3023:1: (lv_assignmentRule_30_0= ruleWIAssignment )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3023:1: (lv_assignmentRule_30_0= ruleWIAssignment )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3024:3: lv_assignmentRule_30_0= ruleWIAssignment
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAssignmentRuleWIAssignmentParserRuleCall_8_4_4_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleServiceProvider6408);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3040:3: ( (lv_allocationRule_31_0= ruleResourceAllocation ) )?
                            int alt89=2;
                            int LA89_0 = input.LA(1);

                            if ( (LA89_0==72) ) {
                                alt89=1;
                            }
                            switch (alt89) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3041:1: (lv_allocationRule_31_0= ruleResourceAllocation )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3041:1: (lv_allocationRule_31_0= ruleResourceAllocation )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3042:3: lv_allocationRule_31_0= ruleResourceAllocation
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAllocationRuleResourceAllocationParserRuleCall_8_4_5_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleResourceAllocation_in_ruleServiceProvider6430);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3058:3: ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==73) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3059:1: (lv_outsourcingRule_32_0= ruleResourceOutsourcing )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3059:1: (lv_outsourcingRule_32_0= ruleResourceOutsourcing )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3060:3: lv_outsourcingRule_32_0= ruleResourceOutsourcing
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getOutsourcingRuleResourceOutsourcingParserRuleCall_8_4_6_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleServiceProvider6452);
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

                            otherlv_33=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6465); 

                                	newLeafNode(otherlv_33, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_8_4_7());
                                

                            }
                            break;

                    }

                    otherlv_34=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6479); 

                        	newLeafNode(otherlv_34, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_8_5());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3084:3: (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==99) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3084:5: otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}'
                    {
                    otherlv_35=(Token)match(input,99,FOLLOW_99_in_ruleServiceProvider6494); 

                        	newLeafNode(otherlv_35, grammarAccess.getServiceProviderAccess().getResourcesKeyword_9_0());
                        
                    otherlv_36=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6506); 

                        	newLeafNode(otherlv_36, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3092:1: ( (lv_resources_37_0= ruleAsset ) )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==100) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3093:1: (lv_resources_37_0= ruleAsset )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3093:1: (lv_resources_37_0= ruleAsset )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3094:3: lv_resources_37_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleServiceProvider6527);
                    	    lv_resources_37_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_37_0, 
                    	            		"Asset");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

                    otherlv_38=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6540); 

                        	newLeafNode(otherlv_38, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6554); 

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


    // $ANTLR start "entryRuleAsset"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3126:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3127:2: (iv_ruleAsset= ruleAsset EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3128:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset6590);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset6600); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3135:1: ruleAsset returns [EObject current=null] : (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_quantity_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_services_9_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3138:28: ( (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3139:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3139:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3139:3: otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleAsset6637); 

                	newLeafNode(otherlv_0, grammarAccess.getAssetAccess().getResourceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3143:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3144:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3144:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3145:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset6654); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleAsset6671); 

                	newLeafNode(otherlv_2, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3165:1: (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==60) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3165:3: otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleAsset6684); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getQuantityKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3169:1: ( (lv_quantity_4_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3170:1: (lv_quantity_4_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3170:1: (lv_quantity_4_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3171:3: lv_quantity_4_0= RULE_INT
                    {
                    lv_quantity_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAsset6701); 

                    			newLeafNode(lv_quantity_4_0, grammarAccess.getAssetAccess().getQuantityINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"quantity",
                            		lv_quantity_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3187:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==51) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3187:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleAsset6721); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3191:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3192:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3192:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3193:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAsset6738); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getAssetAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssetRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3209:4: (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==95) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3209:6: otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,95,FOLLOW_95_in_ruleAsset6758); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getServicesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,47,FOLLOW_47_in_ruleAsset6770); 

                        	newLeafNode(otherlv_8, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3217:1: ( (lv_services_9_0= ruleService ) )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==89) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3218:1: (lv_services_9_0= ruleService )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3218:1: (lv_services_9_0= ruleService )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3219:3: lv_services_9_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getServicesServiceParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleAsset6791);
                    	    lv_services_9_0=ruleService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"services",
                    	            		lv_services_9_0, 
                    	            		"Service");
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

                    otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleAsset6804); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleAsset6818); 

                	newLeafNode(otherlv_11, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleCapability"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3253:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3254:2: (iv_ruleCapability= ruleCapability EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3255:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_ruleCapability_in_entryRuleCapability6856);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCapability6866); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3262:1: ruleCapability returns [EObject current=null] : (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3265:28: ( (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3266:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3266:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3266:3: otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleCapability6903); 

                	newLeafNode(otherlv_0, grammarAccess.getCapabilityAccess().getCapabilityKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3270:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3271:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3271:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3272:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCapability6920); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleCapability6937); 

                	newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3292:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==51) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3292:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleCapability6950); 

                        	newLeafNode(otherlv_3, grammarAccess.getCapabilityAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3296:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3297:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3297:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3298:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCapability6967); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3314:4: ( (lv_reqs_5_0= ruleRequirement ) )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==102) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3315:1: (lv_reqs_5_0= ruleRequirement )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3315:1: (lv_reqs_5_0= ruleRequirement )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3316:3: lv_reqs_5_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleCapability6995);
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
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);

            otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleCapability7008); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3344:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3345:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3346:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement7044);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement7054); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3353:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3356:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3357:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3357:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3357:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleRequirement7091); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3361:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3362:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3362:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3363:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement7108); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleRequirement7125); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3383:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==51) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3383:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleRequirement7138); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3387:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3388:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3388:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3389:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirement7155); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3405:4: (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3405:6: otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
            {
            otherlv_5=(Token)match(input,103,FOLLOW_103_in_ruleRequirement7175); 

                	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getWorkItemsKeyword_4_0());
                
            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleRequirement7187); 

                	newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_4_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3413:1: ( (otherlv_7= RULE_ID ) )+
            int cnt102=0;
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==RULE_ID) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3414:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3414:1: (otherlv_7= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3415:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement7207); 

            	    		newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getRTasksWorkItemCrossReference_4_2_0()); 
            	    	

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

            otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleRequirement7220); 

                	newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4_3());
                

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3430:2: (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==104) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3430:4: otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )*
                    {
                    otherlv_9=(Token)match(input,104,FOLLOW_104_in_ruleRequirement7234); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3434:1: ( (lv_dependencies_10_0= ruleCausality ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( ((LA103_0>=84 && LA103_0<=85)) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3435:1: (lv_dependencies_10_0= ruleCausality )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3435:1: (lv_dependencies_10_0= ruleCausality )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3436:3: lv_dependencies_10_0= ruleCausality
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesCausalityParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausality_in_ruleRequirement7255);
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
                    	    break loop103;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleRequirement7270); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3466:1: entryRuleProvision returns [EObject current=null] : iv_ruleProvision= ruleProvision EOF ;
    public final EObject entryRuleProvision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvision = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3467:2: (iv_ruleProvision= ruleProvision EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3468:2: iv_ruleProvision= ruleProvision EOF
            {
             newCompositeNode(grammarAccess.getProvisionRule()); 
            pushFollow(FOLLOW_ruleProvision_in_entryRuleProvision7308);
            iv_ruleProvision=ruleProvision();

            state._fsp--;

             current =iv_ruleProvision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvision7318); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3475:1: ruleProvision returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3478:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3479:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3479:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3479:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleProvision7355); 

                	newLeafNode(otherlv_0, grammarAccess.getProvisionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3483:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3484:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3484:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3485:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProvisionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision7375); 

            		newLeafNode(otherlv_1, grammarAccess.getProvisionAccess().getServiceNameServiceTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,106,FOLLOW_106_in_ruleProvision7387); 

                	newLeafNode(otherlv_2, grammarAccess.getProvisionAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleProvision7399); 

                	newLeafNode(otherlv_3, grammarAccess.getProvisionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3504:1: ( (otherlv_4= RULE_ID ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==RULE_ID) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3505:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3505:1: (otherlv_4= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3506:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProvisionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision7419); 

            	    		newLeafNode(otherlv_4, grammarAccess.getProvisionAccess().getProvidersServiceProviderCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleProvision7432); 

                	newLeafNode(otherlv_5, grammarAccess.getProvisionAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,107,FOLLOW_107_in_ruleProvision7444); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3533:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3534:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3535:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine7480);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine7490); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3542:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3545:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3546:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3546:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3546:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )*
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3546:2: ()
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3547:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3552:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==108) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3552:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,108,FOLLOW_108_in_ruleStatemachine7537); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3556:1: ( (lv_events_2_0= ruleEvent ) )+
                    int cnt106=0;
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==RULE_ID) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3557:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3557:1: (lv_events_2_0= ruleEvent )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3558:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine7558);
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
                    	    if ( cnt106 >= 1 ) break loop106;
                                EarlyExitException eee =
                                    new EarlyExitException(106, input);
                                throw eee;
                        }
                        cnt106++;
                    } while (true);

                    otherlv_3=(Token)match(input,109,FOLLOW_109_in_ruleStatemachine7571); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3578:3: (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==110) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3578:5: otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,110,FOLLOW_110_in_ruleStatemachine7586); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getActivitiesKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3582:1: ( (lv_commands_5_0= ruleCommand ) )+
                    int cnt108=0;
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==RULE_ID) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3583:1: (lv_commands_5_0= ruleCommand )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3583:1: (lv_commands_5_0= ruleCommand )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3584:3: lv_commands_5_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleStatemachine7607);
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
                    	    if ( cnt108 >= 1 ) break loop108;
                                EarlyExitException eee =
                                    new EarlyExitException(108, input);
                                throw eee;
                        }
                        cnt108++;
                    } while (true);

                    otherlv_6=(Token)match(input,109,FOLLOW_109_in_ruleStatemachine7620); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3604:3: ( (lv_states_7_0= ruleState ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==111) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3605:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3605:1: (lv_states_7_0= ruleState )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3606:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine7643);
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
            	    break loop110;
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3630:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3631:2: (iv_ruleEvent= ruleEvent EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3632:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent7680);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent7690); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3639:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3642:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3643:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3643:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3643:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3643:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3644:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3644:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3645:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent7732); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3661:2: ( (lv_code_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3662:1: (lv_code_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3662:1: (lv_code_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3663:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent7754); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3687:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3688:2: (iv_ruleCommand= ruleCommand EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3689:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand7795);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand7805); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3696:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3699:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3700:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3700:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3700:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3700:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3701:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3701:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3702:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand7847); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3718:2: ( (lv_code_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3719:1: (lv_code_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3719:1: (lv_code_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3720:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand7869); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3744:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3745:2: (iv_ruleState= ruleState EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3746:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState7910);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState7920); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3753:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3756:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3757:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3757:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3757:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleState7957); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3761:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3762:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3762:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3763:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState7974); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3779:2: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==112) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3779:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,112,FOLLOW_112_in_ruleState7992); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleState8004); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3787:1: ( (otherlv_4= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3788:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3788:1: (otherlv_4= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3789:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState8024); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0()); 
                    	    	

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

                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleState8037); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3804:3: ( (lv_transitions_6_0= ruleTransition ) )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==RULE_ID) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3805:1: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3805:1: (lv_transitions_6_0= ruleTransition )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3806:3: lv_transitions_6_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState8060);
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
            	    break loop113;
                }
            } while (true);

            otherlv_7=(Token)match(input,109,FOLLOW_109_in_ruleState8073); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3834:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3835:2: (iv_ruleTransition= ruleTransition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3836:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition8109);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition8119); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3843:1: ruleTransition returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3846:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3847:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3847:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_ID) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==84) ) {
                    alt115=1;
                }
                else if ( (LA115_1==113) ) {
                    alt115=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3847:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3847:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3847:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3847:3: ( (otherlv_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3848:1: (otherlv_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3848:1: (otherlv_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3849:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8165); 

                    		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleTransition8177); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3864:1: ( (otherlv_2= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3865:1: (otherlv_2= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3865:1: (otherlv_2= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3866:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8197); 

                    		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3878:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3878:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3878:7: ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3878:7: ( (otherlv_3= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3879:1: (otherlv_3= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3879:1: (otherlv_3= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3880:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8225); 

                    		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,113,FOLLOW_113_in_ruleTransition8237); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSolidusKeyword_1_1());
                        
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleTransition8249); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3899:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt114=0;
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==RULE_ID) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3900:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3900:1: (otherlv_6= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3901:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8269); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getEventactionsCommandCrossReference_1_3_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt114 >= 1 ) break loop114;
                                EarlyExitException eee =
                                    new EarlyExitException(114, input);
                                throw eee;
                        }
                        cnt114++;
                    } while (true);

                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleTransition8282); 

                        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_4());
                        
                    otherlv_8=(Token)match(input,84,FOLLOW_84_in_ruleTransition8294); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_5());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3920:1: ( (otherlv_9= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3921:1: (otherlv_9= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3921:1: (otherlv_9= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3922:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8314); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleKanbanSchedulingSystem139 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleKanbanSchedulingSystem165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleKanbanSchedulingSystem178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleKanbanSchedulingSystem190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessModel_in_ruleKanbanSchedulingSystem211 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleKanbanSchedulingSystem224 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKanbanSchedulingSystem236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleStrategy_in_ruleKanbanSchedulingSystem257 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000004L});
    public static final BitSet FOLLOW_16_in_ruleKanbanSchedulingSystem270 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKanbanSchedulingSystem282 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleTaskPattern_in_ruleKanbanSchedulingSystem303 = new BitSet(new long[]{0xA000000000000000L});
    public static final BitSet FOLLOW_ruleTaskType_in_ruleKanbanSchedulingSystem325 = new BitSet(new long[]{0x8000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKanbanSchedulingSystem338 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKanbanSchedulingSystem350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValueFunction_in_ruleKanbanSchedulingSystem371 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_20_in_ruleKanbanSchedulingSystem384 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleKanbanSchedulingSystem396 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleKanbanSchedulingSystem408 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleKanbanSchedulingSystem420 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleServiceType_in_ruleKanbanSchedulingSystem441 = new BitSet(new long[]{0x0000000001000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleKanbanSchedulingSystem454 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleKanbanSchedulingSystem466 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_ruleKanbanSchedulingSystem487 = new BitSet(new long[]{0x0000000004000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_26_in_ruleKanbanSchedulingSystem500 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleKanbanSchedulingSystem512 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleKanbanSchedulingSystem524 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleKanbanSchedulingSystem536 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleRepository_in_ruleKanbanSchedulingSystem557 = new BitSet(new long[]{0x0000200040000000L});
    public static final BitSet FOLLOW_30_in_ruleKanbanSchedulingSystem570 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleKanbanSchedulingSystem582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleWorkSource_in_ruleKanbanSchedulingSystem603 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_32_in_ruleKanbanSchedulingSystem616 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleKanbanSchedulingSystem628 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleWorkItem_in_ruleKanbanSchedulingSystem649 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_34_in_ruleKanbanSchedulingSystem662 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleKanbanSchedulingSystem674 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleKanbanSchedulingSystem686 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleKanbanSchedulingSystem698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem715 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleKanbanSchedulingSystem732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem749 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleKanbanSchedulingSystem766 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleKanbanSchedulingSystem778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName866 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleQualifiedName885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName900 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble999 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleDouble1018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumExpression_in_entryRuleNumExpression1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumExpression1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleNumExpression1136 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumExpression1156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleNumExpression1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleParameter1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution1358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDistribution1410 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDistribution1427 = new BitSet(new long[]{0x0000100000000030L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDistribution1448 = new BitSet(new long[]{0x0000100000000030L});
    public static final BitSet FOLLOW_44_in_ruleDistribution1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepository_in_entryRuleRepository1497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepository1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRepository1544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepository1564 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleRepository1576 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRepository1588 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_ruleWorkItemProfile_in_ruleRepository1609 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleRepository1622 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleRepository1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemProfile_in_entryRuleWorkItemProfile1670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemProfile1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleWorkItemProfile1717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile1734 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItemProfile1751 = new BitSet(new long[]{0x0FF9000000000000L});
    public static final BitSet FOLLOW_51_in_ruleWorkItemProfile1764 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemProfile1781 = new BitSet(new long[]{0x0FF1000000000000L});
    public static final BitSet FOLLOW_52_in_ruleWorkItemProfile1801 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItemProfile1813 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleWorkReference_in_ruleWorkItemProfile1834 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkItemProfile1847 = new BitSet(new long[]{0x0FE1000000000000L});
    public static final BitSet FOLLOW_53_in_ruleWorkItemProfile1862 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItemProfile1874 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleWorkDecomposition_in_ruleWorkItemProfile1895 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkItemProfile1908 = new BitSet(new long[]{0x0FC1000000000000L});
    public static final BitSet FOLLOW_54_in_ruleWorkItemProfile1923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile1943 = new BitSet(new long[]{0x0F81000000000010L});
    public static final BitSet FOLLOW_55_in_ruleWorkItemProfile1959 = new BitSet(new long[]{0x0F01040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItemProfile1980 = new BitSet(new long[]{0x0F01000000000000L});
    public static final BitSet FOLLOW_56_in_ruleWorkItemProfile1995 = new BitSet(new long[]{0x0E01040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItemProfile2016 = new BitSet(new long[]{0x0E01000000000000L});
    public static final BitSet FOLLOW_57_in_ruleWorkItemProfile2031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile2048 = new BitSet(new long[]{0x0C01000000000000L});
    public static final BitSet FOLLOW_58_in_ruleWorkItemProfile2073 = new BitSet(new long[]{0x0801000000000000L});
    public static final BitSet FOLLOW_59_in_ruleWorkItemProfile2105 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkItemProfile2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkReference_in_entryRuleWorkReference2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkReference2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleWorkReference2214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkReference2234 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleWorkReference2246 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkReference2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDecomposition_in_entryRuleWorkDecomposition2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkDecomposition2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleWorkDecomposition2350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkDecomposition2370 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleWorkDecomposition2382 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkDecomposition2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskPattern_in_entryRuleTaskPattern2443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskPattern2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTaskPattern2490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskPattern2507 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTaskPattern2524 = new BitSet(new long[]{0x4009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTaskPattern2537 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskPattern2554 = new BitSet(new long[]{0x4001000000000000L});
    public static final BitSet FOLLOW_62_in_ruleTaskPattern2574 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTaskPattern2586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskPattern2606 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleTaskPattern2619 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTaskPattern2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskType_in_entryRuleTaskType2669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskType2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTaskType2716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskType2733 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTaskType2750 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTaskType2763 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskType2780 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTaskType2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueFunction_in_entryRuleValueFunction2835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueFunction2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleValueFunction2882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueFunction2899 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleValueFunction2916 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleValueFunction2929 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueFunction2946 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleValueFunction2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessModel_in_entryRuleProcessModel3001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessModel3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleProcessModel3048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessModel3065 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleProcessModel3083 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessModel3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy3145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategy3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleStrategy3192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategy3209 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleStrategy3226 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_ruleStrategy3239 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStrategy3256 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleStrategy3284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleStrategy3305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleStrategy3326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleStrategy3347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleStrategy3368 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleStrategy3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance3416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptance3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleWIAcceptance3463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptance3480 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWIAcceptance3497 = new BitSet(new long[]{0x0009000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_51_in_ruleWIAcceptance3510 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptance3527 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleWIAcceptance3547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance3564 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleWIAcceptance3584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance3601 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWIAcceptance3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelection_in_entryRuleWISelection3656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelection3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleWISelection3703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelection3720 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWISelection3737 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleWISelection3750 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelection3767 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWISelection3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment3822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignment3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleWIAssignment3869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignment3886 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWIAssignment3903 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleWIAssignment3916 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignment3933 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWIAssignment3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation3988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocation3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleResourceAllocation4035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocation4052 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleResourceAllocation4069 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleResourceAllocation4082 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocation4099 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleResourceAllocation4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing4154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcing4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleResourceOutsourcing4201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcing4218 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleResourceOutsourcing4235 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleResourceOutsourcing4248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcing4265 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleResourceOutsourcing4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSource_in_entryRuleWorkSource4320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSource4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleWorkSource4367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4384 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkSource4401 = new BitSet(new long[]{0x0009000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_51_in_ruleWorkSource4414 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkSource4431 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_75_in_ruleWorkSource4451 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkSource4463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4483 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleWorkSource4496 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleWorkSource4519 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkSource4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItem_in_entryRuleWorkItem4568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItem4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleWorkItem4615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4632 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItem4649 = new BitSet(new long[]{0x03C9000000000000L,0x00000000000FF400L});
    public static final BitSet FOLLOW_76_in_ruleWorkItem4662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4682 = new BitSet(new long[]{0x03C9000000000000L,0x00000000000FE400L});
    public static final BitSet FOLLOW_51_in_ruleWorkItem4697 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItem4714 = new BitSet(new long[]{0x03C1000000000000L,0x00000000000FE400L});
    public static final BitSet FOLLOW_77_in_ruleWorkItem4734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4754 = new BitSet(new long[]{0x03C1000000000000L,0x00000000000FC400L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem4769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4789 = new BitSet(new long[]{0x03C1000000000000L,0x00000000000F8400L});
    public static final BitSet FOLLOW_79_in_ruleWorkItem4804 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItem4816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4836 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleWorkItem4849 = new BitSet(new long[]{0x03C1000000000000L,0x00000000000F0400L});
    public static final BitSet FOLLOW_80_in_ruleWorkItem4864 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItem4876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4896 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleWorkItem4909 = new BitSet(new long[]{0x03C1000000000000L,0x00000000000E0400L});
    public static final BitSet FOLLOW_81_in_ruleWorkItem4924 = new BitSet(new long[]{0x03C1000000000000L,0x00000000003C0400L});
    public static final BitSet FOLLOW_ruleCausality_in_ruleWorkItem4945 = new BitSet(new long[]{0x03C1000000000000L,0x00000000003C0400L});
    public static final BitSet FOLLOW_54_in_ruleWorkItem4961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4981 = new BitSet(new long[]{0x0381000000000010L,0x00000000000C0400L});
    public static final BitSet FOLLOW_55_in_ruleWorkItem4997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleWorkItem5018 = new BitSet(new long[]{0x0301000000000000L,0x00000000000C0400L});
    public static final BitSet FOLLOW_56_in_ruleWorkItem5033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleWorkItem5054 = new BitSet(new long[]{0x0201000000000000L,0x00000000000C0400L});
    public static final BitSet FOLLOW_57_in_ruleWorkItem5069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5086 = new BitSet(new long[]{0x0001000000000000L,0x00000000000C0400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5126 = new BitSet(new long[]{0x0001000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleWorkItem5141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem5158 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleWorkItem5178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem5195 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkItem5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCausality_in_entryRuleCausality5250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCausality5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleCausality5298 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_85_in_ruleCausality5316 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCausality5329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCausality5349 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleCausality5362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_86_in_ruleCausality5375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausality5392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleCausality5412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausality5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceType_in_entryRuleServiceType5474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceType5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleServiceType5521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceType5538 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleServiceType5556 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleServiceType5569 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceType5586 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceType5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService5643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleService5690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService5707 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleService5725 = new BitSet(new long[]{0x0008000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_51_in_ruleService5738 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService5755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleService5775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService5795 = new BitSet(new long[]{0x0001000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleService5809 = new BitSet(new long[]{0x0001040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleService5830 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleService5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider5882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProvider5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleServiceProvider5930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_92_in_ruleServiceProvider5948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider5966 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider5983 = new BitSet(new long[]{0x0009000000000000L,0x00000009E0000800L});
    public static final BitSet FOLLOW_51_in_ruleServiceProvider5996 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceProvider6013 = new BitSet(new long[]{0x0001000000000000L,0x00000009E0000800L});
    public static final BitSet FOLLOW_93_in_ruleServiceProvider6033 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6065 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6078 = new BitSet(new long[]{0x0001000000000000L,0x00000009C0000800L});
    public static final BitSet FOLLOW_75_in_ruleServiceProvider6093 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6125 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6138 = new BitSet(new long[]{0x0001000000000000L,0x00000009C0000000L});
    public static final BitSet FOLLOW_94_in_ruleServiceProvider6153 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6185 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6198 = new BitSet(new long[]{0x0001000000000000L,0x0000000980000000L});
    public static final BitSet FOLLOW_95_in_ruleServiceProvider6213 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6225 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleServiceProvider6246 = new BitSet(new long[]{0x0001000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6259 = new BitSet(new long[]{0x0001000000000000L,0x0000000900000000L});
    public static final BitSet FOLLOW_96_in_ruleServiceProvider6274 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6286 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleServiceProvider6298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6318 = new BitSet(new long[]{0x0001000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleServiceProvider6331 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6343 = new BitSet(new long[]{0x0009000000000000L,0x00000000000003C8L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleServiceProvider6364 = new BitSet(new long[]{0x0001000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleServiceProvider6386 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleServiceProvider6408 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleServiceProvider6430 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleServiceProvider6452 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6465 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6479 = new BitSet(new long[]{0x0001000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleServiceProvider6494 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6506 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleServiceProvider6527 = new BitSet(new long[]{0x0001000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6540 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset6590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleAsset6637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset6654 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAsset6671 = new BitSet(new long[]{0x1009000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_60_in_ruleAsset6684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAsset6701 = new BitSet(new long[]{0x0009000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_51_in_ruleAsset6721 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAsset6738 = new BitSet(new long[]{0x0001000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleAsset6758 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAsset6770 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleAsset6791 = new BitSet(new long[]{0x0001000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_48_in_ruleAsset6804 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleAsset6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability6856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCapability6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleCapability6903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCapability6920 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCapability6937 = new BitSet(new long[]{0x0008000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_51_in_ruleCapability6950 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCapability6967 = new BitSet(new long[]{0x0008000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleCapability6995 = new BitSet(new long[]{0x0009000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_48_in_ruleCapability7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement7044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleRequirement7091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement7108 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRequirement7125 = new BitSet(new long[]{0x0008000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_51_in_ruleRequirement7138 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement7155 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleRequirement7175 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRequirement7187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement7207 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleRequirement7220 = new BitSet(new long[]{0x0001000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleRequirement7234 = new BitSet(new long[]{0x0001000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleCausality_in_ruleRequirement7255 = new BitSet(new long[]{0x0001000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_48_in_ruleRequirement7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvision_in_entryRuleProvision7308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvision7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleProvision7355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision7375 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleProvision7387 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleProvision7399 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision7419 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleProvision7432 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleProvision7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine7480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleStatemachine7537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine7558 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleStatemachine7571 = new BitSet(new long[]{0x0000000000000002L,0x0000C00000000000L});
    public static final BitSet FOLLOW_110_in_ruleStatemachine7586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatemachine7607 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleStatemachine7620 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine7643 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent7680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent7732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand7795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand7847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState7910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleState7957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState7974 = new BitSet(new long[]{0x0000000000000010L,0x0001200000000000L});
    public static final BitSet FOLLOW_112_in_ruleState7992 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleState8004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState8024 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleState8037 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState8060 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleState8073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition8109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition8119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleTransition8177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8225 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleTransition8237 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleTransition8249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8269 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_44_in_ruleTransition8282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleTransition8294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8314 = new BitSet(new long[]{0x0000000000000002L});

}