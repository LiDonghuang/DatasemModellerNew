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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KSSModel'", "'GovernanceModel'", "'ProcessModels'", "'end ProcessModels'", "'GovernanceSearchStrategies'", "'end GovernanceSearchStrategies'", "'TaskPatterns'", "'end TaskPatterns'", "'ValueFunctions'", "'end ValueFunctions'", "'end GovernanceModel'", "'OrganizationalModel'", "'ServiceTypes'", "'end ServiceTypes'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'Repositories'", "'end Repositories'", "'WorkSources'", "'end WorkSources'", "'WorkItems'", "'end WorkItems'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'Replications'", "'InterArrivalTime'", "'end ExperimentSettings'", "'end KSSModel'", "'.'", "'Distribution:'", "'['", "']'", "'Repository'", "'Profiles'", "'{'", "'}'", "'end Repository'", "'WorkItem'", "'Description'", "'ProcessModel'", "'References'", "'Decompositions'", "'RequiredServices'", "'Efforts'", "'Value'", "'ClassOfService'", "'AssignmentAllowed'", "'DiscardAllowed'", "'Quantity'", "'TaskPattern'", "'Types'", "'TaskType'", "'ValueFunction'", "'Strategy'", "'WIAcceptance'", "'BackLogLimit'", "'WIPLimit'", "'WISelection'", "'WIAssignment'", "'ResourceAllocation'", "'ResourceOutsourcing'", "'WorkSource'", "'TargetUnits'", "'Profile'", "'Pattern'", "'Type'", "'Predecessors'", "'Subtasks'", "'CausalTriggers'", "'ArrivalTime'", "'DueDate'", "'=>'", "'->'", "'AtProgress'", "'OnProbability'", "'ServiceType'", "'Service'", "'Efficiency'", "'ServiceProvider'", "'Group'", "'SourceUnits'", "'SubordinateUnits'", "'Services'", "'GovernanceSearchStrategy'", "'Default'", "'Specified'", "'Resources'", "'Resource'", "'capability'", "'requirement'", "'workItems'", "'workItemNetwork'", "'('", "','", "')'", "'events'", "'end'", "'activities'", "'state'", "'actions'", "'/'"
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

                if ( (LA2_0==52) ) {
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

                if ( (LA4_0==62) ) {
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

                if ( (LA5_0==64) ) {
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

                if ( (LA6_0==65) ) {
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:800:1: ruleWorkItemProfile returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (lv_classOfService_22_0= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}' ) ;
    public final EObject ruleWorkItemProfile() throws RecognitionException {
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token lv_classOfService_22_0=null;
        Token lv_allowAssignment_23_0=null;
        Token lv_allowDiscard_24_0=null;
        Token otherlv_25=null;
        EObject lv_references_9_0 = null;

        EObject lv_decompositions_13_0 = null;

        EObject lv_efforts_18_0 = null;

        EObject lv_value_20_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:803:28: ( (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (lv_classOfService_22_0= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:804:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (lv_classOfService_22_0= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:804:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (lv_classOfService_22_0= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:804:3: otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (lv_classOfService_22_0= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}'
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:852:4: (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:852:6: otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleWorkItemProfile1801); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemProfileAccess().getProcessModelKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:856:1: ( (otherlv_6= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:857:1: (otherlv_6= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:857:1: (otherlv_6= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:858:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile1821); 

                    		newLeafNode(otherlv_6, grammarAccess.getWorkItemProfileAccess().getProcessModelProcessModelCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:869:4: (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:869:6: otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleWorkItemProfile1836); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkItemProfileAccess().getReferencesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,47,FOLLOW_47_in_ruleWorkItemProfile1848); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:877:1: ( (lv_references_9_0= ruleWorkReference ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==50) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:878:1: (lv_references_9_0= ruleWorkReference )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:878:1: (lv_references_9_0= ruleWorkReference )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:879:3: lv_references_9_0= ruleWorkReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getReferencesWorkReferenceParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkReference_in_ruleWorkItemProfile1869);
                    	    lv_references_9_0=ruleWorkReference();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"references",
                    	            		lv_references_9_0, 
                    	            		"WorkReference");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);

                    otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleWorkItemProfile1882); 

                        	newLeafNode(otherlv_10, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:899:3: (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:899:5: otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleWorkItemProfile1897); 

                        	newLeafNode(otherlv_11, grammarAccess.getWorkItemProfileAccess().getDecompositionsKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleWorkItemProfile1909); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:907:1: ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==50) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:908:1: (lv_decompositions_13_0= ruleWorkDecomposition )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:908:1: (lv_decompositions_13_0= ruleWorkDecomposition )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:909:3: lv_decompositions_13_0= ruleWorkDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getDecompositionsWorkDecompositionParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkDecomposition_in_ruleWorkItemProfile1930);
                    	    lv_decompositions_13_0=ruleWorkDecomposition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"decompositions",
                    	            		lv_decompositions_13_0, 
                    	            		"WorkDecomposition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    otherlv_14=(Token)match(input,48,FOLLOW_48_in_ruleWorkItemProfile1943); 

                        	newLeafNode(otherlv_14, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:929:3: (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:929:5: otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+
                    {
                    otherlv_15=(Token)match(input,55,FOLLOW_55_in_ruleWorkItemProfile1958); 

                        	newLeafNode(otherlv_15, grammarAccess.getWorkItemProfileAccess().getRequiredServicesKeyword_7_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:933:1: ( (otherlv_16= RULE_ID ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:934:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:934:1: (otherlv_16= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:935:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile1978); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getWorkItemProfileAccess().getRequiredServicesServiceTypeCrossReference_7_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:946:5: (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:946:7: otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) )
                    {
                    otherlv_17=(Token)match(input,56,FOLLOW_56_in_ruleWorkItemProfile1994); 

                        	newLeafNode(otherlv_17, grammarAccess.getWorkItemProfileAccess().getEffortsKeyword_8_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:950:1: ( (lv_efforts_18_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:951:1: (lv_efforts_18_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:951:1: (lv_efforts_18_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:952:3: lv_efforts_18_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getEffortsNumExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItemProfile2015);
                    lv_efforts_18_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		set(
                           			current, 
                           			"efforts",
                            		lv_efforts_18_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:968:4: (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==57) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:968:6: otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) )
                    {
                    otherlv_19=(Token)match(input,57,FOLLOW_57_in_ruleWorkItemProfile2030); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemProfileAccess().getValueKeyword_9_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:972:1: ( (lv_value_20_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:973:1: (lv_value_20_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:973:1: (lv_value_20_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:974:3: lv_value_20_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getValueNumExpressionParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItemProfile2051);
                    lv_value_20_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_20_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:990:4: (otherlv_21= 'ClassOfService' ( (lv_classOfService_22_0= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:990:6: otherlv_21= 'ClassOfService' ( (lv_classOfService_22_0= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,58,FOLLOW_58_in_ruleWorkItemProfile2066); 

                        	newLeafNode(otherlv_21, grammarAccess.getWorkItemProfileAccess().getClassOfServiceKeyword_10_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:994:1: ( (lv_classOfService_22_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:995:1: (lv_classOfService_22_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:995:1: (lv_classOfService_22_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:996:3: lv_classOfService_22_0= RULE_ID
                    {
                    lv_classOfService_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile2083); 

                    			newLeafNode(lv_classOfService_22_0, grammarAccess.getWorkItemProfileAccess().getClassOfServiceIDTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"classOfService",
                            		lv_classOfService_22_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1012:4: ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==59) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1013:1: (lv_allowAssignment_23_0= 'AssignmentAllowed' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1013:1: (lv_allowAssignment_23_0= 'AssignmentAllowed' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1014:3: lv_allowAssignment_23_0= 'AssignmentAllowed'
                    {
                    lv_allowAssignment_23_0=(Token)match(input,59,FOLLOW_59_in_ruleWorkItemProfile2108); 

                            newLeafNode(lv_allowAssignment_23_0, grammarAccess.getWorkItemProfileAccess().getAllowAssignmentAssignmentAllowedKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		setWithLastConsumed(current, "allowAssignment", true, "AssignmentAllowed");
                    	    

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1027:3: ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==60) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1028:1: (lv_allowDiscard_24_0= 'DiscardAllowed' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1028:1: (lv_allowDiscard_24_0= 'DiscardAllowed' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1029:3: lv_allowDiscard_24_0= 'DiscardAllowed'
                    {
                    lv_allowDiscard_24_0=(Token)match(input,60,FOLLOW_60_in_ruleWorkItemProfile2140); 

                            newLeafNode(lv_allowDiscard_24_0, grammarAccess.getWorkItemProfileAccess().getAllowDiscardDiscardAllowedKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		setWithLastConsumed(current, "allowDiscard", true, "DiscardAllowed");
                    	    

                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,48,FOLLOW_48_in_ruleWorkItemProfile2166); 

                	newLeafNode(otherlv_25, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1054:1: entryRuleWorkReference returns [EObject current=null] : iv_ruleWorkReference= ruleWorkReference EOF ;
    public final EObject entryRuleWorkReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkReference = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1055:2: (iv_ruleWorkReference= ruleWorkReference EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1056:2: iv_ruleWorkReference= ruleWorkReference EOF
            {
             newCompositeNode(grammarAccess.getWorkReferenceRule()); 
            pushFollow(FOLLOW_ruleWorkReference_in_entryRuleWorkReference2202);
            iv_ruleWorkReference=ruleWorkReference();

            state._fsp--;

             current =iv_ruleWorkReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkReference2212); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1063:1: ruleWorkReference returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleWorkReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_quantity_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1066:28: ( (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1067:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1067:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1067:3: otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleWorkReference2249); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkReferenceAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1071:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1073:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkReference2269); 

            		newLeafNode(otherlv_1, grammarAccess.getWorkReferenceAccess().getWorkItemWorkItemProfileCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleWorkReference2281); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkReferenceAccess().getQuantityKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1088:1: ( (lv_quantity_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1089:1: (lv_quantity_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1089:1: (lv_quantity_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1090:3: lv_quantity_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getWorkReferenceAccess().getQuantityNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkReference2302);
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1114:1: entryRuleWorkDecomposition returns [EObject current=null] : iv_ruleWorkDecomposition= ruleWorkDecomposition EOF ;
    public final EObject entryRuleWorkDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDecomposition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1115:2: (iv_ruleWorkDecomposition= ruleWorkDecomposition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1116:2: iv_ruleWorkDecomposition= ruleWorkDecomposition EOF
            {
             newCompositeNode(grammarAccess.getWorkDecompositionRule()); 
            pushFollow(FOLLOW_ruleWorkDecomposition_in_entryRuleWorkDecomposition2338);
            iv_ruleWorkDecomposition=ruleWorkDecomposition();

            state._fsp--;

             current =iv_ruleWorkDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkDecomposition2348); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1123:1: ruleWorkDecomposition returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleWorkDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_quantity_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1126:28: ( (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1127:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1127:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1127:3: otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleWorkDecomposition2385); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkDecompositionAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1131:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1132:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1132:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1133:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkDecompositionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkDecomposition2405); 

            		newLeafNode(otherlv_1, grammarAccess.getWorkDecompositionAccess().getWorkItemWorkItemProfileCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleWorkDecomposition2417); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkDecompositionAccess().getQuantityKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1148:1: ( (lv_quantity_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1149:1: (lv_quantity_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1149:1: (lv_quantity_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1150:3: lv_quantity_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getWorkDecompositionAccess().getQuantityNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkDecomposition2438);
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1178:1: entryRuleTaskPattern returns [EObject current=null] : iv_ruleTaskPattern= ruleTaskPattern EOF ;
    public final EObject entryRuleTaskPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskPattern = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1179:2: (iv_ruleTaskPattern= ruleTaskPattern EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1180:2: iv_ruleTaskPattern= ruleTaskPattern EOF
            {
             newCompositeNode(grammarAccess.getTaskPatternRule()); 
            pushFollow(FOLLOW_ruleTaskPattern_in_entryRuleTaskPattern2478);
            iv_ruleTaskPattern=ruleTaskPattern();

            state._fsp--;

             current =iv_ruleTaskPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskPattern2488); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1187:1: ruleTaskPattern returns [EObject current=null] : (otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1190:28: ( (otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1191:1: (otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1191:1: (otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1191:3: otherlv_0= 'TaskPattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleTaskPattern2525); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskPatternAccess().getTaskPatternKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1195:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1196:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1196:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1197:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskPattern2542); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleTaskPattern2559); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskPatternAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1217:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1217:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleTaskPattern2572); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskPatternAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1221:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1222:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1222:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1223:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskPattern2589); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1239:4: (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==63) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1239:6: otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_63_in_ruleTaskPattern2609); 

                        	newLeafNode(otherlv_5, grammarAccess.getTaskPatternAccess().getTypesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleTaskPattern2621); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskPatternAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1247:1: ( (otherlv_7= RULE_ID ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1248:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1248:1: (otherlv_7= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1249:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskPatternRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskPattern2641); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getTaskPatternAccess().getTaskTypesTaskTypeCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleTaskPattern2654); 

                        	newLeafNode(otherlv_8, grammarAccess.getTaskPatternAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleTaskPattern2668); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1276:1: entryRuleTaskType returns [EObject current=null] : iv_ruleTaskType= ruleTaskType EOF ;
    public final EObject entryRuleTaskType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1277:2: (iv_ruleTaskType= ruleTaskType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1278:2: iv_ruleTaskType= ruleTaskType EOF
            {
             newCompositeNode(grammarAccess.getTaskTypeRule()); 
            pushFollow(FOLLOW_ruleTaskType_in_entryRuleTaskType2704);
            iv_ruleTaskType=ruleTaskType();

            state._fsp--;

             current =iv_ruleTaskType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskType2714); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1285:1: ruleTaskType returns [EObject current=null] : (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1288:28: ( (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1289:1: (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1289:1: (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1289:3: otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleTaskType2751); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskTypeAccess().getTaskTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1293:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1294:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1294:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1295:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskType2768); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleTaskType2785); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1315:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1315:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleTaskType2798); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1319:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1320:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1320:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1321:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskType2815); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleTaskType2834); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1349:1: entryRuleValueFunction returns [EObject current=null] : iv_ruleValueFunction= ruleValueFunction EOF ;
    public final EObject entryRuleValueFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueFunction = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1350:2: (iv_ruleValueFunction= ruleValueFunction EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1351:2: iv_ruleValueFunction= ruleValueFunction EOF
            {
             newCompositeNode(grammarAccess.getValueFunctionRule()); 
            pushFollow(FOLLOW_ruleValueFunction_in_entryRuleValueFunction2870);
            iv_ruleValueFunction=ruleValueFunction();

            state._fsp--;

             current =iv_ruleValueFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueFunction2880); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1358:1: ruleValueFunction returns [EObject current=null] : (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1361:28: ( (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1362:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1362:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1362:3: otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleValueFunction2917); 

                	newLeafNode(otherlv_0, grammarAccess.getValueFunctionAccess().getValueFunctionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1366:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1367:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1367:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1368:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueFunction2934); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleValueFunction2951); 

                	newLeafNode(otherlv_2, grammarAccess.getValueFunctionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1388:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1388:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleValueFunction2964); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueFunctionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1392:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1393:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1393:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1394:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueFunction2981); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleValueFunction3000); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1422:1: entryRuleProcessModel returns [EObject current=null] : iv_ruleProcessModel= ruleProcessModel EOF ;
    public final EObject entryRuleProcessModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessModel = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1423:2: (iv_ruleProcessModel= ruleProcessModel EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1424:2: iv_ruleProcessModel= ruleProcessModel EOF
            {
             newCompositeNode(grammarAccess.getProcessModelRule()); 
            pushFollow(FOLLOW_ruleProcessModel_in_entryRuleProcessModel3036);
            iv_ruleProcessModel=ruleProcessModel();

            state._fsp--;

             current =iv_ruleProcessModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessModel3046); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1431:1: ruleProcessModel returns [EObject current=null] : (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1434:28: ( (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1435:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1435:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1435:3: otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleProcessModel3083); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessModelAccess().getProcessModelKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1439:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1440:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1440:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1441:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessModel3100); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleProcessModel3117); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1461:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1461:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleProcessModel3130); 

                        	newLeafNode(otherlv_3, grammarAccess.getProcessModelAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1465:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1466:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1466:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1467:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessModel3147); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleProcessModel3166); 

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


    // $ANTLR start "entryRuleStrategy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1497:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1498:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1499:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_ruleStrategy_in_entryRuleStrategy3204);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategy3214); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1506:1: ruleStrategy returns [EObject current=null] : (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1509:28: ( (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1510:1: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1510:1: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1510:3: otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleStrategy3251); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getStrategyKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1514:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1515:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1515:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1516:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategy3268); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleStrategy3285); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1536:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1536:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleStrategy3298); 

                        	newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1540:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1541:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1541:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1542:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStrategy3315); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1558:4: ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1559:1: (lv_WIAcceptanceRule_5_0= ruleWIAcceptance )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1559:1: (lv_WIAcceptanceRule_5_0= ruleWIAcceptance )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1560:3: lv_WIAcceptanceRule_5_0= ruleWIAcceptance
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getWIAcceptanceRuleWIAcceptanceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleWIAcceptance_in_ruleStrategy3343);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1576:2: ( (lv_WISelectionRule_6_0= ruleWISelection ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1577:1: (lv_WISelectionRule_6_0= ruleWISelection )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1577:1: (lv_WISelectionRule_6_0= ruleWISelection )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1578:3: lv_WISelectionRule_6_0= ruleWISelection
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getWISelectionRuleWISelectionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleWISelection_in_ruleStrategy3364);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1594:2: ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1595:1: (lv_WIAssignmentRule_7_0= ruleWIAssignment )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1595:1: (lv_WIAssignmentRule_7_0= ruleWIAssignment )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1596:3: lv_WIAssignmentRule_7_0= ruleWIAssignment
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getWIAssignmentRuleWIAssignmentParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleWIAssignment_in_ruleStrategy3385);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1612:2: ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1613:1: (lv_ResourceAllocationRule_8_0= ruleResourceAllocation )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1613:1: (lv_ResourceAllocationRule_8_0= ruleResourceAllocation )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1614:3: lv_ResourceAllocationRule_8_0= ruleResourceAllocation
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getResourceAllocationRuleResourceAllocationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceAllocation_in_ruleStrategy3406);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1630:2: ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1631:1: (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1631:1: (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1632:3: lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing
            {
             
            	        newCompositeNode(grammarAccess.getStrategyAccess().getResourceOutsourcingRuleResourceOutsourcingParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleStrategy3427);
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

            otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleStrategy3439); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1660:1: entryRuleWIAcceptance returns [EObject current=null] : iv_ruleWIAcceptance= ruleWIAcceptance EOF ;
    public final EObject entryRuleWIAcceptance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAcceptance = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1661:2: (iv_ruleWIAcceptance= ruleWIAcceptance EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1662:2: iv_ruleWIAcceptance= ruleWIAcceptance EOF
            {
             newCompositeNode(grammarAccess.getWIAcceptanceRule()); 
            pushFollow(FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance3475);
            iv_ruleWIAcceptance=ruleWIAcceptance();

            state._fsp--;

             current =iv_ruleWIAcceptance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptance3485); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1669:1: ruleWIAcceptance returns [EObject current=null] : (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1672:28: ( (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1673:1: (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1673:1: (otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1673:3: otherlv_0= 'WIAcceptance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleWIAcceptance3522); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceAccess().getWIAcceptanceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1677:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1678:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1678:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1679:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptance3539); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWIAcceptance3556); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1699:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1699:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleWIAcceptance3569); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1703:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1704:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1704:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1705:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptance3586); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1721:4: (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==68) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1721:6: otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleWIAcceptance3606); 

                        	newLeafNode(otherlv_5, grammarAccess.getWIAcceptanceAccess().getBackLogLimitKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1725:1: ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1726:1: (lv_backlogQLimit_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1726:1: (lv_backlogQLimit_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1727:3: lv_backlogQLimit_6_0= RULE_INT
                    {
                    lv_backlogQLimit_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance3623); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1743:4: (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==69) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1743:6: otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,69,FOLLOW_69_in_ruleWIAcceptance3643); 

                        	newLeafNode(otherlv_7, grammarAccess.getWIAcceptanceAccess().getWIPLimitKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1747:1: ( (lv_readyQLimit_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1748:1: (lv_readyQLimit_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1748:1: (lv_readyQLimit_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1749:3: lv_readyQLimit_8_0= RULE_INT
                    {
                    lv_readyQLimit_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance3660); 

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

            otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleWIAcceptance3679); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1777:1: entryRuleWISelection returns [EObject current=null] : iv_ruleWISelection= ruleWISelection EOF ;
    public final EObject entryRuleWISelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWISelection = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1778:2: (iv_ruleWISelection= ruleWISelection EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1779:2: iv_ruleWISelection= ruleWISelection EOF
            {
             newCompositeNode(grammarAccess.getWISelectionRule()); 
            pushFollow(FOLLOW_ruleWISelection_in_entryRuleWISelection3715);
            iv_ruleWISelection=ruleWISelection();

            state._fsp--;

             current =iv_ruleWISelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelection3725); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1786:1: ruleWISelection returns [EObject current=null] : (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1789:28: ( (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1790:1: (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1790:1: (otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1790:3: otherlv_0= 'WISelection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleWISelection3762); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionAccess().getWISelectionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1794:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1795:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1795:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1796:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelection3779); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWISelection3796); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1816:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1816:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleWISelection3809); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1820:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1821:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1821:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1822:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelection3826); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleWISelection3845); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1850:1: entryRuleWIAssignment returns [EObject current=null] : iv_ruleWIAssignment= ruleWIAssignment EOF ;
    public final EObject entryRuleWIAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAssignment = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1851:2: (iv_ruleWIAssignment= ruleWIAssignment EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1852:2: iv_ruleWIAssignment= ruleWIAssignment EOF
            {
             newCompositeNode(grammarAccess.getWIAssignmentRule()); 
            pushFollow(FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment3881);
            iv_ruleWIAssignment=ruleWIAssignment();

            state._fsp--;

             current =iv_ruleWIAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignment3891); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1859:1: ruleWIAssignment returns [EObject current=null] : (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1862:28: ( (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1863:1: (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1863:1: (otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1863:3: otherlv_0= 'WIAssignment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleWIAssignment3928); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentAccess().getWIAssignmentKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1867:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1868:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1868:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1869:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignment3945); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWIAssignment3962); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1889:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1889:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleWIAssignment3975); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1893:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1894:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1894:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1895:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignment3992); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleWIAssignment4011); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1923:1: entryRuleResourceAllocation returns [EObject current=null] : iv_ruleResourceAllocation= ruleResourceAllocation EOF ;
    public final EObject entryRuleResourceAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAllocation = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1924:2: (iv_ruleResourceAllocation= ruleResourceAllocation EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1925:2: iv_ruleResourceAllocation= ruleResourceAllocation EOF
            {
             newCompositeNode(grammarAccess.getResourceAllocationRule()); 
            pushFollow(FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation4047);
            iv_ruleResourceAllocation=ruleResourceAllocation();

            state._fsp--;

             current =iv_ruleResourceAllocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocation4057); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1932:1: ruleResourceAllocation returns [EObject current=null] : (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1935:28: ( (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1936:1: (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1936:1: (otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1936:3: otherlv_0= 'ResourceAllocation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleResourceAllocation4094); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationAccess().getResourceAllocationKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1940:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1941:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1941:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1942:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocation4111); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleResourceAllocation4128); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1962:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1962:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleResourceAllocation4141); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1966:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1967:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1967:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1968:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocation4158); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleResourceAllocation4177); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1996:1: entryRuleResourceOutsourcing returns [EObject current=null] : iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF ;
    public final EObject entryRuleResourceOutsourcing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOutsourcing = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1997:2: (iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1998:2: iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF
            {
             newCompositeNode(grammarAccess.getResourceOutsourcingRule()); 
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing4213);
            iv_ruleResourceOutsourcing=ruleResourceOutsourcing();

            state._fsp--;

             current =iv_ruleResourceOutsourcing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcing4223); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2005:1: ruleResourceOutsourcing returns [EObject current=null] : (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2008:28: ( (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2009:1: (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2009:1: (otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2009:3: otherlv_0= 'ResourceOutsourcing' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleResourceOutsourcing4260); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingAccess().getResourceOutsourcingKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2013:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2014:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2014:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2015:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcing4277); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleResourceOutsourcing4294); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2035:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2035:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleResourceOutsourcing4307); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2039:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2040:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2040:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2041:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcing4324); 

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

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleResourceOutsourcing4343); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2069:1: entryRuleWorkSource returns [EObject current=null] : iv_ruleWorkSource= ruleWorkSource EOF ;
    public final EObject entryRuleWorkSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSource = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2070:2: (iv_ruleWorkSource= ruleWorkSource EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2071:2: iv_ruleWorkSource= ruleWorkSource EOF
            {
             newCompositeNode(grammarAccess.getWorkSourceRule()); 
            pushFollow(FOLLOW_ruleWorkSource_in_entryRuleWorkSource4379);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSource4389); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2078:1: ruleWorkSource returns [EObject current=null] : (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2081:28: ( (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2082:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2082:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2082:3: otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleWorkSource4426); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2086:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2087:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2087:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2088:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4443); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWorkSource4460); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2108:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2108:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleWorkSource4473); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2112:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2113:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2113:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2114:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkSource4490); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2130:4: (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==75) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2130:6: otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleWorkSource4510); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkSourceAccess().getTargetUnitsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleWorkSource4522); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2138:1: ( (otherlv_7= RULE_ID ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2139:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2139:1: (otherlv_7= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2140:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4542); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getTargetUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleWorkSource4555); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2155:3: ( (lv_assignmentRule_9_0= ruleWIAssignment ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==71) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2156:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2156:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2157:3: lv_assignmentRule_9_0= ruleWIAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkSourceAccess().getAssignmentRuleWIAssignmentParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleWorkSource4578);
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

            otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleWorkSource4591); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2185:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2186:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2187:2: iv_ruleWorkItem= ruleWorkItem EOF
            {
             newCompositeNode(grammarAccess.getWorkItemRule()); 
            pushFollow(FOLLOW_ruleWorkItem_in_entryRuleWorkItem4627);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItem4637); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2194:1: ruleWorkItem returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2197:28: ( (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2198:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2198:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2198:3: otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )? (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )? (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )? (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )? (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )? (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )? (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )? (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )? (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )? otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleWorkItem4674); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2202:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2203:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2203:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2204:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4691); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWorkItem4708); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2224:1: (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==76) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2224:3: otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_76_in_ruleWorkItem4721); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getProfileKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2228:1: ( (otherlv_4= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2229:1: (otherlv_4= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2229:1: (otherlv_4= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2230:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4741); 

                    		newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getProfileWorkItemProfileCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2241:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2241:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleWorkItem4756); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2245:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2246:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2246:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2247:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItem4773); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2263:4: (otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==77) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2263:6: otherlv_7= 'Pattern' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,77,FOLLOW_77_in_ruleWorkItem4793); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkItemAccess().getPatternKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2267:1: ( (otherlv_8= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2268:1: (otherlv_8= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2268:1: (otherlv_8= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2269:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4813); 

                    		newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getPatternTaskPatternCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2280:4: (otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==78) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2280:6: otherlv_9= 'Type' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem4828); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getTypeKeyword_6_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2284:1: ( (otherlv_10= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2285:1: (otherlv_10= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2285:1: (otherlv_10= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2286:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4848); 

                    		newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getPatternTypeTaskTypeCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2297:4: (otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==79) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2297:6: otherlv_11= 'Predecessors' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,79,FOLLOW_79_in_ruleWorkItem4863); 

                        	newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getPredecessorsKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleWorkItem4875); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2305:1: ( (otherlv_13= RULE_ID ) )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==RULE_ID) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2306:1: (otherlv_13= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2306:1: (otherlv_13= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2307:3: otherlv_13= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4895); 

                    	    		newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_7_2_0()); 
                    	    	

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

                    otherlv_14=(Token)match(input,48,FOLLOW_48_in_ruleWorkItem4908); 

                        	newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2322:3: (otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==80) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2322:5: otherlv_15= 'Subtasks' otherlv_16= '{' ( (otherlv_17= RULE_ID ) )+ otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,80,FOLLOW_80_in_ruleWorkItem4923); 

                        	newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getSubtasksKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,47,FOLLOW_47_in_ruleWorkItem4935); 

                        	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2330:1: ( (otherlv_17= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2331:1: (otherlv_17= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2331:1: (otherlv_17= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2332:3: otherlv_17= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem4955); 

                    	    		newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_8_2_0()); 
                    	    	

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

                    otherlv_18=(Token)match(input,48,FOLLOW_48_in_ruleWorkItem4968); 

                        	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2347:3: (otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==81) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2347:5: otherlv_19= 'CausalTriggers' ( (lv_causalTriggers_20_0= ruleCausality ) )*
                    {
                    otherlv_19=(Token)match(input,81,FOLLOW_81_in_ruleWorkItem4983); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getCausalTriggersKeyword_9_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2351:1: ( (lv_causalTriggers_20_0= ruleCausality ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=84 && LA58_0<=85)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2352:1: (lv_causalTriggers_20_0= ruleCausality )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2352:1: (lv_causalTriggers_20_0= ruleCausality )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2353:3: lv_causalTriggers_20_0= ruleCausality
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getCausalTriggersCausalityParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausality_in_ruleWorkItem5004);
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
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2369:5: (otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+ )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==55) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2369:7: otherlv_21= 'RequiredServices' ( (otherlv_22= RULE_ID ) )+
                    {
                    otherlv_21=(Token)match(input,55,FOLLOW_55_in_ruleWorkItem5020); 

                        	newLeafNode(otherlv_21, grammarAccess.getWorkItemAccess().getRequiredServicesKeyword_10_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2373:1: ( (otherlv_22= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2374:1: (otherlv_22= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2374:1: (otherlv_22= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2375:3: otherlv_22= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5040); 

                    	    		newLeafNode(otherlv_22, grammarAccess.getWorkItemAccess().getRequiredServicesServiceTypeCrossReference_10_1_0()); 
                    	    	

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


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2386:5: (otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==56) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2386:7: otherlv_23= 'Efforts' ( (lv_efforts_24_0= ruleDouble ) )
                    {
                    otherlv_23=(Token)match(input,56,FOLLOW_56_in_ruleWorkItem5056); 

                        	newLeafNode(otherlv_23, grammarAccess.getWorkItemAccess().getEffortsKeyword_11_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2390:1: ( (lv_efforts_24_0= ruleDouble ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2391:1: (lv_efforts_24_0= ruleDouble )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2391:1: (lv_efforts_24_0= ruleDouble )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2392:3: lv_efforts_24_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getEffortsDoubleParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleWorkItem5077);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2408:4: (otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==57) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2408:6: otherlv_25= 'Value' ( (lv_value_26_0= ruleDouble ) )
                    {
                    otherlv_25=(Token)match(input,57,FOLLOW_57_in_ruleWorkItem5092); 

                        	newLeafNode(otherlv_25, grammarAccess.getWorkItemAccess().getValueKeyword_12_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2412:1: ( (lv_value_26_0= ruleDouble ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2413:1: (lv_value_26_0= ruleDouble )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2413:1: (lv_value_26_0= ruleDouble )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2414:3: lv_value_26_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getValueDoubleParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleWorkItem5113);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2430:4: (otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2430:6: otherlv_27= 'ClassOfService' ( (lv_classOfService_28_0= RULE_ID ) )
                    {
                    otherlv_27=(Token)match(input,58,FOLLOW_58_in_ruleWorkItem5128); 

                        	newLeafNode(otherlv_27, grammarAccess.getWorkItemAccess().getClassOfServiceKeyword_13_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2434:1: ( (lv_classOfService_28_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2435:1: (lv_classOfService_28_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2435:1: (lv_classOfService_28_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2436:3: lv_classOfService_28_0= RULE_ID
                    {
                    lv_classOfService_28_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5145); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2452:4: (otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==74) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2452:6: otherlv_29= 'WorkSource' ( (otherlv_30= RULE_ID ) )
                    {
                    otherlv_29=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5165); 

                        	newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getWorkSourceKeyword_14_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2456:1: ( (otherlv_30= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2457:1: (otherlv_30= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2457:1: (otherlv_30= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2458:3: otherlv_30= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5185); 

                    		newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getWorkSourceWorkSourceCrossReference_14_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2469:4: (otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==82) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2469:6: otherlv_31= 'ArrivalTime' ( (lv_arrivalTime_32_0= RULE_INT ) )
                    {
                    otherlv_31=(Token)match(input,82,FOLLOW_82_in_ruleWorkItem5200); 

                        	newLeafNode(otherlv_31, grammarAccess.getWorkItemAccess().getArrivalTimeKeyword_15_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2473:1: ( (lv_arrivalTime_32_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2474:1: (lv_arrivalTime_32_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2474:1: (lv_arrivalTime_32_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2475:3: lv_arrivalTime_32_0= RULE_INT
                    {
                    lv_arrivalTime_32_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem5217); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2491:4: (otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==83) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2491:6: otherlv_33= 'DueDate' ( (lv_dueDate_34_0= RULE_INT ) )
                    {
                    otherlv_33=(Token)match(input,83,FOLLOW_83_in_ruleWorkItem5237); 

                        	newLeafNode(otherlv_33, grammarAccess.getWorkItemAccess().getDueDateKeyword_16_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2495:1: ( (lv_dueDate_34_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2496:1: (lv_dueDate_34_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2496:1: (lv_dueDate_34_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2497:3: lv_dueDate_34_0= RULE_INT
                    {
                    lv_dueDate_34_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem5254); 

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

            otherlv_35=(Token)match(input,48,FOLLOW_48_in_ruleWorkItem5273); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2525:1: entryRuleCausality returns [EObject current=null] : iv_ruleCausality= ruleCausality EOF ;
    public final EObject entryRuleCausality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCausality = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2526:2: (iv_ruleCausality= ruleCausality EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2527:2: iv_ruleCausality= ruleCausality EOF
            {
             newCompositeNode(grammarAccess.getCausalityRule()); 
            pushFollow(FOLLOW_ruleCausality_in_entryRuleCausality5309);
            iv_ruleCausality=ruleCausality();

            state._fsp--;

             current =iv_ruleCausality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCausality5319); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2534:1: ruleCausality returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2537:28: ( ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2538:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2538:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2538:2: (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2538:2: (otherlv_0= '=>' | otherlv_1= '->' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==84) ) {
                alt68=1;
            }
            else if ( (LA68_0==85) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2538:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleCausality5357); 

                        	newLeafNode(otherlv_0, grammarAccess.getCausalityAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2543:7: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleCausality5375); 

                        	newLeafNode(otherlv_1, grammarAccess.getCausalityAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleCausality5388); 

                	newLeafNode(otherlv_2, grammarAccess.getCausalityAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2551:1: ( (otherlv_3= RULE_ID ) )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2552:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2552:1: (otherlv_3= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2553:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCausalityRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCausality5408); 

            	    		newLeafNode(otherlv_3, grammarAccess.getCausalityAccess().getTriggeredWorkItemCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleCausality5421); 

                	newLeafNode(otherlv_4, grammarAccess.getCausalityAccess().getRightCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2568:1: (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==86) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2568:3: otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,86,FOLLOW_86_in_ruleCausality5434); 

                        	newLeafNode(otherlv_5, grammarAccess.getCausalityAccess().getAtProgressKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2572:1: ( (lv_atProgress_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2573:1: (lv_atProgress_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2573:1: (lv_atProgress_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2574:3: lv_atProgress_6_0= RULE_INT
                    {
                    lv_atProgress_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausality5451); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2590:4: (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==87) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2590:6: otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,87,FOLLOW_87_in_ruleCausality5471); 

                        	newLeafNode(otherlv_7, grammarAccess.getCausalityAccess().getOnProbabilityKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2594:1: ( (lv_onProbability_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2595:1: (lv_onProbability_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2595:1: (lv_onProbability_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2596:3: lv_onProbability_8_0= RULE_INT
                    {
                    lv_onProbability_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausality5488); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2622:1: entryRuleServiceType returns [EObject current=null] : iv_ruleServiceType= ruleServiceType EOF ;
    public final EObject entryRuleServiceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2623:2: (iv_ruleServiceType= ruleServiceType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2624:2: iv_ruleServiceType= ruleServiceType EOF
            {
             newCompositeNode(grammarAccess.getServiceTypeRule()); 
            pushFollow(FOLLOW_ruleServiceType_in_entryRuleServiceType5533);
            iv_ruleServiceType=ruleServiceType();

            state._fsp--;

             current =iv_ruleServiceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceType5543); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2631:1: ruleServiceType returns [EObject current=null] : (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2634:28: ( (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2635:1: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2635:1: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2635:3: otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleServiceType5580); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceTypeAccess().getServiceTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2639:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2640:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2640:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2641:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceType5597); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2657:2: (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==47) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2657:4: otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleServiceType5615); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceTypeAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2661:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==51) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2661:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleServiceType5628); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceTypeAccess().getDescriptionKeyword_2_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2665:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2666:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2666:1: (lv_description_4_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2667:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceType5645); 

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

                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleServiceType5664); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2695:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2696:2: (iv_ruleService= ruleService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2697:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService5702);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService5712); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2704:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2707:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2708:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2708:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2708:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleService5749); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2712:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2713:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2713:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2714:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService5766); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2730:2: (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==47) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2730:4: otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) ) (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )? otherlv_9= '}'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleService5784); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2734:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==51) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2734:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleService5797); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDescriptionKeyword_2_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2738:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2739:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2739:1: (lv_description_4_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2740:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService5814); 

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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2756:4: (otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2756:6: otherlv_5= 'Type' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleService5834); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getTypeKeyword_2_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2760:1: ( (otherlv_6= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2761:1: (otherlv_6= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2761:1: (otherlv_6= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2762:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService5854); 

                    		newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getTypeServiceTypeCrossReference_2_2_1_0()); 
                    	

                    }


                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2773:3: (otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==90) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2773:5: otherlv_7= 'Efficiency' ( (lv_efficiency_8_0= ruleNumExpression ) )
                            {
                            otherlv_7=(Token)match(input,90,FOLLOW_90_in_ruleService5868); 

                                	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getEfficiencyKeyword_2_3_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2777:1: ( (lv_efficiency_8_0= ruleNumExpression ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2778:1: (lv_efficiency_8_0= ruleNumExpression )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2778:1: (lv_efficiency_8_0= ruleNumExpression )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2779:3: lv_efficiency_8_0= ruleNumExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getServiceAccess().getEfficiencyNumExpressionParserRuleCall_2_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNumExpression_in_ruleService5889);
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

                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleService5903); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2807:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2808:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2809:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider5941);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProvider5951); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2816:1: ruleServiceProvider returns [EObject current=null] : ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2819:28: ( ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2820:1: ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2820:1: ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2820:2: (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )? (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2820:2: (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==91) ) {
                alt77=1;
            }
            else if ( (LA77_0==92) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2820:4: otherlv_0= 'ServiceProvider'
                    {
                    otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleServiceProvider5989); 

                        	newLeafNode(otherlv_0, grammarAccess.getServiceProviderAccess().getServiceProviderKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2825:7: otherlv_1= 'Group'
                    {
                    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleServiceProvider6007); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getGroupKeyword_0_1());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2829:2: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2830:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2830:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2831:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6025); 

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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6042); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2851:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==51) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2851:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleServiceProvider6055); 

                        	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2855:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2856:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2856:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2857:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceProvider6072); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2873:4: (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==93) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2873:6: otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,93,FOLLOW_93_in_ruleServiceProvider6092); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getSourceUnitsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6104); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2881:1: ( (otherlv_8= RULE_ID ) )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==RULE_ID) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2882:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2882:1: (otherlv_8= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2883:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6124); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getSourceUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6137); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2898:3: (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==75) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2898:5: otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,75,FOLLOW_75_in_ruleServiceProvider6152); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getTargetUnitsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6164); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2906:1: ( (otherlv_12= RULE_ID ) )+
                    int cnt81=0;
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==RULE_ID) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2907:1: (otherlv_12= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2907:1: (otherlv_12= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2908:3: otherlv_12= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6184); 

                    	    		newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getTargetUnitsServiceProviderCrossReference_5_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt81 >= 1 ) break loop81;
                                EarlyExitException eee =
                                    new EarlyExitException(81, input);
                                throw eee;
                        }
                        cnt81++;
                    } while (true);

                    otherlv_13=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6197); 

                        	newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2923:3: (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==94) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2923:5: otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,94,FOLLOW_94_in_ruleServiceProvider6212); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getSubordinateUnitsKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6224); 

                        	newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2931:1: ( (otherlv_16= RULE_ID ) )+
                    int cnt83=0;
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==RULE_ID) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2932:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2932:1: (otherlv_16= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2933:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6244); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getSubordinateUnitsServiceProviderCrossReference_6_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt83 >= 1 ) break loop83;
                                EarlyExitException eee =
                                    new EarlyExitException(83, input);
                                throw eee;
                        }
                        cnt83++;
                    } while (true);

                    otherlv_17=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6257); 

                        	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2948:3: (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==95) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2948:5: otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,95,FOLLOW_95_in_ruleServiceProvider6272); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getServicesKeyword_7_0());
                        
                    otherlv_19=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6284); 

                        	newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2956:1: ( (lv_services_20_0= ruleService ) )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==89) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2957:1: (lv_services_20_0= ruleService )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2957:1: (lv_services_20_0= ruleService )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2958:3: lv_services_20_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getServicesServiceParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleServiceProvider6305);
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
                    	    if ( cnt85 >= 1 ) break loop85;
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);

                    otherlv_21=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6318); 

                        	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2978:3: (otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==96) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2978:5: otherlv_22= 'GovernanceSearchStrategy' otherlv_23= '{' otherlv_24= 'Default' ( (otherlv_25= RULE_ID ) ) (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )? otherlv_34= '}'
                    {
                    otherlv_22=(Token)match(input,96,FOLLOW_96_in_ruleServiceProvider6333); 

                        	newLeafNode(otherlv_22, grammarAccess.getServiceProviderAccess().getGovernanceSearchStrategyKeyword_8_0());
                        
                    otherlv_23=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6345); 

                        	newLeafNode(otherlv_23, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    otherlv_24=(Token)match(input,97,FOLLOW_97_in_ruleServiceProvider6357); 

                        	newLeafNode(otherlv_24, grammarAccess.getServiceProviderAccess().getDefaultKeyword_8_2());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2990:1: ( (otherlv_25= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2991:1: (otherlv_25= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2991:1: (otherlv_25= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2992:3: otherlv_25= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider6377); 

                    		newLeafNode(otherlv_25, grammarAccess.getServiceProviderAccess().getDefaultStrategyStrategyCrossReference_8_3_0()); 
                    	

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3003:2: (otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}' )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==98) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3003:4: otherlv_26= 'Specified' otherlv_27= '{' ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )? ( (lv_selectionRule_29_0= ruleWISelection ) )? ( (lv_assignmentRule_30_0= ruleWIAssignment ) )? ( (lv_allocationRule_31_0= ruleResourceAllocation ) )? ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )? otherlv_33= '}'
                            {
                            otherlv_26=(Token)match(input,98,FOLLOW_98_in_ruleServiceProvider6390); 

                                	newLeafNode(otherlv_26, grammarAccess.getServiceProviderAccess().getSpecifiedKeyword_8_4_0());
                                
                            otherlv_27=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6402); 

                                	newLeafNode(otherlv_27, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_8_4_1());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3011:1: ( (lv_acceptanceRule_28_0= ruleWIAcceptance ) )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==67) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3012:1: (lv_acceptanceRule_28_0= ruleWIAcceptance )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3012:1: (lv_acceptanceRule_28_0= ruleWIAcceptance )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3013:3: lv_acceptanceRule_28_0= ruleWIAcceptance
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAcceptanceRuleWIAcceptanceParserRuleCall_8_4_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWIAcceptance_in_ruleServiceProvider6423);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3029:3: ( (lv_selectionRule_29_0= ruleWISelection ) )?
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==70) ) {
                                alt88=1;
                            }
                            switch (alt88) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3030:1: (lv_selectionRule_29_0= ruleWISelection )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3030:1: (lv_selectionRule_29_0= ruleWISelection )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3031:3: lv_selectionRule_29_0= ruleWISelection
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getSelectionRuleWISelectionParserRuleCall_8_4_3_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWISelection_in_ruleServiceProvider6445);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3047:3: ( (lv_assignmentRule_30_0= ruleWIAssignment ) )?
                            int alt89=2;
                            int LA89_0 = input.LA(1);

                            if ( (LA89_0==71) ) {
                                alt89=1;
                            }
                            switch (alt89) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3048:1: (lv_assignmentRule_30_0= ruleWIAssignment )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3048:1: (lv_assignmentRule_30_0= ruleWIAssignment )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3049:3: lv_assignmentRule_30_0= ruleWIAssignment
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAssignmentRuleWIAssignmentParserRuleCall_8_4_4_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleServiceProvider6467);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3065:3: ( (lv_allocationRule_31_0= ruleResourceAllocation ) )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==72) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3066:1: (lv_allocationRule_31_0= ruleResourceAllocation )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3066:1: (lv_allocationRule_31_0= ruleResourceAllocation )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3067:3: lv_allocationRule_31_0= ruleResourceAllocation
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getAllocationRuleResourceAllocationParserRuleCall_8_4_5_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleResourceAllocation_in_ruleServiceProvider6489);
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

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3083:3: ( (lv_outsourcingRule_32_0= ruleResourceOutsourcing ) )?
                            int alt91=2;
                            int LA91_0 = input.LA(1);

                            if ( (LA91_0==73) ) {
                                alt91=1;
                            }
                            switch (alt91) {
                                case 1 :
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3084:1: (lv_outsourcingRule_32_0= ruleResourceOutsourcing )
                                    {
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3084:1: (lv_outsourcingRule_32_0= ruleResourceOutsourcing )
                                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3085:3: lv_outsourcingRule_32_0= ruleResourceOutsourcing
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getOutsourcingRuleResourceOutsourcingParserRuleCall_8_4_6_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleServiceProvider6511);
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

                            otherlv_33=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6524); 

                                	newLeafNode(otherlv_33, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_8_4_7());
                                

                            }
                            break;

                    }

                    otherlv_34=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6538); 

                        	newLeafNode(otherlv_34, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_8_5());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3109:3: (otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==99) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3109:5: otherlv_35= 'Resources' otherlv_36= '{' ( (lv_resources_37_0= ruleAsset ) )+ otherlv_38= '}'
                    {
                    otherlv_35=(Token)match(input,99,FOLLOW_99_in_ruleServiceProvider6553); 

                        	newLeafNode(otherlv_35, grammarAccess.getServiceProviderAccess().getResourcesKeyword_9_0());
                        
                    otherlv_36=(Token)match(input,47,FOLLOW_47_in_ruleServiceProvider6565); 

                        	newLeafNode(otherlv_36, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3117:1: ( (lv_resources_37_0= ruleAsset ) )+
                    int cnt94=0;
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==100) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3118:1: (lv_resources_37_0= ruleAsset )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3118:1: (lv_resources_37_0= ruleAsset )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3119:3: lv_resources_37_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleServiceProvider6586);
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
                    	    if ( cnt94 >= 1 ) break loop94;
                                EarlyExitException eee =
                                    new EarlyExitException(94, input);
                                throw eee;
                        }
                        cnt94++;
                    } while (true);

                    otherlv_38=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6599); 

                        	newLeafNode(otherlv_38, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,48,FOLLOW_48_in_ruleServiceProvider6613); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3151:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3152:2: (iv_ruleAsset= ruleAsset EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3153:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset6649);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset6659); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3160:1: ruleAsset returns [EObject current=null] : (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3163:28: ( (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3164:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3164:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3164:3: otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleAsset6696); 

                	newLeafNode(otherlv_0, grammarAccess.getAssetAccess().getResourceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3168:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3169:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3169:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3170:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset6713); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleAsset6730); 

                	newLeafNode(otherlv_2, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3190:1: (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==61) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3190:3: otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleAsset6743); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getQuantityKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3194:1: ( (lv_quantity_4_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3195:1: (lv_quantity_4_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3195:1: (lv_quantity_4_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3196:3: lv_quantity_4_0= RULE_INT
                    {
                    lv_quantity_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAsset6760); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3212:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==51) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3212:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleAsset6780); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3216:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3217:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3217:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3218:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAsset6797); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3234:4: (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==95) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3234:6: otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,95,FOLLOW_95_in_ruleAsset6817); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getServicesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,47,FOLLOW_47_in_ruleAsset6829); 

                        	newLeafNode(otherlv_8, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3242:1: ( (lv_services_9_0= ruleService ) )+
                    int cnt98=0;
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==89) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3243:1: (lv_services_9_0= ruleService )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3243:1: (lv_services_9_0= ruleService )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:3: lv_services_9_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getServicesServiceParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleAsset6850);
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
                    	    if ( cnt98 >= 1 ) break loop98;
                                EarlyExitException eee =
                                    new EarlyExitException(98, input);
                                throw eee;
                        }
                        cnt98++;
                    } while (true);

                    otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleAsset6863); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleAsset6877); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3278:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3279:2: (iv_ruleCapability= ruleCapability EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3280:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_ruleCapability_in_entryRuleCapability6915);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCapability6925); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3287:1: ruleCapability returns [EObject current=null] : (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3290:28: ( (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3291:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3291:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3291:3: otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleCapability6962); 

                	newLeafNode(otherlv_0, grammarAccess.getCapabilityAccess().getCapabilityKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3295:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3296:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3296:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3297:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCapability6979); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleCapability6996); 

                	newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3317:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==51) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3317:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleCapability7009); 

                        	newLeafNode(otherlv_3, grammarAccess.getCapabilityAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3321:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3322:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3322:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3323:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCapability7026); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3339:4: ( (lv_reqs_5_0= ruleRequirement ) )+
            int cnt101=0;
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==102) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3340:1: (lv_reqs_5_0= ruleRequirement )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3340:1: (lv_reqs_5_0= ruleRequirement )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3341:3: lv_reqs_5_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleCapability7054);
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
            	    if ( cnt101 >= 1 ) break loop101;
                        EarlyExitException eee =
                            new EarlyExitException(101, input);
                        throw eee;
                }
                cnt101++;
            } while (true);

            otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleCapability7067); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3369:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3370:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3371:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement7103);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement7113); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3378:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3381:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3382:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3382:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3382:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleRequirement7150); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3386:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3387:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3387:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3388:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement7167); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleRequirement7184); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3408:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==51) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3408:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleRequirement7197); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3412:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3413:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3413:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3414:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirement7214); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3430:4: (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3430:6: otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
            {
            otherlv_5=(Token)match(input,103,FOLLOW_103_in_ruleRequirement7234); 

                	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getWorkItemsKeyword_4_0());
                
            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleRequirement7246); 

                	newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_4_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3438:1: ( (otherlv_7= RULE_ID ) )+
            int cnt103=0;
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==RULE_ID) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3439:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3439:1: (otherlv_7= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3440:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement7266); 

            	    		newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getRTasksWorkItemCrossReference_4_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt103 >= 1 ) break loop103;
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
            } while (true);

            otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleRequirement7279); 

                	newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4_3());
                

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3455:2: (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )* )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==104) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3455:4: otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausality ) )*
                    {
                    otherlv_9=(Token)match(input,104,FOLLOW_104_in_ruleRequirement7293); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3459:1: ( (lv_dependencies_10_0= ruleCausality ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( ((LA104_0>=84 && LA104_0<=85)) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3460:1: (lv_dependencies_10_0= ruleCausality )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3460:1: (lv_dependencies_10_0= ruleCausality )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3461:3: lv_dependencies_10_0= ruleCausality
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesCausalityParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausality_in_ruleRequirement7314);
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
                    	    break loop104;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleRequirement7329); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3491:1: entryRuleProvision returns [EObject current=null] : iv_ruleProvision= ruleProvision EOF ;
    public final EObject entryRuleProvision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvision = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3492:2: (iv_ruleProvision= ruleProvision EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3493:2: iv_ruleProvision= ruleProvision EOF
            {
             newCompositeNode(grammarAccess.getProvisionRule()); 
            pushFollow(FOLLOW_ruleProvision_in_entryRuleProvision7367);
            iv_ruleProvision=ruleProvision();

            state._fsp--;

             current =iv_ruleProvision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvision7377); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3500:1: ruleProvision returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3503:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3504:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3504:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3504:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleProvision7414); 

                	newLeafNode(otherlv_0, grammarAccess.getProvisionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3508:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3509:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3509:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3510:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProvisionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision7434); 

            		newLeafNode(otherlv_1, grammarAccess.getProvisionAccess().getServiceNameServiceTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,106,FOLLOW_106_in_ruleProvision7446); 

                	newLeafNode(otherlv_2, grammarAccess.getProvisionAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleProvision7458); 

                	newLeafNode(otherlv_3, grammarAccess.getProvisionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3529:1: ( (otherlv_4= RULE_ID ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==RULE_ID) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3530:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3530:1: (otherlv_4= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3531:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProvisionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision7478); 

            	    		newLeafNode(otherlv_4, grammarAccess.getProvisionAccess().getProvidersServiceProviderCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleProvision7491); 

                	newLeafNode(otherlv_5, grammarAccess.getProvisionAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,107,FOLLOW_107_in_ruleProvision7503); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3558:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3559:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3560:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine7539);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine7549); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3567:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3570:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3571:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3571:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3571:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )*
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3571:2: ()
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3572:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3577:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==108) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3577:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,108,FOLLOW_108_in_ruleStatemachine7596); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3581:1: ( (lv_events_2_0= ruleEvent ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3582:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3582:1: (lv_events_2_0= ruleEvent )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3583:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine7617);
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
                    	    if ( cnt107 >= 1 ) break loop107;
                                EarlyExitException eee =
                                    new EarlyExitException(107, input);
                                throw eee;
                        }
                        cnt107++;
                    } while (true);

                    otherlv_3=(Token)match(input,109,FOLLOW_109_in_ruleStatemachine7630); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3603:3: (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==110) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3603:5: otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,110,FOLLOW_110_in_ruleStatemachine7645); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getActivitiesKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3607:1: ( (lv_commands_5_0= ruleCommand ) )+
                    int cnt109=0;
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==RULE_ID) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3608:1: (lv_commands_5_0= ruleCommand )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3608:1: (lv_commands_5_0= ruleCommand )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3609:3: lv_commands_5_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleStatemachine7666);
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
                    	    if ( cnt109 >= 1 ) break loop109;
                                EarlyExitException eee =
                                    new EarlyExitException(109, input);
                                throw eee;
                        }
                        cnt109++;
                    } while (true);

                    otherlv_6=(Token)match(input,109,FOLLOW_109_in_ruleStatemachine7679); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3629:3: ( (lv_states_7_0= ruleState ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==111) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3630:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3630:1: (lv_states_7_0= ruleState )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3631:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine7702);
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
            	    break loop111;
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3655:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3656:2: (iv_ruleEvent= ruleEvent EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3657:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent7739);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent7749); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3664:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3667:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3668:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3668:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3668:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3668:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3669:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3669:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3670:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent7791); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3686:2: ( (lv_code_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3687:1: (lv_code_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3687:1: (lv_code_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3688:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent7813); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3712:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3713:2: (iv_ruleCommand= ruleCommand EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3714:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand7854);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand7864); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3721:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3724:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3725:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3725:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3725:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3725:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3726:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3726:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3727:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand7906); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3743:2: ( (lv_code_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3744:1: (lv_code_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3744:1: (lv_code_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3745:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand7928); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3769:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3770:2: (iv_ruleState= ruleState EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3771:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState7969);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState7979); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3778:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3781:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3782:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3782:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3782:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleState8016); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3786:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3787:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3787:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3788:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState8033); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3804:2: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==112) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3804:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,112,FOLLOW_112_in_ruleState8051); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleState8063); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3812:1: ( (otherlv_4= RULE_ID ) )+
                    int cnt112=0;
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==RULE_ID) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3813:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3813:1: (otherlv_4= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3814:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState8083); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt112 >= 1 ) break loop112;
                                EarlyExitException eee =
                                    new EarlyExitException(112, input);
                                throw eee;
                        }
                        cnt112++;
                    } while (true);

                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleState8096); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3829:3: ( (lv_transitions_6_0= ruleTransition ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==RULE_ID) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3830:1: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3830:1: (lv_transitions_6_0= ruleTransition )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3831:3: lv_transitions_6_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState8119);
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
            	    break loop114;
                }
            } while (true);

            otherlv_7=(Token)match(input,109,FOLLOW_109_in_ruleState8132); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3859:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3860:2: (iv_ruleTransition= ruleTransition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3861:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition8168);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition8178); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3868:1: ruleTransition returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3871:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3872:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3872:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_ID) ) {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==113) ) {
                    alt116=2;
                }
                else if ( (LA116_1==84) ) {
                    alt116=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3872:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3872:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3872:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3872:3: ( (otherlv_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3873:1: (otherlv_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3873:1: (otherlv_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3874:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8224); 

                    		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleTransition8236); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3889:1: ( (otherlv_2= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3890:1: (otherlv_2= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3890:1: (otherlv_2= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3891:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8256); 

                    		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3903:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3903:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3903:7: ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3903:7: ( (otherlv_3= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3904:1: (otherlv_3= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3904:1: (otherlv_3= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3905:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8284); 

                    		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,113,FOLLOW_113_in_ruleTransition8296); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSolidusKeyword_1_1());
                        
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleTransition8308); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3924:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt115=0;
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==RULE_ID) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3925:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3925:1: (otherlv_6= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3926:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8328); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getEventactionsCommandCrossReference_1_3_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt115 >= 1 ) break loop115;
                                EarlyExitException eee =
                                    new EarlyExitException(115, input);
                                throw eee;
                        }
                        cnt115++;
                    } while (true);

                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleTransition8341); 

                        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_4());
                        
                    otherlv_8=(Token)match(input,84,FOLLOW_84_in_ruleTransition8353); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_5());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3945:1: ( (otherlv_9= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3946:1: (otherlv_9= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3946:1: (otherlv_9= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3947:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition8373); 

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
    public static final BitSet FOLLOW_13_in_ruleKanbanSchedulingSystem190 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleProcessModel_in_ruleKanbanSchedulingSystem211 = new BitSet(new long[]{0x0010000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKanbanSchedulingSystem224 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKanbanSchedulingSystem236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleStrategy_in_ruleKanbanSchedulingSystem257 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000004L});
    public static final BitSet FOLLOW_16_in_ruleKanbanSchedulingSystem270 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKanbanSchedulingSystem282 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleTaskPattern_in_ruleKanbanSchedulingSystem303 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleTaskType_in_ruleKanbanSchedulingSystem325 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
    public static final BitSet FOLLOW_18_in_ruleKanbanSchedulingSystem338 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKanbanSchedulingSystem350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueFunction_in_ruleKanbanSchedulingSystem371 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000002L});
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
    public static final BitSet FOLLOW_47_in_ruleWorkItemProfile1751 = new BitSet(new long[]{0x1FF9000000000000L});
    public static final BitSet FOLLOW_51_in_ruleWorkItemProfile1764 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemProfile1781 = new BitSet(new long[]{0x1FF1000000000000L});
    public static final BitSet FOLLOW_52_in_ruleWorkItemProfile1801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile1821 = new BitSet(new long[]{0x1FE1000000000000L});
    public static final BitSet FOLLOW_53_in_ruleWorkItemProfile1836 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItemProfile1848 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleWorkReference_in_ruleWorkItemProfile1869 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkItemProfile1882 = new BitSet(new long[]{0x1FC1000000000000L});
    public static final BitSet FOLLOW_54_in_ruleWorkItemProfile1897 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItemProfile1909 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleWorkDecomposition_in_ruleWorkItemProfile1930 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkItemProfile1943 = new BitSet(new long[]{0x1F81000000000000L});
    public static final BitSet FOLLOW_55_in_ruleWorkItemProfile1958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile1978 = new BitSet(new long[]{0x1F01000000000010L});
    public static final BitSet FOLLOW_56_in_ruleWorkItemProfile1994 = new BitSet(new long[]{0x1E01040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItemProfile2015 = new BitSet(new long[]{0x1E01000000000000L});
    public static final BitSet FOLLOW_57_in_ruleWorkItemProfile2030 = new BitSet(new long[]{0x1C01040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItemProfile2051 = new BitSet(new long[]{0x1C01000000000000L});
    public static final BitSet FOLLOW_58_in_ruleWorkItemProfile2066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile2083 = new BitSet(new long[]{0x1801000000000000L});
    public static final BitSet FOLLOW_59_in_ruleWorkItemProfile2108 = new BitSet(new long[]{0x1001000000000000L});
    public static final BitSet FOLLOW_60_in_ruleWorkItemProfile2140 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkItemProfile2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkReference_in_entryRuleWorkReference2202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkReference2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleWorkReference2249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkReference2269 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleWorkReference2281 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkReference2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDecomposition_in_entryRuleWorkDecomposition2338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkDecomposition2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleWorkDecomposition2385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkDecomposition2405 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleWorkDecomposition2417 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkDecomposition2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskPattern_in_entryRuleTaskPattern2478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskPattern2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTaskPattern2525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskPattern2542 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTaskPattern2559 = new BitSet(new long[]{0x8009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTaskPattern2572 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskPattern2589 = new BitSet(new long[]{0x8001000000000000L});
    public static final BitSet FOLLOW_63_in_ruleTaskPattern2609 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTaskPattern2621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskPattern2641 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleTaskPattern2654 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTaskPattern2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskType_in_entryRuleTaskType2704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskType2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleTaskType2751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskType2768 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTaskType2785 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTaskType2798 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskType2815 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTaskType2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueFunction_in_entryRuleValueFunction2870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueFunction2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleValueFunction2917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueFunction2934 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleValueFunction2951 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleValueFunction2964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueFunction2981 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleValueFunction3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessModel_in_entryRuleProcessModel3036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessModel3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleProcessModel3083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessModel3100 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleProcessModel3117 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleProcessModel3130 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessModel3147 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleProcessModel3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy3204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategy3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleStrategy3251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategy3268 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleStrategy3285 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_ruleStrategy3298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStrategy3315 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleStrategy3343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleStrategy3364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleStrategy3385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleStrategy3406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleStrategy3427 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleStrategy3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance3475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptance3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleWIAcceptance3522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptance3539 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWIAcceptance3556 = new BitSet(new long[]{0x0009000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_51_in_ruleWIAcceptance3569 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptance3586 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleWIAcceptance3606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance3623 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleWIAcceptance3643 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance3660 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWIAcceptance3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelection_in_entryRuleWISelection3715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelection3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleWISelection3762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelection3779 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWISelection3796 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleWISelection3809 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelection3826 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWISelection3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment3881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignment3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleWIAssignment3928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignment3945 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWIAssignment3962 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleWIAssignment3975 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignment3992 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWIAssignment4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation4047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocation4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleResourceAllocation4094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocation4111 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleResourceAllocation4128 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleResourceAllocation4141 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocation4158 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleResourceAllocation4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing4213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcing4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleResourceOutsourcing4260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcing4277 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleResourceOutsourcing4294 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleResourceOutsourcing4307 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcing4324 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleResourceOutsourcing4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSource_in_entryRuleWorkSource4379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSource4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleWorkSource4426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4443 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkSource4460 = new BitSet(new long[]{0x0009000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_51_in_ruleWorkSource4473 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkSource4490 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_75_in_ruleWorkSource4510 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkSource4522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4542 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleWorkSource4555 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleWorkSource4578 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkSource4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItem_in_entryRuleWorkItem4627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItem4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleWorkItem4674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4691 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItem4708 = new BitSet(new long[]{0x0789000000000000L,0x00000000000FF400L});
    public static final BitSet FOLLOW_76_in_ruleWorkItem4721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4741 = new BitSet(new long[]{0x0789000000000000L,0x00000000000FE400L});
    public static final BitSet FOLLOW_51_in_ruleWorkItem4756 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItem4773 = new BitSet(new long[]{0x0781000000000000L,0x00000000000FE400L});
    public static final BitSet FOLLOW_77_in_ruleWorkItem4793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4813 = new BitSet(new long[]{0x0781000000000000L,0x00000000000FC400L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem4828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4848 = new BitSet(new long[]{0x0781000000000000L,0x00000000000F8400L});
    public static final BitSet FOLLOW_79_in_ruleWorkItem4863 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItem4875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4895 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleWorkItem4908 = new BitSet(new long[]{0x0781000000000000L,0x00000000000F0400L});
    public static final BitSet FOLLOW_80_in_ruleWorkItem4923 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleWorkItem4935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem4955 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleWorkItem4968 = new BitSet(new long[]{0x0781000000000000L,0x00000000000E0400L});
    public static final BitSet FOLLOW_81_in_ruleWorkItem4983 = new BitSet(new long[]{0x0781000000000000L,0x00000000003C0400L});
    public static final BitSet FOLLOW_ruleCausality_in_ruleWorkItem5004 = new BitSet(new long[]{0x0781000000000000L,0x00000000003C0400L});
    public static final BitSet FOLLOW_55_in_ruleWorkItem5020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5040 = new BitSet(new long[]{0x0701000000000010L,0x00000000000C0400L});
    public static final BitSet FOLLOW_56_in_ruleWorkItem5056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleWorkItem5077 = new BitSet(new long[]{0x0601000000000000L,0x00000000000C0400L});
    public static final BitSet FOLLOW_57_in_ruleWorkItem5092 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleWorkItem5113 = new BitSet(new long[]{0x0401000000000000L,0x00000000000C0400L});
    public static final BitSet FOLLOW_58_in_ruleWorkItem5128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5145 = new BitSet(new long[]{0x0001000000000000L,0x00000000000C0400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5185 = new BitSet(new long[]{0x0001000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleWorkItem5200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem5217 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleWorkItem5237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem5254 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleWorkItem5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCausality_in_entryRuleCausality5309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCausality5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleCausality5357 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_85_in_ruleCausality5375 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCausality5388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCausality5408 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleCausality5421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_86_in_ruleCausality5434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausality5451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleCausality5471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausality5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceType_in_entryRuleServiceType5533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceType5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleServiceType5580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceType5597 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleServiceType5615 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_ruleServiceType5628 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceType5645 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceType5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService5702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleService5749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService5766 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleService5784 = new BitSet(new long[]{0x0008000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_51_in_ruleService5797 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService5814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleService5834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService5854 = new BitSet(new long[]{0x0001000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleService5868 = new BitSet(new long[]{0x0001040000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleService5889 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleService5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider5941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProvider5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleServiceProvider5989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_92_in_ruleServiceProvider6007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6025 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6042 = new BitSet(new long[]{0x0009000000000000L,0x00000009E0000800L});
    public static final BitSet FOLLOW_51_in_ruleServiceProvider6055 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceProvider6072 = new BitSet(new long[]{0x0001000000000000L,0x00000009E0000800L});
    public static final BitSet FOLLOW_93_in_ruleServiceProvider6092 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6124 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6137 = new BitSet(new long[]{0x0001000000000000L,0x00000009C0000800L});
    public static final BitSet FOLLOW_75_in_ruleServiceProvider6152 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6184 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6197 = new BitSet(new long[]{0x0001000000000000L,0x00000009C0000000L});
    public static final BitSet FOLLOW_94_in_ruleServiceProvider6212 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6244 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6257 = new BitSet(new long[]{0x0001000000000000L,0x0000000980000000L});
    public static final BitSet FOLLOW_95_in_ruleServiceProvider6272 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6284 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleServiceProvider6305 = new BitSet(new long[]{0x0001000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6318 = new BitSet(new long[]{0x0001000000000000L,0x0000000900000000L});
    public static final BitSet FOLLOW_96_in_ruleServiceProvider6333 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6345 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleServiceProvider6357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider6377 = new BitSet(new long[]{0x0001000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleServiceProvider6390 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6402 = new BitSet(new long[]{0x0009000000000000L,0x00000000000003C8L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleServiceProvider6423 = new BitSet(new long[]{0x0001000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleServiceProvider6445 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleServiceProvider6467 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleServiceProvider6489 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleServiceProvider6511 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6524 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6538 = new BitSet(new long[]{0x0001000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleServiceProvider6553 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleServiceProvider6565 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleServiceProvider6586 = new BitSet(new long[]{0x0001000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6599 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleServiceProvider6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset6649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleAsset6696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset6713 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAsset6730 = new BitSet(new long[]{0x2009000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_61_in_ruleAsset6743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAsset6760 = new BitSet(new long[]{0x0009000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_51_in_ruleAsset6780 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAsset6797 = new BitSet(new long[]{0x0001000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleAsset6817 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAsset6829 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleAsset6850 = new BitSet(new long[]{0x0001000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_48_in_ruleAsset6863 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleAsset6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability6915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCapability6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleCapability6962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCapability6979 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCapability6996 = new BitSet(new long[]{0x0008000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_51_in_ruleCapability7009 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCapability7026 = new BitSet(new long[]{0x0008000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleCapability7054 = new BitSet(new long[]{0x0009000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_48_in_ruleCapability7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement7103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleRequirement7150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement7167 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRequirement7184 = new BitSet(new long[]{0x0008000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_51_in_ruleRequirement7197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement7214 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleRequirement7234 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRequirement7246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement7266 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleRequirement7279 = new BitSet(new long[]{0x0001000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleRequirement7293 = new BitSet(new long[]{0x0001000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleCausality_in_ruleRequirement7314 = new BitSet(new long[]{0x0001000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_48_in_ruleRequirement7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvision_in_entryRuleProvision7367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvision7377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleProvision7414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision7434 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleProvision7446 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleProvision7458 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision7478 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleProvision7491 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleProvision7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine7539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleStatemachine7596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine7617 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleStatemachine7630 = new BitSet(new long[]{0x0000000000000002L,0x0000C00000000000L});
    public static final BitSet FOLLOW_110_in_ruleStatemachine7645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatemachine7666 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleStatemachine7679 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine7702 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent7739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent7791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand7854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand7906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState7969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleState8016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState8033 = new BitSet(new long[]{0x0000000000000010L,0x0001200000000000L});
    public static final BitSet FOLLOW_112_in_ruleState8051 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleState8063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState8083 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleState8096 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState8119 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleState8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition8168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleTransition8236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8284 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleTransition8296 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleTransition8308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8328 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_44_in_ruleTransition8341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleTransition8353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition8373 = new BitSet(new long[]{0x0000000000000002L});

}