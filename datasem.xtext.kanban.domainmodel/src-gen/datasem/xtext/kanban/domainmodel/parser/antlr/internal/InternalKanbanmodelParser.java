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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelBuilder'", "'desc'", "'ExperimentModel'", "'Path'", "'Variables'", "'end Variables'", "'OrganizationalModel'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkSources'", "'end WorkSources'", "'WorkItemNetworks'", "'end WorkItemNetworks'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'WINReplications'", "'end WINReplications'", "'Indicators'", "'end Indicators'", "'end ExperimentSettings'", "'end ExperimentModel'", "'UserLibraries'", "'ServiceProviderTypes'", "'end ServiceProviderTypes'", "'WorkItemTypes'", "'end WorkItemTypes'", "'ProcessModels'", "'end ProcessModels'", "'ClassOfServices'", "'end ClassOfServices'", "'Services'", "'end Services'", "'GovernanceStrategies'", "'end GovernanceStrategies'", "'end UserLibraries'", "'.'", "'var:'", "'Random.'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "':'", "'boolean'", "'num'", "'string'", "'GovernanceStrategy'", "'Normal'", "'Uniform'", "'Exponential'", "'['", "','", "']'", "'WorkItemNetwork'", "'NumReplications'", "'type:'", "'Pull'", "'{'", "'Push'", "'CNP'", "'processes'", "'}'", "'roleBehaviors'", "'role'", "'actions'", "'mechanisms'", "'='", "'attributes'", "'WorkSource'", "'AssignTo'", "'WorkItems'", "'prerequisites'", "'decomposites'", "'analysisEfforts'", "'efforts'", "'impacts'", "'value'", "'hierarchy'", "'priority'", "'disruptive'", "'assignTo'", "'outsourceFrom'", "'strategy'", "'resources'", "'*'", "'skills'", "'int'", "'double'", "'Agent'", "'Task'", "'Contract'", "'Bid'", "'Service'", "'List'", "'Map'", "'default'", "'action'", "'('", "')'", "'backgroundState'", "'state'", "'else'", "'if'", "'in'", "'and'", "'or'", "'Do'", "'->'", "'var'", "'end if'", "'for'", "'end for'", "'while'", "'end while'", "'+'", "'-'", "'/'", "'self'", "'context'"
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
    public static final int RULE_ANY_OTHER=12;
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=8;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:76:1: ruleModelBuilder returns [EObject current=null] : (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) ) ;
    public final EObject ruleModelBuilder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_Description_3_0=null;
        EObject lv_UserLibraries_4_0 = null;

        EObject lv_ExperimentModel_5_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:79:28: ( (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:3: otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleModelBuilder122); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleModelBuilder156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelBuilderAccess().getDescKeyword_2());
                
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:124:2: ( (lv_UserLibraries_4_0= ruleUserLibraries ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:125:1: (lv_UserLibraries_4_0= ruleUserLibraries )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:125:1: (lv_UserLibraries_4_0= ruleUserLibraries )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:126:3: lv_UserLibraries_4_0= ruleUserLibraries
            {
             
            	        newCompositeNode(grammarAccess.getModelBuilderAccess().getUserLibrariesUserLibrariesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUserLibraries_in_ruleModelBuilder199);
            lv_UserLibraries_4_0=ruleUserLibraries();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBuilderRule());
            	        }
                   		set(
                   			current, 
                   			"UserLibraries",
                    		lv_UserLibraries_4_0, 
                    		"UserLibraries");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:142:2: ( (lv_ExperimentModel_5_0= ruleExperimentModel ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:143:1: (lv_ExperimentModel_5_0= ruleExperimentModel )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:143:1: (lv_ExperimentModel_5_0= ruleExperimentModel )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:144:3: lv_ExperimentModel_5_0= ruleExperimentModel
            {
             
            	        newCompositeNode(grammarAccess.getModelBuilderAccess().getExperimentModelExperimentModelParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExperimentModel_in_ruleModelBuilder220);
            lv_ExperimentModel_5_0=ruleExperimentModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBuilderRule());
            	        }
                   		set(
                   			current, 
                   			"ExperimentModel",
                    		lv_ExperimentModel_5_0, 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:168:1: entryRuleExperimentModel returns [EObject current=null] : iv_ruleExperimentModel= ruleExperimentModel EOF ;
    public final EObject entryRuleExperimentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentModel = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:169:2: (iv_ruleExperimentModel= ruleExperimentModel EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:170:2: iv_ruleExperimentModel= ruleExperimentModel EOF
            {
             newCompositeNode(grammarAccess.getExperimentModelRule()); 
            pushFollow(FOLLOW_ruleExperimentModel_in_entryRuleExperimentModel256);
            iv_ruleExperimentModel=ruleExperimentModel();

            state._fsp--;

             current =iv_ruleExperimentModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentModel266); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:177:1: ruleExperimentModel returns [EObject current=null] : (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' ) ;
    public final EObject ruleExperimentModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_Indicators_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_Path_3_0 = null;

        EObject lv_ExperimentVariables_5_0 = null;

        EObject lv_ServiceProviders_9_0 = null;

        EObject lv_WorkSources_14_0 = null;

        EObject lv_WorkItemNetworks_17_0 = null;

        EObject lv_WINReplications_22_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:180:28: ( (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:181:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:181:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:181:3: otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExperimentModel303); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentModelAccess().getExperimentModelKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:185:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:186:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:186:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:187:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperimentModel320); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:203:2: (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:203:4: otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleExperimentModel338); 

                        	newLeafNode(otherlv_2, grammarAccess.getExperimentModelAccess().getPathKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:207:1: ( (lv_Path_3_0= ruleQualifiedName ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:208:1: (lv_Path_3_0= ruleQualifiedName )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:208:1: (lv_Path_3_0= ruleQualifiedName )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:209:3: lv_Path_3_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getPathQualifiedNameParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleExperimentModel359);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleExperimentModel373); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentModelAccess().getVariablesKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:229:1: ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:230:1: (lv_ExperimentVariables_5_0= ruleExperimentVariable )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:230:1: (lv_ExperimentVariables_5_0= ruleExperimentVariable )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:231:3: lv_ExperimentVariables_5_0= ruleExperimentVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getExperimentVariablesExperimentVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExperimentVariable_in_ruleExperimentModel394);
            	    lv_ExperimentVariables_5_0=ruleExperimentVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ExperimentVariables",
            	            		lv_ExperimentVariables_5_0, 
            	            		"ExperimentVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleExperimentModel407); 

                	newLeafNode(otherlv_6, grammarAccess.getExperimentModelAccess().getEndVariablesKeyword_5());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleExperimentModel419); 

                	newLeafNode(otherlv_7, grammarAccess.getExperimentModelAccess().getOrganizationalModelKeyword_6());
                
            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleExperimentModel431); 

                	newLeafNode(otherlv_8, grammarAccess.getExperimentModelAccess().getServiceProvidersKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:259:1: ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:260:1: (lv_ServiceProviders_9_0= ruleServiceProvider )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:260:1: (lv_ServiceProviders_9_0= ruleServiceProvider )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:261:3: lv_ServiceProviders_9_0= ruleServiceProvider
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getServiceProvidersServiceProviderParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceProvider_in_ruleExperimentModel452);
            	    lv_ServiceProviders_9_0=ruleServiceProvider();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceProviders",
            	            		lv_ServiceProviders_9_0, 
            	            		"ServiceProvider");
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

            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleExperimentModel465); 

                	newLeafNode(otherlv_10, grammarAccess.getExperimentModelAccess().getEndServiceProvidersKeyword_9());
                
            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleExperimentModel477); 

                	newLeafNode(otherlv_11, grammarAccess.getExperimentModelAccess().getEndOrganizationalModelKeyword_10());
                
            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleExperimentModel489); 

                	newLeafNode(otherlv_12, grammarAccess.getExperimentModelAccess().getWorkItemNetworkModelKeyword_11());
                
            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleExperimentModel501); 

                	newLeafNode(otherlv_13, grammarAccess.getExperimentModelAccess().getWorkSourcesKeyword_12());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:293:1: ( (lv_WorkSources_14_0= ruleWorkSource ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==85) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:294:1: (lv_WorkSources_14_0= ruleWorkSource )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:294:1: (lv_WorkSources_14_0= ruleWorkSource )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:295:3: lv_WorkSources_14_0= ruleWorkSource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWorkSourcesWorkSourceParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkSource_in_ruleExperimentModel522);
            	    lv_WorkSources_14_0=ruleWorkSource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkSources",
            	            		lv_WorkSources_14_0, 
            	            		"WorkSource");
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

            otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleExperimentModel535); 

                	newLeafNode(otherlv_15, grammarAccess.getExperimentModelAccess().getEndWorkSourcesKeyword_14());
                
            otherlv_16=(Token)match(input,26,FOLLOW_26_in_ruleExperimentModel547); 

                	newLeafNode(otherlv_16, grammarAccess.getExperimentModelAccess().getWorkItemNetworksKeyword_15());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:319:1: ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==70) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:320:1: (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:320:1: (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:321:3: lv_WorkItemNetworks_17_0= ruleWorkItemNetwork
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWorkItemNetworksWorkItemNetworkParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItemNetwork_in_ruleExperimentModel568);
            	    lv_WorkItemNetworks_17_0=ruleWorkItemNetwork();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkItemNetworks",
            	            		lv_WorkItemNetworks_17_0, 
            	            		"WorkItemNetwork");
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

            otherlv_18=(Token)match(input,27,FOLLOW_27_in_ruleExperimentModel581); 

                	newLeafNode(otherlv_18, grammarAccess.getExperimentModelAccess().getEndWorkItemNetworksKeyword_17());
                
            otherlv_19=(Token)match(input,28,FOLLOW_28_in_ruleExperimentModel593); 

                	newLeafNode(otherlv_19, grammarAccess.getExperimentModelAccess().getEndWorkItemNetworkModelKeyword_18());
                
            otherlv_20=(Token)match(input,29,FOLLOW_29_in_ruleExperimentModel605); 

                	newLeafNode(otherlv_20, grammarAccess.getExperimentModelAccess().getExperimentSettingsKeyword_19());
                
            otherlv_21=(Token)match(input,30,FOLLOW_30_in_ruleExperimentModel617); 

                	newLeafNode(otherlv_21, grammarAccess.getExperimentModelAccess().getWINReplicationsKeyword_20());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:353:1: ( (lv_WINReplications_22_0= ruleWINReplication ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==70) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:354:1: (lv_WINReplications_22_0= ruleWINReplication )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:354:1: (lv_WINReplications_22_0= ruleWINReplication )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:355:3: lv_WINReplications_22_0= ruleWINReplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWINReplicationsWINReplicationParserRuleCall_21_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWINReplication_in_ruleExperimentModel638);
            	    lv_WINReplications_22_0=ruleWINReplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WINReplications",
            	            		lv_WINReplications_22_0, 
            	            		"WINReplication");
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

            otherlv_23=(Token)match(input,31,FOLLOW_31_in_ruleExperimentModel651); 

                	newLeafNode(otherlv_23, grammarAccess.getExperimentModelAccess().getEndWINReplicationsKeyword_22());
                
            otherlv_24=(Token)match(input,32,FOLLOW_32_in_ruleExperimentModel663); 

                	newLeafNode(otherlv_24, grammarAccess.getExperimentModelAccess().getIndicatorsKeyword_23());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:379:1: ( (lv_Indicators_25_0= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:380:1: (lv_Indicators_25_0= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:380:1: (lv_Indicators_25_0= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:381:3: lv_Indicators_25_0= RULE_ID
            	    {
            	    lv_Indicators_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperimentModel680); 

            	    			newLeafNode(lv_Indicators_25_0, grammarAccess.getExperimentModelAccess().getIndicatorsIDTerminalRuleCall_24_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"Indicators",
            	            		lv_Indicators_25_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_26=(Token)match(input,33,FOLLOW_33_in_ruleExperimentModel698); 

                	newLeafNode(otherlv_26, grammarAccess.getExperimentModelAccess().getEndIndicatorsKeyword_25());
                
            otherlv_27=(Token)match(input,34,FOLLOW_34_in_ruleExperimentModel710); 

                	newLeafNode(otherlv_27, grammarAccess.getExperimentModelAccess().getEndExperimentSettingsKeyword_26());
                
            otherlv_28=(Token)match(input,35,FOLLOW_35_in_ruleExperimentModel722); 

                	newLeafNode(otherlv_28, grammarAccess.getExperimentModelAccess().getEndExperimentModelKeyword_27());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleUserLibraries"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:417:1: entryRuleUserLibraries returns [EObject current=null] : iv_ruleUserLibraries= ruleUserLibraries EOF ;
    public final EObject entryRuleUserLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserLibraries = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:418:2: (iv_ruleUserLibraries= ruleUserLibraries EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:419:2: iv_ruleUserLibraries= ruleUserLibraries EOF
            {
             newCompositeNode(grammarAccess.getUserLibrariesRule()); 
            pushFollow(FOLLOW_ruleUserLibraries_in_entryRuleUserLibraries758);
            iv_ruleUserLibraries=ruleUserLibraries();

            state._fsp--;

             current =iv_ruleUserLibraries; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserLibraries768); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:426:1: ruleUserLibraries returns [EObject current=null] : (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' ) ;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_ServiceProviderTypes_2_0 = null;

        EObject lv_WorkItemTypes_5_0 = null;

        EObject lv_ProcessModels_8_0 = null;

        EObject lv_ClassOfServices_11_0 = null;

        EObject lv_Services_14_0 = null;

        EObject lv_GovernanceStrategies_17_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:429:28: ( (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:430:1: (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:430:1: (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:430:3: otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleUserLibraries805); 

                	newLeafNode(otherlv_0, grammarAccess.getUserLibrariesAccess().getUserLibrariesKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleUserLibraries817); 

                	newLeafNode(otherlv_1, grammarAccess.getUserLibrariesAccess().getServiceProviderTypesKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:438:1: ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:439:1: (lv_ServiceProviderTypes_2_0= ruleServiceProviderType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:439:1: (lv_ServiceProviderTypes_2_0= ruleServiceProviderType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:440:3: lv_ServiceProviderTypes_2_0= ruleServiceProviderType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getServiceProviderTypesServiceProviderTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceProviderType_in_ruleUserLibraries838);
            	    lv_ServiceProviderTypes_2_0=ruleServiceProviderType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceProviderTypes",
            	            		lv_ServiceProviderTypes_2_0, 
            	            		"ServiceProviderType");
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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleUserLibraries851); 

                	newLeafNode(otherlv_3, grammarAccess.getUserLibrariesAccess().getEndServiceProviderTypesKeyword_3());
                
            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleUserLibraries863); 

                	newLeafNode(otherlv_4, grammarAccess.getUserLibrariesAccess().getWorkItemTypesKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:464:1: ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:465:1: (lv_WorkItemTypes_5_0= ruleWorkItemType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:465:1: (lv_WorkItemTypes_5_0= ruleWorkItemType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:466:3: lv_WorkItemTypes_5_0= ruleWorkItemType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getWorkItemTypesWorkItemTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItemType_in_ruleUserLibraries884);
            	    lv_WorkItemTypes_5_0=ruleWorkItemType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkItemTypes",
            	            		lv_WorkItemTypes_5_0, 
            	            		"WorkItemType");
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

            otherlv_6=(Token)match(input,40,FOLLOW_40_in_ruleUserLibraries897); 

                	newLeafNode(otherlv_6, grammarAccess.getUserLibrariesAccess().getEndWorkItemTypesKeyword_6());
                
            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleUserLibraries909); 

                	newLeafNode(otherlv_7, grammarAccess.getUserLibrariesAccess().getProcessModelsKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:490:1: ( (lv_ProcessModels_8_0= ruleProcessModel ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:491:1: (lv_ProcessModels_8_0= ruleProcessModel )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:491:1: (lv_ProcessModels_8_0= ruleProcessModel )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:492:3: lv_ProcessModels_8_0= ruleProcessModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getProcessModelsProcessModelParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessModel_in_ruleUserLibraries930);
            	    lv_ProcessModels_8_0=ruleProcessModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ProcessModels",
            	            		lv_ProcessModels_8_0, 
            	            		"ProcessModel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleUserLibraries943); 

                	newLeafNode(otherlv_9, grammarAccess.getUserLibrariesAccess().getEndProcessModelsKeyword_9());
                
            otherlv_10=(Token)match(input,43,FOLLOW_43_in_ruleUserLibraries955); 

                	newLeafNode(otherlv_10, grammarAccess.getUserLibrariesAccess().getClassOfServicesKeyword_10());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:516:1: ( (lv_ClassOfServices_11_0= ruleClassOfService ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:517:1: (lv_ClassOfServices_11_0= ruleClassOfService )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:517:1: (lv_ClassOfServices_11_0= ruleClassOfService )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:518:3: lv_ClassOfServices_11_0= ruleClassOfService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getClassOfServicesClassOfServiceParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassOfService_in_ruleUserLibraries976);
            	    lv_ClassOfServices_11_0=ruleClassOfService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ClassOfServices",
            	            		lv_ClassOfServices_11_0, 
            	            		"ClassOfService");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,44,FOLLOW_44_in_ruleUserLibraries989); 

                	newLeafNode(otherlv_12, grammarAccess.getUserLibrariesAccess().getEndClassOfServicesKeyword_12());
                
            otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleUserLibraries1001); 

                	newLeafNode(otherlv_13, grammarAccess.getUserLibrariesAccess().getServicesKeyword_13());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:542:1: ( (lv_Services_14_0= ruleService ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:543:1: (lv_Services_14_0= ruleService )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:543:1: (lv_Services_14_0= ruleService )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:544:3: lv_Services_14_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getServicesServiceParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleUserLibraries1022);
            	    lv_Services_14_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Services",
            	            		lv_Services_14_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_15=(Token)match(input,46,FOLLOW_46_in_ruleUserLibraries1035); 

                	newLeafNode(otherlv_15, grammarAccess.getUserLibrariesAccess().getEndServicesKeyword_15());
                
            otherlv_16=(Token)match(input,47,FOLLOW_47_in_ruleUserLibraries1047); 

                	newLeafNode(otherlv_16, grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesKeyword_16());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:568:1: ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:569:1: (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:569:1: (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:570:3: lv_GovernanceStrategies_17_0= ruleGovernanceStrategy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesGovernanceStrategyParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGovernanceStrategy_in_ruleUserLibraries1068);
            	    lv_GovernanceStrategies_17_0=ruleGovernanceStrategy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GovernanceStrategies",
            	            		lv_GovernanceStrategies_17_0, 
            	            		"GovernanceStrategy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_18=(Token)match(input,48,FOLLOW_48_in_ruleUserLibraries1081); 

                	newLeafNode(otherlv_18, grammarAccess.getUserLibrariesAccess().getEndGovernanceStrategiesKeyword_18());
                
            otherlv_19=(Token)match(input,49,FOLLOW_49_in_ruleUserLibraries1093); 

                	newLeafNode(otherlv_19, grammarAccess.getUserLibrariesAccess().getEndUserLibrariesKeyword_19());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleNumber"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:602:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:603:2: (iv_ruleNumber= ruleNumber EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:604:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1130);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:611:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:614:28: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:615:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:615:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_DOUBLE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:615:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1181); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:623:10: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNumber1207); 

                    		current.merge(this_DOUBLE_1);
                        
                     
                        newLeafNode(this_DOUBLE_1, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleQualifiedName"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:638:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:639:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:640:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1253);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1264); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:647:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:650:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:651:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:651:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:651:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1304); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:658:1: (kw= '.' this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==50) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==EOF||LA15_3==RULE_ID||LA15_3==17||LA15_3==50||(LA15_3>=53 && LA15_3<=58)||LA15_3==78||LA15_3==83||LA15_3==101||LA15_3==115||(LA15_3>=119 && LA15_3<=125)||LA15_3==127||LA15_3==129||(LA15_3>=131 && LA15_3<=135)) ) {
                            alt15=1;
                        }


                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:659:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FOLLOW_50_in_ruleQualifiedName1323); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1338); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:671:3: (kw= '.' this_INT_4= RULE_INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==50) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==RULE_INT) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:672:2: kw= '.' this_INT_4= RULE_INT
            	    {
            	    kw=(Token)match(input,50,FOLLOW_50_in_ruleQualifiedName1359); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualifiedName1374); 

            	    		current.merge(this_INT_4);
            	        
            	     
            	        newLeafNode(this_INT_4, grammarAccess.getQualifiedNameAccess().getINTTerminalRuleCall_2_1()); 
            	        

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


    // $ANTLR start "entryRuleParameter"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:692:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:693:2: (iv_ruleParameter= ruleParameter EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:694:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1422);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1433); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:701:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_ID_2=null;
        Token this_BOOLEAN_3=null;
        AntlrDatatypeRuleToken this_Number_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:704:28: ( (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:705:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:705:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
                {
                alt17=2;
                }
                break;
            case RULE_ID:
                {
                alt17=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:706:5: this_Number_0= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getNumberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleParameter1480);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    		current.merge(this_Number_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:717:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter1506); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getParameterAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:725:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1532); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getParameterAccess().getIDTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:733:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleParameter1558); 

                    		current.merge(this_BOOLEAN_3);
                        
                     
                        newLeafNode(this_BOOLEAN_3, grammarAccess.getParameterAccess().getBOOLEANTerminalRuleCall_3()); 
                        

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


    // $ANTLR start "entryRuleAbstractParameter"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:748:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:749:2: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:750:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractParameterRule()); 
            pushFollow(FOLLOW_ruleAbstractParameter_in_entryRuleAbstractParameter1603);
            iv_ruleAbstractParameter=ruleAbstractParameter();

            state._fsp--;

             current =iv_ruleAbstractParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractParameter1613); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractParameter"


    // $ANTLR start "ruleAbstractParameter"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:757:1: ruleAbstractParameter returns [EObject current=null] : ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        Token lv_isVariable_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:760:28: ( ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:761:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:761:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==51) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_BOOLEAN)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:761:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:761:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:761:3: ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:761:3: ( (lv_isVariable_0_0= 'var:' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:762:1: (lv_isVariable_0_0= 'var:' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:762:1: (lv_isVariable_0_0= 'var:' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:763:3: lv_isVariable_0_0= 'var:'
                    {
                    lv_isVariable_0_0=(Token)match(input,51,FOLLOW_51_in_ruleAbstractParameter1657); 

                            newLeafNode(lv_isVariable_0_0, grammarAccess.getAbstractParameterAccess().getIsVariableVarKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractParameterRule());
                    	        }
                           		setWithLastConsumed(current, "isVariable", true, "var:");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:776:2: ( (otherlv_1= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:777:1: (otherlv_1= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:777:1: (otherlv_1= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:778:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractParameterRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstractParameter1690); 

                    		newLeafNode(otherlv_1, grammarAccess.getAbstractParameterAccess().getVariableExperimentVariableCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:790:6: ( (lv_value_2_0= ruleParameter ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:790:6: ( (lv_value_2_0= ruleParameter ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:791:1: (lv_value_2_0= ruleParameter )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:791:1: (lv_value_2_0= ruleParameter )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:792:3: lv_value_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractParameterAccess().getValueParameterParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleAbstractParameter1718);
                    lv_value_2_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractParameterRule());
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
    // $ANTLR end "ruleAbstractParameter"


    // $ANTLR start "entryRuleNumExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:816:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:817:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:818:2: iv_ruleNumExpression= ruleNumExpression EOF
            {
             newCompositeNode(grammarAccess.getNumExpressionRule()); 
            pushFollow(FOLLOW_ruleNumExpression_in_entryRuleNumExpression1754);
            iv_ruleNumExpression=ruleNumExpression();

            state._fsp--;

             current =iv_ruleNumExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumExpression1764); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:825:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_distribution_1_0=null;
        AntlrDatatypeRuleToken lv_numValue_0_0 = null;

        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:828:28: ( ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:829:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:829:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_INT && LA19_0<=RULE_DOUBLE)) ) {
                alt19=1;
            }
            else if ( (LA19_0==52) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:829:2: ( (lv_numValue_0_0= ruleNumber ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:829:2: ( (lv_numValue_0_0= ruleNumber ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:830:1: (lv_numValue_0_0= ruleNumber )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:830:1: (lv_numValue_0_0= ruleNumber )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:831:3: lv_numValue_0_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumValueNumberParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleNumExpression1810);
                    lv_numValue_0_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"numValue",
                            		lv_numValue_0_0, 
                            		"Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:848:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:848:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:848:7: ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:848:7: ( (lv_distribution_1_0= 'Random.' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:849:1: (lv_distribution_1_0= 'Random.' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:849:1: (lv_distribution_1_0= 'Random.' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:850:3: lv_distribution_1_0= 'Random.'
                    {
                    lv_distribution_1_0=(Token)match(input,52,FOLLOW_52_in_ruleNumExpression1835); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionRandomKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:863:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:864:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:864:1: (lv_numDist_2_0= ruleDistribution )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:865:3: lv_numDist_2_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumDistDistributionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleNumExpression1869);
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:889:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:890:2: (iv_ruleOperator= ruleOperator EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:891:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1906);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1916); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:898:1: ruleOperator returns [EObject current=null] : ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) ;
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
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:901:28: ( ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:902:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:902:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt20=1;
                }
                break;
            case 54:
                {
                alt20=2;
                }
                break;
            case 55:
                {
                alt20=3;
                }
                break;
            case 56:
                {
                alt20=4;
                }
                break;
            case 57:
                {
                alt20=5;
                }
                break;
            case 58:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:902:2: ( (lv_equalTo_0_0= '==' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:902:2: ( (lv_equalTo_0_0= '==' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:903:1: (lv_equalTo_0_0= '==' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:903:1: (lv_equalTo_0_0= '==' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:904:3: lv_equalTo_0_0= '=='
                    {
                    lv_equalTo_0_0=(Token)match(input,53,FOLLOW_53_in_ruleOperator1959); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:918:6: ( (lv_largerThan_1_0= '>' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:918:6: ( (lv_largerThan_1_0= '>' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:919:1: (lv_largerThan_1_0= '>' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:919:1: (lv_largerThan_1_0= '>' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:920:3: lv_largerThan_1_0= '>'
                    {
                    lv_largerThan_1_0=(Token)match(input,54,FOLLOW_54_in_ruleOperator1996); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:934:6: ( (lv_smallerThan_2_0= '<' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:934:6: ( (lv_smallerThan_2_0= '<' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:935:1: (lv_smallerThan_2_0= '<' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:935:1: (lv_smallerThan_2_0= '<' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:936:3: lv_smallerThan_2_0= '<'
                    {
                    lv_smallerThan_2_0=(Token)match(input,55,FOLLOW_55_in_ruleOperator2033); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:950:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:950:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:951:1: (lv_largerOrEqualTo_3_0= '>=' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:951:1: (lv_largerOrEqualTo_3_0= '>=' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:952:3: lv_largerOrEqualTo_3_0= '>='
                    {
                    lv_largerOrEqualTo_3_0=(Token)match(input,56,FOLLOW_56_in_ruleOperator2070); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:966:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:966:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:967:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:967:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:968:3: lv_smallerOrEqualTo_4_0= '<='
                    {
                    lv_smallerOrEqualTo_4_0=(Token)match(input,57,FOLLOW_57_in_ruleOperator2107); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:982:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:982:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:983:1: (lv_notEqualTo_5_0= '!=' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:983:1: (lv_notEqualTo_5_0= '!=' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:984:3: lv_notEqualTo_5_0= '!='
                    {
                    lv_notEqualTo_5_0=(Token)match(input,58,FOLLOW_58_in_ruleOperator2144); 

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


    // $ANTLR start "entryRuleExperimentVariable"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1005:1: entryRuleExperimentVariable returns [EObject current=null] : iv_ruleExperimentVariable= ruleExperimentVariable EOF ;
    public final EObject entryRuleExperimentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentVariable = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1006:2: (iv_ruleExperimentVariable= ruleExperimentVariable EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1007:2: iv_ruleExperimentVariable= ruleExperimentVariable EOF
            {
             newCompositeNode(grammarAccess.getExperimentVariableRule()); 
            pushFollow(FOLLOW_ruleExperimentVariable_in_entryRuleExperimentVariable2193);
            iv_ruleExperimentVariable=ruleExperimentVariable();

            state._fsp--;

             current =iv_ruleExperimentVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentVariable2203); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExperimentVariable"


    // $ANTLR start "ruleExperimentVariable"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1014:1: ruleExperimentVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) ;
    public final EObject ruleExperimentVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_boolean_2_0=null;
        Token lv_booleanValue_3_0=null;
        Token lv_num_4_0=null;
        Token lv_distribution_6_0=null;
        Token lv_string_8_0=null;
        Token lv_stringValue_9_0=null;
        Token lv_strategy_10_0=null;
        AntlrDatatypeRuleToken lv_numValue_5_0 = null;

        EObject lv_numDist_7_0 = null;

        EObject lv_strategyValue_11_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1017:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1018:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1018:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1018:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1018:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1019:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1019:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1020:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperimentVariable2245); 

            			newLeafNode(lv_name_0_0, grammarAccess.getExperimentVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleExperimentVariable2262); 

                	newLeafNode(otherlv_1, grammarAccess.getExperimentVariableAccess().getColonKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1040:1: ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt21=1;
                }
                break;
            case 61:
                {
                alt21=2;
                }
                break;
            case 52:
                {
                alt21=3;
                }
                break;
            case 62:
                {
                alt21=4;
                }
                break;
            case 63:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1040:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1040:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1040:3: ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1040:3: ( (lv_boolean_2_0= 'boolean' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1041:1: (lv_boolean_2_0= 'boolean' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1041:1: (lv_boolean_2_0= 'boolean' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1042:3: lv_boolean_2_0= 'boolean'
                    {
                    lv_boolean_2_0=(Token)match(input,60,FOLLOW_60_in_ruleExperimentVariable2282); 

                            newLeafNode(lv_boolean_2_0, grammarAccess.getExperimentVariableAccess().getBooleanBooleanKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "boolean", true, "boolean");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1055:2: ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1056:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1056:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1057:3: lv_booleanValue_3_0= RULE_BOOLEAN
                    {
                    lv_booleanValue_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleExperimentVariable2312); 

                    			newLeafNode(lv_booleanValue_3_0, grammarAccess.getExperimentVariableAccess().getBooleanValueBOOLEANTerminalRuleCall_2_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"booleanValue",
                            		lv_booleanValue_3_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1074:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1074:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1074:7: ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1074:7: ( (lv_num_4_0= 'num' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1075:1: (lv_num_4_0= 'num' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1075:1: (lv_num_4_0= 'num' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1076:3: lv_num_4_0= 'num'
                    {
                    lv_num_4_0=(Token)match(input,61,FOLLOW_61_in_ruleExperimentVariable2343); 

                            newLeafNode(lv_num_4_0, grammarAccess.getExperimentVariableAccess().getNumNumKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "num", true, "num");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1089:2: ( (lv_numValue_5_0= ruleNumber ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1090:1: (lv_numValue_5_0= ruleNumber )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1090:1: (lv_numValue_5_0= ruleNumber )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1091:3: lv_numValue_5_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentVariableAccess().getNumValueNumberParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleExperimentVariable2377);
                    lv_numValue_5_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExperimentVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"numValue",
                            		lv_numValue_5_0, 
                            		"Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1108:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1108:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1108:7: ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1108:7: ( (lv_distribution_6_0= 'Random.' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1109:1: (lv_distribution_6_0= 'Random.' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1109:1: (lv_distribution_6_0= 'Random.' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1110:3: lv_distribution_6_0= 'Random.'
                    {
                    lv_distribution_6_0=(Token)match(input,52,FOLLOW_52_in_ruleExperimentVariable2403); 

                            newLeafNode(lv_distribution_6_0, grammarAccess.getExperimentVariableAccess().getDistributionRandomKeyword_2_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1123:2: ( (lv_numDist_7_0= ruleDistribution ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1124:1: (lv_numDist_7_0= ruleDistribution )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1124:1: (lv_numDist_7_0= ruleDistribution )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1125:3: lv_numDist_7_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentVariableAccess().getNumDistDistributionParserRuleCall_2_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleExperimentVariable2437);
                    lv_numDist_7_0=ruleDistribution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExperimentVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"numDist",
                            		lv_numDist_7_0, 
                            		"Distribution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1142:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1142:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1142:7: ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1142:7: ( (lv_string_8_0= 'string' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1143:1: (lv_string_8_0= 'string' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1143:1: (lv_string_8_0= 'string' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1144:3: lv_string_8_0= 'string'
                    {
                    lv_string_8_0=(Token)match(input,62,FOLLOW_62_in_ruleExperimentVariable2463); 

                            newLeafNode(lv_string_8_0, grammarAccess.getExperimentVariableAccess().getStringStringKeyword_2_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "string", true, "string");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1157:2: ( (lv_stringValue_9_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1158:1: (lv_stringValue_9_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1158:1: (lv_stringValue_9_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1159:3: lv_stringValue_9_0= RULE_STRING
                    {
                    lv_stringValue_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExperimentVariable2493); 

                    			newLeafNode(lv_stringValue_9_0, grammarAccess.getExperimentVariableAccess().getStringValueSTRINGTerminalRuleCall_2_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringValue",
                            		lv_stringValue_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1176:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1176:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1176:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1176:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1177:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1177:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1178:3: lv_strategy_10_0= 'GovernanceStrategy'
                    {
                    lv_strategy_10_0=(Token)match(input,63,FOLLOW_63_in_ruleExperimentVariable2524); 

                            newLeafNode(lv_strategy_10_0, grammarAccess.getExperimentVariableAccess().getStrategyGovernanceStrategyKeyword_2_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "strategy", true, "GovernanceStrategy");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1191:2: ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1192:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1192:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1193:3: lv_strategyValue_11_0= ruleGovernanceStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentVariableAccess().getStrategyValueGovernanceStrategyParserRuleCall_2_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGovernanceStrategy_in_ruleExperimentVariable2558);
                    lv_strategyValue_11_0=ruleGovernanceStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExperimentVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"strategyValue",
                            		lv_strategyValue_11_0, 
                            		"GovernanceStrategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleExperimentVariable"


    // $ANTLR start "entryRuleDistribution"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1217:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1218:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1219:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution2596);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution2606); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1226:1: ruleDistribution returns [EObject current=null] : ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token lv_isNormal_0_0=null;
        Token lv_isUniform_1_0=null;
        Token lv_isExponential_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_parameters_4_0 = null;

        AntlrDatatypeRuleToken lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1229:28: ( ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1230:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1230:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1230:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1230:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) )
            int alt22=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1230:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1230:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1231:1: (lv_isNormal_0_0= 'Normal' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1231:1: (lv_isNormal_0_0= 'Normal' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1232:3: lv_isNormal_0_0= 'Normal'
                    {
                    lv_isNormal_0_0=(Token)match(input,64,FOLLOW_64_in_ruleDistribution2650); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1246:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1246:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1247:1: (lv_isUniform_1_0= 'Uniform' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1247:1: (lv_isUniform_1_0= 'Uniform' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1248:3: lv_isUniform_1_0= 'Uniform'
                    {
                    lv_isUniform_1_0=(Token)match(input,65,FOLLOW_65_in_ruleDistribution2687); 

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
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1262:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1262:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1263:1: (lv_isExponential_2_0= 'Exponential' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1263:1: (lv_isExponential_2_0= 'Exponential' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1264:3: lv_isExponential_2_0= 'Exponential'
                    {
                    lv_isExponential_2_0=(Token)match(input,66,FOLLOW_66_in_ruleDistribution2724); 

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

            otherlv_3=(Token)match(input,67,FOLLOW_67_in_ruleDistribution2750); 

                	newLeafNode(otherlv_3, grammarAccess.getDistributionAccess().getLeftSquareBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1281:1: ( (lv_parameters_4_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1282:1: (lv_parameters_4_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1282:1: (lv_parameters_4_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1283:3: lv_parameters_4_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleDistribution2771);
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1299:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==68) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1299:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleDistribution2784); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDistributionAccess().getCommaKeyword_3_0());
            	        
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1303:1: ( (lv_parameters_6_0= ruleParameter ) )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1304:1: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1304:1: (lv_parameters_6_0= ruleParameter )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1305:3: lv_parameters_6_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleDistribution2805);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_6_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,69,FOLLOW_69_in_ruleDistribution2819); 

                	newLeafNode(otherlv_7, grammarAccess.getDistributionAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleWINReplication"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1333:1: entryRuleWINReplication returns [EObject current=null] : iv_ruleWINReplication= ruleWINReplication EOF ;
    public final EObject entryRuleWINReplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWINReplication = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1334:2: (iv_ruleWINReplication= ruleWINReplication EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1335:2: iv_ruleWINReplication= ruleWINReplication EOF
            {
             newCompositeNode(grammarAccess.getWINReplicationRule()); 
            pushFollow(FOLLOW_ruleWINReplication_in_entryRuleWINReplication2855);
            iv_ruleWINReplication=ruleWINReplication();

            state._fsp--;

             current =iv_ruleWINReplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWINReplication2865); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1342:1: ruleWINReplication returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) ;
    public final EObject ruleWINReplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numReplications_3_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1345:28: ( (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1346:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1346:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1346:3: otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleWINReplication2902); 

                	newLeafNode(otherlv_0, grammarAccess.getWINReplicationAccess().getWorkItemNetworkKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1350:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1351:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1351:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1352:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWINReplication2922); 

            		newLeafNode(otherlv_1, grammarAccess.getWINReplicationAccess().getWorkItemNetworkWorkItemNetworkCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleWINReplication2934); 

                	newLeafNode(otherlv_2, grammarAccess.getWINReplicationAccess().getNumReplicationsKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1367:1: ( (lv_numReplications_3_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1368:1: (lv_numReplications_3_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1368:1: (lv_numReplications_3_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1369:3: lv_numReplications_3_0= RULE_INT
            {
            lv_numReplications_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWINReplication2951); 

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


    // $ANTLR start "entryRuleGovernanceStrategy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1393:1: entryRuleGovernanceStrategy returns [EObject current=null] : iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF ;
    public final EObject entryRuleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceStrategy = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1394:2: (iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1395:2: iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF
            {
             newCompositeNode(grammarAccess.getGovernanceStrategyRule()); 
            pushFollow(FOLLOW_ruleGovernanceStrategy_in_entryRuleGovernanceStrategy2992);
            iv_ruleGovernanceStrategy=ruleGovernanceStrategy();

            state._fsp--;

             current =iv_ruleGovernanceStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGovernanceStrategy3002); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1402:1: ruleGovernanceStrategy returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type:' ( ( ( (lv_pull_2_0= 'Pull' ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_pullStrategy_6_0= rulePullStrategy ) ) ) | ( ( (lv_push_7_0= 'Push' ) ) otherlv_8= '{' (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_pushStrategy_11_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_12_0= 'CNP' ) ) otherlv_13= '{' (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) ) ) ) otherlv_17= 'processes' otherlv_18= '{' ( (otherlv_19= RULE_ID ) )+ otherlv_20= '}' otherlv_21= '}' ) ;
    public final EObject ruleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_pull_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token lv_push_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token lv_cnp_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_description_15_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_pullStrategy_6_0 = null;

        EObject lv_pushStrategy_11_0 = null;

        EObject lv_contractNetProtocal_16_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1405:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type:' ( ( ( (lv_pull_2_0= 'Pull' ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_pullStrategy_6_0= rulePullStrategy ) ) ) | ( ( (lv_push_7_0= 'Push' ) ) otherlv_8= '{' (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_pushStrategy_11_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_12_0= 'CNP' ) ) otherlv_13= '{' (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) ) ) ) otherlv_17= 'processes' otherlv_18= '{' ( (otherlv_19= RULE_ID ) )+ otherlv_20= '}' otherlv_21= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1406:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type:' ( ( ( (lv_pull_2_0= 'Pull' ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_pullStrategy_6_0= rulePullStrategy ) ) ) | ( ( (lv_push_7_0= 'Push' ) ) otherlv_8= '{' (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_pushStrategy_11_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_12_0= 'CNP' ) ) otherlv_13= '{' (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) ) ) ) otherlv_17= 'processes' otherlv_18= '{' ( (otherlv_19= RULE_ID ) )+ otherlv_20= '}' otherlv_21= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1406:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type:' ( ( ( (lv_pull_2_0= 'Pull' ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_pullStrategy_6_0= rulePullStrategy ) ) ) | ( ( (lv_push_7_0= 'Push' ) ) otherlv_8= '{' (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_pushStrategy_11_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_12_0= 'CNP' ) ) otherlv_13= '{' (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) ) ) ) otherlv_17= 'processes' otherlv_18= '{' ( (otherlv_19= RULE_ID ) )+ otherlv_20= '}' otherlv_21= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1406:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type:' ( ( ( (lv_pull_2_0= 'Pull' ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_pullStrategy_6_0= rulePullStrategy ) ) ) | ( ( (lv_push_7_0= 'Push' ) ) otherlv_8= '{' (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_pushStrategy_11_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_12_0= 'CNP' ) ) otherlv_13= '{' (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) ) ) ) otherlv_17= 'processes' otherlv_18= '{' ( (otherlv_19= RULE_ID ) )+ otherlv_20= '}' otherlv_21= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1406:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1407:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1407:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1408:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGovernanceStrategy3044); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGovernanceStrategyAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleGovernanceStrategy3061); 

                	newLeafNode(otherlv_1, grammarAccess.getGovernanceStrategyAccess().getTypeKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1428:1: ( ( ( (lv_pull_2_0= 'Pull' ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_pullStrategy_6_0= rulePullStrategy ) ) ) | ( ( (lv_push_7_0= 'Push' ) ) otherlv_8= '{' (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_pushStrategy_11_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_12_0= 'CNP' ) ) otherlv_13= '{' (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt27=1;
                }
                break;
            case 75:
                {
                alt27=2;
                }
                break;
            case 76:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1428:2: ( ( (lv_pull_2_0= 'Pull' ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_pullStrategy_6_0= rulePullStrategy ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1428:2: ( ( (lv_pull_2_0= 'Pull' ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_pullStrategy_6_0= rulePullStrategy ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1428:3: ( (lv_pull_2_0= 'Pull' ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_pullStrategy_6_0= rulePullStrategy ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1428:3: ( (lv_pull_2_0= 'Pull' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1429:1: (lv_pull_2_0= 'Pull' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1429:1: (lv_pull_2_0= 'Pull' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1430:3: lv_pull_2_0= 'Pull'
                    {
                    lv_pull_2_0=(Token)match(input,73,FOLLOW_73_in_ruleGovernanceStrategy3081); 

                            newLeafNode(lv_pull_2_0, grammarAccess.getGovernanceStrategyAccess().getPullPullKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(current, "pull", true, "Pull");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleGovernanceStrategy3106); 

                        	newLeafNode(otherlv_3, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_2_0_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1447:1: (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==14) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1447:3: otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleGovernanceStrategy3119); 

                                	newLeafNode(otherlv_4, grammarAccess.getGovernanceStrategyAccess().getDescKeyword_2_0_2_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1451:1: ( (lv_description_5_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1452:1: (lv_description_5_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1452:1: (lv_description_5_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1453:3: lv_description_5_0= RULE_STRING
                            {
                            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3136); 

                            			newLeafNode(lv_description_5_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_2_0_2_1_0()); 
                            		

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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1469:4: ( (lv_pullStrategy_6_0= rulePullStrategy ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1470:1: (lv_pullStrategy_6_0= rulePullStrategy )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1470:1: (lv_pullStrategy_6_0= rulePullStrategy )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1471:3: lv_pullStrategy_6_0= rulePullStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPullStrategyPullStrategyParserRuleCall_2_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulePullStrategy_in_ruleGovernanceStrategy3164);
                    lv_pullStrategy_6_0=rulePullStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"pullStrategy",
                            		lv_pullStrategy_6_0, 
                            		"PullStrategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1488:6: ( ( (lv_push_7_0= 'Push' ) ) otherlv_8= '{' (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_pushStrategy_11_0= rulePushStrategy ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1488:6: ( ( (lv_push_7_0= 'Push' ) ) otherlv_8= '{' (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_pushStrategy_11_0= rulePushStrategy ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1488:7: ( (lv_push_7_0= 'Push' ) ) otherlv_8= '{' (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_pushStrategy_11_0= rulePushStrategy ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1488:7: ( (lv_push_7_0= 'Push' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1489:1: (lv_push_7_0= 'Push' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1489:1: (lv_push_7_0= 'Push' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1490:3: lv_push_7_0= 'Push'
                    {
                    lv_push_7_0=(Token)match(input,75,FOLLOW_75_in_ruleGovernanceStrategy3190); 

                            newLeafNode(lv_push_7_0, grammarAccess.getGovernanceStrategyAccess().getPushPushKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(current, "push", true, "Push");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,74,FOLLOW_74_in_ruleGovernanceStrategy3215); 

                        	newLeafNode(otherlv_8, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_2_1_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1507:1: (otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==14) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1507:3: otherlv_9= 'desc' ( (lv_description_10_0= RULE_STRING ) )
                            {
                            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleGovernanceStrategy3228); 

                                	newLeafNode(otherlv_9, grammarAccess.getGovernanceStrategyAccess().getDescKeyword_2_1_2_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1511:1: ( (lv_description_10_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1512:1: (lv_description_10_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1512:1: (lv_description_10_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1513:3: lv_description_10_0= RULE_STRING
                            {
                            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3245); 

                            			newLeafNode(lv_description_10_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_2_1_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_10_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1529:4: ( (lv_pushStrategy_11_0= rulePushStrategy ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1530:1: (lv_pushStrategy_11_0= rulePushStrategy )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1530:1: (lv_pushStrategy_11_0= rulePushStrategy )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1531:3: lv_pushStrategy_11_0= rulePushStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPushStrategyPushStrategyParserRuleCall_2_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulePushStrategy_in_ruleGovernanceStrategy3273);
                    lv_pushStrategy_11_0=rulePushStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"pushStrategy",
                            		lv_pushStrategy_11_0, 
                            		"PushStrategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1548:6: ( ( (lv_cnp_12_0= 'CNP' ) ) otherlv_13= '{' (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1548:6: ( ( (lv_cnp_12_0= 'CNP' ) ) otherlv_13= '{' (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1548:7: ( (lv_cnp_12_0= 'CNP' ) ) otherlv_13= '{' (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1548:7: ( (lv_cnp_12_0= 'CNP' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1549:1: (lv_cnp_12_0= 'CNP' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1549:1: (lv_cnp_12_0= 'CNP' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1550:3: lv_cnp_12_0= 'CNP'
                    {
                    lv_cnp_12_0=(Token)match(input,76,FOLLOW_76_in_ruleGovernanceStrategy3299); 

                            newLeafNode(lv_cnp_12_0, grammarAccess.getGovernanceStrategyAccess().getCnpCNPKeyword_2_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(current, "cnp", true, "CNP");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,74,FOLLOW_74_in_ruleGovernanceStrategy3324); 

                        	newLeafNode(otherlv_13, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_2_2_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1567:1: (otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==14) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1567:3: otherlv_14= 'desc' ( (lv_description_15_0= RULE_STRING ) )
                            {
                            otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleGovernanceStrategy3337); 

                                	newLeafNode(otherlv_14, grammarAccess.getGovernanceStrategyAccess().getDescKeyword_2_2_2_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1571:1: ( (lv_description_15_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1572:1: (lv_description_15_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1572:1: (lv_description_15_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1573:3: lv_description_15_0= RULE_STRING
                            {
                            lv_description_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3354); 

                            			newLeafNode(lv_description_15_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_2_2_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_15_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1589:4: ( (lv_contractNetProtocal_16_0= ruleContractNetProtocol ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1590:1: (lv_contractNetProtocal_16_0= ruleContractNetProtocol )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1590:1: (lv_contractNetProtocal_16_0= ruleContractNetProtocol )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1591:3: lv_contractNetProtocal_16_0= ruleContractNetProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getContractNetProtocalContractNetProtocolParserRuleCall_2_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContractNetProtocol_in_ruleGovernanceStrategy3382);
                    lv_contractNetProtocal_16_0=ruleContractNetProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"contractNetProtocal",
                            		lv_contractNetProtocal_16_0, 
                            		"ContractNetProtocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,77,FOLLOW_77_in_ruleGovernanceStrategy3396); 

                	newLeafNode(otherlv_17, grammarAccess.getGovernanceStrategyAccess().getProcessesKeyword_3());
                
            otherlv_18=(Token)match(input,74,FOLLOW_74_in_ruleGovernanceStrategy3408); 

                	newLeafNode(otherlv_18, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1615:1: ( (otherlv_19= RULE_ID ) )+
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
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1616:1: (otherlv_19= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1616:1: (otherlv_19= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1617:3: otherlv_19= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
            	    	        }
            	            
            	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGovernanceStrategy3428); 

            	    		newLeafNode(otherlv_19, grammarAccess.getGovernanceStrategyAccess().getProcessesProcessModelCrossReference_5_0()); 
            	    	

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

            otherlv_20=(Token)match(input,78,FOLLOW_78_in_ruleGovernanceStrategy3441); 

                	newLeafNode(otherlv_20, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_21=(Token)match(input,78,FOLLOW_78_in_ruleGovernanceStrategy3453); 

                	newLeafNode(otherlv_21, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleContractNetProtocol"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1644:1: entryRuleContractNetProtocol returns [EObject current=null] : iv_ruleContractNetProtocol= ruleContractNetProtocol EOF ;
    public final EObject entryRuleContractNetProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractNetProtocol = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1645:2: (iv_ruleContractNetProtocol= ruleContractNetProtocol EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1646:2: iv_ruleContractNetProtocol= ruleContractNetProtocol EOF
            {
             newCompositeNode(grammarAccess.getContractNetProtocolRule()); 
            pushFollow(FOLLOW_ruleContractNetProtocol_in_entryRuleContractNetProtocol3489);
            iv_ruleContractNetProtocol=ruleContractNetProtocol();

            state._fsp--;

             current =iv_ruleContractNetProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContractNetProtocol3499); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContractNetProtocol"


    // $ANTLR start "ruleContractNetProtocol"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1653:1: ruleContractNetProtocol returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVariable ) )* otherlv_1= 'roleBehaviors' otherlv_2= '{' ( (lv_roleBehaviors_3_0= ruleRoleBehavior ) )+ otherlv_4= '}' ) ;
    public final EObject ruleContractNetProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_0_0 = null;

        EObject lv_roleBehaviors_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1656:28: ( ( ( (lv_variables_0_0= ruleVariable ) )* otherlv_1= 'roleBehaviors' otherlv_2= '{' ( (lv_roleBehaviors_3_0= ruleRoleBehavior ) )+ otherlv_4= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1657:1: ( ( (lv_variables_0_0= ruleVariable ) )* otherlv_1= 'roleBehaviors' otherlv_2= '{' ( (lv_roleBehaviors_3_0= ruleRoleBehavior ) )+ otherlv_4= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1657:1: ( ( (lv_variables_0_0= ruleVariable ) )* otherlv_1= 'roleBehaviors' otherlv_2= '{' ( (lv_roleBehaviors_3_0= ruleRoleBehavior ) )+ otherlv_4= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1657:2: ( (lv_variables_0_0= ruleVariable ) )* otherlv_1= 'roleBehaviors' otherlv_2= '{' ( (lv_roleBehaviors_3_0= ruleRoleBehavior ) )+ otherlv_4= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1657:2: ( (lv_variables_0_0= ruleVariable ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==60||LA29_0==62||(LA29_0>=103 && LA29_0<=111)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1658:1: (lv_variables_0_0= ruleVariable )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1658:1: (lv_variables_0_0= ruleVariable )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1659:3: lv_variables_0_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractNetProtocolAccess().getVariablesVariableParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleContractNetProtocol3545);
            	    lv_variables_0_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_0_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleContractNetProtocol3558); 

                	newLeafNode(otherlv_1, grammarAccess.getContractNetProtocolAccess().getRoleBehaviorsKeyword_1());
                
            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleContractNetProtocol3570); 

                	newLeafNode(otherlv_2, grammarAccess.getContractNetProtocolAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1683:1: ( (lv_roleBehaviors_3_0= ruleRoleBehavior ) )+
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
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1684:1: (lv_roleBehaviors_3_0= ruleRoleBehavior )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1684:1: (lv_roleBehaviors_3_0= ruleRoleBehavior )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1685:3: lv_roleBehaviors_3_0= ruleRoleBehavior
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractNetProtocolAccess().getRoleBehaviorsRoleBehaviorParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRoleBehavior_in_ruleContractNetProtocol3591);
            	    lv_roleBehaviors_3_0=ruleRoleBehavior();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roleBehaviors",
            	            		lv_roleBehaviors_3_0, 
            	            		"RoleBehavior");
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

            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleContractNetProtocol3604); 

                	newLeafNode(otherlv_4, grammarAccess.getContractNetProtocolAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContractNetProtocol"


    // $ANTLR start "entryRuleRoleBehavior"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1713:1: entryRuleRoleBehavior returns [EObject current=null] : iv_ruleRoleBehavior= ruleRoleBehavior EOF ;
    public final EObject entryRuleRoleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleBehavior = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1714:2: (iv_ruleRoleBehavior= ruleRoleBehavior EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1715:2: iv_ruleRoleBehavior= ruleRoleBehavior EOF
            {
             newCompositeNode(grammarAccess.getRoleBehaviorRule()); 
            pushFollow(FOLLOW_ruleRoleBehavior_in_entryRuleRoleBehavior3640);
            iv_ruleRoleBehavior=ruleRoleBehavior();

            state._fsp--;

             current =iv_ruleRoleBehavior; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoleBehavior3650); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleBehavior"


    // $ANTLR start "ruleRoleBehavior"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1722:1: ruleRoleBehavior returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' ) ;
    public final EObject ruleRoleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_actions_5_0 = null;

        EObject lv_states_7_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1725:28: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1726:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1726:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1726:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleRoleBehavior3687); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleBehaviorAccess().getRoleKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1730:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1731:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1731:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1732:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRoleBehavior3704); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleBehaviorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleBehaviorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleRoleBehavior3721); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleBehaviorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,81,FOLLOW_81_in_ruleRoleBehavior3733); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleBehaviorAccess().getActionsKeyword_3());
                
            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleRoleBehavior3745); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleBehaviorAccess().getLeftCurlyBracketKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1760:1: ( (lv_actions_5_0= ruleAction ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==113) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1761:1: (lv_actions_5_0= ruleAction )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1761:1: (lv_actions_5_0= ruleAction )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1762:3: lv_actions_5_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleBehaviorAccess().getActionsActionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleRoleBehavior3766);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleBehaviorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_5_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleRoleBehavior3779); 

                	newLeafNode(otherlv_6, grammarAccess.getRoleBehaviorAccess().getRightCurlyBracketKeyword_6());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1782:1: ( (lv_states_7_0= ruleState ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=116 && LA32_0<=117)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1783:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1783:1: (lv_states_7_0= ruleState )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1784:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleBehaviorAccess().getStatesStateParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleRoleBehavior3800);
            	    lv_states_7_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleBehaviorRule());
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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleRoleBehavior3813); 

                	newLeafNode(otherlv_8, grammarAccess.getRoleBehaviorAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleBehavior"


    // $ANTLR start "entryRuleProcessModel"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1812:1: entryRuleProcessModel returns [EObject current=null] : iv_ruleProcessModel= ruleProcessModel EOF ;
    public final EObject entryRuleProcessModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessModel = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1813:2: (iv_ruleProcessModel= ruleProcessModel EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1814:2: iv_ruleProcessModel= ruleProcessModel EOF
            {
             newCompositeNode(grammarAccess.getProcessModelRule()); 
            pushFollow(FOLLOW_ruleProcessModel_in_entryRuleProcessModel3849);
            iv_ruleProcessModel=ruleProcessModel();

            state._fsp--;

             current =iv_ruleProcessModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessModel3859); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1821:1: ruleProcessModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}' ) ;
    public final EObject ruleProcessModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_actions_4_0 = null;

        EObject lv_states_6_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1824:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1825:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1825:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1825:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1825:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1826:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1826:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1827:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessModel3901); 

            			newLeafNode(lv_name_0_0, grammarAccess.getProcessModelAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleProcessModel3918); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,81,FOLLOW_81_in_ruleProcessModel3930); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessModelAccess().getActionsKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleProcessModel3942); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1855:1: ( (lv_actions_4_0= ruleAction ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==113) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1856:1: (lv_actions_4_0= ruleAction )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1856:1: (lv_actions_4_0= ruleAction )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1857:3: lv_actions_4_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessModelAccess().getActionsActionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleProcessModel3963);
            	    lv_actions_4_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_4_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleProcessModel3976); 

                	newLeafNode(otherlv_5, grammarAccess.getProcessModelAccess().getRightCurlyBracketKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1877:1: ( (lv_states_6_0= ruleState ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=116 && LA34_0<=117)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1878:1: (lv_states_6_0= ruleState )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1878:1: (lv_states_6_0= ruleState )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1879:3: lv_states_6_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessModelAccess().getStatesStateParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleProcessModel3997);
            	    lv_states_6_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_6_0, 
            	            		"State");
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

            otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleProcessModel4010); 

                	newLeafNode(otherlv_7, grammarAccess.getProcessModelAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulePullStrategy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1907:1: entryRulePullStrategy returns [EObject current=null] : iv_rulePullStrategy= rulePullStrategy EOF ;
    public final EObject entryRulePullStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePullStrategy = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1908:2: (iv_rulePullStrategy= rulePullStrategy EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1909:2: iv_rulePullStrategy= rulePullStrategy EOF
            {
             newCompositeNode(grammarAccess.getPullStrategyRule()); 
            pushFollow(FOLLOW_rulePullStrategy_in_entryRulePullStrategy4046);
            iv_rulePullStrategy=rulePullStrategy();

            state._fsp--;

             current =iv_rulePullStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePullStrategy4056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePullStrategy"


    // $ANTLR start "rulePullStrategy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1916:1: rulePullStrategy returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) ;
    public final EObject rulePullStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mechanisms_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1919:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1920:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1920:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1920:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_rulePullStrategy4093); 

                	newLeafNode(otherlv_0, grammarAccess.getPullStrategyAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,74,FOLLOW_74_in_rulePullStrategy4105); 

                	newLeafNode(otherlv_1, grammarAccess.getPullStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1928:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
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
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1929:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1929:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1930:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPullStrategyAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMechanism_in_rulePullStrategy4126);
            	    lv_mechanisms_2_0=ruleMechanism();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPullStrategyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mechanisms",
            	            		lv_mechanisms_2_0, 
            	            		"Mechanism");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_3=(Token)match(input,78,FOLLOW_78_in_rulePullStrategy4139); 

                	newLeafNode(otherlv_3, grammarAccess.getPullStrategyAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePullStrategy"


    // $ANTLR start "entryRulePushStrategy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1958:1: entryRulePushStrategy returns [EObject current=null] : iv_rulePushStrategy= rulePushStrategy EOF ;
    public final EObject entryRulePushStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePushStrategy = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1959:2: (iv_rulePushStrategy= rulePushStrategy EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1960:2: iv_rulePushStrategy= rulePushStrategy EOF
            {
             newCompositeNode(grammarAccess.getPushStrategyRule()); 
            pushFollow(FOLLOW_rulePushStrategy_in_entryRulePushStrategy4175);
            iv_rulePushStrategy=rulePushStrategy();

            state._fsp--;

             current =iv_rulePushStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePushStrategy4185); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePushStrategy"


    // $ANTLR start "rulePushStrategy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1967:1: rulePushStrategy returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) ;
    public final EObject rulePushStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mechanisms_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1970:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1971:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1971:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1971:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_rulePushStrategy4222); 

                	newLeafNode(otherlv_0, grammarAccess.getPushStrategyAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,74,FOLLOW_74_in_rulePushStrategy4234); 

                	newLeafNode(otherlv_1, grammarAccess.getPushStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1979:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
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
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1980:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1980:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1981:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPushStrategyAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMechanism_in_rulePushStrategy4255);
            	    lv_mechanisms_2_0=ruleMechanism();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPushStrategyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mechanisms",
            	            		lv_mechanisms_2_0, 
            	            		"Mechanism");
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

            otherlv_3=(Token)match(input,78,FOLLOW_78_in_rulePushStrategy4268); 

                	newLeafNode(otherlv_3, grammarAccess.getPushStrategyAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePushStrategy"


    // $ANTLR start "entryRuleMechanism"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2009:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2010:2: (iv_ruleMechanism= ruleMechanism EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2011:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_ruleMechanism_in_entryRuleMechanism4304);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanism4314); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2018:1: ruleMechanism returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleMechanism() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributes_8_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2021:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2022:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2022:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2022:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2022:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2023:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2023:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2024:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechanism4356); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMechanismAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMechanismRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleMechanism4373); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAccess().getEqualsSignKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2044:1: ( (lv_value_2_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2045:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2045:1: (lv_value_2_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2046:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleMechanism4394);
            lv_value_2_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMechanismRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleMechanism4406); 

                	newLeafNode(otherlv_3, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2066:1: (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2066:3: otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleMechanism4419); 

                        	newLeafNode(otherlv_4, grammarAccess.getMechanismAccess().getDescKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2070:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2071:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2071:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2072:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanism4436); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getMechanismAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMechanismRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2088:4: (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==84) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2088:6: otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,84,FOLLOW_84_in_ruleMechanism4456); 

                        	newLeafNode(otherlv_6, grammarAccess.getMechanismAccess().getAttributesKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,74,FOLLOW_74_in_ruleMechanism4468); 

                        	newLeafNode(otherlv_7, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2096:1: ( (lv_attributes_8_0= ruleMechanismAttribute ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_STRING) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2097:1: (lv_attributes_8_0= ruleMechanismAttribute )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2097:1: (lv_attributes_8_0= ruleMechanismAttribute )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2098:3: lv_attributes_8_0= ruleMechanismAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMechanismAttribute_in_ruleMechanism4489);
                    	    lv_attributes_8_0=ruleMechanismAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMechanismRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_8_0, 
                    	            		"MechanismAttribute");
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

                    otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleMechanism4502); 

                        	newLeafNode(otherlv_9, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,78,FOLLOW_78_in_ruleMechanism4516); 

                	newLeafNode(otherlv_10, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2130:1: entryRuleMechanismAttribute returns [EObject current=null] : iv_ruleMechanismAttribute= ruleMechanismAttribute EOF ;
    public final EObject entryRuleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanismAttribute = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2131:2: (iv_ruleMechanismAttribute= ruleMechanismAttribute EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2132:2: iv_ruleMechanismAttribute= ruleMechanismAttribute EOF
            {
             newCompositeNode(grammarAccess.getMechanismAttributeRule()); 
            pushFollow(FOLLOW_ruleMechanismAttribute_in_entryRuleMechanismAttribute4552);
            iv_ruleMechanismAttribute=ruleMechanismAttribute();

            state._fsp--;

             current =iv_ruleMechanismAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanismAttribute4562); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2139:1: ruleMechanismAttribute returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2142:28: ( ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2143:1: ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2143:1: ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2143:2: ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2143:2: ( (lv_attribute_0_0= RULE_STRING ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2144:1: (lv_attribute_0_0= RULE_STRING )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2144:1: (lv_attribute_0_0= RULE_STRING )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2145:3: lv_attribute_0_0= RULE_STRING
            {
            lv_attribute_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanismAttribute4604); 

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

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleMechanismAttribute4621); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAttributeAccess().getEqualsSignKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2165:1: ( (lv_value_2_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2166:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2166:1: (lv_value_2_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2167:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAttributeAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleMechanismAttribute4642);
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2191:1: entryRuleWorkSource returns [EObject current=null] : iv_ruleWorkSource= ruleWorkSource EOF ;
    public final EObject entryRuleWorkSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSource = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2192:2: (iv_ruleWorkSource= ruleWorkSource EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2193:2: iv_ruleWorkSource= ruleWorkSource EOF
            {
             newCompositeNode(grammarAccess.getWorkSourceRule()); 
            pushFollow(FOLLOW_ruleWorkSource_in_entryRuleWorkSource4678);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSource4688); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2200:1: ruleWorkSource returns [EObject current=null] : (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
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
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2203:28: ( (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2204:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2204:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2204:3: otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleWorkSource4725); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2208:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2209:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2209:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2210:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4742); 

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

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleWorkSource4759); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2230:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2230:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleWorkSource4772); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getDescKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2234:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2235:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2235:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2236:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkSource4789); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2252:4: (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==86) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2252:6: otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,86,FOLLOW_86_in_ruleWorkSource4809); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkSourceAccess().getAssignToKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleWorkSource4821); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2260:1: ( (otherlv_7= RULE_ID ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2261:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2261:1: (otherlv_7= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2262:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4841); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getAssignToServiceProviderCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleWorkSource4854); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleWorkSource4868); 

                	newLeafNode(otherlv_9, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2289:1: entryRuleWorkItemNetwork returns [EObject current=null] : iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF ;
    public final EObject entryRuleWorkItemNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemNetwork = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2290:2: (iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2291:2: iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF
            {
             newCompositeNode(grammarAccess.getWorkItemNetworkRule()); 
            pushFollow(FOLLOW_ruleWorkItemNetwork_in_entryRuleWorkItemNetwork4904);
            iv_ruleWorkItemNetwork=ruleWorkItemNetwork();

            state._fsp--;

             current =iv_ruleWorkItemNetwork; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemNetwork4914); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2298:1: ruleWorkItemNetwork returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) ;
    public final EObject ruleWorkItemNetwork() throws RecognitionException {
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
        Token lv_id_10_0=null;
        EObject lv_workItems_7_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2301:28: ( (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2302:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2302:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2302:3: otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleWorkItemNetwork4951); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemNetworkAccess().getWorkItemNetworkKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2306:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2307:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2307:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2308:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemNetwork4968); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkItemNetworkAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleWorkItemNetwork4985); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2328:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==14) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2328:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleWorkItemNetwork4998); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemNetworkAccess().getDescKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2332:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2333:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2333:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2334:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemNetwork5015); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWorkItemNetworkAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
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

            otherlv_5=(Token)match(input,87,FOLLOW_87_in_ruleWorkItemNetwork5034); 

                	newLeafNode(otherlv_5, grammarAccess.getWorkItemNetworkAccess().getWorkItemsKeyword_4());
                
            otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleWorkItemNetwork5046); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2358:1: ( (lv_workItems_7_0= ruleWorkItem ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2359:1: (lv_workItems_7_0= ruleWorkItem )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2359:1: (lv_workItems_7_0= ruleWorkItem )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2360:3: lv_workItems_7_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkItemNetworkAccess().getWorkItemsWorkItemParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItem_in_ruleWorkItemNetwork5067);
            	    lv_workItems_7_0=ruleWorkItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkItemNetworkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"workItems",
            	            		lv_workItems_7_0, 
            	            		"WorkItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleWorkItemNetwork5080); 

                	newLeafNode(otherlv_8, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleWorkItemNetwork5092); 

                	newLeafNode(otherlv_9, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_8());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2384:1: ( (lv_id_10_0= RULE_INT ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2385:1: (lv_id_10_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2385:1: (lv_id_10_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2386:3: lv_id_10_0= RULE_INT
                    {
                    lv_id_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemNetwork5109); 

                    			newLeafNode(lv_id_10_0, grammarAccess.getWorkItemNetworkAccess().getIdINTTerminalRuleCall_9_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_10_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleWorkItemNetwork"


    // $ANTLR start "entryRuleWorkItem"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2410:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2411:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2412:2: iv_ruleWorkItem= ruleWorkItem EOF
            {
             newCompositeNode(grammarAccess.getWorkItemRule()); 
            pushFollow(FOLLOW_ruleWorkItem_in_entryRuleWorkItem5151);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItem5161); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2419:1: ruleWorkItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_6_0= 'prerequisites' ) ) otherlv_7= '{' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )? ( ( ( (lv_hasSubtasks_12_0= 'decomposites' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' otherlv_18= 'analysisEfforts' otherlv_19= '{' ( (lv_requiredAnalysis_20_0= ruleRequiredService ) ) (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )* otherlv_23= '}' )? | ( (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )? otherlv_30= 'efforts' otherlv_31= '{' ( (lv_requiredServices_32_0= ruleRequiredService ) ) (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )* otherlv_35= '}' ) ) ( ( (lv_hasImpacts_36_0= 'impacts' ) ) otherlv_37= '{' ( (lv_impacts_38_0= ruleImpact ) ) (otherlv_39= ',' ( (lv_impacts_40_0= ruleImpact ) ) )* otherlv_41= '}' )? (otherlv_42= 'value' ( (lv_value_43_0= ruleNumExpression ) ) )? otherlv_44= '}' ( (lv_id_45_0= RULE_INT ) )? ) ;
    public final EObject ruleWorkItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token lv_hasPredecessors_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_hasSubtasks_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token lv_hasImpacts_36_0=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token lv_id_45_0=null;
        EObject lv_requiredAnalysis_20_0 = null;

        EObject lv_requiredAnalysis_22_0 = null;

        EObject lv_requiredAnalysis_26_0 = null;

        EObject lv_requiredAnalysis_28_0 = null;

        EObject lv_requiredServices_32_0 = null;

        EObject lv_requiredServices_34_0 = null;

        EObject lv_impacts_38_0 = null;

        EObject lv_impacts_40_0 = null;

        EObject lv_value_43_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2422:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_6_0= 'prerequisites' ) ) otherlv_7= '{' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )? ( ( ( (lv_hasSubtasks_12_0= 'decomposites' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' otherlv_18= 'analysisEfforts' otherlv_19= '{' ( (lv_requiredAnalysis_20_0= ruleRequiredService ) ) (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )* otherlv_23= '}' )? | ( (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )? otherlv_30= 'efforts' otherlv_31= '{' ( (lv_requiredServices_32_0= ruleRequiredService ) ) (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )* otherlv_35= '}' ) ) ( ( (lv_hasImpacts_36_0= 'impacts' ) ) otherlv_37= '{' ( (lv_impacts_38_0= ruleImpact ) ) (otherlv_39= ',' ( (lv_impacts_40_0= ruleImpact ) ) )* otherlv_41= '}' )? (otherlv_42= 'value' ( (lv_value_43_0= ruleNumExpression ) ) )? otherlv_44= '}' ( (lv_id_45_0= RULE_INT ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2423:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_6_0= 'prerequisites' ) ) otherlv_7= '{' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )? ( ( ( (lv_hasSubtasks_12_0= 'decomposites' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' otherlv_18= 'analysisEfforts' otherlv_19= '{' ( (lv_requiredAnalysis_20_0= ruleRequiredService ) ) (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )* otherlv_23= '}' )? | ( (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )? otherlv_30= 'efforts' otherlv_31= '{' ( (lv_requiredServices_32_0= ruleRequiredService ) ) (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )* otherlv_35= '}' ) ) ( ( (lv_hasImpacts_36_0= 'impacts' ) ) otherlv_37= '{' ( (lv_impacts_38_0= ruleImpact ) ) (otherlv_39= ',' ( (lv_impacts_40_0= ruleImpact ) ) )* otherlv_41= '}' )? (otherlv_42= 'value' ( (lv_value_43_0= ruleNumExpression ) ) )? otherlv_44= '}' ( (lv_id_45_0= RULE_INT ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2423:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_6_0= 'prerequisites' ) ) otherlv_7= '{' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )? ( ( ( (lv_hasSubtasks_12_0= 'decomposites' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' otherlv_18= 'analysisEfforts' otherlv_19= '{' ( (lv_requiredAnalysis_20_0= ruleRequiredService ) ) (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )* otherlv_23= '}' )? | ( (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )? otherlv_30= 'efforts' otherlv_31= '{' ( (lv_requiredServices_32_0= ruleRequiredService ) ) (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )* otherlv_35= '}' ) ) ( ( (lv_hasImpacts_36_0= 'impacts' ) ) otherlv_37= '{' ( (lv_impacts_38_0= ruleImpact ) ) (otherlv_39= ',' ( (lv_impacts_40_0= ruleImpact ) ) )* otherlv_41= '}' )? (otherlv_42= 'value' ( (lv_value_43_0= ruleNumExpression ) ) )? otherlv_44= '}' ( (lv_id_45_0= RULE_INT ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2423:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_6_0= 'prerequisites' ) ) otherlv_7= '{' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )? ( ( ( (lv_hasSubtasks_12_0= 'decomposites' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' otherlv_18= 'analysisEfforts' otherlv_19= '{' ( (lv_requiredAnalysis_20_0= ruleRequiredService ) ) (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )* otherlv_23= '}' )? | ( (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )? otherlv_30= 'efforts' otherlv_31= '{' ( (lv_requiredServices_32_0= ruleRequiredService ) ) (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )* otherlv_35= '}' ) ) ( ( (lv_hasImpacts_36_0= 'impacts' ) ) otherlv_37= '{' ( (lv_impacts_38_0= ruleImpact ) ) (otherlv_39= ',' ( (lv_impacts_40_0= ruleImpact ) ) )* otherlv_41= '}' )? (otherlv_42= 'value' ( (lv_value_43_0= ruleNumExpression ) ) )? otherlv_44= '}' ( (lv_id_45_0= RULE_INT ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2423:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2424:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2424:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2425:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5203); 

            			newLeafNode(lv_name_0_0, grammarAccess.getWorkItemAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2441:2: (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==72) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2441:4: otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleWorkItem5221); 

                        	newLeafNode(otherlv_1, grammarAccess.getWorkItemAccess().getTypeKeyword_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2445:1: ( (otherlv_2= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2446:1: (otherlv_2= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2446:1: (otherlv_2= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2447:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5241); 

                    		newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getTypeWorkItemTypeCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5255); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2462:1: (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2462:3: otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleWorkItem5268); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getDescKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2466:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2467:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2467:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2468:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItem5285); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getWorkItemAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2484:4: ( ( (lv_hasPredecessors_6_0= 'prerequisites' ) ) otherlv_7= '{' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==88) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2484:5: ( (lv_hasPredecessors_6_0= 'prerequisites' ) ) otherlv_7= '{' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2484:5: ( (lv_hasPredecessors_6_0= 'prerequisites' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2485:1: (lv_hasPredecessors_6_0= 'prerequisites' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2485:1: (lv_hasPredecessors_6_0= 'prerequisites' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2486:3: lv_hasPredecessors_6_0= 'prerequisites'
                    {
                    lv_hasPredecessors_6_0=(Token)match(input,88,FOLLOW_88_in_ruleWorkItem5311); 

                            newLeafNode(lv_hasPredecessors_6_0, grammarAccess.getWorkItemAccess().getHasPredecessorsPrerequisitesKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasPredecessors", true, "prerequisites");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5336); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2503:1: ( (otherlv_8= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2504:1: (otherlv_8= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2504:1: (otherlv_8= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2505:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5356); 

                    		newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2516:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==68) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2516:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5369); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2520:1: ( (otherlv_10= RULE_ID ) )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2521:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2521:1: (otherlv_10= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2522:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5389); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5403); 

                        	newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2537:3: ( ( ( (lv_hasSubtasks_12_0= 'decomposites' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' otherlv_18= 'analysisEfforts' otherlv_19= '{' ( (lv_requiredAnalysis_20_0= ruleRequiredService ) ) (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )* otherlv_23= '}' )? | ( (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )? otherlv_30= 'efforts' otherlv_31= '{' ( (lv_requiredServices_32_0= ruleRequiredService ) ) (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )* otherlv_35= '}' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==78||LA56_0==89||(LA56_0>=92 && LA56_0<=93)) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=90 && LA56_0<=91)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2537:4: ( ( (lv_hasSubtasks_12_0= 'decomposites' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' otherlv_18= 'analysisEfforts' otherlv_19= '{' ( (lv_requiredAnalysis_20_0= ruleRequiredService ) ) (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )* otherlv_23= '}' )?
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2537:4: ( ( (lv_hasSubtasks_12_0= 'decomposites' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' otherlv_18= 'analysisEfforts' otherlv_19= '{' ( (lv_requiredAnalysis_20_0= ruleRequiredService ) ) (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )* otherlv_23= '}' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==89) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2537:5: ( (lv_hasSubtasks_12_0= 'decomposites' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' otherlv_18= 'analysisEfforts' otherlv_19= '{' ( (lv_requiredAnalysis_20_0= ruleRequiredService ) ) (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )* otherlv_23= '}'
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2537:5: ( (lv_hasSubtasks_12_0= 'decomposites' ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2538:1: (lv_hasSubtasks_12_0= 'decomposites' )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2538:1: (lv_hasSubtasks_12_0= 'decomposites' )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2539:3: lv_hasSubtasks_12_0= 'decomposites'
                            {
                            lv_hasSubtasks_12_0=(Token)match(input,89,FOLLOW_89_in_ruleWorkItem5425); 

                                    newLeafNode(lv_hasSubtasks_12_0, grammarAccess.getWorkItemAccess().getHasSubtasksDecompositesKeyword_5_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                   		setWithLastConsumed(current, "hasSubtasks", true, "decomposites");
                            	    

                            }


                            }

                            otherlv_13=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5450); 

                                	newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_0_1());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2556:1: ( (otherlv_14= RULE_ID ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2557:1: (otherlv_14= RULE_ID )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2557:1: (otherlv_14= RULE_ID )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2558:3: otherlv_14= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                    
                            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5470); 

                            		newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_5_0_2_0()); 
                            	

                            }


                            }

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2569:2: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==68) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2569:4: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
                            	    {
                            	    otherlv_15=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5483); 

                            	        	newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getCommaKeyword_5_0_3_0());
                            	        
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2573:1: ( (otherlv_16= RULE_ID ) )
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2574:1: (otherlv_16= RULE_ID )
                            	    {
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2574:1: (otherlv_16= RULE_ID )
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2575:3: otherlv_16= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	    	        }
                            	            
                            	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5503); 

                            	    		newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_5_0_3_1_0()); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);

                            otherlv_17=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5517); 

                                	newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_0_4());
                                
                            otherlv_18=(Token)match(input,90,FOLLOW_90_in_ruleWorkItem5529); 

                                	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getAnalysisEffortsKeyword_5_0_5());
                                
                            otherlv_19=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5541); 

                                	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_0_6());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2598:1: ( (lv_requiredAnalysis_20_0= ruleRequiredService ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2599:1: (lv_requiredAnalysis_20_0= ruleRequiredService )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2599:1: (lv_requiredAnalysis_20_0= ruleRequiredService )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2600:3: lv_requiredAnalysis_20_0= ruleRequiredService
                            {
                             
                            	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_0_7_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5562);
                            lv_requiredAnalysis_20_0=ruleRequiredService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"requiredAnalysis",
                                    		lv_requiredAnalysis_20_0, 
                                    		"RequiredService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2616:2: (otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==68) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2616:4: otherlv_21= ',' ( (lv_requiredAnalysis_22_0= ruleRequiredService ) )
                            	    {
                            	    otherlv_21=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5575); 

                            	        	newLeafNode(otherlv_21, grammarAccess.getWorkItemAccess().getCommaKeyword_5_0_8_0());
                            	        
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2620:1: ( (lv_requiredAnalysis_22_0= ruleRequiredService ) )
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2621:1: (lv_requiredAnalysis_22_0= ruleRequiredService )
                            	    {
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2621:1: (lv_requiredAnalysis_22_0= ruleRequiredService )
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2622:3: lv_requiredAnalysis_22_0= ruleRequiredService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_0_8_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5596);
                            	    lv_requiredAnalysis_22_0=ruleRequiredService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"requiredAnalysis",
                            	            		lv_requiredAnalysis_22_0, 
                            	            		"RequiredService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);

                            otherlv_23=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5610); 

                                	newLeafNode(otherlv_23, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_0_9());
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2643:6: ( (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )? otherlv_30= 'efforts' otherlv_31= '{' ( (lv_requiredServices_32_0= ruleRequiredService ) ) (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )* otherlv_35= '}' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2643:6: ( (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )? otherlv_30= 'efforts' otherlv_31= '{' ( (lv_requiredServices_32_0= ruleRequiredService ) ) (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )* otherlv_35= '}' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2643:7: (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )? otherlv_30= 'efforts' otherlv_31= '{' ( (lv_requiredServices_32_0= ruleRequiredService ) ) (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )* otherlv_35= '}'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2643:7: (otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==90) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2643:9: otherlv_24= 'analysisEfforts' otherlv_25= '{' ( (lv_requiredAnalysis_26_0= ruleRequiredService ) ) (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )* otherlv_29= '}'
                            {
                            otherlv_24=(Token)match(input,90,FOLLOW_90_in_ruleWorkItem5632); 

                                	newLeafNode(otherlv_24, grammarAccess.getWorkItemAccess().getAnalysisEffortsKeyword_5_1_0_0());
                                
                            otherlv_25=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5644); 

                                	newLeafNode(otherlv_25, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_1_0_1());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2651:1: ( (lv_requiredAnalysis_26_0= ruleRequiredService ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2652:1: (lv_requiredAnalysis_26_0= ruleRequiredService )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2652:1: (lv_requiredAnalysis_26_0= ruleRequiredService )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2653:3: lv_requiredAnalysis_26_0= ruleRequiredService
                            {
                             
                            	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_1_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5665);
                            lv_requiredAnalysis_26_0=ruleRequiredService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"requiredAnalysis",
                                    		lv_requiredAnalysis_26_0, 
                                    		"RequiredService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2669:2: (otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==68) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2669:4: otherlv_27= ',' ( (lv_requiredAnalysis_28_0= ruleRequiredService ) )
                            	    {
                            	    otherlv_27=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5678); 

                            	        	newLeafNode(otherlv_27, grammarAccess.getWorkItemAccess().getCommaKeyword_5_1_0_3_0());
                            	        
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2673:1: ( (lv_requiredAnalysis_28_0= ruleRequiredService ) )
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2674:1: (lv_requiredAnalysis_28_0= ruleRequiredService )
                            	    {
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2674:1: (lv_requiredAnalysis_28_0= ruleRequiredService )
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2675:3: lv_requiredAnalysis_28_0= ruleRequiredService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_1_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5699);
                            	    lv_requiredAnalysis_28_0=ruleRequiredService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"requiredAnalysis",
                            	            		lv_requiredAnalysis_28_0, 
                            	            		"RequiredService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);

                            otherlv_29=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5713); 

                                	newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_1_0_4());
                                

                            }
                            break;

                    }

                    otherlv_30=(Token)match(input,91,FOLLOW_91_in_ruleWorkItem5727); 

                        	newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getEffortsKeyword_5_1_1());
                        
                    otherlv_31=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5739); 

                        	newLeafNode(otherlv_31, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_1_2());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2703:1: ( (lv_requiredServices_32_0= ruleRequiredService ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2704:1: (lv_requiredServices_32_0= ruleRequiredService )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2704:1: (lv_requiredServices_32_0= ruleRequiredService )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2705:3: lv_requiredServices_32_0= ruleRequiredService
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_5_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5760);
                    lv_requiredServices_32_0=ruleRequiredService();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"requiredServices",
                            		lv_requiredServices_32_0, 
                            		"RequiredService");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2721:2: (otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==68) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2721:4: otherlv_33= ',' ( (lv_requiredServices_34_0= ruleRequiredService ) )
                    	    {
                    	    otherlv_33=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5773); 

                    	        	newLeafNode(otherlv_33, grammarAccess.getWorkItemAccess().getCommaKeyword_5_1_4_0());
                    	        
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2725:1: ( (lv_requiredServices_34_0= ruleRequiredService ) )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2726:1: (lv_requiredServices_34_0= ruleRequiredService )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2726:1: (lv_requiredServices_34_0= ruleRequiredService )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2727:3: lv_requiredServices_34_0= ruleRequiredService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_5_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5794);
                    	    lv_requiredServices_34_0=ruleRequiredService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiredServices",
                    	            		lv_requiredServices_34_0, 
                    	            		"RequiredService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5808); 

                        	newLeafNode(otherlv_35, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_1_5());
                        

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2747:3: ( ( (lv_hasImpacts_36_0= 'impacts' ) ) otherlv_37= '{' ( (lv_impacts_38_0= ruleImpact ) ) (otherlv_39= ',' ( (lv_impacts_40_0= ruleImpact ) ) )* otherlv_41= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==92) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2747:4: ( (lv_hasImpacts_36_0= 'impacts' ) ) otherlv_37= '{' ( (lv_impacts_38_0= ruleImpact ) ) (otherlv_39= ',' ( (lv_impacts_40_0= ruleImpact ) ) )* otherlv_41= '}'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2747:4: ( (lv_hasImpacts_36_0= 'impacts' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2748:1: (lv_hasImpacts_36_0= 'impacts' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2748:1: (lv_hasImpacts_36_0= 'impacts' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2749:3: lv_hasImpacts_36_0= 'impacts'
                    {
                    lv_hasImpacts_36_0=(Token)match(input,92,FOLLOW_92_in_ruleWorkItem5829); 

                            newLeafNode(lv_hasImpacts_36_0, grammarAccess.getWorkItemAccess().getHasImpactsImpactsKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasImpacts", true, "impacts");
                    	    

                    }


                    }

                    otherlv_37=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5854); 

                        	newLeafNode(otherlv_37, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2766:1: ( (lv_impacts_38_0= ruleImpact ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2767:1: (lv_impacts_38_0= ruleImpact )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2767:1: (lv_impacts_38_0= ruleImpact )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2768:3: lv_impacts_38_0= ruleImpact
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImpact_in_ruleWorkItem5875);
                    lv_impacts_38_0=ruleImpact();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"impacts",
                            		lv_impacts_38_0, 
                            		"Impact");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2784:2: (otherlv_39= ',' ( (lv_impacts_40_0= ruleImpact ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==68) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2784:4: otherlv_39= ',' ( (lv_impacts_40_0= ruleImpact ) )
                    	    {
                    	    otherlv_39=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5888); 

                    	        	newLeafNode(otherlv_39, grammarAccess.getWorkItemAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2788:1: ( (lv_impacts_40_0= ruleImpact ) )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2789:1: (lv_impacts_40_0= ruleImpact )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2789:1: (lv_impacts_40_0= ruleImpact )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2790:3: lv_impacts_40_0= ruleImpact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleImpact_in_ruleWorkItem5909);
                    	    lv_impacts_40_0=ruleImpact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"impacts",
                    	            		lv_impacts_40_0, 
                    	            		"Impact");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5923); 

                        	newLeafNode(otherlv_41, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2810:3: (otherlv_42= 'value' ( (lv_value_43_0= ruleNumExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==93) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2810:5: otherlv_42= 'value' ( (lv_value_43_0= ruleNumExpression ) )
                    {
                    otherlv_42=(Token)match(input,93,FOLLOW_93_in_ruleWorkItem5938); 

                        	newLeafNode(otherlv_42, grammarAccess.getWorkItemAccess().getValueKeyword_7_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2814:1: ( (lv_value_43_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2815:1: (lv_value_43_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2815:1: (lv_value_43_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2816:3: lv_value_43_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getValueNumExpressionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItem5959);
                    lv_value_43_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_43_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_44=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5973); 

                	newLeafNode(otherlv_44, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_8());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2836:1: ( (lv_id_45_0= RULE_INT ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_INT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2837:1: (lv_id_45_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2837:1: (lv_id_45_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2838:3: lv_id_45_0= RULE_INT
                    {
                    lv_id_45_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem5990); 

                    			newLeafNode(lv_id_45_0, grammarAccess.getWorkItemAccess().getIdINTTerminalRuleCall_9_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_45_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleWorkItem"


    // $ANTLR start "entryRuleRequiredService"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2862:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2863:2: (iv_ruleRequiredService= ruleRequiredService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2864:2: iv_ruleRequiredService= ruleRequiredService EOF
            {
             newCompositeNode(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_ruleRequiredService_in_entryRuleRequiredService6032);
            iv_ruleRequiredService=ruleRequiredService();

            state._fsp--;

             current =iv_ruleRequiredService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredService6042); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2871:1: ruleRequiredService returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efforts_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2874:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2875:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2875:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2875:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleRequiredService6079); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getLeftSquareBracketKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2879:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2880:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2880:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2881:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredServiceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredService6099); 

            		newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getServiceTypeServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleRequiredService6111); 

                	newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getCommaKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2896:1: ( (lv_efforts_3_0= ruleAbstractParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2897:1: (lv_efforts_3_0= ruleAbstractParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2897:1: (lv_efforts_3_0= ruleAbstractParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2898:3: lv_efforts_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getRequiredServiceAccess().getEffortsAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleRequiredService6132);
            lv_efforts_3_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiredServiceRule());
            	        }
                   		set(
                   			current, 
                   			"efforts",
                    		lv_efforts_3_0, 
                    		"AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleRequiredService6144); 

                	newLeafNode(otherlv_4, grammarAccess.getRequiredServiceAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleImpact"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2926:1: entryRuleImpact returns [EObject current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final EObject entryRuleImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpact = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2927:2: (iv_ruleImpact= ruleImpact EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2928:2: iv_ruleImpact= ruleImpact EOF
            {
             newCompositeNode(grammarAccess.getImpactRule()); 
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact6180);
            iv_ruleImpact=ruleImpact();

            state._fsp--;

             current =iv_ruleImpact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact6190); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpact"


    // $ANTLR start "ruleImpact"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2935:1: ruleImpact returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) ;
    public final EObject ruleImpact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_likelihood_2_0 = null;

        EObject lv_risk_4_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2938:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2939:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2939:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2939:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2939:2: ( (otherlv_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2940:1: (otherlv_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2940:1: (otherlv_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2941:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImpactRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImpact6235); 

            		newLeafNode(otherlv_0, grammarAccess.getImpactAccess().getImpactWIWorkItemCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleImpact6247); 

                	newLeafNode(otherlv_1, grammarAccess.getImpactAccess().getLeftSquareBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2956:1: ( (lv_likelihood_2_0= ruleAbstractParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2957:1: (lv_likelihood_2_0= ruleAbstractParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2957:1: (lv_likelihood_2_0= ruleAbstractParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2958:3: lv_likelihood_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getLikelihoodAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleImpact6268);
            lv_likelihood_2_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImpactRule());
            	        }
                   		set(
                   			current, 
                   			"likelihood",
                    		lv_likelihood_2_0, 
                    		"AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleImpact6280); 

                	newLeafNode(otherlv_3, grammarAccess.getImpactAccess().getCommaKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2978:1: ( (lv_risk_4_0= ruleAbstractParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2979:1: (lv_risk_4_0= ruleAbstractParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2979:1: (lv_risk_4_0= ruleAbstractParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2980:3: lv_risk_4_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getRiskAbstractParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleImpact6301);
            lv_risk_4_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImpactRule());
            	        }
                   		set(
                   			current, 
                   			"risk",
                    		lv_risk_4_0, 
                    		"AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleImpact6313); 

                	newLeafNode(otherlv_5, grammarAccess.getImpactAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpact"


    // $ANTLR start "entryRuleWorkItemType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3008:1: entryRuleWorkItemType returns [EObject current=null] : iv_ruleWorkItemType= ruleWorkItemType EOF ;
    public final EObject entryRuleWorkItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3009:2: (iv_ruleWorkItemType= ruleWorkItemType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3010:2: iv_ruleWorkItemType= ruleWorkItemType EOF
            {
             newCompositeNode(grammarAccess.getWorkItemTypeRule()); 
            pushFollow(FOLLOW_ruleWorkItemType_in_entryRuleWorkItemType6349);
            iv_ruleWorkItemType=ruleWorkItemType();

            state._fsp--;

             current =iv_ruleWorkItemType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemType6359); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3017:1: ruleWorkItemType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleWorkItemType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_hierarchy_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3020:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3021:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3021:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3021:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3021:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_INT) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3022:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3022:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3023:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemType6401); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3039:3: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3040:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3040:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3041:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemType6424); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleWorkItemType6441); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3061:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==14) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3061:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleWorkItemType6454); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemTypeAccess().getDescKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3065:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3066:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3066:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3067:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemType6471); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWorkItemTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3083:4: (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==94) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3083:6: otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,94,FOLLOW_94_in_ruleWorkItemType6491); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemTypeAccess().getHierarchyKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,83,FOLLOW_83_in_ruleWorkItemType6503); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkItemTypeAccess().getEqualsSignKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3091:1: ( (lv_hierarchy_7_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3092:1: (lv_hierarchy_7_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3092:1: (lv_hierarchy_7_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3093:3: lv_hierarchy_7_0= RULE_INT
                    {
                    lv_hierarchy_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemType6520); 

                    			newLeafNode(lv_hierarchy_7_0, grammarAccess.getWorkItemTypeAccess().getHierarchyINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hierarchy",
                            		lv_hierarchy_7_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleWorkItemType6539); 

                	newLeafNode(otherlv_8, grammarAccess.getWorkItemTypeAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleClassOfService"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3123:1: entryRuleClassOfService returns [EObject current=null] : iv_ruleClassOfService= ruleClassOfService EOF ;
    public final EObject entryRuleClassOfService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOfService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3124:2: (iv_ruleClassOfService= ruleClassOfService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3125:2: iv_ruleClassOfService= ruleClassOfService EOF
            {
             newCompositeNode(grammarAccess.getClassOfServiceRule()); 
            pushFollow(FOLLOW_ruleClassOfService_in_entryRuleClassOfService6577);
            iv_ruleClassOfService=ruleClassOfService();

            state._fsp--;

             current =iv_ruleClassOfService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOfService6587); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3132:1: ruleClassOfService returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleClassOfService() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_priority_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_disruptive_10_0=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3135:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3136:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3136:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3136:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3136:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3137:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3137:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3138:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleClassOfService6629); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3154:3: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3155:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3155:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3156:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassOfService6652); 

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

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleClassOfService6669); 

                	newLeafNode(otherlv_2, grammarAccess.getClassOfServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3176:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==14) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3176:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleClassOfService6682); 

                        	newLeafNode(otherlv_3, grammarAccess.getClassOfServiceAccess().getDescKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3180:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3181:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3181:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3182:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassOfService6699); 

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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3198:4: (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==95) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3198:6: otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,95,FOLLOW_95_in_ruleClassOfService6719); 

                        	newLeafNode(otherlv_5, grammarAccess.getClassOfServiceAccess().getPriorityKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,83,FOLLOW_83_in_ruleClassOfService6731); 

                        	newLeafNode(otherlv_6, grammarAccess.getClassOfServiceAccess().getEqualsSignKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3206:1: ( (lv_priority_7_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3207:1: (lv_priority_7_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3207:1: (lv_priority_7_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3208:3: lv_priority_7_0= RULE_INT
                    {
                    lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleClassOfService6748); 

                    			newLeafNode(lv_priority_7_0, grammarAccess.getClassOfServiceAccess().getPriorityINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"priority",
                            		lv_priority_7_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3224:4: (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==96) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3224:6: otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_8=(Token)match(input,96,FOLLOW_96_in_ruleClassOfService6768); 

                        	newLeafNode(otherlv_8, grammarAccess.getClassOfServiceAccess().getDisruptiveKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,59,FOLLOW_59_in_ruleClassOfService6780); 

                        	newLeafNode(otherlv_9, grammarAccess.getClassOfServiceAccess().getColonKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3232:1: ( (lv_disruptive_10_0= RULE_BOOLEAN ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3233:1: (lv_disruptive_10_0= RULE_BOOLEAN )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3233:1: (lv_disruptive_10_0= RULE_BOOLEAN )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3234:3: lv_disruptive_10_0= RULE_BOOLEAN
                    {
                    lv_disruptive_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleClassOfService6797); 

                    			newLeafNode(lv_disruptive_10_0, grammarAccess.getClassOfServiceAccess().getDisruptiveBOOLEANTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"disruptive",
                            		lv_disruptive_10_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,78,FOLLOW_78_in_ruleClassOfService6816); 

                	newLeafNode(otherlv_11, grammarAccess.getClassOfServiceAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3262:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3263:2: (iv_ruleService= ruleService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3264:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService6852);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService6862); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3271:1: ruleService returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_hierarchy_6_0=null;
        Token otherlv_7=null;
        Token lv_id_8_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3274:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3275:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3275:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3275:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3275:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3276:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3276:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3277:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService6904); 

            			newLeafNode(lv_name_0_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3293:2: (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==74) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3293:4: otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleService6922); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3297:1: (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==14) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3297:3: otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleService6935); 

                                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getDescKeyword_1_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3301:1: ( (lv_description_3_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3302:1: (lv_description_3_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3302:1: (lv_description_3_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3303:3: lv_description_3_0= RULE_STRING
                            {
                            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService6952); 

                            			newLeafNode(lv_description_3_0, grammarAccess.getServiceAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3319:4: (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==94) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3319:6: otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) )
                            {
                            otherlv_4=(Token)match(input,94,FOLLOW_94_in_ruleService6972); 

                                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getHierarchyKeyword_1_2_0());
                                
                            otherlv_5=(Token)match(input,83,FOLLOW_83_in_ruleService6984); 

                                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getEqualsSignKeyword_1_2_1());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3327:1: ( (lv_hierarchy_6_0= RULE_INT ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3328:1: (lv_hierarchy_6_0= RULE_INT )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3328:1: (lv_hierarchy_6_0= RULE_INT )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3329:3: lv_hierarchy_6_0= RULE_INT
                            {
                            lv_hierarchy_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleService7001); 

                            			newLeafNode(lv_hierarchy_6_0, grammarAccess.getServiceAccess().getHierarchyINTTerminalRuleCall_1_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"hierarchy",
                                    		lv_hierarchy_6_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleService7020); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3349:3: ( (lv_id_8_0= RULE_INT ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_INT) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3350:1: (lv_id_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3350:1: (lv_id_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3351:3: lv_id_8_0= RULE_INT
                    {
                    lv_id_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleService7039); 

                    			newLeafNode(lv_id_8_0, grammarAccess.getServiceAccess().getIdINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_8_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceProvider"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3375:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3376:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3377:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider7081);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProvider7091); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3384:1: ruleServiceProvider returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'assignTo' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'outsourceFrom' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )? (otherlv_16= 'strategy' ( (otherlv_17= RULE_ID ) ) )? (otherlv_18= 'resources' otherlv_19= ':' ( (lv_resources_20_0= ruleAsset ) )+ )? otherlv_21= '}' ( (lv_id_22_0= RULE_INT ) )? ) ;
    public final EObject ruleServiceProvider() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token lv_id_22_0=null;
        EObject lv_resources_20_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3387:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'assignTo' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'outsourceFrom' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )? (otherlv_16= 'strategy' ( (otherlv_17= RULE_ID ) ) )? (otherlv_18= 'resources' otherlv_19= ':' ( (lv_resources_20_0= ruleAsset ) )+ )? otherlv_21= '}' ( (lv_id_22_0= RULE_INT ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3388:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'assignTo' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'outsourceFrom' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )? (otherlv_16= 'strategy' ( (otherlv_17= RULE_ID ) ) )? (otherlv_18= 'resources' otherlv_19= ':' ( (lv_resources_20_0= ruleAsset ) )+ )? otherlv_21= '}' ( (lv_id_22_0= RULE_INT ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3388:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'assignTo' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'outsourceFrom' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )? (otherlv_16= 'strategy' ( (otherlv_17= RULE_ID ) ) )? (otherlv_18= 'resources' otherlv_19= ':' ( (lv_resources_20_0= ruleAsset ) )+ )? otherlv_21= '}' ( (lv_id_22_0= RULE_INT ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3388:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= '{' (otherlv_4= 'assignTo' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'outsourceFrom' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )? (otherlv_16= 'strategy' ( (otherlv_17= RULE_ID ) ) )? (otherlv_18= 'resources' otherlv_19= ':' ( (lv_resources_20_0= ruleAsset ) )+ )? otherlv_21= '}' ( (lv_id_22_0= RULE_INT ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3388:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3389:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3389:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3390:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7133); 

            			newLeafNode(lv_name_0_0, grammarAccess.getServiceProviderAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceProviderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3406:2: (otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==72) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3406:4: otherlv_1= 'type:' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleServiceProvider7151); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getTypeKeyword_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3410:1: ( (otherlv_2= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3411:1: (otherlv_2= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3411:1: (otherlv_2= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3412:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7171); 

                    		newLeafNode(otherlv_2, grammarAccess.getServiceProviderAccess().getTypeServiceProviderTypeCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleServiceProvider7185); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3427:1: (otherlv_4= 'assignTo' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==97) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3427:3: otherlv_4= 'assignTo' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,97,FOLLOW_97_in_ruleServiceProvider7198); 

                        	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getAssignToKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleServiceProvider7210); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3435:1: ( (otherlv_6= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3436:1: (otherlv_6= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3436:1: (otherlv_6= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3437:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7230); 

                    		newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3448:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==68) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3448:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7243); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3452:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3453:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3453:1: (otherlv_8= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3454:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7263); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleServiceProvider7277); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3469:3: (otherlv_10= 'outsourceFrom' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==98) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3469:5: otherlv_10= 'outsourceFrom' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,98,FOLLOW_98_in_ruleServiceProvider7292); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getOutsourceFromKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,74,FOLLOW_74_in_ruleServiceProvider7304); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3477:1: ( (otherlv_12= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3478:1: (otherlv_12= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3478:1: (otherlv_12= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3479:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7324); 

                    		newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getOutsourceFromServiceProviderCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3490:2: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==68) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3490:4: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7337); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3494:1: ( (otherlv_14= RULE_ID ) )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3495:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3495:1: (otherlv_14= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3496:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7357); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getOutsourceFromServiceProviderCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,78,FOLLOW_78_in_ruleServiceProvider7371); 

                        	newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3511:3: (otherlv_16= 'strategy' ( (otherlv_17= RULE_ID ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==99) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3511:5: otherlv_16= 'strategy' ( (otherlv_17= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,99,FOLLOW_99_in_ruleServiceProvider7386); 

                        	newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getStrategyKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3515:1: ( (otherlv_17= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3516:1: (otherlv_17= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3516:1: (otherlv_17= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3517:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7406); 

                    		newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getGovernanceStrategyGovernanceStrategyCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3528:4: (otherlv_18= 'resources' otherlv_19= ':' ( (lv_resources_20_0= ruleAsset ) )+ )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==100) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3528:6: otherlv_18= 'resources' otherlv_19= ':' ( (lv_resources_20_0= ruleAsset ) )+
                    {
                    otherlv_18=(Token)match(input,100,FOLLOW_100_in_ruleServiceProvider7421); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getResourcesKeyword_6_0());
                        
                    otherlv_19=(Token)match(input,59,FOLLOW_59_in_ruleServiceProvider7433); 

                        	newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getColonKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3536:1: ( (lv_resources_20_0= ruleAsset ) )+
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
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3537:1: (lv_resources_20_0= ruleAsset )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3537:1: (lv_resources_20_0= ruleAsset )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3538:3: lv_resources_20_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleServiceProvider7454);
                    	    lv_resources_20_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_20_0, 
                    	            		"Asset");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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


                    }
                    break;

            }

            otherlv_21=(Token)match(input,78,FOLLOW_78_in_ruleServiceProvider7469); 

                	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3558:1: ( (lv_id_22_0= RULE_INT ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3559:1: (lv_id_22_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3559:1: (lv_id_22_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3560:3: lv_id_22_0= RULE_INT
                    {
                    lv_id_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceProvider7486); 

                    			newLeafNode(lv_id_22_0, grammarAccess.getServiceProviderAccess().getIdINTTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_22_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleServiceProvider"


    // $ANTLR start "entryRuleServiceProviderType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3584:1: entryRuleServiceProviderType returns [EObject current=null] : iv_ruleServiceProviderType= ruleServiceProviderType EOF ;
    public final EObject entryRuleServiceProviderType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProviderType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3585:2: (iv_ruleServiceProviderType= ruleServiceProviderType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3586:2: iv_ruleServiceProviderType= ruleServiceProviderType EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderTypeRule()); 
            pushFollow(FOLLOW_ruleServiceProviderType_in_entryRuleServiceProviderType7528);
            iv_ruleServiceProviderType=ruleServiceProviderType();

            state._fsp--;

             current =iv_ruleServiceProviderType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProviderType7538); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceProviderType"


    // $ANTLR start "ruleServiceProviderType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3593:1: ruleServiceProviderType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleServiceProviderType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_hierarchy_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3596:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3597:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3597:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3597:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3597:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_INT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3598:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3598:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3599:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceProviderType7580); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getServiceProviderTypeAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderTypeRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3615:3: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3616:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3616:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3617:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProviderType7603); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceProviderTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceProviderTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleServiceProviderType7620); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceProviderTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3637:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==14) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3637:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleServiceProviderType7633); 

                        	newLeafNode(otherlv_3, grammarAccess.getServiceProviderTypeAccess().getDescKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3641:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3642:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3642:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3643:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceProviderType7650); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getServiceProviderTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderTypeRule());
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

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3659:4: (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==94) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3659:6: otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,94,FOLLOW_94_in_ruleServiceProviderType7670); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderTypeAccess().getHierarchyKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,83,FOLLOW_83_in_ruleServiceProviderType7682); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderTypeAccess().getEqualsSignKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3667:1: ( (lv_hierarchy_7_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3668:1: (lv_hierarchy_7_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3668:1: (lv_hierarchy_7_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3669:3: lv_hierarchy_7_0= RULE_INT
                    {
                    lv_hierarchy_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceProviderType7699); 

                    			newLeafNode(lv_hierarchy_7_0, grammarAccess.getServiceProviderTypeAccess().getHierarchyINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hierarchy",
                            		lv_hierarchy_7_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleServiceProviderType7718); 

                	newLeafNode(otherlv_8, grammarAccess.getServiceProviderTypeAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceProviderType"


    // $ANTLR start "entryRuleAsset"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3697:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3698:2: (iv_ruleAsset= ruleAsset EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3699:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset7754);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset7764); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3706:1: ruleAsset returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
        EObject lv_number_2_0 = null;

        EObject lv_skillSet_6_0 = null;

        EObject lv_skillSet_8_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3709:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3710:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3710:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3710:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3710:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3711:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3711:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3712:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset7806); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,101,FOLLOW_101_in_ruleAsset7823); 

                	newLeafNode(otherlv_1, grammarAccess.getAssetAccess().getAsteriskKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3732:1: ( (lv_number_2_0= ruleAbstractParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3733:1: (lv_number_2_0= ruleAbstractParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3733:1: (lv_number_2_0= ruleAbstractParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3734:3: lv_number_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getAssetAccess().getNumberAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleAsset7844);
            lv_number_2_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssetRule());
            	        }
                   		set(
                   			current, 
                   			"number",
                    		lv_number_2_0, 
                    		"AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleAsset7856); 

                	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3754:1: (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==102) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3754:3: otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    {
                    otherlv_4=(Token)match(input,102,FOLLOW_102_in_ruleAsset7869); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getSkillsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,59,FOLLOW_59_in_ruleAsset7881); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getColonKeyword_4_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3762:1: ( (lv_skillSet_6_0= ruleSkill ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3763:1: (lv_skillSet_6_0= ruleSkill )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3763:1: (lv_skillSet_6_0= ruleSkill )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3764:3: lv_skillSet_6_0= ruleSkill
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSkill_in_ruleAsset7902);
                    lv_skillSet_6_0=ruleSkill();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssetRule());
                    	        }
                           		add(
                           			current, 
                           			"skillSet",
                            		lv_skillSet_6_0, 
                            		"Skill");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3780:2: (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==68) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3780:4: otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) )
                    	    {
                    	    otherlv_7=(Token)match(input,68,FOLLOW_68_in_ruleAsset7915); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3784:1: ( (lv_skillSet_8_0= ruleSkill ) )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3785:1: (lv_skillSet_8_0= ruleSkill )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3785:1: (lv_skillSet_8_0= ruleSkill )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3786:3: lv_skillSet_8_0= ruleSkill
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSkill_in_ruleAsset7936);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleAsset7952); 

                	newLeafNode(otherlv_9, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3806:1: ( (lv_id_10_0= RULE_INT ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_INT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3807:1: (lv_id_10_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3807:1: (lv_id_10_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3808:3: lv_id_10_0= RULE_INT
                    {
                    lv_id_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAsset7969); 

                    			newLeafNode(lv_id_10_0, grammarAccess.getAssetAccess().getIdINTTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_10_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleSkill"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3832:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3833:2: (iv_ruleSkill= ruleSkill EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3834:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_ruleSkill_in_entryRuleSkill8011);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkill8021); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3841:1: ruleSkill returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efficiency_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3844:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3845:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3845:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3845:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleSkill8058); 

                	newLeafNode(otherlv_0, grammarAccess.getSkillAccess().getLeftSquareBracketKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3849:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3850:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3850:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3851:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkillRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkill8078); 

            		newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getServiceServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleSkill8090); 

                	newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getCommaKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3866:1: ( (lv_efficiency_3_0= ruleAbstractParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3867:1: (lv_efficiency_3_0= ruleAbstractParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3867:1: (lv_efficiency_3_0= ruleAbstractParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3868:3: lv_efficiency_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getSkillAccess().getEfficiencyAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleSkill8111);
            lv_efficiency_3_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSkillRule());
            	        }
                   		set(
                   			current, 
                   			"efficiency",
                    		lv_efficiency_3_0, 
                    		"AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleSkill8123); 

                	newLeafNode(otherlv_4, grammarAccess.getSkillAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3896:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3897:2: (iv_ruleType= ruleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3898:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType8160);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType8171); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3905:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Class_0= ruleClass | this_DataType_1= ruleDataType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Class_0 = null;

        AntlrDatatypeRuleToken this_DataType_1 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3908:28: ( (this_Class_0= ruleClass | this_DataType_1= ruleDataType ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3909:1: (this_Class_0= ruleClass | this_DataType_1= ruleDataType )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3909:1: (this_Class_0= ruleClass | this_DataType_1= ruleDataType )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=105 && LA87_0<=109)) ) {
                alt87=1;
            }
            else if ( (LA87_0==60||LA87_0==62||(LA87_0>=103 && LA87_0<=104)) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3910:5: this_Class_0= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClass_in_ruleType8218);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    		current.merge(this_Class_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3922:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType8251);
                    this_DataType_1=ruleDataType();

                    state._fsp--;


                    		current.merge(this_DataType_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3940:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3941:2: (iv_ruleDataType= ruleDataType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3942:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType8297);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType8308); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3949:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3952:28: ( (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3953:1: (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3953:1: (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' )
            int alt88=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt88=1;
                }
                break;
            case 60:
                {
                alt88=2;
                }
                break;
            case 103:
                {
                alt88=3;
                }
                break;
            case 104:
                {
                alt88=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3954:2: kw= 'string'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleDataType8346); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3961:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleDataType8365); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3968:2: kw= 'int'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleDataType8384); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3975:2: kw= 'double'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleDataType8403); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDoubleKeyword_3()); 
                        

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleClass"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3988:1: entryRuleClass returns [String current=null] : iv_ruleClass= ruleClass EOF ;
    public final String entryRuleClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3989:2: (iv_ruleClass= ruleClass EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3990:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass8444);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass8455); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3997:1: ruleClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' ) ;
    public final AntlrDatatypeRuleToken ruleClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4000:28: ( (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4001:1: (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4001:1: (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' )
            int alt89=5;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt89=1;
                }
                break;
            case 106:
                {
                alt89=2;
                }
                break;
            case 107:
                {
                alt89=3;
                }
                break;
            case 108:
                {
                alt89=4;
                }
                break;
            case 109:
                {
                alt89=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4002:2: kw= 'Agent'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleClass8493); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getAgentKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4009:2: kw= 'Task'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleClass8512); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getTaskKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4016:2: kw= 'Contract'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleClass8531); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getContractKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4023:2: kw= 'Bid'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleClass8550); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getBidKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4030:2: kw= 'Service'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleClass8569); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getServiceKeyword_4()); 
                        

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAbstractType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4043:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4044:2: (iv_ruleAbstractType= ruleAbstractType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4045:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_ruleAbstractType_in_entryRuleAbstractType8609);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractType8619); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4052:1: ruleAbstractType returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        Token lv_listType_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_mapType_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_keyType_7_0 = null;

        AntlrDatatypeRuleToken lv_valueType_9_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4055:28: ( ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4056:1: ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4056:1: ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 60:
            case 62:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
                {
                alt90=1;
                }
                break;
            case 110:
                {
                alt90=2;
                }
                break;
            case 111:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4056:2: ( (lv_type_0_0= ruleType ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4056:2: ( (lv_type_0_0= ruleType ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4057:1: (lv_type_0_0= ruleType )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4057:1: (lv_type_0_0= ruleType )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4058:3: lv_type_0_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getTypeTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractType8665);
                    lv_type_0_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4075:6: ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4075:6: ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4075:7: ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4075:7: ( (lv_listType_1_0= 'List' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4076:1: (lv_listType_1_0= 'List' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4076:1: (lv_listType_1_0= 'List' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4077:3: lv_listType_1_0= 'List'
                    {
                    lv_listType_1_0=(Token)match(input,110,FOLLOW_110_in_ruleAbstractType8690); 

                            newLeafNode(lv_listType_1_0, grammarAccess.getAbstractTypeAccess().getListTypeListKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractTypeRule());
                    	        }
                           		setWithLastConsumed(current, "listType", true, "List");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleAbstractType8715); 

                        	newLeafNode(otherlv_2, grammarAccess.getAbstractTypeAccess().getLessThanSignKeyword_1_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4094:1: ( (lv_type_3_0= ruleType ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4095:1: (lv_type_3_0= ruleType )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4095:1: (lv_type_3_0= ruleType )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4096:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getTypeTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractType8736);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleAbstractType8748); 

                        	newLeafNode(otherlv_4, grammarAccess.getAbstractTypeAccess().getGreaterThanSignKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4117:6: ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4117:6: ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4117:7: ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4117:7: ( (lv_mapType_5_0= 'Map' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4118:1: (lv_mapType_5_0= 'Map' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4118:1: (lv_mapType_5_0= 'Map' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4119:3: lv_mapType_5_0= 'Map'
                    {
                    lv_mapType_5_0=(Token)match(input,111,FOLLOW_111_in_ruleAbstractType8774); 

                            newLeafNode(lv_mapType_5_0, grammarAccess.getAbstractTypeAccess().getMapTypeMapKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractTypeRule());
                    	        }
                           		setWithLastConsumed(current, "mapType", true, "Map");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleAbstractType8799); 

                        	newLeafNode(otherlv_6, grammarAccess.getAbstractTypeAccess().getLessThanSignKeyword_2_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4136:1: ( (lv_keyType_7_0= ruleType ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4137:1: (lv_keyType_7_0= ruleType )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4137:1: (lv_keyType_7_0= ruleType )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4138:3: lv_keyType_7_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getKeyTypeTypeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractType8820);
                    lv_keyType_7_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"keyType",
                            		lv_keyType_7_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,68,FOLLOW_68_in_ruleAbstractType8832); 

                        	newLeafNode(otherlv_8, grammarAccess.getAbstractTypeAccess().getCommaKeyword_2_3());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4158:1: ( (lv_valueType_9_0= ruleType ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4159:1: (lv_valueType_9_0= ruleType )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4159:1: (lv_valueType_9_0= ruleType )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4160:3: lv_valueType_9_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getValueTypeTypeParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractType8853);
                    lv_valueType_9_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"valueType",
                            		lv_valueType_9_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleAbstractType8865); 

                        	newLeafNode(otherlv_10, grammarAccess.getAbstractTypeAccess().getGreaterThanSignKeyword_2_5());
                        

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
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRuleAttribute"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4194:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4195:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4196:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute8908);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute8918); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4203:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4206:28: ( ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4207:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4207:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4207:2: ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4207:2: ( (lv_type_0_0= ruleAbstractType ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4208:1: (lv_type_0_0= ruleAbstractType )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4208:1: (lv_type_0_0= ruleAbstractType )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4209:3: lv_type_0_0= ruleAbstractType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAbstractTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractType_in_ruleAttribute8964);
            lv_type_0_0=ruleAbstractType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"AbstractType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4225:2: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4226:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4226:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4227:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute8981); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4243:2: (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==112) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4243:4: otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) )
                    {
                    otherlv_2=(Token)match(input,112,FOLLOW_112_in_ruleAttribute8999); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDefaultKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4247:1: ( (lv_default_3_0= ruleParameter ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4248:1: (lv_default_3_0= ruleParameter )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4248:1: (lv_default_3_0= ruleParameter )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4249:3: lv_default_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getDefaultParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleAttribute9020);
                    lv_default_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_3_0, 
                            		"Parameter");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4273:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4274:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4275:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue9058);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue9068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4282:1: ruleAttributeValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4285:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4286:2: ( (otherlv_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4287:1: (otherlv_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4287:1: (otherlv_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4288:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeValueRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeValue9113); 

            		newLeafNode(otherlv_0, grammarAccess.getAttributeValueAccess().getAttributeAttributeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleAttributeValue9125); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getEqualsSignKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4303:1: ( (lv_value_2_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4304:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4304:1: (lv_value_2_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4305:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleAttributeValue9146);
            lv_value_2_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeValueRule());
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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleVariable"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4329:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4330:2: (iv_ruleVariable= ruleVariable EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4331:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable9182);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable9192); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4338:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4341:28: ( ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4342:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4342:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4342:2: ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4342:2: ( (lv_type_0_0= ruleAbstractType ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4343:1: (lv_type_0_0= ruleAbstractType )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4343:1: (lv_type_0_0= ruleAbstractType )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4344:3: lv_type_0_0= ruleAbstractType
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getTypeAbstractTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractType_in_ruleVariable9238);
            lv_type_0_0=ruleAbstractType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"AbstractType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4360:2: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4361:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4361:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4362:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable9255); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAction"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4386:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4387:2: (iv_ruleAction= ruleAction EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4388:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction9296);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction9306); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4395:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_inputs_5_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4398:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4399:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4399:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4399:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_113_in_ruleAction9343); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4403:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4404:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4404:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4405:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction9360); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,114,FOLLOW_114_in_ruleAction9377); 

                	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4425:1: ( (lv_inputs_3_0= ruleVariable ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==60||LA92_0==62||(LA92_0>=103 && LA92_0<=111)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4426:1: (lv_inputs_3_0= ruleVariable )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4426:1: (lv_inputs_3_0= ruleVariable )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4427:3: lv_inputs_3_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getInputsVariableParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleAction9398);
                    lv_inputs_3_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"inputs",
                            		lv_inputs_3_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4443:3: (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==68) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4443:5: otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleAction9412); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_4_0());
            	        
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4447:1: ( (lv_inputs_5_0= ruleVariable ) )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4448:1: (lv_inputs_5_0= ruleVariable )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4448:1: (lv_inputs_5_0= ruleVariable )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4449:3: lv_inputs_5_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionAccess().getInputsVariableParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleAction9433);
            	    lv_inputs_5_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inputs",
            	            		lv_inputs_5_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            otherlv_6=(Token)match(input,115,FOLLOW_115_in_ruleAction9447); 

                	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleState"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4477:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4478:2: (iv_ruleState= ruleState EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4479:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState9483);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState9493); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4486:1: ruleState returns [EObject current=null] : ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_backgroundState_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4489:28: ( ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4490:1: ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4490:1: ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==116) ) {
                alt95=1;
            }
            else if ( (LA95_0==117) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4490:2: ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4490:2: ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4490:3: ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4490:3: ( (lv_backgroundState_0_0= 'backgroundState' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4491:1: (lv_backgroundState_0_0= 'backgroundState' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4491:1: (lv_backgroundState_0_0= 'backgroundState' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4492:3: lv_backgroundState_0_0= 'backgroundState'
                    {
                    lv_backgroundState_0_0=(Token)match(input,116,FOLLOW_116_in_ruleState9537); 

                            newLeafNode(lv_backgroundState_0_0, grammarAccess.getStateAccess().getBackgroundStateBackgroundStateKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(current, "backgroundState", true, "backgroundState");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4505:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4506:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4506:1: (lv_name_1_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4507:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState9567); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

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


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4524:6: (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4524:6: (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4524:8: otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,117,FOLLOW_117_in_ruleState9592); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4528:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4529:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4529:1: (lv_name_3_0= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4530:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState9609); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleState9626); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_2());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4550:1: ( (lv_statements_5_0= ruleStatement ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==RULE_ID||LA94_0==119||(LA94_0>=123 && LA94_0<=125)||LA94_0==127||LA94_0==129||(LA94_0>=134 && LA94_0<=135)) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4551:1: (lv_statements_5_0= ruleStatement )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4551:1: (lv_statements_5_0= ruleStatement )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4552:3: lv_statements_5_0= ruleStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatementsStatementParserRuleCall_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleState9647);
                    	    lv_statements_5_0=ruleStatement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"statements",
                    	            		lv_statements_5_0, 
                    	            		"Statement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleState9660); 

                        	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_4());
                        

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleIfExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4580:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4581:2: (iv_ruleIfExpression= ruleIfExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4582:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
             newCompositeNode(grammarAccess.getIfExpressionRule()); 
            pushFollow(FOLLOW_ruleIfExpression_in_entryRuleIfExpression9697);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;

             current =iv_ruleIfExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpression9707); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4589:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_hasElseIf_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_condition_1_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_elseIf_8_0 = null;

        EObject lv_elses_10_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4592:28: ( (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4593:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4593:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4593:3: otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )?
            {
            otherlv_0=(Token)match(input,114,FOLLOW_114_in_ruleIfExpression9744); 

                	newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4597:1: ( (lv_condition_1_0= ruleCondition ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4598:1: (lv_condition_1_0= ruleCondition )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4598:1: (lv_condition_1_0= ruleCondition )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4599:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleIfExpression9765);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,115,FOLLOW_115_in_ruleIfExpression9777); 

                	newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleIfExpression9789); 

                	newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4623:1: ( (lv_statements_4_0= ruleStatement ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==RULE_ID||LA96_0==119||(LA96_0>=123 && LA96_0<=125)||LA96_0==127||LA96_0==129||(LA96_0>=134 && LA96_0<=135)) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4624:1: (lv_statements_4_0= ruleStatement )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4624:1: (lv_statements_4_0= ruleStatement )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4625:3: lv_statements_4_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfExpressionAccess().getStatementsStatementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfExpression9810);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_4_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleIfExpression9823); 

                	newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4645:1: (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==118) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4645:3: otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) )
                    {
                    otherlv_6=(Token)match(input,118,FOLLOW_118_in_ruleIfExpression9836); 

                        	newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getElseKeyword_6_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4649:1: ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==119) ) {
                        alt98=1;
                    }
                    else if ( (LA98_0==74) ) {
                        alt98=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4649:2: ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4649:2: ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4649:3: ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4649:3: ( (lv_hasElseIf_7_0= 'if' ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4650:1: (lv_hasElseIf_7_0= 'if' )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4650:1: (lv_hasElseIf_7_0= 'if' )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4651:3: lv_hasElseIf_7_0= 'if'
                            {
                            lv_hasElseIf_7_0=(Token)match(input,119,FOLLOW_119_in_ruleIfExpression9856); 

                                    newLeafNode(lv_hasElseIf_7_0, grammarAccess.getIfExpressionAccess().getHasElseIfIfKeyword_6_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getIfExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "hasElseIf", true, "if");
                            	    

                            }


                            }

                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4664:2: ( (lv_elseIf_8_0= ruleIfExpression ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4665:1: (lv_elseIf_8_0= ruleIfExpression )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4665:1: (lv_elseIf_8_0= ruleIfExpression )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4666:3: lv_elseIf_8_0= ruleIfExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseIfIfExpressionParserRuleCall_6_1_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleIfExpression_in_ruleIfExpression9890);
                            lv_elseIf_8_0=ruleIfExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"elseIf",
                                    		lv_elseIf_8_0, 
                                    		"IfExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4683:6: (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4683:6: (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4683:8: otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}'
                            {
                            otherlv_9=(Token)match(input,74,FOLLOW_74_in_ruleIfExpression9910); 

                                	newLeafNode(otherlv_9, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_6_1_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4687:1: ( (lv_elses_10_0= ruleStatement ) )*
                            loop97:
                            do {
                                int alt97=2;
                                int LA97_0 = input.LA(1);

                                if ( (LA97_0==RULE_ID||LA97_0==119||(LA97_0>=123 && LA97_0<=125)||LA97_0==127||LA97_0==129||(LA97_0>=134 && LA97_0<=135)) ) {
                                    alt97=1;
                                }


                                switch (alt97) {
                            	case 1 :
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4688:1: (lv_elses_10_0= ruleStatement )
                            	    {
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4688:1: (lv_elses_10_0= ruleStatement )
                            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4689:3: lv_elses_10_0= ruleStatement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElsesStatementParserRuleCall_6_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfExpression9931);
                            	    lv_elses_10_0=ruleStatement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"elses",
                            	            		lv_elses_10_0, 
                            	            		"Statement");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop97;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,78,FOLLOW_78_in_ruleIfExpression9944); 

                                	newLeafNode(otherlv_11, grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_6_1_1_2());
                                

                            }


                            }
                            break;

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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleForExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4717:1: entryRuleForExpression returns [EObject current=null] : iv_ruleForExpression= ruleForExpression EOF ;
    public final EObject entryRuleForExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4718:2: (iv_ruleForExpression= ruleForExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4719:2: iv_ruleForExpression= ruleForExpression EOF
            {
             newCompositeNode(grammarAccess.getForExpressionRule()); 
            pushFollow(FOLLOW_ruleForExpression_in_entryRuleForExpression9984);
            iv_ruleForExpression=ruleForExpression();

            state._fsp--;

             current =iv_ruleForExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForExpression9994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForExpression"


    // $ANTLR start "ruleForExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4726:1: ruleForExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) ;
    public final EObject ruleForExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_object_1_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4729:28: ( (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4730:1: (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4730:1: (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4730:3: otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_114_in_ruleForExpression10031); 

                	newLeafNode(otherlv_0, grammarAccess.getForExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4734:1: ( (lv_object_1_0= ruleVarExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4735:1: (lv_object_1_0= ruleVarExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4735:1: (lv_object_1_0= ruleVarExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4736:3: lv_object_1_0= ruleVarExpression
            {
             
            	        newCompositeNode(grammarAccess.getForExpressionAccess().getObjectVarExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarExpression_in_ruleForExpression10052);
            lv_object_1_0=ruleVarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"object",
                    		lv_object_1_0, 
                    		"VarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,120,FOLLOW_120_in_ruleForExpression10064); 

                	newLeafNode(otherlv_2, grammarAccess.getForExpressionAccess().getInKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4756:1: ( (lv_set_3_0= ruleVarExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4757:1: (lv_set_3_0= ruleVarExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4757:1: (lv_set_3_0= ruleVarExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4758:3: lv_set_3_0= ruleVarExpression
            {
             
            	        newCompositeNode(grammarAccess.getForExpressionAccess().getSetVarExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVarExpression_in_ruleForExpression10085);
            lv_set_3_0=ruleVarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"set",
                    		lv_set_3_0, 
                    		"VarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,115,FOLLOW_115_in_ruleForExpression10097); 

                	newLeafNode(otherlv_4, grammarAccess.getForExpressionAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleForExpression10109); 

                	newLeafNode(otherlv_5, grammarAccess.getForExpressionAccess().getLeftCurlyBracketKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4782:1: ( (lv_statements_6_0= ruleStatement ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==RULE_ID||LA100_0==119||(LA100_0>=123 && LA100_0<=125)||LA100_0==127||LA100_0==129||(LA100_0>=134 && LA100_0<=135)) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4783:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4783:1: (lv_statements_6_0= ruleStatement )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4784:3: lv_statements_6_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForExpressionAccess().getStatementsStatementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleForExpression10130);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_6_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleForExpression10143); 

                	newLeafNode(otherlv_7, grammarAccess.getForExpressionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForExpression"


    // $ANTLR start "entryRuleWhileExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4812:1: entryRuleWhileExpression returns [EObject current=null] : iv_ruleWhileExpression= ruleWhileExpression EOF ;
    public final EObject entryRuleWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4813:2: (iv_ruleWhileExpression= ruleWhileExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4814:2: iv_ruleWhileExpression= ruleWhileExpression EOF
            {
             newCompositeNode(grammarAccess.getWhileExpressionRule()); 
            pushFollow(FOLLOW_ruleWhileExpression_in_entryRuleWhileExpression10179);
            iv_ruleWhileExpression=ruleWhileExpression();

            state._fsp--;

             current =iv_ruleWhileExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileExpression10189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileExpression"


    // $ANTLR start "ruleWhileExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4821:1: ruleWhileExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
    public final EObject ruleWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_1_0 = null;

        EObject lv_statements_4_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4824:28: ( (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4825:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4825:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4825:3: otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_114_in_ruleWhileExpression10226); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4829:1: ( (lv_condition_1_0= ruleCondition ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4830:1: (lv_condition_1_0= ruleCondition )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4830:1: (lv_condition_1_0= ruleCondition )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4831:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getWhileExpressionAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleWhileExpression10247);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,115,FOLLOW_115_in_ruleWhileExpression10259); 

                	newLeafNode(otherlv_2, grammarAccess.getWhileExpressionAccess().getRightParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleWhileExpression10271); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileExpressionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4855:1: ( (lv_statements_4_0= ruleStatement ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==RULE_ID||LA101_0==119||(LA101_0>=123 && LA101_0<=125)||LA101_0==127||LA101_0==129||(LA101_0>=134 && LA101_0<=135)) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4856:1: (lv_statements_4_0= ruleStatement )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4856:1: (lv_statements_4_0= ruleStatement )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4857:3: lv_statements_4_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhileExpressionAccess().getStatementsStatementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleWhileExpression10292);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_4_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleWhileExpression10305); 

                	newLeafNode(otherlv_5, grammarAccess.getWhileExpressionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileExpression"


    // $ANTLR start "entryRuleCondition"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4885:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4886:2: (iv_ruleCondition= ruleCondition EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4887:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition10341);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition10351); 

            }

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4894:1: ruleCondition returns [EObject current=null] : ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_7=null;
        Token lv_hasAnd_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_hasOr_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_subjective_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_objective_2_0 = null;

        EObject lv_subjective_4_0 = null;

        EObject lv_operator_5_0 = null;

        EObject lv_objective_6_0 = null;

        EObject lv_andCondition_10_0 = null;

        EObject lv_orCondition_14_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4897:28: ( ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4898:1: ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4898:1: ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4898:2: ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4898:2: ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_ID||(LA102_0>=134 && LA102_0<=135)) ) {
                alt102=1;
            }
            else if ( (LA102_0==114) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4898:3: ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4898:3: ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4898:4: ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4898:4: ( (lv_subjective_0_0= ruleVarExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4899:1: (lv_subjective_0_0= ruleVarExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4899:1: (lv_subjective_0_0= ruleVarExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4900:3: lv_subjective_0_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getSubjectiveVarExpressionParserRuleCall_0_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarExpression_in_ruleCondition10399);
                    lv_subjective_0_0=ruleVarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"subjective",
                            		lv_subjective_0_0, 
                            		"VarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4916:2: ( (lv_operator_1_0= ruleOperator ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4917:1: (lv_operator_1_0= ruleOperator )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4917:1: (lv_operator_1_0= ruleOperator )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4918:3: lv_operator_1_0= ruleOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperator_in_ruleCondition10420);
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

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4934:2: ( (lv_objective_2_0= ruleExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4935:1: (lv_objective_2_0= ruleExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4935:1: (lv_objective_2_0= ruleExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4936:3: lv_objective_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCondition10441);
                    lv_objective_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"objective",
                            		lv_objective_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4953:6: (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4953:6: (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4953:8: otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,114,FOLLOW_114_in_ruleCondition10461); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_1_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4957:1: ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4957:2: ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4957:2: ( (lv_subjective_4_0= ruleVarExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4958:1: (lv_subjective_4_0= ruleVarExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4958:1: (lv_subjective_4_0= ruleVarExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4959:3: lv_subjective_4_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getSubjectiveVarExpressionParserRuleCall_0_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarExpression_in_ruleCondition10483);
                    lv_subjective_4_0=ruleVarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"subjective",
                            		lv_subjective_4_0, 
                            		"VarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4975:2: ( (lv_operator_5_0= ruleOperator ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4976:1: (lv_operator_5_0= ruleOperator )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4976:1: (lv_operator_5_0= ruleOperator )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4977:3: lv_operator_5_0= ruleOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperator_in_ruleCondition10504);
                    lv_operator_5_0=ruleOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_5_0, 
                            		"Operator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4993:2: ( (lv_objective_6_0= ruleExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4994:1: (lv_objective_6_0= ruleExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4994:1: (lv_objective_6_0= ruleExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4995:3: lv_objective_6_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCondition10525);
                    lv_objective_6_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"objective",
                            		lv_objective_6_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,115,FOLLOW_115_in_ruleCondition10538); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_1_2());
                        

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5015:3: ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )?
            int alt103=3;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==121) ) {
                alt103=1;
            }
            else if ( (LA103_0==122) ) {
                alt103=2;
            }
            switch (alt103) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5015:4: ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5015:4: ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5015:5: ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5015:5: ( (lv_hasAnd_8_0= 'and' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5016:1: (lv_hasAnd_8_0= 'and' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5016:1: (lv_hasAnd_8_0= 'and' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5017:3: lv_hasAnd_8_0= 'and'
                    {
                    lv_hasAnd_8_0=(Token)match(input,121,FOLLOW_121_in_ruleCondition10560); 

                            newLeafNode(lv_hasAnd_8_0, grammarAccess.getConditionAccess().getHasAndAndKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionRule());
                    	        }
                           		setWithLastConsumed(current, "hasAnd", true, "and");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,114,FOLLOW_114_in_ruleCondition10585); 

                        	newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_0_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5034:1: ( (lv_andCondition_10_0= ruleCondition ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5035:1: (lv_andCondition_10_0= ruleCondition )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5035:1: (lv_andCondition_10_0= ruleCondition )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5036:3: lv_andCondition_10_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getAndConditionConditionParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleCondition10606);
                    lv_andCondition_10_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"andCondition",
                            		lv_andCondition_10_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,115,FOLLOW_115_in_ruleCondition10618); 

                        	newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getRightParenthesisKeyword_1_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5057:6: ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5057:6: ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5057:7: ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5057:7: ( (lv_hasOr_12_0= 'or' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5058:1: (lv_hasOr_12_0= 'or' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5058:1: (lv_hasOr_12_0= 'or' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5059:3: lv_hasOr_12_0= 'or'
                    {
                    lv_hasOr_12_0=(Token)match(input,122,FOLLOW_122_in_ruleCondition10644); 

                            newLeafNode(lv_hasOr_12_0, grammarAccess.getConditionAccess().getHasOrOrKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionRule());
                    	        }
                           		setWithLastConsumed(current, "hasOr", true, "or");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,114,FOLLOW_114_in_ruleCondition10669); 

                        	newLeafNode(otherlv_13, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_1_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5076:1: ( (lv_orCondition_14_0= ruleCondition ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5077:1: (lv_orCondition_14_0= ruleCondition )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5077:1: (lv_orCondition_14_0= ruleCondition )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5078:3: lv_orCondition_14_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getOrConditionConditionParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleCondition10690);
                    lv_orCondition_14_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"orCondition",
                            		lv_orCondition_14_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,115,FOLLOW_115_in_ruleCondition10702); 

                        	newLeafNode(otherlv_15, grammarAccess.getConditionAccess().getRightParenthesisKeyword_1_1_3());
                        

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5108:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement10741);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement10751); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5115:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_isAction_0_0=null;
        Token lv_isChangeState_2_0=null;
        Token lv_isDeclaration_4_0=null;
        Token lv_isIfExpression_6_0=null;
        Token otherlv_8=null;
        Token lv_isForExpression_9_0=null;
        Token otherlv_11=null;
        Token lv_isWhileExpression_12_0=null;
        Token otherlv_14=null;
        EObject lv_actionStatement_1_0 = null;

        EObject lv_changeStateStatement_3_0 = null;

        EObject lv_declarationStatement_5_0 = null;

        EObject lv_ifExpression_7_0 = null;

        EObject lv_forExpression_10_0 = null;

        EObject lv_whileExpression_13_0 = null;

        EObject lv_assertStatement_15_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5118:28: ( ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5119:1: ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5119:1: ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) )
            int alt104=7;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt104=1;
                }
                break;
            case 124:
                {
                alt104=2;
                }
                break;
            case 125:
                {
                alt104=3;
                }
                break;
            case 119:
                {
                alt104=4;
                }
                break;
            case 127:
                {
                alt104=5;
                }
                break;
            case 129:
                {
                alt104=6;
                }
                break;
            case RULE_ID:
            case 134:
            case 135:
                {
                alt104=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5119:2: ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5119:2: ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5119:3: ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5119:3: ( (lv_isAction_0_0= 'Do' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5120:1: (lv_isAction_0_0= 'Do' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5120:1: (lv_isAction_0_0= 'Do' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5121:3: lv_isAction_0_0= 'Do'
                    {
                    lv_isAction_0_0=(Token)match(input,123,FOLLOW_123_in_ruleStatement10795); 

                            newLeafNode(lv_isAction_0_0, grammarAccess.getStatementAccess().getIsActionDoKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isAction", true, "Do");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5134:2: ( (lv_actionStatement_1_0= ruleActionStatement ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5135:1: (lv_actionStatement_1_0= ruleActionStatement )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5135:1: (lv_actionStatement_1_0= ruleActionStatement )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5136:3: lv_actionStatement_1_0= ruleActionStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getActionStatementActionStatementParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionStatement_in_ruleStatement10829);
                    lv_actionStatement_1_0=ruleActionStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"actionStatement",
                            		lv_actionStatement_1_0, 
                            		"ActionStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5153:6: ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5153:6: ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5153:7: ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5153:7: ( (lv_isChangeState_2_0= '->' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5154:1: (lv_isChangeState_2_0= '->' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5154:1: (lv_isChangeState_2_0= '->' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5155:3: lv_isChangeState_2_0= '->'
                    {
                    lv_isChangeState_2_0=(Token)match(input,124,FOLLOW_124_in_ruleStatement10855); 

                            newLeafNode(lv_isChangeState_2_0, grammarAccess.getStatementAccess().getIsChangeStateHyphenMinusGreaterThanSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isChangeState", true, "->");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5168:2: ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5169:1: (lv_changeStateStatement_3_0= ruleChangeStateStatement )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5169:1: (lv_changeStateStatement_3_0= ruleChangeStateStatement )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5170:3: lv_changeStateStatement_3_0= ruleChangeStateStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getChangeStateStatementChangeStateStatementParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChangeStateStatement_in_ruleStatement10889);
                    lv_changeStateStatement_3_0=ruleChangeStateStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"changeStateStatement",
                            		lv_changeStateStatement_3_0, 
                            		"ChangeStateStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5187:6: ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5187:6: ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5187:7: ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5187:7: ( (lv_isDeclaration_4_0= 'var' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5188:1: (lv_isDeclaration_4_0= 'var' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5188:1: (lv_isDeclaration_4_0= 'var' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5189:3: lv_isDeclaration_4_0= 'var'
                    {
                    lv_isDeclaration_4_0=(Token)match(input,125,FOLLOW_125_in_ruleStatement10915); 

                            newLeafNode(lv_isDeclaration_4_0, grammarAccess.getStatementAccess().getIsDeclarationVarKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isDeclaration", true, "var");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5202:2: ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5203:1: (lv_declarationStatement_5_0= ruleDeclarationStatement )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5203:1: (lv_declarationStatement_5_0= ruleDeclarationStatement )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5204:3: lv_declarationStatement_5_0= ruleDeclarationStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getDeclarationStatementDeclarationStatementParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeclarationStatement_in_ruleStatement10949);
                    lv_declarationStatement_5_0=ruleDeclarationStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"declarationStatement",
                            		lv_declarationStatement_5_0, 
                            		"DeclarationStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5221:6: ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5221:6: ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5221:7: ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5221:7: ( (lv_isIfExpression_6_0= 'if' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5222:1: (lv_isIfExpression_6_0= 'if' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5222:1: (lv_isIfExpression_6_0= 'if' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5223:3: lv_isIfExpression_6_0= 'if'
                    {
                    lv_isIfExpression_6_0=(Token)match(input,119,FOLLOW_119_in_ruleStatement10975); 

                            newLeafNode(lv_isIfExpression_6_0, grammarAccess.getStatementAccess().getIsIfExpressionIfKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isIfExpression", true, "if");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5236:2: ( (lv_ifExpression_7_0= ruleIfExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5237:1: (lv_ifExpression_7_0= ruleIfExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5237:1: (lv_ifExpression_7_0= ruleIfExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5238:3: lv_ifExpression_7_0= ruleIfExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getIfExpressionIfExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIfExpression_in_ruleStatement11009);
                    lv_ifExpression_7_0=ruleIfExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"ifExpression",
                            		lv_ifExpression_7_0, 
                            		"IfExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,126,FOLLOW_126_in_ruleStatement11021); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getEndIfKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5259:6: ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5259:6: ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5259:7: ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5259:7: ( (lv_isForExpression_9_0= 'for' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5260:1: (lv_isForExpression_9_0= 'for' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5260:1: (lv_isForExpression_9_0= 'for' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5261:3: lv_isForExpression_9_0= 'for'
                    {
                    lv_isForExpression_9_0=(Token)match(input,127,FOLLOW_127_in_ruleStatement11047); 

                            newLeafNode(lv_isForExpression_9_0, grammarAccess.getStatementAccess().getIsForExpressionForKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isForExpression", true, "for");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5274:2: ( (lv_forExpression_10_0= ruleForExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5275:1: (lv_forExpression_10_0= ruleForExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5275:1: (lv_forExpression_10_0= ruleForExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5276:3: lv_forExpression_10_0= ruleForExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getForExpressionForExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForExpression_in_ruleStatement11081);
                    lv_forExpression_10_0=ruleForExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"forExpression",
                            		lv_forExpression_10_0, 
                            		"ForExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,128,FOLLOW_128_in_ruleStatement11093); 

                        	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getEndForKeyword_4_2());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5297:6: ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5297:6: ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5297:7: ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5297:7: ( (lv_isWhileExpression_12_0= 'while' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5298:1: (lv_isWhileExpression_12_0= 'while' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5298:1: (lv_isWhileExpression_12_0= 'while' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5299:3: lv_isWhileExpression_12_0= 'while'
                    {
                    lv_isWhileExpression_12_0=(Token)match(input,129,FOLLOW_129_in_ruleStatement11119); 

                            newLeafNode(lv_isWhileExpression_12_0, grammarAccess.getStatementAccess().getIsWhileExpressionWhileKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isWhileExpression", true, "while");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5312:2: ( (lv_whileExpression_13_0= ruleWhileExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5313:1: (lv_whileExpression_13_0= ruleWhileExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5313:1: (lv_whileExpression_13_0= ruleWhileExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5314:3: lv_whileExpression_13_0= ruleWhileExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getWhileExpressionWhileExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhileExpression_in_ruleStatement11153);
                    lv_whileExpression_13_0=ruleWhileExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"whileExpression",
                            		lv_whileExpression_13_0, 
                            		"WhileExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,130,FOLLOW_130_in_ruleStatement11165); 

                        	newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getEndWhileKeyword_5_2());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5335:6: ( (lv_assertStatement_15_0= ruleAssertStatement ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5335:6: ( (lv_assertStatement_15_0= ruleAssertStatement ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5336:1: (lv_assertStatement_15_0= ruleAssertStatement )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5336:1: (lv_assertStatement_15_0= ruleAssertStatement )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5337:3: lv_assertStatement_15_0= ruleAssertStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getAssertStatementAssertStatementParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssertStatement_in_ruleStatement11193);
                    lv_assertStatement_15_0=ruleAssertStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"assertStatement",
                            		lv_assertStatement_15_0, 
                            		"AssertStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDeclarationStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5361:1: entryRuleDeclarationStatement returns [EObject current=null] : iv_ruleDeclarationStatement= ruleDeclarationStatement EOF ;
    public final EObject entryRuleDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationStatement = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5362:2: (iv_ruleDeclarationStatement= ruleDeclarationStatement EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5363:2: iv_ruleDeclarationStatement= ruleDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getDeclarationStatementRule()); 
            pushFollow(FOLLOW_ruleDeclarationStatement_in_entryRuleDeclarationStatement11229);
            iv_ruleDeclarationStatement=ruleDeclarationStatement();

            state._fsp--;

             current =iv_ruleDeclarationStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationStatement11239); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationStatement"


    // $ANTLR start "ruleDeclarationStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5370:1: ruleDeclarationStatement returns [EObject current=null] : (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5373:28: ( (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5374:1: (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5374:1: (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5375:5: this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getDeclarationStatementAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleVariable_in_ruleDeclarationStatement11286);
            this_Variable_0=ruleVariable();

            state._fsp--;

             
                    current = this_Variable_0; 
                    afterParserOrEnumRuleCall();
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5383:1: ()
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5384:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getDeclarationStatementAccess().getDeclarationStatementVariableAction_1(),
                        current);
                

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5389:2: (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==83) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5389:4: otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,83,FOLLOW_83_in_ruleDeclarationStatement11307); 

                        	newLeafNode(otherlv_2, grammarAccess.getDeclarationStatementAccess().getEqualsSignKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5393:1: ( (lv_value_3_0= ruleExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5394:1: (lv_value_3_0= ruleExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5394:1: (lv_value_3_0= ruleExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5395:3: lv_value_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationStatementAccess().getValueExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleDeclarationStatement11328);
                    lv_value_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"Expression");
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
    // $ANTLR end "ruleDeclarationStatement"


    // $ANTLR start "entryRuleActionStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5419:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5420:2: (iv_ruleActionStatement= ruleActionStatement EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5421:2: iv_ruleActionStatement= ruleActionStatement EOF
            {
             newCompositeNode(grammarAccess.getActionStatementRule()); 
            pushFollow(FOLLOW_ruleActionStatement_in_entryRuleActionStatement11366);
            iv_ruleActionStatement=ruleActionStatement();

            state._fsp--;

             current =iv_ruleActionStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStatement11376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionStatement"


    // $ANTLR start "ruleActionStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5428:1: ruleActionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )? otherlv_3= ')' ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputs_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5431:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )? otherlv_3= ')' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5432:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )? otherlv_3= ')' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5432:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )? otherlv_3= ')' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5432:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )? otherlv_3= ')'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5432:2: ( (otherlv_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5433:1: (otherlv_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5433:1: (otherlv_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5434:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionStatement11421); 

            		newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getActionActionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,114,FOLLOW_114_in_ruleActionStatement11433); 

                	newLeafNode(otherlv_1, grammarAccess.getActionStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5449:1: ( (lv_inputs_2_0= ruleVarExpression ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID||(LA106_0>=134 && LA106_0<=135)) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5450:1: (lv_inputs_2_0= ruleVarExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5450:1: (lv_inputs_2_0= ruleVarExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5451:3: lv_inputs_2_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionStatementAccess().getInputsVarExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarExpression_in_ruleActionStatement11454);
                    lv_inputs_2_0=ruleVarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionStatementRule());
                    	        }
                           		add(
                           			current, 
                           			"inputs",
                            		lv_inputs_2_0, 
                            		"VarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,115,FOLLOW_115_in_ruleActionStatement11467); 

                	newLeafNode(otherlv_3, grammarAccess.getActionStatementAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionStatement"


    // $ANTLR start "entryRuleAssertStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5479:1: entryRuleAssertStatement returns [EObject current=null] : iv_ruleAssertStatement= ruleAssertStatement EOF ;
    public final EObject entryRuleAssertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertStatement = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5480:2: (iv_ruleAssertStatement= ruleAssertStatement EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5481:2: iv_ruleAssertStatement= ruleAssertStatement EOF
            {
             newCompositeNode(grammarAccess.getAssertStatementRule()); 
            pushFollow(FOLLOW_ruleAssertStatement_in_entryRuleAssertStatement11503);
            iv_ruleAssertStatement=ruleAssertStatement();

            state._fsp--;

             current =iv_ruleAssertStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertStatement11513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertStatement"


    // $ANTLR start "ruleAssertStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5488:1: ruleAssertStatement returns [EObject current=null] : ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_input_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5491:28: ( ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5492:1: ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5492:1: ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5492:2: ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5492:2: ( (lv_input_0_0= ruleVarExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5493:1: (lv_input_0_0= ruleVarExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5493:1: (lv_input_0_0= ruleVarExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5494:3: lv_input_0_0= ruleVarExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssertStatementAccess().getInputVarExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVarExpression_in_ruleAssertStatement11559);
            lv_input_0_0=ruleVarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertStatementRule());
            	        }
                   		set(
                   			current, 
                   			"input",
                    		lv_input_0_0, 
                    		"VarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleAssertStatement11571); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertStatementAccess().getEqualsSignKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5514:1: ( (lv_value_2_0= ruleExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5515:1: (lv_value_2_0= ruleExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5515:1: (lv_value_2_0= ruleExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5516:3: lv_value_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssertStatementAccess().getValueExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssertStatement11592);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertStatementRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Expression");
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
    // $ANTLR end "ruleAssertStatement"


    // $ANTLR start "entryRuleChangeStateStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5540:1: entryRuleChangeStateStatement returns [EObject current=null] : iv_ruleChangeStateStatement= ruleChangeStateStatement EOF ;
    public final EObject entryRuleChangeStateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeStateStatement = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5541:2: (iv_ruleChangeStateStatement= ruleChangeStateStatement EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5542:2: iv_ruleChangeStateStatement= ruleChangeStateStatement EOF
            {
             newCompositeNode(grammarAccess.getChangeStateStatementRule()); 
            pushFollow(FOLLOW_ruleChangeStateStatement_in_entryRuleChangeStateStatement11628);
            iv_ruleChangeStateStatement=ruleChangeStateStatement();

            state._fsp--;

             current =iv_ruleChangeStateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeStateStatement11638); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeStateStatement"


    // $ANTLR start "ruleChangeStateStatement"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5549:1: ruleChangeStateStatement returns [EObject current=null] : (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleChangeStateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5552:28: ( (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5553:1: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5553:1: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5553:3: otherlv_0= 'state' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,117,FOLLOW_117_in_ruleChangeStateStatement11675); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeStateStatementAccess().getStateKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5557:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5558:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5558:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5559:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChangeStateStatementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChangeStateStatement11695); 

            		newLeafNode(otherlv_1, grammarAccess.getChangeStateStatementAccess().getTargetStateStateCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleChangeStateStatement"


    // $ANTLR start "entryRuleExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5578:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5579:2: (iv_ruleExpression= ruleExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5580:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression11731);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression11741); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5587:1: ruleExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5590:28: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5591:1: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5591:1: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5592:5: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleExpression11788);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5600:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( ((LA108_0>=131 && LA108_0<=132)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5600:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5600:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt107=2;
            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==131) ) {
            	        alt107=1;
            	    }
            	    else if ( (LA107_0==132) ) {
            	        alt107=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 107, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt107) {
            	        case 1 :
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5600:3: ( () otherlv_2= '+' )
            	            {
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5600:3: ( () otherlv_2= '+' )
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5600:4: () otherlv_2= '+'
            	            {
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5600:4: ()
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5601:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,131,FOLLOW_131_in_ruleExpression11811); 

            	                	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5611:6: ( () otherlv_4= '-' )
            	            {
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5611:6: ( () otherlv_4= '-' )
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5611:7: () otherlv_4= '-'
            	            {
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5611:7: ()
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5612:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,132,FOLLOW_132_in_ruleExpression11840); 

            	                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5621:3: ( (lv_right_5_0= ruleTerm ) )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5622:1: (lv_right_5_0= ruleTerm )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5622:1: (lv_right_5_0= ruleTerm )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5623:3: lv_right_5_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleExpression11863);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop108;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerm"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5647:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5648:2: (iv_ruleTerm= ruleTerm EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5649:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm11901);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm11911); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5656:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5659:28: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5660:1: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5660:1: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5661:5: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFactor_in_ruleTerm11958);
            this_Factor_0=ruleFactor();

            state._fsp--;

             
                    current = this_Factor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5669:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==101||LA110_0==133) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5669:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5669:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==101) ) {
            	        alt109=1;
            	    }
            	    else if ( (LA109_0==133) ) {
            	        alt109=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 109, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5669:3: ( () otherlv_2= '*' )
            	            {
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5669:3: ( () otherlv_2= '*' )
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5669:4: () otherlv_2= '*'
            	            {
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5669:4: ()
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5670:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,101,FOLLOW_101_in_ruleTerm11981); 

            	                	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5680:6: ( () otherlv_4= '/' )
            	            {
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5680:6: ( () otherlv_4= '/' )
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5680:7: () otherlv_4= '/'
            	            {
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5680:7: ()
            	            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5681:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,133,FOLLOW_133_in_ruleTerm12010); 

            	                	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5690:3: ( (lv_right_5_0= ruleFactor ) )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5691:1: (lv_right_5_0= ruleFactor )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5691:1: (lv_right_5_0= ruleFactor )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5692:3: lv_right_5_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleTerm12033);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5716:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5717:2: (iv_ruleFactor= ruleFactor EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5718:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor12071);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor12081); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5725:1: ruleFactor returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_boolean_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5728:28: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5729:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5729:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            int alt111=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt111=1;
                }
                break;
            case RULE_ID:
            case 134:
            case 135:
                {
                alt111=2;
                }
                break;
            case RULE_STRING:
                {
                alt111=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt111=4;
                }
                break;
            case 114:
                {
                alt111=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5729:2: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5729:2: ( (lv_number_0_0= ruleNumber ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5730:1: (lv_number_0_0= ruleNumber )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5730:1: (lv_number_0_0= ruleNumber )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5731:3: lv_number_0_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleFactor12127);
                    lv_number_0_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5748:6: ( (lv_variable_1_0= ruleVarExpression ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5748:6: ( (lv_variable_1_0= ruleVarExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5749:1: (lv_variable_1_0= ruleVarExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5749:1: (lv_variable_1_0= ruleVarExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5750:3: lv_variable_1_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getVariableVarExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarExpression_in_ruleFactor12154);
                    lv_variable_1_0=ruleVarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_1_0, 
                            		"VarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5767:6: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5767:6: ( (lv_string_2_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5768:1: (lv_string_2_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5768:1: (lv_string_2_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5769:3: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFactor12177); 

                    			newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5786:6: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5786:6: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5787:1: (lv_boolean_3_0= RULE_BOOLEAN )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5787:1: (lv_boolean_3_0= RULE_BOOLEAN )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5788:3: lv_boolean_3_0= RULE_BOOLEAN
                    {
                    lv_boolean_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleFactor12205); 

                    			newLeafNode(lv_boolean_3_0, grammarAccess.getFactorAccess().getBooleanBOOLEANTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"boolean",
                            		lv_boolean_3_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5805:6: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5805:6: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5805:8: otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,114,FOLLOW_114_in_ruleFactor12229); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5809:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5810:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5810:1: (lv_expression_5_0= ruleExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5811:3: lv_expression_5_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFactor12250);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,115,FOLLOW_115_in_ruleFactor12262); 

                        	newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getRightParenthesisKeyword_4_2());
                        

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleVarExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5839:1: entryRuleVarExpression returns [EObject current=null] : iv_ruleVarExpression= ruleVarExpression EOF ;
    public final EObject entryRuleVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5840:2: (iv_ruleVarExpression= ruleVarExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5841:2: iv_ruleVarExpression= ruleVarExpression EOF
            {
             newCompositeNode(grammarAccess.getVarExpressionRule()); 
            pushFollow(FOLLOW_ruleVarExpression_in_entryRuleVarExpression12299);
            iv_ruleVarExpression=ruleVarExpression();

            state._fsp--;

             current =iv_ruleVarExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarExpression12309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarExpression"


    // $ANTLR start "ruleVarExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5848:1: ruleVarExpression returns [EObject current=null] : ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* ) ;
    public final EObject ruleVarExpression() throws RecognitionException {
        EObject current = null;

        Token lv_self_0_0=null;
        Token lv_context_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_variable_2_0 = null;

        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5851:28: ( ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5852:1: ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5852:1: ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5852:2: ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )*
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5852:2: ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) )
            int alt112=3;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt112=1;
                }
                break;
            case 135:
                {
                alt112=2;
                }
                break;
            case RULE_ID:
                {
                alt112=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5852:3: ( (lv_self_0_0= 'self' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5852:3: ( (lv_self_0_0= 'self' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5853:1: (lv_self_0_0= 'self' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5853:1: (lv_self_0_0= 'self' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5854:3: lv_self_0_0= 'self'
                    {
                    lv_self_0_0=(Token)match(input,134,FOLLOW_134_in_ruleVarExpression12353); 

                            newLeafNode(lv_self_0_0, grammarAccess.getVarExpressionAccess().getSelfSelfKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "self", true, "self");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5868:6: ( (lv_context_1_0= 'context' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5868:6: ( (lv_context_1_0= 'context' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5869:1: (lv_context_1_0= 'context' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5869:1: (lv_context_1_0= 'context' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5870:3: lv_context_1_0= 'context'
                    {
                    lv_context_1_0=(Token)match(input,135,FOLLOW_135_in_ruleVarExpression12390); 

                            newLeafNode(lv_context_1_0, grammarAccess.getVarExpressionAccess().getContextContextKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "context", true, "context");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5884:6: ( (lv_variable_2_0= ruleQualifiedName ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5884:6: ( (lv_variable_2_0= ruleQualifiedName ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5885:1: (lv_variable_2_0= ruleQualifiedName )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5885:1: (lv_variable_2_0= ruleQualifiedName )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5886:3: lv_variable_2_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarExpressionAccess().getVariableQualifiedNameParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleVarExpression12430);
                    lv_variable_2_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_2_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5902:3: (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==50) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5902:5: otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) )
            	    {
            	    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleVarExpression12444); 

            	        	newLeafNode(otherlv_3, grammarAccess.getVarExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5906:1: ( (lv_methods_4_0= ruleMethod ) )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5907:1: (lv_methods_4_0= ruleMethod )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5907:1: (lv_methods_4_0= ruleMethod )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5908:3: lv_methods_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVarExpressionAccess().getMethodsMethodParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleVarExpression12465);
            	    lv_methods_4_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVarExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_4_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleVarExpression"


    // $ANTLR start "entryRuleMethod"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5932:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5933:2: (iv_ruleMethod= ruleMethod EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5934:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod12503);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod12513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5941:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_functionMethod_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_inputs_2_0 = null;

        AntlrDatatypeRuleToken lv_inputs_4_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5944:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5945:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5945:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5945:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5945:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5946:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5946:1: (lv_name_0_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5947:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod12555); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5963:2: ( (lv_functionMethod_1_0= '(' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5964:1: (lv_functionMethod_1_0= '(' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5964:1: (lv_functionMethod_1_0= '(' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5965:3: lv_functionMethod_1_0= '('
            {
            lv_functionMethod_1_0=(Token)match(input,114,FOLLOW_114_in_ruleMethod12578); 

                    newLeafNode(lv_functionMethod_1_0, grammarAccess.getMethodAccess().getFunctionMethodLeftParenthesisKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(current, "functionMethod", true, "(");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5978:2: ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5978:3: ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )*
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5978:3: ( (lv_inputs_2_0= ruleParameter ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=RULE_ID && LA114_0<=RULE_BOOLEAN)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5979:1: (lv_inputs_2_0= ruleParameter )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5979:1: (lv_inputs_2_0= ruleParameter )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5980:3: lv_inputs_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getInputsParameterParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod12613);
                    lv_inputs_2_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"inputs",
                            		lv_inputs_2_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5996:3: (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==68) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:5996:5: otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) )
            	    {
            	    otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleMethod12627); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_2_1_0());
            	        
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:6000:1: ( (lv_inputs_4_0= ruleParameter ) )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:6001:1: (lv_inputs_4_0= ruleParameter )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:6001:1: (lv_inputs_4_0= ruleParameter )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:6002:3: lv_inputs_4_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getInputsParameterParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod12648);
            	    lv_inputs_4_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inputs",
            	            		lv_inputs_4_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,115,FOLLOW_115_in_ruleMethod12663); 

                	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModelBuilder_in_entryRuleModelBuilder75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelBuilder85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleModelBuilder122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelBuilder139 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModelBuilder156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModelBuilder173 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleUserLibraries_in_ruleModelBuilder199 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleExperimentModel_in_ruleModelBuilder220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentModel_in_entryRuleExperimentModel256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentModel266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleExperimentModel303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperimentModel320 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentModel338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleExperimentModel359 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExperimentModel373 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleExperimentVariable_in_ruleExperimentModel394 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleExperimentModel407 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExperimentModel419 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExperimentModel431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_ruleExperimentModel452 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleExperimentModel465 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExperimentModel477 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleExperimentModel489 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleExperimentModel501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleWorkSource_in_ruleExperimentModel522 = new BitSet(new long[]{0x0000000002000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_25_in_ruleExperimentModel535 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExperimentModel547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWorkItemNetwork_in_ruleExperimentModel568 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_27_in_ruleExperimentModel581 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleExperimentModel593 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleExperimentModel605 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleExperimentModel617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWINReplication_in_ruleExperimentModel638 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_31_in_ruleExperimentModel651 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleExperimentModel663 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperimentModel680 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleExperimentModel698 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleExperimentModel710 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleExperimentModel722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserLibraries_in_entryRuleUserLibraries758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserLibraries768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUserLibraries805 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleUserLibraries817 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleServiceProviderType_in_ruleUserLibraries838 = new BitSet(new long[]{0x0000004000000050L});
    public static final BitSet FOLLOW_38_in_ruleUserLibraries851 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleUserLibraries863 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleWorkItemType_in_ruleUserLibraries884 = new BitSet(new long[]{0x0000010000000050L});
    public static final BitSet FOLLOW_40_in_ruleUserLibraries897 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleUserLibraries909 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleProcessModel_in_ruleUserLibraries930 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_42_in_ruleUserLibraries943 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleUserLibraries955 = new BitSet(new long[]{0x0000100000000050L});
    public static final BitSet FOLLOW_ruleClassOfService_in_ruleUserLibraries976 = new BitSet(new long[]{0x0000100000000050L});
    public static final BitSet FOLLOW_44_in_ruleUserLibraries989 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleUserLibraries1001 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_ruleService_in_ruleUserLibraries1022 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleUserLibraries1035 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleUserLibraries1047 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_ruleGovernanceStrategy_in_ruleUserLibraries1068 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleUserLibraries1081 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleUserLibraries1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNumber1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1304 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleQualifiedName1323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1338 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleQualifiedName1359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualifiedName1374 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleParameter1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleParameter1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_entryRuleAbstractParameter1603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractParameter1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAbstractParameter1657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstractParameter1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAbstractParameter1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumExpression_in_entryRuleNumExpression1754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumExpression1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumExpression1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNumExpression1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleNumExpression1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOperator1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOperator1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOperator2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOperator2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOperator2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOperator2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentVariable_in_entryRuleExperimentVariable2193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentVariable2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperimentVariable2245 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleExperimentVariable2262 = new BitSet(new long[]{0xF010000000000000L});
    public static final BitSet FOLLOW_60_in_ruleExperimentVariable2282 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleExperimentVariable2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleExperimentVariable2343 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleExperimentVariable2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExperimentVariable2403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleExperimentVariable2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleExperimentVariable2463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExperimentVariable2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleExperimentVariable2524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGovernanceStrategy_in_ruleExperimentVariable2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution2596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDistribution2650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_65_in_ruleDistribution2687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_ruleDistribution2724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleDistribution2750 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDistribution2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleDistribution2784 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDistribution2805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_69_in_ruleDistribution2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWINReplication_in_entryRuleWINReplication2855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWINReplication2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleWINReplication2902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWINReplication2922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleWINReplication2934 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWINReplication2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGovernanceStrategy_in_entryRuleGovernanceStrategy2992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGovernanceStrategy3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGovernanceStrategy3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleGovernanceStrategy3061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001A00L});
    public static final BitSet FOLLOW_73_in_ruleGovernanceStrategy3081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGovernanceStrategy3106 = new BitSet(new long[]{0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_14_in_ruleGovernanceStrategy3119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3136 = new BitSet(new long[]{0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rulePullStrategy_in_ruleGovernanceStrategy3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_75_in_ruleGovernanceStrategy3190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGovernanceStrategy3215 = new BitSet(new long[]{0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_14_in_ruleGovernanceStrategy3228 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3245 = new BitSet(new long[]{0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rulePushStrategy_in_ruleGovernanceStrategy3273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_76_in_ruleGovernanceStrategy3299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGovernanceStrategy3324 = new BitSet(new long[]{0x5000000000004000L,0x0000FF8000008000L});
    public static final BitSet FOLLOW_14_in_ruleGovernanceStrategy3337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3354 = new BitSet(new long[]{0x5000000000004000L,0x0000FF8000008000L});
    public static final BitSet FOLLOW_ruleContractNetProtocol_in_ruleGovernanceStrategy3382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleGovernanceStrategy3396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGovernanceStrategy3408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGovernanceStrategy3428 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleGovernanceStrategy3441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleGovernanceStrategy3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContractNetProtocol_in_entryRuleContractNetProtocol3489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContractNetProtocol3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleContractNetProtocol3545 = new BitSet(new long[]{0x5000000000000000L,0x0000FF8000008000L});
    public static final BitSet FOLLOW_79_in_ruleContractNetProtocol3558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleContractNetProtocol3570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleRoleBehavior_in_ruleContractNetProtocol3591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000014000L});
    public static final BitSet FOLLOW_78_in_ruleContractNetProtocol3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBehavior_in_entryRuleRoleBehavior3640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoleBehavior3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleRoleBehavior3687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRoleBehavior3704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleRoleBehavior3721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleRoleBehavior3733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleRoleBehavior3745 = new BitSet(new long[]{0x0000000000000000L,0x0002000000004000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleRoleBehavior3766 = new BitSet(new long[]{0x0000000000000000L,0x0002000000004000L});
    public static final BitSet FOLLOW_78_in_ruleRoleBehavior3779 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleRoleBehavior3800 = new BitSet(new long[]{0x0000000000000000L,0x0030000000004000L});
    public static final BitSet FOLLOW_78_in_ruleRoleBehavior3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessModel_in_entryRuleProcessModel3849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessModel3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessModel3901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleProcessModel3918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleProcessModel3930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleProcessModel3942 = new BitSet(new long[]{0x0000000000000000L,0x0002000000004000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleProcessModel3963 = new BitSet(new long[]{0x0000000000000000L,0x0002000000004000L});
    public static final BitSet FOLLOW_78_in_ruleProcessModel3976 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleProcessModel3997 = new BitSet(new long[]{0x0000000000000000L,0x0030000000004000L});
    public static final BitSet FOLLOW_78_in_ruleProcessModel4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePullStrategy_in_entryRulePullStrategy4046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePullStrategy4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rulePullStrategy4093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_rulePullStrategy4105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMechanism_in_rulePullStrategy4126 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_rulePullStrategy4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePushStrategy_in_entryRulePushStrategy4175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePushStrategy4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rulePushStrategy4222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_rulePushStrategy4234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMechanism_in_rulePushStrategy4255 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_rulePushStrategy4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanism_in_entryRuleMechanism4304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanism4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechanism4356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleMechanism4373 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMechanism4394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleMechanism4406 = new BitSet(new long[]{0x0000000000004000L,0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleMechanism4419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanism4436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_84_in_ruleMechanism4456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleMechanism4468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMechanismAttribute_in_ruleMechanism4489 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleMechanism4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleMechanism4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanismAttribute_in_entryRuleMechanismAttribute4552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanismAttribute4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanismAttribute4604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleMechanismAttribute4621 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMechanismAttribute4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSource_in_entryRuleWorkSource4678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSource4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleWorkSource4725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkSource4759 = new BitSet(new long[]{0x0000000000004000L,0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleWorkSource4772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkSource4789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_86_in_ruleWorkSource4809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkSource4821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4841 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkSource4854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkSource4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemNetwork_in_entryRuleWorkItemNetwork4904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemNetwork4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleWorkItemNetwork4951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemNetwork4968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItemNetwork4985 = new BitSet(new long[]{0x0000000000004000L,0x0000000000800000L});
    public static final BitSet FOLLOW_14_in_ruleWorkItemNetwork4998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemNetwork5015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleWorkItemNetwork5034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItemNetwork5046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkItem_in_ruleWorkItemNetwork5067 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkItemNetwork5080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkItemNetwork5092 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemNetwork5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItem_in_entryRuleWorkItem5151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItem5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_72_in_ruleWorkItem5221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5255 = new BitSet(new long[]{0x0000000000004000L,0x000000003F004000L});
    public static final BitSet FOLLOW_14_in_ruleWorkItem5268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItem5285 = new BitSet(new long[]{0x0000000000000000L,0x000000003F004000L});
    public static final BitSet FOLLOW_88_in_ruleWorkItem5311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5403 = new BitSet(new long[]{0x0000000000000000L,0x000000003E004000L});
    public static final BitSet FOLLOW_89_in_ruleWorkItem5425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5517 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleWorkItem5529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5610 = new BitSet(new long[]{0x0000000000000000L,0x0000000030004000L});
    public static final BitSet FOLLOW_90_in_ruleWorkItem5632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5713 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleWorkItem5727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5808 = new BitSet(new long[]{0x0000000000000000L,0x0000000030004000L});
    public static final BitSet FOLLOW_92_in_ruleWorkItem5829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleWorkItem5875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleWorkItem5909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5923 = new BitSet(new long[]{0x0000000000000000L,0x0000000020004000L});
    public static final BitSet FOLLOW_93_in_ruleWorkItem5938 = new BitSet(new long[]{0x00100000000000C0L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItem5959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5973 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredService_in_entryRuleRequiredService6032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredService6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleRequiredService6079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredService6099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleRequiredService6111 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleRequiredService6132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleRequiredService6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact6180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImpact6235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleImpact6247 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleImpact6268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleImpact6280 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleImpact6301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleImpact6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemType_in_entryRuleWorkItemType6349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemType6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemType6401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemType6424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItemType6441 = new BitSet(new long[]{0x0000000000004000L,0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleWorkItemType6454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemType6471 = new BitSet(new long[]{0x0000000000000000L,0x0000000040004000L});
    public static final BitSet FOLLOW_94_in_ruleWorkItemType6491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleWorkItemType6503 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemType6520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkItemType6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOfService_in_entryRuleClassOfService6577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOfService6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleClassOfService6629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassOfService6652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleClassOfService6669 = new BitSet(new long[]{0x0000000000004000L,0x0000000180004000L});
    public static final BitSet FOLLOW_14_in_ruleClassOfService6682 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassOfService6699 = new BitSet(new long[]{0x0000000000000000L,0x0000000180004000L});
    public static final BitSet FOLLOW_95_in_ruleClassOfService6719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleClassOfService6731 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleClassOfService6748 = new BitSet(new long[]{0x0000000000000000L,0x0000000100004000L});
    public static final BitSet FOLLOW_96_in_ruleClassOfService6768 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleClassOfService6780 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleClassOfService6797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleClassOfService6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService6852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService6904 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleService6922 = new BitSet(new long[]{0x0000000000004000L,0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleService6935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService6952 = new BitSet(new long[]{0x0000000000000000L,0x0000000040004000L});
    public static final BitSet FOLLOW_94_in_ruleService6972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleService6984 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleService7001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleService7020 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleService7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider7081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProvider7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_72_in_ruleServiceProvider7151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleServiceProvider7185 = new BitSet(new long[]{0x0000000000000000L,0x0000001E00004000L});
    public static final BitSet FOLLOW_97_in_ruleServiceProvider7198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleServiceProvider7210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleServiceProvider7277 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00004000L});
    public static final BitSet FOLLOW_98_in_ruleServiceProvider7292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleServiceProvider7304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleServiceProvider7371 = new BitSet(new long[]{0x0000000000000000L,0x0000001800004000L});
    public static final BitSet FOLLOW_99_in_ruleServiceProvider7386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7406 = new BitSet(new long[]{0x0000000000000000L,0x0000001000004000L});
    public static final BitSet FOLLOW_100_in_ruleServiceProvider7421 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleServiceProvider7433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleServiceProvider7454 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleServiceProvider7469 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceProvider7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProviderType_in_entryRuleServiceProviderType7528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProviderType7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceProviderType7580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProviderType7603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleServiceProviderType7620 = new BitSet(new long[]{0x0000000000004000L,0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleServiceProviderType7633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceProviderType7650 = new BitSet(new long[]{0x0000000000000000L,0x0000000040004000L});
    public static final BitSet FOLLOW_94_in_ruleServiceProviderType7670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleServiceProviderType7682 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceProviderType7699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleServiceProviderType7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset7754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset7764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset7806 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleAsset7823 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleAsset7844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleAsset7856 = new BitSet(new long[]{0x0000000000000000L,0x0000004000004000L});
    public static final BitSet FOLLOW_102_in_ruleAsset7869 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleAsset7881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleSkill_in_ruleAsset7902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleAsset7915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleSkill_in_ruleAsset7936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleAsset7952 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAsset7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_entryRuleSkill8011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkill8021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSkill8058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkill8078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleSkill8090 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleSkill8111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSkill8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType8160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleType8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType8297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType8308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDataType8346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDataType8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleDataType8384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleDataType8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass8444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleClass8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleClass8512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleClass8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleClass8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleClass8569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_entryRuleAbstractType8609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractType8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractType8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleAbstractType8690 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleAbstractType8715 = new BitSet(new long[]{0x5000000000000000L,0x00003F8000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractType8736 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleAbstractType8748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleAbstractType8774 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleAbstractType8799 = new BitSet(new long[]{0x5000000000000000L,0x00003F8000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractType8820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleAbstractType8832 = new BitSet(new long[]{0x5000000000000000L,0x00003F8000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractType8853 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleAbstractType8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute8908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_ruleAttribute8964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute8981 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleAttribute8999 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAttribute9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue9058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue9068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeValue9113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleAttributeValue9125 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAttributeValue9146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable9182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_ruleVariable9238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable9255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction9296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction9306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleAction9343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction9360 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleAction9377 = new BitSet(new long[]{0x5000000000000000L,0x0008FF8000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAction9398 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000010L});
    public static final BitSet FOLLOW_68_in_ruleAction9412 = new BitSet(new long[]{0x5000000000000000L,0x0000FF8000000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAction9433 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000010L});
    public static final BitSet FOLLOW_115_in_ruleAction9447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState9483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState9493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleState9537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState9567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleState9592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState9609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleState9626 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleState9647 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_78_in_ruleState9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_entryRuleIfExpression9697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpression9707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleIfExpression9744 = new BitSet(new long[]{0x0000000000000010L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleIfExpression9765 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleIfExpression9777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleIfExpression9789 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfExpression9810 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_78_in_ruleIfExpression9823 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleIfExpression9836 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000400L});
    public static final BitSet FOLLOW_119_in_ruleIfExpression9856 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_ruleIfExpression_in_ruleIfExpression9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleIfExpression9910 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfExpression9931 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_78_in_ruleIfExpression9944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForExpression_in_entryRuleForExpression9984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForExpression9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleForExpression10031 = new BitSet(new long[]{0x0000000000000010L,0xB880000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleForExpression10052 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleForExpression10064 = new BitSet(new long[]{0x0000000000000010L,0xB880000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleForExpression10085 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleForExpression10097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleForExpression10109 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForExpression10130 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_78_in_ruleForExpression10143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileExpression_in_entryRuleWhileExpression10179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileExpression10189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleWhileExpression10226 = new BitSet(new long[]{0x0000000000000010L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleWhileExpression10247 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleWhileExpression10259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWhileExpression10271 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhileExpression10292 = new BitSet(new long[]{0x0000000000000010L,0xB880000000004000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_78_in_ruleWhileExpression10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition10341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition10351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleCondition10399 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleCondition10420 = new BitSet(new long[]{0x00000000000001F0L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition10441 = new BitSet(new long[]{0x0000000000000002L,0x0600000000000000L});
    public static final BitSet FOLLOW_114_in_ruleCondition10461 = new BitSet(new long[]{0x0000000000000010L,0xB880000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleCondition10483 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleCondition10504 = new BitSet(new long[]{0x00000000000001F0L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition10525 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleCondition10538 = new BitSet(new long[]{0x0000000000000002L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_ruleCondition10560 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleCondition10585 = new BitSet(new long[]{0x0000000000000010L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleCondition10606 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleCondition10618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleCondition10644 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleCondition10669 = new BitSet(new long[]{0x0000000000000010L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleCondition10690 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleCondition10702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement10741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement10751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleStatement10795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActionStatement_in_ruleStatement10829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleStatement10855 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_ruleChangeStateStatement_in_ruleStatement10889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleStatement10915 = new BitSet(new long[]{0x5000000000000000L,0x0000FF8000000000L});
    public static final BitSet FOLLOW_ruleDeclarationStatement_in_ruleStatement10949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleStatement10975 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_ruleIfExpression_in_ruleStatement11009 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleStatement11021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleStatement11047 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_ruleForExpression_in_ruleStatement11081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ruleStatement11093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleStatement11119 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_ruleWhileExpression_in_ruleStatement11153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleStatement11165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertStatement_in_ruleStatement11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationStatement_in_entryRuleDeclarationStatement11229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationStatement11239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleDeclarationStatement11286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleDeclarationStatement11307 = new BitSet(new long[]{0x00000000000001F0L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDeclarationStatement11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStatement_in_entryRuleActionStatement11366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStatement11376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStatement11421 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleActionStatement11433 = new BitSet(new long[]{0x0000000000000010L,0xB888000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleActionStatement11454 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleActionStatement11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertStatement_in_entryRuleAssertStatement11503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertStatement11513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleAssertStatement11559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleAssertStatement11571 = new BitSet(new long[]{0x00000000000001F0L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssertStatement11592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeStateStatement_in_entryRuleChangeStateStatement11628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeStateStatement11638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleChangeStateStatement11675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChangeStateStatement11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression11731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleExpression11788 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_131_in_ruleExpression11811 = new BitSet(new long[]{0x00000000000001F0L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_132_in_ruleExpression11840 = new BitSet(new long[]{0x00000000000001F0L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleExpression11863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm11901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleTerm11958 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_101_in_ruleTerm11981 = new BitSet(new long[]{0x00000000000001F0L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_133_in_ruleTerm12010 = new BitSet(new long[]{0x00000000000001F0L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleTerm12033 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor12071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleFactor12127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleFactor12154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFactor12177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleFactor12205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleFactor12229 = new BitSet(new long[]{0x00000000000001F0L,0xB884000000000000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFactor12250 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleFactor12262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExpression_in_entryRuleVarExpression12299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarExpression12309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleVarExpression12353 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_135_in_ruleVarExpression12390 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVarExpression12430 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVarExpression12444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleVarExpression12465 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod12503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod12555 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleMethod12578 = new BitSet(new long[]{0x00000000000001F0L,0x0008000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod12613 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000010L});
    public static final BitSet FOLLOW_68_in_ruleMethod12627 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod12648 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000010L});
    public static final BitSet FOLLOW_115_in_ruleMethod12663 = new BitSet(new long[]{0x0000000000000002L});

}