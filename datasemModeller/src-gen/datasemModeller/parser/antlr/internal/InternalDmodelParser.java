package datasemModeller.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import datasemModeller.services.DmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelBuilder'", "'desc'", "'ExperimentModel'", "'Path'", "'Variables'", "'end Variables'", "'OrganizationalModel'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkSources'", "'end WorkSources'", "'WorkItemNetworks'", "'end WorkItemNetworks'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'WINReplications'", "'end WINReplications'", "'Indicators'", "'end Indicators'", "'end ExperimentSettings'", "'end ExperimentModel'", "'UserLibraries'", "'ServiceProviderTypes'", "'end ServiceProviderTypes'", "'WorkItemTypes'", "'end WorkItemTypes'", "'ProcessModels'", "'end ProcessModels'", "'ClassOfServices'", "'end ClassOfServices'", "'Services'", "'end Services'", "'GovernanceStrategies'", "'end GovernanceStrategies'", "'end UserLibraries'", "'.'", "'var:'", "'Random.'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "':'", "'boolean'", "'num'", "'string'", "'GovernanceStrategy'", "'Normal'", "'Uniform'", "'Exponential'", "'['", "','", "']'", "'WorkItemNetwork'", "'NumReplications'", "'type'", "'Pull'", "'{'", "'Push'", "'CNP'", "'processes'", "'}'", "'mechanisms'", "'roleBehaviors'", "'role'", "'actions'", "'='", "'attributes'", "'WorkSource'", "'AssignTo'", "'WorkItems'", "'prerequisites'", "'decomposites'", "'analysisEfforts'", "'efforts'", "'maturityLevels'", "'uncertainty'", "'impacts'", "'value'", "'risk'", "'classOfService'", "'workSource'", "'arrivalTime'", "'dueDate'", "'hierarchy'", "'priority'", "'disruptive'", "'assignTo'", "'outsourceFrom'", "'strategy'", "'resources'", "'*'", "'skills'", "'int'", "'double'", "'Agent'", "'Task'", "'Contract'", "'Bid'", "'Service'", "'List'", "'Map'", "'default'", "'action'", "'('", "')'", "'backgroundState'", "'state'", "'else'", "'if'", "'in'", "'and'", "'or'", "'Do'", "'->'", "'var'", "'end if'", "'for'", "'end for'", "'while'", "'end while'", "'+'", "'-'", "'/'", "'self'", "'context'"
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
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
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


        public InternalDmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g"; }



     	private DmodelGrammarAccess grammarAccess;
     	
        public InternalDmodelParser(TokenStream input, DmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ModelBuilder";	
       	}
       	
       	@Override
       	protected DmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModelBuilder"
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:67:1: entryRuleModelBuilder returns [EObject current=null] : iv_ruleModelBuilder= ruleModelBuilder EOF ;
    public final EObject entryRuleModelBuilder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelBuilder = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:68:2: (iv_ruleModelBuilder= ruleModelBuilder EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:69:2: iv_ruleModelBuilder= ruleModelBuilder EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:76:1: ruleModelBuilder returns [EObject current=null] : (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:79:28: ( (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:80:3: otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleModelBuilder122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelBuilderAccess().getModelBuilderKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:85:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:86:3: lv_name_1_0= RULE_ID
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:106:1: ( (lv_Description_3_0= RULE_STRING ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:107:1: (lv_Description_3_0= RULE_STRING )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:107:1: (lv_Description_3_0= RULE_STRING )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:108:3: lv_Description_3_0= RULE_STRING
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:124:2: ( (lv_UserLibraries_4_0= ruleUserLibraries ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:125:1: (lv_UserLibraries_4_0= ruleUserLibraries )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:125:1: (lv_UserLibraries_4_0= ruleUserLibraries )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:126:3: lv_UserLibraries_4_0= ruleUserLibraries
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:142:2: ( (lv_ExperimentModel_5_0= ruleExperimentModel ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:143:1: (lv_ExperimentModel_5_0= ruleExperimentModel )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:143:1: (lv_ExperimentModel_5_0= ruleExperimentModel )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:144:3: lv_ExperimentModel_5_0= ruleExperimentModel
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:168:1: entryRuleExperimentModel returns [EObject current=null] : iv_ruleExperimentModel= ruleExperimentModel EOF ;
    public final EObject entryRuleExperimentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentModel = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:169:2: (iv_ruleExperimentModel= ruleExperimentModel EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:170:2: iv_ruleExperimentModel= ruleExperimentModel EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:177:1: ruleExperimentModel returns [EObject current=null] : (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:180:28: ( (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:181:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:181:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:181:3: otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExperimentModel303); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentModelAccess().getExperimentModelKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:185:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:186:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:186:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:187:3: lv_name_1_0= RULE_ID
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:203:2: (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:203:4: otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleExperimentModel338); 

                        	newLeafNode(otherlv_2, grammarAccess.getExperimentModelAccess().getPathKeyword_2_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:207:1: ( (lv_Path_3_0= ruleQualifiedName ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:208:1: (lv_Path_3_0= ruleQualifiedName )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:208:1: (lv_Path_3_0= ruleQualifiedName )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:209:3: lv_Path_3_0= ruleQualifiedName
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:229:1: ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:230:1: (lv_ExperimentVariables_5_0= ruleExperimentVariable )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:230:1: (lv_ExperimentVariables_5_0= ruleExperimentVariable )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:231:3: lv_ExperimentVariables_5_0= ruleExperimentVariable
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:259:1: ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:260:1: (lv_ServiceProviders_9_0= ruleServiceProvider )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:260:1: (lv_ServiceProviders_9_0= ruleServiceProvider )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:261:3: lv_ServiceProviders_9_0= ruleServiceProvider
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:293:1: ( (lv_WorkSources_14_0= ruleWorkSource ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:294:1: (lv_WorkSources_14_0= ruleWorkSource )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:294:1: (lv_WorkSources_14_0= ruleWorkSource )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:295:3: lv_WorkSources_14_0= ruleWorkSource
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:319:1: ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:320:1: (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:320:1: (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:321:3: lv_WorkItemNetworks_17_0= ruleWorkItemNetwork
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:353:1: ( (lv_WINReplications_22_0= ruleWINReplication ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:354:1: (lv_WINReplications_22_0= ruleWINReplication )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:354:1: (lv_WINReplications_22_0= ruleWINReplication )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:355:3: lv_WINReplications_22_0= ruleWINReplication
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:379:1: ( (lv_Indicators_25_0= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:380:1: (lv_Indicators_25_0= RULE_ID )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:380:1: (lv_Indicators_25_0= RULE_ID )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:381:3: lv_Indicators_25_0= RULE_ID
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:417:1: entryRuleUserLibraries returns [EObject current=null] : iv_ruleUserLibraries= ruleUserLibraries EOF ;
    public final EObject entryRuleUserLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserLibraries = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:418:2: (iv_ruleUserLibraries= ruleUserLibraries EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:419:2: iv_ruleUserLibraries= ruleUserLibraries EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:426:1: ruleUserLibraries returns [EObject current=null] : (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:429:28: ( (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:430:1: (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:430:1: (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:430:3: otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'ProcessModels' ( (lv_ProcessModels_8_0= ruleProcessModel ) )* otherlv_9= 'end ProcessModels' otherlv_10= 'ClassOfServices' ( (lv_ClassOfServices_11_0= ruleClassOfService ) )* otherlv_12= 'end ClassOfServices' otherlv_13= 'Services' ( (lv_Services_14_0= ruleService ) )* otherlv_15= 'end Services' otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleUserLibraries805); 

                	newLeafNode(otherlv_0, grammarAccess.getUserLibrariesAccess().getUserLibrariesKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleUserLibraries817); 

                	newLeafNode(otherlv_1, grammarAccess.getUserLibrariesAccess().getServiceProviderTypesKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:438:1: ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:439:1: (lv_ServiceProviderTypes_2_0= ruleServiceProviderType )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:439:1: (lv_ServiceProviderTypes_2_0= ruleServiceProviderType )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:440:3: lv_ServiceProviderTypes_2_0= ruleServiceProviderType
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:464:1: ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:465:1: (lv_WorkItemTypes_5_0= ruleWorkItemType )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:465:1: (lv_WorkItemTypes_5_0= ruleWorkItemType )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:466:3: lv_WorkItemTypes_5_0= ruleWorkItemType
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:490:1: ( (lv_ProcessModels_8_0= ruleProcessModel ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:491:1: (lv_ProcessModels_8_0= ruleProcessModel )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:491:1: (lv_ProcessModels_8_0= ruleProcessModel )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:492:3: lv_ProcessModels_8_0= ruleProcessModel
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:516:1: ( (lv_ClassOfServices_11_0= ruleClassOfService ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:517:1: (lv_ClassOfServices_11_0= ruleClassOfService )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:517:1: (lv_ClassOfServices_11_0= ruleClassOfService )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:518:3: lv_ClassOfServices_11_0= ruleClassOfService
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:542:1: ( (lv_Services_14_0= ruleService ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:543:1: (lv_Services_14_0= ruleService )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:543:1: (lv_Services_14_0= ruleService )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:544:3: lv_Services_14_0= ruleService
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:568:1: ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:569:1: (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:569:1: (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:570:3: lv_GovernanceStrategies_17_0= ruleGovernanceStrategy
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:602:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:603:2: (iv_ruleNumber= ruleNumber EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:604:2: iv_ruleNumber= ruleNumber EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:611:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;

         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:614:28: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:615:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:615:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:615:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1181); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:623:10: this_DOUBLE_1= RULE_DOUBLE
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:638:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:639:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:640:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:647:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:650:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:651:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:651:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:651:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1304); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:658:1: (kw= '.' this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==50) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==EOF||LA15_3==RULE_ID||LA15_3==17||LA15_3==50||(LA15_3>=53 && LA15_3<=58)||LA15_3==78||LA15_3==83||LA15_3==108||LA15_3==122||(LA15_3>=126 && LA15_3<=132)||LA15_3==134||LA15_3==136||(LA15_3>=138 && LA15_3<=142)) ) {
                            alt15=1;
                        }


                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:659:2: kw= '.' this_ID_2= RULE_ID
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:671:3: (kw= '.' this_INT_4= RULE_INT )*
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:672:2: kw= '.' this_INT_4= RULE_INT
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:692:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:693:2: (iv_ruleParameter= ruleParameter EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:694:2: iv_ruleParameter= ruleParameter EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:701:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_ID_2=null;
        Token this_BOOLEAN_3=null;
        AntlrDatatypeRuleToken this_Number_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:704:28: ( (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:705:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:705:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:706:5: this_Number_0= ruleNumber
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:717:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter1506); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getParameterAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:725:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1532); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getParameterAccess().getIDTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:733:10: this_BOOLEAN_3= RULE_BOOLEAN
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:748:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:749:2: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:750:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:757:1: ruleAbstractParameter returns [EObject current=null] : ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        Token lv_isVariable_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:760:28: ( ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:761:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:761:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:761:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:761:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:761:3: ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:761:3: ( (lv_isVariable_0_0= 'var:' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:762:1: (lv_isVariable_0_0= 'var:' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:762:1: (lv_isVariable_0_0= 'var:' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:763:3: lv_isVariable_0_0= 'var:'
                    {
                    lv_isVariable_0_0=(Token)match(input,51,FOLLOW_51_in_ruleAbstractParameter1657); 

                            newLeafNode(lv_isVariable_0_0, grammarAccess.getAbstractParameterAccess().getIsVariableVarKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractParameterRule());
                    	        }
                           		setWithLastConsumed(current, "isVariable", true, "var:");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:776:2: ( (otherlv_1= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:777:1: (otherlv_1= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:777:1: (otherlv_1= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:778:3: otherlv_1= RULE_ID
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:790:6: ( (lv_value_2_0= ruleParameter ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:790:6: ( (lv_value_2_0= ruleParameter ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:791:1: (lv_value_2_0= ruleParameter )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:791:1: (lv_value_2_0= ruleParameter )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:792:3: lv_value_2_0= ruleParameter
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:816:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:817:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:818:2: iv_ruleNumExpression= ruleNumExpression EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:825:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_distribution_1_0=null;
        AntlrDatatypeRuleToken lv_numValue_0_0 = null;

        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:828:28: ( ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:829:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:829:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:829:2: ( (lv_numValue_0_0= ruleNumber ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:829:2: ( (lv_numValue_0_0= ruleNumber ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:830:1: (lv_numValue_0_0= ruleNumber )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:830:1: (lv_numValue_0_0= ruleNumber )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:831:3: lv_numValue_0_0= ruleNumber
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:848:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:848:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:848:7: ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:848:7: ( (lv_distribution_1_0= 'Random.' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:849:1: (lv_distribution_1_0= 'Random.' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:849:1: (lv_distribution_1_0= 'Random.' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:850:3: lv_distribution_1_0= 'Random.'
                    {
                    lv_distribution_1_0=(Token)match(input,52,FOLLOW_52_in_ruleNumExpression1835); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionRandomKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:863:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:864:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:864:1: (lv_numDist_2_0= ruleDistribution )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:865:3: lv_numDist_2_0= ruleDistribution
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:889:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:890:2: (iv_ruleOperator= ruleOperator EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:891:2: iv_ruleOperator= ruleOperator EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:898:1: ruleOperator returns [EObject current=null] : ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:901:28: ( ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:902:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:902:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:902:2: ( (lv_equalTo_0_0= '==' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:902:2: ( (lv_equalTo_0_0= '==' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:903:1: (lv_equalTo_0_0= '==' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:903:1: (lv_equalTo_0_0= '==' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:904:3: lv_equalTo_0_0= '=='
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:918:6: ( (lv_largerThan_1_0= '>' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:918:6: ( (lv_largerThan_1_0= '>' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:919:1: (lv_largerThan_1_0= '>' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:919:1: (lv_largerThan_1_0= '>' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:920:3: lv_largerThan_1_0= '>'
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:934:6: ( (lv_smallerThan_2_0= '<' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:934:6: ( (lv_smallerThan_2_0= '<' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:935:1: (lv_smallerThan_2_0= '<' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:935:1: (lv_smallerThan_2_0= '<' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:936:3: lv_smallerThan_2_0= '<'
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:950:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:950:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:951:1: (lv_largerOrEqualTo_3_0= '>=' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:951:1: (lv_largerOrEqualTo_3_0= '>=' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:952:3: lv_largerOrEqualTo_3_0= '>='
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:966:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:966:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:967:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:967:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:968:3: lv_smallerOrEqualTo_4_0= '<='
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:982:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:982:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:983:1: (lv_notEqualTo_5_0= '!=' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:983:1: (lv_notEqualTo_5_0= '!=' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:984:3: lv_notEqualTo_5_0= '!='
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1005:1: entryRuleExperimentVariable returns [EObject current=null] : iv_ruleExperimentVariable= ruleExperimentVariable EOF ;
    public final EObject entryRuleExperimentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentVariable = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1006:2: (iv_ruleExperimentVariable= ruleExperimentVariable EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1007:2: iv_ruleExperimentVariable= ruleExperimentVariable EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1014:1: ruleExperimentVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1017:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1018:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1018:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1018:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1018:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1019:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1019:1: (lv_name_0_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1020:3: lv_name_0_0= RULE_ID
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1040:1: ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1040:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1040:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1040:3: ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1040:3: ( (lv_boolean_2_0= 'boolean' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1041:1: (lv_boolean_2_0= 'boolean' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1041:1: (lv_boolean_2_0= 'boolean' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1042:3: lv_boolean_2_0= 'boolean'
                    {
                    lv_boolean_2_0=(Token)match(input,60,FOLLOW_60_in_ruleExperimentVariable2282); 

                            newLeafNode(lv_boolean_2_0, grammarAccess.getExperimentVariableAccess().getBooleanBooleanKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "boolean", true, "boolean");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1055:2: ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1056:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1056:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1057:3: lv_booleanValue_3_0= RULE_BOOLEAN
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1074:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1074:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1074:7: ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1074:7: ( (lv_num_4_0= 'num' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1075:1: (lv_num_4_0= 'num' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1075:1: (lv_num_4_0= 'num' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1076:3: lv_num_4_0= 'num'
                    {
                    lv_num_4_0=(Token)match(input,61,FOLLOW_61_in_ruleExperimentVariable2343); 

                            newLeafNode(lv_num_4_0, grammarAccess.getExperimentVariableAccess().getNumNumKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "num", true, "num");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1089:2: ( (lv_numValue_5_0= ruleNumber ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1090:1: (lv_numValue_5_0= ruleNumber )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1090:1: (lv_numValue_5_0= ruleNumber )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1091:3: lv_numValue_5_0= ruleNumber
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1108:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1108:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1108:7: ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1108:7: ( (lv_distribution_6_0= 'Random.' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1109:1: (lv_distribution_6_0= 'Random.' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1109:1: (lv_distribution_6_0= 'Random.' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1110:3: lv_distribution_6_0= 'Random.'
                    {
                    lv_distribution_6_0=(Token)match(input,52,FOLLOW_52_in_ruleExperimentVariable2403); 

                            newLeafNode(lv_distribution_6_0, grammarAccess.getExperimentVariableAccess().getDistributionRandomKeyword_2_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1123:2: ( (lv_numDist_7_0= ruleDistribution ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1124:1: (lv_numDist_7_0= ruleDistribution )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1124:1: (lv_numDist_7_0= ruleDistribution )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1125:3: lv_numDist_7_0= ruleDistribution
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1142:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1142:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1142:7: ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1142:7: ( (lv_string_8_0= 'string' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1143:1: (lv_string_8_0= 'string' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1143:1: (lv_string_8_0= 'string' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1144:3: lv_string_8_0= 'string'
                    {
                    lv_string_8_0=(Token)match(input,62,FOLLOW_62_in_ruleExperimentVariable2463); 

                            newLeafNode(lv_string_8_0, grammarAccess.getExperimentVariableAccess().getStringStringKeyword_2_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "string", true, "string");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1157:2: ( (lv_stringValue_9_0= RULE_STRING ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1158:1: (lv_stringValue_9_0= RULE_STRING )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1158:1: (lv_stringValue_9_0= RULE_STRING )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1159:3: lv_stringValue_9_0= RULE_STRING
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1176:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1176:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1176:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1176:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1177:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1177:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1178:3: lv_strategy_10_0= 'GovernanceStrategy'
                    {
                    lv_strategy_10_0=(Token)match(input,63,FOLLOW_63_in_ruleExperimentVariable2524); 

                            newLeafNode(lv_strategy_10_0, grammarAccess.getExperimentVariableAccess().getStrategyGovernanceStrategyKeyword_2_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "strategy", true, "GovernanceStrategy");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1191:2: ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1192:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1192:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1193:3: lv_strategyValue_11_0= ruleGovernanceStrategy
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1217:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1218:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1219:2: iv_ruleDistribution= ruleDistribution EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1226:1: ruleDistribution returns [EObject current=null] : ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1229:28: ( ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1230:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1230:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1230:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1230:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) )
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1230:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1230:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1231:1: (lv_isNormal_0_0= 'Normal' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1231:1: (lv_isNormal_0_0= 'Normal' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1232:3: lv_isNormal_0_0= 'Normal'
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1246:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1246:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1247:1: (lv_isUniform_1_0= 'Uniform' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1247:1: (lv_isUniform_1_0= 'Uniform' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1248:3: lv_isUniform_1_0= 'Uniform'
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1262:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1262:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1263:1: (lv_isExponential_2_0= 'Exponential' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1263:1: (lv_isExponential_2_0= 'Exponential' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1264:3: lv_isExponential_2_0= 'Exponential'
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1281:1: ( (lv_parameters_4_0= ruleParameter ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1282:1: (lv_parameters_4_0= ruleParameter )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1282:1: (lv_parameters_4_0= ruleParameter )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1283:3: lv_parameters_4_0= ruleParameter
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1299:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==68) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1299:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleDistribution2784); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDistributionAccess().getCommaKeyword_3_0());
            	        
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1303:1: ( (lv_parameters_6_0= ruleParameter ) )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1304:1: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1304:1: (lv_parameters_6_0= ruleParameter )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1305:3: lv_parameters_6_0= ruleParameter
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1333:1: entryRuleWINReplication returns [EObject current=null] : iv_ruleWINReplication= ruleWINReplication EOF ;
    public final EObject entryRuleWINReplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWINReplication = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1334:2: (iv_ruleWINReplication= ruleWINReplication EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1335:2: iv_ruleWINReplication= ruleWINReplication EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1342:1: ruleWINReplication returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) ;
    public final EObject ruleWINReplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numReplications_3_0=null;

         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1345:28: ( (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1346:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1346:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1346:3: otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleWINReplication2902); 

                	newLeafNode(otherlv_0, grammarAccess.getWINReplicationAccess().getWorkItemNetworkKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1350:1: ( (otherlv_1= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1351:1: (otherlv_1= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1351:1: (otherlv_1= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1352:3: otherlv_1= RULE_ID
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
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1367:1: ( (lv_numReplications_3_0= RULE_INT ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1368:1: (lv_numReplications_3_0= RULE_INT )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1368:1: (lv_numReplications_3_0= RULE_INT )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1369:3: lv_numReplications_3_0= RULE_INT
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1393:1: entryRuleGovernanceStrategy returns [EObject current=null] : iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF ;
    public final EObject entryRuleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceStrategy = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1394:2: (iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1395:2: iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1402:1: ruleGovernanceStrategy returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= 'processes' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pull_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token lv_push_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token lv_cnp_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_pullStrategy_7_0 = null;

        EObject lv_pushStrategy_12_0 = null;

        EObject lv_contractNetProtocal_17_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1405:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= 'processes' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' otherlv_22= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1406:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= 'processes' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' otherlv_22= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1406:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= 'processes' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' otherlv_22= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1406:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= 'processes' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ otherlv_21= '}' otherlv_22= '}'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1406:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1407:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1407:1: (lv_name_0_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1408:3: lv_name_0_0= RULE_ID
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
                
            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleGovernanceStrategy3073); 

                	newLeafNode(otherlv_2, grammarAccess.getGovernanceStrategyAccess().getColonKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1432:1: ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) )
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1432:2: ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1432:2: ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1432:3: ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1432:3: ( (lv_pull_3_0= 'Pull' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1433:1: (lv_pull_3_0= 'Pull' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1433:1: (lv_pull_3_0= 'Pull' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1434:3: lv_pull_3_0= 'Pull'
                    {
                    lv_pull_3_0=(Token)match(input,73,FOLLOW_73_in_ruleGovernanceStrategy3093); 

                            newLeafNode(lv_pull_3_0, grammarAccess.getGovernanceStrategyAccess().getPullPullKeyword_3_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(current, "pull", true, "Pull");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleGovernanceStrategy3118); 

                        	newLeafNode(otherlv_4, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_3_0_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1451:1: (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==14) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1451:3: otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) )
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleGovernanceStrategy3131); 

                                	newLeafNode(otherlv_5, grammarAccess.getGovernanceStrategyAccess().getDescKeyword_3_0_2_0());
                                
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1455:1: ( (lv_description_6_0= RULE_STRING ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1456:1: (lv_description_6_0= RULE_STRING )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1456:1: (lv_description_6_0= RULE_STRING )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1457:3: lv_description_6_0= RULE_STRING
                            {
                            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3148); 

                            			newLeafNode(lv_description_6_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_3_0_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
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

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1473:4: ( (lv_pullStrategy_7_0= rulePullStrategy ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1474:1: (lv_pullStrategy_7_0= rulePullStrategy )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1474:1: (lv_pullStrategy_7_0= rulePullStrategy )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1475:3: lv_pullStrategy_7_0= rulePullStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPullStrategyPullStrategyParserRuleCall_3_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulePullStrategy_in_ruleGovernanceStrategy3176);
                    lv_pullStrategy_7_0=rulePullStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"pullStrategy",
                            		lv_pullStrategy_7_0, 
                            		"PullStrategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1492:6: ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1492:6: ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1492:7: ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1492:7: ( (lv_push_8_0= 'Push' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1493:1: (lv_push_8_0= 'Push' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1493:1: (lv_push_8_0= 'Push' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1494:3: lv_push_8_0= 'Push'
                    {
                    lv_push_8_0=(Token)match(input,75,FOLLOW_75_in_ruleGovernanceStrategy3202); 

                            newLeafNode(lv_push_8_0, grammarAccess.getGovernanceStrategyAccess().getPushPushKeyword_3_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(current, "push", true, "Push");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,74,FOLLOW_74_in_ruleGovernanceStrategy3227); 

                        	newLeafNode(otherlv_9, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_3_1_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1511:1: (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==14) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1511:3: otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) )
                            {
                            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleGovernanceStrategy3240); 

                                	newLeafNode(otherlv_10, grammarAccess.getGovernanceStrategyAccess().getDescKeyword_3_1_2_0());
                                
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1515:1: ( (lv_description_11_0= RULE_STRING ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1516:1: (lv_description_11_0= RULE_STRING )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1516:1: (lv_description_11_0= RULE_STRING )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1517:3: lv_description_11_0= RULE_STRING
                            {
                            lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3257); 

                            			newLeafNode(lv_description_11_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_11_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1533:4: ( (lv_pushStrategy_12_0= rulePushStrategy ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1534:1: (lv_pushStrategy_12_0= rulePushStrategy )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1534:1: (lv_pushStrategy_12_0= rulePushStrategy )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1535:3: lv_pushStrategy_12_0= rulePushStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPushStrategyPushStrategyParserRuleCall_3_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulePushStrategy_in_ruleGovernanceStrategy3285);
                    lv_pushStrategy_12_0=rulePushStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"pushStrategy",
                            		lv_pushStrategy_12_0, 
                            		"PushStrategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1552:6: ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1552:6: ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1552:7: ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1552:7: ( (lv_cnp_13_0= 'CNP' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1553:1: (lv_cnp_13_0= 'CNP' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1553:1: (lv_cnp_13_0= 'CNP' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1554:3: lv_cnp_13_0= 'CNP'
                    {
                    lv_cnp_13_0=(Token)match(input,76,FOLLOW_76_in_ruleGovernanceStrategy3311); 

                            newLeafNode(lv_cnp_13_0, grammarAccess.getGovernanceStrategyAccess().getCnpCNPKeyword_3_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(current, "cnp", true, "CNP");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,74,FOLLOW_74_in_ruleGovernanceStrategy3336); 

                        	newLeafNode(otherlv_14, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_3_2_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1571:1: (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==14) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1571:3: otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) )
                            {
                            otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleGovernanceStrategy3349); 

                                	newLeafNode(otherlv_15, grammarAccess.getGovernanceStrategyAccess().getDescKeyword_3_2_2_0());
                                
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1575:1: ( (lv_description_16_0= RULE_STRING ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1576:1: (lv_description_16_0= RULE_STRING )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1576:1: (lv_description_16_0= RULE_STRING )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1577:3: lv_description_16_0= RULE_STRING
                            {
                            lv_description_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3366); 

                            			newLeafNode(lv_description_16_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_3_2_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_16_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1593:4: ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1594:1: (lv_contractNetProtocal_17_0= ruleContractNetProtocol )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1594:1: (lv_contractNetProtocal_17_0= ruleContractNetProtocol )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1595:3: lv_contractNetProtocal_17_0= ruleContractNetProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getContractNetProtocalContractNetProtocolParserRuleCall_3_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContractNetProtocol_in_ruleGovernanceStrategy3394);
                    lv_contractNetProtocal_17_0=ruleContractNetProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"contractNetProtocal",
                            		lv_contractNetProtocal_17_0, 
                            		"ContractNetProtocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,77,FOLLOW_77_in_ruleGovernanceStrategy3408); 

                	newLeafNode(otherlv_18, grammarAccess.getGovernanceStrategyAccess().getProcessesKeyword_4());
                
            otherlv_19=(Token)match(input,74,FOLLOW_74_in_ruleGovernanceStrategy3420); 

                	newLeafNode(otherlv_19, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1619:1: ( (otherlv_20= RULE_ID ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1620:1: (otherlv_20= RULE_ID )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1620:1: (otherlv_20= RULE_ID )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1621:3: otherlv_20= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
            	    	        }
            	            
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGovernanceStrategy3440); 

            	    		newLeafNode(otherlv_20, grammarAccess.getGovernanceStrategyAccess().getProcessesProcessModelCrossReference_6_0()); 
            	    	

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

            otherlv_21=(Token)match(input,78,FOLLOW_78_in_ruleGovernanceStrategy3453); 

                	newLeafNode(otherlv_21, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_22=(Token)match(input,78,FOLLOW_78_in_ruleGovernanceStrategy3465); 

                	newLeafNode(otherlv_22, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1648:1: entryRuleContractNetProtocol returns [EObject current=null] : iv_ruleContractNetProtocol= ruleContractNetProtocol EOF ;
    public final EObject entryRuleContractNetProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractNetProtocol = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1649:2: (iv_ruleContractNetProtocol= ruleContractNetProtocol EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1650:2: iv_ruleContractNetProtocol= ruleContractNetProtocol EOF
            {
             newCompositeNode(grammarAccess.getContractNetProtocolRule()); 
            pushFollow(FOLLOW_ruleContractNetProtocol_in_entryRuleContractNetProtocol3501);
            iv_ruleContractNetProtocol=ruleContractNetProtocol();

            state._fsp--;

             current =iv_ruleContractNetProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContractNetProtocol3511); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1657:1: ruleContractNetProtocol returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}' ) ;
    public final EObject ruleContractNetProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_mechanisms_2_0 = null;

        EObject lv_variables_4_0 = null;

        EObject lv_roleBehaviors_7_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1660:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1661:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1661:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1661:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleContractNetProtocol3548); 

                	newLeafNode(otherlv_0, grammarAccess.getContractNetProtocolAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleContractNetProtocol3560); 

                	newLeafNode(otherlv_1, grammarAccess.getContractNetProtocolAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1669:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1670:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1670:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1671:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractNetProtocolAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMechanism_in_ruleContractNetProtocol3581);
            	    lv_mechanisms_2_0=ruleMechanism();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            otherlv_3=(Token)match(input,78,FOLLOW_78_in_ruleContractNetProtocol3594); 

                	newLeafNode(otherlv_3, grammarAccess.getContractNetProtocolAccess().getRightCurlyBracketKeyword_3());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1691:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==60||LA30_0==62||(LA30_0>=110 && LA30_0<=118)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1692:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1692:1: (lv_variables_4_0= ruleVariable )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1693:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractNetProtocolAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleContractNetProtocol3615);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_4_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleContractNetProtocol3628); 

                	newLeafNode(otherlv_5, grammarAccess.getContractNetProtocolAccess().getRoleBehaviorsKeyword_5());
                
            otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleContractNetProtocol3640); 

                	newLeafNode(otherlv_6, grammarAccess.getContractNetProtocolAccess().getLeftCurlyBracketKeyword_6());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1717:1: ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==81) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1718:1: (lv_roleBehaviors_7_0= ruleRoleBehavior )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1718:1: (lv_roleBehaviors_7_0= ruleRoleBehavior )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1719:3: lv_roleBehaviors_7_0= ruleRoleBehavior
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractNetProtocolAccess().getRoleBehaviorsRoleBehaviorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRoleBehavior_in_ruleContractNetProtocol3661);
            	    lv_roleBehaviors_7_0=ruleRoleBehavior();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roleBehaviors",
            	            		lv_roleBehaviors_7_0, 
            	            		"RoleBehavior");
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

            otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleContractNetProtocol3674); 

                	newLeafNode(otherlv_8, grammarAccess.getContractNetProtocolAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1747:1: entryRuleRoleBehavior returns [EObject current=null] : iv_ruleRoleBehavior= ruleRoleBehavior EOF ;
    public final EObject entryRuleRoleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleBehavior = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1748:2: (iv_ruleRoleBehavior= ruleRoleBehavior EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1749:2: iv_ruleRoleBehavior= ruleRoleBehavior EOF
            {
             newCompositeNode(grammarAccess.getRoleBehaviorRule()); 
            pushFollow(FOLLOW_ruleRoleBehavior_in_entryRuleRoleBehavior3710);
            iv_ruleRoleBehavior=ruleRoleBehavior();

            state._fsp--;

             current =iv_ruleRoleBehavior; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoleBehavior3720); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1756:1: ruleRoleBehavior returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1759:28: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1760:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1760:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1760:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleRoleBehavior3757); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleBehaviorAccess().getRoleKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1764:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1765:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1765:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1766:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRoleBehavior3774); 

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

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleRoleBehavior3791); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleBehaviorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,82,FOLLOW_82_in_ruleRoleBehavior3803); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleBehaviorAccess().getActionsKeyword_3());
                
            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleRoleBehavior3815); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleBehaviorAccess().getLeftCurlyBracketKeyword_4());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1794:1: ( (lv_actions_5_0= ruleAction ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==120) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1795:1: (lv_actions_5_0= ruleAction )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1795:1: (lv_actions_5_0= ruleAction )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1796:3: lv_actions_5_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleBehaviorAccess().getActionsActionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleRoleBehavior3836);
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
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleRoleBehavior3849); 

                	newLeafNode(otherlv_6, grammarAccess.getRoleBehaviorAccess().getRightCurlyBracketKeyword_6());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1816:1: ( (lv_states_7_0= ruleState ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=123 && LA33_0<=124)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1817:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1817:1: (lv_states_7_0= ruleState )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1818:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleBehaviorAccess().getStatesStateParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleRoleBehavior3870);
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
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleRoleBehavior3883); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1846:1: entryRuleProcessModel returns [EObject current=null] : iv_ruleProcessModel= ruleProcessModel EOF ;
    public final EObject entryRuleProcessModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessModel = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1847:2: (iv_ruleProcessModel= ruleProcessModel EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1848:2: iv_ruleProcessModel= ruleProcessModel EOF
            {
             newCompositeNode(grammarAccess.getProcessModelRule()); 
            pushFollow(FOLLOW_ruleProcessModel_in_entryRuleProcessModel3919);
            iv_ruleProcessModel=ruleProcessModel();

            state._fsp--;

             current =iv_ruleProcessModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessModel3929); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1855:1: ruleProcessModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1858:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1859:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1859:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1859:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'actions' otherlv_3= '{' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ otherlv_7= '}'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1859:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1860:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1860:1: (lv_name_0_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1861:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessModel3971); 

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

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleProcessModel3988); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,82,FOLLOW_82_in_ruleProcessModel4000); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessModelAccess().getActionsKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleProcessModel4012); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1889:1: ( (lv_actions_4_0= ruleAction ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==120) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1890:1: (lv_actions_4_0= ruleAction )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1890:1: (lv_actions_4_0= ruleAction )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1891:3: lv_actions_4_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessModelAccess().getActionsActionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleProcessModel4033);
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
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleProcessModel4046); 

                	newLeafNode(otherlv_5, grammarAccess.getProcessModelAccess().getRightCurlyBracketKeyword_5());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1911:1: ( (lv_states_6_0= ruleState ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=123 && LA35_0<=124)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1912:1: (lv_states_6_0= ruleState )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1912:1: (lv_states_6_0= ruleState )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1913:3: lv_states_6_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessModelAccess().getStatesStateParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleProcessModel4067);
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleProcessModel4080); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1941:1: entryRulePullStrategy returns [EObject current=null] : iv_rulePullStrategy= rulePullStrategy EOF ;
    public final EObject entryRulePullStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePullStrategy = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1942:2: (iv_rulePullStrategy= rulePullStrategy EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1943:2: iv_rulePullStrategy= rulePullStrategy EOF
            {
             newCompositeNode(grammarAccess.getPullStrategyRule()); 
            pushFollow(FOLLOW_rulePullStrategy_in_entryRulePullStrategy4116);
            iv_rulePullStrategy=rulePullStrategy();

            state._fsp--;

             current =iv_rulePullStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePullStrategy4126); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1950:1: rulePullStrategy returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) ;
    public final EObject rulePullStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mechanisms_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1953:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1954:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1954:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1954:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_rulePullStrategy4163); 

                	newLeafNode(otherlv_0, grammarAccess.getPullStrategyAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,74,FOLLOW_74_in_rulePullStrategy4175); 

                	newLeafNode(otherlv_1, grammarAccess.getPullStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1962:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1963:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1963:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1964:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPullStrategyAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMechanism_in_rulePullStrategy4196);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_3=(Token)match(input,78,FOLLOW_78_in_rulePullStrategy4209); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1992:1: entryRulePushStrategy returns [EObject current=null] : iv_rulePushStrategy= rulePushStrategy EOF ;
    public final EObject entryRulePushStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePushStrategy = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1993:2: (iv_rulePushStrategy= rulePushStrategy EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:1994:2: iv_rulePushStrategy= rulePushStrategy EOF
            {
             newCompositeNode(grammarAccess.getPushStrategyRule()); 
            pushFollow(FOLLOW_rulePushStrategy_in_entryRulePushStrategy4245);
            iv_rulePushStrategy=rulePushStrategy();

            state._fsp--;

             current =iv_rulePushStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePushStrategy4255); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2001:1: rulePushStrategy returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) ;
    public final EObject rulePushStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mechanisms_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2004:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2005:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2005:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2005:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_rulePushStrategy4292); 

                	newLeafNode(otherlv_0, grammarAccess.getPushStrategyAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,74,FOLLOW_74_in_rulePushStrategy4304); 

                	newLeafNode(otherlv_1, grammarAccess.getPushStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2013:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2014:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2014:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2015:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPushStrategyAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMechanism_in_rulePushStrategy4325);
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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_3=(Token)match(input,78,FOLLOW_78_in_rulePushStrategy4338); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2043:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2044:2: (iv_ruleMechanism= ruleMechanism EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2045:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_ruleMechanism_in_entryRuleMechanism4374);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanism4384); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2052:1: ruleMechanism returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2055:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2056:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2056:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2056:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2056:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2057:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2057:1: (lv_name_0_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2058:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechanism4426); 

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

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleMechanism4443); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAccess().getEqualsSignKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2078:1: ( (lv_value_2_0= ruleParameter ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2079:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2079:1: (lv_value_2_0= ruleParameter )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2080:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleMechanism4464);
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

            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleMechanism4476); 

                	newLeafNode(otherlv_3, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2100:1: (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2100:3: otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleMechanism4489); 

                        	newLeafNode(otherlv_4, grammarAccess.getMechanismAccess().getDescKeyword_4_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2104:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2105:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2105:1: (lv_description_5_0= RULE_STRING )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2106:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanism4506); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2122:4: (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==84) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2122:6: otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,84,FOLLOW_84_in_ruleMechanism4526); 

                        	newLeafNode(otherlv_6, grammarAccess.getMechanismAccess().getAttributesKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,74,FOLLOW_74_in_ruleMechanism4538); 

                        	newLeafNode(otherlv_7, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2130:1: ( (lv_attributes_8_0= ruleMechanismAttribute ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_STRING) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2131:1: (lv_attributes_8_0= ruleMechanismAttribute )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2131:1: (lv_attributes_8_0= ruleMechanismAttribute )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2132:3: lv_attributes_8_0= ruleMechanismAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMechanismAttribute_in_ruleMechanism4559);
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
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleMechanism4572); 

                        	newLeafNode(otherlv_9, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,78,FOLLOW_78_in_ruleMechanism4586); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2164:1: entryRuleMechanismAttribute returns [EObject current=null] : iv_ruleMechanismAttribute= ruleMechanismAttribute EOF ;
    public final EObject entryRuleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanismAttribute = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2165:2: (iv_ruleMechanismAttribute= ruleMechanismAttribute EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2166:2: iv_ruleMechanismAttribute= ruleMechanismAttribute EOF
            {
             newCompositeNode(grammarAccess.getMechanismAttributeRule()); 
            pushFollow(FOLLOW_ruleMechanismAttribute_in_entryRuleMechanismAttribute4622);
            iv_ruleMechanismAttribute=ruleMechanismAttribute();

            state._fsp--;

             current =iv_ruleMechanismAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanismAttribute4632); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2173:1: ruleMechanismAttribute returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2176:28: ( ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2177:1: ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2177:1: ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2177:2: ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2177:2: ( (lv_attribute_0_0= RULE_STRING ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2178:1: (lv_attribute_0_0= RULE_STRING )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2178:1: (lv_attribute_0_0= RULE_STRING )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2179:3: lv_attribute_0_0= RULE_STRING
            {
            lv_attribute_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanismAttribute4674); 

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

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleMechanismAttribute4691); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAttributeAccess().getEqualsSignKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2199:1: ( (lv_value_2_0= ruleParameter ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2200:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2200:1: (lv_value_2_0= ruleParameter )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2201:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAttributeAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleMechanismAttribute4712);
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2225:1: entryRuleWorkSource returns [EObject current=null] : iv_ruleWorkSource= ruleWorkSource EOF ;
    public final EObject entryRuleWorkSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSource = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2226:2: (iv_ruleWorkSource= ruleWorkSource EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2227:2: iv_ruleWorkSource= ruleWorkSource EOF
            {
             newCompositeNode(grammarAccess.getWorkSourceRule()); 
            pushFollow(FOLLOW_ruleWorkSource_in_entryRuleWorkSource4748);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSource4758); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2234:1: ruleWorkSource returns [EObject current=null] : (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2237:28: ( (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2238:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2238:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2238:3: otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleWorkSource4795); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2242:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2243:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2243:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2244:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4812); 

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

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleWorkSource4829); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2264:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2264:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleWorkSource4842); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getDescKeyword_3_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2268:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2269:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2269:1: (lv_description_4_0= RULE_STRING )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2270:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkSource4859); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2286:4: (otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==86) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2286:6: otherlv_5= 'AssignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,86,FOLLOW_86_in_ruleWorkSource4879); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkSourceAccess().getAssignToKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleWorkSource4891); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2294:1: ( (otherlv_7= RULE_ID ) )+
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
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2295:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2295:1: (otherlv_7= RULE_ID )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2296:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource4911); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getAssignToServiceProviderCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleWorkSource4924); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleWorkSource4938); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2323:1: entryRuleWorkItemNetwork returns [EObject current=null] : iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF ;
    public final EObject entryRuleWorkItemNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemNetwork = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2324:2: (iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2325:2: iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF
            {
             newCompositeNode(grammarAccess.getWorkItemNetworkRule()); 
            pushFollow(FOLLOW_ruleWorkItemNetwork_in_entryRuleWorkItemNetwork4974);
            iv_ruleWorkItemNetwork=ruleWorkItemNetwork();

            state._fsp--;

             current =iv_ruleWorkItemNetwork; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemNetwork4984); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2332:1: ruleWorkItemNetwork returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2335:28: ( (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2336:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2336:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2336:3: otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleWorkItemNetwork5021); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemNetworkAccess().getWorkItemNetworkKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2340:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2341:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2341:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2342:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemNetwork5038); 

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

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleWorkItemNetwork5055); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2362:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==14) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2362:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleWorkItemNetwork5068); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemNetworkAccess().getDescKeyword_3_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2366:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2367:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2367:1: (lv_description_4_0= RULE_STRING )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2368:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemNetwork5085); 

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

            otherlv_5=(Token)match(input,87,FOLLOW_87_in_ruleWorkItemNetwork5104); 

                	newLeafNode(otherlv_5, grammarAccess.getWorkItemNetworkAccess().getWorkItemsKeyword_4());
                
            otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleWorkItemNetwork5116); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_5());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2392:1: ( (lv_workItems_7_0= ruleWorkItem ) )+
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
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2393:1: (lv_workItems_7_0= ruleWorkItem )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2393:1: (lv_workItems_7_0= ruleWorkItem )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2394:3: lv_workItems_7_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkItemNetworkAccess().getWorkItemsWorkItemParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItem_in_ruleWorkItemNetwork5137);
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
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleWorkItemNetwork5150); 

                	newLeafNode(otherlv_8, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleWorkItemNetwork5162); 

                	newLeafNode(otherlv_9, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_8());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2418:1: ( (lv_id_10_0= RULE_INT ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2419:1: (lv_id_10_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2419:1: (lv_id_10_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2420:3: lv_id_10_0= RULE_INT
                    {
                    lv_id_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemNetwork5179); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2444:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2445:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2446:2: iv_ruleWorkItem= ruleWorkItem EOF
            {
             newCompositeNode(grammarAccess.getWorkItemRule()); 
            pushFollow(FOLLOW_ruleWorkItem_in_entryRuleWorkItem5221);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItem5231); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2453:1: ruleWorkItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? | ( (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )? otherlv_31= 'efforts' otherlv_32= '{' ( (lv_requiredServices_33_0= ruleRequiredService ) ) (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )* otherlv_36= '}' ) ) (otherlv_37= 'maturityLevels' ( (lv_maturityLevels_38_0= ruleAbstractParameter ) ) )? (otherlv_39= 'uncertainty' ( (lv_uncertainty_40_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_41_0= 'impacts' ) ) otherlv_42= '{' ( (lv_impacts_43_0= ruleImpact ) ) (otherlv_44= ',' ( (lv_impacts_45_0= ruleImpact ) ) )* otherlv_46= '}' )? (otherlv_47= 'value' ( (lv_value_48_0= ruleNumExpression ) ) )? (otherlv_49= 'risk' ( (lv_risk_50_0= ruleAbstractParameter ) ) )? (otherlv_51= 'classOfService' ( (otherlv_52= RULE_ID ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrivalTime' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'dueDate' ( (lv_dueDate_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )? ) ;
    public final EObject ruleWorkItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token lv_hasPredecessors_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_hasSubtasks_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token lv_hasImpacts_41_0=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token lv_arrivalTime_56_0=null;
        Token otherlv_57=null;
        Token lv_dueDate_58_0=null;
        Token otherlv_59=null;
        Token lv_id_60_0=null;
        EObject lv_requiredAnalysis_21_0 = null;

        EObject lv_requiredAnalysis_23_0 = null;

        EObject lv_requiredAnalysis_27_0 = null;

        EObject lv_requiredAnalysis_29_0 = null;

        EObject lv_requiredServices_33_0 = null;

        EObject lv_requiredServices_35_0 = null;

        EObject lv_maturityLevels_38_0 = null;

        EObject lv_uncertainty_40_0 = null;

        EObject lv_impacts_43_0 = null;

        EObject lv_impacts_45_0 = null;

        EObject lv_value_48_0 = null;

        EObject lv_risk_50_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2456:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? | ( (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )? otherlv_31= 'efforts' otherlv_32= '{' ( (lv_requiredServices_33_0= ruleRequiredService ) ) (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )* otherlv_36= '}' ) ) (otherlv_37= 'maturityLevels' ( (lv_maturityLevels_38_0= ruleAbstractParameter ) ) )? (otherlv_39= 'uncertainty' ( (lv_uncertainty_40_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_41_0= 'impacts' ) ) otherlv_42= '{' ( (lv_impacts_43_0= ruleImpact ) ) (otherlv_44= ',' ( (lv_impacts_45_0= ruleImpact ) ) )* otherlv_46= '}' )? (otherlv_47= 'value' ( (lv_value_48_0= ruleNumExpression ) ) )? (otherlv_49= 'risk' ( (lv_risk_50_0= ruleAbstractParameter ) ) )? (otherlv_51= 'classOfService' ( (otherlv_52= RULE_ID ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrivalTime' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'dueDate' ( (lv_dueDate_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )? ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2457:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? | ( (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )? otherlv_31= 'efforts' otherlv_32= '{' ( (lv_requiredServices_33_0= ruleRequiredService ) ) (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )* otherlv_36= '}' ) ) (otherlv_37= 'maturityLevels' ( (lv_maturityLevels_38_0= ruleAbstractParameter ) ) )? (otherlv_39= 'uncertainty' ( (lv_uncertainty_40_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_41_0= 'impacts' ) ) otherlv_42= '{' ( (lv_impacts_43_0= ruleImpact ) ) (otherlv_44= ',' ( (lv_impacts_45_0= ruleImpact ) ) )* otherlv_46= '}' )? (otherlv_47= 'value' ( (lv_value_48_0= ruleNumExpression ) ) )? (otherlv_49= 'risk' ( (lv_risk_50_0= ruleAbstractParameter ) ) )? (otherlv_51= 'classOfService' ( (otherlv_52= RULE_ID ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrivalTime' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'dueDate' ( (lv_dueDate_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )? )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2457:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? | ( (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )? otherlv_31= 'efforts' otherlv_32= '{' ( (lv_requiredServices_33_0= ruleRequiredService ) ) (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )* otherlv_36= '}' ) ) (otherlv_37= 'maturityLevels' ( (lv_maturityLevels_38_0= ruleAbstractParameter ) ) )? (otherlv_39= 'uncertainty' ( (lv_uncertainty_40_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_41_0= 'impacts' ) ) otherlv_42= '{' ( (lv_impacts_43_0= ruleImpact ) ) (otherlv_44= ',' ( (lv_impacts_45_0= ruleImpact ) ) )* otherlv_46= '}' )? (otherlv_47= 'value' ( (lv_value_48_0= ruleNumExpression ) ) )? (otherlv_49= 'risk' ( (lv_risk_50_0= ruleAbstractParameter ) ) )? (otherlv_51= 'classOfService' ( (otherlv_52= RULE_ID ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrivalTime' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'dueDate' ( (lv_dueDate_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )? )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2457:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? | ( (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )? otherlv_31= 'efforts' otherlv_32= '{' ( (lv_requiredServices_33_0= ruleRequiredService ) ) (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )* otherlv_36= '}' ) ) (otherlv_37= 'maturityLevels' ( (lv_maturityLevels_38_0= ruleAbstractParameter ) ) )? (otherlv_39= 'uncertainty' ( (lv_uncertainty_40_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_41_0= 'impacts' ) ) otherlv_42= '{' ( (lv_impacts_43_0= ruleImpact ) ) (otherlv_44= ',' ( (lv_impacts_45_0= ruleImpact ) ) )* otherlv_46= '}' )? (otherlv_47= 'value' ( (lv_value_48_0= ruleNumExpression ) ) )? (otherlv_49= 'risk' ( (lv_risk_50_0= ruleAbstractParameter ) ) )? (otherlv_51= 'classOfService' ( (otherlv_52= RULE_ID ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrivalTime' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'dueDate' ( (lv_dueDate_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )?
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2457:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2458:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2458:1: (lv_name_0_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2459:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5273); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2475:2: (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2475:4: otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleWorkItem5291); 

                        	newLeafNode(otherlv_1, grammarAccess.getWorkItemAccess().getTypeKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleWorkItem5303); 

                        	newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getColonKeyword_1_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2483:1: ( (otherlv_3= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2484:1: (otherlv_3= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2484:1: (otherlv_3= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2485:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5323); 

                    		newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getTypeWorkItemTypeCrossReference_1_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5337); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2500:1: (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==14) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2500:3: otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleWorkItem5350); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemAccess().getDescKeyword_3_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2504:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2505:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2505:1: (lv_description_6_0= RULE_STRING )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2506:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItem5367); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getWorkItemAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2522:4: ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==88) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2522:5: ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2522:5: ( (lv_hasPredecessors_7_0= 'prerequisites' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2523:1: (lv_hasPredecessors_7_0= 'prerequisites' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2523:1: (lv_hasPredecessors_7_0= 'prerequisites' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2524:3: lv_hasPredecessors_7_0= 'prerequisites'
                    {
                    lv_hasPredecessors_7_0=(Token)match(input,88,FOLLOW_88_in_ruleWorkItem5393); 

                            newLeafNode(lv_hasPredecessors_7_0, grammarAccess.getWorkItemAccess().getHasPredecessorsPrerequisitesKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasPredecessors", true, "prerequisites");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5418); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2541:1: ( (otherlv_9= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2542:1: (otherlv_9= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2542:1: (otherlv_9= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2543:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5438); 

                    		newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2554:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==68) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2554:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5451); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2558:1: ( (otherlv_11= RULE_ID ) )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2559:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2559:1: (otherlv_11= RULE_ID )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2560:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5471); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5485); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2575:3: ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? | ( (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )? otherlv_31= 'efforts' otherlv_32= '{' ( (lv_requiredServices_33_0= ruleRequiredService ) ) (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )* otherlv_36= '}' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==78||LA57_0==89||(LA57_0>=92 && LA57_0<=100)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=90 && LA57_0<=91)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2575:4: ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )?
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2575:4: ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==89) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2575:5: ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}'
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2575:5: ( (lv_hasSubtasks_13_0= 'decomposites' ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2576:1: (lv_hasSubtasks_13_0= 'decomposites' )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2576:1: (lv_hasSubtasks_13_0= 'decomposites' )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2577:3: lv_hasSubtasks_13_0= 'decomposites'
                            {
                            lv_hasSubtasks_13_0=(Token)match(input,89,FOLLOW_89_in_ruleWorkItem5507); 

                                    newLeafNode(lv_hasSubtasks_13_0, grammarAccess.getWorkItemAccess().getHasSubtasksDecompositesKeyword_5_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                   		setWithLastConsumed(current, "hasSubtasks", true, "decomposites");
                            	    

                            }


                            }

                            otherlv_14=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5532); 

                                	newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_0_1());
                                
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2594:1: ( (otherlv_15= RULE_ID ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2595:1: (otherlv_15= RULE_ID )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2595:1: (otherlv_15= RULE_ID )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2596:3: otherlv_15= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                    
                            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5552); 

                            		newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_5_0_2_0()); 
                            	

                            }


                            }

                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2607:2: (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==68) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2607:4: otherlv_16= ',' ( (otherlv_17= RULE_ID ) )
                            	    {
                            	    otherlv_16=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5565); 

                            	        	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getCommaKeyword_5_0_3_0());
                            	        
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2611:1: ( (otherlv_17= RULE_ID ) )
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2612:1: (otherlv_17= RULE_ID )
                            	    {
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2612:1: (otherlv_17= RULE_ID )
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2613:3: otherlv_17= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	    	        }
                            	            
                            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem5585); 

                            	    		newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_5_0_3_1_0()); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);

                            otherlv_18=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5599); 

                                	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_0_4());
                                
                            otherlv_19=(Token)match(input,90,FOLLOW_90_in_ruleWorkItem5611); 

                                	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getAnalysisEffortsKeyword_5_0_5());
                                
                            otherlv_20=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5623); 

                                	newLeafNode(otherlv_20, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_0_6());
                                
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2636:1: ( (lv_requiredAnalysis_21_0= ruleRequiredService ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2637:1: (lv_requiredAnalysis_21_0= ruleRequiredService )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2637:1: (lv_requiredAnalysis_21_0= ruleRequiredService )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2638:3: lv_requiredAnalysis_21_0= ruleRequiredService
                            {
                             
                            	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_0_7_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5644);
                            lv_requiredAnalysis_21_0=ruleRequiredService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"requiredAnalysis",
                                    		lv_requiredAnalysis_21_0, 
                                    		"RequiredService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2654:2: (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==68) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2654:4: otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) )
                            	    {
                            	    otherlv_22=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5657); 

                            	        	newLeafNode(otherlv_22, grammarAccess.getWorkItemAccess().getCommaKeyword_5_0_8_0());
                            	        
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2658:1: ( (lv_requiredAnalysis_23_0= ruleRequiredService ) )
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2659:1: (lv_requiredAnalysis_23_0= ruleRequiredService )
                            	    {
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2659:1: (lv_requiredAnalysis_23_0= ruleRequiredService )
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2660:3: lv_requiredAnalysis_23_0= ruleRequiredService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_0_8_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5678);
                            	    lv_requiredAnalysis_23_0=ruleRequiredService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"requiredAnalysis",
                            	            		lv_requiredAnalysis_23_0, 
                            	            		"RequiredService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);

                            otherlv_24=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5692); 

                                	newLeafNode(otherlv_24, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_0_9());
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2681:6: ( (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )? otherlv_31= 'efforts' otherlv_32= '{' ( (lv_requiredServices_33_0= ruleRequiredService ) ) (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )* otherlv_36= '}' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2681:6: ( (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )? otherlv_31= 'efforts' otherlv_32= '{' ( (lv_requiredServices_33_0= ruleRequiredService ) ) (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )* otherlv_36= '}' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2681:7: (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )? otherlv_31= 'efforts' otherlv_32= '{' ( (lv_requiredServices_33_0= ruleRequiredService ) ) (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )* otherlv_36= '}'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2681:7: (otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==90) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2681:9: otherlv_25= 'analysisEfforts' otherlv_26= '{' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )* otherlv_30= '}'
                            {
                            otherlv_25=(Token)match(input,90,FOLLOW_90_in_ruleWorkItem5714); 

                                	newLeafNode(otherlv_25, grammarAccess.getWorkItemAccess().getAnalysisEffortsKeyword_5_1_0_0());
                                
                            otherlv_26=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5726); 

                                	newLeafNode(otherlv_26, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_1_0_1());
                                
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2689:1: ( (lv_requiredAnalysis_27_0= ruleRequiredService ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2690:1: (lv_requiredAnalysis_27_0= ruleRequiredService )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2690:1: (lv_requiredAnalysis_27_0= ruleRequiredService )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2691:3: lv_requiredAnalysis_27_0= ruleRequiredService
                            {
                             
                            	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_1_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5747);
                            lv_requiredAnalysis_27_0=ruleRequiredService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"requiredAnalysis",
                                    		lv_requiredAnalysis_27_0, 
                                    		"RequiredService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2707:2: (otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==68) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2707:4: otherlv_28= ',' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) )
                            	    {
                            	    otherlv_28=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5760); 

                            	        	newLeafNode(otherlv_28, grammarAccess.getWorkItemAccess().getCommaKeyword_5_1_0_3_0());
                            	        
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2711:1: ( (lv_requiredAnalysis_29_0= ruleRequiredService ) )
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2712:1: (lv_requiredAnalysis_29_0= ruleRequiredService )
                            	    {
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2712:1: (lv_requiredAnalysis_29_0= ruleRequiredService )
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2713:3: lv_requiredAnalysis_29_0= ruleRequiredService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_1_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5781);
                            	    lv_requiredAnalysis_29_0=ruleRequiredService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"requiredAnalysis",
                            	            		lv_requiredAnalysis_29_0, 
                            	            		"RequiredService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);

                            otherlv_30=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5795); 

                                	newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_1_0_4());
                                

                            }
                            break;

                    }

                    otherlv_31=(Token)match(input,91,FOLLOW_91_in_ruleWorkItem5809); 

                        	newLeafNode(otherlv_31, grammarAccess.getWorkItemAccess().getEffortsKeyword_5_1_1());
                        
                    otherlv_32=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem5821); 

                        	newLeafNode(otherlv_32, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_1_2());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2741:1: ( (lv_requiredServices_33_0= ruleRequiredService ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2742:1: (lv_requiredServices_33_0= ruleRequiredService )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2742:1: (lv_requiredServices_33_0= ruleRequiredService )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2743:3: lv_requiredServices_33_0= ruleRequiredService
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_5_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5842);
                    lv_requiredServices_33_0=ruleRequiredService();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"requiredServices",
                            		lv_requiredServices_33_0, 
                            		"RequiredService");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2759:2: (otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==68) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2759:4: otherlv_34= ',' ( (lv_requiredServices_35_0= ruleRequiredService ) )
                    	    {
                    	    otherlv_34=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem5855); 

                    	        	newLeafNode(otherlv_34, grammarAccess.getWorkItemAccess().getCommaKeyword_5_1_4_0());
                    	        
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2763:1: ( (lv_requiredServices_35_0= ruleRequiredService ) )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2764:1: (lv_requiredServices_35_0= ruleRequiredService )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2764:1: (lv_requiredServices_35_0= ruleRequiredService )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2765:3: lv_requiredServices_35_0= ruleRequiredService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_5_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRequiredService_in_ruleWorkItem5876);
                    	    lv_requiredServices_35_0=ruleRequiredService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiredServices",
                    	            		lv_requiredServices_35_0, 
                    	            		"RequiredService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem5890); 

                        	newLeafNode(otherlv_36, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_1_5());
                        

                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2785:3: (otherlv_37= 'maturityLevels' ( (lv_maturityLevels_38_0= ruleAbstractParameter ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==92) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2785:5: otherlv_37= 'maturityLevels' ( (lv_maturityLevels_38_0= ruleAbstractParameter ) )
                    {
                    otherlv_37=(Token)match(input,92,FOLLOW_92_in_ruleWorkItem5905); 

                        	newLeafNode(otherlv_37, grammarAccess.getWorkItemAccess().getMaturityLevelsKeyword_6_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2789:1: ( (lv_maturityLevels_38_0= ruleAbstractParameter ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2790:1: (lv_maturityLevels_38_0= ruleAbstractParameter )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2790:1: (lv_maturityLevels_38_0= ruleAbstractParameter )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2791:3: lv_maturityLevels_38_0= ruleAbstractParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getMaturityLevelsAbstractParameterParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractParameter_in_ruleWorkItem5926);
                    lv_maturityLevels_38_0=ruleAbstractParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"maturityLevels",
                            		lv_maturityLevels_38_0, 
                            		"AbstractParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2807:4: (otherlv_39= 'uncertainty' ( (lv_uncertainty_40_0= ruleAbstractParameter ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==93) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2807:6: otherlv_39= 'uncertainty' ( (lv_uncertainty_40_0= ruleAbstractParameter ) )
                    {
                    otherlv_39=(Token)match(input,93,FOLLOW_93_in_ruleWorkItem5941); 

                        	newLeafNode(otherlv_39, grammarAccess.getWorkItemAccess().getUncertaintyKeyword_7_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2811:1: ( (lv_uncertainty_40_0= ruleAbstractParameter ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2812:1: (lv_uncertainty_40_0= ruleAbstractParameter )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2812:1: (lv_uncertainty_40_0= ruleAbstractParameter )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2813:3: lv_uncertainty_40_0= ruleAbstractParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getUncertaintyAbstractParameterParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractParameter_in_ruleWorkItem5962);
                    lv_uncertainty_40_0=ruleAbstractParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"uncertainty",
                            		lv_uncertainty_40_0, 
                            		"AbstractParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2829:4: ( ( (lv_hasImpacts_41_0= 'impacts' ) ) otherlv_42= '{' ( (lv_impacts_43_0= ruleImpact ) ) (otherlv_44= ',' ( (lv_impacts_45_0= ruleImpact ) ) )* otherlv_46= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==94) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2829:5: ( (lv_hasImpacts_41_0= 'impacts' ) ) otherlv_42= '{' ( (lv_impacts_43_0= ruleImpact ) ) (otherlv_44= ',' ( (lv_impacts_45_0= ruleImpact ) ) )* otherlv_46= '}'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2829:5: ( (lv_hasImpacts_41_0= 'impacts' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2830:1: (lv_hasImpacts_41_0= 'impacts' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2830:1: (lv_hasImpacts_41_0= 'impacts' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2831:3: lv_hasImpacts_41_0= 'impacts'
                    {
                    lv_hasImpacts_41_0=(Token)match(input,94,FOLLOW_94_in_ruleWorkItem5983); 

                            newLeafNode(lv_hasImpacts_41_0, grammarAccess.getWorkItemAccess().getHasImpactsImpactsKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasImpacts", true, "impacts");
                    	    

                    }


                    }

                    otherlv_42=(Token)match(input,74,FOLLOW_74_in_ruleWorkItem6008); 

                        	newLeafNode(otherlv_42, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2848:1: ( (lv_impacts_43_0= ruleImpact ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2849:1: (lv_impacts_43_0= ruleImpact )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2849:1: (lv_impacts_43_0= ruleImpact )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2850:3: lv_impacts_43_0= ruleImpact
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImpact_in_ruleWorkItem6029);
                    lv_impacts_43_0=ruleImpact();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"impacts",
                            		lv_impacts_43_0, 
                            		"Impact");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2866:2: (otherlv_44= ',' ( (lv_impacts_45_0= ruleImpact ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==68) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2866:4: otherlv_44= ',' ( (lv_impacts_45_0= ruleImpact ) )
                    	    {
                    	    otherlv_44=(Token)match(input,68,FOLLOW_68_in_ruleWorkItem6042); 

                    	        	newLeafNode(otherlv_44, grammarAccess.getWorkItemAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2870:1: ( (lv_impacts_45_0= ruleImpact ) )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2871:1: (lv_impacts_45_0= ruleImpact )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2871:1: (lv_impacts_45_0= ruleImpact )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2872:3: lv_impacts_45_0= ruleImpact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleImpact_in_ruleWorkItem6063);
                    	    lv_impacts_45_0=ruleImpact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"impacts",
                    	            		lv_impacts_45_0, 
                    	            		"Impact");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem6077); 

                        	newLeafNode(otherlv_46, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2892:3: (otherlv_47= 'value' ( (lv_value_48_0= ruleNumExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==95) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2892:5: otherlv_47= 'value' ( (lv_value_48_0= ruleNumExpression ) )
                    {
                    otherlv_47=(Token)match(input,95,FOLLOW_95_in_ruleWorkItem6092); 

                        	newLeafNode(otherlv_47, grammarAccess.getWorkItemAccess().getValueKeyword_9_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2896:1: ( (lv_value_48_0= ruleNumExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2897:1: (lv_value_48_0= ruleNumExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2897:1: (lv_value_48_0= ruleNumExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2898:3: lv_value_48_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getValueNumExpressionParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItem6113);
                    lv_value_48_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_48_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2914:4: (otherlv_49= 'risk' ( (lv_risk_50_0= ruleAbstractParameter ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==96) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2914:6: otherlv_49= 'risk' ( (lv_risk_50_0= ruleAbstractParameter ) )
                    {
                    otherlv_49=(Token)match(input,96,FOLLOW_96_in_ruleWorkItem6128); 

                        	newLeafNode(otherlv_49, grammarAccess.getWorkItemAccess().getRiskKeyword_10_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2918:1: ( (lv_risk_50_0= ruleAbstractParameter ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2919:1: (lv_risk_50_0= ruleAbstractParameter )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2919:1: (lv_risk_50_0= ruleAbstractParameter )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2920:3: lv_risk_50_0= ruleAbstractParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRiskAbstractParameterParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractParameter_in_ruleWorkItem6149);
                    lv_risk_50_0=ruleAbstractParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"risk",
                            		lv_risk_50_0, 
                            		"AbstractParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2936:4: (otherlv_51= 'classOfService' ( (otherlv_52= RULE_ID ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==97) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2936:6: otherlv_51= 'classOfService' ( (otherlv_52= RULE_ID ) )
                    {
                    otherlv_51=(Token)match(input,97,FOLLOW_97_in_ruleWorkItem6164); 

                        	newLeafNode(otherlv_51, grammarAccess.getWorkItemAccess().getClassOfServiceKeyword_11_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2940:1: ( (otherlv_52= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2941:1: (otherlv_52= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2941:1: (otherlv_52= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2942:3: otherlv_52= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_52=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6184); 

                    		newLeafNode(otherlv_52, grammarAccess.getWorkItemAccess().getClassOfServiceClassOfServiceCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2953:4: (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==98) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2953:6: otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) )
                    {
                    otherlv_53=(Token)match(input,98,FOLLOW_98_in_ruleWorkItem6199); 

                        	newLeafNode(otherlv_53, grammarAccess.getWorkItemAccess().getWorkSourceKeyword_12_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2957:1: ( (otherlv_54= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2958:1: (otherlv_54= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2958:1: (otherlv_54= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2959:3: otherlv_54= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_54=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6219); 

                    		newLeafNode(otherlv_54, grammarAccess.getWorkItemAccess().getWorkSourceWorkSourceCrossReference_12_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2970:4: (otherlv_55= 'arrivalTime' ( (lv_arrivalTime_56_0= RULE_INT ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==99) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2970:6: otherlv_55= 'arrivalTime' ( (lv_arrivalTime_56_0= RULE_INT ) )
                    {
                    otherlv_55=(Token)match(input,99,FOLLOW_99_in_ruleWorkItem6234); 

                        	newLeafNode(otherlv_55, grammarAccess.getWorkItemAccess().getArrivalTimeKeyword_13_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2974:1: ( (lv_arrivalTime_56_0= RULE_INT ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2975:1: (lv_arrivalTime_56_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2975:1: (lv_arrivalTime_56_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2976:3: lv_arrivalTime_56_0= RULE_INT
                    {
                    lv_arrivalTime_56_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem6251); 

                    			newLeafNode(lv_arrivalTime_56_0, grammarAccess.getWorkItemAccess().getArrivalTimeINTTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arrivalTime",
                            		lv_arrivalTime_56_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2992:4: (otherlv_57= 'dueDate' ( (lv_dueDate_58_0= RULE_INT ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==100) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2992:6: otherlv_57= 'dueDate' ( (lv_dueDate_58_0= RULE_INT ) )
                    {
                    otherlv_57=(Token)match(input,100,FOLLOW_100_in_ruleWorkItem6271); 

                        	newLeafNode(otherlv_57, grammarAccess.getWorkItemAccess().getDueDateKeyword_14_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2996:1: ( (lv_dueDate_58_0= RULE_INT ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2997:1: (lv_dueDate_58_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2997:1: (lv_dueDate_58_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:2998:3: lv_dueDate_58_0= RULE_INT
                    {
                    lv_dueDate_58_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem6288); 

                    			newLeafNode(lv_dueDate_58_0, grammarAccess.getWorkItemAccess().getDueDateINTTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dueDate",
                            		lv_dueDate_58_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_59=(Token)match(input,78,FOLLOW_78_in_ruleWorkItem6307); 

                	newLeafNode(otherlv_59, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_15());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3018:1: ( (lv_id_60_0= RULE_INT ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_INT) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3019:1: (lv_id_60_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3019:1: (lv_id_60_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3020:3: lv_id_60_0= RULE_INT
                    {
                    lv_id_60_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem6324); 

                    			newLeafNode(lv_id_60_0, grammarAccess.getWorkItemAccess().getIdINTTerminalRuleCall_16_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_60_0, 
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3044:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3045:2: (iv_ruleRequiredService= ruleRequiredService EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3046:2: iv_ruleRequiredService= ruleRequiredService EOF
            {
             newCompositeNode(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_ruleRequiredService_in_entryRuleRequiredService6366);
            iv_ruleRequiredService=ruleRequiredService();

            state._fsp--;

             current =iv_ruleRequiredService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredService6376); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3053:1: ruleRequiredService returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efforts_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3056:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3057:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3057:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3057:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleRequiredService6413); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getLeftSquareBracketKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3061:1: ( (otherlv_1= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3062:1: (otherlv_1= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3062:1: (otherlv_1= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3063:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredServiceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredService6433); 

            		newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getServiceTypeServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleRequiredService6445); 

                	newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getCommaKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3078:1: ( (lv_efforts_3_0= ruleAbstractParameter ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3079:1: (lv_efforts_3_0= ruleAbstractParameter )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3079:1: (lv_efforts_3_0= ruleAbstractParameter )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3080:3: lv_efforts_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getRequiredServiceAccess().getEffortsAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleRequiredService6466);
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

            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleRequiredService6478); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3108:1: entryRuleImpact returns [EObject current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final EObject entryRuleImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpact = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3109:2: (iv_ruleImpact= ruleImpact EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3110:2: iv_ruleImpact= ruleImpact EOF
            {
             newCompositeNode(grammarAccess.getImpactRule()); 
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact6514);
            iv_ruleImpact=ruleImpact();

            state._fsp--;

             current =iv_ruleImpact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact6524); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3117:1: ruleImpact returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3120:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3121:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3121:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3121:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3121:2: ( (otherlv_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3122:1: (otherlv_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3122:1: (otherlv_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3123:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImpactRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImpact6569); 

            		newLeafNode(otherlv_0, grammarAccess.getImpactAccess().getImpactWIWorkItemCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleImpact6581); 

                	newLeafNode(otherlv_1, grammarAccess.getImpactAccess().getLeftSquareBracketKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3138:1: ( (lv_likelihood_2_0= ruleAbstractParameter ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3139:1: (lv_likelihood_2_0= ruleAbstractParameter )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3139:1: (lv_likelihood_2_0= ruleAbstractParameter )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3140:3: lv_likelihood_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getLikelihoodAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleImpact6602);
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

            otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleImpact6614); 

                	newLeafNode(otherlv_3, grammarAccess.getImpactAccess().getCommaKeyword_3());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3160:1: ( (lv_risk_4_0= ruleAbstractParameter ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3161:1: (lv_risk_4_0= ruleAbstractParameter )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3161:1: (lv_risk_4_0= ruleAbstractParameter )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3162:3: lv_risk_4_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getRiskAbstractParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleImpact6635);
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

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleImpact6647); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3190:1: entryRuleWorkItemType returns [EObject current=null] : iv_ruleWorkItemType= ruleWorkItemType EOF ;
    public final EObject entryRuleWorkItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemType = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3191:2: (iv_ruleWorkItemType= ruleWorkItemType EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3192:2: iv_ruleWorkItemType= ruleWorkItemType EOF
            {
             newCompositeNode(grammarAccess.getWorkItemTypeRule()); 
            pushFollow(FOLLOW_ruleWorkItemType_in_entryRuleWorkItemType6683);
            iv_ruleWorkItemType=ruleWorkItemType();

            state._fsp--;

             current =iv_ruleWorkItemType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemType6693); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3199:1: ruleWorkItemType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3202:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3203:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3203:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3203:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3203:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_INT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3204:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3204:1: (lv_id_0_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3205:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemType6735); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3221:3: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3222:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3222:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3223:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemType6758); 

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

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleWorkItemType6775); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3243:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==14) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3243:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleWorkItemType6788); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemTypeAccess().getDescKeyword_3_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3247:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3248:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3248:1: (lv_description_4_0= RULE_STRING )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3249:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemType6805); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3265:4: (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==101) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3265:6: otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,101,FOLLOW_101_in_ruleWorkItemType6825); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemTypeAccess().getHierarchyKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,83,FOLLOW_83_in_ruleWorkItemType6837); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkItemTypeAccess().getEqualsSignKeyword_4_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3273:1: ( (lv_hierarchy_7_0= RULE_INT ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3274:1: (lv_hierarchy_7_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3274:1: (lv_hierarchy_7_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3275:3: lv_hierarchy_7_0= RULE_INT
                    {
                    lv_hierarchy_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemType6854); 

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

            otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleWorkItemType6873); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3305:1: entryRuleClassOfService returns [EObject current=null] : iv_ruleClassOfService= ruleClassOfService EOF ;
    public final EObject entryRuleClassOfService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOfService = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3306:2: (iv_ruleClassOfService= ruleClassOfService EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3307:2: iv_ruleClassOfService= ruleClassOfService EOF
            {
             newCompositeNode(grammarAccess.getClassOfServiceRule()); 
            pushFollow(FOLLOW_ruleClassOfService_in_entryRuleClassOfService6911);
            iv_ruleClassOfService=ruleClassOfService();

            state._fsp--;

             current =iv_ruleClassOfService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOfService6921); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3314:1: ruleClassOfService returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3317:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3318:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3318:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3318:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3318:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_INT) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3319:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3319:1: (lv_id_0_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3320:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleClassOfService6963); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3336:3: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3337:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3337:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3338:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassOfService6986); 

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

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleClassOfService7003); 

                	newLeafNode(otherlv_2, grammarAccess.getClassOfServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3358:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==14) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3358:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleClassOfService7016); 

                        	newLeafNode(otherlv_3, grammarAccess.getClassOfServiceAccess().getDescKeyword_3_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3362:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3363:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3363:1: (lv_description_4_0= RULE_STRING )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3364:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassOfService7033); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3380:4: (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==102) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3380:6: otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,102,FOLLOW_102_in_ruleClassOfService7053); 

                        	newLeafNode(otherlv_5, grammarAccess.getClassOfServiceAccess().getPriorityKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,83,FOLLOW_83_in_ruleClassOfService7065); 

                        	newLeafNode(otherlv_6, grammarAccess.getClassOfServiceAccess().getEqualsSignKeyword_4_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3388:1: ( (lv_priority_7_0= RULE_INT ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3389:1: (lv_priority_7_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3389:1: (lv_priority_7_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3390:3: lv_priority_7_0= RULE_INT
                    {
                    lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleClassOfService7082); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3406:4: (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==103) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3406:6: otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_8=(Token)match(input,103,FOLLOW_103_in_ruleClassOfService7102); 

                        	newLeafNode(otherlv_8, grammarAccess.getClassOfServiceAccess().getDisruptiveKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,59,FOLLOW_59_in_ruleClassOfService7114); 

                        	newLeafNode(otherlv_9, grammarAccess.getClassOfServiceAccess().getColonKeyword_5_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3414:1: ( (lv_disruptive_10_0= RULE_BOOLEAN ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3415:1: (lv_disruptive_10_0= RULE_BOOLEAN )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3415:1: (lv_disruptive_10_0= RULE_BOOLEAN )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3416:3: lv_disruptive_10_0= RULE_BOOLEAN
                    {
                    lv_disruptive_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleClassOfService7131); 

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

            otherlv_11=(Token)match(input,78,FOLLOW_78_in_ruleClassOfService7150); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3444:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3445:2: (iv_ruleService= ruleService EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3446:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService7186);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService7196); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3453:1: ruleService returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3456:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3457:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3457:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3457:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )?
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3457:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3458:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3458:1: (lv_name_0_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3459:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService7238); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3475:2: (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==74) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3475:4: otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleService7256); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3479:1: (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==14) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3479:3: otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleService7269); 

                                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getDescKeyword_1_1_0());
                                
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3483:1: ( (lv_description_3_0= RULE_STRING ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3484:1: (lv_description_3_0= RULE_STRING )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3484:1: (lv_description_3_0= RULE_STRING )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3485:3: lv_description_3_0= RULE_STRING
                            {
                            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService7286); 

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

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3501:4: (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==101) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3501:6: otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) )
                            {
                            otherlv_4=(Token)match(input,101,FOLLOW_101_in_ruleService7306); 

                                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getHierarchyKeyword_1_2_0());
                                
                            otherlv_5=(Token)match(input,83,FOLLOW_83_in_ruleService7318); 

                                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getEqualsSignKeyword_1_2_1());
                                
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3509:1: ( (lv_hierarchy_6_0= RULE_INT ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3510:1: (lv_hierarchy_6_0= RULE_INT )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3510:1: (lv_hierarchy_6_0= RULE_INT )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3511:3: lv_hierarchy_6_0= RULE_INT
                            {
                            lv_hierarchy_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleService7335); 

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

                    otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleService7354); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3531:3: ( (lv_id_8_0= RULE_INT ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_INT) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3532:1: (lv_id_8_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3532:1: (lv_id_8_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3533:3: lv_id_8_0= RULE_INT
                    {
                    lv_id_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleService7373); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3557:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3558:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3559:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider7415);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProvider7425); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3566:1: ruleServiceProvider returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )? ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token lv_id_24_0=null;
        EObject lv_resources_22_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3569:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )? ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3570:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )? )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3570:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )? )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3570:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )?
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3570:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3571:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3571:1: (lv_name_0_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3572:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7467); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3588:2: (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==72) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3588:4: otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleServiceProvider7485); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getTypeKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleServiceProvider7497); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceProviderAccess().getColonKeyword_1_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3596:1: ( (otherlv_3= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3597:1: (otherlv_3= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3597:1: (otherlv_3= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3598:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7517); 

                    		newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getTypeServiceProviderTypeCrossReference_1_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleServiceProvider7531); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3613:1: (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==104) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3613:3: otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,104,FOLLOW_104_in_ruleServiceProvider7544); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderAccess().getAssignToKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleServiceProvider7556); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3621:1: ( (otherlv_7= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3622:1: (otherlv_7= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3622:1: (otherlv_7= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3623:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7576); 

                    		newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3634:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==68) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3634:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7589); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3638:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3639:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3639:1: (otherlv_9= RULE_ID )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3640:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7609); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,78,FOLLOW_78_in_ruleServiceProvider7623); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3655:3: (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==105) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3655:5: otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,105,FOLLOW_105_in_ruleServiceProvider7638); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getOutsourceFromKeyword_4_0());
                        
                    otherlv_12=(Token)match(input,74,FOLLOW_74_in_ruleServiceProvider7650); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3663:1: ( (otherlv_13= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3664:1: (otherlv_13= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3664:1: (otherlv_13= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3665:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7670); 

                    		newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getOutsourceFromServiceProviderCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3676:2: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==68) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3676:4: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,68,FOLLOW_68_in_ruleServiceProvider7683); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3680:1: ( (otherlv_15= RULE_ID ) )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3681:1: (otherlv_15= RULE_ID )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3681:1: (otherlv_15= RULE_ID )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3682:3: otherlv_15= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7703); 

                    	    		newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getOutsourceFromServiceProviderCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,78,FOLLOW_78_in_ruleServiceProvider7717); 

                        	newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3697:3: (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==106) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3697:5: otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) )
                    {
                    otherlv_17=(Token)match(input,106,FOLLOW_106_in_ruleServiceProvider7732); 

                        	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getStrategyKeyword_5_0());
                        
                    otherlv_18=(Token)match(input,59,FOLLOW_59_in_ruleServiceProvider7744); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getColonKeyword_5_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3705:1: ( (otherlv_19= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3706:1: (otherlv_19= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3706:1: (otherlv_19= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3707:3: otherlv_19= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7764); 

                    		newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getGovernanceStrategyGovernanceStrategyCrossReference_5_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3718:4: (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==107) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3718:6: otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+
                    {
                    otherlv_20=(Token)match(input,107,FOLLOW_107_in_ruleServiceProvider7779); 

                        	newLeafNode(otherlv_20, grammarAccess.getServiceProviderAccess().getResourcesKeyword_6_0());
                        
                    otherlv_21=(Token)match(input,59,FOLLOW_59_in_ruleServiceProvider7791); 

                        	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getColonKeyword_6_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3726:1: ( (lv_resources_22_0= ruleAsset ) )+
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
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3727:1: (lv_resources_22_0= ruleAsset )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3727:1: (lv_resources_22_0= ruleAsset )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3728:3: lv_resources_22_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleServiceProvider7812);
                    	    lv_resources_22_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_22_0, 
                    	            		"Asset");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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


                    }
                    break;

            }

            otherlv_23=(Token)match(input,78,FOLLOW_78_in_ruleServiceProvider7827); 

                	newLeafNode(otherlv_23, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_7());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3748:1: ( (lv_id_24_0= RULE_INT ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_INT) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3749:1: (lv_id_24_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3749:1: (lv_id_24_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3750:3: lv_id_24_0= RULE_INT
                    {
                    lv_id_24_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceProvider7844); 

                    			newLeafNode(lv_id_24_0, grammarAccess.getServiceProviderAccess().getIdINTTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_24_0, 
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3774:1: entryRuleServiceProviderType returns [EObject current=null] : iv_ruleServiceProviderType= ruleServiceProviderType EOF ;
    public final EObject entryRuleServiceProviderType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProviderType = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3775:2: (iv_ruleServiceProviderType= ruleServiceProviderType EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3776:2: iv_ruleServiceProviderType= ruleServiceProviderType EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderTypeRule()); 
            pushFollow(FOLLOW_ruleServiceProviderType_in_entryRuleServiceProviderType7886);
            iv_ruleServiceProviderType=ruleServiceProviderType();

            state._fsp--;

             current =iv_ruleServiceProviderType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProviderType7896); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3783:1: ruleServiceProviderType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3786:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3787:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3787:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3787:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3787:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_INT) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3788:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3788:1: (lv_id_0_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3789:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceProviderType7938); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3805:3: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3806:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3806:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3807:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProviderType7961); 

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

            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleServiceProviderType7978); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceProviderTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3827:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==14) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3827:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleServiceProviderType7991); 

                        	newLeafNode(otherlv_3, grammarAccess.getServiceProviderTypeAccess().getDescKeyword_3_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3831:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3832:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3832:1: (lv_description_4_0= RULE_STRING )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3833:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceProviderType8008); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3849:4: (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==101) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3849:6: otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,101,FOLLOW_101_in_ruleServiceProviderType8028); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderTypeAccess().getHierarchyKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,83,FOLLOW_83_in_ruleServiceProviderType8040); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderTypeAccess().getEqualsSignKeyword_4_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3857:1: ( (lv_hierarchy_7_0= RULE_INT ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3858:1: (lv_hierarchy_7_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3858:1: (lv_hierarchy_7_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3859:3: lv_hierarchy_7_0= RULE_INT
                    {
                    lv_hierarchy_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceProviderType8057); 

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

            otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleServiceProviderType8076); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3887:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3888:2: (iv_ruleAsset= ruleAsset EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3889:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset8112);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset8122); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3896:1: ruleAsset returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3899:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3900:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3900:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3900:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )?
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3900:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3901:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3901:1: (lv_name_0_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3902:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset8164); 

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

            otherlv_1=(Token)match(input,108,FOLLOW_108_in_ruleAsset8181); 

                	newLeafNode(otherlv_1, grammarAccess.getAssetAccess().getAsteriskKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3922:1: ( (lv_number_2_0= ruleAbstractParameter ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3923:1: (lv_number_2_0= ruleAbstractParameter )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3923:1: (lv_number_2_0= ruleAbstractParameter )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3924:3: lv_number_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getAssetAccess().getNumberAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleAsset8202);
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

            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleAsset8214); 

                	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3944:1: (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==109) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3944:3: otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    {
                    otherlv_4=(Token)match(input,109,FOLLOW_109_in_ruleAsset8227); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getSkillsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,59,FOLLOW_59_in_ruleAsset8239); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getColonKeyword_4_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3952:1: ( (lv_skillSet_6_0= ruleSkill ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3953:1: (lv_skillSet_6_0= ruleSkill )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3953:1: (lv_skillSet_6_0= ruleSkill )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3954:3: lv_skillSet_6_0= ruleSkill
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSkill_in_ruleAsset8260);
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

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3970:2: (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==68) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3970:4: otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) )
                    	    {
                    	    otherlv_7=(Token)match(input,68,FOLLOW_68_in_ruleAsset8273); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3974:1: ( (lv_skillSet_8_0= ruleSkill ) )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3975:1: (lv_skillSet_8_0= ruleSkill )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3975:1: (lv_skillSet_8_0= ruleSkill )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3976:3: lv_skillSet_8_0= ruleSkill
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSkill_in_ruleAsset8294);
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
                    	    break loop92;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleAsset8310); 

                	newLeafNode(otherlv_9, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3996:1: ( (lv_id_10_0= RULE_INT ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_INT) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3997:1: (lv_id_10_0= RULE_INT )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3997:1: (lv_id_10_0= RULE_INT )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:3998:3: lv_id_10_0= RULE_INT
                    {
                    lv_id_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAsset8327); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4022:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4023:2: (iv_ruleSkill= ruleSkill EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4024:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_ruleSkill_in_entryRuleSkill8369);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkill8379); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4031:1: ruleSkill returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efficiency_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4034:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4035:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4035:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4035:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleSkill8416); 

                	newLeafNode(otherlv_0, grammarAccess.getSkillAccess().getLeftSquareBracketKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4039:1: ( (otherlv_1= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4040:1: (otherlv_1= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4040:1: (otherlv_1= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4041:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkillRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkill8436); 

            		newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getServiceServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleSkill8448); 

                	newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getCommaKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4056:1: ( (lv_efficiency_3_0= ruleAbstractParameter ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4057:1: (lv_efficiency_3_0= ruleAbstractParameter )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4057:1: (lv_efficiency_3_0= ruleAbstractParameter )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4058:3: lv_efficiency_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getSkillAccess().getEfficiencyAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractParameter_in_ruleSkill8469);
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

            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleSkill8481); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4086:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4087:2: (iv_ruleType= ruleType EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4088:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType8518);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType8529); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4095:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Class_0= ruleClass | this_DataType_1= ruleDataType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Class_0 = null;

        AntlrDatatypeRuleToken this_DataType_1 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4098:28: ( (this_Class_0= ruleClass | this_DataType_1= ruleDataType ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4099:1: (this_Class_0= ruleClass | this_DataType_1= ruleDataType )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4099:1: (this_Class_0= ruleClass | this_DataType_1= ruleDataType )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=112 && LA95_0<=116)) ) {
                alt95=1;
            }
            else if ( (LA95_0==60||LA95_0==62||(LA95_0>=110 && LA95_0<=111)) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4100:5: this_Class_0= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClass_in_ruleType8576);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    		current.merge(this_Class_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4112:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType8609);
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4130:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4131:2: (iv_ruleDataType= ruleDataType EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4132:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType8655);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType8666); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4139:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4142:28: ( (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4143:1: (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4143:1: (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt96=1;
                }
                break;
            case 60:
                {
                alt96=2;
                }
                break;
            case 110:
                {
                alt96=3;
                }
                break;
            case 111:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4144:2: kw= 'string'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleDataType8704); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4151:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleDataType8723); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4158:2: kw= 'int'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleDataType8742); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4165:2: kw= 'double'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleDataType8761); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4178:1: entryRuleClass returns [String current=null] : iv_ruleClass= ruleClass EOF ;
    public final String entryRuleClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4179:2: (iv_ruleClass= ruleClass EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4180:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass8802);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass8813); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4187:1: ruleClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' ) ;
    public final AntlrDatatypeRuleToken ruleClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4190:28: ( (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4191:1: (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4191:1: (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' )
            int alt97=5;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt97=1;
                }
                break;
            case 113:
                {
                alt97=2;
                }
                break;
            case 114:
                {
                alt97=3;
                }
                break;
            case 115:
                {
                alt97=4;
                }
                break;
            case 116:
                {
                alt97=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4192:2: kw= 'Agent'
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleClass8851); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getAgentKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4199:2: kw= 'Task'
                    {
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleClass8870); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getTaskKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4206:2: kw= 'Contract'
                    {
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleClass8889); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getContractKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4213:2: kw= 'Bid'
                    {
                    kw=(Token)match(input,115,FOLLOW_115_in_ruleClass8908); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getBidKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4220:2: kw= 'Service'
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleClass8927); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4233:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4234:2: (iv_ruleAbstractType= ruleAbstractType EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4235:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_ruleAbstractType_in_entryRuleAbstractType8967);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractType8977); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4242:1: ruleAbstractType returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4245:28: ( ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4246:1: ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4246:1: ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) )
            int alt98=3;
            switch ( input.LA(1) ) {
            case 60:
            case 62:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
                {
                alt98=1;
                }
                break;
            case 117:
                {
                alt98=2;
                }
                break;
            case 118:
                {
                alt98=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4246:2: ( (lv_type_0_0= ruleType ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4246:2: ( (lv_type_0_0= ruleType ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4247:1: (lv_type_0_0= ruleType )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4247:1: (lv_type_0_0= ruleType )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4248:3: lv_type_0_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getTypeTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractType9023);
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4265:6: ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4265:6: ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4265:7: ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4265:7: ( (lv_listType_1_0= 'List' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4266:1: (lv_listType_1_0= 'List' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4266:1: (lv_listType_1_0= 'List' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4267:3: lv_listType_1_0= 'List'
                    {
                    lv_listType_1_0=(Token)match(input,117,FOLLOW_117_in_ruleAbstractType9048); 

                            newLeafNode(lv_listType_1_0, grammarAccess.getAbstractTypeAccess().getListTypeListKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractTypeRule());
                    	        }
                           		setWithLastConsumed(current, "listType", true, "List");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleAbstractType9073); 

                        	newLeafNode(otherlv_2, grammarAccess.getAbstractTypeAccess().getLessThanSignKeyword_1_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4284:1: ( (lv_type_3_0= ruleType ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4285:1: (lv_type_3_0= ruleType )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4285:1: (lv_type_3_0= ruleType )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4286:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getTypeTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractType9094);
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

                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleAbstractType9106); 

                        	newLeafNode(otherlv_4, grammarAccess.getAbstractTypeAccess().getGreaterThanSignKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4307:6: ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4307:6: ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4307:7: ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4307:7: ( (lv_mapType_5_0= 'Map' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4308:1: (lv_mapType_5_0= 'Map' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4308:1: (lv_mapType_5_0= 'Map' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4309:3: lv_mapType_5_0= 'Map'
                    {
                    lv_mapType_5_0=(Token)match(input,118,FOLLOW_118_in_ruleAbstractType9132); 

                            newLeafNode(lv_mapType_5_0, grammarAccess.getAbstractTypeAccess().getMapTypeMapKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractTypeRule());
                    	        }
                           		setWithLastConsumed(current, "mapType", true, "Map");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleAbstractType9157); 

                        	newLeafNode(otherlv_6, grammarAccess.getAbstractTypeAccess().getLessThanSignKeyword_2_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4326:1: ( (lv_keyType_7_0= ruleType ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4327:1: (lv_keyType_7_0= ruleType )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4327:1: (lv_keyType_7_0= ruleType )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4328:3: lv_keyType_7_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getKeyTypeTypeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractType9178);
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

                    otherlv_8=(Token)match(input,68,FOLLOW_68_in_ruleAbstractType9190); 

                        	newLeafNode(otherlv_8, grammarAccess.getAbstractTypeAccess().getCommaKeyword_2_3());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4348:1: ( (lv_valueType_9_0= ruleType ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4349:1: (lv_valueType_9_0= ruleType )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4349:1: (lv_valueType_9_0= ruleType )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4350:3: lv_valueType_9_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getValueTypeTypeParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractType9211);
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

                    otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleAbstractType9223); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4384:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4385:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4386:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute9266);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute9276); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4393:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4396:28: ( ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4397:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4397:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4397:2: ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )?
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4397:2: ( (lv_type_0_0= ruleAbstractType ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4398:1: (lv_type_0_0= ruleAbstractType )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4398:1: (lv_type_0_0= ruleAbstractType )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4399:3: lv_type_0_0= ruleAbstractType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAbstractTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractType_in_ruleAttribute9322);
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4415:2: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4416:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4416:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4417:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute9339); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4433:2: (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==119) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4433:4: otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) )
                    {
                    otherlv_2=(Token)match(input,119,FOLLOW_119_in_ruleAttribute9357); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDefaultKeyword_2_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4437:1: ( (lv_default_3_0= ruleParameter ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4438:1: (lv_default_3_0= ruleParameter )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4438:1: (lv_default_3_0= ruleParameter )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4439:3: lv_default_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getDefaultParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleAttribute9378);
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4463:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4464:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4465:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue9416);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue9426); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4472:1: ruleAttributeValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4475:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4476:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4476:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4476:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4476:2: ( (otherlv_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4477:1: (otherlv_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4477:1: (otherlv_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4478:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeValueRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeValue9471); 

            		newLeafNode(otherlv_0, grammarAccess.getAttributeValueAccess().getAttributeAttributeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleAttributeValue9483); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getEqualsSignKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4493:1: ( (lv_value_2_0= ruleParameter ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4494:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4494:1: (lv_value_2_0= ruleParameter )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4495:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleAttributeValue9504);
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4519:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4520:2: (iv_ruleVariable= ruleVariable EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4521:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable9540);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable9550); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4528:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4531:28: ( ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4532:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4532:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4532:2: ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4532:2: ( (lv_type_0_0= ruleAbstractType ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4533:1: (lv_type_0_0= ruleAbstractType )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4533:1: (lv_type_0_0= ruleAbstractType )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4534:3: lv_type_0_0= ruleAbstractType
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getTypeAbstractTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractType_in_ruleVariable9596);
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4550:2: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4551:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4551:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4552:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable9613); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4576:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4577:2: (iv_ruleAction= ruleAction EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4578:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction9654);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction9664); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4585:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4588:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4589:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4589:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4589:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,120,FOLLOW_120_in_ruleAction9701); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4593:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4594:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4594:1: (lv_name_1_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4595:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction9718); 

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

            otherlv_2=(Token)match(input,121,FOLLOW_121_in_ruleAction9735); 

                	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4615:1: ( (lv_inputs_3_0= ruleVariable ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==60||LA100_0==62||(LA100_0>=110 && LA100_0<=118)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4616:1: (lv_inputs_3_0= ruleVariable )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4616:1: (lv_inputs_3_0= ruleVariable )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4617:3: lv_inputs_3_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getInputsVariableParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleAction9756);
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4633:3: (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==68) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4633:5: otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleAction9770); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_4_0());
            	        
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4637:1: ( (lv_inputs_5_0= ruleVariable ) )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4638:1: (lv_inputs_5_0= ruleVariable )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4638:1: (lv_inputs_5_0= ruleVariable )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4639:3: lv_inputs_5_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionAccess().getInputsVariableParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleAction9791);
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
            	    break loop101;
                }
            } while (true);

            otherlv_6=(Token)match(input,122,FOLLOW_122_in_ruleAction9805); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4667:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4668:2: (iv_ruleState= ruleState EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4669:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState9841);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState9851); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4676:1: ruleState returns [EObject current=null] : ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4679:28: ( ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4680:1: ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4680:1: ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==123) ) {
                alt103=1;
            }
            else if ( (LA103_0==124) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4680:2: ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4680:2: ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4680:3: ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4680:3: ( (lv_backgroundState_0_0= 'backgroundState' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4681:1: (lv_backgroundState_0_0= 'backgroundState' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4681:1: (lv_backgroundState_0_0= 'backgroundState' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4682:3: lv_backgroundState_0_0= 'backgroundState'
                    {
                    lv_backgroundState_0_0=(Token)match(input,123,FOLLOW_123_in_ruleState9895); 

                            newLeafNode(lv_backgroundState_0_0, grammarAccess.getStateAccess().getBackgroundStateBackgroundStateKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(current, "backgroundState", true, "backgroundState");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4695:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4696:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4696:1: (lv_name_1_0= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4697:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState9925); 

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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4714:6: (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4714:6: (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4714:8: otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,124,FOLLOW_124_in_ruleState9950); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_1_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4718:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4719:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4719:1: (lv_name_3_0= RULE_ID )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4720:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState9967); 

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

                    otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleState9984); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_2());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4740:1: ( (lv_statements_5_0= ruleStatement ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==RULE_ID||LA102_0==126||(LA102_0>=130 && LA102_0<=132)||LA102_0==134||LA102_0==136||(LA102_0>=141 && LA102_0<=142)) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4741:1: (lv_statements_5_0= ruleStatement )
                    	    {
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4741:1: (lv_statements_5_0= ruleStatement )
                    	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4742:3: lv_statements_5_0= ruleStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatementsStatementParserRuleCall_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleState10005);
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
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleState10018); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4770:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4771:2: (iv_ruleIfExpression= ruleIfExpression EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4772:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
             newCompositeNode(grammarAccess.getIfExpressionRule()); 
            pushFollow(FOLLOW_ruleIfExpression_in_entryRuleIfExpression10055);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;

             current =iv_ruleIfExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpression10065); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4779:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4782:28: ( (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4783:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4783:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4783:3: otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )?
            {
            otherlv_0=(Token)match(input,121,FOLLOW_121_in_ruleIfExpression10102); 

                	newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4787:1: ( (lv_condition_1_0= ruleCondition ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4788:1: (lv_condition_1_0= ruleCondition )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4788:1: (lv_condition_1_0= ruleCondition )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4789:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleIfExpression10123);
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

            otherlv_2=(Token)match(input,122,FOLLOW_122_in_ruleIfExpression10135); 

                	newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleIfExpression10147); 

                	newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4813:1: ( (lv_statements_4_0= ruleStatement ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==RULE_ID||LA104_0==126||(LA104_0>=130 && LA104_0<=132)||LA104_0==134||LA104_0==136||(LA104_0>=141 && LA104_0<=142)) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4814:1: (lv_statements_4_0= ruleStatement )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4814:1: (lv_statements_4_0= ruleStatement )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4815:3: lv_statements_4_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfExpressionAccess().getStatementsStatementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfExpression10168);
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
            	    break loop104;
                }
            } while (true);

            otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleIfExpression10181); 

                	newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_5());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4835:1: (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==125) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4835:3: otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) )
                    {
                    otherlv_6=(Token)match(input,125,FOLLOW_125_in_ruleIfExpression10194); 

                        	newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getElseKeyword_6_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4839:1: ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==126) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==74) ) {
                        alt106=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4839:2: ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4839:2: ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4839:3: ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4839:3: ( (lv_hasElseIf_7_0= 'if' ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4840:1: (lv_hasElseIf_7_0= 'if' )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4840:1: (lv_hasElseIf_7_0= 'if' )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4841:3: lv_hasElseIf_7_0= 'if'
                            {
                            lv_hasElseIf_7_0=(Token)match(input,126,FOLLOW_126_in_ruleIfExpression10214); 

                                    newLeafNode(lv_hasElseIf_7_0, grammarAccess.getIfExpressionAccess().getHasElseIfIfKeyword_6_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getIfExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "hasElseIf", true, "if");
                            	    

                            }


                            }

                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4854:2: ( (lv_elseIf_8_0= ruleIfExpression ) )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4855:1: (lv_elseIf_8_0= ruleIfExpression )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4855:1: (lv_elseIf_8_0= ruleIfExpression )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4856:3: lv_elseIf_8_0= ruleIfExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseIfIfExpressionParserRuleCall_6_1_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleIfExpression_in_ruleIfExpression10248);
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
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4873:6: (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' )
                            {
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4873:6: (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' )
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4873:8: otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}'
                            {
                            otherlv_9=(Token)match(input,74,FOLLOW_74_in_ruleIfExpression10268); 

                                	newLeafNode(otherlv_9, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_6_1_1_0());
                                
                            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4877:1: ( (lv_elses_10_0= ruleStatement ) )*
                            loop105:
                            do {
                                int alt105=2;
                                int LA105_0 = input.LA(1);

                                if ( (LA105_0==RULE_ID||LA105_0==126||(LA105_0>=130 && LA105_0<=132)||LA105_0==134||LA105_0==136||(LA105_0>=141 && LA105_0<=142)) ) {
                                    alt105=1;
                                }


                                switch (alt105) {
                            	case 1 :
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4878:1: (lv_elses_10_0= ruleStatement )
                            	    {
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4878:1: (lv_elses_10_0= ruleStatement )
                            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4879:3: lv_elses_10_0= ruleStatement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElsesStatementParserRuleCall_6_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfExpression10289);
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
                            	    break loop105;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,78,FOLLOW_78_in_ruleIfExpression10302); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4907:1: entryRuleForExpression returns [EObject current=null] : iv_ruleForExpression= ruleForExpression EOF ;
    public final EObject entryRuleForExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForExpression = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4908:2: (iv_ruleForExpression= ruleForExpression EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4909:2: iv_ruleForExpression= ruleForExpression EOF
            {
             newCompositeNode(grammarAccess.getForExpressionRule()); 
            pushFollow(FOLLOW_ruleForExpression_in_entryRuleForExpression10342);
            iv_ruleForExpression=ruleForExpression();

            state._fsp--;

             current =iv_ruleForExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForExpression10352); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4916:1: ruleForExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4919:28: ( (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4920:1: (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4920:1: (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4920:3: otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_121_in_ruleForExpression10389); 

                	newLeafNode(otherlv_0, grammarAccess.getForExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4924:1: ( (lv_object_1_0= ruleVarExpression ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4925:1: (lv_object_1_0= ruleVarExpression )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4925:1: (lv_object_1_0= ruleVarExpression )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4926:3: lv_object_1_0= ruleVarExpression
            {
             
            	        newCompositeNode(grammarAccess.getForExpressionAccess().getObjectVarExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarExpression_in_ruleForExpression10410);
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

            otherlv_2=(Token)match(input,127,FOLLOW_127_in_ruleForExpression10422); 

                	newLeafNode(otherlv_2, grammarAccess.getForExpressionAccess().getInKeyword_2());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4946:1: ( (lv_set_3_0= ruleVarExpression ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4947:1: (lv_set_3_0= ruleVarExpression )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4947:1: (lv_set_3_0= ruleVarExpression )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4948:3: lv_set_3_0= ruleVarExpression
            {
             
            	        newCompositeNode(grammarAccess.getForExpressionAccess().getSetVarExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVarExpression_in_ruleForExpression10443);
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

            otherlv_4=(Token)match(input,122,FOLLOW_122_in_ruleForExpression10455); 

                	newLeafNode(otherlv_4, grammarAccess.getForExpressionAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleForExpression10467); 

                	newLeafNode(otherlv_5, grammarAccess.getForExpressionAccess().getLeftCurlyBracketKeyword_5());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4972:1: ( (lv_statements_6_0= ruleStatement ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==RULE_ID||LA108_0==126||(LA108_0>=130 && LA108_0<=132)||LA108_0==134||LA108_0==136||(LA108_0>=141 && LA108_0<=142)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4973:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4973:1: (lv_statements_6_0= ruleStatement )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:4974:3: lv_statements_6_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForExpressionAccess().getStatementsStatementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleForExpression10488);
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
            	    break loop108;
                }
            } while (true);

            otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleForExpression10501); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5002:1: entryRuleWhileExpression returns [EObject current=null] : iv_ruleWhileExpression= ruleWhileExpression EOF ;
    public final EObject entryRuleWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileExpression = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5003:2: (iv_ruleWhileExpression= ruleWhileExpression EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5004:2: iv_ruleWhileExpression= ruleWhileExpression EOF
            {
             newCompositeNode(grammarAccess.getWhileExpressionRule()); 
            pushFollow(FOLLOW_ruleWhileExpression_in_entryRuleWhileExpression10537);
            iv_ruleWhileExpression=ruleWhileExpression();

            state._fsp--;

             current =iv_ruleWhileExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileExpression10547); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5011:1: ruleWhileExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5014:28: ( (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5015:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5015:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5015:3: otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_121_in_ruleWhileExpression10584); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5019:1: ( (lv_condition_1_0= ruleCondition ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5020:1: (lv_condition_1_0= ruleCondition )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5020:1: (lv_condition_1_0= ruleCondition )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5021:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getWhileExpressionAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleWhileExpression10605);
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

            otherlv_2=(Token)match(input,122,FOLLOW_122_in_ruleWhileExpression10617); 

                	newLeafNode(otherlv_2, grammarAccess.getWhileExpressionAccess().getRightParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleWhileExpression10629); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileExpressionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5045:1: ( (lv_statements_4_0= ruleStatement ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==RULE_ID||LA109_0==126||(LA109_0>=130 && LA109_0<=132)||LA109_0==134||LA109_0==136||(LA109_0>=141 && LA109_0<=142)) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5046:1: (lv_statements_4_0= ruleStatement )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5046:1: (lv_statements_4_0= ruleStatement )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5047:3: lv_statements_4_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhileExpressionAccess().getStatementsStatementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleWhileExpression10650);
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
            	    break loop109;
                }
            } while (true);

            otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleWhileExpression10663); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5075:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5076:2: (iv_ruleCondition= ruleCondition EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5077:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition10699);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition10709); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5084:1: ruleCondition returns [EObject current=null] : ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5087:28: ( ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5088:1: ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5088:1: ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5088:2: ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )?
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5088:2: ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_ID||(LA110_0>=141 && LA110_0<=142)) ) {
                alt110=1;
            }
            else if ( (LA110_0==121) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5088:3: ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5088:3: ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5088:4: ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5088:4: ( (lv_subjective_0_0= ruleVarExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5089:1: (lv_subjective_0_0= ruleVarExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5089:1: (lv_subjective_0_0= ruleVarExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5090:3: lv_subjective_0_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getSubjectiveVarExpressionParserRuleCall_0_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarExpression_in_ruleCondition10757);
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

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5106:2: ( (lv_operator_1_0= ruleOperator ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5107:1: (lv_operator_1_0= ruleOperator )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5107:1: (lv_operator_1_0= ruleOperator )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5108:3: lv_operator_1_0= ruleOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperator_in_ruleCondition10778);
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

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5124:2: ( (lv_objective_2_0= ruleExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5125:1: (lv_objective_2_0= ruleExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5125:1: (lv_objective_2_0= ruleExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5126:3: lv_objective_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCondition10799);
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5143:6: (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5143:6: (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5143:8: otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,121,FOLLOW_121_in_ruleCondition10819); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_1_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5147:1: ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5147:2: ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5147:2: ( (lv_subjective_4_0= ruleVarExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5148:1: (lv_subjective_4_0= ruleVarExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5148:1: (lv_subjective_4_0= ruleVarExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5149:3: lv_subjective_4_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getSubjectiveVarExpressionParserRuleCall_0_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarExpression_in_ruleCondition10841);
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

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5165:2: ( (lv_operator_5_0= ruleOperator ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5166:1: (lv_operator_5_0= ruleOperator )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5166:1: (lv_operator_5_0= ruleOperator )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5167:3: lv_operator_5_0= ruleOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperator_in_ruleCondition10862);
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

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5183:2: ( (lv_objective_6_0= ruleExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5184:1: (lv_objective_6_0= ruleExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5184:1: (lv_objective_6_0= ruleExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5185:3: lv_objective_6_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCondition10883);
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

                    otherlv_7=(Token)match(input,122,FOLLOW_122_in_ruleCondition10896); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_1_2());
                        

                    }


                    }
                    break;

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5205:3: ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )?
            int alt111=3;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==128) ) {
                alt111=1;
            }
            else if ( (LA111_0==129) ) {
                alt111=2;
            }
            switch (alt111) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5205:4: ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5205:4: ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5205:5: ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5205:5: ( (lv_hasAnd_8_0= 'and' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5206:1: (lv_hasAnd_8_0= 'and' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5206:1: (lv_hasAnd_8_0= 'and' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5207:3: lv_hasAnd_8_0= 'and'
                    {
                    lv_hasAnd_8_0=(Token)match(input,128,FOLLOW_128_in_ruleCondition10918); 

                            newLeafNode(lv_hasAnd_8_0, grammarAccess.getConditionAccess().getHasAndAndKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionRule());
                    	        }
                           		setWithLastConsumed(current, "hasAnd", true, "and");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,121,FOLLOW_121_in_ruleCondition10943); 

                        	newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_0_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5224:1: ( (lv_andCondition_10_0= ruleCondition ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5225:1: (lv_andCondition_10_0= ruleCondition )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5225:1: (lv_andCondition_10_0= ruleCondition )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5226:3: lv_andCondition_10_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getAndConditionConditionParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleCondition10964);
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

                    otherlv_11=(Token)match(input,122,FOLLOW_122_in_ruleCondition10976); 

                        	newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getRightParenthesisKeyword_1_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5247:6: ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5247:6: ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5247:7: ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5247:7: ( (lv_hasOr_12_0= 'or' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5248:1: (lv_hasOr_12_0= 'or' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5248:1: (lv_hasOr_12_0= 'or' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5249:3: lv_hasOr_12_0= 'or'
                    {
                    lv_hasOr_12_0=(Token)match(input,129,FOLLOW_129_in_ruleCondition11002); 

                            newLeafNode(lv_hasOr_12_0, grammarAccess.getConditionAccess().getHasOrOrKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionRule());
                    	        }
                           		setWithLastConsumed(current, "hasOr", true, "or");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,121,FOLLOW_121_in_ruleCondition11027); 

                        	newLeafNode(otherlv_13, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_1_1());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5266:1: ( (lv_orCondition_14_0= ruleCondition ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5267:1: (lv_orCondition_14_0= ruleCondition )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5267:1: (lv_orCondition_14_0= ruleCondition )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5268:3: lv_orCondition_14_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getOrConditionConditionParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleCondition11048);
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

                    otherlv_15=(Token)match(input,122,FOLLOW_122_in_ruleCondition11060); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5296:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5297:2: (iv_ruleStatement= ruleStatement EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5298:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement11099);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement11109); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5305:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5308:28: ( ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5309:1: ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5309:1: ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) )
            int alt112=7;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt112=1;
                }
                break;
            case 131:
                {
                alt112=2;
                }
                break;
            case 132:
                {
                alt112=3;
                }
                break;
            case 126:
                {
                alt112=4;
                }
                break;
            case 134:
                {
                alt112=5;
                }
                break;
            case 136:
                {
                alt112=6;
                }
                break;
            case RULE_ID:
            case 141:
            case 142:
                {
                alt112=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5309:2: ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5309:2: ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5309:3: ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5309:3: ( (lv_isAction_0_0= 'Do' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5310:1: (lv_isAction_0_0= 'Do' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5310:1: (lv_isAction_0_0= 'Do' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5311:3: lv_isAction_0_0= 'Do'
                    {
                    lv_isAction_0_0=(Token)match(input,130,FOLLOW_130_in_ruleStatement11153); 

                            newLeafNode(lv_isAction_0_0, grammarAccess.getStatementAccess().getIsActionDoKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isAction", true, "Do");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5324:2: ( (lv_actionStatement_1_0= ruleActionStatement ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5325:1: (lv_actionStatement_1_0= ruleActionStatement )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5325:1: (lv_actionStatement_1_0= ruleActionStatement )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5326:3: lv_actionStatement_1_0= ruleActionStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getActionStatementActionStatementParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionStatement_in_ruleStatement11187);
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5343:6: ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5343:6: ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5343:7: ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5343:7: ( (lv_isChangeState_2_0= '->' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5344:1: (lv_isChangeState_2_0= '->' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5344:1: (lv_isChangeState_2_0= '->' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5345:3: lv_isChangeState_2_0= '->'
                    {
                    lv_isChangeState_2_0=(Token)match(input,131,FOLLOW_131_in_ruleStatement11213); 

                            newLeafNode(lv_isChangeState_2_0, grammarAccess.getStatementAccess().getIsChangeStateHyphenMinusGreaterThanSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isChangeState", true, "->");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5358:2: ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5359:1: (lv_changeStateStatement_3_0= ruleChangeStateStatement )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5359:1: (lv_changeStateStatement_3_0= ruleChangeStateStatement )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5360:3: lv_changeStateStatement_3_0= ruleChangeStateStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getChangeStateStatementChangeStateStatementParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChangeStateStatement_in_ruleStatement11247);
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5377:6: ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5377:6: ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5377:7: ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5377:7: ( (lv_isDeclaration_4_0= 'var' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5378:1: (lv_isDeclaration_4_0= 'var' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5378:1: (lv_isDeclaration_4_0= 'var' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5379:3: lv_isDeclaration_4_0= 'var'
                    {
                    lv_isDeclaration_4_0=(Token)match(input,132,FOLLOW_132_in_ruleStatement11273); 

                            newLeafNode(lv_isDeclaration_4_0, grammarAccess.getStatementAccess().getIsDeclarationVarKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isDeclaration", true, "var");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5392:2: ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5393:1: (lv_declarationStatement_5_0= ruleDeclarationStatement )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5393:1: (lv_declarationStatement_5_0= ruleDeclarationStatement )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5394:3: lv_declarationStatement_5_0= ruleDeclarationStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getDeclarationStatementDeclarationStatementParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeclarationStatement_in_ruleStatement11307);
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5411:6: ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5411:6: ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5411:7: ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5411:7: ( (lv_isIfExpression_6_0= 'if' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5412:1: (lv_isIfExpression_6_0= 'if' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5412:1: (lv_isIfExpression_6_0= 'if' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5413:3: lv_isIfExpression_6_0= 'if'
                    {
                    lv_isIfExpression_6_0=(Token)match(input,126,FOLLOW_126_in_ruleStatement11333); 

                            newLeafNode(lv_isIfExpression_6_0, grammarAccess.getStatementAccess().getIsIfExpressionIfKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isIfExpression", true, "if");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5426:2: ( (lv_ifExpression_7_0= ruleIfExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5427:1: (lv_ifExpression_7_0= ruleIfExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5427:1: (lv_ifExpression_7_0= ruleIfExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5428:3: lv_ifExpression_7_0= ruleIfExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getIfExpressionIfExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIfExpression_in_ruleStatement11367);
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

                    otherlv_8=(Token)match(input,133,FOLLOW_133_in_ruleStatement11379); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getEndIfKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5449:6: ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5449:6: ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5449:7: ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5449:7: ( (lv_isForExpression_9_0= 'for' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5450:1: (lv_isForExpression_9_0= 'for' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5450:1: (lv_isForExpression_9_0= 'for' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5451:3: lv_isForExpression_9_0= 'for'
                    {
                    lv_isForExpression_9_0=(Token)match(input,134,FOLLOW_134_in_ruleStatement11405); 

                            newLeafNode(lv_isForExpression_9_0, grammarAccess.getStatementAccess().getIsForExpressionForKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isForExpression", true, "for");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5464:2: ( (lv_forExpression_10_0= ruleForExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5465:1: (lv_forExpression_10_0= ruleForExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5465:1: (lv_forExpression_10_0= ruleForExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5466:3: lv_forExpression_10_0= ruleForExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getForExpressionForExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForExpression_in_ruleStatement11439);
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

                    otherlv_11=(Token)match(input,135,FOLLOW_135_in_ruleStatement11451); 

                        	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getEndForKeyword_4_2());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5487:6: ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5487:6: ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5487:7: ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while'
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5487:7: ( (lv_isWhileExpression_12_0= 'while' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5488:1: (lv_isWhileExpression_12_0= 'while' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5488:1: (lv_isWhileExpression_12_0= 'while' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5489:3: lv_isWhileExpression_12_0= 'while'
                    {
                    lv_isWhileExpression_12_0=(Token)match(input,136,FOLLOW_136_in_ruleStatement11477); 

                            newLeafNode(lv_isWhileExpression_12_0, grammarAccess.getStatementAccess().getIsWhileExpressionWhileKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isWhileExpression", true, "while");
                    	    

                    }


                    }

                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5502:2: ( (lv_whileExpression_13_0= ruleWhileExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5503:1: (lv_whileExpression_13_0= ruleWhileExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5503:1: (lv_whileExpression_13_0= ruleWhileExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5504:3: lv_whileExpression_13_0= ruleWhileExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getWhileExpressionWhileExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhileExpression_in_ruleStatement11511);
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

                    otherlv_14=(Token)match(input,137,FOLLOW_137_in_ruleStatement11523); 

                        	newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getEndWhileKeyword_5_2());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5525:6: ( (lv_assertStatement_15_0= ruleAssertStatement ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5525:6: ( (lv_assertStatement_15_0= ruleAssertStatement ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5526:1: (lv_assertStatement_15_0= ruleAssertStatement )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5526:1: (lv_assertStatement_15_0= ruleAssertStatement )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5527:3: lv_assertStatement_15_0= ruleAssertStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getAssertStatementAssertStatementParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssertStatement_in_ruleStatement11551);
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5551:1: entryRuleDeclarationStatement returns [EObject current=null] : iv_ruleDeclarationStatement= ruleDeclarationStatement EOF ;
    public final EObject entryRuleDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationStatement = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5552:2: (iv_ruleDeclarationStatement= ruleDeclarationStatement EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5553:2: iv_ruleDeclarationStatement= ruleDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getDeclarationStatementRule()); 
            pushFollow(FOLLOW_ruleDeclarationStatement_in_entryRuleDeclarationStatement11587);
            iv_ruleDeclarationStatement=ruleDeclarationStatement();

            state._fsp--;

             current =iv_ruleDeclarationStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationStatement11597); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5560:1: ruleDeclarationStatement returns [EObject current=null] : (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5563:28: ( (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5564:1: (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5564:1: (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5565:5: this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getDeclarationStatementAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleVariable_in_ruleDeclarationStatement11644);
            this_Variable_0=ruleVariable();

            state._fsp--;

             
                    current = this_Variable_0; 
                    afterParserOrEnumRuleCall();
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5573:1: ()
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5574:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getDeclarationStatementAccess().getDeclarationStatementVariableAction_1(),
                        current);
                

            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5579:2: (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==83) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5579:4: otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,83,FOLLOW_83_in_ruleDeclarationStatement11665); 

                        	newLeafNode(otherlv_2, grammarAccess.getDeclarationStatementAccess().getEqualsSignKeyword_2_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5583:1: ( (lv_value_3_0= ruleExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5584:1: (lv_value_3_0= ruleExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5584:1: (lv_value_3_0= ruleExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5585:3: lv_value_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationStatementAccess().getValueExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleDeclarationStatement11686);
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5609:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5610:2: (iv_ruleActionStatement= ruleActionStatement EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5611:2: iv_ruleActionStatement= ruleActionStatement EOF
            {
             newCompositeNode(grammarAccess.getActionStatementRule()); 
            pushFollow(FOLLOW_ruleActionStatement_in_entryRuleActionStatement11724);
            iv_ruleActionStatement=ruleActionStatement();

            state._fsp--;

             current =iv_ruleActionStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStatement11734); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5618:1: ruleActionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')' ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputs_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5621:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5622:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5622:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5622:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5622:2: ( (otherlv_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5623:1: (otherlv_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5623:1: (otherlv_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5624:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionStatement11779); 

            		newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getActionActionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,121,FOLLOW_121_in_ruleActionStatement11791); 

                	newLeafNode(otherlv_1, grammarAccess.getActionStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5639:1: ( (lv_inputs_2_0= ruleVarExpression ) )+
            int cnt114=0;
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==RULE_ID||(LA114_0>=141 && LA114_0<=142)) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5640:1: (lv_inputs_2_0= ruleVarExpression )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5640:1: (lv_inputs_2_0= ruleVarExpression )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5641:3: lv_inputs_2_0= ruleVarExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionStatementAccess().getInputsVarExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVarExpression_in_ruleActionStatement11812);
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

            	default :
            	    if ( cnt114 >= 1 ) break loop114;
                        EarlyExitException eee =
                            new EarlyExitException(114, input);
                        throw eee;
                }
                cnt114++;
            } while (true);

            otherlv_3=(Token)match(input,122,FOLLOW_122_in_ruleActionStatement11825); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5669:1: entryRuleAssertStatement returns [EObject current=null] : iv_ruleAssertStatement= ruleAssertStatement EOF ;
    public final EObject entryRuleAssertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertStatement = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5670:2: (iv_ruleAssertStatement= ruleAssertStatement EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5671:2: iv_ruleAssertStatement= ruleAssertStatement EOF
            {
             newCompositeNode(grammarAccess.getAssertStatementRule()); 
            pushFollow(FOLLOW_ruleAssertStatement_in_entryRuleAssertStatement11861);
            iv_ruleAssertStatement=ruleAssertStatement();

            state._fsp--;

             current =iv_ruleAssertStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertStatement11871); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5678:1: ruleAssertStatement returns [EObject current=null] : ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_input_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5681:28: ( ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5682:1: ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5682:1: ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5682:2: ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5682:2: ( (lv_input_0_0= ruleVarExpression ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5683:1: (lv_input_0_0= ruleVarExpression )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5683:1: (lv_input_0_0= ruleVarExpression )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5684:3: lv_input_0_0= ruleVarExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssertStatementAccess().getInputVarExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVarExpression_in_ruleAssertStatement11917);
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

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleAssertStatement11929); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertStatementAccess().getEqualsSignKeyword_1());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5704:1: ( (lv_value_2_0= ruleExpression ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5705:1: (lv_value_2_0= ruleExpression )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5705:1: (lv_value_2_0= ruleExpression )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5706:3: lv_value_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssertStatementAccess().getValueExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssertStatement11950);
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5730:1: entryRuleChangeStateStatement returns [EObject current=null] : iv_ruleChangeStateStatement= ruleChangeStateStatement EOF ;
    public final EObject entryRuleChangeStateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeStateStatement = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5731:2: (iv_ruleChangeStateStatement= ruleChangeStateStatement EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5732:2: iv_ruleChangeStateStatement= ruleChangeStateStatement EOF
            {
             newCompositeNode(grammarAccess.getChangeStateStatementRule()); 
            pushFollow(FOLLOW_ruleChangeStateStatement_in_entryRuleChangeStateStatement11986);
            iv_ruleChangeStateStatement=ruleChangeStateStatement();

            state._fsp--;

             current =iv_ruleChangeStateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeStateStatement11996); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5739:1: ruleChangeStateStatement returns [EObject current=null] : (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleChangeStateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5742:28: ( (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5743:1: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5743:1: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5743:3: otherlv_0= 'state' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,124,FOLLOW_124_in_ruleChangeStateStatement12033); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeStateStatementAccess().getStateKeyword_0());
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5747:1: ( (otherlv_1= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5748:1: (otherlv_1= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5748:1: (otherlv_1= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5749:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChangeStateStatementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChangeStateStatement12053); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5768:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5769:2: (iv_ruleExpression= ruleExpression EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5770:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression12089);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression12099); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5777:1: ruleExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5780:28: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5781:1: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5781:1: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5782:5: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleExpression12146);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5790:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( ((LA116_0>=138 && LA116_0<=139)) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5790:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5790:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==138) ) {
            	        alt115=1;
            	    }
            	    else if ( (LA115_0==139) ) {
            	        alt115=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 115, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5790:3: ( () otherlv_2= '+' )
            	            {
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5790:3: ( () otherlv_2= '+' )
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5790:4: () otherlv_2= '+'
            	            {
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5790:4: ()
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5791:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,138,FOLLOW_138_in_ruleExpression12169); 

            	                	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5801:6: ( () otherlv_4= '-' )
            	            {
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5801:6: ( () otherlv_4= '-' )
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5801:7: () otherlv_4= '-'
            	            {
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5801:7: ()
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5802:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,139,FOLLOW_139_in_ruleExpression12198); 

            	                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5811:3: ( (lv_right_5_0= ruleTerm ) )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5812:1: (lv_right_5_0= ruleTerm )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5812:1: (lv_right_5_0= ruleTerm )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5813:3: lv_right_5_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleExpression12221);
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
            	    break loop116;
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5837:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5838:2: (iv_ruleTerm= ruleTerm EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5839:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm12259);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm12269); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5846:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5849:28: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5850:1: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5850:1: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5851:5: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFactor_in_ruleTerm12316);
            this_Factor_0=ruleFactor();

            state._fsp--;

             
                    current = this_Factor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5859:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==108||LA118_0==140) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5859:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5859:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==108) ) {
            	        alt117=1;
            	    }
            	    else if ( (LA117_0==140) ) {
            	        alt117=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 117, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5859:3: ( () otherlv_2= '*' )
            	            {
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5859:3: ( () otherlv_2= '*' )
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5859:4: () otherlv_2= '*'
            	            {
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5859:4: ()
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5860:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,108,FOLLOW_108_in_ruleTerm12339); 

            	                	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5870:6: ( () otherlv_4= '/' )
            	            {
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5870:6: ( () otherlv_4= '/' )
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5870:7: () otherlv_4= '/'
            	            {
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5870:7: ()
            	            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5871:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,140,FOLLOW_140_in_ruleTerm12368); 

            	                	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5880:3: ( (lv_right_5_0= ruleFactor ) )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5881:1: (lv_right_5_0= ruleFactor )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5881:1: (lv_right_5_0= ruleFactor )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5882:3: lv_right_5_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleTerm12391);
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
            	    break loop118;
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5906:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5907:2: (iv_ruleFactor= ruleFactor EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5908:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor12429);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor12439); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5915:1: ruleFactor returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5918:28: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5919:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5919:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            int alt119=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt119=1;
                }
                break;
            case RULE_ID:
            case 141:
            case 142:
                {
                alt119=2;
                }
                break;
            case RULE_STRING:
                {
                alt119=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt119=4;
                }
                break;
            case 121:
                {
                alt119=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5919:2: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5919:2: ( (lv_number_0_0= ruleNumber ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5920:1: (lv_number_0_0= ruleNumber )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5920:1: (lv_number_0_0= ruleNumber )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5921:3: lv_number_0_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleFactor12485);
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5938:6: ( (lv_variable_1_0= ruleVarExpression ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5938:6: ( (lv_variable_1_0= ruleVarExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5939:1: (lv_variable_1_0= ruleVarExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5939:1: (lv_variable_1_0= ruleVarExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5940:3: lv_variable_1_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getVariableVarExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarExpression_in_ruleFactor12512);
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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5957:6: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5957:6: ( (lv_string_2_0= RULE_STRING ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5958:1: (lv_string_2_0= RULE_STRING )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5958:1: (lv_string_2_0= RULE_STRING )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5959:3: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFactor12535); 

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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5976:6: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5976:6: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5977:1: (lv_boolean_3_0= RULE_BOOLEAN )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5977:1: (lv_boolean_3_0= RULE_BOOLEAN )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5978:3: lv_boolean_3_0= RULE_BOOLEAN
                    {
                    lv_boolean_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleFactor12563); 

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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5995:6: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5995:6: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5995:8: otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_121_in_ruleFactor12587); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_4_0());
                        
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:5999:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6000:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6000:1: (lv_expression_5_0= ruleExpression )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6001:3: lv_expression_5_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFactor12608);
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

                    otherlv_6=(Token)match(input,122,FOLLOW_122_in_ruleFactor12620); 

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6029:1: entryRuleVarExpression returns [EObject current=null] : iv_ruleVarExpression= ruleVarExpression EOF ;
    public final EObject entryRuleVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpression = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6030:2: (iv_ruleVarExpression= ruleVarExpression EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6031:2: iv_ruleVarExpression= ruleVarExpression EOF
            {
             newCompositeNode(grammarAccess.getVarExpressionRule()); 
            pushFollow(FOLLOW_ruleVarExpression_in_entryRuleVarExpression12657);
            iv_ruleVarExpression=ruleVarExpression();

            state._fsp--;

             current =iv_ruleVarExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarExpression12667); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6038:1: ruleVarExpression returns [EObject current=null] : ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* ) ;
    public final EObject ruleVarExpression() throws RecognitionException {
        EObject current = null;

        Token lv_self_0_0=null;
        Token lv_context_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_variable_2_0 = null;

        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6041:28: ( ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6042:1: ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6042:1: ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6042:2: ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )*
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6042:2: ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) )
            int alt120=3;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt120=1;
                }
                break;
            case 142:
                {
                alt120=2;
                }
                break;
            case RULE_ID:
                {
                alt120=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6042:3: ( (lv_self_0_0= 'self' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6042:3: ( (lv_self_0_0= 'self' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6043:1: (lv_self_0_0= 'self' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6043:1: (lv_self_0_0= 'self' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6044:3: lv_self_0_0= 'self'
                    {
                    lv_self_0_0=(Token)match(input,141,FOLLOW_141_in_ruleVarExpression12711); 

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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6058:6: ( (lv_context_1_0= 'context' ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6058:6: ( (lv_context_1_0= 'context' ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6059:1: (lv_context_1_0= 'context' )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6059:1: (lv_context_1_0= 'context' )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6060:3: lv_context_1_0= 'context'
                    {
                    lv_context_1_0=(Token)match(input,142,FOLLOW_142_in_ruleVarExpression12748); 

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
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6074:6: ( (lv_variable_2_0= ruleQualifiedName ) )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6074:6: ( (lv_variable_2_0= ruleQualifiedName ) )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6075:1: (lv_variable_2_0= ruleQualifiedName )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6075:1: (lv_variable_2_0= ruleQualifiedName )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6076:3: lv_variable_2_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarExpressionAccess().getVariableQualifiedNameParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleVarExpression12788);
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6092:3: (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==50) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6092:5: otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) )
            	    {
            	    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleVarExpression12802); 

            	        	newLeafNode(otherlv_3, grammarAccess.getVarExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6096:1: ( (lv_methods_4_0= ruleMethod ) )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6097:1: (lv_methods_4_0= ruleMethod )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6097:1: (lv_methods_4_0= ruleMethod )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6098:3: lv_methods_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVarExpressionAccess().getMethodsMethodParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleVarExpression12823);
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
            	    break loop121;
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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6122:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6123:2: (iv_ruleMethod= ruleMethod EOF )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6124:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod12861);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod12871); 

            }

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
    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6131:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' ) ;
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
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6134:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6135:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6135:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6135:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')'
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6135:2: ( (lv_name_0_0= RULE_ID ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6136:1: (lv_name_0_0= RULE_ID )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6136:1: (lv_name_0_0= RULE_ID )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6137:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod12913); 

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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6153:2: ( (lv_functionMethod_1_0= '(' ) )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6154:1: (lv_functionMethod_1_0= '(' )
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6154:1: (lv_functionMethod_1_0= '(' )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6155:3: lv_functionMethod_1_0= '('
            {
            lv_functionMethod_1_0=(Token)match(input,121,FOLLOW_121_in_ruleMethod12936); 

                    newLeafNode(lv_functionMethod_1_0, grammarAccess.getMethodAccess().getFunctionMethodLeftParenthesisKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(current, "functionMethod", true, "(");
            	    

            }


            }

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6168:2: ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* )
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6168:3: ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )*
            {
            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6168:3: ( (lv_inputs_2_0= ruleParameter ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=RULE_ID && LA122_0<=RULE_BOOLEAN)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6169:1: (lv_inputs_2_0= ruleParameter )
                    {
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6169:1: (lv_inputs_2_0= ruleParameter )
                    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6170:3: lv_inputs_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getInputsParameterParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod12971);
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

            // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6186:3: (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==68) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6186:5: otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) )
            	    {
            	    otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleMethod12985); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_2_1_0());
            	        
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6190:1: ( (lv_inputs_4_0= ruleParameter ) )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6191:1: (lv_inputs_4_0= ruleParameter )
            	    {
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6191:1: (lv_inputs_4_0= ruleParameter )
            	    // ../datasemModeller/src-gen/datasemModeller/parser/antlr/internal/InternalDmodel.g:6192:3: lv_inputs_4_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getInputsParameterParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod13006);
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
            	    break loop123;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,122,FOLLOW_122_in_ruleMethod13021); 

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
    public static final BitSet FOLLOW_72_in_ruleGovernanceStrategy3061 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleGovernanceStrategy3073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001A00L});
    public static final BitSet FOLLOW_73_in_ruleGovernanceStrategy3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGovernanceStrategy3118 = new BitSet(new long[]{0x0000000000004000L,0x0000000000008000L});
    public static final BitSet FOLLOW_14_in_ruleGovernanceStrategy3131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3148 = new BitSet(new long[]{0x0000000000004000L,0x0000000000008000L});
    public static final BitSet FOLLOW_rulePullStrategy_in_ruleGovernanceStrategy3176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_75_in_ruleGovernanceStrategy3202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGovernanceStrategy3227 = new BitSet(new long[]{0x0000000000004000L,0x0000000000008000L});
    public static final BitSet FOLLOW_14_in_ruleGovernanceStrategy3240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3257 = new BitSet(new long[]{0x0000000000004000L,0x0000000000008000L});
    public static final BitSet FOLLOW_rulePushStrategy_in_ruleGovernanceStrategy3285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_76_in_ruleGovernanceStrategy3311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGovernanceStrategy3336 = new BitSet(new long[]{0x0000000000004000L,0x0000000000008000L});
    public static final BitSet FOLLOW_14_in_ruleGovernanceStrategy3349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3366 = new BitSet(new long[]{0x0000000000004000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleContractNetProtocol_in_ruleGovernanceStrategy3394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleGovernanceStrategy3408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGovernanceStrategy3420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGovernanceStrategy3440 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleGovernanceStrategy3453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleGovernanceStrategy3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContractNetProtocol_in_entryRuleContractNetProtocol3501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContractNetProtocol3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleContractNetProtocol3548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleContractNetProtocol3560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMechanism_in_ruleContractNetProtocol3581 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleContractNetProtocol3594 = new BitSet(new long[]{0x5000000000000000L,0x007FC00000010000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleContractNetProtocol3615 = new BitSet(new long[]{0x5000000000000000L,0x007FC00000010000L});
    public static final BitSet FOLLOW_80_in_ruleContractNetProtocol3628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleContractNetProtocol3640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleRoleBehavior_in_ruleContractNetProtocol3661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000024000L});
    public static final BitSet FOLLOW_78_in_ruleContractNetProtocol3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBehavior_in_entryRuleRoleBehavior3710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoleBehavior3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleRoleBehavior3757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRoleBehavior3774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleRoleBehavior3791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleRoleBehavior3803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleRoleBehavior3815 = new BitSet(new long[]{0x0000000000000000L,0x0100000000004000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleRoleBehavior3836 = new BitSet(new long[]{0x0000000000000000L,0x0100000000004000L});
    public static final BitSet FOLLOW_78_in_ruleRoleBehavior3849 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleRoleBehavior3870 = new BitSet(new long[]{0x0000000000000000L,0x1800000000004000L});
    public static final BitSet FOLLOW_78_in_ruleRoleBehavior3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessModel_in_entryRuleProcessModel3919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessModel3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessModel3971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleProcessModel3988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleProcessModel4000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleProcessModel4012 = new BitSet(new long[]{0x0000000000000000L,0x0100000000004000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleProcessModel4033 = new BitSet(new long[]{0x0000000000000000L,0x0100000000004000L});
    public static final BitSet FOLLOW_78_in_ruleProcessModel4046 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleProcessModel4067 = new BitSet(new long[]{0x0000000000000000L,0x1800000000004000L});
    public static final BitSet FOLLOW_78_in_ruleProcessModel4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePullStrategy_in_entryRulePullStrategy4116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePullStrategy4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePullStrategy4163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_rulePullStrategy4175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMechanism_in_rulePullStrategy4196 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_rulePullStrategy4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePushStrategy_in_entryRulePushStrategy4245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePushStrategy4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePushStrategy4292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_rulePushStrategy4304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMechanism_in_rulePushStrategy4325 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_rulePushStrategy4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanism_in_entryRuleMechanism4374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanism4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechanism4426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleMechanism4443 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMechanism4464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleMechanism4476 = new BitSet(new long[]{0x0000000000004000L,0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleMechanism4489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanism4506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_84_in_ruleMechanism4526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleMechanism4538 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMechanismAttribute_in_ruleMechanism4559 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleMechanism4572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleMechanism4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanismAttribute_in_entryRuleMechanismAttribute4622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanismAttribute4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanismAttribute4674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleMechanismAttribute4691 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMechanismAttribute4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSource_in_entryRuleWorkSource4748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSource4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleWorkSource4795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkSource4829 = new BitSet(new long[]{0x0000000000004000L,0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleWorkSource4842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkSource4859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_86_in_ruleWorkSource4879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkSource4891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource4911 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkSource4924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkSource4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemNetwork_in_entryRuleWorkItemNetwork4974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemNetwork4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleWorkItemNetwork5021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemNetwork5038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItemNetwork5055 = new BitSet(new long[]{0x0000000000004000L,0x0000000000800000L});
    public static final BitSet FOLLOW_14_in_ruleWorkItemNetwork5068 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemNetwork5085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleWorkItemNetwork5104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItemNetwork5116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkItem_in_ruleWorkItemNetwork5137 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkItemNetwork5150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkItemNetwork5162 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemNetwork5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItem_in_entryRuleWorkItem5221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItem5231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_72_in_ruleWorkItem5291 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleWorkItem5303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5337 = new BitSet(new long[]{0x0000000000004000L,0x0000001FFF004000L});
    public static final BitSet FOLLOW_14_in_ruleWorkItem5350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItem5367 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFF004000L});
    public static final BitSet FOLLOW_88_in_ruleWorkItem5393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5485 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFE004000L});
    public static final BitSet FOLLOW_89_in_ruleWorkItem5507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem5585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5599 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleWorkItem5611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5692 = new BitSet(new long[]{0x0000000000000000L,0x0000001FF0004000L});
    public static final BitSet FOLLOW_90_in_ruleWorkItem5714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5795 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleWorkItem5809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem5821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem5855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleRequiredService_in_ruleWorkItem5876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem5890 = new BitSet(new long[]{0x0000000000000000L,0x0000001FF0004000L});
    public static final BitSet FOLLOW_92_in_ruleWorkItem5905 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleWorkItem5926 = new BitSet(new long[]{0x0000000000000000L,0x0000001FE0004000L});
    public static final BitSet FOLLOW_93_in_ruleWorkItem5941 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleWorkItem5962 = new BitSet(new long[]{0x0000000000000000L,0x0000001FC0004000L});
    public static final BitSet FOLLOW_94_in_ruleWorkItem5983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItem6008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleWorkItem6029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleWorkItem6042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleWorkItem6063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem6077 = new BitSet(new long[]{0x0000000000000000L,0x0000001F80004000L});
    public static final BitSet FOLLOW_95_in_ruleWorkItem6092 = new BitSet(new long[]{0x00100000000000C0L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItem6113 = new BitSet(new long[]{0x0000000000000000L,0x0000001F00004000L});
    public static final BitSet FOLLOW_96_in_ruleWorkItem6128 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleWorkItem6149 = new BitSet(new long[]{0x0000000000000000L,0x0000001E00004000L});
    public static final BitSet FOLLOW_97_in_ruleWorkItem6164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6184 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00004000L});
    public static final BitSet FOLLOW_98_in_ruleWorkItem6199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6219 = new BitSet(new long[]{0x0000000000000000L,0x0000001800004000L});
    public static final BitSet FOLLOW_99_in_ruleWorkItem6234 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem6251 = new BitSet(new long[]{0x0000000000000000L,0x0000001000004000L});
    public static final BitSet FOLLOW_100_in_ruleWorkItem6271 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem6288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkItem6307 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredService_in_entryRuleRequiredService6366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredService6376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleRequiredService6413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredService6433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleRequiredService6445 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleRequiredService6466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleRequiredService6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact6514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImpact6569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleImpact6581 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleImpact6602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleImpact6614 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleImpact6635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleImpact6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemType_in_entryRuleWorkItemType6683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemType6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemType6735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemType6758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWorkItemType6775 = new BitSet(new long[]{0x0000000000004000L,0x0000002000004000L});
    public static final BitSet FOLLOW_14_in_ruleWorkItemType6788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemType6805 = new BitSet(new long[]{0x0000000000000000L,0x0000002000004000L});
    public static final BitSet FOLLOW_101_in_ruleWorkItemType6825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleWorkItemType6837 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemType6854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleWorkItemType6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOfService_in_entryRuleClassOfService6911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOfService6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleClassOfService6963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassOfService6986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleClassOfService7003 = new BitSet(new long[]{0x0000000000004000L,0x000000C000004000L});
    public static final BitSet FOLLOW_14_in_ruleClassOfService7016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassOfService7033 = new BitSet(new long[]{0x0000000000000000L,0x000000C000004000L});
    public static final BitSet FOLLOW_102_in_ruleClassOfService7053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleClassOfService7065 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleClassOfService7082 = new BitSet(new long[]{0x0000000000000000L,0x0000008000004000L});
    public static final BitSet FOLLOW_103_in_ruleClassOfService7102 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleClassOfService7114 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleClassOfService7131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleClassOfService7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService7186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService7238 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleService7256 = new BitSet(new long[]{0x0000000000004000L,0x0000002000004000L});
    public static final BitSet FOLLOW_14_in_ruleService7269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService7286 = new BitSet(new long[]{0x0000000000000000L,0x0000002000004000L});
    public static final BitSet FOLLOW_101_in_ruleService7306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleService7318 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleService7335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleService7354 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleService7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider7415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProvider7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_72_in_ruleServiceProvider7485 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleServiceProvider7497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleServiceProvider7531 = new BitSet(new long[]{0x0000000000000000L,0x00000F0000004000L});
    public static final BitSet FOLLOW_104_in_ruleServiceProvider7544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleServiceProvider7556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleServiceProvider7623 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000004000L});
    public static final BitSet FOLLOW_105_in_ruleServiceProvider7638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleServiceProvider7650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleServiceProvider7683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleServiceProvider7717 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000004000L});
    public static final BitSet FOLLOW_106_in_ruleServiceProvider7732 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleServiceProvider7744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7764 = new BitSet(new long[]{0x0000000000000000L,0x0000080000004000L});
    public static final BitSet FOLLOW_107_in_ruleServiceProvider7779 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleServiceProvider7791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleServiceProvider7812 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleServiceProvider7827 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceProvider7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProviderType_in_entryRuleServiceProviderType7886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProviderType7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceProviderType7938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProviderType7961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleServiceProviderType7978 = new BitSet(new long[]{0x0000000000004000L,0x0000002000004000L});
    public static final BitSet FOLLOW_14_in_ruleServiceProviderType7991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceProviderType8008 = new BitSet(new long[]{0x0000000000000000L,0x0000002000004000L});
    public static final BitSet FOLLOW_101_in_ruleServiceProviderType8028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleServiceProviderType8040 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceProviderType8057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleServiceProviderType8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset8112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset8164 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleAsset8181 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleAsset8202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleAsset8214 = new BitSet(new long[]{0x0000000000000000L,0x0000200000004000L});
    public static final BitSet FOLLOW_109_in_ruleAsset8227 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleAsset8239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleSkill_in_ruleAsset8260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_68_in_ruleAsset8273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleSkill_in_ruleAsset8294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_ruleAsset8310 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAsset8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_entryRuleSkill8369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkill8379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSkill8416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkill8436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleSkill8448 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_ruleAbstractParameter_in_ruleSkill8469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSkill8481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType8518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType8529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleType8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType8655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDataType8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDataType8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleDataType8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDataType8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass8802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleClass8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleClass8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleClass8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleClass8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleClass8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_entryRuleAbstractType8967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractType8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractType9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleAbstractType9048 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleAbstractType9073 = new BitSet(new long[]{0x5000000000000000L,0x001FC00000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractType9094 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleAbstractType9106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleAbstractType9132 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleAbstractType9157 = new BitSet(new long[]{0x5000000000000000L,0x001FC00000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractType9178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleAbstractType9190 = new BitSet(new long[]{0x5000000000000000L,0x001FC00000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractType9211 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleAbstractType9223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute9266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_ruleAttribute9322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute9339 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleAttribute9357 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAttribute9378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue9416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeValue9471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleAttributeValue9483 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAttributeValue9504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable9540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_ruleVariable9596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable9613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction9654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleAction9701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction9718 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleAction9735 = new BitSet(new long[]{0x5000000000000000L,0x047FC00000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAction9756 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000010L});
    public static final BitSet FOLLOW_68_in_ruleAction9770 = new BitSet(new long[]{0x5000000000000000L,0x007FC00000000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAction9791 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000010L});
    public static final BitSet FOLLOW_122_in_ruleAction9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState9841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState9851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleState9895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState9925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleState9950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState9967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleState9984 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleState10005 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_78_in_ruleState10018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_entryRuleIfExpression10055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpression10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleIfExpression10102 = new BitSet(new long[]{0x0000000000000010L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleCondition_in_ruleIfExpression10123 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleIfExpression10135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleIfExpression10147 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfExpression10168 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_78_in_ruleIfExpression10181 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleIfExpression10194 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000400L});
    public static final BitSet FOLLOW_126_in_ruleIfExpression10214 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_ruleIfExpression_in_ruleIfExpression10248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleIfExpression10268 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfExpression10289 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_78_in_ruleIfExpression10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForExpression_in_entryRuleForExpression10342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForExpression10352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleForExpression10389 = new BitSet(new long[]{0x0000000000000010L,0x4000000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleForExpression10410 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleForExpression10422 = new BitSet(new long[]{0x0000000000000010L,0x4000000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleForExpression10443 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleForExpression10455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleForExpression10467 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForExpression10488 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_78_in_ruleForExpression10501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileExpression_in_entryRuleWhileExpression10537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileExpression10547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleWhileExpression10584 = new BitSet(new long[]{0x0000000000000010L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleCondition_in_ruleWhileExpression10605 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleWhileExpression10617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleWhileExpression10629 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhileExpression10650 = new BitSet(new long[]{0x0000000000000010L,0x4000000000004000L,0x000000000000615CL});
    public static final BitSet FOLLOW_78_in_ruleWhileExpression10663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition10699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition10709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleCondition10757 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleCondition10778 = new BitSet(new long[]{0x00000000000001F0L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition10799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_121_in_ruleCondition10819 = new BitSet(new long[]{0x0000000000000010L,0x4000000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleCondition10841 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleCondition10862 = new BitSet(new long[]{0x00000000000001F0L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition10883 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleCondition10896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_128_in_ruleCondition10918 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleCondition10943 = new BitSet(new long[]{0x0000000000000010L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleCondition_in_ruleCondition10964 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleCondition10976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleCondition11002 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleCondition11027 = new BitSet(new long[]{0x0000000000000010L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleCondition_in_ruleCondition11048 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleCondition11060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement11099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement11109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleStatement11153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActionStatement_in_ruleStatement11187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleStatement11213 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ruleChangeStateStatement_in_ruleStatement11247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleStatement11273 = new BitSet(new long[]{0x5000000000000000L,0x007FC00000000000L});
    public static final BitSet FOLLOW_ruleDeclarationStatement_in_ruleStatement11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleStatement11333 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_ruleIfExpression_in_ruleStatement11367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_ruleStatement11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleStatement11405 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_ruleForExpression_in_ruleStatement11439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_ruleStatement11451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleStatement11477 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_ruleWhileExpression_in_ruleStatement11511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleStatement11523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertStatement_in_ruleStatement11551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationStatement_in_entryRuleDeclarationStatement11587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationStatement11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleDeclarationStatement11644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleDeclarationStatement11665 = new BitSet(new long[]{0x00000000000001F0L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDeclarationStatement11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStatement_in_entryRuleActionStatement11724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStatement11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStatement11779 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleActionStatement11791 = new BitSet(new long[]{0x0000000000000010L,0x4000000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleActionStatement11812 = new BitSet(new long[]{0x0000000000000010L,0x4400000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_122_in_ruleActionStatement11825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertStatement_in_entryRuleAssertStatement11861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertStatement11871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleAssertStatement11917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleAssertStatement11929 = new BitSet(new long[]{0x00000000000001F0L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssertStatement11950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeStateStatement_in_entryRuleChangeStateStatement11986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeStateStatement11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleChangeStateStatement12033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChangeStateStatement12053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression12089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression12099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleExpression12146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_ruleExpression12169 = new BitSet(new long[]{0x00000000000001F0L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_139_in_ruleExpression12198 = new BitSet(new long[]{0x00000000000001F0L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleTerm_in_ruleExpression12221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm12259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm12269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleTerm12316 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_108_in_ruleTerm12339 = new BitSet(new long[]{0x00000000000001F0L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_140_in_ruleTerm12368 = new BitSet(new long[]{0x00000000000001F0L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleFactor_in_ruleTerm12391 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor12429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor12439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleFactor12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExpression_in_ruleFactor12512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFactor12535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleFactor12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleFactor12587 = new BitSet(new long[]{0x00000000000001F0L,0x4200000000000000L,0x000000000000615CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFactor12608 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleFactor12620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarExpression_in_entryRuleVarExpression12657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarExpression12667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleVarExpression12711 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_142_in_ruleVarExpression12748 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVarExpression12788 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVarExpression12802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleVarExpression12823 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod12861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod12871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod12913 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleMethod12936 = new BitSet(new long[]{0x00000000000001F0L,0x0400000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod12971 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000010L});
    public static final BitSet FOLLOW_68_in_ruleMethod12985 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod13006 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000010L});
    public static final BitSet FOLLOW_122_in_ruleMethod13021 = new BitSet(new long[]{0x0000000000000002L});

}