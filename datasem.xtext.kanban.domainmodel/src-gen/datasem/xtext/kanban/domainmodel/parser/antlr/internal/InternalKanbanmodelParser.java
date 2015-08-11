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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ReservedLibraries'", "'GovernanceLibrary'", "'WIAcceptanceRuleTypes'", "'end WIAcceptanceRuleTypes'", "'WISelectionRuleTypes'", "'end WISelectionRuleTypes'", "'WIAssignmentRuleTypes'", "'end WIAssignmentRuleTypes'", "'ResourceAllocationRuleTypes'", "'end ResourceAllocationRuleTypes'", "'ResourceOutsourcingRuleTypes'", "'end ResourceOutsourcingRuleTypes'", "'end GovernanceLibrary'", "'TaskLibrary'", "'ProcessModels'", "'end ProcessModels'", "'ValueFunctions'", "'end ValueFunctions'", "'end TaskLibrary'", "'end ReservedLibraries'", "'UserLibraries'", "'TaskPattern'", "'end TaskPattern'", "'ClassOfServices'", "'end ClassOfServices'", "'ServiceTypes'", "'end ServiceTypes'", "'GovernanceStrategies'", "'end GovernanceStrategies'", "'Repositories'", "'end Repositories'", "'end UserLibraries'", "'KSSModel'", "'Path'", "'OrganizationalModel'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkSources'", "'end WorkSources'", "'WorkItems'", "'end WorkItems'", "'end WorkItemNetworkModel'", "'end KSSModel'", "'ExperimentSettings'", "'Replications'", "'InterArrivalTime'", "'end ExperimentSettings'", "'.'", "'Distribution:'", "'['", "']'", "'TaskHierarchy'", "'{'", "'Description'", "'Types'", "'}'", "'TaskType'", "'ValueFunction'", "'ProcessModel'", "'ClassOfService'", "'RuleType'", "'ServiceType'", "'Repository'", "'Profiles'", "'end Repository'", "'WorkItem'", "'References'", "'Decompositions'", "'RequiredServices'", "'Efforts'", "'Value'", "'AssignmentAllowed'", "'DiscardAllowed'", "'Quantity'", "'GovernanceStrategy'", "'WIAcceptance'", "'BackLogLimit'", "'WIPLimit'", "'WISelection'", "'WIAssignment'", "'ResourceAllocation'", "'ResourceOutsourcing'", "'WorkSource'", "'TargetUnits'", "'Profile'", "'Type'", "'Predecessors'", "'Subtasks'", "'CausalTriggers'", "'ArrivalTime'", "'DueDate'", "'=>'", "'->'", "'AtProgress'", "'OnProbability'", "'Efficiency'", "'ServiceProvider'", "'Group'", "'SourceUnits'", "'SubordinateUnits'", "'Services'", "'Resources'", "'Resource'", "'capability'", "'requirement'", "'workItems'", "'workItemNetwork'", "'('", "','", "')'", "'events'", "'end'", "'activities'", "'state'", "'actions'", "'/'"
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
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=6;
    public static final int T__127=127;
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:76:1: ruleKanbanSchedulingSystem returns [EObject current=null] : (otherlv_0= 'ReservedLibraries' otherlv_1= 'GovernanceLibrary' otherlv_2= 'WIAcceptanceRuleTypes' ( (lv_WIAcceptanceRuleTypes_3_0= ruleWIAcceptanceRuleType ) )+ otherlv_4= 'end WIAcceptanceRuleTypes' otherlv_5= 'WISelectionRuleTypes' ( (lv_WISelectionRuleTypes_6_0= ruleWISelectionRuleType ) )+ otherlv_7= 'end WISelectionRuleTypes' otherlv_8= 'WIAssignmentRuleTypes' ( (lv_WIAssignmentRuleTypes_9_0= ruleWIAssignmentRuleType ) )+ otherlv_10= 'end WIAssignmentRuleTypes' otherlv_11= 'ResourceAllocationRuleTypes' ( (lv_ResourceAllocationRuleTypes_12_0= ruleResourceAllocationRuleType ) )+ otherlv_13= 'end ResourceAllocationRuleTypes' otherlv_14= 'ResourceOutsourcingRuleTypes' ( (lv_ResourceOutsourcingRuleTypes_15_0= ruleResourceOutsourcingRuleType ) )+ otherlv_16= 'end ResourceOutsourcingRuleTypes' otherlv_17= 'end GovernanceLibrary' otherlv_18= 'TaskLibrary' otherlv_19= 'ProcessModels' ( (lv_ProcessModels_20_0= ruleProcessModel ) )+ otherlv_21= 'end ProcessModels' otherlv_22= 'ValueFunctions' ( (lv_ValueFunctions_23_0= ruleValueFunction ) )+ otherlv_24= 'end ValueFunctions' otherlv_25= 'end TaskLibrary' otherlv_26= 'end ReservedLibraries' otherlv_27= 'UserLibraries' otherlv_28= 'TaskPattern' ( (lv_TaskTypes_29_0= ruleTaskType ) )+ ( (lv_TaskHierarchy_30_0= ruleTaskHierarchy ) ) otherlv_31= 'end TaskPattern' otherlv_32= 'ClassOfServices' ( (lv_ClassOfServices_33_0= ruleClassOfService ) )+ otherlv_34= 'end ClassOfServices' otherlv_35= 'ServiceTypes' ( (lv_ServiceTypes_36_0= ruleServiceType ) )+ otherlv_37= 'end ServiceTypes' otherlv_38= 'GovernanceStrategies' ( (lv_GovernanceStrategies_39_0= ruleGovernanceStrategy ) )+ otherlv_40= 'end GovernanceStrategies' (otherlv_41= 'Repositories' ( (lv_Repositories_42_0= ruleRepository ) )+ otherlv_43= 'end Repositories' )? otherlv_44= 'end UserLibraries' otherlv_45= 'KSSModel' ( (lv_name_46_0= RULE_ID ) ) (otherlv_47= 'Path' ( (lv_Path_48_0= ruleQualifiedName ) ) )? otherlv_49= 'OrganizationalModel' otherlv_50= 'ServiceProviders' ( (lv_ServiceProviders_51_0= ruleServiceProvider ) )+ otherlv_52= 'end ServiceProviders' otherlv_53= 'end OrganizationalModel' otherlv_54= 'WorkItemNetworkModel' otherlv_55= 'WorkSources' ( (lv_WorkSources_56_0= ruleWorkSource ) )+ otherlv_57= 'end WorkSources' otherlv_58= 'WorkItems' ( (lv_WorkItems_59_0= ruleWorkItem ) )+ otherlv_60= 'end WorkItems' otherlv_61= 'end WorkItemNetworkModel' otherlv_62= 'end KSSModel' otherlv_63= 'ExperimentSettings' otherlv_64= 'Replications' ( (lv_replications_65_0= RULE_INT ) ) otherlv_66= 'InterArrivalTime' ( (lv_interArrivalTime_67_0= RULE_INT ) ) otherlv_68= 'end ExperimentSettings' ) ;
    public final EObject ruleKanbanSchedulingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
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
        Token otherlv_28=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token lv_name_46_0=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token lv_replications_65_0=null;
        Token otherlv_66=null;
        Token lv_interArrivalTime_67_0=null;
        Token otherlv_68=null;
        EObject lv_WIAcceptanceRuleTypes_3_0 = null;

        EObject lv_WISelectionRuleTypes_6_0 = null;

        EObject lv_WIAssignmentRuleTypes_9_0 = null;

        EObject lv_ResourceAllocationRuleTypes_12_0 = null;

        EObject lv_ResourceOutsourcingRuleTypes_15_0 = null;

        EObject lv_ProcessModels_20_0 = null;

        EObject lv_ValueFunctions_23_0 = null;

        EObject lv_TaskTypes_29_0 = null;

        EObject lv_TaskHierarchy_30_0 = null;

        EObject lv_ClassOfServices_33_0 = null;

        EObject lv_ServiceTypes_36_0 = null;

        EObject lv_GovernanceStrategies_39_0 = null;

        EObject lv_Repositories_42_0 = null;

        AntlrDatatypeRuleToken lv_Path_48_0 = null;

        EObject lv_ServiceProviders_51_0 = null;

        EObject lv_WorkSources_56_0 = null;

        EObject lv_WorkItems_59_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:79:28: ( (otherlv_0= 'ReservedLibraries' otherlv_1= 'GovernanceLibrary' otherlv_2= 'WIAcceptanceRuleTypes' ( (lv_WIAcceptanceRuleTypes_3_0= ruleWIAcceptanceRuleType ) )+ otherlv_4= 'end WIAcceptanceRuleTypes' otherlv_5= 'WISelectionRuleTypes' ( (lv_WISelectionRuleTypes_6_0= ruleWISelectionRuleType ) )+ otherlv_7= 'end WISelectionRuleTypes' otherlv_8= 'WIAssignmentRuleTypes' ( (lv_WIAssignmentRuleTypes_9_0= ruleWIAssignmentRuleType ) )+ otherlv_10= 'end WIAssignmentRuleTypes' otherlv_11= 'ResourceAllocationRuleTypes' ( (lv_ResourceAllocationRuleTypes_12_0= ruleResourceAllocationRuleType ) )+ otherlv_13= 'end ResourceAllocationRuleTypes' otherlv_14= 'ResourceOutsourcingRuleTypes' ( (lv_ResourceOutsourcingRuleTypes_15_0= ruleResourceOutsourcingRuleType ) )+ otherlv_16= 'end ResourceOutsourcingRuleTypes' otherlv_17= 'end GovernanceLibrary' otherlv_18= 'TaskLibrary' otherlv_19= 'ProcessModels' ( (lv_ProcessModels_20_0= ruleProcessModel ) )+ otherlv_21= 'end ProcessModels' otherlv_22= 'ValueFunctions' ( (lv_ValueFunctions_23_0= ruleValueFunction ) )+ otherlv_24= 'end ValueFunctions' otherlv_25= 'end TaskLibrary' otherlv_26= 'end ReservedLibraries' otherlv_27= 'UserLibraries' otherlv_28= 'TaskPattern' ( (lv_TaskTypes_29_0= ruleTaskType ) )+ ( (lv_TaskHierarchy_30_0= ruleTaskHierarchy ) ) otherlv_31= 'end TaskPattern' otherlv_32= 'ClassOfServices' ( (lv_ClassOfServices_33_0= ruleClassOfService ) )+ otherlv_34= 'end ClassOfServices' otherlv_35= 'ServiceTypes' ( (lv_ServiceTypes_36_0= ruleServiceType ) )+ otherlv_37= 'end ServiceTypes' otherlv_38= 'GovernanceStrategies' ( (lv_GovernanceStrategies_39_0= ruleGovernanceStrategy ) )+ otherlv_40= 'end GovernanceStrategies' (otherlv_41= 'Repositories' ( (lv_Repositories_42_0= ruleRepository ) )+ otherlv_43= 'end Repositories' )? otherlv_44= 'end UserLibraries' otherlv_45= 'KSSModel' ( (lv_name_46_0= RULE_ID ) ) (otherlv_47= 'Path' ( (lv_Path_48_0= ruleQualifiedName ) ) )? otherlv_49= 'OrganizationalModel' otherlv_50= 'ServiceProviders' ( (lv_ServiceProviders_51_0= ruleServiceProvider ) )+ otherlv_52= 'end ServiceProviders' otherlv_53= 'end OrganizationalModel' otherlv_54= 'WorkItemNetworkModel' otherlv_55= 'WorkSources' ( (lv_WorkSources_56_0= ruleWorkSource ) )+ otherlv_57= 'end WorkSources' otherlv_58= 'WorkItems' ( (lv_WorkItems_59_0= ruleWorkItem ) )+ otherlv_60= 'end WorkItems' otherlv_61= 'end WorkItemNetworkModel' otherlv_62= 'end KSSModel' otherlv_63= 'ExperimentSettings' otherlv_64= 'Replications' ( (lv_replications_65_0= RULE_INT ) ) otherlv_66= 'InterArrivalTime' ( (lv_interArrivalTime_67_0= RULE_INT ) ) otherlv_68= 'end ExperimentSettings' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'ReservedLibraries' otherlv_1= 'GovernanceLibrary' otherlv_2= 'WIAcceptanceRuleTypes' ( (lv_WIAcceptanceRuleTypes_3_0= ruleWIAcceptanceRuleType ) )+ otherlv_4= 'end WIAcceptanceRuleTypes' otherlv_5= 'WISelectionRuleTypes' ( (lv_WISelectionRuleTypes_6_0= ruleWISelectionRuleType ) )+ otherlv_7= 'end WISelectionRuleTypes' otherlv_8= 'WIAssignmentRuleTypes' ( (lv_WIAssignmentRuleTypes_9_0= ruleWIAssignmentRuleType ) )+ otherlv_10= 'end WIAssignmentRuleTypes' otherlv_11= 'ResourceAllocationRuleTypes' ( (lv_ResourceAllocationRuleTypes_12_0= ruleResourceAllocationRuleType ) )+ otherlv_13= 'end ResourceAllocationRuleTypes' otherlv_14= 'ResourceOutsourcingRuleTypes' ( (lv_ResourceOutsourcingRuleTypes_15_0= ruleResourceOutsourcingRuleType ) )+ otherlv_16= 'end ResourceOutsourcingRuleTypes' otherlv_17= 'end GovernanceLibrary' otherlv_18= 'TaskLibrary' otherlv_19= 'ProcessModels' ( (lv_ProcessModels_20_0= ruleProcessModel ) )+ otherlv_21= 'end ProcessModels' otherlv_22= 'ValueFunctions' ( (lv_ValueFunctions_23_0= ruleValueFunction ) )+ otherlv_24= 'end ValueFunctions' otherlv_25= 'end TaskLibrary' otherlv_26= 'end ReservedLibraries' otherlv_27= 'UserLibraries' otherlv_28= 'TaskPattern' ( (lv_TaskTypes_29_0= ruleTaskType ) )+ ( (lv_TaskHierarchy_30_0= ruleTaskHierarchy ) ) otherlv_31= 'end TaskPattern' otherlv_32= 'ClassOfServices' ( (lv_ClassOfServices_33_0= ruleClassOfService ) )+ otherlv_34= 'end ClassOfServices' otherlv_35= 'ServiceTypes' ( (lv_ServiceTypes_36_0= ruleServiceType ) )+ otherlv_37= 'end ServiceTypes' otherlv_38= 'GovernanceStrategies' ( (lv_GovernanceStrategies_39_0= ruleGovernanceStrategy ) )+ otherlv_40= 'end GovernanceStrategies' (otherlv_41= 'Repositories' ( (lv_Repositories_42_0= ruleRepository ) )+ otherlv_43= 'end Repositories' )? otherlv_44= 'end UserLibraries' otherlv_45= 'KSSModel' ( (lv_name_46_0= RULE_ID ) ) (otherlv_47= 'Path' ( (lv_Path_48_0= ruleQualifiedName ) ) )? otherlv_49= 'OrganizationalModel' otherlv_50= 'ServiceProviders' ( (lv_ServiceProviders_51_0= ruleServiceProvider ) )+ otherlv_52= 'end ServiceProviders' otherlv_53= 'end OrganizationalModel' otherlv_54= 'WorkItemNetworkModel' otherlv_55= 'WorkSources' ( (lv_WorkSources_56_0= ruleWorkSource ) )+ otherlv_57= 'end WorkSources' otherlv_58= 'WorkItems' ( (lv_WorkItems_59_0= ruleWorkItem ) )+ otherlv_60= 'end WorkItems' otherlv_61= 'end WorkItemNetworkModel' otherlv_62= 'end KSSModel' otherlv_63= 'ExperimentSettings' otherlv_64= 'Replications' ( (lv_replications_65_0= RULE_INT ) ) otherlv_66= 'InterArrivalTime' ( (lv_interArrivalTime_67_0= RULE_INT ) ) otherlv_68= 'end ExperimentSettings' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'ReservedLibraries' otherlv_1= 'GovernanceLibrary' otherlv_2= 'WIAcceptanceRuleTypes' ( (lv_WIAcceptanceRuleTypes_3_0= ruleWIAcceptanceRuleType ) )+ otherlv_4= 'end WIAcceptanceRuleTypes' otherlv_5= 'WISelectionRuleTypes' ( (lv_WISelectionRuleTypes_6_0= ruleWISelectionRuleType ) )+ otherlv_7= 'end WISelectionRuleTypes' otherlv_8= 'WIAssignmentRuleTypes' ( (lv_WIAssignmentRuleTypes_9_0= ruleWIAssignmentRuleType ) )+ otherlv_10= 'end WIAssignmentRuleTypes' otherlv_11= 'ResourceAllocationRuleTypes' ( (lv_ResourceAllocationRuleTypes_12_0= ruleResourceAllocationRuleType ) )+ otherlv_13= 'end ResourceAllocationRuleTypes' otherlv_14= 'ResourceOutsourcingRuleTypes' ( (lv_ResourceOutsourcingRuleTypes_15_0= ruleResourceOutsourcingRuleType ) )+ otherlv_16= 'end ResourceOutsourcingRuleTypes' otherlv_17= 'end GovernanceLibrary' otherlv_18= 'TaskLibrary' otherlv_19= 'ProcessModels' ( (lv_ProcessModels_20_0= ruleProcessModel ) )+ otherlv_21= 'end ProcessModels' otherlv_22= 'ValueFunctions' ( (lv_ValueFunctions_23_0= ruleValueFunction ) )+ otherlv_24= 'end ValueFunctions' otherlv_25= 'end TaskLibrary' otherlv_26= 'end ReservedLibraries' otherlv_27= 'UserLibraries' otherlv_28= 'TaskPattern' ( (lv_TaskTypes_29_0= ruleTaskType ) )+ ( (lv_TaskHierarchy_30_0= ruleTaskHierarchy ) ) otherlv_31= 'end TaskPattern' otherlv_32= 'ClassOfServices' ( (lv_ClassOfServices_33_0= ruleClassOfService ) )+ otherlv_34= 'end ClassOfServices' otherlv_35= 'ServiceTypes' ( (lv_ServiceTypes_36_0= ruleServiceType ) )+ otherlv_37= 'end ServiceTypes' otherlv_38= 'GovernanceStrategies' ( (lv_GovernanceStrategies_39_0= ruleGovernanceStrategy ) )+ otherlv_40= 'end GovernanceStrategies' (otherlv_41= 'Repositories' ( (lv_Repositories_42_0= ruleRepository ) )+ otherlv_43= 'end Repositories' )? otherlv_44= 'end UserLibraries' otherlv_45= 'KSSModel' ( (lv_name_46_0= RULE_ID ) ) (otherlv_47= 'Path' ( (lv_Path_48_0= ruleQualifiedName ) ) )? otherlv_49= 'OrganizationalModel' otherlv_50= 'ServiceProviders' ( (lv_ServiceProviders_51_0= ruleServiceProvider ) )+ otherlv_52= 'end ServiceProviders' otherlv_53= 'end OrganizationalModel' otherlv_54= 'WorkItemNetworkModel' otherlv_55= 'WorkSources' ( (lv_WorkSources_56_0= ruleWorkSource ) )+ otherlv_57= 'end WorkSources' otherlv_58= 'WorkItems' ( (lv_WorkItems_59_0= ruleWorkItem ) )+ otherlv_60= 'end WorkItems' otherlv_61= 'end WorkItemNetworkModel' otherlv_62= 'end KSSModel' otherlv_63= 'ExperimentSettings' otherlv_64= 'Replications' ( (lv_replications_65_0= RULE_INT ) ) otherlv_66= 'InterArrivalTime' ( (lv_interArrivalTime_67_0= RULE_INT ) ) otherlv_68= 'end ExperimentSettings' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:3: otherlv_0= 'ReservedLibraries' otherlv_1= 'GovernanceLibrary' otherlv_2= 'WIAcceptanceRuleTypes' ( (lv_WIAcceptanceRuleTypes_3_0= ruleWIAcceptanceRuleType ) )+ otherlv_4= 'end WIAcceptanceRuleTypes' otherlv_5= 'WISelectionRuleTypes' ( (lv_WISelectionRuleTypes_6_0= ruleWISelectionRuleType ) )+ otherlv_7= 'end WISelectionRuleTypes' otherlv_8= 'WIAssignmentRuleTypes' ( (lv_WIAssignmentRuleTypes_9_0= ruleWIAssignmentRuleType ) )+ otherlv_10= 'end WIAssignmentRuleTypes' otherlv_11= 'ResourceAllocationRuleTypes' ( (lv_ResourceAllocationRuleTypes_12_0= ruleResourceAllocationRuleType ) )+ otherlv_13= 'end ResourceAllocationRuleTypes' otherlv_14= 'ResourceOutsourcingRuleTypes' ( (lv_ResourceOutsourcingRuleTypes_15_0= ruleResourceOutsourcingRuleType ) )+ otherlv_16= 'end ResourceOutsourcingRuleTypes' otherlv_17= 'end GovernanceLibrary' otherlv_18= 'TaskLibrary' otherlv_19= 'ProcessModels' ( (lv_ProcessModels_20_0= ruleProcessModel ) )+ otherlv_21= 'end ProcessModels' otherlv_22= 'ValueFunctions' ( (lv_ValueFunctions_23_0= ruleValueFunction ) )+ otherlv_24= 'end ValueFunctions' otherlv_25= 'end TaskLibrary' otherlv_26= 'end ReservedLibraries' otherlv_27= 'UserLibraries' otherlv_28= 'TaskPattern' ( (lv_TaskTypes_29_0= ruleTaskType ) )+ ( (lv_TaskHierarchy_30_0= ruleTaskHierarchy ) ) otherlv_31= 'end TaskPattern' otherlv_32= 'ClassOfServices' ( (lv_ClassOfServices_33_0= ruleClassOfService ) )+ otherlv_34= 'end ClassOfServices' otherlv_35= 'ServiceTypes' ( (lv_ServiceTypes_36_0= ruleServiceType ) )+ otherlv_37= 'end ServiceTypes' otherlv_38= 'GovernanceStrategies' ( (lv_GovernanceStrategies_39_0= ruleGovernanceStrategy ) )+ otherlv_40= 'end GovernanceStrategies' (otherlv_41= 'Repositories' ( (lv_Repositories_42_0= ruleRepository ) )+ otherlv_43= 'end Repositories' )? otherlv_44= 'end UserLibraries' otherlv_45= 'KSSModel' ( (lv_name_46_0= RULE_ID ) ) (otherlv_47= 'Path' ( (lv_Path_48_0= ruleQualifiedName ) ) )? otherlv_49= 'OrganizationalModel' otherlv_50= 'ServiceProviders' ( (lv_ServiceProviders_51_0= ruleServiceProvider ) )+ otherlv_52= 'end ServiceProviders' otherlv_53= 'end OrganizationalModel' otherlv_54= 'WorkItemNetworkModel' otherlv_55= 'WorkSources' ( (lv_WorkSources_56_0= ruleWorkSource ) )+ otherlv_57= 'end WorkSources' otherlv_58= 'WorkItems' ( (lv_WorkItems_59_0= ruleWorkItem ) )+ otherlv_60= 'end WorkItems' otherlv_61= 'end WorkItemNetworkModel' otherlv_62= 'end KSSModel' otherlv_63= 'ExperimentSettings' otherlv_64= 'Replications' ( (lv_replications_65_0= RULE_INT ) ) otherlv_66= 'InterArrivalTime' ( (lv_interArrivalTime_67_0= RULE_INT ) ) otherlv_68= 'end ExperimentSettings'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleKanbanSchedulingSystem122); 

                	newLeafNode(otherlv_0, grammarAccess.getKanbanSchedulingSystemAccess().getReservedLibrariesKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleKanbanSchedulingSystem134); 

                	newLeafNode(otherlv_1, grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceLibraryKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleKanbanSchedulingSystem146); 

                	newLeafNode(otherlv_2, grammarAccess.getKanbanSchedulingSystemAccess().getWIAcceptanceRuleTypesKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:92:1: ( (lv_WIAcceptanceRuleTypes_3_0= ruleWIAcceptanceRuleType ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==73) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:93:1: (lv_WIAcceptanceRuleTypes_3_0= ruleWIAcceptanceRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:93:1: (lv_WIAcceptanceRuleTypes_3_0= ruleWIAcceptanceRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:94:3: lv_WIAcceptanceRuleTypes_3_0= ruleWIAcceptanceRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getWIAcceptanceRuleTypesWIAcceptanceRuleTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWIAcceptanceRuleType_in_ruleKanbanSchedulingSystem167);
            	    lv_WIAcceptanceRuleTypes_3_0=ruleWIAcceptanceRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WIAcceptanceRuleTypes",
            	            		lv_WIAcceptanceRuleTypes_3_0, 
            	            		"WIAcceptanceRuleType");
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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleKanbanSchedulingSystem180); 

                	newLeafNode(otherlv_4, grammarAccess.getKanbanSchedulingSystemAccess().getEndWIAcceptanceRuleTypesKeyword_4());
                
            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleKanbanSchedulingSystem192); 

                	newLeafNode(otherlv_5, grammarAccess.getKanbanSchedulingSystemAccess().getWISelectionRuleTypesKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:118:1: ( (lv_WISelectionRuleTypes_6_0= ruleWISelectionRuleType ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==73) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:119:1: (lv_WISelectionRuleTypes_6_0= ruleWISelectionRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:119:1: (lv_WISelectionRuleTypes_6_0= ruleWISelectionRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:120:3: lv_WISelectionRuleTypes_6_0= ruleWISelectionRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getWISelectionRuleTypesWISelectionRuleTypeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWISelectionRuleType_in_ruleKanbanSchedulingSystem213);
            	    lv_WISelectionRuleTypes_6_0=ruleWISelectionRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WISelectionRuleTypes",
            	            		lv_WISelectionRuleTypes_6_0, 
            	            		"WISelectionRuleType");
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

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleKanbanSchedulingSystem226); 

                	newLeafNode(otherlv_7, grammarAccess.getKanbanSchedulingSystemAccess().getEndWISelectionRuleTypesKeyword_7());
                
            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleKanbanSchedulingSystem238); 

                	newLeafNode(otherlv_8, grammarAccess.getKanbanSchedulingSystemAccess().getWIAssignmentRuleTypesKeyword_8());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:144:1: ( (lv_WIAssignmentRuleTypes_9_0= ruleWIAssignmentRuleType ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==73) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:145:1: (lv_WIAssignmentRuleTypes_9_0= ruleWIAssignmentRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:145:1: (lv_WIAssignmentRuleTypes_9_0= ruleWIAssignmentRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:146:3: lv_WIAssignmentRuleTypes_9_0= ruleWIAssignmentRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getWIAssignmentRuleTypesWIAssignmentRuleTypeParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWIAssignmentRuleType_in_ruleKanbanSchedulingSystem259);
            	    lv_WIAssignmentRuleTypes_9_0=ruleWIAssignmentRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WIAssignmentRuleTypes",
            	            		lv_WIAssignmentRuleTypes_9_0, 
            	            		"WIAssignmentRuleType");
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

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleKanbanSchedulingSystem272); 

                	newLeafNode(otherlv_10, grammarAccess.getKanbanSchedulingSystemAccess().getEndWIAssignmentRuleTypesKeyword_10());
                
            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleKanbanSchedulingSystem284); 

                	newLeafNode(otherlv_11, grammarAccess.getKanbanSchedulingSystemAccess().getResourceAllocationRuleTypesKeyword_11());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:170:1: ( (lv_ResourceAllocationRuleTypes_12_0= ruleResourceAllocationRuleType ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==73) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:171:1: (lv_ResourceAllocationRuleTypes_12_0= ruleResourceAllocationRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:171:1: (lv_ResourceAllocationRuleTypes_12_0= ruleResourceAllocationRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:172:3: lv_ResourceAllocationRuleTypes_12_0= ruleResourceAllocationRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getResourceAllocationRuleTypesResourceAllocationRuleTypeParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceAllocationRuleType_in_ruleKanbanSchedulingSystem305);
            	    lv_ResourceAllocationRuleTypes_12_0=ruleResourceAllocationRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ResourceAllocationRuleTypes",
            	            		lv_ResourceAllocationRuleTypes_12_0, 
            	            		"ResourceAllocationRuleType");
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

            otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleKanbanSchedulingSystem318); 

                	newLeafNode(otherlv_13, grammarAccess.getKanbanSchedulingSystemAccess().getEndResourceAllocationRuleTypesKeyword_13());
                
            otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleKanbanSchedulingSystem330); 

                	newLeafNode(otherlv_14, grammarAccess.getKanbanSchedulingSystemAccess().getResourceOutsourcingRuleTypesKeyword_14());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:196:1: ( (lv_ResourceOutsourcingRuleTypes_15_0= ruleResourceOutsourcingRuleType ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==73) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:197:1: (lv_ResourceOutsourcingRuleTypes_15_0= ruleResourceOutsourcingRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:197:1: (lv_ResourceOutsourcingRuleTypes_15_0= ruleResourceOutsourcingRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:3: lv_ResourceOutsourcingRuleTypes_15_0= ruleResourceOutsourcingRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getResourceOutsourcingRuleTypesResourceOutsourcingRuleTypeParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceOutsourcingRuleType_in_ruleKanbanSchedulingSystem351);
            	    lv_ResourceOutsourcingRuleTypes_15_0=ruleResourceOutsourcingRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ResourceOutsourcingRuleTypes",
            	            		lv_ResourceOutsourcingRuleTypes_15_0, 
            	            		"ResourceOutsourcingRuleType");
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

            otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleKanbanSchedulingSystem364); 

                	newLeafNode(otherlv_16, grammarAccess.getKanbanSchedulingSystemAccess().getEndResourceOutsourcingRuleTypesKeyword_16());
                
            otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleKanbanSchedulingSystem376); 

                	newLeafNode(otherlv_17, grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceLibraryKeyword_17());
                
            otherlv_18=(Token)match(input,24,FOLLOW_24_in_ruleKanbanSchedulingSystem388); 

                	newLeafNode(otherlv_18, grammarAccess.getKanbanSchedulingSystemAccess().getTaskLibraryKeyword_18());
                
            otherlv_19=(Token)match(input,25,FOLLOW_25_in_ruleKanbanSchedulingSystem400); 

                	newLeafNode(otherlv_19, grammarAccess.getKanbanSchedulingSystemAccess().getProcessModelsKeyword_19());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:230:1: ( (lv_ProcessModels_20_0= ruleProcessModel ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==71) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:231:1: (lv_ProcessModels_20_0= ruleProcessModel )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:231:1: (lv_ProcessModels_20_0= ruleProcessModel )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:232:3: lv_ProcessModels_20_0= ruleProcessModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getProcessModelsProcessModelParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessModel_in_ruleKanbanSchedulingSystem421);
            	    lv_ProcessModels_20_0=ruleProcessModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ProcessModels",
            	            		lv_ProcessModels_20_0, 
            	            		"ProcessModel");
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

            otherlv_21=(Token)match(input,26,FOLLOW_26_in_ruleKanbanSchedulingSystem434); 

                	newLeafNode(otherlv_21, grammarAccess.getKanbanSchedulingSystemAccess().getEndProcessModelsKeyword_21());
                
            otherlv_22=(Token)match(input,27,FOLLOW_27_in_ruleKanbanSchedulingSystem446); 

                	newLeafNode(otherlv_22, grammarAccess.getKanbanSchedulingSystemAccess().getValueFunctionsKeyword_22());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:256:1: ( (lv_ValueFunctions_23_0= ruleValueFunction ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==70) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:257:1: (lv_ValueFunctions_23_0= ruleValueFunction )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:257:1: (lv_ValueFunctions_23_0= ruleValueFunction )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:258:3: lv_ValueFunctions_23_0= ruleValueFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getValueFunctionsValueFunctionParserRuleCall_23_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueFunction_in_ruleKanbanSchedulingSystem467);
            	    lv_ValueFunctions_23_0=ruleValueFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ValueFunctions",
            	            		lv_ValueFunctions_23_0, 
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

            otherlv_24=(Token)match(input,28,FOLLOW_28_in_ruleKanbanSchedulingSystem480); 

                	newLeafNode(otherlv_24, grammarAccess.getKanbanSchedulingSystemAccess().getEndValueFunctionsKeyword_24());
                
            otherlv_25=(Token)match(input,29,FOLLOW_29_in_ruleKanbanSchedulingSystem492); 

                	newLeafNode(otherlv_25, grammarAccess.getKanbanSchedulingSystemAccess().getEndTaskLibraryKeyword_25());
                
            otherlv_26=(Token)match(input,30,FOLLOW_30_in_ruleKanbanSchedulingSystem504); 

                	newLeafNode(otherlv_26, grammarAccess.getKanbanSchedulingSystemAccess().getEndReservedLibrariesKeyword_26());
                
            otherlv_27=(Token)match(input,31,FOLLOW_31_in_ruleKanbanSchedulingSystem516); 

                	newLeafNode(otherlv_27, grammarAccess.getKanbanSchedulingSystemAccess().getUserLibrariesKeyword_27());
                
            otherlv_28=(Token)match(input,32,FOLLOW_32_in_ruleKanbanSchedulingSystem528); 

                	newLeafNode(otherlv_28, grammarAccess.getKanbanSchedulingSystemAccess().getTaskPatternKeyword_28());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:294:1: ( (lv_TaskTypes_29_0= ruleTaskType ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==69) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:295:1: (lv_TaskTypes_29_0= ruleTaskType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:295:1: (lv_TaskTypes_29_0= ruleTaskType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:296:3: lv_TaskTypes_29_0= ruleTaskType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getTaskTypesTaskTypeParserRuleCall_29_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTaskType_in_ruleKanbanSchedulingSystem549);
            	    lv_TaskTypes_29_0=ruleTaskType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"TaskTypes",
            	            		lv_TaskTypes_29_0, 
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:312:3: ( (lv_TaskHierarchy_30_0= ruleTaskHierarchy ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:313:1: (lv_TaskHierarchy_30_0= ruleTaskHierarchy )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:313:1: (lv_TaskHierarchy_30_0= ruleTaskHierarchy )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:314:3: lv_TaskHierarchy_30_0= ruleTaskHierarchy
            {
             
            	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getTaskHierarchyTaskHierarchyParserRuleCall_30_0()); 
            	    
            pushFollow(FOLLOW_ruleTaskHierarchy_in_ruleKanbanSchedulingSystem571);
            lv_TaskHierarchy_30_0=ruleTaskHierarchy();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		set(
                   			current, 
                   			"TaskHierarchy",
                    		lv_TaskHierarchy_30_0, 
                    		"TaskHierarchy");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_31=(Token)match(input,33,FOLLOW_33_in_ruleKanbanSchedulingSystem583); 

                	newLeafNode(otherlv_31, grammarAccess.getKanbanSchedulingSystemAccess().getEndTaskPatternKeyword_31());
                
            otherlv_32=(Token)match(input,34,FOLLOW_34_in_ruleKanbanSchedulingSystem595); 

                	newLeafNode(otherlv_32, grammarAccess.getKanbanSchedulingSystemAccess().getClassOfServicesKeyword_32());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:338:1: ( (lv_ClassOfServices_33_0= ruleClassOfService ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==72) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:339:1: (lv_ClassOfServices_33_0= ruleClassOfService )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:339:1: (lv_ClassOfServices_33_0= ruleClassOfService )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:340:3: lv_ClassOfServices_33_0= ruleClassOfService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getClassOfServicesClassOfServiceParserRuleCall_33_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassOfService_in_ruleKanbanSchedulingSystem616);
            	    lv_ClassOfServices_33_0=ruleClassOfService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ClassOfServices",
            	            		lv_ClassOfServices_33_0, 
            	            		"ClassOfService");
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

            otherlv_34=(Token)match(input,35,FOLLOW_35_in_ruleKanbanSchedulingSystem629); 

                	newLeafNode(otherlv_34, grammarAccess.getKanbanSchedulingSystemAccess().getEndClassOfServicesKeyword_34());
                
            otherlv_35=(Token)match(input,36,FOLLOW_36_in_ruleKanbanSchedulingSystem641); 

                	newLeafNode(otherlv_35, grammarAccess.getKanbanSchedulingSystemAccess().getServiceTypesKeyword_35());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:364:1: ( (lv_ServiceTypes_36_0= ruleServiceType ) )+
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
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:365:1: (lv_ServiceTypes_36_0= ruleServiceType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:365:1: (lv_ServiceTypes_36_0= ruleServiceType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:366:3: lv_ServiceTypes_36_0= ruleServiceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getServiceTypesServiceTypeParserRuleCall_36_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceType_in_ruleKanbanSchedulingSystem662);
            	    lv_ServiceTypes_36_0=ruleServiceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceTypes",
            	            		lv_ServiceTypes_36_0, 
            	            		"ServiceType");
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

            otherlv_37=(Token)match(input,37,FOLLOW_37_in_ruleKanbanSchedulingSystem675); 

                	newLeafNode(otherlv_37, grammarAccess.getKanbanSchedulingSystemAccess().getEndServiceTypesKeyword_37());
                
            otherlv_38=(Token)match(input,38,FOLLOW_38_in_ruleKanbanSchedulingSystem687); 

                	newLeafNode(otherlv_38, grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceStrategiesKeyword_38());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:390:1: ( (lv_GovernanceStrategies_39_0= ruleGovernanceStrategy ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==87) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:391:1: (lv_GovernanceStrategies_39_0= ruleGovernanceStrategy )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:391:1: (lv_GovernanceStrategies_39_0= ruleGovernanceStrategy )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:392:3: lv_GovernanceStrategies_39_0= ruleGovernanceStrategy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceStrategiesGovernanceStrategyParserRuleCall_39_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGovernanceStrategy_in_ruleKanbanSchedulingSystem708);
            	    lv_GovernanceStrategies_39_0=ruleGovernanceStrategy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GovernanceStrategies",
            	            		lv_GovernanceStrategies_39_0, 
            	            		"GovernanceStrategy");
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

            otherlv_40=(Token)match(input,39,FOLLOW_39_in_ruleKanbanSchedulingSystem721); 

                	newLeafNode(otherlv_40, grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceStrategiesKeyword_40());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:412:1: (otherlv_41= 'Repositories' ( (lv_Repositories_42_0= ruleRepository ) )+ otherlv_43= 'end Repositories' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:412:3: otherlv_41= 'Repositories' ( (lv_Repositories_42_0= ruleRepository ) )+ otherlv_43= 'end Repositories'
                    {
                    otherlv_41=(Token)match(input,40,FOLLOW_40_in_ruleKanbanSchedulingSystem734); 

                        	newLeafNode(otherlv_41, grammarAccess.getKanbanSchedulingSystemAccess().getRepositoriesKeyword_41_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:416:1: ( (lv_Repositories_42_0= ruleRepository ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==75) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:417:1: (lv_Repositories_42_0= ruleRepository )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:417:1: (lv_Repositories_42_0= ruleRepository )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:418:3: lv_Repositories_42_0= ruleRepository
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getRepositoriesRepositoryParserRuleCall_41_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRepository_in_ruleKanbanSchedulingSystem755);
                    	    lv_Repositories_42_0=ruleRepository();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Repositories",
                    	            		lv_Repositories_42_0, 
                    	            		"Repository");
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

                    otherlv_43=(Token)match(input,41,FOLLOW_41_in_ruleKanbanSchedulingSystem768); 

                        	newLeafNode(otherlv_43, grammarAccess.getKanbanSchedulingSystemAccess().getEndRepositoriesKeyword_41_2());
                        

                    }
                    break;

            }

            otherlv_44=(Token)match(input,42,FOLLOW_42_in_ruleKanbanSchedulingSystem782); 

                	newLeafNode(otherlv_44, grammarAccess.getKanbanSchedulingSystemAccess().getEndUserLibrariesKeyword_42());
                
            otherlv_45=(Token)match(input,43,FOLLOW_43_in_ruleKanbanSchedulingSystem794); 

                	newLeafNode(otherlv_45, grammarAccess.getKanbanSchedulingSystemAccess().getKSSModelKeyword_43());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:446:1: ( (lv_name_46_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:447:1: (lv_name_46_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:447:1: (lv_name_46_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:448:3: lv_name_46_0= RULE_ID
            {
            lv_name_46_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKanbanSchedulingSystem811); 

            			newLeafNode(lv_name_46_0, grammarAccess.getKanbanSchedulingSystemAccess().getNameIDTerminalRuleCall_44_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_46_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:464:2: (otherlv_47= 'Path' ( (lv_Path_48_0= ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:464:4: otherlv_47= 'Path' ( (lv_Path_48_0= ruleQualifiedName ) )
                    {
                    otherlv_47=(Token)match(input,44,FOLLOW_44_in_ruleKanbanSchedulingSystem829); 

                        	newLeafNode(otherlv_47, grammarAccess.getKanbanSchedulingSystemAccess().getPathKeyword_45_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:468:1: ( (lv_Path_48_0= ruleQualifiedName ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:469:1: (lv_Path_48_0= ruleQualifiedName )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:469:1: (lv_Path_48_0= ruleQualifiedName )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:470:3: lv_Path_48_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getPathQualifiedNameParserRuleCall_45_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleKanbanSchedulingSystem850);
                    lv_Path_48_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
                    	        }
                           		set(
                           			current, 
                           			"Path",
                            		lv_Path_48_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_49=(Token)match(input,45,FOLLOW_45_in_ruleKanbanSchedulingSystem864); 

                	newLeafNode(otherlv_49, grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationalModelKeyword_46());
                
            otherlv_50=(Token)match(input,46,FOLLOW_46_in_ruleKanbanSchedulingSystem876); 

                	newLeafNode(otherlv_50, grammarAccess.getKanbanSchedulingSystemAccess().getServiceProvidersKeyword_47());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:494:1: ( (lv_ServiceProviders_51_0= ruleServiceProvider ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=109 && LA15_0<=110)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:495:1: (lv_ServiceProviders_51_0= ruleServiceProvider )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:495:1: (lv_ServiceProviders_51_0= ruleServiceProvider )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:496:3: lv_ServiceProviders_51_0= ruleServiceProvider
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getServiceProvidersServiceProviderParserRuleCall_48_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceProvider_in_ruleKanbanSchedulingSystem897);
            	    lv_ServiceProviders_51_0=ruleServiceProvider();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceProviders",
            	            		lv_ServiceProviders_51_0, 
            	            		"ServiceProvider");
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

            otherlv_52=(Token)match(input,47,FOLLOW_47_in_ruleKanbanSchedulingSystem910); 

                	newLeafNode(otherlv_52, grammarAccess.getKanbanSchedulingSystemAccess().getEndServiceProvidersKeyword_49());
                
            otherlv_53=(Token)match(input,48,FOLLOW_48_in_ruleKanbanSchedulingSystem922); 

                	newLeafNode(otherlv_53, grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationalModelKeyword_50());
                
            otherlv_54=(Token)match(input,49,FOLLOW_49_in_ruleKanbanSchedulingSystem934); 

                	newLeafNode(otherlv_54, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemNetworkModelKeyword_51());
                
            otherlv_55=(Token)match(input,50,FOLLOW_50_in_ruleKanbanSchedulingSystem946); 

                	newLeafNode(otherlv_55, grammarAccess.getKanbanSchedulingSystemAccess().getWorkSourcesKeyword_52());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:528:1: ( (lv_WorkSources_56_0= ruleWorkSource ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==95) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:529:1: (lv_WorkSources_56_0= ruleWorkSource )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:529:1: (lv_WorkSources_56_0= ruleWorkSource )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:530:3: lv_WorkSources_56_0= ruleWorkSource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getWorkSourcesWorkSourceParserRuleCall_53_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkSource_in_ruleKanbanSchedulingSystem967);
            	    lv_WorkSources_56_0=ruleWorkSource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkSources",
            	            		lv_WorkSources_56_0, 
            	            		"WorkSource");
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

            otherlv_57=(Token)match(input,51,FOLLOW_51_in_ruleKanbanSchedulingSystem980); 

                	newLeafNode(otherlv_57, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkSourcesKeyword_54());
                
            otherlv_58=(Token)match(input,52,FOLLOW_52_in_ruleKanbanSchedulingSystem992); 

                	newLeafNode(otherlv_58, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsKeyword_55());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:554:1: ( (lv_WorkItems_59_0= ruleWorkItem ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==78) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:555:1: (lv_WorkItems_59_0= ruleWorkItem )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:555:1: (lv_WorkItems_59_0= ruleWorkItem )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:556:3: lv_WorkItems_59_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsWorkItemParserRuleCall_56_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItem_in_ruleKanbanSchedulingSystem1013);
            	    lv_WorkItems_59_0=ruleWorkItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkItems",
            	            		lv_WorkItems_59_0, 
            	            		"WorkItem");
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

            otherlv_60=(Token)match(input,53,FOLLOW_53_in_ruleKanbanSchedulingSystem1026); 

                	newLeafNode(otherlv_60, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemsKeyword_57());
                
            otherlv_61=(Token)match(input,54,FOLLOW_54_in_ruleKanbanSchedulingSystem1038); 

                	newLeafNode(otherlv_61, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemNetworkModelKeyword_58());
                
            otherlv_62=(Token)match(input,55,FOLLOW_55_in_ruleKanbanSchedulingSystem1050); 

                	newLeafNode(otherlv_62, grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSModelKeyword_59());
                
            otherlv_63=(Token)match(input,56,FOLLOW_56_in_ruleKanbanSchedulingSystem1062); 

                	newLeafNode(otherlv_63, grammarAccess.getKanbanSchedulingSystemAccess().getExperimentSettingsKeyword_60());
                
            otherlv_64=(Token)match(input,57,FOLLOW_57_in_ruleKanbanSchedulingSystem1074); 

                	newLeafNode(otherlv_64, grammarAccess.getKanbanSchedulingSystemAccess().getReplicationsKeyword_61());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:592:1: ( (lv_replications_65_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:593:1: (lv_replications_65_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:593:1: (lv_replications_65_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:594:3: lv_replications_65_0= RULE_INT
            {
            lv_replications_65_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem1091); 

            			newLeafNode(lv_replications_65_0, grammarAccess.getKanbanSchedulingSystemAccess().getReplicationsINTTerminalRuleCall_62_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"replications",
                    		lv_replications_65_0, 
                    		"INT");
            	    

            }


            }

            otherlv_66=(Token)match(input,58,FOLLOW_58_in_ruleKanbanSchedulingSystem1108); 

                	newLeafNode(otherlv_66, grammarAccess.getKanbanSchedulingSystemAccess().getInterArrivalTimeKeyword_63());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:614:1: ( (lv_interArrivalTime_67_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:615:1: (lv_interArrivalTime_67_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:615:1: (lv_interArrivalTime_67_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:616:3: lv_interArrivalTime_67_0= RULE_INT
            {
            lv_interArrivalTime_67_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem1125); 

            			newLeafNode(lv_interArrivalTime_67_0, grammarAccess.getKanbanSchedulingSystemAccess().getInterArrivalTimeINTTerminalRuleCall_64_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"interArrivalTime",
                    		lv_interArrivalTime_67_0, 
                    		"INT");
            	    

            }


            }

            otherlv_68=(Token)match(input,59,FOLLOW_59_in_ruleKanbanSchedulingSystem1142); 

                	newLeafNode(otherlv_68, grammarAccess.getKanbanSchedulingSystemAccess().getEndExperimentSettingsKeyword_65());
                

            }


            }

             leaveRule(); 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:644:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:645:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:646:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1179);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1190); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:653:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:656:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:657:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:657:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:657:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1230); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:664:1: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==60) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:665:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleQualifiedName1249); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1264); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:685:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:686:2: (iv_ruleDouble= ruleDouble EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:687:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble1312);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble1323); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:694:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:697:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:698:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:698:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:698:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble1363); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:705:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==60) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:706:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleDouble1382); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble1397); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:726:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:727:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:728:2: iv_ruleNumExpression= ruleNumExpression EOF
            {
             newCompositeNode(grammarAccess.getNumExpressionRule()); 
            pushFollow(FOLLOW_ruleNumExpression_in_entryRuleNumExpression1444);
            iv_ruleNumExpression=ruleNumExpression();

            state._fsp--;

             current =iv_ruleNumExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumExpression1454); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:735:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_distribution_1_0=null;
        AntlrDatatypeRuleToken lv_numValue_0_0 = null;

        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:738:28: ( ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:739:1: ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:739:1: ( ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:739:2: ( (lv_numValue_0_0= ruleDouble ) )? ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:739:2: ( (lv_numValue_0_0= ruleDouble ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:740:1: (lv_numValue_0_0= ruleDouble )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:740:1: (lv_numValue_0_0= ruleDouble )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:741:3: lv_numValue_0_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumValueDoubleParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleNumExpression1500);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:757:3: ( ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==61) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:757:4: ( (lv_distribution_1_0= 'Distribution:' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:757:4: ( (lv_distribution_1_0= 'Distribution:' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:758:1: (lv_distribution_1_0= 'Distribution:' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:758:1: (lv_distribution_1_0= 'Distribution:' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:759:3: lv_distribution_1_0= 'Distribution:'
                    {
                    lv_distribution_1_0=(Token)match(input,61,FOLLOW_61_in_ruleNumExpression1520); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionDistributionKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Distribution:");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:772:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:773:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:773:1: (lv_numDist_2_0= ruleDistribution )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:774:3: lv_numDist_2_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumDistDistributionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleNumExpression1554);
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:798:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:799:2: (iv_ruleParameter= ruleParameter EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:800:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1593);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1604); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:807:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Double_0= ruleDouble | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Double_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:810:28: ( (this_Double_0= ruleDouble | this_ID_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:811:1: (this_Double_0= ruleDouble | this_ID_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:811:1: (this_Double_0= ruleDouble | this_ID_1= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:812:5: this_Double_0= ruleDouble
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getDoubleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDouble_in_ruleParameter1651);
                    this_Double_0=ruleDouble();

                    state._fsp--;


                    		current.merge(this_Double_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:823:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1677); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:838:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:839:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:840:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution1722);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution1732); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:847:1: ruleDistribution returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:850:28: ( ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:851:1: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:851:1: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:851:2: ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ']'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:851:2: ( (lv_type_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:852:1: (lv_type_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:852:1: (lv_type_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:853:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDistribution1774); 

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

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleDistribution1791); 

                	newLeafNode(otherlv_1, grammarAccess.getDistributionAccess().getLeftSquareBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:873:1: ( (lv_parameters_2_0= ruleParameter ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:874:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:874:1: (lv_parameters_2_0= ruleParameter )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:875:3: lv_parameters_2_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleDistribution1812);
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
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleDistribution1825); 

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


    // $ANTLR start "entryRuleTaskHierarchy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:903:1: entryRuleTaskHierarchy returns [EObject current=null] : iv_ruleTaskHierarchy= ruleTaskHierarchy EOF ;
    public final EObject entryRuleTaskHierarchy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskHierarchy = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:904:2: (iv_ruleTaskHierarchy= ruleTaskHierarchy EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:905:2: iv_ruleTaskHierarchy= ruleTaskHierarchy EOF
            {
             newCompositeNode(grammarAccess.getTaskHierarchyRule()); 
            pushFollow(FOLLOW_ruleTaskHierarchy_in_entryRuleTaskHierarchy1861);
            iv_ruleTaskHierarchy=ruleTaskHierarchy();

            state._fsp--;

             current =iv_ruleTaskHierarchy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskHierarchy1871); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskHierarchy"


    // $ANTLR start "ruleTaskHierarchy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:912:1: ruleTaskHierarchy returns [EObject current=null] : (otherlv_0= 'TaskHierarchy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleTaskHierarchy() throws RecognitionException {
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:915:28: ( (otherlv_0= 'TaskHierarchy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:916:1: (otherlv_0= 'TaskHierarchy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:916:1: (otherlv_0= 'TaskHierarchy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:916:3: otherlv_0= 'TaskHierarchy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleTaskHierarchy1908); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskHierarchyAccess().getTaskHierarchyKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:920:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:921:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:921:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:922:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskHierarchy1925); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTaskHierarchyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskHierarchyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleTaskHierarchy1942); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskHierarchyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:942:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==66) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:942:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleTaskHierarchy1955); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskHierarchyAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:946:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:947:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:947:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:948:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskHierarchy1972); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getTaskHierarchyAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTaskHierarchyRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:964:4: (otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==67) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:964:6: otherlv_5= 'Types' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,67,FOLLOW_67_in_ruleTaskHierarchy1992); 

                        	newLeafNode(otherlv_5, grammarAccess.getTaskHierarchyAccess().getTypesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleTaskHierarchy2004); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskHierarchyAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:972:1: ( (otherlv_7= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:973:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:973:1: (otherlv_7= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:974:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskHierarchyRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskHierarchy2024); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getTaskHierarchyAccess().getTaskTypesTaskTypeCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,68,FOLLOW_68_in_ruleTaskHierarchy2037); 

                        	newLeafNode(otherlv_8, grammarAccess.getTaskHierarchyAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,68,FOLLOW_68_in_ruleTaskHierarchy2051); 

                	newLeafNode(otherlv_9, grammarAccess.getTaskHierarchyAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskHierarchy"


    // $ANTLR start "entryRuleTaskType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1001:1: entryRuleTaskType returns [EObject current=null] : iv_ruleTaskType= ruleTaskType EOF ;
    public final EObject entryRuleTaskType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1002:2: (iv_ruleTaskType= ruleTaskType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1003:2: iv_ruleTaskType= ruleTaskType EOF
            {
             newCompositeNode(grammarAccess.getTaskTypeRule()); 
            pushFollow(FOLLOW_ruleTaskType_in_entryRuleTaskType2087);
            iv_ruleTaskType=ruleTaskType();

            state._fsp--;

             current =iv_ruleTaskType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskType2097); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1010:1: ruleTaskType returns [EObject current=null] : (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1013:28: ( (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1014:1: (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1014:1: (otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1014:3: otherlv_0= 'TaskType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleTaskType2134); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskTypeAccess().getTaskTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1018:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1019:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1019:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1020:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskType2151); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleTaskType2168); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1040:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==66) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1040:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleTaskType2181); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1044:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1045:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1045:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1046:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskType2198); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleTaskType2217); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1074:1: entryRuleValueFunction returns [EObject current=null] : iv_ruleValueFunction= ruleValueFunction EOF ;
    public final EObject entryRuleValueFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueFunction = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1075:2: (iv_ruleValueFunction= ruleValueFunction EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1076:2: iv_ruleValueFunction= ruleValueFunction EOF
            {
             newCompositeNode(grammarAccess.getValueFunctionRule()); 
            pushFollow(FOLLOW_ruleValueFunction_in_entryRuleValueFunction2253);
            iv_ruleValueFunction=ruleValueFunction();

            state._fsp--;

             current =iv_ruleValueFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueFunction2263); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1083:1: ruleValueFunction returns [EObject current=null] : (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1086:28: ( (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1087:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1087:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1087:3: otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleValueFunction2300); 

                	newLeafNode(otherlv_0, grammarAccess.getValueFunctionAccess().getValueFunctionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1091:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1092:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1092:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1093:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueFunction2317); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleValueFunction2334); 

                	newLeafNode(otherlv_2, grammarAccess.getValueFunctionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1113:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==66) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1113:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleValueFunction2347); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueFunctionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1117:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1118:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1118:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1119:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueFunction2364); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleValueFunction2383); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1147:1: entryRuleProcessModel returns [EObject current=null] : iv_ruleProcessModel= ruleProcessModel EOF ;
    public final EObject entryRuleProcessModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessModel = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1148:2: (iv_ruleProcessModel= ruleProcessModel EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1149:2: iv_ruleProcessModel= ruleProcessModel EOF
            {
             newCompositeNode(grammarAccess.getProcessModelRule()); 
            pushFollow(FOLLOW_ruleProcessModel_in_entryRuleProcessModel2419);
            iv_ruleProcessModel=ruleProcessModel();

            state._fsp--;

             current =iv_ruleProcessModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessModel2429); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1156:1: ruleProcessModel returns [EObject current=null] : (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1159:28: ( (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1160:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1160:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1160:3: otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleProcessModel2466); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessModelAccess().getProcessModelKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1164:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1165:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1165:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessModel2483); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleProcessModel2500); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1186:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==66) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1186:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleProcessModel2513); 

                        	newLeafNode(otherlv_3, grammarAccess.getProcessModelAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1190:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1191:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1191:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1192:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessModel2530); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleProcessModel2549); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1220:1: entryRuleClassOfService returns [EObject current=null] : iv_ruleClassOfService= ruleClassOfService EOF ;
    public final EObject entryRuleClassOfService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOfService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1221:2: (iv_ruleClassOfService= ruleClassOfService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1222:2: iv_ruleClassOfService= ruleClassOfService EOF
            {
             newCompositeNode(grammarAccess.getClassOfServiceRule()); 
            pushFollow(FOLLOW_ruleClassOfService_in_entryRuleClassOfService2585);
            iv_ruleClassOfService=ruleClassOfService();

            state._fsp--;

             current =iv_ruleClassOfService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOfService2595); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1229:1: ruleClassOfService returns [EObject current=null] : (otherlv_0= 'ClassOfService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleClassOfService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1232:28: ( (otherlv_0= 'ClassOfService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1233:1: (otherlv_0= 'ClassOfService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1233:1: (otherlv_0= 'ClassOfService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1233:3: otherlv_0= 'ClassOfService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleClassOfService2632); 

                	newLeafNode(otherlv_0, grammarAccess.getClassOfServiceAccess().getClassOfServiceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1237:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1238:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1238:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1239:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassOfService2649); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassOfServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassOfServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleClassOfService2666); 

                	newLeafNode(otherlv_2, grammarAccess.getClassOfServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1259:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==66) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1259:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleClassOfService2679); 

                        	newLeafNode(otherlv_3, grammarAccess.getClassOfServiceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1263:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1264:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1264:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1265:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassOfService2696); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getClassOfServiceAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleClassOfService2715); 

                	newLeafNode(otherlv_5, grammarAccess.getClassOfServiceAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleWIAcceptanceRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1293:1: entryRuleWIAcceptanceRuleType returns [EObject current=null] : iv_ruleWIAcceptanceRuleType= ruleWIAcceptanceRuleType EOF ;
    public final EObject entryRuleWIAcceptanceRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAcceptanceRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1294:2: (iv_ruleWIAcceptanceRuleType= ruleWIAcceptanceRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1295:2: iv_ruleWIAcceptanceRuleType= ruleWIAcceptanceRuleType EOF
            {
             newCompositeNode(grammarAccess.getWIAcceptanceRuleTypeRule()); 
            pushFollow(FOLLOW_ruleWIAcceptanceRuleType_in_entryRuleWIAcceptanceRuleType2751);
            iv_ruleWIAcceptanceRuleType=ruleWIAcceptanceRuleType();

            state._fsp--;

             current =iv_ruleWIAcceptanceRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptanceRuleType2761); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1302:1: ruleWIAcceptanceRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1305:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1306:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1306:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1306:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleWIAcceptanceRuleType2798); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1310:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1311:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1311:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1312:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptanceRuleType2815); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWIAcceptanceRuleType2832); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1332:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==66) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1332:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleWIAcceptanceRuleType2845); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1336:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1337:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1337:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1338:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptanceRuleType2862); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleWIAcceptanceRuleType2881); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1366:1: entryRuleWISelectionRuleType returns [EObject current=null] : iv_ruleWISelectionRuleType= ruleWISelectionRuleType EOF ;
    public final EObject entryRuleWISelectionRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWISelectionRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1367:2: (iv_ruleWISelectionRuleType= ruleWISelectionRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1368:2: iv_ruleWISelectionRuleType= ruleWISelectionRuleType EOF
            {
             newCompositeNode(grammarAccess.getWISelectionRuleTypeRule()); 
            pushFollow(FOLLOW_ruleWISelectionRuleType_in_entryRuleWISelectionRuleType2917);
            iv_ruleWISelectionRuleType=ruleWISelectionRuleType();

            state._fsp--;

             current =iv_ruleWISelectionRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelectionRuleType2927); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1375:1: ruleWISelectionRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1378:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1379:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1379:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1379:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleWISelectionRuleType2964); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1383:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1384:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1384:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1385:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelectionRuleType2981); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWISelectionRuleType2998); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1405:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==66) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1405:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleWISelectionRuleType3011); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1409:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1410:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1410:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1411:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelectionRuleType3028); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleWISelectionRuleType3047); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1439:1: entryRuleWIAssignmentRuleType returns [EObject current=null] : iv_ruleWIAssignmentRuleType= ruleWIAssignmentRuleType EOF ;
    public final EObject entryRuleWIAssignmentRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAssignmentRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1440:2: (iv_ruleWIAssignmentRuleType= ruleWIAssignmentRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1441:2: iv_ruleWIAssignmentRuleType= ruleWIAssignmentRuleType EOF
            {
             newCompositeNode(grammarAccess.getWIAssignmentRuleTypeRule()); 
            pushFollow(FOLLOW_ruleWIAssignmentRuleType_in_entryRuleWIAssignmentRuleType3083);
            iv_ruleWIAssignmentRuleType=ruleWIAssignmentRuleType();

            state._fsp--;

             current =iv_ruleWIAssignmentRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignmentRuleType3093); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1448:1: ruleWIAssignmentRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1451:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1452:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1452:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1452:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleWIAssignmentRuleType3130); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1456:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1457:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1457:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1458:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignmentRuleType3147); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWIAssignmentRuleType3164); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1478:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==66) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1478:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleWIAssignmentRuleType3177); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1482:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1483:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1483:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1484:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignmentRuleType3194); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleWIAssignmentRuleType3213); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1512:1: entryRuleResourceAllocationRuleType returns [EObject current=null] : iv_ruleResourceAllocationRuleType= ruleResourceAllocationRuleType EOF ;
    public final EObject entryRuleResourceAllocationRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAllocationRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1513:2: (iv_ruleResourceAllocationRuleType= ruleResourceAllocationRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1514:2: iv_ruleResourceAllocationRuleType= ruleResourceAllocationRuleType EOF
            {
             newCompositeNode(grammarAccess.getResourceAllocationRuleTypeRule()); 
            pushFollow(FOLLOW_ruleResourceAllocationRuleType_in_entryRuleResourceAllocationRuleType3249);
            iv_ruleResourceAllocationRuleType=ruleResourceAllocationRuleType();

            state._fsp--;

             current =iv_ruleResourceAllocationRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocationRuleType3259); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1521:1: ruleResourceAllocationRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1524:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1525:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1525:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1525:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleResourceAllocationRuleType3296); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1529:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1530:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1530:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1531:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocationRuleType3313); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleResourceAllocationRuleType3330); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1551:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==66) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1551:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleResourceAllocationRuleType3343); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1555:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1556:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1556:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1557:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocationRuleType3360); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleResourceAllocationRuleType3379); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1585:1: entryRuleResourceOutsourcingRuleType returns [EObject current=null] : iv_ruleResourceOutsourcingRuleType= ruleResourceOutsourcingRuleType EOF ;
    public final EObject entryRuleResourceOutsourcingRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOutsourcingRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1586:2: (iv_ruleResourceOutsourcingRuleType= ruleResourceOutsourcingRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1587:2: iv_ruleResourceOutsourcingRuleType= ruleResourceOutsourcingRuleType EOF
            {
             newCompositeNode(grammarAccess.getResourceOutsourcingRuleTypeRule()); 
            pushFollow(FOLLOW_ruleResourceOutsourcingRuleType_in_entryRuleResourceOutsourcingRuleType3415);
            iv_ruleResourceOutsourcingRuleType=ruleResourceOutsourcingRuleType();

            state._fsp--;

             current =iv_ruleResourceOutsourcingRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcingRuleType3425); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1594:1: ruleResourceOutsourcingRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1597:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1598:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1598:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1598:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleResourceOutsourcingRuleType3462); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1602:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1603:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1603:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1604:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcingRuleType3479); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleResourceOutsourcingRuleType3496); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1624:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==66) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1624:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleResourceOutsourcingRuleType3509); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1628:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1629:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1629:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1630:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcingRuleType3526); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleResourceOutsourcingRuleType3545); 

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


    // $ANTLR start "entryRuleServiceType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1660:1: entryRuleServiceType returns [EObject current=null] : iv_ruleServiceType= ruleServiceType EOF ;
    public final EObject entryRuleServiceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1661:2: (iv_ruleServiceType= ruleServiceType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1662:2: iv_ruleServiceType= ruleServiceType EOF
            {
             newCompositeNode(grammarAccess.getServiceTypeRule()); 
            pushFollow(FOLLOW_ruleServiceType_in_entryRuleServiceType3583);
            iv_ruleServiceType=ruleServiceType();

            state._fsp--;

             current =iv_ruleServiceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceType3593); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1669:1: ruleServiceType returns [EObject current=null] : (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1672:28: ( (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1673:1: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1673:1: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1673:3: otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleServiceType3630); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceTypeAccess().getServiceTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1677:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1678:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1678:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1679:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceType3647); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1695:2: (otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==65) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1695:4: otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleServiceType3665); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceTypeAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1699:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==66) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1699:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleServiceType3678); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceTypeAccess().getDescriptionKeyword_2_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1703:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1704:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1704:1: (lv_description_4_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1705:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceType3695); 

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

                    otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleServiceType3714); 

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


    // $ANTLR start "entryRuleRepository"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1733:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1734:2: (iv_ruleRepository= ruleRepository EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1735:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_ruleRepository_in_entryRuleRepository3752);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepository3762); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1742:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1745:28: ( (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1746:1: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1746:1: (otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1746:3: otherlv_0= 'Repository' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Profiles' otherlv_3= '{' ( (lv_profiles_4_0= ruleWorkItemProfile ) )* otherlv_5= '}' otherlv_6= 'end Repository'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleRepository3799); 

                	newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1750:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1751:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1751:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1752:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRepositoryRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepository3819); 

            		newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getTypeTaskTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_76_in_ruleRepository3831); 

                	newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getProfilesKeyword_2());
                
            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleRepository3843); 

                	newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1771:1: ( (lv_profiles_4_0= ruleWorkItemProfile ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==78) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1772:1: (lv_profiles_4_0= ruleWorkItemProfile )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1772:1: (lv_profiles_4_0= ruleWorkItemProfile )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1773:3: lv_profiles_4_0= ruleWorkItemProfile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRepositoryAccess().getProfilesWorkItemProfileParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItemProfile_in_ruleRepository3864);
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
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleRepository3877); 

                	newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleRepository3889); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1805:1: entryRuleWorkItemProfile returns [EObject current=null] : iv_ruleWorkItemProfile= ruleWorkItemProfile EOF ;
    public final EObject entryRuleWorkItemProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemProfile = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1806:2: (iv_ruleWorkItemProfile= ruleWorkItemProfile EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1807:2: iv_ruleWorkItemProfile= ruleWorkItemProfile EOF
            {
             newCompositeNode(grammarAccess.getWorkItemProfileRule()); 
            pushFollow(FOLLOW_ruleWorkItemProfile_in_entryRuleWorkItemProfile3925);
            iv_ruleWorkItemProfile=ruleWorkItemProfile();

            state._fsp--;

             current =iv_ruleWorkItemProfile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemProfile3935); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1814:1: ruleWorkItemProfile returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (otherlv_22= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}' ) ;
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
        Token otherlv_22=null;
        Token lv_allowAssignment_23_0=null;
        Token lv_allowDiscard_24_0=null;
        Token otherlv_25=null;
        EObject lv_references_9_0 = null;

        EObject lv_decompositions_13_0 = null;

        EObject lv_efforts_18_0 = null;

        EObject lv_value_20_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1817:28: ( (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (otherlv_22= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1818:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (otherlv_22= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1818:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (otherlv_22= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1818:3: otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )? (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )? (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )? (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )? (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )? (otherlv_21= 'ClassOfService' ( (otherlv_22= RULE_ID ) ) )? ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )? ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleWorkItemProfile3972); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemProfileAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1822:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1823:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1823:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1824:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile3989); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWorkItemProfile4006); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1844:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==66) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1844:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleWorkItemProfile4019); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemProfileAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1848:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1849:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1849:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1850:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemProfile4036); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1866:4: (otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==71) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1866:6: otherlv_5= 'ProcessModel' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleWorkItemProfile4056); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemProfileAccess().getProcessModelKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1870:1: ( (otherlv_6= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1871:1: (otherlv_6= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1871:1: (otherlv_6= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1872:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile4076); 

                    		newLeafNode(otherlv_6, grammarAccess.getWorkItemProfileAccess().getProcessModelProcessModelCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1883:4: (otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==79) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1883:6: otherlv_7= 'References' otherlv_8= '{' ( (lv_references_9_0= ruleWorkReference ) )+ otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,79,FOLLOW_79_in_ruleWorkItemProfile4091); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkItemProfileAccess().getReferencesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,65,FOLLOW_65_in_ruleWorkItemProfile4103); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1891:1: ( (lv_references_9_0= ruleWorkReference ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==78) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1892:1: (lv_references_9_0= ruleWorkReference )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1892:1: (lv_references_9_0= ruleWorkReference )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1893:3: lv_references_9_0= ruleWorkReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getReferencesWorkReferenceParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkReference_in_ruleWorkItemProfile4124);
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
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                    otherlv_10=(Token)match(input,68,FOLLOW_68_in_ruleWorkItemProfile4137); 

                        	newLeafNode(otherlv_10, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1913:3: (otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==80) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1913:5: otherlv_11= 'Decompositions' otherlv_12= '{' ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+ otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,80,FOLLOW_80_in_ruleWorkItemProfile4152); 

                        	newLeafNode(otherlv_11, grammarAccess.getWorkItemProfileAccess().getDecompositionsKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,65,FOLLOW_65_in_ruleWorkItemProfile4164); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemProfileAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1921:1: ( (lv_decompositions_13_0= ruleWorkDecomposition ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==78) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1922:1: (lv_decompositions_13_0= ruleWorkDecomposition )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1922:1: (lv_decompositions_13_0= ruleWorkDecomposition )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1923:3: lv_decompositions_13_0= ruleWorkDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getDecompositionsWorkDecompositionParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkDecomposition_in_ruleWorkItemProfile4185);
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
                    	    if ( cnt43 >= 1 ) break loop43;
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);

                    otherlv_14=(Token)match(input,68,FOLLOW_68_in_ruleWorkItemProfile4198); 

                        	newLeafNode(otherlv_14, grammarAccess.getWorkItemProfileAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1943:3: (otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+ )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==81) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1943:5: otherlv_15= 'RequiredServices' ( (otherlv_16= RULE_ID ) )+
                    {
                    otherlv_15=(Token)match(input,81,FOLLOW_81_in_ruleWorkItemProfile4213); 

                        	newLeafNode(otherlv_15, grammarAccess.getWorkItemProfileAccess().getRequiredServicesKeyword_7_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1947:1: ( (otherlv_16= RULE_ID ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1948:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1948:1: (otherlv_16= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1949:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile4233); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getWorkItemProfileAccess().getRequiredServicesServiceTypeCrossReference_7_1_0()); 
                    	    	

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


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1960:5: (otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==82) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1960:7: otherlv_17= 'Efforts' ( (lv_efforts_18_0= ruleNumExpression ) )
                    {
                    otherlv_17=(Token)match(input,82,FOLLOW_82_in_ruleWorkItemProfile4249); 

                        	newLeafNode(otherlv_17, grammarAccess.getWorkItemProfileAccess().getEffortsKeyword_8_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1964:1: ( (lv_efforts_18_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1965:1: (lv_efforts_18_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1965:1: (lv_efforts_18_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1966:3: lv_efforts_18_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getEffortsNumExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItemProfile4270);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1982:4: (otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==83) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1982:6: otherlv_19= 'Value' ( (lv_value_20_0= ruleNumExpression ) )
                    {
                    otherlv_19=(Token)match(input,83,FOLLOW_83_in_ruleWorkItemProfile4285); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemProfileAccess().getValueKeyword_9_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1986:1: ( (lv_value_20_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1987:1: (lv_value_20_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1987:1: (lv_value_20_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1988:3: lv_value_20_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemProfileAccess().getValueNumExpressionParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItemProfile4306);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2004:4: (otherlv_21= 'ClassOfService' ( (otherlv_22= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==72) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2004:6: otherlv_21= 'ClassOfService' ( (otherlv_22= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,72,FOLLOW_72_in_ruleWorkItemProfile4321); 

                        	newLeafNode(otherlv_21, grammarAccess.getWorkItemProfileAccess().getClassOfServiceKeyword_10_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2008:1: ( (otherlv_22= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2009:1: (otherlv_22= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2009:1: (otherlv_22= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2010:3: otherlv_22= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                            
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemProfile4341); 

                    		newLeafNode(otherlv_22, grammarAccess.getWorkItemProfileAccess().getClassOfServiceClassOfServiceCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2021:4: ( (lv_allowAssignment_23_0= 'AssignmentAllowed' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==84) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2022:1: (lv_allowAssignment_23_0= 'AssignmentAllowed' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2022:1: (lv_allowAssignment_23_0= 'AssignmentAllowed' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2023:3: lv_allowAssignment_23_0= 'AssignmentAllowed'
                    {
                    lv_allowAssignment_23_0=(Token)match(input,84,FOLLOW_84_in_ruleWorkItemProfile4361); 

                            newLeafNode(lv_allowAssignment_23_0, grammarAccess.getWorkItemProfileAccess().getAllowAssignmentAssignmentAllowedKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		setWithLastConsumed(current, "allowAssignment", true, "AssignmentAllowed");
                    	    

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2036:3: ( (lv_allowDiscard_24_0= 'DiscardAllowed' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==85) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2037:1: (lv_allowDiscard_24_0= 'DiscardAllowed' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2037:1: (lv_allowDiscard_24_0= 'DiscardAllowed' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2038:3: lv_allowDiscard_24_0= 'DiscardAllowed'
                    {
                    lv_allowDiscard_24_0=(Token)match(input,85,FOLLOW_85_in_ruleWorkItemProfile4393); 

                            newLeafNode(lv_allowDiscard_24_0, grammarAccess.getWorkItemProfileAccess().getAllowDiscardDiscardAllowedKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemProfileRule());
                    	        }
                           		setWithLastConsumed(current, "allowDiscard", true, "DiscardAllowed");
                    	    

                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,68,FOLLOW_68_in_ruleWorkItemProfile4419); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2063:1: entryRuleWorkReference returns [EObject current=null] : iv_ruleWorkReference= ruleWorkReference EOF ;
    public final EObject entryRuleWorkReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkReference = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2064:2: (iv_ruleWorkReference= ruleWorkReference EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2065:2: iv_ruleWorkReference= ruleWorkReference EOF
            {
             newCompositeNode(grammarAccess.getWorkReferenceRule()); 
            pushFollow(FOLLOW_ruleWorkReference_in_entryRuleWorkReference4455);
            iv_ruleWorkReference=ruleWorkReference();

            state._fsp--;

             current =iv_ruleWorkReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkReference4465); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2072:1: ruleWorkReference returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleWorkReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_quantity_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2075:28: ( (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2076:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2076:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2076:3: otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleWorkReference4502); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkReferenceAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2080:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2081:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2081:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2082:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkReference4522); 

            		newLeafNode(otherlv_1, grammarAccess.getWorkReferenceAccess().getWorkItemWorkItemProfileCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleWorkReference4534); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkReferenceAccess().getQuantityKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2097:1: ( (lv_quantity_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2098:1: (lv_quantity_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2098:1: (lv_quantity_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2099:3: lv_quantity_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getWorkReferenceAccess().getQuantityNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkReference4555);
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2123:1: entryRuleWorkDecomposition returns [EObject current=null] : iv_ruleWorkDecomposition= ruleWorkDecomposition EOF ;
    public final EObject entryRuleWorkDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDecomposition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2124:2: (iv_ruleWorkDecomposition= ruleWorkDecomposition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2125:2: iv_ruleWorkDecomposition= ruleWorkDecomposition EOF
            {
             newCompositeNode(grammarAccess.getWorkDecompositionRule()); 
            pushFollow(FOLLOW_ruleWorkDecomposition_in_entryRuleWorkDecomposition4591);
            iv_ruleWorkDecomposition=ruleWorkDecomposition();

            state._fsp--;

             current =iv_ruleWorkDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkDecomposition4601); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2132:1: ruleWorkDecomposition returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleWorkDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_quantity_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2135:28: ( (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2136:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2136:1: (otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2136:3: otherlv_0= 'WorkItem' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Quantity' ( (lv_quantity_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleWorkDecomposition4638); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkDecompositionAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2140:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2141:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2141:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2142:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkDecompositionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkDecomposition4658); 

            		newLeafNode(otherlv_1, grammarAccess.getWorkDecompositionAccess().getWorkItemWorkItemProfileCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleWorkDecomposition4670); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkDecompositionAccess().getQuantityKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2157:1: ( (lv_quantity_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2158:1: (lv_quantity_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2158:1: (lv_quantity_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2159:3: lv_quantity_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getWorkDecompositionAccess().getQuantityNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkDecomposition4691);
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


    // $ANTLR start "entryRuleGovernanceStrategy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2187:1: entryRuleGovernanceStrategy returns [EObject current=null] : iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF ;
    public final EObject entryRuleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceStrategy = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2188:2: (iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2189:2: iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF
            {
             newCompositeNode(grammarAccess.getGovernanceStrategyRule()); 
            pushFollow(FOLLOW_ruleGovernanceStrategy_in_entryRuleGovernanceStrategy4731);
            iv_ruleGovernanceStrategy=ruleGovernanceStrategy();

            state._fsp--;

             current =iv_ruleGovernanceStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGovernanceStrategy4741); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2196:1: ruleGovernanceStrategy returns [EObject current=null] : (otherlv_0= 'GovernanceStrategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' ) ;
    public final EObject ruleGovernanceStrategy() throws RecognitionException {
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2199:28: ( (otherlv_0= 'GovernanceStrategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2200:1: (otherlv_0= 'GovernanceStrategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2200:1: (otherlv_0= 'GovernanceStrategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2200:3: otherlv_0= 'GovernanceStrategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_6_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleGovernanceStrategy4778); 

                	newLeafNode(otherlv_0, grammarAccess.getGovernanceStrategyAccess().getGovernanceStrategyKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2204:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2205:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2205:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2206:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGovernanceStrategy4795); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGovernanceStrategyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleGovernanceStrategy4812); 

                	newLeafNode(otherlv_2, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2226:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==66) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2226:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleGovernanceStrategy4825); 

                        	newLeafNode(otherlv_3, grammarAccess.getGovernanceStrategyAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2230:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2231:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2231:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2232:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGovernanceStrategy4842); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2248:4: ( (lv_WIAcceptanceRule_5_0= ruleWIAcceptance ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2249:1: (lv_WIAcceptanceRule_5_0= ruleWIAcceptance )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2249:1: (lv_WIAcceptanceRule_5_0= ruleWIAcceptance )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2250:3: lv_WIAcceptanceRule_5_0= ruleWIAcceptance
            {
             
            	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getWIAcceptanceRuleWIAcceptanceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleWIAcceptance_in_ruleGovernanceStrategy4870);
            lv_WIAcceptanceRule_5_0=ruleWIAcceptance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"WIAcceptanceRule",
                    		lv_WIAcceptanceRule_5_0, 
                    		"WIAcceptance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2266:2: ( (lv_WISelectionRule_6_0= ruleWISelection ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2267:1: (lv_WISelectionRule_6_0= ruleWISelection )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2267:1: (lv_WISelectionRule_6_0= ruleWISelection )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2268:3: lv_WISelectionRule_6_0= ruleWISelection
            {
             
            	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getWISelectionRuleWISelectionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleWISelection_in_ruleGovernanceStrategy4891);
            lv_WISelectionRule_6_0=ruleWISelection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"WISelectionRule",
                    		lv_WISelectionRule_6_0, 
                    		"WISelection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2284:2: ( (lv_WIAssignmentRule_7_0= ruleWIAssignment ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2285:1: (lv_WIAssignmentRule_7_0= ruleWIAssignment )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2285:1: (lv_WIAssignmentRule_7_0= ruleWIAssignment )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2286:3: lv_WIAssignmentRule_7_0= ruleWIAssignment
            {
             
            	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getWIAssignmentRuleWIAssignmentParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleWIAssignment_in_ruleGovernanceStrategy4912);
            lv_WIAssignmentRule_7_0=ruleWIAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"WIAssignmentRule",
                    		lv_WIAssignmentRule_7_0, 
                    		"WIAssignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2302:2: ( (lv_ResourceAllocationRule_8_0= ruleResourceAllocation ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2303:1: (lv_ResourceAllocationRule_8_0= ruleResourceAllocation )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2303:1: (lv_ResourceAllocationRule_8_0= ruleResourceAllocation )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2304:3: lv_ResourceAllocationRule_8_0= ruleResourceAllocation
            {
             
            	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getResourceAllocationRuleResourceAllocationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceAllocation_in_ruleGovernanceStrategy4933);
            lv_ResourceAllocationRule_8_0=ruleResourceAllocation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"ResourceAllocationRule",
                    		lv_ResourceAllocationRule_8_0, 
                    		"ResourceAllocation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2320:2: ( (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2321:1: (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2321:1: (lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2322:3: lv_ResourceOutsourcingRule_9_0= ruleResourceOutsourcing
            {
             
            	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getResourceOutsourcingRuleResourceOutsourcingParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleGovernanceStrategy4954);
            lv_ResourceOutsourcingRule_9_0=ruleResourceOutsourcing();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"ResourceOutsourcingRule",
                    		lv_ResourceOutsourcingRule_9_0, 
                    		"ResourceOutsourcing");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,68,FOLLOW_68_in_ruleGovernanceStrategy4966); 

                	newLeafNode(otherlv_10, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2350:1: entryRuleWIAcceptance returns [EObject current=null] : iv_ruleWIAcceptance= ruleWIAcceptance EOF ;
    public final EObject entryRuleWIAcceptance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAcceptance = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2351:2: (iv_ruleWIAcceptance= ruleWIAcceptance EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2352:2: iv_ruleWIAcceptance= ruleWIAcceptance EOF
            {
             newCompositeNode(grammarAccess.getWIAcceptanceRule()); 
            pushFollow(FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance5002);
            iv_ruleWIAcceptance=ruleWIAcceptance();

            state._fsp--;

             current =iv_ruleWIAcceptance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptance5012); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2359:1: ruleWIAcceptance returns [EObject current=null] : (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2362:28: ( (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2363:1: (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2363:1: (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2363:3: otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleWIAcceptance5049); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceAccess().getWIAcceptanceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2367:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2368:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2368:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2369:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAcceptanceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptance5069); 

            		newLeafNode(otherlv_1, grammarAccess.getWIAcceptanceAccess().getTypeWIAcceptanceRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWIAcceptance5081); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2384:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==66) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2384:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleWIAcceptance5094); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2388:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2389:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2389:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2390:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptance5111); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2406:4: (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==89) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2406:6: otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,89,FOLLOW_89_in_ruleWIAcceptance5131); 

                        	newLeafNode(otherlv_5, grammarAccess.getWIAcceptanceAccess().getBackLogLimitKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2410:1: ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2411:1: (lv_backlogQLimit_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2411:1: (lv_backlogQLimit_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2412:3: lv_backlogQLimit_6_0= RULE_INT
                    {
                    lv_backlogQLimit_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance5148); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2428:4: (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==90) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2428:6: otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,90,FOLLOW_90_in_ruleWIAcceptance5168); 

                        	newLeafNode(otherlv_7, grammarAccess.getWIAcceptanceAccess().getWIPLimitKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2432:1: ( (lv_readyQLimit_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2433:1: (lv_readyQLimit_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2433:1: (lv_readyQLimit_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2434:3: lv_readyQLimit_8_0= RULE_INT
                    {
                    lv_readyQLimit_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance5185); 

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

            otherlv_9=(Token)match(input,68,FOLLOW_68_in_ruleWIAcceptance5204); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2462:1: entryRuleWISelection returns [EObject current=null] : iv_ruleWISelection= ruleWISelection EOF ;
    public final EObject entryRuleWISelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWISelection = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2463:2: (iv_ruleWISelection= ruleWISelection EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2464:2: iv_ruleWISelection= ruleWISelection EOF
            {
             newCompositeNode(grammarAccess.getWISelectionRule()); 
            pushFollow(FOLLOW_ruleWISelection_in_entryRuleWISelection5240);
            iv_ruleWISelection=ruleWISelection();

            state._fsp--;

             current =iv_ruleWISelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelection5250); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2471:1: ruleWISelection returns [EObject current=null] : (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2474:28: ( (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2475:1: (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2475:1: (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2475:3: otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleWISelection5287); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionAccess().getWISelectionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2479:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2480:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2480:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2481:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWISelectionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelection5307); 

            		newLeafNode(otherlv_1, grammarAccess.getWISelectionAccess().getTypeWISelectionRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWISelection5319); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2496:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==66) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2496:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleWISelection5332); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2500:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2501:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2501:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2502:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelection5349); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleWISelection5368); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2530:1: entryRuleWIAssignment returns [EObject current=null] : iv_ruleWIAssignment= ruleWIAssignment EOF ;
    public final EObject entryRuleWIAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAssignment = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2531:2: (iv_ruleWIAssignment= ruleWIAssignment EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2532:2: iv_ruleWIAssignment= ruleWIAssignment EOF
            {
             newCompositeNode(grammarAccess.getWIAssignmentRule()); 
            pushFollow(FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment5404);
            iv_ruleWIAssignment=ruleWIAssignment();

            state._fsp--;

             current =iv_ruleWIAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignment5414); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2539:1: ruleWIAssignment returns [EObject current=null] : (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2542:28: ( (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2543:1: (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2543:1: (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2543:3: otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_92_in_ruleWIAssignment5451); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentAccess().getWIAssignmentKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2547:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2548:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2548:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2549:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAssignmentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignment5471); 

            		newLeafNode(otherlv_1, grammarAccess.getWIAssignmentAccess().getTypeWIAssignmentRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWIAssignment5483); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2564:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==66) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2564:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleWIAssignment5496); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2568:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2569:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2569:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2570:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignment5513); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleWIAssignment5532); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2598:1: entryRuleResourceAllocation returns [EObject current=null] : iv_ruleResourceAllocation= ruleResourceAllocation EOF ;
    public final EObject entryRuleResourceAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAllocation = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2599:2: (iv_ruleResourceAllocation= ruleResourceAllocation EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2600:2: iv_ruleResourceAllocation= ruleResourceAllocation EOF
            {
             newCompositeNode(grammarAccess.getResourceAllocationRule()); 
            pushFollow(FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation5568);
            iv_ruleResourceAllocation=ruleResourceAllocation();

            state._fsp--;

             current =iv_ruleResourceAllocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocation5578); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2607:1: ruleResourceAllocation returns [EObject current=null] : (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2610:28: ( (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2611:1: (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2611:1: (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2611:3: otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleResourceAllocation5615); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationAccess().getResourceAllocationKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2615:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2616:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2616:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2617:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceAllocationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocation5635); 

            		newLeafNode(otherlv_1, grammarAccess.getResourceAllocationAccess().getTypeResourceAllocationRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleResourceAllocation5647); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2632:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==66) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2632:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleResourceAllocation5660); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2636:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2637:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2637:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2638:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocation5677); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleResourceAllocation5696); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2666:1: entryRuleResourceOutsourcing returns [EObject current=null] : iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF ;
    public final EObject entryRuleResourceOutsourcing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOutsourcing = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2667:2: (iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2668:2: iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF
            {
             newCompositeNode(grammarAccess.getResourceOutsourcingRule()); 
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing5732);
            iv_ruleResourceOutsourcing=ruleResourceOutsourcing();

            state._fsp--;

             current =iv_ruleResourceOutsourcing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcing5742); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2675:1: ruleResourceOutsourcing returns [EObject current=null] : (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2678:28: ( (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2679:1: (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2679:1: (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2679:3: otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleResourceOutsourcing5779); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingAccess().getResourceOutsourcingKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2683:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2684:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2684:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2685:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceOutsourcingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcing5799); 

            		newLeafNode(otherlv_1, grammarAccess.getResourceOutsourcingAccess().getTypeResourceOutsourcingRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleResourceOutsourcing5811); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2700:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==66) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2700:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleResourceOutsourcing5824); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2704:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2705:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2705:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2706:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcing5841); 

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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleResourceOutsourcing5860); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2734:1: entryRuleWorkSource returns [EObject current=null] : iv_ruleWorkSource= ruleWorkSource EOF ;
    public final EObject entryRuleWorkSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSource = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2735:2: (iv_ruleWorkSource= ruleWorkSource EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2736:2: iv_ruleWorkSource= ruleWorkSource EOF
            {
             newCompositeNode(grammarAccess.getWorkSourceRule()); 
            pushFollow(FOLLOW_ruleWorkSource_in_entryRuleWorkSource5896);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSource5906); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2743:1: ruleWorkSource returns [EObject current=null] : (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2746:28: ( (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2747:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2747:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2747:3: otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? ( (lv_assignmentRule_9_0= ruleWIAssignment ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleWorkSource5943); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2751:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2752:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2752:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2753:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource5960); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWorkSource5977); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2773:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==66) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2773:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleWorkSource5990); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2777:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2778:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2778:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2779:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkSource6007); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2795:4: (otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==96) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2795:6: otherlv_5= 'TargetUnits' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,96,FOLLOW_96_in_ruleWorkSource6027); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkSourceAccess().getTargetUnitsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleWorkSource6039); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2803:1: ( (otherlv_7= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2804:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2804:1: (otherlv_7= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2805:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource6059); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getTargetUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,68,FOLLOW_68_in_ruleWorkSource6072); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2820:3: ( (lv_assignmentRule_9_0= ruleWIAssignment ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==92) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2821:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2821:1: (lv_assignmentRule_9_0= ruleWIAssignment )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2822:3: lv_assignmentRule_9_0= ruleWIAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkSourceAccess().getAssignmentRuleWIAssignmentParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleWorkSource6095);
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

            otherlv_10=(Token)match(input,68,FOLLOW_68_in_ruleWorkSource6108); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2850:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2851:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2852:2: iv_ruleWorkItem= ruleWorkItem EOF
            {
             newCompositeNode(grammarAccess.getWorkItemRule()); 
            pushFollow(FOLLOW_ruleWorkItem_in_entryRuleWorkItem6144);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItem6154); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2859:1: ruleWorkItem returns [EObject current=null] : (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'Subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'CausalTriggers' ( (lv_causalTriggers_18_0= ruleCausalTrigger ) )* )? (otherlv_19= 'RequiredServices' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'Efforts' ( (lv_efforts_22_0= RULE_INT ) ) )? (otherlv_23= 'Value' ( (lv_value_24_0= RULE_INT ) ) )? (otherlv_25= 'ClassOfService' ( (otherlv_26= RULE_ID ) ) )? (otherlv_27= 'WorkSource' ( (otherlv_28= RULE_ID ) ) )? (otherlv_29= 'ArrivalTime' ( (lv_arrivalTime_30_0= RULE_INT ) ) )? (otherlv_31= 'DueDate' ( (lv_dueDate_32_0= RULE_INT ) ) )? otherlv_33= '}' ) ;
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
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_efforts_22_0=null;
        Token otherlv_23=null;
        Token lv_value_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_arrivalTime_30_0=null;
        Token otherlv_31=null;
        Token lv_dueDate_32_0=null;
        Token otherlv_33=null;
        EObject lv_causalTriggers_18_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2862:28: ( (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'Subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'CausalTriggers' ( (lv_causalTriggers_18_0= ruleCausalTrigger ) )* )? (otherlv_19= 'RequiredServices' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'Efforts' ( (lv_efforts_22_0= RULE_INT ) ) )? (otherlv_23= 'Value' ( (lv_value_24_0= RULE_INT ) ) )? (otherlv_25= 'ClassOfService' ( (otherlv_26= RULE_ID ) ) )? (otherlv_27= 'WorkSource' ( (otherlv_28= RULE_ID ) ) )? (otherlv_29= 'ArrivalTime' ( (lv_arrivalTime_30_0= RULE_INT ) ) )? (otherlv_31= 'DueDate' ( (lv_dueDate_32_0= RULE_INT ) ) )? otherlv_33= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2863:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'Subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'CausalTriggers' ( (lv_causalTriggers_18_0= ruleCausalTrigger ) )* )? (otherlv_19= 'RequiredServices' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'Efforts' ( (lv_efforts_22_0= RULE_INT ) ) )? (otherlv_23= 'Value' ( (lv_value_24_0= RULE_INT ) ) )? (otherlv_25= 'ClassOfService' ( (otherlv_26= RULE_ID ) ) )? (otherlv_27= 'WorkSource' ( (otherlv_28= RULE_ID ) ) )? (otherlv_29= 'ArrivalTime' ( (lv_arrivalTime_30_0= RULE_INT ) ) )? (otherlv_31= 'DueDate' ( (lv_dueDate_32_0= RULE_INT ) ) )? otherlv_33= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2863:1: (otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'Subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'CausalTriggers' ( (lv_causalTriggers_18_0= ruleCausalTrigger ) )* )? (otherlv_19= 'RequiredServices' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'Efforts' ( (lv_efforts_22_0= RULE_INT ) ) )? (otherlv_23= 'Value' ( (lv_value_24_0= RULE_INT ) ) )? (otherlv_25= 'ClassOfService' ( (otherlv_26= RULE_ID ) ) )? (otherlv_27= 'WorkSource' ( (otherlv_28= RULE_ID ) ) )? (otherlv_29= 'ArrivalTime' ( (lv_arrivalTime_30_0= RULE_INT ) ) )? (otherlv_31= 'DueDate' ( (lv_dueDate_32_0= RULE_INT ) ) )? otherlv_33= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2863:3: otherlv_0= 'WorkItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'Predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )? (otherlv_13= 'Subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )? (otherlv_17= 'CausalTriggers' ( (lv_causalTriggers_18_0= ruleCausalTrigger ) )* )? (otherlv_19= 'RequiredServices' ( (otherlv_20= RULE_ID ) )+ )? (otherlv_21= 'Efforts' ( (lv_efforts_22_0= RULE_INT ) ) )? (otherlv_23= 'Value' ( (lv_value_24_0= RULE_INT ) ) )? (otherlv_25= 'ClassOfService' ( (otherlv_26= RULE_ID ) ) )? (otherlv_27= 'WorkSource' ( (otherlv_28= RULE_ID ) ) )? (otherlv_29= 'ArrivalTime' ( (lv_arrivalTime_30_0= RULE_INT ) ) )? (otherlv_31= 'DueDate' ( (lv_dueDate_32_0= RULE_INT ) ) )? otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem6191); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemAccess().getWorkItemKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2867:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2868:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2868:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2869:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6208); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWorkItem6225); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2889:1: (otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==97) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2889:3: otherlv_3= 'Profile' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,97,FOLLOW_97_in_ruleWorkItem6238); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getProfileKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2893:1: ( (otherlv_4= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2894:1: (otherlv_4= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2894:1: (otherlv_4= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2895:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6258); 

                    		newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getProfileWorkItemProfileCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2906:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==66) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2906:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleWorkItem6273); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2910:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2911:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2911:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2912:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItem6290); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2928:4: (otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==98) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2928:6: otherlv_7= 'Type' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,98,FOLLOW_98_in_ruleWorkItem6310); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkItemAccess().getTypeKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2932:1: ( (otherlv_8= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2933:1: (otherlv_8= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2933:1: (otherlv_8= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2934:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6330); 

                    		newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getTypeTaskTypeCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2945:4: (otherlv_9= 'Predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==99) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2945:6: otherlv_9= 'Predecessors' otherlv_10= '{' ( (otherlv_11= RULE_ID ) )+ otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,99,FOLLOW_99_in_ruleWorkItem6345); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getPredecessorsKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,65,FOLLOW_65_in_ruleWorkItem6357); 

                        	newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2953:1: ( (otherlv_11= RULE_ID ) )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_ID) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2954:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2954:1: (otherlv_11= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2955:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6377); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_6_2_0()); 
                    	    	

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

                    otherlv_12=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem6390); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2970:3: (otherlv_13= 'Subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==100) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2970:5: otherlv_13= 'Subtasks' otherlv_14= '{' ( (otherlv_15= RULE_ID ) )+ otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,100,FOLLOW_100_in_ruleWorkItem6405); 

                        	newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getSubtasksKeyword_7_0());
                        
                    otherlv_14=(Token)match(input,65,FOLLOW_65_in_ruleWorkItem6417); 

                        	newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2978:1: ( (otherlv_15= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2979:1: (otherlv_15= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2979:1: (otherlv_15= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2980:3: otherlv_15= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6437); 

                    	    		newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_7_2_0()); 
                    	    	

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

                    otherlv_16=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem6450); 

                        	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2995:3: (otherlv_17= 'CausalTriggers' ( (lv_causalTriggers_18_0= ruleCausalTrigger ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==101) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2995:5: otherlv_17= 'CausalTriggers' ( (lv_causalTriggers_18_0= ruleCausalTrigger ) )*
                    {
                    otherlv_17=(Token)match(input,101,FOLLOW_101_in_ruleWorkItem6465); 

                        	newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getCausalTriggersKeyword_8_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2999:1: ( (lv_causalTriggers_18_0= ruleCausalTrigger ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( ((LA71_0>=104 && LA71_0<=105)) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3000:1: (lv_causalTriggers_18_0= ruleCausalTrigger )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3000:1: (lv_causalTriggers_18_0= ruleCausalTrigger )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3001:3: lv_causalTriggers_18_0= ruleCausalTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getCausalTriggersCausalTriggerParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausalTrigger_in_ruleWorkItem6486);
                    	    lv_causalTriggers_18_0=ruleCausalTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"causalTriggers",
                    	            		lv_causalTriggers_18_0, 
                    	            		"CausalTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3017:5: (otherlv_19= 'RequiredServices' ( (otherlv_20= RULE_ID ) )+ )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==81) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3017:7: otherlv_19= 'RequiredServices' ( (otherlv_20= RULE_ID ) )+
                    {
                    otherlv_19=(Token)match(input,81,FOLLOW_81_in_ruleWorkItem6502); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getRequiredServicesKeyword_9_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3021:1: ( (otherlv_20= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3022:1: (otherlv_20= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3022:1: (otherlv_20= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3023:3: otherlv_20= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6522); 

                    	    		newLeafNode(otherlv_20, grammarAccess.getWorkItemAccess().getRequiredServicesServiceTypeCrossReference_9_1_0()); 
                    	    	

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


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3034:5: (otherlv_21= 'Efforts' ( (lv_efforts_22_0= RULE_INT ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==82) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3034:7: otherlv_21= 'Efforts' ( (lv_efforts_22_0= RULE_INT ) )
                    {
                    otherlv_21=(Token)match(input,82,FOLLOW_82_in_ruleWorkItem6538); 

                        	newLeafNode(otherlv_21, grammarAccess.getWorkItemAccess().getEffortsKeyword_10_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3038:1: ( (lv_efforts_22_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3039:1: (lv_efforts_22_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3039:1: (lv_efforts_22_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3040:3: lv_efforts_22_0= RULE_INT
                    {
                    lv_efforts_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem6555); 

                    			newLeafNode(lv_efforts_22_0, grammarAccess.getWorkItemAccess().getEffortsINTTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"efforts",
                            		lv_efforts_22_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3056:4: (otherlv_23= 'Value' ( (lv_value_24_0= RULE_INT ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==83) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3056:6: otherlv_23= 'Value' ( (lv_value_24_0= RULE_INT ) )
                    {
                    otherlv_23=(Token)match(input,83,FOLLOW_83_in_ruleWorkItem6575); 

                        	newLeafNode(otherlv_23, grammarAccess.getWorkItemAccess().getValueKeyword_11_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3060:1: ( (lv_value_24_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3061:1: (lv_value_24_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3061:1: (lv_value_24_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3062:3: lv_value_24_0= RULE_INT
                    {
                    lv_value_24_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem6592); 

                    			newLeafNode(lv_value_24_0, grammarAccess.getWorkItemAccess().getValueINTTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_24_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3078:4: (otherlv_25= 'ClassOfService' ( (otherlv_26= RULE_ID ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==72) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3078:6: otherlv_25= 'ClassOfService' ( (otherlv_26= RULE_ID ) )
                    {
                    otherlv_25=(Token)match(input,72,FOLLOW_72_in_ruleWorkItem6612); 

                        	newLeafNode(otherlv_25, grammarAccess.getWorkItemAccess().getClassOfServiceKeyword_12_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3082:1: ( (otherlv_26= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3083:1: (otherlv_26= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3083:1: (otherlv_26= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3084:3: otherlv_26= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6632); 

                    		newLeafNode(otherlv_26, grammarAccess.getWorkItemAccess().getClassOfServiceClassOfServiceCrossReference_12_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3095:4: (otherlv_27= 'WorkSource' ( (otherlv_28= RULE_ID ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==95) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3095:6: otherlv_27= 'WorkSource' ( (otherlv_28= RULE_ID ) )
                    {
                    otherlv_27=(Token)match(input,95,FOLLOW_95_in_ruleWorkItem6647); 

                        	newLeafNode(otherlv_27, grammarAccess.getWorkItemAccess().getWorkSourceKeyword_13_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3099:1: ( (otherlv_28= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3100:1: (otherlv_28= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3100:1: (otherlv_28= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3101:3: otherlv_28= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6667); 

                    		newLeafNode(otherlv_28, grammarAccess.getWorkItemAccess().getWorkSourceWorkSourceCrossReference_13_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3112:4: (otherlv_29= 'ArrivalTime' ( (lv_arrivalTime_30_0= RULE_INT ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==102) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3112:6: otherlv_29= 'ArrivalTime' ( (lv_arrivalTime_30_0= RULE_INT ) )
                    {
                    otherlv_29=(Token)match(input,102,FOLLOW_102_in_ruleWorkItem6682); 

                        	newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getArrivalTimeKeyword_14_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3116:1: ( (lv_arrivalTime_30_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3117:1: (lv_arrivalTime_30_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3117:1: (lv_arrivalTime_30_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3118:3: lv_arrivalTime_30_0= RULE_INT
                    {
                    lv_arrivalTime_30_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem6699); 

                    			newLeafNode(lv_arrivalTime_30_0, grammarAccess.getWorkItemAccess().getArrivalTimeINTTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arrivalTime",
                            		lv_arrivalTime_30_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3134:4: (otherlv_31= 'DueDate' ( (lv_dueDate_32_0= RULE_INT ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==103) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3134:6: otherlv_31= 'DueDate' ( (lv_dueDate_32_0= RULE_INT ) )
                    {
                    otherlv_31=(Token)match(input,103,FOLLOW_103_in_ruleWorkItem6719); 

                        	newLeafNode(otherlv_31, grammarAccess.getWorkItemAccess().getDueDateKeyword_15_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3138:1: ( (lv_dueDate_32_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3139:1: (lv_dueDate_32_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3139:1: (lv_dueDate_32_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3140:3: lv_dueDate_32_0= RULE_INT
                    {
                    lv_dueDate_32_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem6736); 

                    			newLeafNode(lv_dueDate_32_0, grammarAccess.getWorkItemAccess().getDueDateINTTerminalRuleCall_15_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dueDate",
                            		lv_dueDate_32_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_33=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem6755); 

                	newLeafNode(otherlv_33, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_16());
                

            }


            }

             leaveRule(); 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3168:1: entryRuleCausalTrigger returns [EObject current=null] : iv_ruleCausalTrigger= ruleCausalTrigger EOF ;
    public final EObject entryRuleCausalTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCausalTrigger = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3169:2: (iv_ruleCausalTrigger= ruleCausalTrigger EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3170:2: iv_ruleCausalTrigger= ruleCausalTrigger EOF
            {
             newCompositeNode(grammarAccess.getCausalTriggerRule()); 
            pushFollow(FOLLOW_ruleCausalTrigger_in_entryRuleCausalTrigger6791);
            iv_ruleCausalTrigger=ruleCausalTrigger();

            state._fsp--;

             current =iv_ruleCausalTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCausalTrigger6801); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3177:1: ruleCausalTrigger returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3180:28: ( ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3181:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3181:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3181:2: (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3181:2: (otherlv_0= '=>' | otherlv_1= '->' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==104) ) {
                alt81=1;
            }
            else if ( (LA81_0==105) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3181:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleCausalTrigger6839); 

                        	newLeafNode(otherlv_0, grammarAccess.getCausalTriggerAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3186:7: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,105,FOLLOW_105_in_ruleCausalTrigger6857); 

                        	newLeafNode(otherlv_1, grammarAccess.getCausalTriggerAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleCausalTrigger6870); 

                	newLeafNode(otherlv_2, grammarAccess.getCausalTriggerAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3194:1: ( (otherlv_3= RULE_ID ) )+
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
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3195:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3195:1: (otherlv_3= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3196:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCausalTriggerRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCausalTrigger6890); 

            	    		newLeafNode(otherlv_3, grammarAccess.getCausalTriggerAccess().getTriggeredWorkItemCrossReference_2_0()); 
            	    	

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

            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleCausalTrigger6903); 

                	newLeafNode(otherlv_4, grammarAccess.getCausalTriggerAccess().getRightCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3211:1: (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==106) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3211:3: otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,106,FOLLOW_106_in_ruleCausalTrigger6916); 

                        	newLeafNode(otherlv_5, grammarAccess.getCausalTriggerAccess().getAtProgressKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3215:1: ( (lv_atProgress_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3216:1: (lv_atProgress_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3216:1: (lv_atProgress_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3217:3: lv_atProgress_6_0= RULE_INT
                    {
                    lv_atProgress_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausalTrigger6933); 

                    			newLeafNode(lv_atProgress_6_0, grammarAccess.getCausalTriggerAccess().getAtProgressINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCausalTriggerRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3233:4: (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==107) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3233:6: otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,107,FOLLOW_107_in_ruleCausalTrigger6953); 

                        	newLeafNode(otherlv_7, grammarAccess.getCausalTriggerAccess().getOnProbabilityKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3237:1: ( (lv_onProbability_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3238:1: (lv_onProbability_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3238:1: (lv_onProbability_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3239:3: lv_onProbability_8_0= RULE_INT
                    {
                    lv_onProbability_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCausalTrigger6970); 

                    			newLeafNode(lv_onProbability_8_0, grammarAccess.getCausalTriggerAccess().getOnProbabilityINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCausalTriggerRule());
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
    // $ANTLR end "ruleCausalTrigger"


    // $ANTLR start "entryRuleService"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3265:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3266:2: (iv_ruleService= ruleService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3267:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService7015);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService7025); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3274:1: ruleService returns [EObject current=null] : (otherlv_0= 'Type' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= RULE_INT ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_efficiency_3_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3277:28: ( (otherlv_0= 'Type' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= RULE_INT ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3278:1: (otherlv_0= 'Type' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= RULE_INT ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3278:1: (otherlv_0= 'Type' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= RULE_INT ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3278:3: otherlv_0= 'Type' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,98,FOLLOW_98_in_ruleService7062); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3282:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3283:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3283:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3284:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService7082); 

            		newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getTypeServiceTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,108,FOLLOW_108_in_ruleService7094); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getEfficiencyKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3299:1: ( (lv_efficiency_3_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3300:1: (lv_efficiency_3_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3300:1: (lv_efficiency_3_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3301:3: lv_efficiency_3_0= RULE_INT
            {
            lv_efficiency_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleService7111); 

            			newLeafNode(lv_efficiency_3_0, grammarAccess.getServiceAccess().getEfficiencyINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"efficiency",
                    		lv_efficiency_3_0, 
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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceProvider"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3325:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3326:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3327:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider7152);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProvider7162); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3334:1: ruleServiceProvider returns [EObject current=null] : ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceStrategy' otherlv_23= '{' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' )? (otherlv_26= 'Resources' otherlv_27= '{' ( (lv_resources_28_0= ruleAsset ) )+ otherlv_29= '}' )? otherlv_30= '}' ) ;
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
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_services_20_0 = null;

        EObject lv_resources_28_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3337:28: ( ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceStrategy' otherlv_23= '{' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' )? (otherlv_26= 'Resources' otherlv_27= '{' ( (lv_resources_28_0= ruleAsset ) )+ otherlv_29= '}' )? otherlv_30= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3338:1: ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceStrategy' otherlv_23= '{' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' )? (otherlv_26= 'Resources' otherlv_27= '{' ( (lv_resources_28_0= ruleAsset ) )+ otherlv_29= '}' )? otherlv_30= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3338:1: ( (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceStrategy' otherlv_23= '{' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' )? (otherlv_26= 'Resources' otherlv_27= '{' ( (lv_resources_28_0= ruleAsset ) )+ otherlv_29= '}' )? otherlv_30= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3338:2: (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )? (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )? (otherlv_22= 'GovernanceStrategy' otherlv_23= '{' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' )? (otherlv_26= 'Resources' otherlv_27= '{' ( (lv_resources_28_0= ruleAsset ) )+ otherlv_29= '}' )? otherlv_30= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3338:2: (otherlv_0= 'ServiceProvider' | otherlv_1= 'Group' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==109) ) {
                alt85=1;
            }
            else if ( (LA85_0==110) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3338:4: otherlv_0= 'ServiceProvider'
                    {
                    otherlv_0=(Token)match(input,109,FOLLOW_109_in_ruleServiceProvider7200); 

                        	newLeafNode(otherlv_0, grammarAccess.getServiceProviderAccess().getServiceProviderKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3343:7: otherlv_1= 'Group'
                    {
                    otherlv_1=(Token)match(input,110,FOLLOW_110_in_ruleServiceProvider7218); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getGroupKeyword_0_1());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3347:2: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3348:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3348:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3349:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7236); 

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

            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleServiceProvider7253); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3369:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==66) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3369:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleServiceProvider7266); 

                        	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3373:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3374:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3374:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3375:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceProvider7283); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3391:4: (otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==111) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3391:6: otherlv_6= 'SourceUnits' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,111,FOLLOW_111_in_ruleServiceProvider7303); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getSourceUnitsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,65,FOLLOW_65_in_ruleServiceProvider7315); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3399:1: ( (otherlv_8= RULE_ID ) )+
                    int cnt87=0;
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==RULE_ID) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3400:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3400:1: (otherlv_8= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3401:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7335); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getSourceUnitsServiceProviderCrossReference_4_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt87 >= 1 ) break loop87;
                                EarlyExitException eee =
                                    new EarlyExitException(87, input);
                                throw eee;
                        }
                        cnt87++;
                    } while (true);

                    otherlv_9=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7348); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3416:3: (otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==96) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3416:5: otherlv_10= 'TargetUnits' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,96,FOLLOW_96_in_ruleServiceProvider7363); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getTargetUnitsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,65,FOLLOW_65_in_ruleServiceProvider7375); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3424:1: ( (otherlv_12= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3425:1: (otherlv_12= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3425:1: (otherlv_12= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3426:3: otherlv_12= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7395); 

                    	    		newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getTargetUnitsServiceProviderCrossReference_5_2_0()); 
                    	    	

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

                    otherlv_13=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7408); 

                        	newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3441:3: (otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==112) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3441:5: otherlv_14= 'SubordinateUnits' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )+ otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,112,FOLLOW_112_in_ruleServiceProvider7423); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getSubordinateUnitsKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,65,FOLLOW_65_in_ruleServiceProvider7435); 

                        	newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3449:1: ( (otherlv_16= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3450:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3450:1: (otherlv_16= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3451:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7455); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getSubordinateUnitsServiceProviderCrossReference_6_2_0()); 
                    	    	

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

                    otherlv_17=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7468); 

                        	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3466:3: (otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==113) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3466:5: otherlv_18= 'Services' otherlv_19= '{' ( (lv_services_20_0= ruleService ) )+ otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,113,FOLLOW_113_in_ruleServiceProvider7483); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getServicesKeyword_7_0());
                        
                    otherlv_19=(Token)match(input,65,FOLLOW_65_in_ruleServiceProvider7495); 

                        	newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3474:1: ( (lv_services_20_0= ruleService ) )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==98) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3475:1: (lv_services_20_0= ruleService )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3475:1: (lv_services_20_0= ruleService )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3476:3: lv_services_20_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getServicesServiceParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleServiceProvider7516);
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
                    	    if ( cnt93 >= 1 ) break loop93;
                                EarlyExitException eee =
                                    new EarlyExitException(93, input);
                                throw eee;
                        }
                        cnt93++;
                    } while (true);

                    otherlv_21=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7529); 

                        	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3496:3: (otherlv_22= 'GovernanceStrategy' otherlv_23= '{' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==87) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3496:5: otherlv_22= 'GovernanceStrategy' otherlv_23= '{' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}'
                    {
                    otherlv_22=(Token)match(input,87,FOLLOW_87_in_ruleServiceProvider7544); 

                        	newLeafNode(otherlv_22, grammarAccess.getServiceProviderAccess().getGovernanceStrategyKeyword_8_0());
                        
                    otherlv_23=(Token)match(input,65,FOLLOW_65_in_ruleServiceProvider7556); 

                        	newLeafNode(otherlv_23, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3504:1: ( (otherlv_24= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3505:1: (otherlv_24= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3505:1: (otherlv_24= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3506:3: otherlv_24= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7576); 

                    		newLeafNode(otherlv_24, grammarAccess.getServiceProviderAccess().getGovernanceStrategyGovernanceStrategyCrossReference_8_2_0()); 
                    	

                    }


                    }

                    otherlv_25=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7588); 

                        	newLeafNode(otherlv_25, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3521:3: (otherlv_26= 'Resources' otherlv_27= '{' ( (lv_resources_28_0= ruleAsset ) )+ otherlv_29= '}' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==114) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3521:5: otherlv_26= 'Resources' otherlv_27= '{' ( (lv_resources_28_0= ruleAsset ) )+ otherlv_29= '}'
                    {
                    otherlv_26=(Token)match(input,114,FOLLOW_114_in_ruleServiceProvider7603); 

                        	newLeafNode(otherlv_26, grammarAccess.getServiceProviderAccess().getResourcesKeyword_9_0());
                        
                    otherlv_27=(Token)match(input,65,FOLLOW_65_in_ruleServiceProvider7615); 

                        	newLeafNode(otherlv_27, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3529:1: ( (lv_resources_28_0= ruleAsset ) )+
                    int cnt96=0;
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==115) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3530:1: (lv_resources_28_0= ruleAsset )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3530:1: (lv_resources_28_0= ruleAsset )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3531:3: lv_resources_28_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleServiceProvider7636);
                    	    lv_resources_28_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_28_0, 
                    	            		"Asset");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt96 >= 1 ) break loop96;
                                EarlyExitException eee =
                                    new EarlyExitException(96, input);
                                throw eee;
                        }
                        cnt96++;
                    } while (true);

                    otherlv_29=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7649); 

                        	newLeafNode(otherlv_29, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7663); 

                	newLeafNode(otherlv_30, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3563:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3564:2: (iv_ruleAsset= ruleAsset EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3565:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset7699);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset7709); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3572:1: ruleAsset returns [EObject current=null] : (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3575:28: ( (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3576:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3576:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3576:3: otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_115_in_ruleAsset7746); 

                	newLeafNode(otherlv_0, grammarAccess.getAssetAccess().getResourceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3580:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3581:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3581:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3582:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset7763); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleAsset7780); 

                	newLeafNode(otherlv_2, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3602:1: (otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==86) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3602:3: otherlv_3= 'Quantity' ( (lv_quantity_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,86,FOLLOW_86_in_ruleAsset7793); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getQuantityKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3606:1: ( (lv_quantity_4_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3607:1: (lv_quantity_4_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3607:1: (lv_quantity_4_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3608:3: lv_quantity_4_0= RULE_INT
                    {
                    lv_quantity_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAsset7810); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3624:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==66) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3624:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleAsset7830); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3628:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3629:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3629:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3630:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAsset7847); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3646:4: (otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==113) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3646:6: otherlv_7= 'Services' otherlv_8= '{' ( (lv_services_9_0= ruleService ) )+ otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,113,FOLLOW_113_in_ruleAsset7867); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getServicesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,65,FOLLOW_65_in_ruleAsset7879); 

                        	newLeafNode(otherlv_8, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3654:1: ( (lv_services_9_0= ruleService ) )+
                    int cnt100=0;
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==98) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3655:1: (lv_services_9_0= ruleService )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3655:1: (lv_services_9_0= ruleService )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3656:3: lv_services_9_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getServicesServiceParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleAsset7900);
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
                    	    if ( cnt100 >= 1 ) break loop100;
                                EarlyExitException eee =
                                    new EarlyExitException(100, input);
                                throw eee;
                        }
                        cnt100++;
                    } while (true);

                    otherlv_10=(Token)match(input,68,FOLLOW_68_in_ruleAsset7913); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,68,FOLLOW_68_in_ruleAsset7927); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3692:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3693:2: (iv_ruleCapability= ruleCapability EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3694:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_ruleCapability_in_entryRuleCapability7967);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCapability7977); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3701:1: ruleCapability returns [EObject current=null] : (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3704:28: ( (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3705:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3705:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3705:3: otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_reqs_5_0= ruleRequirement ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,116,FOLLOW_116_in_ruleCapability8014); 

                	newLeafNode(otherlv_0, grammarAccess.getCapabilityAccess().getCapabilityKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3709:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3710:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3710:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3711:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCapability8031); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleCapability8048); 

                	newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3731:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==66) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3731:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleCapability8061); 

                        	newLeafNode(otherlv_3, grammarAccess.getCapabilityAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3735:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3736:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3736:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3737:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCapability8078); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3753:4: ( (lv_reqs_5_0= ruleRequirement ) )+
            int cnt103=0;
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==117) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3754:1: (lv_reqs_5_0= ruleRequirement )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3754:1: (lv_reqs_5_0= ruleRequirement )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3755:3: lv_reqs_5_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleCapability8106);
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
            	    if ( cnt103 >= 1 ) break loop103;
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
            } while (true);

            otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleCapability8119); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3783:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3784:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3785:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement8155);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement8165); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3792:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausalTrigger ) )* )? otherlv_11= '}' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3795:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausalTrigger ) )* )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3796:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausalTrigger ) )* )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3796:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausalTrigger ) )* )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3796:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' ) (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausalTrigger ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,117,FOLLOW_117_in_ruleRequirement8202); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3800:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3801:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3801:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3802:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement8219); 

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

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleRequirement8236); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3822:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==66) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3822:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleRequirement8249); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3826:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3827:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3827:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3828:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirement8266); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3844:4: (otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3844:6: otherlv_5= 'workItems' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
            {
            otherlv_5=(Token)match(input,118,FOLLOW_118_in_ruleRequirement8286); 

                	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getWorkItemsKeyword_4_0());
                
            otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleRequirement8298); 

                	newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_4_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3852:1: ( (otherlv_7= RULE_ID ) )+
            int cnt105=0;
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==RULE_ID) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3853:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3853:1: (otherlv_7= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3854:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement8318); 

            	    		newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getRTasksWorkItemCrossReference_4_2_0()); 
            	    	

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

            otherlv_8=(Token)match(input,68,FOLLOW_68_in_ruleRequirement8331); 

                	newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4_3());
                

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3869:2: (otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausalTrigger ) )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==119) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3869:4: otherlv_9= 'workItemNetwork' ( (lv_dependencies_10_0= ruleCausalTrigger ) )*
                    {
                    otherlv_9=(Token)match(input,119,FOLLOW_119_in_ruleRequirement8345); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3873:1: ( (lv_dependencies_10_0= ruleCausalTrigger ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( ((LA106_0>=104 && LA106_0<=105)) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3874:1: (lv_dependencies_10_0= ruleCausalTrigger )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3874:1: (lv_dependencies_10_0= ruleCausalTrigger )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3875:3: lv_dependencies_10_0= ruleCausalTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesCausalTriggerParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausalTrigger_in_ruleRequirement8366);
                    	    lv_dependencies_10_0=ruleCausalTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dependencies",
                    	            		lv_dependencies_10_0, 
                    	            		"CausalTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,68,FOLLOW_68_in_ruleRequirement8381); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3905:1: entryRuleProvision returns [EObject current=null] : iv_ruleProvision= ruleProvision EOF ;
    public final EObject entryRuleProvision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvision = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3906:2: (iv_ruleProvision= ruleProvision EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3907:2: iv_ruleProvision= ruleProvision EOF
            {
             newCompositeNode(grammarAccess.getProvisionRule()); 
            pushFollow(FOLLOW_ruleProvision_in_entryRuleProvision8419);
            iv_ruleProvision=ruleProvision();

            state._fsp--;

             current =iv_ruleProvision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvision8429); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3914:1: ruleProvision returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3917:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3918:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3918:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3918:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,120,FOLLOW_120_in_ruleProvision8466); 

                	newLeafNode(otherlv_0, grammarAccess.getProvisionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3922:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3923:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3923:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3924:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProvisionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision8486); 

            		newLeafNode(otherlv_1, grammarAccess.getProvisionAccess().getServiceNameServiceTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,121,FOLLOW_121_in_ruleProvision8498); 

                	newLeafNode(otherlv_2, grammarAccess.getProvisionAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleProvision8510); 

                	newLeafNode(otherlv_3, grammarAccess.getProvisionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3943:1: ( (otherlv_4= RULE_ID ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==RULE_ID) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3944:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3944:1: (otherlv_4= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3945:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProvisionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision8530); 

            	    		newLeafNode(otherlv_4, grammarAccess.getProvisionAccess().getProvidersServiceProviderCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleProvision8543); 

                	newLeafNode(otherlv_5, grammarAccess.getProvisionAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,122,FOLLOW_122_in_ruleProvision8555); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3972:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3973:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3974:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine8591);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine8601); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3981:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3984:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3985:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3985:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3985:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )*
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3985:2: ()
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3986:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3991:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==123) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3991:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,123,FOLLOW_123_in_ruleStatemachine8648); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3995:1: ( (lv_events_2_0= ruleEvent ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3996:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3996:1: (lv_events_2_0= ruleEvent )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3997:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine8669);
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
                    	    if ( cnt109 >= 1 ) break loop109;
                                EarlyExitException eee =
                                    new EarlyExitException(109, input);
                                throw eee;
                        }
                        cnt109++;
                    } while (true);

                    otherlv_3=(Token)match(input,124,FOLLOW_124_in_ruleStatemachine8682); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4017:3: (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==125) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4017:5: otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,125,FOLLOW_125_in_ruleStatemachine8697); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getActivitiesKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4021:1: ( (lv_commands_5_0= ruleCommand ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4022:1: (lv_commands_5_0= ruleCommand )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4022:1: (lv_commands_5_0= ruleCommand )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4023:3: lv_commands_5_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleStatemachine8718);
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
                    	    if ( cnt111 >= 1 ) break loop111;
                                EarlyExitException eee =
                                    new EarlyExitException(111, input);
                                throw eee;
                        }
                        cnt111++;
                    } while (true);

                    otherlv_6=(Token)match(input,124,FOLLOW_124_in_ruleStatemachine8731); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4043:3: ( (lv_states_7_0= ruleState ) )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==126) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4044:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4044:1: (lv_states_7_0= ruleState )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4045:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine8754);
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
            	    break loop113;
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4069:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4070:2: (iv_ruleEvent= ruleEvent EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4071:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent8791);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent8801); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4078:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4081:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4082:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4082:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4082:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4082:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4083:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4083:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4084:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent8843); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4100:2: ( (lv_code_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4101:1: (lv_code_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4101:1: (lv_code_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4102:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent8865); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4126:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4127:2: (iv_ruleCommand= ruleCommand EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4128:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand8906);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand8916); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4135:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4138:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4139:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4139:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4139:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4139:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4140:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4140:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4141:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand8958); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4157:2: ( (lv_code_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4158:1: (lv_code_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4158:1: (lv_code_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4159:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand8980); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4183:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4184:2: (iv_ruleState= ruleState EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4185:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState9021);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState9031); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4192:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4195:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4196:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4196:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4196:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,126,FOLLOW_126_in_ruleState9068); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4200:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4201:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4201:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4202:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState9085); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4218:2: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==127) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4218:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,127,FOLLOW_127_in_ruleState9103); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleState9115); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4226:1: ( (otherlv_4= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4227:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4227:1: (otherlv_4= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4228:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState9135); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0()); 
                    	    	

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

                    otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleState9148); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4243:3: ( (lv_transitions_6_0= ruleTransition ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==RULE_ID) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4244:1: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4244:1: (lv_transitions_6_0= ruleTransition )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4245:3: lv_transitions_6_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState9171);
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
            	    break loop116;
                }
            } while (true);

            otherlv_7=(Token)match(input,124,FOLLOW_124_in_ruleState9184); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4273:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4274:2: (iv_ruleTransition= ruleTransition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4275:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition9220);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition9230); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4282:1: ruleTransition returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4285:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==RULE_ID) ) {
                int LA118_1 = input.LA(2);

                if ( (LA118_1==104) ) {
                    alt118=1;
                }
                else if ( (LA118_1==128) ) {
                    alt118=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 118, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:3: ( (otherlv_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4287:1: (otherlv_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4287:1: (otherlv_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4288:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition9276); 

                    		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,104,FOLLOW_104_in_ruleTransition9288); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4303:1: ( (otherlv_2= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4304:1: (otherlv_2= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4304:1: (otherlv_2= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4305:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition9308); 

                    		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4317:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4317:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4317:7: ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4317:7: ( (otherlv_3= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4318:1: (otherlv_3= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4318:1: (otherlv_3= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4319:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition9336); 

                    		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,128,FOLLOW_128_in_ruleTransition9348); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSolidusKeyword_1_1());
                        
                    otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleTransition9360); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4338:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt117=0;
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==RULE_ID) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4339:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4339:1: (otherlv_6= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4340:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition9380); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getEventactionsCommandCrossReference_1_3_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt117 >= 1 ) break loop117;
                                EarlyExitException eee =
                                    new EarlyExitException(117, input);
                                throw eee;
                        }
                        cnt117++;
                    } while (true);

                    otherlv_7=(Token)match(input,63,FOLLOW_63_in_ruleTransition9393); 

                        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_4());
                        
                    otherlv_8=(Token)match(input,104,FOLLOW_104_in_ruleTransition9405); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_5());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4359:1: ( (otherlv_9= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4360:1: (otherlv_9= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4360:1: (otherlv_9= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4361:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition9425); 

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
    public static final BitSet FOLLOW_11_in_ruleKanbanSchedulingSystem122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleKanbanSchedulingSystem134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleKanbanSchedulingSystem146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleWIAcceptanceRuleType_in_ruleKanbanSchedulingSystem167 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000200L});
    public static final BitSet FOLLOW_14_in_ruleKanbanSchedulingSystem180 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKanbanSchedulingSystem192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleWISelectionRuleType_in_ruleKanbanSchedulingSystem213 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000200L});
    public static final BitSet FOLLOW_16_in_ruleKanbanSchedulingSystem226 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKanbanSchedulingSystem238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleWIAssignmentRuleType_in_ruleKanbanSchedulingSystem259 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000200L});
    public static final BitSet FOLLOW_18_in_ruleKanbanSchedulingSystem272 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKanbanSchedulingSystem284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleResourceAllocationRuleType_in_ruleKanbanSchedulingSystem305 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000200L});
    public static final BitSet FOLLOW_20_in_ruleKanbanSchedulingSystem318 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleKanbanSchedulingSystem330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleResourceOutsourcingRuleType_in_ruleKanbanSchedulingSystem351 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000200L});
    public static final BitSet FOLLOW_22_in_ruleKanbanSchedulingSystem364 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleKanbanSchedulingSystem376 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleKanbanSchedulingSystem388 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleKanbanSchedulingSystem400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleProcessModel_in_ruleKanbanSchedulingSystem421 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_26_in_ruleKanbanSchedulingSystem434 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleKanbanSchedulingSystem446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueFunction_in_ruleKanbanSchedulingSystem467 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_28_in_ruleKanbanSchedulingSystem480 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleKanbanSchedulingSystem492 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleKanbanSchedulingSystem504 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleKanbanSchedulingSystem516 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleKanbanSchedulingSystem528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTaskType_in_ruleKanbanSchedulingSystem549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_ruleTaskHierarchy_in_ruleKanbanSchedulingSystem571 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleKanbanSchedulingSystem583 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleKanbanSchedulingSystem595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleClassOfService_in_ruleKanbanSchedulingSystem616 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_35_in_ruleKanbanSchedulingSystem629 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleKanbanSchedulingSystem641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleServiceType_in_ruleKanbanSchedulingSystem662 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_37_in_ruleKanbanSchedulingSystem675 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleKanbanSchedulingSystem687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleGovernanceStrategy_in_ruleKanbanSchedulingSystem708 = new BitSet(new long[]{0x0000008000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_39_in_ruleKanbanSchedulingSystem721 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40_in_ruleKanbanSchedulingSystem734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleRepository_in_ruleKanbanSchedulingSystem755 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_41_in_ruleKanbanSchedulingSystem768 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleKanbanSchedulingSystem782 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleKanbanSchedulingSystem794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKanbanSchedulingSystem811 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_ruleKanbanSchedulingSystem829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleKanbanSchedulingSystem850 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleKanbanSchedulingSystem864 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleKanbanSchedulingSystem876 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_ruleKanbanSchedulingSystem897 = new BitSet(new long[]{0x0000800000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_47_in_ruleKanbanSchedulingSystem910 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleKanbanSchedulingSystem922 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleKanbanSchedulingSystem934 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleKanbanSchedulingSystem946 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleWorkSource_in_ruleKanbanSchedulingSystem967 = new BitSet(new long[]{0x0008000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_51_in_ruleKanbanSchedulingSystem980 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleKanbanSchedulingSystem992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleWorkItem_in_ruleKanbanSchedulingSystem1013 = new BitSet(new long[]{0x0020000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_53_in_ruleKanbanSchedulingSystem1026 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleKanbanSchedulingSystem1038 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleKanbanSchedulingSystem1050 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleKanbanSchedulingSystem1062 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleKanbanSchedulingSystem1074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem1091 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleKanbanSchedulingSystem1108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKanbanSchedulingSystem1125 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleKanbanSchedulingSystem1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1230 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQualifiedName1249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1264 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble1312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble1363 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDouble1382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumExpression_in_entryRuleNumExpression1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumExpression1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleNumExpression1500 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNumExpression1520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleNumExpression1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleParameter1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution1722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDistribution1774 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleDistribution1791 = new BitSet(new long[]{0x8000000000000030L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDistribution1812 = new BitSet(new long[]{0x8000000000000030L});
    public static final BitSet FOLLOW_63_in_ruleDistribution1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskHierarchy_in_entryRuleTaskHierarchy1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskHierarchy1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleTaskHierarchy1908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskHierarchy1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleTaskHierarchy1942 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleTaskHierarchy1955 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskHierarchy1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleTaskHierarchy1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleTaskHierarchy2004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskHierarchy2024 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleTaskHierarchy2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleTaskHierarchy2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskType_in_entryRuleTaskType2087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskType2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTaskType2134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskType2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleTaskType2168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleTaskType2181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskType2198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleTaskType2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueFunction_in_entryRuleValueFunction2253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueFunction2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleValueFunction2300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueFunction2317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleValueFunction2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleValueFunction2347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueFunction2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleValueFunction2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessModel_in_entryRuleProcessModel2419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessModel2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleProcessModel2466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessModel2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleProcessModel2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleProcessModel2513 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessModel2530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleProcessModel2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOfService_in_entryRuleClassOfService2585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOfService2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleClassOfService2632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassOfService2649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleClassOfService2666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleClassOfService2679 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassOfService2696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleClassOfService2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptanceRuleType_in_entryRuleWIAcceptanceRuleType2751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptanceRuleType2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleWIAcceptanceRuleType2798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptanceRuleType2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWIAcceptanceRuleType2832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleWIAcceptanceRuleType2845 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptanceRuleType2862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWIAcceptanceRuleType2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelectionRuleType_in_entryRuleWISelectionRuleType2917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelectionRuleType2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleWISelectionRuleType2964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelectionRuleType2981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWISelectionRuleType2998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleWISelectionRuleType3011 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelectionRuleType3028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWISelectionRuleType3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignmentRuleType_in_entryRuleWIAssignmentRuleType3083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignmentRuleType3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleWIAssignmentRuleType3130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignmentRuleType3147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWIAssignmentRuleType3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleWIAssignmentRuleType3177 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignmentRuleType3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWIAssignmentRuleType3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocationRuleType_in_entryRuleResourceAllocationRuleType3249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocationRuleType3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleResourceAllocationRuleType3296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocationRuleType3313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleResourceAllocationRuleType3330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleResourceAllocationRuleType3343 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocationRuleType3360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleResourceAllocationRuleType3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcingRuleType_in_entryRuleResourceOutsourcingRuleType3415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcingRuleType3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleResourceOutsourcingRuleType3462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcingRuleType3479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleResourceOutsourcingRuleType3496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleResourceOutsourcingRuleType3509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcingRuleType3526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleResourceOutsourcingRuleType3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceType_in_entryRuleServiceType3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceType3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleServiceType3630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceType3647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleServiceType3665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleServiceType3678 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceType3695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleServiceType3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepository_in_entryRuleRepository3752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepository3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleRepository3799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepository3819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRepository3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRepository3843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_ruleWorkItemProfile_in_ruleRepository3864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleRepository3877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleRepository3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemProfile_in_entryRuleWorkItemProfile3925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemProfile3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleWorkItemProfile3972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile3989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWorkItemProfile4006 = new BitSet(new long[]{0x0000000000000000L,0x00000000003F8194L});
    public static final BitSet FOLLOW_66_in_ruleWorkItemProfile4019 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemProfile4036 = new BitSet(new long[]{0x0000000000000000L,0x00000000003F8190L});
    public static final BitSet FOLLOW_71_in_ruleWorkItemProfile4056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile4076 = new BitSet(new long[]{0x0000000000000000L,0x00000000003F8110L});
    public static final BitSet FOLLOW_79_in_ruleWorkItemProfile4091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWorkItemProfile4103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleWorkReference_in_ruleWorkItemProfile4124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItemProfile4137 = new BitSet(new long[]{0x0000000000000000L,0x00000000003F0110L});
    public static final BitSet FOLLOW_80_in_ruleWorkItemProfile4152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWorkItemProfile4164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleWorkDecomposition_in_ruleWorkItemProfile4185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItemProfile4198 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0110L});
    public static final BitSet FOLLOW_81_in_ruleWorkItemProfile4213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile4233 = new BitSet(new long[]{0x0000000000000010L,0x00000000003C0110L});
    public static final BitSet FOLLOW_82_in_ruleWorkItemProfile4249 = new BitSet(new long[]{0x2000000000000020L,0x0000000000380110L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItemProfile4270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000380110L});
    public static final BitSet FOLLOW_83_in_ruleWorkItemProfile4285 = new BitSet(new long[]{0x2000000000000020L,0x0000000000300110L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItemProfile4306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300110L});
    public static final BitSet FOLLOW_72_in_ruleWorkItemProfile4321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemProfile4341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300010L});
    public static final BitSet FOLLOW_84_in_ruleWorkItemProfile4361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200010L});
    public static final BitSet FOLLOW_85_in_ruleWorkItemProfile4393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItemProfile4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkReference_in_entryRuleWorkReference4455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkReference4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleWorkReference4502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkReference4522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleWorkReference4534 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkReference4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDecomposition_in_entryRuleWorkDecomposition4591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkDecomposition4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleWorkDecomposition4638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkDecomposition4658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleWorkDecomposition4670 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkDecomposition4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGovernanceStrategy_in_entryRuleGovernanceStrategy4731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGovernanceStrategy4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleGovernanceStrategy4778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGovernanceStrategy4795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleGovernanceStrategy4812 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_66_in_ruleGovernanceStrategy4825 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGovernanceStrategy4842 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleGovernanceStrategy4870 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleGovernanceStrategy4891 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleGovernanceStrategy4912 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleGovernanceStrategy4933 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleGovernanceStrategy4954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleGovernanceStrategy4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance5002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptance5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleWIAcceptance5049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptance5069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWIAcceptance5081 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000014L});
    public static final BitSet FOLLOW_66_in_ruleWIAcceptance5094 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptance5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000010L});
    public static final BitSet FOLLOW_89_in_ruleWIAcceptance5131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance5148 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000010L});
    public static final BitSet FOLLOW_90_in_ruleWIAcceptance5168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance5185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWIAcceptance5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelection_in_entryRuleWISelection5240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelection5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleWISelection5287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelection5307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWISelection5319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleWISelection5332 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelection5349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWISelection5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment5404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignment5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleWIAssignment5451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignment5471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWIAssignment5483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleWIAssignment5496 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignment5513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWIAssignment5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation5568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocation5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleResourceAllocation5615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocation5635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleResourceAllocation5647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleResourceAllocation5660 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocation5677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleResourceAllocation5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing5732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcing5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleResourceOutsourcing5779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcing5799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleResourceOutsourcing5811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_66_in_ruleResourceOutsourcing5824 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcing5841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleResourceOutsourcing5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSource_in_entryRuleWorkSource5896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSource5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleWorkSource5943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource5960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWorkSource5977 = new BitSet(new long[]{0x0000000000000000L,0x0000000110000014L});
    public static final BitSet FOLLOW_66_in_ruleWorkSource5990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkSource6007 = new BitSet(new long[]{0x0000000000000000L,0x0000000110000010L});
    public static final BitSet FOLLOW_96_in_ruleWorkSource6027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWorkSource6039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource6059 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWorkSource6072 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000010L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleWorkSource6095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWorkSource6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItem_in_entryRuleWorkItem6144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItem6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem6191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWorkItem6225 = new BitSet(new long[]{0x0000000000000000L,0x000000FE800E0114L});
    public static final BitSet FOLLOW_97_in_ruleWorkItem6238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6258 = new BitSet(new long[]{0x0000000000000000L,0x000000FC800E0114L});
    public static final BitSet FOLLOW_66_in_ruleWorkItem6273 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItem6290 = new BitSet(new long[]{0x0000000000000000L,0x000000FC800E0110L});
    public static final BitSet FOLLOW_98_in_ruleWorkItem6310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6330 = new BitSet(new long[]{0x0000000000000000L,0x000000F8800E0110L});
    public static final BitSet FOLLOW_99_in_ruleWorkItem6345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWorkItem6357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6377 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem6390 = new BitSet(new long[]{0x0000000000000000L,0x000000F0800E0110L});
    public static final BitSet FOLLOW_100_in_ruleWorkItem6405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWorkItem6417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6437 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem6450 = new BitSet(new long[]{0x0000000000000000L,0x000000E0800E0110L});
    public static final BitSet FOLLOW_101_in_ruleWorkItem6465 = new BitSet(new long[]{0x0000000000000000L,0x000003C0800E0110L});
    public static final BitSet FOLLOW_ruleCausalTrigger_in_ruleWorkItem6486 = new BitSet(new long[]{0x0000000000000000L,0x000003C0800E0110L});
    public static final BitSet FOLLOW_81_in_ruleWorkItem6502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6522 = new BitSet(new long[]{0x0000000000000010L,0x000000C0800C0110L});
    public static final BitSet FOLLOW_82_in_ruleWorkItem6538 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem6555 = new BitSet(new long[]{0x0000000000000000L,0x000000C080080110L});
    public static final BitSet FOLLOW_83_in_ruleWorkItem6575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem6592 = new BitSet(new long[]{0x0000000000000000L,0x000000C080000110L});
    public static final BitSet FOLLOW_72_in_ruleWorkItem6612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6632 = new BitSet(new long[]{0x0000000000000000L,0x000000C080000010L});
    public static final BitSet FOLLOW_95_in_ruleWorkItem6647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6667 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000010L});
    public static final BitSet FOLLOW_102_in_ruleWorkItem6682 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem6699 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000010L});
    public static final BitSet FOLLOW_103_in_ruleWorkItem6719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem6736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCausalTrigger_in_entryRuleCausalTrigger6791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCausalTrigger6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleCausalTrigger6839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleCausalTrigger6857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCausalTrigger6870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCausalTrigger6890 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleCausalTrigger6903 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000000000L});
    public static final BitSet FOLLOW_106_in_ruleCausalTrigger6916 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausalTrigger6933 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleCausalTrigger6953 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCausalTrigger6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService7015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleService7062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService7082 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleService7094 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleService7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider7152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProvider7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleServiceProvider7200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_110_in_ruleServiceProvider7218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleServiceProvider7253 = new BitSet(new long[]{0x0000000000000000L,0x0007800100800014L});
    public static final BitSet FOLLOW_66_in_ruleServiceProvider7266 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceProvider7283 = new BitSet(new long[]{0x0000000000000000L,0x0007800100800010L});
    public static final BitSet FOLLOW_111_in_ruleServiceProvider7303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleServiceProvider7315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7335 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7348 = new BitSet(new long[]{0x0000000000000000L,0x0007000100800010L});
    public static final BitSet FOLLOW_96_in_ruleServiceProvider7363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleServiceProvider7375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7395 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7408 = new BitSet(new long[]{0x0000000000000000L,0x0007000000800010L});
    public static final BitSet FOLLOW_112_in_ruleServiceProvider7423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleServiceProvider7435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7455 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7468 = new BitSet(new long[]{0x0000000000000000L,0x0006000000800010L});
    public static final BitSet FOLLOW_113_in_ruleServiceProvider7483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleServiceProvider7495 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleServiceProvider7516 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7529 = new BitSet(new long[]{0x0000000000000000L,0x0004000000800010L});
    public static final BitSet FOLLOW_87_in_ruleServiceProvider7544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleServiceProvider7556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7588 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000010L});
    public static final BitSet FOLLOW_114_in_ruleServiceProvider7603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleServiceProvider7615 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleServiceProvider7636 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset7699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleAsset7746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset7763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAsset7780 = new BitSet(new long[]{0x0000000000000000L,0x0002000000400014L});
    public static final BitSet FOLLOW_86_in_ruleAsset7793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAsset7810 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000014L});
    public static final BitSet FOLLOW_66_in_ruleAsset7830 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAsset7847 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000010L});
    public static final BitSet FOLLOW_113_in_ruleAsset7867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAsset7879 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleAsset7900 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000010L});
    public static final BitSet FOLLOW_68_in_ruleAsset7913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleAsset7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability7967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCapability7977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleCapability8014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCapability8031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCapability8048 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000004L});
    public static final BitSet FOLLOW_66_in_ruleCapability8061 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCapability8078 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000004L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleCapability8106 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000014L});
    public static final BitSet FOLLOW_68_in_ruleCapability8119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement8155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleRequirement8202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement8219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRequirement8236 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000004L});
    public static final BitSet FOLLOW_66_in_ruleRequirement8249 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement8266 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleRequirement8286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRequirement8298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement8318 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleRequirement8331 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000010L});
    public static final BitSet FOLLOW_119_in_ruleRequirement8345 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000010L});
    public static final BitSet FOLLOW_ruleCausalTrigger_in_ruleRequirement8366 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000010L});
    public static final BitSet FOLLOW_68_in_ruleRequirement8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvision_in_entryRuleProvision8419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvision8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleProvision8466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision8486 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleProvision8498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleProvision8510 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision8530 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleProvision8543 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleProvision8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine8591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleStatemachine8648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine8669 = new BitSet(new long[]{0x0000000000000010L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleStatemachine8682 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleStatemachine8697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatemachine8718 = new BitSet(new long[]{0x0000000000000010L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleStatemachine8731 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine8754 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent8791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent8843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand8906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand8916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand8958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState9021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState9031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleState9068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState9085 = new BitSet(new long[]{0x0000000000000010L,0x9000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleState9103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleState9115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState9135 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleState9148 = new BitSet(new long[]{0x0000000000000010L,0x1000000000000000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState9171 = new BitSet(new long[]{0x0000000000000010L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleState9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition9220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition9230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition9276 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleTransition9288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition9336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ruleTransition9348 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleTransition9360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition9380 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_63_in_ruleTransition9393 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleTransition9405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition9425 = new BitSet(new long[]{0x0000000000000002L});

}