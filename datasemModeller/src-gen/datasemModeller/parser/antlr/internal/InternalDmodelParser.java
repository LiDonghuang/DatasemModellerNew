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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelBuilder'", "'desc'", "'UserLibraries'", "'ServiceProviderTypes'", "'end ServiceProviderTypes'", "'WorkItemTypes'", "'end WorkItemTypes'", "'ClassOfServices'", "'end ClassOfServices'", "'Services'", "'end Services'", "'ProcessModels'", "'end ProcessModels'", "'GovernanceStrategies'", "'end GovernanceStrategies'", "'end UserLibraries'", "'ExperimentModel'", "'Path'", "'Variables'", "'end Variables'", "'OrganizationalModel'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkSources'", "'end WorkSources'", "'WorkItemNetworks'", "'end WorkItemNetworks'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'WINReplications'", "'end WINReplications'", "'Indicators'", "'end Indicators'", "'end ExperimentSettings'", "'end ExperimentModel'", "'.'", "'var:'", "'Random.'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "':'", "'boolean'", "'num'", "'string'", "'GovernanceStrategy'", "'Normal'", "'Uniform'", "'Exponential'", "'['", "','", "']'", "'WorkItemNetwork'", "'NumReplications'", "'type'", "'Pull'", "'{'", "'Push'", "'CNP'", "'}'", "'mechanisms'", "'roleBehaviors'", "'role'", "'actions'", "'='", "'attributes'", "'WorkSource'", "'assignTo'", "'WorkItems'", "'prerequisites'", "'decomposites'", "'analysisEfforts'", "'decompositionMechanism'", "'efforts'", "'maturityLevels'", "'uncertainty'", "'risk'", "'impacts'", "'value'", "'workSource'", "'arrival'", "'duration'", "'hierarchy'", "'priority'", "'disruptive'", "'outsourceFrom'", "'strategy'", "'resources'", "'*'", "'skills'", "'int'", "'double'", "'Agent'", "'Task'", "'Contract'", "'Bid'", "'Service'", "'List'", "'Map'", "'default'", "'action'", "'('", "')'", "'backgroundState'", "'state'", "'else'", "'if'", "'in'", "'and'", "'or'", "'Do'", "'->'", "'var'", "'end if'", "'for'", "'end for'", "'while'", "'end while'", "'+'", "'-'", "'/'", "'self'", "'context'"
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
    public static final int T__85=85;
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
    public String getGrammarFileName() { return "InternalDmodel.g"; }



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
    // InternalDmodel.g:67:1: entryRuleModelBuilder returns [EObject current=null] : iv_ruleModelBuilder= ruleModelBuilder EOF ;
    public final EObject entryRuleModelBuilder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelBuilder = null;


        try {
            // InternalDmodel.g:68:2: (iv_ruleModelBuilder= ruleModelBuilder EOF )
            // InternalDmodel.g:69:2: iv_ruleModelBuilder= ruleModelBuilder EOF
            {
             newCompositeNode(grammarAccess.getModelBuilderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelBuilder=ruleModelBuilder();

            state._fsp--;

             current =iv_ruleModelBuilder; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:76:1: ruleModelBuilder returns [EObject current=null] : (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) ) ;
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
            // InternalDmodel.g:79:28: ( (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) ) )
            // InternalDmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) )
            {
            // InternalDmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) ) )
            // InternalDmodel.g:80:3: otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'desc' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_UserLibraries_4_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_5_0= ruleExperimentModel ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getModelBuilderAccess().getModelBuilderKeyword_0());
                
            // InternalDmodel.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:85:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelBuilderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelBuilderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getModelBuilderAccess().getDescKeyword_2());
                
            // InternalDmodel.g:106:1: ( (lv_Description_3_0= RULE_STRING ) )
            // InternalDmodel.g:107:1: (lv_Description_3_0= RULE_STRING )
            {
            // InternalDmodel.g:107:1: (lv_Description_3_0= RULE_STRING )
            // InternalDmodel.g:108:3: lv_Description_3_0= RULE_STRING
            {
            lv_Description_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            			newLeafNode(lv_Description_3_0, grammarAccess.getModelBuilderAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelBuilderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Description",
                    		lv_Description_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalDmodel.g:124:2: ( (lv_UserLibraries_4_0= ruleUserLibraries ) )
            // InternalDmodel.g:125:1: (lv_UserLibraries_4_0= ruleUserLibraries )
            {
            // InternalDmodel.g:125:1: (lv_UserLibraries_4_0= ruleUserLibraries )
            // InternalDmodel.g:126:3: lv_UserLibraries_4_0= ruleUserLibraries
            {
             
            	        newCompositeNode(grammarAccess.getModelBuilderAccess().getUserLibrariesUserLibrariesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_7);
            lv_UserLibraries_4_0=ruleUserLibraries();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBuilderRule());
            	        }
                   		set(
                   			current, 
                   			"UserLibraries",
                    		lv_UserLibraries_4_0, 
                    		"datasemModeller.Dmodel.UserLibraries");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDmodel.g:142:2: ( (lv_ExperimentModel_5_0= ruleExperimentModel ) )
            // InternalDmodel.g:143:1: (lv_ExperimentModel_5_0= ruleExperimentModel )
            {
            // InternalDmodel.g:143:1: (lv_ExperimentModel_5_0= ruleExperimentModel )
            // InternalDmodel.g:144:3: lv_ExperimentModel_5_0= ruleExperimentModel
            {
             
            	        newCompositeNode(grammarAccess.getModelBuilderAccess().getExperimentModelExperimentModelParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_ExperimentModel_5_0=ruleExperimentModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBuilderRule());
            	        }
                   		set(
                   			current, 
                   			"ExperimentModel",
                    		lv_ExperimentModel_5_0, 
                    		"datasemModeller.Dmodel.ExperimentModel");
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


    // $ANTLR start "entryRuleUserLibraries"
    // InternalDmodel.g:168:1: entryRuleUserLibraries returns [EObject current=null] : iv_ruleUserLibraries= ruleUserLibraries EOF ;
    public final EObject entryRuleUserLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserLibraries = null;


        try {
            // InternalDmodel.g:169:2: (iv_ruleUserLibraries= ruleUserLibraries EOF )
            // InternalDmodel.g:170:2: iv_ruleUserLibraries= ruleUserLibraries EOF
            {
             newCompositeNode(grammarAccess.getUserLibrariesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserLibraries=ruleUserLibraries();

            state._fsp--;

             current =iv_ruleUserLibraries; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:177:1: ruleUserLibraries returns [EObject current=null] : (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' (otherlv_7= 'ClassOfServices' ( (lv_ClassOfServices_8_0= ruleClassOfService ) )* otherlv_9= 'end ClassOfServices' )? otherlv_10= 'Services' ( (lv_Services_11_0= ruleService ) )+ otherlv_12= 'end Services' (otherlv_13= 'ProcessModels' ( (lv_ProcessModels_14_0= ruleProcessModel ) )* otherlv_15= 'end ProcessModels' )? otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' ) ;
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

        EObject lv_ClassOfServices_8_0 = null;

        EObject lv_Services_11_0 = null;

        EObject lv_ProcessModels_14_0 = null;

        EObject lv_GovernanceStrategies_17_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:180:28: ( (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' (otherlv_7= 'ClassOfServices' ( (lv_ClassOfServices_8_0= ruleClassOfService ) )* otherlv_9= 'end ClassOfServices' )? otherlv_10= 'Services' ( (lv_Services_11_0= ruleService ) )+ otherlv_12= 'end Services' (otherlv_13= 'ProcessModels' ( (lv_ProcessModels_14_0= ruleProcessModel ) )* otherlv_15= 'end ProcessModels' )? otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' ) )
            // InternalDmodel.g:181:1: (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' (otherlv_7= 'ClassOfServices' ( (lv_ClassOfServices_8_0= ruleClassOfService ) )* otherlv_9= 'end ClassOfServices' )? otherlv_10= 'Services' ( (lv_Services_11_0= ruleService ) )+ otherlv_12= 'end Services' (otherlv_13= 'ProcessModels' ( (lv_ProcessModels_14_0= ruleProcessModel ) )* otherlv_15= 'end ProcessModels' )? otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' )
            {
            // InternalDmodel.g:181:1: (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' (otherlv_7= 'ClassOfServices' ( (lv_ClassOfServices_8_0= ruleClassOfService ) )* otherlv_9= 'end ClassOfServices' )? otherlv_10= 'Services' ( (lv_Services_11_0= ruleService ) )+ otherlv_12= 'end Services' (otherlv_13= 'ProcessModels' ( (lv_ProcessModels_14_0= ruleProcessModel ) )* otherlv_15= 'end ProcessModels' )? otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries' )
            // InternalDmodel.g:181:3: otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' (otherlv_7= 'ClassOfServices' ( (lv_ClassOfServices_8_0= ruleClassOfService ) )* otherlv_9= 'end ClassOfServices' )? otherlv_10= 'Services' ( (lv_Services_11_0= ruleService ) )+ otherlv_12= 'end Services' (otherlv_13= 'ProcessModels' ( (lv_ProcessModels_14_0= ruleProcessModel ) )* otherlv_15= 'end ProcessModels' )? otherlv_16= 'GovernanceStrategies' ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )* otherlv_18= 'end GovernanceStrategies' otherlv_19= 'end UserLibraries'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

                	newLeafNode(otherlv_0, grammarAccess.getUserLibrariesAccess().getUserLibrariesKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

                	newLeafNode(otherlv_1, grammarAccess.getUserLibrariesAccess().getServiceProviderTypesKeyword_1());
                
            // InternalDmodel.g:189:1: ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDmodel.g:190:1: (lv_ServiceProviderTypes_2_0= ruleServiceProviderType )
            	    {
            	    // InternalDmodel.g:190:1: (lv_ServiceProviderTypes_2_0= ruleServiceProviderType )
            	    // InternalDmodel.g:191:3: lv_ServiceProviderTypes_2_0= ruleServiceProviderType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getServiceProviderTypesServiceProviderTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_ServiceProviderTypes_2_0=ruleServiceProviderType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceProviderTypes",
            	            		lv_ServiceProviderTypes_2_0, 
            	            		"datasemModeller.Dmodel.ServiceProviderType");
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

            otherlv_3=(Token)match(input,17,FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getUserLibrariesAccess().getEndServiceProviderTypesKeyword_3());
                
            otherlv_4=(Token)match(input,18,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getUserLibrariesAccess().getWorkItemTypesKeyword_4());
                
            // InternalDmodel.g:215:1: ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDmodel.g:216:1: (lv_WorkItemTypes_5_0= ruleWorkItemType )
            	    {
            	    // InternalDmodel.g:216:1: (lv_WorkItemTypes_5_0= ruleWorkItemType )
            	    // InternalDmodel.g:217:3: lv_WorkItemTypes_5_0= ruleWorkItemType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getWorkItemTypesWorkItemTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_WorkItemTypes_5_0=ruleWorkItemType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkItemTypes",
            	            		lv_WorkItemTypes_5_0, 
            	            		"datasemModeller.Dmodel.WorkItemType");
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

            otherlv_6=(Token)match(input,19,FOLLOW_13); 

                	newLeafNode(otherlv_6, grammarAccess.getUserLibrariesAccess().getEndWorkItemTypesKeyword_6());
                
            // InternalDmodel.g:237:1: (otherlv_7= 'ClassOfServices' ( (lv_ClassOfServices_8_0= ruleClassOfService ) )* otherlv_9= 'end ClassOfServices' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDmodel.g:237:3: otherlv_7= 'ClassOfServices' ( (lv_ClassOfServices_8_0= ruleClassOfService ) )* otherlv_9= 'end ClassOfServices'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_14); 

                        	newLeafNode(otherlv_7, grammarAccess.getUserLibrariesAccess().getClassOfServicesKeyword_7_0());
                        
                    // InternalDmodel.g:241:1: ( (lv_ClassOfServices_8_0= ruleClassOfService ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID||LA3_0==RULE_INT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDmodel.g:242:1: (lv_ClassOfServices_8_0= ruleClassOfService )
                    	    {
                    	    // InternalDmodel.g:242:1: (lv_ClassOfServices_8_0= ruleClassOfService )
                    	    // InternalDmodel.g:243:3: lv_ClassOfServices_8_0= ruleClassOfService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getClassOfServicesClassOfServiceParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_14);
                    	    lv_ClassOfServices_8_0=ruleClassOfService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ClassOfServices",
                    	            		lv_ClassOfServices_8_0, 
                    	            		"datasemModeller.Dmodel.ClassOfService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_15); 

                        	newLeafNode(otherlv_9, grammarAccess.getUserLibrariesAccess().getEndClassOfServicesKeyword_7_2());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_3); 

                	newLeafNode(otherlv_10, grammarAccess.getUserLibrariesAccess().getServicesKeyword_8());
                
            // InternalDmodel.g:267:1: ( (lv_Services_11_0= ruleService ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDmodel.g:268:1: (lv_Services_11_0= ruleService )
            	    {
            	    // InternalDmodel.g:268:1: (lv_Services_11_0= ruleService )
            	    // InternalDmodel.g:269:3: lv_Services_11_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getServicesServiceParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_16);
            	    lv_Services_11_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Services",
            	            		lv_Services_11_0, 
            	            		"datasemModeller.Dmodel.Service");
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

            otherlv_12=(Token)match(input,23,FOLLOW_17); 

                	newLeafNode(otherlv_12, grammarAccess.getUserLibrariesAccess().getEndServicesKeyword_10());
                
            // InternalDmodel.g:289:1: (otherlv_13= 'ProcessModels' ( (lv_ProcessModels_14_0= ruleProcessModel ) )* otherlv_15= 'end ProcessModels' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDmodel.g:289:3: otherlv_13= 'ProcessModels' ( (lv_ProcessModels_14_0= ruleProcessModel ) )* otherlv_15= 'end ProcessModels'
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_18); 

                        	newLeafNode(otherlv_13, grammarAccess.getUserLibrariesAccess().getProcessModelsKeyword_11_0());
                        
                    // InternalDmodel.g:293:1: ( (lv_ProcessModels_14_0= ruleProcessModel ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDmodel.g:294:1: (lv_ProcessModels_14_0= ruleProcessModel )
                    	    {
                    	    // InternalDmodel.g:294:1: (lv_ProcessModels_14_0= ruleProcessModel )
                    	    // InternalDmodel.g:295:3: lv_ProcessModels_14_0= ruleProcessModel
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getProcessModelsProcessModelParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_18);
                    	    lv_ProcessModels_14_0=ruleProcessModel();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ProcessModels",
                    	            		lv_ProcessModels_14_0, 
                    	            		"datasemModeller.Dmodel.ProcessModel");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_19); 

                        	newLeafNode(otherlv_15, grammarAccess.getUserLibrariesAccess().getEndProcessModelsKeyword_11_2());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,26,FOLLOW_20); 

                	newLeafNode(otherlv_16, grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesKeyword_12());
                
            // InternalDmodel.g:319:1: ( (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDmodel.g:320:1: (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy )
            	    {
            	    // InternalDmodel.g:320:1: (lv_GovernanceStrategies_17_0= ruleGovernanceStrategy )
            	    // InternalDmodel.g:321:3: lv_GovernanceStrategies_17_0= ruleGovernanceStrategy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesGovernanceStrategyParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_20);
            	    lv_GovernanceStrategies_17_0=ruleGovernanceStrategy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GovernanceStrategies",
            	            		lv_GovernanceStrategies_17_0, 
            	            		"datasemModeller.Dmodel.GovernanceStrategy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_18=(Token)match(input,27,FOLLOW_21); 

                	newLeafNode(otherlv_18, grammarAccess.getUserLibrariesAccess().getEndGovernanceStrategiesKeyword_14());
                
            otherlv_19=(Token)match(input,28,FOLLOW_2); 

                	newLeafNode(otherlv_19, grammarAccess.getUserLibrariesAccess().getEndUserLibrariesKeyword_15());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleExperimentModel"
    // InternalDmodel.g:353:1: entryRuleExperimentModel returns [EObject current=null] : iv_ruleExperimentModel= ruleExperimentModel EOF ;
    public final EObject entryRuleExperimentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentModel = null;


        try {
            // InternalDmodel.g:354:2: (iv_ruleExperimentModel= ruleExperimentModel EOF )
            // InternalDmodel.g:355:2: iv_ruleExperimentModel= ruleExperimentModel EOF
            {
             newCompositeNode(grammarAccess.getExperimentModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentModel=ruleExperimentModel();

            state._fsp--;

             current =iv_ruleExperimentModel; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:362:1: ruleExperimentModel returns [EObject current=null] : (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' (otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' )? otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' ) ;
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
            // InternalDmodel.g:365:28: ( (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' (otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' )? otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' ) )
            // InternalDmodel.g:366:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' (otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' )? otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' )
            {
            // InternalDmodel.g:366:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' (otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' )? otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel' )
            // InternalDmodel.g:366:3: otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'Variables' ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )* otherlv_6= 'end Variables' otherlv_7= 'OrganizationalModel' otherlv_8= 'ServiceProviders' ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+ otherlv_10= 'end ServiceProviders' otherlv_11= 'end OrganizationalModel' otherlv_12= 'WorkItemNetworkModel' (otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' )? otherlv_16= 'WorkItemNetworks' ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+ otherlv_18= 'end WorkItemNetworks' otherlv_19= 'end WorkItemNetworkModel' otherlv_20= 'ExperimentSettings' otherlv_21= 'WINReplications' ( (lv_WINReplications_22_0= ruleWINReplication ) )+ otherlv_23= 'end WINReplications' otherlv_24= 'Indicators' ( (lv_Indicators_25_0= RULE_ID ) )* otherlv_26= 'end Indicators' otherlv_27= 'end ExperimentSettings' otherlv_28= 'end ExperimentModel'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentModelAccess().getExperimentModelKeyword_0());
                
            // InternalDmodel.g:370:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:371:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:371:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:372:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExperimentModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDmodel.g:388:2: (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDmodel.g:388:4: otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getExperimentModelAccess().getPathKeyword_2_0());
                        
                    // InternalDmodel.g:392:1: ( (lv_Path_3_0= ruleQualifiedName ) )
                    // InternalDmodel.g:393:1: (lv_Path_3_0= ruleQualifiedName )
                    {
                    // InternalDmodel.g:393:1: (lv_Path_3_0= ruleQualifiedName )
                    // InternalDmodel.g:394:3: lv_Path_3_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getPathQualifiedNameParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_23);
                    lv_Path_3_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
                    	        }
                           		set(
                           			current, 
                           			"Path",
                            		lv_Path_3_0, 
                            		"datasemModeller.Dmodel.QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_24); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentModelAccess().getVariablesKeyword_3());
                
            // InternalDmodel.g:414:1: ( (lv_ExperimentVariables_5_0= ruleExperimentVariable ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDmodel.g:415:1: (lv_ExperimentVariables_5_0= ruleExperimentVariable )
            	    {
            	    // InternalDmodel.g:415:1: (lv_ExperimentVariables_5_0= ruleExperimentVariable )
            	    // InternalDmodel.g:416:3: lv_ExperimentVariables_5_0= ruleExperimentVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getExperimentVariablesExperimentVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_24);
            	    lv_ExperimentVariables_5_0=ruleExperimentVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ExperimentVariables",
            	            		lv_ExperimentVariables_5_0, 
            	            		"datasemModeller.Dmodel.ExperimentVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_25); 

                	newLeafNode(otherlv_6, grammarAccess.getExperimentModelAccess().getEndVariablesKeyword_5());
                
            otherlv_7=(Token)match(input,33,FOLLOW_26); 

                	newLeafNode(otherlv_7, grammarAccess.getExperimentModelAccess().getOrganizationalModelKeyword_6());
                
            otherlv_8=(Token)match(input,34,FOLLOW_3); 

                	newLeafNode(otherlv_8, grammarAccess.getExperimentModelAccess().getServiceProvidersKeyword_7());
                
            // InternalDmodel.g:444:1: ( (lv_ServiceProviders_9_0= ruleServiceProvider ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDmodel.g:445:1: (lv_ServiceProviders_9_0= ruleServiceProvider )
            	    {
            	    // InternalDmodel.g:445:1: (lv_ServiceProviders_9_0= ruleServiceProvider )
            	    // InternalDmodel.g:446:3: lv_ServiceProviders_9_0= ruleServiceProvider
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getServiceProvidersServiceProviderParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_27);
            	    lv_ServiceProviders_9_0=ruleServiceProvider();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceProviders",
            	            		lv_ServiceProviders_9_0, 
            	            		"datasemModeller.Dmodel.ServiceProvider");
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

            otherlv_10=(Token)match(input,35,FOLLOW_28); 

                	newLeafNode(otherlv_10, grammarAccess.getExperimentModelAccess().getEndServiceProvidersKeyword_9());
                
            otherlv_11=(Token)match(input,36,FOLLOW_29); 

                	newLeafNode(otherlv_11, grammarAccess.getExperimentModelAccess().getEndOrganizationalModelKeyword_10());
                
            otherlv_12=(Token)match(input,37,FOLLOW_30); 

                	newLeafNode(otherlv_12, grammarAccess.getExperimentModelAccess().getWorkItemNetworkModelKeyword_11());
                
            // InternalDmodel.g:474:1: (otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDmodel.g:474:3: otherlv_13= 'WorkSources' ( (lv_WorkSources_14_0= ruleWorkSource ) )+ otherlv_15= 'end WorkSources'
                    {
                    otherlv_13=(Token)match(input,38,FOLLOW_31); 

                        	newLeafNode(otherlv_13, grammarAccess.getExperimentModelAccess().getWorkSourcesKeyword_12_0());
                        
                    // InternalDmodel.g:478:1: ( (lv_WorkSources_14_0= ruleWorkSource ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==84) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDmodel.g:479:1: (lv_WorkSources_14_0= ruleWorkSource )
                    	    {
                    	    // InternalDmodel.g:479:1: (lv_WorkSources_14_0= ruleWorkSource )
                    	    // InternalDmodel.g:480:3: lv_WorkSources_14_0= ruleWorkSource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWorkSourcesWorkSourceParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_32);
                    	    lv_WorkSources_14_0=ruleWorkSource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"WorkSources",
                    	            		lv_WorkSources_14_0, 
                    	            		"datasemModeller.Dmodel.WorkSource");
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

                    otherlv_15=(Token)match(input,39,FOLLOW_33); 

                        	newLeafNode(otherlv_15, grammarAccess.getExperimentModelAccess().getEndWorkSourcesKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,40,FOLLOW_34); 

                	newLeafNode(otherlv_16, grammarAccess.getExperimentModelAccess().getWorkItemNetworksKeyword_13());
                
            // InternalDmodel.g:504:1: ( (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==70) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDmodel.g:505:1: (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork )
            	    {
            	    // InternalDmodel.g:505:1: (lv_WorkItemNetworks_17_0= ruleWorkItemNetwork )
            	    // InternalDmodel.g:506:3: lv_WorkItemNetworks_17_0= ruleWorkItemNetwork
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWorkItemNetworksWorkItemNetworkParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_35);
            	    lv_WorkItemNetworks_17_0=ruleWorkItemNetwork();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkItemNetworks",
            	            		lv_WorkItemNetworks_17_0, 
            	            		"datasemModeller.Dmodel.WorkItemNetwork");
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

            otherlv_18=(Token)match(input,41,FOLLOW_36); 

                	newLeafNode(otherlv_18, grammarAccess.getExperimentModelAccess().getEndWorkItemNetworksKeyword_15());
                
            otherlv_19=(Token)match(input,42,FOLLOW_37); 

                	newLeafNode(otherlv_19, grammarAccess.getExperimentModelAccess().getEndWorkItemNetworkModelKeyword_16());
                
            otherlv_20=(Token)match(input,43,FOLLOW_38); 

                	newLeafNode(otherlv_20, grammarAccess.getExperimentModelAccess().getExperimentSettingsKeyword_17());
                
            otherlv_21=(Token)match(input,44,FOLLOW_34); 

                	newLeafNode(otherlv_21, grammarAccess.getExperimentModelAccess().getWINReplicationsKeyword_18());
                
            // InternalDmodel.g:538:1: ( (lv_WINReplications_22_0= ruleWINReplication ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==70) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDmodel.g:539:1: (lv_WINReplications_22_0= ruleWINReplication )
            	    {
            	    // InternalDmodel.g:539:1: (lv_WINReplications_22_0= ruleWINReplication )
            	    // InternalDmodel.g:540:3: lv_WINReplications_22_0= ruleWINReplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWINReplicationsWINReplicationParserRuleCall_19_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_WINReplications_22_0=ruleWINReplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WINReplications",
            	            		lv_WINReplications_22_0, 
            	            		"datasemModeller.Dmodel.WINReplication");
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

            otherlv_23=(Token)match(input,45,FOLLOW_40); 

                	newLeafNode(otherlv_23, grammarAccess.getExperimentModelAccess().getEndWINReplicationsKeyword_20());
                
            otherlv_24=(Token)match(input,46,FOLLOW_41); 

                	newLeafNode(otherlv_24, grammarAccess.getExperimentModelAccess().getIndicatorsKeyword_21());
                
            // InternalDmodel.g:564:1: ( (lv_Indicators_25_0= RULE_ID ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDmodel.g:565:1: (lv_Indicators_25_0= RULE_ID )
            	    {
            	    // InternalDmodel.g:565:1: (lv_Indicators_25_0= RULE_ID )
            	    // InternalDmodel.g:566:3: lv_Indicators_25_0= RULE_ID
            	    {
            	    lv_Indicators_25_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    			newLeafNode(lv_Indicators_25_0, grammarAccess.getExperimentModelAccess().getIndicatorsIDTerminalRuleCall_22_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"Indicators",
            	            		lv_Indicators_25_0, 
            	            		"org.eclipse.xtext.common.Terminals.ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_26=(Token)match(input,47,FOLLOW_42); 

                	newLeafNode(otherlv_26, grammarAccess.getExperimentModelAccess().getEndIndicatorsKeyword_23());
                
            otherlv_27=(Token)match(input,48,FOLLOW_43); 

                	newLeafNode(otherlv_27, grammarAccess.getExperimentModelAccess().getEndExperimentSettingsKeyword_24());
                
            otherlv_28=(Token)match(input,49,FOLLOW_2); 

                	newLeafNode(otherlv_28, grammarAccess.getExperimentModelAccess().getEndExperimentModelKeyword_25());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleNumber"
    // InternalDmodel.g:602:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalDmodel.g:603:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalDmodel.g:604:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:611:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:614:28: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalDmodel.g:615:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalDmodel.g:615:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_DOUBLE) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDmodel.g:615:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDmodel.g:623:10: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

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
    // InternalDmodel.g:638:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDmodel.g:639:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDmodel.g:640:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:647:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:650:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) )
            // InternalDmodel.g:651:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            {
            // InternalDmodel.g:651:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            // InternalDmodel.g:651:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalDmodel.g:658:1: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_ID) ) {
                        int LA18_3 = input.LA(3);

                        if ( (LA18_3==EOF||LA18_3==RULE_ID||LA18_3==31||LA18_3==50||(LA18_3>=53 && LA18_3<=58)||LA18_3==77||LA18_3==82||LA18_3==106||LA18_3==120||(LA18_3>=124 && LA18_3<=130)||LA18_3==132||LA18_3==134||(LA18_3>=136 && LA18_3<=140)) ) {
                            alt18=1;
                        }


                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalDmodel.g:659:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FOLLOW_3); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_44); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalDmodel.g:671:3: (kw= '.' this_INT_4= RULE_INT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==50) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==RULE_INT) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalDmodel.g:672:2: kw= '.' this_INT_4= RULE_INT
            	    {
            	    kw=(Token)match(input,50,FOLLOW_45); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_44); 

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


    // $ANTLR start "entryRuleParameter"
    // InternalDmodel.g:692:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // InternalDmodel.g:693:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalDmodel.g:694:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:701:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_ID_2=null;
        Token this_BOOLEAN_3=null;
        AntlrDatatypeRuleToken this_Number_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:704:28: ( (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // InternalDmodel.g:705:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // InternalDmodel.g:705:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt20=1;
                }
                break;
            case RULE_STRING:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
                {
                alt20=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDmodel.g:706:5: this_Number_0= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getNumberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    		current.merge(this_Number_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDmodel.g:717:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getParameterAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDmodel.g:725:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getParameterAccess().getIDTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalDmodel.g:733:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

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
    // InternalDmodel.g:748:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalDmodel.g:749:2: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalDmodel.g:750:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractParameter=ruleAbstractParameter();

            state._fsp--;

             current =iv_ruleAbstractParameter; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:757:1: ruleAbstractParameter returns [EObject current=null] : ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        Token lv_isVariable_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:760:28: ( ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) )
            // InternalDmodel.g:761:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
            {
            // InternalDmodel.g:761:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_BOOLEAN)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDmodel.g:761:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalDmodel.g:761:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    // InternalDmodel.g:761:3: ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDmodel.g:761:3: ( (lv_isVariable_0_0= 'var:' ) )
                    // InternalDmodel.g:762:1: (lv_isVariable_0_0= 'var:' )
                    {
                    // InternalDmodel.g:762:1: (lv_isVariable_0_0= 'var:' )
                    // InternalDmodel.g:763:3: lv_isVariable_0_0= 'var:'
                    {
                    lv_isVariable_0_0=(Token)match(input,51,FOLLOW_3); 

                            newLeafNode(lv_isVariable_0_0, grammarAccess.getAbstractParameterAccess().getIsVariableVarKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractParameterRule());
                    	        }
                           		setWithLastConsumed(current, "isVariable", true, "var:");
                    	    

                    }


                    }

                    // InternalDmodel.g:776:2: ( (otherlv_1= RULE_ID ) )
                    // InternalDmodel.g:777:1: (otherlv_1= RULE_ID )
                    {
                    // InternalDmodel.g:777:1: (otherlv_1= RULE_ID )
                    // InternalDmodel.g:778:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractParameterRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		newLeafNode(otherlv_1, grammarAccess.getAbstractParameterAccess().getVariableExperimentVariableCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:790:6: ( (lv_value_2_0= ruleParameter ) )
                    {
                    // InternalDmodel.g:790:6: ( (lv_value_2_0= ruleParameter ) )
                    // InternalDmodel.g:791:1: (lv_value_2_0= ruleParameter )
                    {
                    // InternalDmodel.g:791:1: (lv_value_2_0= ruleParameter )
                    // InternalDmodel.g:792:3: lv_value_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractParameterAccess().getValueParameterParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"datasemModeller.Dmodel.Parameter");
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
    // InternalDmodel.g:816:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // InternalDmodel.g:817:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // InternalDmodel.g:818:2: iv_ruleNumExpression= ruleNumExpression EOF
            {
             newCompositeNode(grammarAccess.getNumExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumExpression=ruleNumExpression();

            state._fsp--;

             current =iv_ruleNumExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:825:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_distribution_1_0=null;
        AntlrDatatypeRuleToken lv_numValue_0_0 = null;

        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:828:28: ( ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) )
            // InternalDmodel.g:829:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            {
            // InternalDmodel.g:829:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_INT && LA22_0<=RULE_DOUBLE)) ) {
                alt22=1;
            }
            else if ( (LA22_0==52) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDmodel.g:829:2: ( (lv_numValue_0_0= ruleNumber ) )
                    {
                    // InternalDmodel.g:829:2: ( (lv_numValue_0_0= ruleNumber ) )
                    // InternalDmodel.g:830:1: (lv_numValue_0_0= ruleNumber )
                    {
                    // InternalDmodel.g:830:1: (lv_numValue_0_0= ruleNumber )
                    // InternalDmodel.g:831:3: lv_numValue_0_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumValueNumberParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_numValue_0_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"numValue",
                            		lv_numValue_0_0, 
                            		"datasemModeller.Dmodel.Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:848:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    {
                    // InternalDmodel.g:848:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    // InternalDmodel.g:848:7: ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // InternalDmodel.g:848:7: ( (lv_distribution_1_0= 'Random.' ) )
                    // InternalDmodel.g:849:1: (lv_distribution_1_0= 'Random.' )
                    {
                    // InternalDmodel.g:849:1: (lv_distribution_1_0= 'Random.' )
                    // InternalDmodel.g:850:3: lv_distribution_1_0= 'Random.'
                    {
                    lv_distribution_1_0=(Token)match(input,52,FOLLOW_46); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionRandomKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // InternalDmodel.g:863:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // InternalDmodel.g:864:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // InternalDmodel.g:864:1: (lv_numDist_2_0= ruleDistribution )
                    // InternalDmodel.g:865:3: lv_numDist_2_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumDistDistributionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_numDist_2_0=ruleDistribution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"numDist",
                            		lv_numDist_2_0, 
                            		"datasemModeller.Dmodel.Distribution");
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
    // InternalDmodel.g:889:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalDmodel.g:890:2: (iv_ruleOperator= ruleOperator EOF )
            // InternalDmodel.g:891:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:898:1: ruleOperator returns [EObject current=null] : ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) ;
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
            // InternalDmodel.g:901:28: ( ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) )
            // InternalDmodel.g:902:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            {
            // InternalDmodel.g:902:1: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt23=1;
                }
                break;
            case 54:
                {
                alt23=2;
                }
                break;
            case 55:
                {
                alt23=3;
                }
                break;
            case 56:
                {
                alt23=4;
                }
                break;
            case 57:
                {
                alt23=5;
                }
                break;
            case 58:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDmodel.g:902:2: ( (lv_equalTo_0_0= '==' ) )
                    {
                    // InternalDmodel.g:902:2: ( (lv_equalTo_0_0= '==' ) )
                    // InternalDmodel.g:903:1: (lv_equalTo_0_0= '==' )
                    {
                    // InternalDmodel.g:903:1: (lv_equalTo_0_0= '==' )
                    // InternalDmodel.g:904:3: lv_equalTo_0_0= '=='
                    {
                    lv_equalTo_0_0=(Token)match(input,53,FOLLOW_2); 

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
                    // InternalDmodel.g:918:6: ( (lv_largerThan_1_0= '>' ) )
                    {
                    // InternalDmodel.g:918:6: ( (lv_largerThan_1_0= '>' ) )
                    // InternalDmodel.g:919:1: (lv_largerThan_1_0= '>' )
                    {
                    // InternalDmodel.g:919:1: (lv_largerThan_1_0= '>' )
                    // InternalDmodel.g:920:3: lv_largerThan_1_0= '>'
                    {
                    lv_largerThan_1_0=(Token)match(input,54,FOLLOW_2); 

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
                    // InternalDmodel.g:934:6: ( (lv_smallerThan_2_0= '<' ) )
                    {
                    // InternalDmodel.g:934:6: ( (lv_smallerThan_2_0= '<' ) )
                    // InternalDmodel.g:935:1: (lv_smallerThan_2_0= '<' )
                    {
                    // InternalDmodel.g:935:1: (lv_smallerThan_2_0= '<' )
                    // InternalDmodel.g:936:3: lv_smallerThan_2_0= '<'
                    {
                    lv_smallerThan_2_0=(Token)match(input,55,FOLLOW_2); 

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
                    // InternalDmodel.g:950:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    {
                    // InternalDmodel.g:950:6: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    // InternalDmodel.g:951:1: (lv_largerOrEqualTo_3_0= '>=' )
                    {
                    // InternalDmodel.g:951:1: (lv_largerOrEqualTo_3_0= '>=' )
                    // InternalDmodel.g:952:3: lv_largerOrEqualTo_3_0= '>='
                    {
                    lv_largerOrEqualTo_3_0=(Token)match(input,56,FOLLOW_2); 

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
                    // InternalDmodel.g:966:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    {
                    // InternalDmodel.g:966:6: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    // InternalDmodel.g:967:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    {
                    // InternalDmodel.g:967:1: (lv_smallerOrEqualTo_4_0= '<=' )
                    // InternalDmodel.g:968:3: lv_smallerOrEqualTo_4_0= '<='
                    {
                    lv_smallerOrEqualTo_4_0=(Token)match(input,57,FOLLOW_2); 

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
                    // InternalDmodel.g:982:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    {
                    // InternalDmodel.g:982:6: ( (lv_notEqualTo_5_0= '!=' ) )
                    // InternalDmodel.g:983:1: (lv_notEqualTo_5_0= '!=' )
                    {
                    // InternalDmodel.g:983:1: (lv_notEqualTo_5_0= '!=' )
                    // InternalDmodel.g:984:3: lv_notEqualTo_5_0= '!='
                    {
                    lv_notEqualTo_5_0=(Token)match(input,58,FOLLOW_2); 

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
    // InternalDmodel.g:1005:1: entryRuleExperimentVariable returns [EObject current=null] : iv_ruleExperimentVariable= ruleExperimentVariable EOF ;
    public final EObject entryRuleExperimentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentVariable = null;


        try {
            // InternalDmodel.g:1006:2: (iv_ruleExperimentVariable= ruleExperimentVariable EOF )
            // InternalDmodel.g:1007:2: iv_ruleExperimentVariable= ruleExperimentVariable EOF
            {
             newCompositeNode(grammarAccess.getExperimentVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentVariable=ruleExperimentVariable();

            state._fsp--;

             current =iv_ruleExperimentVariable; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:1014:1: ruleExperimentVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) ;
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
            // InternalDmodel.g:1017:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) )
            // InternalDmodel.g:1018:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            {
            // InternalDmodel.g:1018:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            // InternalDmodel.g:1018:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
            {
            // InternalDmodel.g:1018:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1019:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1019:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1020:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            			newLeafNode(lv_name_0_0, grammarAccess.getExperimentVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_48); 

                	newLeafNode(otherlv_1, grammarAccess.getExperimentVariableAccess().getColonKeyword_1());
                
            // InternalDmodel.g:1040:1: ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt24=1;
                }
                break;
            case 61:
                {
                alt24=2;
                }
                break;
            case 52:
                {
                alt24=3;
                }
                break;
            case 62:
                {
                alt24=4;
                }
                break;
            case 63:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDmodel.g:1040:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalDmodel.g:1040:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    // InternalDmodel.g:1040:3: ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalDmodel.g:1040:3: ( (lv_boolean_2_0= 'boolean' ) )
                    // InternalDmodel.g:1041:1: (lv_boolean_2_0= 'boolean' )
                    {
                    // InternalDmodel.g:1041:1: (lv_boolean_2_0= 'boolean' )
                    // InternalDmodel.g:1042:3: lv_boolean_2_0= 'boolean'
                    {
                    lv_boolean_2_0=(Token)match(input,60,FOLLOW_49); 

                            newLeafNode(lv_boolean_2_0, grammarAccess.getExperimentVariableAccess().getBooleanBooleanKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "boolean", true, "boolean");
                    	    

                    }


                    }

                    // InternalDmodel.g:1055:2: ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    // InternalDmodel.g:1056:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    {
                    // InternalDmodel.g:1056:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    // InternalDmodel.g:1057:3: lv_booleanValue_3_0= RULE_BOOLEAN
                    {
                    lv_booleanValue_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    			newLeafNode(lv_booleanValue_3_0, grammarAccess.getExperimentVariableAccess().getBooleanValueBOOLEANTerminalRuleCall_2_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"booleanValue",
                            		lv_booleanValue_3_0, 
                            		"datasemModeller.Dmodel.BOOLEAN");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:1074:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    {
                    // InternalDmodel.g:1074:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    // InternalDmodel.g:1074:7: ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) )
                    {
                    // InternalDmodel.g:1074:7: ( (lv_num_4_0= 'num' ) )
                    // InternalDmodel.g:1075:1: (lv_num_4_0= 'num' )
                    {
                    // InternalDmodel.g:1075:1: (lv_num_4_0= 'num' )
                    // InternalDmodel.g:1076:3: lv_num_4_0= 'num'
                    {
                    lv_num_4_0=(Token)match(input,61,FOLLOW_50); 

                            newLeafNode(lv_num_4_0, grammarAccess.getExperimentVariableAccess().getNumNumKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "num", true, "num");
                    	    

                    }


                    }

                    // InternalDmodel.g:1089:2: ( (lv_numValue_5_0= ruleNumber ) )
                    // InternalDmodel.g:1090:1: (lv_numValue_5_0= ruleNumber )
                    {
                    // InternalDmodel.g:1090:1: (lv_numValue_5_0= ruleNumber )
                    // InternalDmodel.g:1091:3: lv_numValue_5_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentVariableAccess().getNumValueNumberParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_numValue_5_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExperimentVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"numValue",
                            		lv_numValue_5_0, 
                            		"datasemModeller.Dmodel.Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDmodel.g:1108:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    {
                    // InternalDmodel.g:1108:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    // InternalDmodel.g:1108:7: ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) )
                    {
                    // InternalDmodel.g:1108:7: ( (lv_distribution_6_0= 'Random.' ) )
                    // InternalDmodel.g:1109:1: (lv_distribution_6_0= 'Random.' )
                    {
                    // InternalDmodel.g:1109:1: (lv_distribution_6_0= 'Random.' )
                    // InternalDmodel.g:1110:3: lv_distribution_6_0= 'Random.'
                    {
                    lv_distribution_6_0=(Token)match(input,52,FOLLOW_46); 

                            newLeafNode(lv_distribution_6_0, grammarAccess.getExperimentVariableAccess().getDistributionRandomKeyword_2_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // InternalDmodel.g:1123:2: ( (lv_numDist_7_0= ruleDistribution ) )
                    // InternalDmodel.g:1124:1: (lv_numDist_7_0= ruleDistribution )
                    {
                    // InternalDmodel.g:1124:1: (lv_numDist_7_0= ruleDistribution )
                    // InternalDmodel.g:1125:3: lv_numDist_7_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentVariableAccess().getNumDistDistributionParserRuleCall_2_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_numDist_7_0=ruleDistribution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExperimentVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"numDist",
                            		lv_numDist_7_0, 
                            		"datasemModeller.Dmodel.Distribution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDmodel.g:1142:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    {
                    // InternalDmodel.g:1142:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    // InternalDmodel.g:1142:7: ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) )
                    {
                    // InternalDmodel.g:1142:7: ( (lv_string_8_0= 'string' ) )
                    // InternalDmodel.g:1143:1: (lv_string_8_0= 'string' )
                    {
                    // InternalDmodel.g:1143:1: (lv_string_8_0= 'string' )
                    // InternalDmodel.g:1144:3: lv_string_8_0= 'string'
                    {
                    lv_string_8_0=(Token)match(input,62,FOLLOW_5); 

                            newLeafNode(lv_string_8_0, grammarAccess.getExperimentVariableAccess().getStringStringKeyword_2_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "string", true, "string");
                    	    

                    }


                    }

                    // InternalDmodel.g:1157:2: ( (lv_stringValue_9_0= RULE_STRING ) )
                    // InternalDmodel.g:1158:1: (lv_stringValue_9_0= RULE_STRING )
                    {
                    // InternalDmodel.g:1158:1: (lv_stringValue_9_0= RULE_STRING )
                    // InternalDmodel.g:1159:3: lv_stringValue_9_0= RULE_STRING
                    {
                    lv_stringValue_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_stringValue_9_0, grammarAccess.getExperimentVariableAccess().getStringValueSTRINGTerminalRuleCall_2_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringValue",
                            		lv_stringValue_9_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDmodel.g:1176:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    {
                    // InternalDmodel.g:1176:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    // InternalDmodel.g:1176:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    {
                    // InternalDmodel.g:1176:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) )
                    // InternalDmodel.g:1177:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    {
                    // InternalDmodel.g:1177:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    // InternalDmodel.g:1178:3: lv_strategy_10_0= 'GovernanceStrategy'
                    {
                    lv_strategy_10_0=(Token)match(input,63,FOLLOW_3); 

                            newLeafNode(lv_strategy_10_0, grammarAccess.getExperimentVariableAccess().getStrategyGovernanceStrategyKeyword_2_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "strategy", true, "GovernanceStrategy");
                    	    

                    }


                    }

                    // InternalDmodel.g:1191:2: ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    // InternalDmodel.g:1192:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    {
                    // InternalDmodel.g:1192:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    // InternalDmodel.g:1193:3: lv_strategyValue_11_0= ruleGovernanceStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentVariableAccess().getStrategyValueGovernanceStrategyParserRuleCall_2_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_strategyValue_11_0=ruleGovernanceStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExperimentVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"strategyValue",
                            		lv_strategyValue_11_0, 
                            		"datasemModeller.Dmodel.GovernanceStrategy");
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
    // InternalDmodel.g:1217:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // InternalDmodel.g:1218:2: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalDmodel.g:1219:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:1226:1: ruleDistribution returns [EObject current=null] : ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) ;
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
            // InternalDmodel.g:1229:28: ( ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) )
            // InternalDmodel.g:1230:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            {
            // InternalDmodel.g:1230:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            // InternalDmodel.g:1230:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']'
            {
            // InternalDmodel.g:1230:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt25=1;
                }
                break;
            case 65:
                {
                alt25=2;
                }
                break;
            case 66:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDmodel.g:1230:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    {
                    // InternalDmodel.g:1230:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    // InternalDmodel.g:1231:1: (lv_isNormal_0_0= 'Normal' )
                    {
                    // InternalDmodel.g:1231:1: (lv_isNormal_0_0= 'Normal' )
                    // InternalDmodel.g:1232:3: lv_isNormal_0_0= 'Normal'
                    {
                    lv_isNormal_0_0=(Token)match(input,64,FOLLOW_51); 

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
                    // InternalDmodel.g:1246:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    {
                    // InternalDmodel.g:1246:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    // InternalDmodel.g:1247:1: (lv_isUniform_1_0= 'Uniform' )
                    {
                    // InternalDmodel.g:1247:1: (lv_isUniform_1_0= 'Uniform' )
                    // InternalDmodel.g:1248:3: lv_isUniform_1_0= 'Uniform'
                    {
                    lv_isUniform_1_0=(Token)match(input,65,FOLLOW_51); 

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
                    // InternalDmodel.g:1262:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    {
                    // InternalDmodel.g:1262:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    // InternalDmodel.g:1263:1: (lv_isExponential_2_0= 'Exponential' )
                    {
                    // InternalDmodel.g:1263:1: (lv_isExponential_2_0= 'Exponential' )
                    // InternalDmodel.g:1264:3: lv_isExponential_2_0= 'Exponential'
                    {
                    lv_isExponential_2_0=(Token)match(input,66,FOLLOW_51); 

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

            otherlv_3=(Token)match(input,67,FOLLOW_52); 

                	newLeafNode(otherlv_3, grammarAccess.getDistributionAccess().getLeftSquareBracketKeyword_1());
                
            // InternalDmodel.g:1281:1: ( (lv_parameters_4_0= ruleParameter ) )
            // InternalDmodel.g:1282:1: (lv_parameters_4_0= ruleParameter )
            {
            // InternalDmodel.g:1282:1: (lv_parameters_4_0= ruleParameter )
            // InternalDmodel.g:1283:3: lv_parameters_4_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_53);
            lv_parameters_4_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_4_0, 
                    		"datasemModeller.Dmodel.Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDmodel.g:1299:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==68) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDmodel.g:1299:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,68,FOLLOW_52); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDistributionAccess().getCommaKeyword_3_0());
            	        
            	    // InternalDmodel.g:1303:1: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalDmodel.g:1304:1: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalDmodel.g:1304:1: (lv_parameters_6_0= ruleParameter )
            	    // InternalDmodel.g:1305:3: lv_parameters_6_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_53);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_6_0, 
            	            		"datasemModeller.Dmodel.Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_7=(Token)match(input,69,FOLLOW_2); 

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
    // InternalDmodel.g:1333:1: entryRuleWINReplication returns [EObject current=null] : iv_ruleWINReplication= ruleWINReplication EOF ;
    public final EObject entryRuleWINReplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWINReplication = null;


        try {
            // InternalDmodel.g:1334:2: (iv_ruleWINReplication= ruleWINReplication EOF )
            // InternalDmodel.g:1335:2: iv_ruleWINReplication= ruleWINReplication EOF
            {
             newCompositeNode(grammarAccess.getWINReplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWINReplication=ruleWINReplication();

            state._fsp--;

             current =iv_ruleWINReplication; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:1342:1: ruleWINReplication returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) ;
    public final EObject ruleWINReplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numReplications_3_0=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:1345:28: ( (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) )
            // InternalDmodel.g:1346:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            {
            // InternalDmodel.g:1346:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            // InternalDmodel.g:1346:3: otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getWINReplicationAccess().getWorkItemNetworkKeyword_0());
                
            // InternalDmodel.g:1350:1: ( (otherlv_1= RULE_ID ) )
            // InternalDmodel.g:1351:1: (otherlv_1= RULE_ID )
            {
            // InternalDmodel.g:1351:1: (otherlv_1= RULE_ID )
            // InternalDmodel.g:1352:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_54); 

            		newLeafNode(otherlv_1, grammarAccess.getWINReplicationAccess().getWorkItemNetworkWorkItemNetworkCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_45); 

                	newLeafNode(otherlv_2, grammarAccess.getWINReplicationAccess().getNumReplicationsKeyword_2());
                
            // InternalDmodel.g:1367:1: ( (lv_numReplications_3_0= RULE_INT ) )
            // InternalDmodel.g:1368:1: (lv_numReplications_3_0= RULE_INT )
            {
            // InternalDmodel.g:1368:1: (lv_numReplications_3_0= RULE_INT )
            // InternalDmodel.g:1369:3: lv_numReplications_3_0= RULE_INT
            {
            lv_numReplications_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_numReplications_3_0, grammarAccess.getWINReplicationAccess().getNumReplicationsINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"numReplications",
                    		lv_numReplications_3_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

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
    // InternalDmodel.g:1393:1: entryRuleGovernanceStrategy returns [EObject current=null] : iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF ;
    public final EObject entryRuleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceStrategy = null;


        try {
            // InternalDmodel.g:1394:2: (iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF )
            // InternalDmodel.g:1395:2: iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF
            {
             newCompositeNode(grammarAccess.getGovernanceStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGovernanceStrategy=ruleGovernanceStrategy();

            state._fsp--;

             current =iv_ruleGovernanceStrategy; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:1402:1: ruleGovernanceStrategy returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= '}' ) ;
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
        EObject lv_pullStrategy_7_0 = null;

        EObject lv_pushStrategy_12_0 = null;

        EObject lv_contractNetProtocal_17_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1405:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= '}' ) )
            // InternalDmodel.g:1406:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= '}' )
            {
            // InternalDmodel.g:1406:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= '}' )
            // InternalDmodel.g:1406:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) ) otherlv_18= '}'
            {
            // InternalDmodel.g:1406:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1407:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1407:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1408:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGovernanceStrategyAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,72,FOLLOW_47); 

                	newLeafNode(otherlv_1, grammarAccess.getGovernanceStrategyAccess().getTypeKeyword_1());
                
            otherlv_2=(Token)match(input,59,FOLLOW_56); 

                	newLeafNode(otherlv_2, grammarAccess.getGovernanceStrategyAccess().getColonKeyword_2());
                
            // InternalDmodel.g:1432:1: ( ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) ) | ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) ) | ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt30=1;
                }
                break;
            case 75:
                {
                alt30=2;
                }
                break;
            case 76:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalDmodel.g:1432:2: ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) )
                    {
                    // InternalDmodel.g:1432:2: ( ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) ) )
                    // InternalDmodel.g:1432:3: ( (lv_pull_3_0= 'Pull' ) ) otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_pullStrategy_7_0= rulePullStrategy ) )
                    {
                    // InternalDmodel.g:1432:3: ( (lv_pull_3_0= 'Pull' ) )
                    // InternalDmodel.g:1433:1: (lv_pull_3_0= 'Pull' )
                    {
                    // InternalDmodel.g:1433:1: (lv_pull_3_0= 'Pull' )
                    // InternalDmodel.g:1434:3: lv_pull_3_0= 'Pull'
                    {
                    lv_pull_3_0=(Token)match(input,73,FOLLOW_57); 

                            newLeafNode(lv_pull_3_0, grammarAccess.getGovernanceStrategyAccess().getPullPullKeyword_3_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(current, "pull", true, "Pull");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,74,FOLLOW_58); 

                        	newLeafNode(otherlv_4, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_3_0_1());
                        
                    // InternalDmodel.g:1451:1: (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==14) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalDmodel.g:1451:3: otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) )
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_5); 

                                	newLeafNode(otherlv_5, grammarAccess.getGovernanceStrategyAccess().getDescKeyword_3_0_2_0());
                                
                            // InternalDmodel.g:1455:1: ( (lv_description_6_0= RULE_STRING ) )
                            // InternalDmodel.g:1456:1: (lv_description_6_0= RULE_STRING )
                            {
                            // InternalDmodel.g:1456:1: (lv_description_6_0= RULE_STRING )
                            // InternalDmodel.g:1457:3: lv_description_6_0= RULE_STRING
                            {
                            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                            			newLeafNode(lv_description_6_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_3_0_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_6_0, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // InternalDmodel.g:1473:4: ( (lv_pullStrategy_7_0= rulePullStrategy ) )
                    // InternalDmodel.g:1474:1: (lv_pullStrategy_7_0= rulePullStrategy )
                    {
                    // InternalDmodel.g:1474:1: (lv_pullStrategy_7_0= rulePullStrategy )
                    // InternalDmodel.g:1475:3: lv_pullStrategy_7_0= rulePullStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPullStrategyPullStrategyParserRuleCall_3_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_59);
                    lv_pullStrategy_7_0=rulePullStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"pullStrategy",
                            		lv_pullStrategy_7_0, 
                            		"datasemModeller.Dmodel.PullStrategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:1492:6: ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) )
                    {
                    // InternalDmodel.g:1492:6: ( ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) ) )
                    // InternalDmodel.g:1492:7: ( (lv_push_8_0= 'Push' ) ) otherlv_9= '{' (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_pushStrategy_12_0= rulePushStrategy ) )
                    {
                    // InternalDmodel.g:1492:7: ( (lv_push_8_0= 'Push' ) )
                    // InternalDmodel.g:1493:1: (lv_push_8_0= 'Push' )
                    {
                    // InternalDmodel.g:1493:1: (lv_push_8_0= 'Push' )
                    // InternalDmodel.g:1494:3: lv_push_8_0= 'Push'
                    {
                    lv_push_8_0=(Token)match(input,75,FOLLOW_57); 

                            newLeafNode(lv_push_8_0, grammarAccess.getGovernanceStrategyAccess().getPushPushKeyword_3_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(current, "push", true, "Push");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,74,FOLLOW_58); 

                        	newLeafNode(otherlv_9, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_3_1_1());
                        
                    // InternalDmodel.g:1511:1: (otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==14) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalDmodel.g:1511:3: otherlv_10= 'desc' ( (lv_description_11_0= RULE_STRING ) )
                            {
                            otherlv_10=(Token)match(input,14,FOLLOW_5); 

                                	newLeafNode(otherlv_10, grammarAccess.getGovernanceStrategyAccess().getDescKeyword_3_1_2_0());
                                
                            // InternalDmodel.g:1515:1: ( (lv_description_11_0= RULE_STRING ) )
                            // InternalDmodel.g:1516:1: (lv_description_11_0= RULE_STRING )
                            {
                            // InternalDmodel.g:1516:1: (lv_description_11_0= RULE_STRING )
                            // InternalDmodel.g:1517:3: lv_description_11_0= RULE_STRING
                            {
                            lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                            			newLeafNode(lv_description_11_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_11_0, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // InternalDmodel.g:1533:4: ( (lv_pushStrategy_12_0= rulePushStrategy ) )
                    // InternalDmodel.g:1534:1: (lv_pushStrategy_12_0= rulePushStrategy )
                    {
                    // InternalDmodel.g:1534:1: (lv_pushStrategy_12_0= rulePushStrategy )
                    // InternalDmodel.g:1535:3: lv_pushStrategy_12_0= rulePushStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPushStrategyPushStrategyParserRuleCall_3_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_59);
                    lv_pushStrategy_12_0=rulePushStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"pushStrategy",
                            		lv_pushStrategy_12_0, 
                            		"datasemModeller.Dmodel.PushStrategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDmodel.g:1552:6: ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) )
                    {
                    // InternalDmodel.g:1552:6: ( ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) ) )
                    // InternalDmodel.g:1552:7: ( (lv_cnp_13_0= 'CNP' ) ) otherlv_14= '{' (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )? ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) )
                    {
                    // InternalDmodel.g:1552:7: ( (lv_cnp_13_0= 'CNP' ) )
                    // InternalDmodel.g:1553:1: (lv_cnp_13_0= 'CNP' )
                    {
                    // InternalDmodel.g:1553:1: (lv_cnp_13_0= 'CNP' )
                    // InternalDmodel.g:1554:3: lv_cnp_13_0= 'CNP'
                    {
                    lv_cnp_13_0=(Token)match(input,76,FOLLOW_57); 

                            newLeafNode(lv_cnp_13_0, grammarAccess.getGovernanceStrategyAccess().getCnpCNPKeyword_3_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(current, "cnp", true, "CNP");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,74,FOLLOW_58); 

                        	newLeafNode(otherlv_14, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_3_2_1());
                        
                    // InternalDmodel.g:1571:1: (otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==14) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalDmodel.g:1571:3: otherlv_15= 'desc' ( (lv_description_16_0= RULE_STRING ) )
                            {
                            otherlv_15=(Token)match(input,14,FOLLOW_5); 

                                	newLeafNode(otherlv_15, grammarAccess.getGovernanceStrategyAccess().getDescKeyword_3_2_2_0());
                                
                            // InternalDmodel.g:1575:1: ( (lv_description_16_0= RULE_STRING ) )
                            // InternalDmodel.g:1576:1: (lv_description_16_0= RULE_STRING )
                            {
                            // InternalDmodel.g:1576:1: (lv_description_16_0= RULE_STRING )
                            // InternalDmodel.g:1577:3: lv_description_16_0= RULE_STRING
                            {
                            lv_description_16_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                            			newLeafNode(lv_description_16_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_3_2_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_16_0, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // InternalDmodel.g:1593:4: ( (lv_contractNetProtocal_17_0= ruleContractNetProtocol ) )
                    // InternalDmodel.g:1594:1: (lv_contractNetProtocal_17_0= ruleContractNetProtocol )
                    {
                    // InternalDmodel.g:1594:1: (lv_contractNetProtocal_17_0= ruleContractNetProtocol )
                    // InternalDmodel.g:1595:3: lv_contractNetProtocal_17_0= ruleContractNetProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getContractNetProtocalContractNetProtocolParserRuleCall_3_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_59);
                    lv_contractNetProtocal_17_0=ruleContractNetProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"contractNetProtocal",
                            		lv_contractNetProtocal_17_0, 
                            		"datasemModeller.Dmodel.ContractNetProtocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,77,FOLLOW_2); 

                	newLeafNode(otherlv_18, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // InternalDmodel.g:1623:1: entryRuleContractNetProtocol returns [EObject current=null] : iv_ruleContractNetProtocol= ruleContractNetProtocol EOF ;
    public final EObject entryRuleContractNetProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractNetProtocol = null;


        try {
            // InternalDmodel.g:1624:2: (iv_ruleContractNetProtocol= ruleContractNetProtocol EOF )
            // InternalDmodel.g:1625:2: iv_ruleContractNetProtocol= ruleContractNetProtocol EOF
            {
             newCompositeNode(grammarAccess.getContractNetProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContractNetProtocol=ruleContractNetProtocol();

            state._fsp--;

             current =iv_ruleContractNetProtocol; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:1632:1: ruleContractNetProtocol returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}' ) ;
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
            // InternalDmodel.g:1635:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}' ) )
            // InternalDmodel.g:1636:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}' )
            {
            // InternalDmodel.g:1636:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}' )
            // InternalDmodel.g:1636:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'roleBehaviors' otherlv_6= '{' ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_57); 

                	newLeafNode(otherlv_0, grammarAccess.getContractNetProtocolAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,74,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getContractNetProtocolAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:1644:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
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
            	    // InternalDmodel.g:1645:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // InternalDmodel.g:1645:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // InternalDmodel.g:1646:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractNetProtocolAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_60);
            	    lv_mechanisms_2_0=ruleMechanism();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mechanisms",
            	            		lv_mechanisms_2_0, 
            	            		"datasemModeller.Dmodel.Mechanism");
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

            otherlv_3=(Token)match(input,77,FOLLOW_61); 

                	newLeafNode(otherlv_3, grammarAccess.getContractNetProtocolAccess().getRightCurlyBracketKeyword_3());
                
            // InternalDmodel.g:1666:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==60||LA32_0==62||(LA32_0>=108 && LA32_0<=116)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDmodel.g:1667:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // InternalDmodel.g:1667:1: (lv_variables_4_0= ruleVariable )
            	    // InternalDmodel.g:1668:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractNetProtocolAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_61);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_4_0, 
            	            		"datasemModeller.Dmodel.Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,79,FOLLOW_57); 

                	newLeafNode(otherlv_5, grammarAccess.getContractNetProtocolAccess().getRoleBehaviorsKeyword_5());
                
            otherlv_6=(Token)match(input,74,FOLLOW_62); 

                	newLeafNode(otherlv_6, grammarAccess.getContractNetProtocolAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalDmodel.g:1692:1: ( (lv_roleBehaviors_7_0= ruleRoleBehavior ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==80) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDmodel.g:1693:1: (lv_roleBehaviors_7_0= ruleRoleBehavior )
            	    {
            	    // InternalDmodel.g:1693:1: (lv_roleBehaviors_7_0= ruleRoleBehavior )
            	    // InternalDmodel.g:1694:3: lv_roleBehaviors_7_0= ruleRoleBehavior
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractNetProtocolAccess().getRoleBehaviorsRoleBehaviorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_63);
            	    lv_roleBehaviors_7_0=ruleRoleBehavior();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roleBehaviors",
            	            		lv_roleBehaviors_7_0, 
            	            		"datasemModeller.Dmodel.RoleBehavior");
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

            otherlv_8=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:1722:1: entryRuleRoleBehavior returns [EObject current=null] : iv_ruleRoleBehavior= ruleRoleBehavior EOF ;
    public final EObject entryRuleRoleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleBehavior = null;


        try {
            // InternalDmodel.g:1723:2: (iv_ruleRoleBehavior= ruleRoleBehavior EOF )
            // InternalDmodel.g:1724:2: iv_ruleRoleBehavior= ruleRoleBehavior EOF
            {
             newCompositeNode(grammarAccess.getRoleBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleBehavior=ruleRoleBehavior();

            state._fsp--;

             current =iv_ruleRoleBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:1731:1: ruleRoleBehavior returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' ) ;
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
            // InternalDmodel.g:1734:28: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' ) )
            // InternalDmodel.g:1735:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' )
            {
            // InternalDmodel.g:1735:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}' )
            // InternalDmodel.g:1735:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleBehaviorAccess().getRoleKeyword_0());
                
            // InternalDmodel.g:1739:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:1740:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:1740:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:1741:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleBehaviorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleBehaviorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_64); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleBehaviorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,81,FOLLOW_57); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleBehaviorAccess().getActionsKeyword_3());
                
            otherlv_4=(Token)match(input,74,FOLLOW_65); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleBehaviorAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalDmodel.g:1769:1: ( (lv_actions_5_0= ruleAction ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==118) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDmodel.g:1770:1: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalDmodel.g:1770:1: (lv_actions_5_0= ruleAction )
            	    // InternalDmodel.g:1771:3: lv_actions_5_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleBehaviorAccess().getActionsActionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_65);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleBehaviorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_5_0, 
            	            		"datasemModeller.Dmodel.Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_6=(Token)match(input,77,FOLLOW_66); 

                	newLeafNode(otherlv_6, grammarAccess.getRoleBehaviorAccess().getRightCurlyBracketKeyword_6());
                
            // InternalDmodel.g:1791:1: ( (lv_states_7_0= ruleState ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=121 && LA35_0<=122)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDmodel.g:1792:1: (lv_states_7_0= ruleState )
            	    {
            	    // InternalDmodel.g:1792:1: (lv_states_7_0= ruleState )
            	    // InternalDmodel.g:1793:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleBehaviorAccess().getStatesStateParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_67);
            	    lv_states_7_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleBehaviorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_7_0, 
            	            		"datasemModeller.Dmodel.State");
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

            otherlv_8=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:1821:1: entryRuleProcessModel returns [EObject current=null] : iv_ruleProcessModel= ruleProcessModel EOF ;
    public final EObject entryRuleProcessModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessModel = null;


        try {
            // InternalDmodel.g:1822:2: (iv_ruleProcessModel= ruleProcessModel EOF )
            // InternalDmodel.g:1823:2: iv_ruleProcessModel= ruleProcessModel EOF
            {
             newCompositeNode(grammarAccess.getProcessModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessModel=ruleProcessModel();

            state._fsp--;

             current =iv_ruleProcessModel; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:1830:1: ruleProcessModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'mechanisms' otherlv_5= '{' ( (lv_mechanisms_6_0= ruleMechanism ) )+ otherlv_7= '}' )? (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleAction ) )* otherlv_11= '}' ( (lv_states_12_0= ruleState ) )+ )? otherlv_13= '}' ) ) ;
    public final EObject ruleProcessModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_mechanisms_6_0 = null;

        EObject lv_actions_10_0 = null;

        EObject lv_states_12_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1833:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'mechanisms' otherlv_5= '{' ( (lv_mechanisms_6_0= ruleMechanism ) )+ otherlv_7= '}' )? (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleAction ) )* otherlv_11= '}' ( (lv_states_12_0= ruleState ) )+ )? otherlv_13= '}' ) ) )
            // InternalDmodel.g:1834:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'mechanisms' otherlv_5= '{' ( (lv_mechanisms_6_0= ruleMechanism ) )+ otherlv_7= '}' )? (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleAction ) )* otherlv_11= '}' ( (lv_states_12_0= ruleState ) )+ )? otherlv_13= '}' ) )
            {
            // InternalDmodel.g:1834:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'mechanisms' otherlv_5= '{' ( (lv_mechanisms_6_0= ruleMechanism ) )+ otherlv_7= '}' )? (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleAction ) )* otherlv_11= '}' ( (lv_states_12_0= ruleState ) )+ )? otherlv_13= '}' ) )
            // InternalDmodel.g:1834:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'mechanisms' otherlv_5= '{' ( (lv_mechanisms_6_0= ruleMechanism ) )+ otherlv_7= '}' )? (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleAction ) )* otherlv_11= '}' ( (lv_states_12_0= ruleState ) )+ )? otherlv_13= '}' )
            {
            // InternalDmodel.g:1834:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1835:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1835:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1836:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            			newLeafNode(lv_name_0_0, grammarAccess.getProcessModelAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDmodel.g:1852:2: (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'mechanisms' otherlv_5= '{' ( (lv_mechanisms_6_0= ruleMechanism ) )+ otherlv_7= '}' )? (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleAction ) )* otherlv_11= '}' ( (lv_states_12_0= ruleState ) )+ )? otherlv_13= '}' )
            // InternalDmodel.g:1852:4: otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'mechanisms' otherlv_5= '{' ( (lv_mechanisms_6_0= ruleMechanism ) )+ otherlv_7= '}' )? (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleAction ) )* otherlv_11= '}' ( (lv_states_12_0= ruleState ) )+ )? otherlv_13= '}'
            {
            otherlv_1=(Token)match(input,74,FOLLOW_68); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_1_0());
                
            // InternalDmodel.g:1856:1: (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDmodel.g:1856:3: otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getProcessModelAccess().getDescKeyword_1_1_0());
                        
                    // InternalDmodel.g:1860:1: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalDmodel.g:1861:1: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalDmodel.g:1861:1: (lv_description_3_0= RULE_STRING )
                    // InternalDmodel.g:1862:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getProcessModelAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcessModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:1878:4: (otherlv_4= 'mechanisms' otherlv_5= '{' ( (lv_mechanisms_6_0= ruleMechanism ) )+ otherlv_7= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==78) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDmodel.g:1878:6: otherlv_4= 'mechanisms' otherlv_5= '{' ( (lv_mechanisms_6_0= ruleMechanism ) )+ otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,78,FOLLOW_57); 

                        	newLeafNode(otherlv_4, grammarAccess.getProcessModelAccess().getMechanismsKeyword_1_2_0());
                        
                    otherlv_5=(Token)match(input,74,FOLLOW_3); 

                        	newLeafNode(otherlv_5, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_1_2_1());
                        
                    // InternalDmodel.g:1886:1: ( (lv_mechanisms_6_0= ruleMechanism ) )+
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
                    	    // InternalDmodel.g:1887:1: (lv_mechanisms_6_0= ruleMechanism )
                    	    {
                    	    // InternalDmodel.g:1887:1: (lv_mechanisms_6_0= ruleMechanism )
                    	    // InternalDmodel.g:1888:3: lv_mechanisms_6_0= ruleMechanism
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessModelAccess().getMechanismsMechanismParserRuleCall_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_60);
                    	    lv_mechanisms_6_0=ruleMechanism();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"mechanisms",
                    	            		lv_mechanisms_6_0, 
                    	            		"datasemModeller.Dmodel.Mechanism");
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

                    otherlv_7=(Token)match(input,77,FOLLOW_70); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcessModelAccess().getRightCurlyBracketKeyword_1_2_3());
                        

                    }
                    break;

            }

            // InternalDmodel.g:1908:3: (otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleAction ) )* otherlv_11= '}' ( (lv_states_12_0= ruleState ) )+ )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==81) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDmodel.g:1908:5: otherlv_8= 'actions' otherlv_9= '{' ( (lv_actions_10_0= ruleAction ) )* otherlv_11= '}' ( (lv_states_12_0= ruleState ) )+
                    {
                    otherlv_8=(Token)match(input,81,FOLLOW_57); 

                        	newLeafNode(otherlv_8, grammarAccess.getProcessModelAccess().getActionsKeyword_1_3_0());
                        
                    otherlv_9=(Token)match(input,74,FOLLOW_65); 

                        	newLeafNode(otherlv_9, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_1_3_1());
                        
                    // InternalDmodel.g:1916:1: ( (lv_actions_10_0= ruleAction ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==118) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalDmodel.g:1917:1: (lv_actions_10_0= ruleAction )
                    	    {
                    	    // InternalDmodel.g:1917:1: (lv_actions_10_0= ruleAction )
                    	    // InternalDmodel.g:1918:3: lv_actions_10_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessModelAccess().getActionsActionParserRuleCall_1_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_65);
                    	    lv_actions_10_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_10_0, 
                    	            		"datasemModeller.Dmodel.Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,77,FOLLOW_66); 

                        	newLeafNode(otherlv_11, grammarAccess.getProcessModelAccess().getRightCurlyBracketKeyword_1_3_3());
                        
                    // InternalDmodel.g:1938:1: ( (lv_states_12_0= ruleState ) )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=121 && LA40_0<=122)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalDmodel.g:1939:1: (lv_states_12_0= ruleState )
                    	    {
                    	    // InternalDmodel.g:1939:1: (lv_states_12_0= ruleState )
                    	    // InternalDmodel.g:1940:3: lv_states_12_0= ruleState
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessModelAccess().getStatesStateParserRuleCall_1_3_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_67);
                    	    lv_states_12_0=ruleState();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"states",
                    	            		lv_states_12_0, 
                    	            		"datasemModeller.Dmodel.State");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,77,FOLLOW_2); 

                	newLeafNode(otherlv_13, grammarAccess.getProcessModelAccess().getRightCurlyBracketKeyword_1_4());
                

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


    // $ANTLR start "entryRulePullStrategy"
    // InternalDmodel.g:1968:1: entryRulePullStrategy returns [EObject current=null] : iv_rulePullStrategy= rulePullStrategy EOF ;
    public final EObject entryRulePullStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePullStrategy = null;


        try {
            // InternalDmodel.g:1969:2: (iv_rulePullStrategy= rulePullStrategy EOF )
            // InternalDmodel.g:1970:2: iv_rulePullStrategy= rulePullStrategy EOF
            {
             newCompositeNode(grammarAccess.getPullStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePullStrategy=rulePullStrategy();

            state._fsp--;

             current =iv_rulePullStrategy; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:1977:1: rulePullStrategy returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) ;
    public final EObject rulePullStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mechanisms_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1980:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) )
            // InternalDmodel.g:1981:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            {
            // InternalDmodel.g:1981:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            // InternalDmodel.g:1981:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_57); 

                	newLeafNode(otherlv_0, grammarAccess.getPullStrategyAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,74,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getPullStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:1989:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
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
            	    // InternalDmodel.g:1990:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // InternalDmodel.g:1990:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // InternalDmodel.g:1991:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPullStrategyAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_60);
            	    lv_mechanisms_2_0=ruleMechanism();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPullStrategyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mechanisms",
            	            		lv_mechanisms_2_0, 
            	            		"datasemModeller.Dmodel.Mechanism");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_3=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:2019:1: entryRulePushStrategy returns [EObject current=null] : iv_rulePushStrategy= rulePushStrategy EOF ;
    public final EObject entryRulePushStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePushStrategy = null;


        try {
            // InternalDmodel.g:2020:2: (iv_rulePushStrategy= rulePushStrategy EOF )
            // InternalDmodel.g:2021:2: iv_rulePushStrategy= rulePushStrategy EOF
            {
             newCompositeNode(grammarAccess.getPushStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePushStrategy=rulePushStrategy();

            state._fsp--;

             current =iv_rulePushStrategy; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:2028:1: rulePushStrategy returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) ;
    public final EObject rulePushStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mechanisms_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:2031:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) )
            // InternalDmodel.g:2032:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            {
            // InternalDmodel.g:2032:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            // InternalDmodel.g:2032:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_57); 

                	newLeafNode(otherlv_0, grammarAccess.getPushStrategyAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,74,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getPushStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:2040:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDmodel.g:2041:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // InternalDmodel.g:2041:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // InternalDmodel.g:2042:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPushStrategyAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_60);
            	    lv_mechanisms_2_0=ruleMechanism();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPushStrategyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mechanisms",
            	            		lv_mechanisms_2_0, 
            	            		"datasemModeller.Dmodel.Mechanism");
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

            otherlv_3=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:2070:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // InternalDmodel.g:2071:2: (iv_ruleMechanism= ruleMechanism EOF )
            // InternalDmodel.g:2072:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:2079:1: ruleMechanism returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_attributes_10_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:2082:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? ) )
            // InternalDmodel.g:2083:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            {
            // InternalDmodel.g:2083:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )? )
            // InternalDmodel.g:2083:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            {
            // InternalDmodel.g:2083:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2084:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2084:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2085:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMechanismAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMechanismRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,82,FOLLOW_52); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAccess().getEqualsSignKeyword_1());
                
            // InternalDmodel.g:2105:1: ( (lv_value_2_0= ruleParameter ) )
            // InternalDmodel.g:2106:1: (lv_value_2_0= ruleParameter )
            {
            // InternalDmodel.g:2106:1: (lv_value_2_0= ruleParameter )
            // InternalDmodel.g:2107:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_72);
            lv_value_2_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMechanismRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"datasemModeller.Dmodel.Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDmodel.g:2123:2: (otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==74) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDmodel.g:2123:4: otherlv_3= '{' (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )* otherlv_11= '}' )? otherlv_12= '}'
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_73); 

                        	newLeafNode(otherlv_3, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalDmodel.g:2127:1: (otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==14) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalDmodel.g:2127:3: otherlv_4= 'desc' ( (lv_description_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_5); 

                                	newLeafNode(otherlv_4, grammarAccess.getMechanismAccess().getDescKeyword_3_1_0());
                                
                            // InternalDmodel.g:2131:1: ( (lv_description_5_0= RULE_STRING ) )
                            // InternalDmodel.g:2132:1: (lv_description_5_0= RULE_STRING )
                            {
                            // InternalDmodel.g:2132:1: (lv_description_5_0= RULE_STRING )
                            // InternalDmodel.g:2133:3: lv_description_5_0= RULE_STRING
                            {
                            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_74); 

                            			newLeafNode(lv_description_5_0, grammarAccess.getMechanismAccess().getDescriptionSTRINGTerminalRuleCall_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMechanismRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_5_0, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // InternalDmodel.g:2149:4: (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )* otherlv_11= '}' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==83) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalDmodel.g:2149:6: otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )* otherlv_11= '}'
                            {
                            otherlv_6=(Token)match(input,83,FOLLOW_57); 

                                	newLeafNode(otherlv_6, grammarAccess.getMechanismAccess().getAttributesKeyword_3_2_0());
                                
                            otherlv_7=(Token)match(input,74,FOLLOW_3); 

                                	newLeafNode(otherlv_7, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_3_2_1());
                                
                            // InternalDmodel.g:2157:1: ( (lv_attributes_8_0= ruleMechanismAttribute ) )
                            // InternalDmodel.g:2158:1: (lv_attributes_8_0= ruleMechanismAttribute )
                            {
                            // InternalDmodel.g:2158:1: (lv_attributes_8_0= ruleMechanismAttribute )
                            // InternalDmodel.g:2159:3: lv_attributes_8_0= ruleMechanismAttribute
                            {
                             
                            	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_3_2_2_0()); 
                            	    
                            pushFollow(FOLLOW_75);
                            lv_attributes_8_0=ruleMechanismAttribute();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getMechanismRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"attributes",
                                    		lv_attributes_8_0, 
                                    		"datasemModeller.Dmodel.MechanismAttribute");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalDmodel.g:2175:2: (otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==68) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalDmodel.g:2175:4: otherlv_9= ',' ( (lv_attributes_10_0= ruleMechanismAttribute ) )
                            	    {
                            	    otherlv_9=(Token)match(input,68,FOLLOW_3); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getMechanismAccess().getCommaKeyword_3_2_3_0());
                            	        
                            	    // InternalDmodel.g:2179:1: ( (lv_attributes_10_0= ruleMechanismAttribute ) )
                            	    // InternalDmodel.g:2180:1: (lv_attributes_10_0= ruleMechanismAttribute )
                            	    {
                            	    // InternalDmodel.g:2180:1: (lv_attributes_10_0= ruleMechanismAttribute )
                            	    // InternalDmodel.g:2181:3: lv_attributes_10_0= ruleMechanismAttribute
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_3_2_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_75);
                            	    lv_attributes_10_0=ruleMechanismAttribute();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getMechanismRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"attributes",
                            	            		lv_attributes_10_0, 
                            	            		"datasemModeller.Dmodel.MechanismAttribute");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,77,FOLLOW_59); 

                                	newLeafNode(otherlv_11, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_3_2_4());
                                

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,77,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_3_3());
                        

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
    // $ANTLR end "ruleMechanism"


    // $ANTLR start "entryRuleMechanismAttribute"
    // InternalDmodel.g:2213:1: entryRuleMechanismAttribute returns [EObject current=null] : iv_ruleMechanismAttribute= ruleMechanismAttribute EOF ;
    public final EObject entryRuleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanismAttribute = null;


        try {
            // InternalDmodel.g:2214:2: (iv_ruleMechanismAttribute= ruleMechanismAttribute EOF )
            // InternalDmodel.g:2215:2: iv_ruleMechanismAttribute= ruleMechanismAttribute EOF
            {
             newCompositeNode(grammarAccess.getMechanismAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMechanismAttribute=ruleMechanismAttribute();

            state._fsp--;

             current =iv_ruleMechanismAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:2222:1: ruleMechanismAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:2225:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // InternalDmodel.g:2226:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // InternalDmodel.g:2226:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // InternalDmodel.g:2226:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // InternalDmodel.g:2226:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2227:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2227:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2228:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMechanismAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMechanismAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,82,FOLLOW_52); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAttributeAccess().getEqualsSignKeyword_1());
                
            // InternalDmodel.g:2248:1: ( (lv_value_2_0= ruleParameter ) )
            // InternalDmodel.g:2249:1: (lv_value_2_0= ruleParameter )
            {
            // InternalDmodel.g:2249:1: (lv_value_2_0= ruleParameter )
            // InternalDmodel.g:2250:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAttributeAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMechanismAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"datasemModeller.Dmodel.Parameter");
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
    // InternalDmodel.g:2274:1: entryRuleWorkSource returns [EObject current=null] : iv_ruleWorkSource= ruleWorkSource EOF ;
    public final EObject entryRuleWorkSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSource = null;


        try {
            // InternalDmodel.g:2275:2: (iv_ruleWorkSource= ruleWorkSource EOF )
            // InternalDmodel.g:2276:2: iv_ruleWorkSource= ruleWorkSource EOF
            {
             newCompositeNode(grammarAccess.getWorkSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:2283:1: ruleWorkSource returns [EObject current=null] : (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:2286:28: ( (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDmodel.g:2287:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDmodel.g:2287:1: (otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDmodel.g:2287:3: otherlv_0= 'WorkSource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_0());
                
            // InternalDmodel.g:2291:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:2292:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:2292:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:2293:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkSourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkSourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_76); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:2313:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==14) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDmodel.g:2313:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getDescKeyword_3_0());
                        
                    // InternalDmodel.g:2317:1: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalDmodel.g:2318:1: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalDmodel.g:2318:1: (lv_description_4_0= RULE_STRING )
                    // InternalDmodel.g:2319:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_77); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWorkSourceAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:2335:4: (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==85) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDmodel.g:2335:6: otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,85,FOLLOW_57); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkSourceAccess().getAssignToKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,74,FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // InternalDmodel.g:2343:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDmodel.g:2344:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDmodel.g:2344:1: (otherlv_7= RULE_ID )
                    // InternalDmodel.g:2345:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_75); 

                    		newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getAssignToServiceProviderCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // InternalDmodel.g:2356:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==68) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalDmodel.g:2356:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,68,FOLLOW_3); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalDmodel.g:2360:1: ( (otherlv_9= RULE_ID ) )
                    	    // InternalDmodel.g:2361:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalDmodel.g:2361:1: (otherlv_9= RULE_ID )
                    	    // InternalDmodel.g:2362:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_75); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getWorkSourceAccess().getAssignToServiceProviderCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,77,FOLLOW_59); 

                        	newLeafNode(otherlv_10, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,77,FOLLOW_2); 

                	newLeafNode(otherlv_11, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // InternalDmodel.g:2389:1: entryRuleWorkItemNetwork returns [EObject current=null] : iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF ;
    public final EObject entryRuleWorkItemNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemNetwork = null;


        try {
            // InternalDmodel.g:2390:2: (iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF )
            // InternalDmodel.g:2391:2: iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF
            {
             newCompositeNode(grammarAccess.getWorkItemNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkItemNetwork=ruleWorkItemNetwork();

            state._fsp--;

             current =iv_ruleWorkItemNetwork; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:2398:1: ruleWorkItemNetwork returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) ;
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
            // InternalDmodel.g:2401:28: ( (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) )
            // InternalDmodel.g:2402:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:2402:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            // InternalDmodel.g:2402:3: otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'WorkItems' otherlv_6= '{' ( (lv_workItems_7_0= ruleWorkItem ) )+ otherlv_8= '}' otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemNetworkAccess().getWorkItemNetworkKeyword_0());
                
            // InternalDmodel.g:2406:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:2407:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:2407:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:2408:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkItemNetworkAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_78); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:2428:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==14) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDmodel.g:2428:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemNetworkAccess().getDescKeyword_3_0());
                        
                    // InternalDmodel.g:2432:1: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalDmodel.g:2433:1: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalDmodel.g:2433:1: (lv_description_4_0= RULE_STRING )
                    // InternalDmodel.g:2434:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWorkItemNetworkAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,86,FOLLOW_57); 

                	newLeafNode(otherlv_5, grammarAccess.getWorkItemNetworkAccess().getWorkItemsKeyword_4());
                
            otherlv_6=(Token)match(input,74,FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalDmodel.g:2458:1: ( (lv_workItems_7_0= ruleWorkItem ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalDmodel.g:2459:1: (lv_workItems_7_0= ruleWorkItem )
            	    {
            	    // InternalDmodel.g:2459:1: (lv_workItems_7_0= ruleWorkItem )
            	    // InternalDmodel.g:2460:3: lv_workItems_7_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkItemNetworkAccess().getWorkItemsWorkItemParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_60);
            	    lv_workItems_7_0=ruleWorkItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkItemNetworkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"workItems",
            	            		lv_workItems_7_0, 
            	            		"datasemModeller.Dmodel.WorkItem");
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

            otherlv_8=(Token)match(input,77,FOLLOW_59); 

                	newLeafNode(otherlv_8, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,77,FOLLOW_80); 

                	newLeafNode(otherlv_9, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_8());
                
            // InternalDmodel.g:2484:1: ( (lv_id_10_0= RULE_INT ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDmodel.g:2485:1: (lv_id_10_0= RULE_INT )
                    {
                    // InternalDmodel.g:2485:1: (lv_id_10_0= RULE_INT )
                    // InternalDmodel.g:2486:3: lv_id_10_0= RULE_INT
                    {
                    lv_id_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_10_0, grammarAccess.getWorkItemNetworkAccess().getIdINTTerminalRuleCall_9_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_10_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

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
    // InternalDmodel.g:2510:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // InternalDmodel.g:2511:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // InternalDmodel.g:2512:2: iv_ruleWorkItem= ruleWorkItem EOF
            {
             newCompositeNode(grammarAccess.getWorkItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:2519:1: ruleWorkItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? )? | ( ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )? (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )? otherlv_33= 'efforts' otherlv_34= '{' ( (lv_requiredServices_35_0= ruleRequiredService ) ) (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )* otherlv_38= '}' ) ) (otherlv_39= 'maturityLevels' ( (lv_maturityLevels_40_0= ruleAbstractParameter ) ) )? (otherlv_41= 'uncertainty' ( (lv_uncertainty_42_0= ruleAbstractParameter ) ) )? (otherlv_43= 'risk' ( (lv_risk_44_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_45_0= 'impacts' ) ) otherlv_46= '{' ( (lv_impacts_47_0= ruleImpact ) ) (otherlv_48= ',' ( (lv_impacts_49_0= ruleImpact ) ) )* otherlv_50= '}' )? (otherlv_51= 'value' ( (lv_value_52_0= ruleNumExpression ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrival' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'duration' ( (lv_duration_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )? ) ;
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
        Token lv_hasDecompositionMechanism_25_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token lv_hasImpacts_45_0=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token lv_arrivalTime_56_0=null;
        Token otherlv_57=null;
        Token lv_duration_58_0=null;
        Token otherlv_59=null;
        Token lv_id_60_0=null;
        EObject lv_requiredAnalysis_21_0 = null;

        EObject lv_requiredAnalysis_23_0 = null;

        EObject lv_decompositionMechanism_26_0 = null;

        EObject lv_requiredAnalysis_29_0 = null;

        EObject lv_requiredAnalysis_31_0 = null;

        EObject lv_requiredServices_35_0 = null;

        EObject lv_requiredServices_37_0 = null;

        EObject lv_maturityLevels_40_0 = null;

        EObject lv_uncertainty_42_0 = null;

        EObject lv_risk_44_0 = null;

        EObject lv_impacts_47_0 = null;

        EObject lv_impacts_49_0 = null;

        EObject lv_value_52_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:2522:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? )? | ( ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )? (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )? otherlv_33= 'efforts' otherlv_34= '{' ( (lv_requiredServices_35_0= ruleRequiredService ) ) (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )* otherlv_38= '}' ) ) (otherlv_39= 'maturityLevels' ( (lv_maturityLevels_40_0= ruleAbstractParameter ) ) )? (otherlv_41= 'uncertainty' ( (lv_uncertainty_42_0= ruleAbstractParameter ) ) )? (otherlv_43= 'risk' ( (lv_risk_44_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_45_0= 'impacts' ) ) otherlv_46= '{' ( (lv_impacts_47_0= ruleImpact ) ) (otherlv_48= ',' ( (lv_impacts_49_0= ruleImpact ) ) )* otherlv_50= '}' )? (otherlv_51= 'value' ( (lv_value_52_0= ruleNumExpression ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrival' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'duration' ( (lv_duration_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )? ) )
            // InternalDmodel.g:2523:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? )? | ( ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )? (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )? otherlv_33= 'efforts' otherlv_34= '{' ( (lv_requiredServices_35_0= ruleRequiredService ) ) (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )* otherlv_38= '}' ) ) (otherlv_39= 'maturityLevels' ( (lv_maturityLevels_40_0= ruleAbstractParameter ) ) )? (otherlv_41= 'uncertainty' ( (lv_uncertainty_42_0= ruleAbstractParameter ) ) )? (otherlv_43= 'risk' ( (lv_risk_44_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_45_0= 'impacts' ) ) otherlv_46= '{' ( (lv_impacts_47_0= ruleImpact ) ) (otherlv_48= ',' ( (lv_impacts_49_0= ruleImpact ) ) )* otherlv_50= '}' )? (otherlv_51= 'value' ( (lv_value_52_0= ruleNumExpression ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrival' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'duration' ( (lv_duration_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:2523:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? )? | ( ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )? (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )? otherlv_33= 'efforts' otherlv_34= '{' ( (lv_requiredServices_35_0= ruleRequiredService ) ) (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )* otherlv_38= '}' ) ) (otherlv_39= 'maturityLevels' ( (lv_maturityLevels_40_0= ruleAbstractParameter ) ) )? (otherlv_41= 'uncertainty' ( (lv_uncertainty_42_0= ruleAbstractParameter ) ) )? (otherlv_43= 'risk' ( (lv_risk_44_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_45_0= 'impacts' ) ) otherlv_46= '{' ( (lv_impacts_47_0= ruleImpact ) ) (otherlv_48= ',' ( (lv_impacts_49_0= ruleImpact ) ) )* otherlv_50= '}' )? (otherlv_51= 'value' ( (lv_value_52_0= ruleNumExpression ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrival' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'duration' ( (lv_duration_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )? )
            // InternalDmodel.g:2523:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )? ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? )? | ( ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )? (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )? otherlv_33= 'efforts' otherlv_34= '{' ( (lv_requiredServices_35_0= ruleRequiredService ) ) (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )* otherlv_38= '}' ) ) (otherlv_39= 'maturityLevels' ( (lv_maturityLevels_40_0= ruleAbstractParameter ) ) )? (otherlv_41= 'uncertainty' ( (lv_uncertainty_42_0= ruleAbstractParameter ) ) )? (otherlv_43= 'risk' ( (lv_risk_44_0= ruleAbstractParameter ) ) )? ( ( (lv_hasImpacts_45_0= 'impacts' ) ) otherlv_46= '{' ( (lv_impacts_47_0= ruleImpact ) ) (otherlv_48= ',' ( (lv_impacts_49_0= ruleImpact ) ) )* otherlv_50= '}' )? (otherlv_51= 'value' ( (lv_value_52_0= ruleNumExpression ) ) )? (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )? (otherlv_55= 'arrival' ( (lv_arrivalTime_56_0= RULE_INT ) ) )? (otherlv_57= 'duration' ( (lv_duration_58_0= RULE_INT ) ) )? otherlv_59= '}' ( (lv_id_60_0= RULE_INT ) )?
            {
            // InternalDmodel.g:2523:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2524:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2524:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2525:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_81); 

            			newLeafNode(lv_name_0_0, grammarAccess.getWorkItemAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDmodel.g:2541:2: (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==72) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDmodel.g:2541:4: otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_47); 

                        	newLeafNode(otherlv_1, grammarAccess.getWorkItemAccess().getTypeKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,59,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getColonKeyword_1_1());
                        
                    // InternalDmodel.g:2549:1: ( (otherlv_3= RULE_ID ) )
                    // InternalDmodel.g:2550:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDmodel.g:2550:1: (otherlv_3= RULE_ID )
                    // InternalDmodel.g:2551:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_57); 

                    		newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getTypeWorkItemTypeCrossReference_1_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,74,FOLLOW_82); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:2566:1: (otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==14) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDmodel.g:2566:3: otherlv_5= 'desc' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemAccess().getDescKeyword_3_0());
                        
                    // InternalDmodel.g:2570:1: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalDmodel.g:2571:1: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalDmodel.g:2571:1: (lv_description_6_0= RULE_STRING )
                    // InternalDmodel.g:2572:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_83); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getWorkItemAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:2588:4: ( ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==87) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDmodel.g:2588:5: ( (lv_hasPredecessors_7_0= 'prerequisites' ) ) otherlv_8= '{' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= '}'
                    {
                    // InternalDmodel.g:2588:5: ( (lv_hasPredecessors_7_0= 'prerequisites' ) )
                    // InternalDmodel.g:2589:1: (lv_hasPredecessors_7_0= 'prerequisites' )
                    {
                    // InternalDmodel.g:2589:1: (lv_hasPredecessors_7_0= 'prerequisites' )
                    // InternalDmodel.g:2590:3: lv_hasPredecessors_7_0= 'prerequisites'
                    {
                    lv_hasPredecessors_7_0=(Token)match(input,87,FOLLOW_57); 

                            newLeafNode(lv_hasPredecessors_7_0, grammarAccess.getWorkItemAccess().getHasPredecessorsPrerequisitesKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasPredecessors", true, "prerequisites");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,74,FOLLOW_3); 

                        	newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // InternalDmodel.g:2607:1: ( (otherlv_9= RULE_ID ) )
                    // InternalDmodel.g:2608:1: (otherlv_9= RULE_ID )
                    {
                    // InternalDmodel.g:2608:1: (otherlv_9= RULE_ID )
                    // InternalDmodel.g:2609:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_75); 

                    		newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // InternalDmodel.g:2620:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==68) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalDmodel.g:2620:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,68,FOLLOW_3); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalDmodel.g:2624:1: ( (otherlv_11= RULE_ID ) )
                    	    // InternalDmodel.g:2625:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalDmodel.g:2625:1: (otherlv_11= RULE_ID )
                    	    // InternalDmodel.g:2626:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_75); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,77,FOLLOW_84); 

                        	newLeafNode(otherlv_12, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:2641:3: ( ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? )? | ( ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )? (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )? otherlv_33= 'efforts' otherlv_34= '{' ( (lv_requiredServices_35_0= ruleRequiredService ) ) (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )* otherlv_38= '}' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==77||LA66_0==88||(LA66_0>=92 && LA66_0<=99)) ) {
                alt66=1;
            }
            else if ( ((LA66_0>=89 && LA66_0<=91)) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalDmodel.g:2641:4: ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? )?
                    {
                    // InternalDmodel.g:2641:4: ( ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )? )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==88) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalDmodel.g:2641:5: ( (lv_hasSubtasks_13_0= 'decomposites' ) ) otherlv_14= '{' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= '}' (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )?
                            {
                            // InternalDmodel.g:2641:5: ( (lv_hasSubtasks_13_0= 'decomposites' ) )
                            // InternalDmodel.g:2642:1: (lv_hasSubtasks_13_0= 'decomposites' )
                            {
                            // InternalDmodel.g:2642:1: (lv_hasSubtasks_13_0= 'decomposites' )
                            // InternalDmodel.g:2643:3: lv_hasSubtasks_13_0= 'decomposites'
                            {
                            lv_hasSubtasks_13_0=(Token)match(input,88,FOLLOW_57); 

                                    newLeafNode(lv_hasSubtasks_13_0, grammarAccess.getWorkItemAccess().getHasSubtasksDecompositesKeyword_5_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                   		setWithLastConsumed(current, "hasSubtasks", true, "decomposites");
                            	    

                            }


                            }

                            otherlv_14=(Token)match(input,74,FOLLOW_3); 

                                	newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_0_1());
                                
                            // InternalDmodel.g:2660:1: ( (otherlv_15= RULE_ID ) )
                            // InternalDmodel.g:2661:1: (otherlv_15= RULE_ID )
                            {
                            // InternalDmodel.g:2661:1: (otherlv_15= RULE_ID )
                            // InternalDmodel.g:2662:3: otherlv_15= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                    
                            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_75); 

                            		newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_5_0_2_0()); 
                            	

                            }


                            }

                            // InternalDmodel.g:2673:2: (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==68) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // InternalDmodel.g:2673:4: otherlv_16= ',' ( (otherlv_17= RULE_ID ) )
                            	    {
                            	    otherlv_16=(Token)match(input,68,FOLLOW_3); 

                            	        	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getCommaKeyword_5_0_3_0());
                            	        
                            	    // InternalDmodel.g:2677:1: ( (otherlv_17= RULE_ID ) )
                            	    // InternalDmodel.g:2678:1: (otherlv_17= RULE_ID )
                            	    {
                            	    // InternalDmodel.g:2678:1: (otherlv_17= RULE_ID )
                            	    // InternalDmodel.g:2679:3: otherlv_17= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	    	        }
                            	            
                            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_75); 

                            	    		newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_5_0_3_1_0()); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);

                            otherlv_18=(Token)match(input,77,FOLLOW_85); 

                                	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_0_4());
                                
                            // InternalDmodel.g:2694:1: (otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}' )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==89) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // InternalDmodel.g:2694:3: otherlv_19= 'analysisEfforts' otherlv_20= '{' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )* otherlv_24= '}'
                                    {
                                    otherlv_19=(Token)match(input,89,FOLLOW_57); 

                                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getAnalysisEffortsKeyword_5_0_5_0());
                                        
                                    otherlv_20=(Token)match(input,74,FOLLOW_51); 

                                        	newLeafNode(otherlv_20, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_0_5_1());
                                        
                                    // InternalDmodel.g:2702:1: ( (lv_requiredAnalysis_21_0= ruleRequiredService ) )
                                    // InternalDmodel.g:2703:1: (lv_requiredAnalysis_21_0= ruleRequiredService )
                                    {
                                    // InternalDmodel.g:2703:1: (lv_requiredAnalysis_21_0= ruleRequiredService )
                                    // InternalDmodel.g:2704:3: lv_requiredAnalysis_21_0= ruleRequiredService
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_0_5_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_75);
                                    lv_requiredAnalysis_21_0=ruleRequiredService();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"requiredAnalysis",
                                            		lv_requiredAnalysis_21_0, 
                                            		"datasemModeller.Dmodel.RequiredService");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    // InternalDmodel.g:2720:2: (otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) ) )*
                                    loop59:
                                    do {
                                        int alt59=2;
                                        int LA59_0 = input.LA(1);

                                        if ( (LA59_0==68) ) {
                                            alt59=1;
                                        }


                                        switch (alt59) {
                                    	case 1 :
                                    	    // InternalDmodel.g:2720:4: otherlv_22= ',' ( (lv_requiredAnalysis_23_0= ruleRequiredService ) )
                                    	    {
                                    	    otherlv_22=(Token)match(input,68,FOLLOW_51); 

                                    	        	newLeafNode(otherlv_22, grammarAccess.getWorkItemAccess().getCommaKeyword_5_0_5_3_0());
                                    	        
                                    	    // InternalDmodel.g:2724:1: ( (lv_requiredAnalysis_23_0= ruleRequiredService ) )
                                    	    // InternalDmodel.g:2725:1: (lv_requiredAnalysis_23_0= ruleRequiredService )
                                    	    {
                                    	    // InternalDmodel.g:2725:1: (lv_requiredAnalysis_23_0= ruleRequiredService )
                                    	    // InternalDmodel.g:2726:3: lv_requiredAnalysis_23_0= ruleRequiredService
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_0_5_3_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_75);
                                    	    lv_requiredAnalysis_23_0=ruleRequiredService();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"requiredAnalysis",
                                    	            		lv_requiredAnalysis_23_0, 
                                    	            		"datasemModeller.Dmodel.RequiredService");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop59;
                                        }
                                    } while (true);

                                    otherlv_24=(Token)match(input,77,FOLLOW_86); 

                                        	newLeafNode(otherlv_24, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_0_5_4());
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:2747:6: ( ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )? (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )? otherlv_33= 'efforts' otherlv_34= '{' ( (lv_requiredServices_35_0= ruleRequiredService ) ) (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )* otherlv_38= '}' )
                    {
                    // InternalDmodel.g:2747:6: ( ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )? (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )? otherlv_33= 'efforts' otherlv_34= '{' ( (lv_requiredServices_35_0= ruleRequiredService ) ) (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )* otherlv_38= '}' )
                    // InternalDmodel.g:2747:7: ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )? (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )? otherlv_33= 'efforts' otherlv_34= '{' ( (lv_requiredServices_35_0= ruleRequiredService ) ) (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )* otherlv_38= '}'
                    {
                    // InternalDmodel.g:2747:7: ( ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==90) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalDmodel.g:2747:8: ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) ) ( (lv_decompositionMechanism_26_0= ruleMechanism ) )
                            {
                            // InternalDmodel.g:2747:8: ( (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' ) )
                            // InternalDmodel.g:2748:1: (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' )
                            {
                            // InternalDmodel.g:2748:1: (lv_hasDecompositionMechanism_25_0= 'decompositionMechanism' )
                            // InternalDmodel.g:2749:3: lv_hasDecompositionMechanism_25_0= 'decompositionMechanism'
                            {
                            lv_hasDecompositionMechanism_25_0=(Token)match(input,90,FOLLOW_3); 

                                    newLeafNode(lv_hasDecompositionMechanism_25_0, grammarAccess.getWorkItemAccess().getHasDecompositionMechanismDecompositionMechanismKeyword_5_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                   		setWithLastConsumed(current, "hasDecompositionMechanism", true, "decompositionMechanism");
                            	    

                            }


                            }

                            // InternalDmodel.g:2762:2: ( (lv_decompositionMechanism_26_0= ruleMechanism ) )
                            // InternalDmodel.g:2763:1: (lv_decompositionMechanism_26_0= ruleMechanism )
                            {
                            // InternalDmodel.g:2763:1: (lv_decompositionMechanism_26_0= ruleMechanism )
                            // InternalDmodel.g:2764:3: lv_decompositionMechanism_26_0= ruleMechanism
                            {
                             
                            	        newCompositeNode(grammarAccess.getWorkItemAccess().getDecompositionMechanismMechanismParserRuleCall_5_1_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_87);
                            lv_decompositionMechanism_26_0=ruleMechanism();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"decompositionMechanism",
                                    		lv_decompositionMechanism_26_0, 
                                    		"datasemModeller.Dmodel.Mechanism");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // InternalDmodel.g:2780:4: (otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==89) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalDmodel.g:2780:6: otherlv_27= 'analysisEfforts' otherlv_28= '{' ( (lv_requiredAnalysis_29_0= ruleRequiredService ) ) (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )* otherlv_32= '}'
                            {
                            otherlv_27=(Token)match(input,89,FOLLOW_57); 

                                	newLeafNode(otherlv_27, grammarAccess.getWorkItemAccess().getAnalysisEffortsKeyword_5_1_1_0());
                                
                            otherlv_28=(Token)match(input,74,FOLLOW_51); 

                                	newLeafNode(otherlv_28, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_1_1_1());
                                
                            // InternalDmodel.g:2788:1: ( (lv_requiredAnalysis_29_0= ruleRequiredService ) )
                            // InternalDmodel.g:2789:1: (lv_requiredAnalysis_29_0= ruleRequiredService )
                            {
                            // InternalDmodel.g:2789:1: (lv_requiredAnalysis_29_0= ruleRequiredService )
                            // InternalDmodel.g:2790:3: lv_requiredAnalysis_29_0= ruleRequiredService
                            {
                             
                            	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_1_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_75);
                            lv_requiredAnalysis_29_0=ruleRequiredService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"requiredAnalysis",
                                    		lv_requiredAnalysis_29_0, 
                                    		"datasemModeller.Dmodel.RequiredService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalDmodel.g:2806:2: (otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==68) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // InternalDmodel.g:2806:4: otherlv_30= ',' ( (lv_requiredAnalysis_31_0= ruleRequiredService ) )
                            	    {
                            	    otherlv_30=(Token)match(input,68,FOLLOW_51); 

                            	        	newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getCommaKeyword_5_1_1_3_0());
                            	        
                            	    // InternalDmodel.g:2810:1: ( (lv_requiredAnalysis_31_0= ruleRequiredService ) )
                            	    // InternalDmodel.g:2811:1: (lv_requiredAnalysis_31_0= ruleRequiredService )
                            	    {
                            	    // InternalDmodel.g:2811:1: (lv_requiredAnalysis_31_0= ruleRequiredService )
                            	    // InternalDmodel.g:2812:3: lv_requiredAnalysis_31_0= ruleRequiredService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_5_1_1_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_75);
                            	    lv_requiredAnalysis_31_0=ruleRequiredService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"requiredAnalysis",
                            	            		lv_requiredAnalysis_31_0, 
                            	            		"datasemModeller.Dmodel.RequiredService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop63;
                                }
                            } while (true);

                            otherlv_32=(Token)match(input,77,FOLLOW_88); 

                                	newLeafNode(otherlv_32, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_1_1_4());
                                

                            }
                            break;

                    }

                    otherlv_33=(Token)match(input,91,FOLLOW_57); 

                        	newLeafNode(otherlv_33, grammarAccess.getWorkItemAccess().getEffortsKeyword_5_1_2());
                        
                    otherlv_34=(Token)match(input,74,FOLLOW_51); 

                        	newLeafNode(otherlv_34, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_1_3());
                        
                    // InternalDmodel.g:2840:1: ( (lv_requiredServices_35_0= ruleRequiredService ) )
                    // InternalDmodel.g:2841:1: (lv_requiredServices_35_0= ruleRequiredService )
                    {
                    // InternalDmodel.g:2841:1: (lv_requiredServices_35_0= ruleRequiredService )
                    // InternalDmodel.g:2842:3: lv_requiredServices_35_0= ruleRequiredService
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_5_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_75);
                    lv_requiredServices_35_0=ruleRequiredService();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"requiredServices",
                            		lv_requiredServices_35_0, 
                            		"datasemModeller.Dmodel.RequiredService");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:2858:2: (otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==68) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalDmodel.g:2858:4: otherlv_36= ',' ( (lv_requiredServices_37_0= ruleRequiredService ) )
                    	    {
                    	    otherlv_36=(Token)match(input,68,FOLLOW_51); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getWorkItemAccess().getCommaKeyword_5_1_5_0());
                    	        
                    	    // InternalDmodel.g:2862:1: ( (lv_requiredServices_37_0= ruleRequiredService ) )
                    	    // InternalDmodel.g:2863:1: (lv_requiredServices_37_0= ruleRequiredService )
                    	    {
                    	    // InternalDmodel.g:2863:1: (lv_requiredServices_37_0= ruleRequiredService )
                    	    // InternalDmodel.g:2864:3: lv_requiredServices_37_0= ruleRequiredService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_5_1_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_75);
                    	    lv_requiredServices_37_0=ruleRequiredService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiredServices",
                    	            		lv_requiredServices_37_0, 
                    	            		"datasemModeller.Dmodel.RequiredService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,77,FOLLOW_86); 

                        	newLeafNode(otherlv_38, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_1_6());
                        

                    }


                    }
                    break;

            }

            // InternalDmodel.g:2884:3: (otherlv_39= 'maturityLevels' ( (lv_maturityLevels_40_0= ruleAbstractParameter ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==92) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDmodel.g:2884:5: otherlv_39= 'maturityLevels' ( (lv_maturityLevels_40_0= ruleAbstractParameter ) )
                    {
                    otherlv_39=(Token)match(input,92,FOLLOW_89); 

                        	newLeafNode(otherlv_39, grammarAccess.getWorkItemAccess().getMaturityLevelsKeyword_6_0());
                        
                    // InternalDmodel.g:2888:1: ( (lv_maturityLevels_40_0= ruleAbstractParameter ) )
                    // InternalDmodel.g:2889:1: (lv_maturityLevels_40_0= ruleAbstractParameter )
                    {
                    // InternalDmodel.g:2889:1: (lv_maturityLevels_40_0= ruleAbstractParameter )
                    // InternalDmodel.g:2890:3: lv_maturityLevels_40_0= ruleAbstractParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getMaturityLevelsAbstractParameterParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_90);
                    lv_maturityLevels_40_0=ruleAbstractParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"maturityLevels",
                            		lv_maturityLevels_40_0, 
                            		"datasemModeller.Dmodel.AbstractParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:2906:4: (otherlv_41= 'uncertainty' ( (lv_uncertainty_42_0= ruleAbstractParameter ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==93) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDmodel.g:2906:6: otherlv_41= 'uncertainty' ( (lv_uncertainty_42_0= ruleAbstractParameter ) )
                    {
                    otherlv_41=(Token)match(input,93,FOLLOW_89); 

                        	newLeafNode(otherlv_41, grammarAccess.getWorkItemAccess().getUncertaintyKeyword_7_0());
                        
                    // InternalDmodel.g:2910:1: ( (lv_uncertainty_42_0= ruleAbstractParameter ) )
                    // InternalDmodel.g:2911:1: (lv_uncertainty_42_0= ruleAbstractParameter )
                    {
                    // InternalDmodel.g:2911:1: (lv_uncertainty_42_0= ruleAbstractParameter )
                    // InternalDmodel.g:2912:3: lv_uncertainty_42_0= ruleAbstractParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getUncertaintyAbstractParameterParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_91);
                    lv_uncertainty_42_0=ruleAbstractParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"uncertainty",
                            		lv_uncertainty_42_0, 
                            		"datasemModeller.Dmodel.AbstractParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:2928:4: (otherlv_43= 'risk' ( (lv_risk_44_0= ruleAbstractParameter ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==94) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDmodel.g:2928:6: otherlv_43= 'risk' ( (lv_risk_44_0= ruleAbstractParameter ) )
                    {
                    otherlv_43=(Token)match(input,94,FOLLOW_89); 

                        	newLeafNode(otherlv_43, grammarAccess.getWorkItemAccess().getRiskKeyword_8_0());
                        
                    // InternalDmodel.g:2932:1: ( (lv_risk_44_0= ruleAbstractParameter ) )
                    // InternalDmodel.g:2933:1: (lv_risk_44_0= ruleAbstractParameter )
                    {
                    // InternalDmodel.g:2933:1: (lv_risk_44_0= ruleAbstractParameter )
                    // InternalDmodel.g:2934:3: lv_risk_44_0= ruleAbstractParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRiskAbstractParameterParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_92);
                    lv_risk_44_0=ruleAbstractParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"risk",
                            		lv_risk_44_0, 
                            		"datasemModeller.Dmodel.AbstractParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:2950:4: ( ( (lv_hasImpacts_45_0= 'impacts' ) ) otherlv_46= '{' ( (lv_impacts_47_0= ruleImpact ) ) (otherlv_48= ',' ( (lv_impacts_49_0= ruleImpact ) ) )* otherlv_50= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==95) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDmodel.g:2950:5: ( (lv_hasImpacts_45_0= 'impacts' ) ) otherlv_46= '{' ( (lv_impacts_47_0= ruleImpact ) ) (otherlv_48= ',' ( (lv_impacts_49_0= ruleImpact ) ) )* otherlv_50= '}'
                    {
                    // InternalDmodel.g:2950:5: ( (lv_hasImpacts_45_0= 'impacts' ) )
                    // InternalDmodel.g:2951:1: (lv_hasImpacts_45_0= 'impacts' )
                    {
                    // InternalDmodel.g:2951:1: (lv_hasImpacts_45_0= 'impacts' )
                    // InternalDmodel.g:2952:3: lv_hasImpacts_45_0= 'impacts'
                    {
                    lv_hasImpacts_45_0=(Token)match(input,95,FOLLOW_57); 

                            newLeafNode(lv_hasImpacts_45_0, grammarAccess.getWorkItemAccess().getHasImpactsImpactsKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasImpacts", true, "impacts");
                    	    

                    }


                    }

                    otherlv_46=(Token)match(input,74,FOLLOW_3); 

                        	newLeafNode(otherlv_46, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // InternalDmodel.g:2969:1: ( (lv_impacts_47_0= ruleImpact ) )
                    // InternalDmodel.g:2970:1: (lv_impacts_47_0= ruleImpact )
                    {
                    // InternalDmodel.g:2970:1: (lv_impacts_47_0= ruleImpact )
                    // InternalDmodel.g:2971:3: lv_impacts_47_0= ruleImpact
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FOLLOW_75);
                    lv_impacts_47_0=ruleImpact();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"impacts",
                            		lv_impacts_47_0, 
                            		"datasemModeller.Dmodel.Impact");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:2987:2: (otherlv_48= ',' ( (lv_impacts_49_0= ruleImpact ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==68) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalDmodel.g:2987:4: otherlv_48= ',' ( (lv_impacts_49_0= ruleImpact ) )
                    	    {
                    	    otherlv_48=(Token)match(input,68,FOLLOW_3); 

                    	        	newLeafNode(otherlv_48, grammarAccess.getWorkItemAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // InternalDmodel.g:2991:1: ( (lv_impacts_49_0= ruleImpact ) )
                    	    // InternalDmodel.g:2992:1: (lv_impacts_49_0= ruleImpact )
                    	    {
                    	    // InternalDmodel.g:2992:1: (lv_impacts_49_0= ruleImpact )
                    	    // InternalDmodel.g:2993:3: lv_impacts_49_0= ruleImpact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_75);
                    	    lv_impacts_49_0=ruleImpact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"impacts",
                    	            		lv_impacts_49_0, 
                    	            		"datasemModeller.Dmodel.Impact");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_50=(Token)match(input,77,FOLLOW_93); 

                        	newLeafNode(otherlv_50, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:3013:3: (otherlv_51= 'value' ( (lv_value_52_0= ruleNumExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==96) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDmodel.g:3013:5: otherlv_51= 'value' ( (lv_value_52_0= ruleNumExpression ) )
                    {
                    otherlv_51=(Token)match(input,96,FOLLOW_94); 

                        	newLeafNode(otherlv_51, grammarAccess.getWorkItemAccess().getValueKeyword_10_0());
                        
                    // InternalDmodel.g:3017:1: ( (lv_value_52_0= ruleNumExpression ) )
                    // InternalDmodel.g:3018:1: (lv_value_52_0= ruleNumExpression )
                    {
                    // InternalDmodel.g:3018:1: (lv_value_52_0= ruleNumExpression )
                    // InternalDmodel.g:3019:3: lv_value_52_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getValueNumExpressionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FOLLOW_95);
                    lv_value_52_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_52_0, 
                            		"datasemModeller.Dmodel.NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:3035:4: (otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==97) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalDmodel.g:3035:6: otherlv_53= 'workSource' ( (otherlv_54= RULE_ID ) )
                    {
                    otherlv_53=(Token)match(input,97,FOLLOW_3); 

                        	newLeafNode(otherlv_53, grammarAccess.getWorkItemAccess().getWorkSourceKeyword_11_0());
                        
                    // InternalDmodel.g:3039:1: ( (otherlv_54= RULE_ID ) )
                    // InternalDmodel.g:3040:1: (otherlv_54= RULE_ID )
                    {
                    // InternalDmodel.g:3040:1: (otherlv_54= RULE_ID )
                    // InternalDmodel.g:3041:3: otherlv_54= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_54=(Token)match(input,RULE_ID,FOLLOW_96); 

                    		newLeafNode(otherlv_54, grammarAccess.getWorkItemAccess().getWorkSourceWorkSourceCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:3052:4: (otherlv_55= 'arrival' ( (lv_arrivalTime_56_0= RULE_INT ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==98) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalDmodel.g:3052:6: otherlv_55= 'arrival' ( (lv_arrivalTime_56_0= RULE_INT ) )
                    {
                    otherlv_55=(Token)match(input,98,FOLLOW_45); 

                        	newLeafNode(otherlv_55, grammarAccess.getWorkItemAccess().getArrivalKeyword_12_0());
                        
                    // InternalDmodel.g:3056:1: ( (lv_arrivalTime_56_0= RULE_INT ) )
                    // InternalDmodel.g:3057:1: (lv_arrivalTime_56_0= RULE_INT )
                    {
                    // InternalDmodel.g:3057:1: (lv_arrivalTime_56_0= RULE_INT )
                    // InternalDmodel.g:3058:3: lv_arrivalTime_56_0= RULE_INT
                    {
                    lv_arrivalTime_56_0=(Token)match(input,RULE_INT,FOLLOW_97); 

                    			newLeafNode(lv_arrivalTime_56_0, grammarAccess.getWorkItemAccess().getArrivalTimeINTTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arrivalTime",
                            		lv_arrivalTime_56_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:3074:4: (otherlv_57= 'duration' ( (lv_duration_58_0= RULE_INT ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==99) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalDmodel.g:3074:6: otherlv_57= 'duration' ( (lv_duration_58_0= RULE_INT ) )
                    {
                    otherlv_57=(Token)match(input,99,FOLLOW_45); 

                        	newLeafNode(otherlv_57, grammarAccess.getWorkItemAccess().getDurationKeyword_13_0());
                        
                    // InternalDmodel.g:3078:1: ( (lv_duration_58_0= RULE_INT ) )
                    // InternalDmodel.g:3079:1: (lv_duration_58_0= RULE_INT )
                    {
                    // InternalDmodel.g:3079:1: (lv_duration_58_0= RULE_INT )
                    // InternalDmodel.g:3080:3: lv_duration_58_0= RULE_INT
                    {
                    lv_duration_58_0=(Token)match(input,RULE_INT,FOLLOW_59); 

                    			newLeafNode(lv_duration_58_0, grammarAccess.getWorkItemAccess().getDurationINTTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duration",
                            		lv_duration_58_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_59=(Token)match(input,77,FOLLOW_80); 

                	newLeafNode(otherlv_59, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_14());
                
            // InternalDmodel.g:3100:1: ( (lv_id_60_0= RULE_INT ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_INT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDmodel.g:3101:1: (lv_id_60_0= RULE_INT )
                    {
                    // InternalDmodel.g:3101:1: (lv_id_60_0= RULE_INT )
                    // InternalDmodel.g:3102:3: lv_id_60_0= RULE_INT
                    {
                    lv_id_60_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_60_0, grammarAccess.getWorkItemAccess().getIdINTTerminalRuleCall_15_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_60_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

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
    // InternalDmodel.g:3126:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalDmodel.g:3127:2: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalDmodel.g:3128:2: iv_ruleRequiredService= ruleRequiredService EOF
            {
             newCompositeNode(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredService=ruleRequiredService();

            state._fsp--;

             current =iv_ruleRequiredService; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:3135:1: ruleRequiredService returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efforts_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:3138:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // InternalDmodel.g:3139:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // InternalDmodel.g:3139:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // InternalDmodel.g:3139:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getLeftSquareBracketKeyword_0());
                
            // InternalDmodel.g:3143:1: ( (otherlv_1= RULE_ID ) )
            // InternalDmodel.g:3144:1: (otherlv_1= RULE_ID )
            {
            // InternalDmodel.g:3144:1: (otherlv_1= RULE_ID )
            // InternalDmodel.g:3145:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredServiceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_98); 

            		newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getServiceTypeServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_89); 

                	newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getCommaKeyword_2());
                
            // InternalDmodel.g:3160:1: ( (lv_efforts_3_0= ruleAbstractParameter ) )
            // InternalDmodel.g:3161:1: (lv_efforts_3_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:3161:1: (lv_efforts_3_0= ruleAbstractParameter )
            // InternalDmodel.g:3162:3: lv_efforts_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getRequiredServiceAccess().getEffortsAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_99);
            lv_efforts_3_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiredServiceRule());
            	        }
                   		set(
                   			current, 
                   			"efforts",
                    		lv_efforts_3_0, 
                    		"datasemModeller.Dmodel.AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,69,FOLLOW_2); 

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
    // InternalDmodel.g:3190:1: entryRuleImpact returns [EObject current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final EObject entryRuleImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpact = null;


        try {
            // InternalDmodel.g:3191:2: (iv_ruleImpact= ruleImpact EOF )
            // InternalDmodel.g:3192:2: iv_ruleImpact= ruleImpact EOF
            {
             newCompositeNode(grammarAccess.getImpactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpact=ruleImpact();

            state._fsp--;

             current =iv_ruleImpact; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:3199:1: ruleImpact returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) ;
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
            // InternalDmodel.g:3202:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) )
            // InternalDmodel.g:3203:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            {
            // InternalDmodel.g:3203:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            // InternalDmodel.g:3203:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']'
            {
            // InternalDmodel.g:3203:2: ( (otherlv_0= RULE_ID ) )
            // InternalDmodel.g:3204:1: (otherlv_0= RULE_ID )
            {
            // InternalDmodel.g:3204:1: (otherlv_0= RULE_ID )
            // InternalDmodel.g:3205:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImpactRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            		newLeafNode(otherlv_0, grammarAccess.getImpactAccess().getImpactWIWorkItemCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_89); 

                	newLeafNode(otherlv_1, grammarAccess.getImpactAccess().getLeftSquareBracketKeyword_1());
                
            // InternalDmodel.g:3220:1: ( (lv_likelihood_2_0= ruleAbstractParameter ) )
            // InternalDmodel.g:3221:1: (lv_likelihood_2_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:3221:1: (lv_likelihood_2_0= ruleAbstractParameter )
            // InternalDmodel.g:3222:3: lv_likelihood_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getLikelihoodAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_98);
            lv_likelihood_2_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImpactRule());
            	        }
                   		set(
                   			current, 
                   			"likelihood",
                    		lv_likelihood_2_0, 
                    		"datasemModeller.Dmodel.AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,68,FOLLOW_89); 

                	newLeafNode(otherlv_3, grammarAccess.getImpactAccess().getCommaKeyword_3());
                
            // InternalDmodel.g:3242:1: ( (lv_risk_4_0= ruleAbstractParameter ) )
            // InternalDmodel.g:3243:1: (lv_risk_4_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:3243:1: (lv_risk_4_0= ruleAbstractParameter )
            // InternalDmodel.g:3244:3: lv_risk_4_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getRiskAbstractParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_99);
            lv_risk_4_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImpactRule());
            	        }
                   		set(
                   			current, 
                   			"risk",
                    		lv_risk_4_0, 
                    		"datasemModeller.Dmodel.AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,69,FOLLOW_2); 

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
    // InternalDmodel.g:3272:1: entryRuleWorkItemType returns [EObject current=null] : iv_ruleWorkItemType= ruleWorkItemType EOF ;
    public final EObject entryRuleWorkItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemType = null;


        try {
            // InternalDmodel.g:3273:2: (iv_ruleWorkItemType= ruleWorkItemType EOF )
            // InternalDmodel.g:3274:2: iv_ruleWorkItemType= ruleWorkItemType EOF
            {
             newCompositeNode(grammarAccess.getWorkItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkItemType=ruleWorkItemType();

            state._fsp--;

             current =iv_ruleWorkItemType; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:3281:1: ruleWorkItemType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? ) ;
    public final EObject ruleWorkItemType() throws RecognitionException {
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
            // InternalDmodel.g:3284:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? ) )
            // InternalDmodel.g:3285:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:3285:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? )
            // InternalDmodel.g:3285:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )?
            {
            // InternalDmodel.g:3285:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:3286:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:3286:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:3287:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            			newLeafNode(lv_name_0_0, grammarAccess.getWorkItemTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,74,FOLLOW_100); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkItemTypeAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:3307:1: (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==14) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDmodel.g:3307:3: otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getWorkItemTypeAccess().getDescKeyword_2_0());
                        
                    // InternalDmodel.g:3311:1: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalDmodel.g:3312:1: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalDmodel.g:3312:1: (lv_description_3_0= RULE_STRING )
                    // InternalDmodel.g:3313:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_101); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getWorkItemTypeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:3329:4: (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==100) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalDmodel.g:3329:6: otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,100,FOLLOW_71); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkItemTypeAccess().getHierarchyKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,82,FOLLOW_45); 

                        	newLeafNode(otherlv_5, grammarAccess.getWorkItemTypeAccess().getEqualsSignKeyword_3_1());
                        
                    // InternalDmodel.g:3337:1: ( (lv_hierarchy_6_0= RULE_INT ) )
                    // InternalDmodel.g:3338:1: (lv_hierarchy_6_0= RULE_INT )
                    {
                    // InternalDmodel.g:3338:1: (lv_hierarchy_6_0= RULE_INT )
                    // InternalDmodel.g:3339:3: lv_hierarchy_6_0= RULE_INT
                    {
                    lv_hierarchy_6_0=(Token)match(input,RULE_INT,FOLLOW_59); 

                    			newLeafNode(lv_hierarchy_6_0, grammarAccess.getWorkItemTypeAccess().getHierarchyINTTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hierarchy",
                            		lv_hierarchy_6_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,77,FOLLOW_80); 

                	newLeafNode(otherlv_7, grammarAccess.getWorkItemTypeAccess().getRightCurlyBracketKeyword_4());
                
            // InternalDmodel.g:3359:1: ( (lv_id_8_0= RULE_INT ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_INT) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDmodel.g:3360:1: (lv_id_8_0= RULE_INT )
                    {
                    // InternalDmodel.g:3360:1: (lv_id_8_0= RULE_INT )
                    // InternalDmodel.g:3361:3: lv_id_8_0= RULE_INT
                    {
                    lv_id_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_8_0, grammarAccess.getWorkItemTypeAccess().getIdINTTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_8_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

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
    // $ANTLR end "ruleWorkItemType"


    // $ANTLR start "entryRuleClassOfService"
    // InternalDmodel.g:3387:1: entryRuleClassOfService returns [EObject current=null] : iv_ruleClassOfService= ruleClassOfService EOF ;
    public final EObject entryRuleClassOfService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOfService = null;


        try {
            // InternalDmodel.g:3388:2: (iv_ruleClassOfService= ruleClassOfService EOF )
            // InternalDmodel.g:3389:2: iv_ruleClassOfService= ruleClassOfService EOF
            {
             newCompositeNode(grammarAccess.getClassOfServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassOfService=ruleClassOfService();

            state._fsp--;

             current =iv_ruleClassOfService; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:3396:1: ruleClassOfService returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' ) ;
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
            // InternalDmodel.g:3399:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' ) )
            // InternalDmodel.g:3400:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' )
            {
            // InternalDmodel.g:3400:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}' )
            // InternalDmodel.g:3400:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )? (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )? otherlv_11= '}'
            {
            // InternalDmodel.g:3400:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalDmodel.g:3401:1: (lv_id_0_0= RULE_INT )
                    {
                    // InternalDmodel.g:3401:1: (lv_id_0_0= RULE_INT )
                    // InternalDmodel.g:3402:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_3); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getClassOfServiceAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }
                    break;

            }

            // InternalDmodel.g:3418:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:3419:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:3419:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:3420:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassOfServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassOfServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_102); 

                	newLeafNode(otherlv_2, grammarAccess.getClassOfServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:3440:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==14) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalDmodel.g:3440:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getClassOfServiceAccess().getDescKeyword_3_0());
                        
                    // InternalDmodel.g:3444:1: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalDmodel.g:3445:1: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalDmodel.g:3445:1: (lv_description_4_0= RULE_STRING )
                    // InternalDmodel.g:3446:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_103); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getClassOfServiceAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:3462:4: (otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==101) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDmodel.g:3462:6: otherlv_5= 'priority' otherlv_6= '=' ( (lv_priority_7_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,101,FOLLOW_71); 

                        	newLeafNode(otherlv_5, grammarAccess.getClassOfServiceAccess().getPriorityKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,82,FOLLOW_45); 

                        	newLeafNode(otherlv_6, grammarAccess.getClassOfServiceAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalDmodel.g:3470:1: ( (lv_priority_7_0= RULE_INT ) )
                    // InternalDmodel.g:3471:1: (lv_priority_7_0= RULE_INT )
                    {
                    // InternalDmodel.g:3471:1: (lv_priority_7_0= RULE_INT )
                    // InternalDmodel.g:3472:3: lv_priority_7_0= RULE_INT
                    {
                    lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_104); 

                    			newLeafNode(lv_priority_7_0, grammarAccess.getClassOfServiceAccess().getPriorityINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"priority",
                            		lv_priority_7_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:3488:4: (otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==102) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalDmodel.g:3488:6: otherlv_8= 'disruptive' otherlv_9= ':' ( (lv_disruptive_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_8=(Token)match(input,102,FOLLOW_47); 

                        	newLeafNode(otherlv_8, grammarAccess.getClassOfServiceAccess().getDisruptiveKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,59,FOLLOW_49); 

                        	newLeafNode(otherlv_9, grammarAccess.getClassOfServiceAccess().getColonKeyword_5_1());
                        
                    // InternalDmodel.g:3496:1: ( (lv_disruptive_10_0= RULE_BOOLEAN ) )
                    // InternalDmodel.g:3497:1: (lv_disruptive_10_0= RULE_BOOLEAN )
                    {
                    // InternalDmodel.g:3497:1: (lv_disruptive_10_0= RULE_BOOLEAN )
                    // InternalDmodel.g:3498:3: lv_disruptive_10_0= RULE_BOOLEAN
                    {
                    lv_disruptive_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_59); 

                    			newLeafNode(lv_disruptive_10_0, grammarAccess.getClassOfServiceAccess().getDisruptiveBOOLEANTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"disruptive",
                            		lv_disruptive_10_0, 
                            		"datasemModeller.Dmodel.BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:3526:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDmodel.g:3527:2: (iv_ruleService= ruleService EOF )
            // InternalDmodel.g:3528:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:3535:1: ruleService returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? ) ;
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
            // InternalDmodel.g:3538:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? ) )
            // InternalDmodel.g:3539:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:3539:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )? )
            // InternalDmodel.g:3539:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )? ( (lv_id_8_0= RULE_INT ) )?
            {
            // InternalDmodel.g:3539:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:3540:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:3540:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:3541:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_105); 

            			newLeafNode(lv_name_0_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDmodel.g:3557:2: (otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==74) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalDmodel.g:3557:4: otherlv_1= '{' (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )? otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,74,FOLLOW_100); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // InternalDmodel.g:3561:1: (otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==14) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalDmodel.g:3561:3: otherlv_2= 'desc' ( (lv_description_3_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_5); 

                                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getDescKeyword_1_1_0());
                                
                            // InternalDmodel.g:3565:1: ( (lv_description_3_0= RULE_STRING ) )
                            // InternalDmodel.g:3566:1: (lv_description_3_0= RULE_STRING )
                            {
                            // InternalDmodel.g:3566:1: (lv_description_3_0= RULE_STRING )
                            // InternalDmodel.g:3567:3: lv_description_3_0= RULE_STRING
                            {
                            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_101); 

                            			newLeafNode(lv_description_3_0, grammarAccess.getServiceAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_3_0, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // InternalDmodel.g:3583:4: (otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==100) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalDmodel.g:3583:6: otherlv_4= 'hierarchy' otherlv_5= '=' ( (lv_hierarchy_6_0= RULE_INT ) )
                            {
                            otherlv_4=(Token)match(input,100,FOLLOW_71); 

                                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getHierarchyKeyword_1_2_0());
                                
                            otherlv_5=(Token)match(input,82,FOLLOW_45); 

                                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getEqualsSignKeyword_1_2_1());
                                
                            // InternalDmodel.g:3591:1: ( (lv_hierarchy_6_0= RULE_INT ) )
                            // InternalDmodel.g:3592:1: (lv_hierarchy_6_0= RULE_INT )
                            {
                            // InternalDmodel.g:3592:1: (lv_hierarchy_6_0= RULE_INT )
                            // InternalDmodel.g:3593:3: lv_hierarchy_6_0= RULE_INT
                            {
                            lv_hierarchy_6_0=(Token)match(input,RULE_INT,FOLLOW_59); 

                            			newLeafNode(lv_hierarchy_6_0, grammarAccess.getServiceAccess().getHierarchyINTTerminalRuleCall_1_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"hierarchy",
                                    		lv_hierarchy_6_0, 
                                    		"org.eclipse.xtext.common.Terminals.INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,77,FOLLOW_80); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // InternalDmodel.g:3613:3: ( (lv_id_8_0= RULE_INT ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_INT) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalDmodel.g:3614:1: (lv_id_8_0= RULE_INT )
                    {
                    // InternalDmodel.g:3614:1: (lv_id_8_0= RULE_INT )
                    // InternalDmodel.g:3615:3: lv_id_8_0= RULE_INT
                    {
                    lv_id_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_8_0, grammarAccess.getServiceAccess().getIdINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_8_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

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
    // InternalDmodel.g:3639:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // InternalDmodel.g:3640:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // InternalDmodel.g:3641:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:3648:1: ruleServiceProvider returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )? ) ;
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
            // InternalDmodel.g:3651:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )? ) )
            // InternalDmodel.g:3652:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:3652:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )? )
            // InternalDmodel.g:3652:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )? (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )? otherlv_23= '}' ( (lv_id_24_0= RULE_INT ) )?
            {
            // InternalDmodel.g:3652:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:3653:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:3653:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:3654:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_81); 

            			newLeafNode(lv_name_0_0, grammarAccess.getServiceProviderAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceProviderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDmodel.g:3670:2: (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==72) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalDmodel.g:3670:4: otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_47); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getTypeKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,59,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceProviderAccess().getColonKeyword_1_1());
                        
                    // InternalDmodel.g:3678:1: ( (otherlv_3= RULE_ID ) )
                    // InternalDmodel.g:3679:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDmodel.g:3679:1: (otherlv_3= RULE_ID )
                    // InternalDmodel.g:3680:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_57); 

                    		newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getTypeServiceProviderTypeCrossReference_1_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,74,FOLLOW_106); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:3695:1: (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==85) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalDmodel.g:3695:3: otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,85,FOLLOW_57); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderAccess().getAssignToKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,74,FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalDmodel.g:3703:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDmodel.g:3704:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDmodel.g:3704:1: (otherlv_7= RULE_ID )
                    // InternalDmodel.g:3705:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_75); 

                    		newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // InternalDmodel.g:3716:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==68) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalDmodel.g:3716:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,68,FOLLOW_3); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalDmodel.g:3720:1: ( (otherlv_9= RULE_ID ) )
                    	    // InternalDmodel.g:3721:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalDmodel.g:3721:1: (otherlv_9= RULE_ID )
                    	    // InternalDmodel.g:3722:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_75); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,77,FOLLOW_107); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:3737:3: (otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==103) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalDmodel.g:3737:5: otherlv_11= 'outsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,103,FOLLOW_57); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getOutsourceFromKeyword_4_0());
                        
                    otherlv_12=(Token)match(input,74,FOLLOW_3); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // InternalDmodel.g:3745:1: ( (otherlv_13= RULE_ID ) )
                    // InternalDmodel.g:3746:1: (otherlv_13= RULE_ID )
                    {
                    // InternalDmodel.g:3746:1: (otherlv_13= RULE_ID )
                    // InternalDmodel.g:3747:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_75); 

                    		newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getOutsourceFromServiceProviderCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // InternalDmodel.g:3758:2: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==68) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalDmodel.g:3758:4: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,68,FOLLOW_3); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalDmodel.g:3762:1: ( (otherlv_15= RULE_ID ) )
                    	    // InternalDmodel.g:3763:1: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalDmodel.g:3763:1: (otherlv_15= RULE_ID )
                    	    // InternalDmodel.g:3764:3: otherlv_15= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_75); 

                    	    		newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getOutsourceFromServiceProviderCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,77,FOLLOW_108); 

                        	newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:3779:3: (otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==104) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalDmodel.g:3779:5: otherlv_17= 'strategy' otherlv_18= ':' ( (otherlv_19= RULE_ID ) )
                    {
                    otherlv_17=(Token)match(input,104,FOLLOW_47); 

                        	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getStrategyKeyword_5_0());
                        
                    otherlv_18=(Token)match(input,59,FOLLOW_3); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getColonKeyword_5_1());
                        
                    // InternalDmodel.g:3787:1: ( (otherlv_19= RULE_ID ) )
                    // InternalDmodel.g:3788:1: (otherlv_19= RULE_ID )
                    {
                    // InternalDmodel.g:3788:1: (otherlv_19= RULE_ID )
                    // InternalDmodel.g:3789:3: otherlv_19= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_109); 

                    		newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getGovernanceStrategyGovernanceStrategyCrossReference_5_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:3800:4: (otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+ )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==105) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalDmodel.g:3800:6: otherlv_20= 'resources' otherlv_21= ':' ( (lv_resources_22_0= ruleAsset ) )+
                    {
                    otherlv_20=(Token)match(input,105,FOLLOW_47); 

                        	newLeafNode(otherlv_20, grammarAccess.getServiceProviderAccess().getResourcesKeyword_6_0());
                        
                    otherlv_21=(Token)match(input,59,FOLLOW_3); 

                        	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getColonKeyword_6_1());
                        
                    // InternalDmodel.g:3808:1: ( (lv_resources_22_0= ruleAsset ) )+
                    int cnt94=0;
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==RULE_ID) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalDmodel.g:3809:1: (lv_resources_22_0= ruleAsset )
                    	    {
                    	    // InternalDmodel.g:3809:1: (lv_resources_22_0= ruleAsset )
                    	    // InternalDmodel.g:3810:3: lv_resources_22_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_60);
                    	    lv_resources_22_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_22_0, 
                    	            		"datasemModeller.Dmodel.Asset");
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


                    }
                    break;

            }

            otherlv_23=(Token)match(input,77,FOLLOW_80); 

                	newLeafNode(otherlv_23, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_7());
                
            // InternalDmodel.g:3830:1: ( (lv_id_24_0= RULE_INT ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_INT) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalDmodel.g:3831:1: (lv_id_24_0= RULE_INT )
                    {
                    // InternalDmodel.g:3831:1: (lv_id_24_0= RULE_INT )
                    // InternalDmodel.g:3832:3: lv_id_24_0= RULE_INT
                    {
                    lv_id_24_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_24_0, grammarAccess.getServiceProviderAccess().getIdINTTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_24_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

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
    // InternalDmodel.g:3856:1: entryRuleServiceProviderType returns [EObject current=null] : iv_ruleServiceProviderType= ruleServiceProviderType EOF ;
    public final EObject entryRuleServiceProviderType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProviderType = null;


        try {
            // InternalDmodel.g:3857:2: (iv_ruleServiceProviderType= ruleServiceProviderType EOF )
            // InternalDmodel.g:3858:2: iv_ruleServiceProviderType= ruleServiceProviderType EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceProviderType=ruleServiceProviderType();

            state._fsp--;

             current =iv_ruleServiceProviderType; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:3865:1: ruleServiceProviderType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) ;
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
            // InternalDmodel.g:3868:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' ) )
            // InternalDmodel.g:3869:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            {
            // InternalDmodel.g:3869:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            // InternalDmodel.g:3869:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )? otherlv_8= '}'
            {
            // InternalDmodel.g:3869:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_INT) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalDmodel.g:3870:1: (lv_id_0_0= RULE_INT )
                    {
                    // InternalDmodel.g:3870:1: (lv_id_0_0= RULE_INT )
                    // InternalDmodel.g:3871:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_3); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getServiceProviderTypeAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }
                    break;

            }

            // InternalDmodel.g:3887:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:3888:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:3888:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:3889:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceProviderTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceProviderTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_100); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceProviderTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:3909:1: (otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==14) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalDmodel.g:3909:3: otherlv_3= 'desc' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getServiceProviderTypeAccess().getDescKeyword_3_0());
                        
                    // InternalDmodel.g:3913:1: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalDmodel.g:3914:1: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalDmodel.g:3914:1: (lv_description_4_0= RULE_STRING )
                    // InternalDmodel.g:3915:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_101); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getServiceProviderTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:3931:4: (otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==100) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalDmodel.g:3931:6: otherlv_5= 'hierarchy' otherlv_6= '=' ( (lv_hierarchy_7_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,100,FOLLOW_71); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderTypeAccess().getHierarchyKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,82,FOLLOW_45); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderTypeAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalDmodel.g:3939:1: ( (lv_hierarchy_7_0= RULE_INT ) )
                    // InternalDmodel.g:3940:1: (lv_hierarchy_7_0= RULE_INT )
                    {
                    // InternalDmodel.g:3940:1: (lv_hierarchy_7_0= RULE_INT )
                    // InternalDmodel.g:3941:3: lv_hierarchy_7_0= RULE_INT
                    {
                    lv_hierarchy_7_0=(Token)match(input,RULE_INT,FOLLOW_59); 

                    			newLeafNode(lv_hierarchy_7_0, grammarAccess.getServiceProviderTypeAccess().getHierarchyINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hierarchy",
                            		lv_hierarchy_7_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:3969:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // InternalDmodel.g:3970:2: (iv_ruleAsset= ruleAsset EOF )
            // InternalDmodel.g:3971:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:3978:1: ruleAsset returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) ;
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
            // InternalDmodel.g:3981:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) )
            // InternalDmodel.g:3982:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:3982:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            // InternalDmodel.g:3982:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )?
            {
            // InternalDmodel.g:3982:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:3983:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:3983:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:3984:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_110); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,106,FOLLOW_89); 

                	newLeafNode(otherlv_1, grammarAccess.getAssetAccess().getAsteriskKeyword_1());
                
            // InternalDmodel.g:4004:1: ( (lv_number_2_0= ruleAbstractParameter ) )
            // InternalDmodel.g:4005:1: (lv_number_2_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:4005:1: (lv_number_2_0= ruleAbstractParameter )
            // InternalDmodel.g:4006:3: lv_number_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getAssetAccess().getNumberAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_57);
            lv_number_2_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssetRule());
            	        }
                   		set(
                   			current, 
                   			"number",
                    		lv_number_2_0, 
                    		"datasemModeller.Dmodel.AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,74,FOLLOW_111); 

                	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDmodel.g:4026:1: (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==107) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalDmodel.g:4026:3: otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    {
                    otherlv_4=(Token)match(input,107,FOLLOW_47); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getSkillsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,59,FOLLOW_51); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getColonKeyword_4_1());
                        
                    // InternalDmodel.g:4034:1: ( (lv_skillSet_6_0= ruleSkill ) )
                    // InternalDmodel.g:4035:1: (lv_skillSet_6_0= ruleSkill )
                    {
                    // InternalDmodel.g:4035:1: (lv_skillSet_6_0= ruleSkill )
                    // InternalDmodel.g:4036:3: lv_skillSet_6_0= ruleSkill
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_75);
                    lv_skillSet_6_0=ruleSkill();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssetRule());
                    	        }
                           		add(
                           			current, 
                           			"skillSet",
                            		lv_skillSet_6_0, 
                            		"datasemModeller.Dmodel.Skill");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:4052:2: (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==68) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalDmodel.g:4052:4: otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) )
                    	    {
                    	    otherlv_7=(Token)match(input,68,FOLLOW_51); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalDmodel.g:4056:1: ( (lv_skillSet_8_0= ruleSkill ) )
                    	    // InternalDmodel.g:4057:1: (lv_skillSet_8_0= ruleSkill )
                    	    {
                    	    // InternalDmodel.g:4057:1: (lv_skillSet_8_0= ruleSkill )
                    	    // InternalDmodel.g:4058:3: lv_skillSet_8_0= ruleSkill
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_75);
                    	    lv_skillSet_8_0=ruleSkill();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"skillSet",
                    	            		lv_skillSet_8_0, 
                    	            		"datasemModeller.Dmodel.Skill");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,77,FOLLOW_80); 

                	newLeafNode(otherlv_9, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5());
                
            // InternalDmodel.g:4078:1: ( (lv_id_10_0= RULE_INT ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_INT) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDmodel.g:4079:1: (lv_id_10_0= RULE_INT )
                    {
                    // InternalDmodel.g:4079:1: (lv_id_10_0= RULE_INT )
                    // InternalDmodel.g:4080:3: lv_id_10_0= RULE_INT
                    {
                    lv_id_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_10_0, grammarAccess.getAssetAccess().getIdINTTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_10_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

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
    // InternalDmodel.g:4104:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // InternalDmodel.g:4105:2: (iv_ruleSkill= ruleSkill EOF )
            // InternalDmodel.g:4106:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4113:1: ruleSkill returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efficiency_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:4116:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // InternalDmodel.g:4117:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // InternalDmodel.g:4117:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // InternalDmodel.g:4117:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSkillAccess().getLeftSquareBracketKeyword_0());
                
            // InternalDmodel.g:4121:1: ( (otherlv_1= RULE_ID ) )
            // InternalDmodel.g:4122:1: (otherlv_1= RULE_ID )
            {
            // InternalDmodel.g:4122:1: (otherlv_1= RULE_ID )
            // InternalDmodel.g:4123:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkillRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_98); 

            		newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getServiceServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_89); 

                	newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getCommaKeyword_2());
                
            // InternalDmodel.g:4138:1: ( (lv_efficiency_3_0= ruleAbstractParameter ) )
            // InternalDmodel.g:4139:1: (lv_efficiency_3_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:4139:1: (lv_efficiency_3_0= ruleAbstractParameter )
            // InternalDmodel.g:4140:3: lv_efficiency_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getSkillAccess().getEfficiencyAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_99);
            lv_efficiency_3_0=ruleAbstractParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSkillRule());
            	        }
                   		set(
                   			current, 
                   			"efficiency",
                    		lv_efficiency_3_0, 
                    		"datasemModeller.Dmodel.AbstractParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,69,FOLLOW_2); 

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
    // InternalDmodel.g:4168:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalDmodel.g:4169:2: (iv_ruleType= ruleType EOF )
            // InternalDmodel.g:4170:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4177:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Class_0= ruleClass | this_DataType_1= ruleDataType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Class_0 = null;

        AntlrDatatypeRuleToken this_DataType_1 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:4180:28: ( (this_Class_0= ruleClass | this_DataType_1= ruleDataType ) )
            // InternalDmodel.g:4181:1: (this_Class_0= ruleClass | this_DataType_1= ruleDataType )
            {
            // InternalDmodel.g:4181:1: (this_Class_0= ruleClass | this_DataType_1= ruleDataType )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=110 && LA103_0<=114)) ) {
                alt103=1;
            }
            else if ( (LA103_0==60||LA103_0==62||(LA103_0>=108 && LA103_0<=109)) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalDmodel.g:4182:5: this_Class_0= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    		current.merge(this_Class_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDmodel.g:4194:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalDmodel.g:4212:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalDmodel.g:4213:2: (iv_ruleDataType= ruleDataType EOF )
            // InternalDmodel.g:4214:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4221:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:4224:28: ( (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' ) )
            // InternalDmodel.g:4225:1: (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' )
            {
            // InternalDmodel.g:4225:1: (kw= 'string' | kw= 'boolean' | kw= 'int' | kw= 'double' )
            int alt104=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt104=1;
                }
                break;
            case 60:
                {
                alt104=2;
                }
                break;
            case 108:
                {
                alt104=3;
                }
                break;
            case 109:
                {
                alt104=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalDmodel.g:4226:2: kw= 'string'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDmodel.g:4233:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDmodel.g:4240:2: kw= 'int'
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalDmodel.g:4247:2: kw= 'double'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

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
    // InternalDmodel.g:4260:1: entryRuleClass returns [String current=null] : iv_ruleClass= ruleClass EOF ;
    public final String entryRuleClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass = null;


        try {
            // InternalDmodel.g:4261:2: (iv_ruleClass= ruleClass EOF )
            // InternalDmodel.g:4262:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4269:1: ruleClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' ) ;
    public final AntlrDatatypeRuleToken ruleClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:4272:28: ( (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' ) )
            // InternalDmodel.g:4273:1: (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' )
            {
            // InternalDmodel.g:4273:1: (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' | kw= 'Service' )
            int alt105=5;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt105=1;
                }
                break;
            case 111:
                {
                alt105=2;
                }
                break;
            case 112:
                {
                alt105=3;
                }
                break;
            case 113:
                {
                alt105=4;
                }
                break;
            case 114:
                {
                alt105=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalDmodel.g:4274:2: kw= 'Agent'
                    {
                    kw=(Token)match(input,110,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getAgentKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDmodel.g:4281:2: kw= 'Task'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getTaskKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDmodel.g:4288:2: kw= 'Contract'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getContractKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalDmodel.g:4295:2: kw= 'Bid'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassAccess().getBidKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // InternalDmodel.g:4302:2: kw= 'Service'
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

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
    // InternalDmodel.g:4315:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalDmodel.g:4316:2: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalDmodel.g:4317:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4324:1: ruleAbstractType returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) ) ;
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
            // InternalDmodel.g:4327:28: ( ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) ) )
            // InternalDmodel.g:4328:1: ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) )
            {
            // InternalDmodel.g:4328:1: ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) | ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 60:
            case 62:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
                {
                alt106=1;
                }
                break;
            case 115:
                {
                alt106=2;
                }
                break;
            case 116:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // InternalDmodel.g:4328:2: ( (lv_type_0_0= ruleType ) )
                    {
                    // InternalDmodel.g:4328:2: ( (lv_type_0_0= ruleType ) )
                    // InternalDmodel.g:4329:1: (lv_type_0_0= ruleType )
                    {
                    // InternalDmodel.g:4329:1: (lv_type_0_0= ruleType )
                    // InternalDmodel.g:4330:3: lv_type_0_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getTypeTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_type_0_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"datasemModeller.Dmodel.Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:4347:6: ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' )
                    {
                    // InternalDmodel.g:4347:6: ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' )
                    // InternalDmodel.g:4347:7: ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>'
                    {
                    // InternalDmodel.g:4347:7: ( (lv_listType_1_0= 'List' ) )
                    // InternalDmodel.g:4348:1: (lv_listType_1_0= 'List' )
                    {
                    // InternalDmodel.g:4348:1: (lv_listType_1_0= 'List' )
                    // InternalDmodel.g:4349:3: lv_listType_1_0= 'List'
                    {
                    lv_listType_1_0=(Token)match(input,115,FOLLOW_112); 

                            newLeafNode(lv_listType_1_0, grammarAccess.getAbstractTypeAccess().getListTypeListKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractTypeRule());
                    	        }
                           		setWithLastConsumed(current, "listType", true, "List");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,55,FOLLOW_113); 

                        	newLeafNode(otherlv_2, grammarAccess.getAbstractTypeAccess().getLessThanSignKeyword_1_1());
                        
                    // InternalDmodel.g:4366:1: ( (lv_type_3_0= ruleType ) )
                    // InternalDmodel.g:4367:1: (lv_type_3_0= ruleType )
                    {
                    // InternalDmodel.g:4367:1: (lv_type_3_0= ruleType )
                    // InternalDmodel.g:4368:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getTypeTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_114);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"datasemModeller.Dmodel.Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,54,FOLLOW_2); 

                        	newLeafNode(otherlv_4, grammarAccess.getAbstractTypeAccess().getGreaterThanSignKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalDmodel.g:4389:6: ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' )
                    {
                    // InternalDmodel.g:4389:6: ( ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>' )
                    // InternalDmodel.g:4389:7: ( (lv_mapType_5_0= 'Map' ) ) otherlv_6= '<' ( (lv_keyType_7_0= ruleType ) ) otherlv_8= ',' ( (lv_valueType_9_0= ruleType ) ) otherlv_10= '>'
                    {
                    // InternalDmodel.g:4389:7: ( (lv_mapType_5_0= 'Map' ) )
                    // InternalDmodel.g:4390:1: (lv_mapType_5_0= 'Map' )
                    {
                    // InternalDmodel.g:4390:1: (lv_mapType_5_0= 'Map' )
                    // InternalDmodel.g:4391:3: lv_mapType_5_0= 'Map'
                    {
                    lv_mapType_5_0=(Token)match(input,116,FOLLOW_112); 

                            newLeafNode(lv_mapType_5_0, grammarAccess.getAbstractTypeAccess().getMapTypeMapKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractTypeRule());
                    	        }
                           		setWithLastConsumed(current, "mapType", true, "Map");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,55,FOLLOW_113); 

                        	newLeafNode(otherlv_6, grammarAccess.getAbstractTypeAccess().getLessThanSignKeyword_2_1());
                        
                    // InternalDmodel.g:4408:1: ( (lv_keyType_7_0= ruleType ) )
                    // InternalDmodel.g:4409:1: (lv_keyType_7_0= ruleType )
                    {
                    // InternalDmodel.g:4409:1: (lv_keyType_7_0= ruleType )
                    // InternalDmodel.g:4410:3: lv_keyType_7_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getKeyTypeTypeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_98);
                    lv_keyType_7_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"keyType",
                            		lv_keyType_7_0, 
                            		"datasemModeller.Dmodel.Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,68,FOLLOW_113); 

                        	newLeafNode(otherlv_8, grammarAccess.getAbstractTypeAccess().getCommaKeyword_2_3());
                        
                    // InternalDmodel.g:4430:1: ( (lv_valueType_9_0= ruleType ) )
                    // InternalDmodel.g:4431:1: (lv_valueType_9_0= ruleType )
                    {
                    // InternalDmodel.g:4431:1: (lv_valueType_9_0= ruleType )
                    // InternalDmodel.g:4432:3: lv_valueType_9_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTypeAccess().getValueTypeTypeParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_114);
                    lv_valueType_9_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"valueType",
                            		lv_valueType_9_0, 
                            		"datasemModeller.Dmodel.Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,54,FOLLOW_2); 

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
    // InternalDmodel.g:4466:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDmodel.g:4467:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDmodel.g:4468:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4475:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:4478:28: ( ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? ) )
            // InternalDmodel.g:4479:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? )
            {
            // InternalDmodel.g:4479:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? )
            // InternalDmodel.g:4479:2: ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )?
            {
            // InternalDmodel.g:4479:2: ( (lv_type_0_0= ruleAbstractType ) )
            // InternalDmodel.g:4480:1: (lv_type_0_0= ruleAbstractType )
            {
            // InternalDmodel.g:4480:1: (lv_type_0_0= ruleAbstractType )
            // InternalDmodel.g:4481:3: lv_type_0_0= ruleAbstractType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAbstractTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleAbstractType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"datasemModeller.Dmodel.AbstractType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDmodel.g:4497:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:4498:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:4498:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:4499:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_115); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDmodel.g:4515:2: (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==117) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalDmodel.g:4515:4: otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) )
                    {
                    otherlv_2=(Token)match(input,117,FOLLOW_52); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDefaultKeyword_2_0());
                        
                    // InternalDmodel.g:4519:1: ( (lv_default_3_0= ruleParameter ) )
                    // InternalDmodel.g:4520:1: (lv_default_3_0= ruleParameter )
                    {
                    // InternalDmodel.g:4520:1: (lv_default_3_0= ruleParameter )
                    // InternalDmodel.g:4521:3: lv_default_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getDefaultParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_3_0, 
                            		"datasemModeller.Dmodel.Parameter");
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
    // InternalDmodel.g:4545:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalDmodel.g:4546:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalDmodel.g:4547:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4554:1: ruleAttributeValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:4557:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // InternalDmodel.g:4558:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // InternalDmodel.g:4558:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // InternalDmodel.g:4558:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // InternalDmodel.g:4558:2: ( (otherlv_0= RULE_ID ) )
            // InternalDmodel.g:4559:1: (otherlv_0= RULE_ID )
            {
            // InternalDmodel.g:4559:1: (otherlv_0= RULE_ID )
            // InternalDmodel.g:4560:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeValueRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            		newLeafNode(otherlv_0, grammarAccess.getAttributeValueAccess().getAttributeAttributeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,82,FOLLOW_52); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getEqualsSignKeyword_1());
                
            // InternalDmodel.g:4575:1: ( (lv_value_2_0= ruleParameter ) )
            // InternalDmodel.g:4576:1: (lv_value_2_0= ruleParameter )
            {
            // InternalDmodel.g:4576:1: (lv_value_2_0= ruleParameter )
            // InternalDmodel.g:4577:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"datasemModeller.Dmodel.Parameter");
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
    // InternalDmodel.g:4601:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDmodel.g:4602:2: (iv_ruleVariable= ruleVariable EOF )
            // InternalDmodel.g:4603:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4610:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:4613:28: ( ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDmodel.g:4614:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDmodel.g:4614:1: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDmodel.g:4614:2: ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalDmodel.g:4614:2: ( (lv_type_0_0= ruleAbstractType ) )
            // InternalDmodel.g:4615:1: (lv_type_0_0= ruleAbstractType )
            {
            // InternalDmodel.g:4615:1: (lv_type_0_0= ruleAbstractType )
            // InternalDmodel.g:4616:3: lv_type_0_0= ruleAbstractType
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getTypeAbstractTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleAbstractType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"datasemModeller.Dmodel.AbstractType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDmodel.g:4632:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:4633:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:4633:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:4634:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

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
    // InternalDmodel.g:4658:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDmodel.g:4659:2: (iv_ruleAction= ruleAction EOF )
            // InternalDmodel.g:4660:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4667:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' ) ;
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
            // InternalDmodel.g:4670:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' ) )
            // InternalDmodel.g:4671:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            {
            // InternalDmodel.g:4671:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            // InternalDmodel.g:4671:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,118,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
                
            // InternalDmodel.g:4675:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:4676:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:4676:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:4677:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_116); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,119,FOLLOW_117); 

                	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
                
            // InternalDmodel.g:4697:1: ( (lv_inputs_3_0= ruleVariable ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==60||LA108_0==62||(LA108_0>=108 && LA108_0<=116)) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalDmodel.g:4698:1: (lv_inputs_3_0= ruleVariable )
                    {
                    // InternalDmodel.g:4698:1: (lv_inputs_3_0= ruleVariable )
                    // InternalDmodel.g:4699:3: lv_inputs_3_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getInputsVariableParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_118);
                    lv_inputs_3_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"inputs",
                            		lv_inputs_3_0, 
                            		"datasemModeller.Dmodel.Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalDmodel.g:4715:3: (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==68) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalDmodel.g:4715:5: otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,68,FOLLOW_119); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_4_0());
            	        
            	    // InternalDmodel.g:4719:1: ( (lv_inputs_5_0= ruleVariable ) )
            	    // InternalDmodel.g:4720:1: (lv_inputs_5_0= ruleVariable )
            	    {
            	    // InternalDmodel.g:4720:1: (lv_inputs_5_0= ruleVariable )
            	    // InternalDmodel.g:4721:3: lv_inputs_5_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionAccess().getInputsVariableParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_118);
            	    lv_inputs_5_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inputs",
            	            		lv_inputs_5_0, 
            	            		"datasemModeller.Dmodel.Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            otherlv_6=(Token)match(input,120,FOLLOW_2); 

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
    // InternalDmodel.g:4749:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalDmodel.g:4750:2: (iv_ruleState= ruleState EOF )
            // InternalDmodel.g:4751:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4758:1: ruleState returns [EObject current=null] : ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) ) ;
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
            // InternalDmodel.g:4761:28: ( ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) ) )
            // InternalDmodel.g:4762:1: ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            {
            // InternalDmodel.g:4762:1: ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==121) ) {
                alt111=1;
            }
            else if ( (LA111_0==122) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalDmodel.g:4762:2: ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalDmodel.g:4762:2: ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalDmodel.g:4762:3: ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalDmodel.g:4762:3: ( (lv_backgroundState_0_0= 'backgroundState' ) )
                    // InternalDmodel.g:4763:1: (lv_backgroundState_0_0= 'backgroundState' )
                    {
                    // InternalDmodel.g:4763:1: (lv_backgroundState_0_0= 'backgroundState' )
                    // InternalDmodel.g:4764:3: lv_backgroundState_0_0= 'backgroundState'
                    {
                    lv_backgroundState_0_0=(Token)match(input,121,FOLLOW_3); 

                            newLeafNode(lv_backgroundState_0_0, grammarAccess.getStateAccess().getBackgroundStateBackgroundStateKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(current, "backgroundState", true, "backgroundState");
                    	    

                    }


                    }

                    // InternalDmodel.g:4777:2: ( (lv_name_1_0= RULE_ID ) )
                    // InternalDmodel.g:4778:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDmodel.g:4778:1: (lv_name_1_0= RULE_ID )
                    // InternalDmodel.g:4779:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:4796:6: (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
                    {
                    // InternalDmodel.g:4796:6: (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
                    // InternalDmodel.g:4796:8: otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,122,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_1_0());
                        
                    // InternalDmodel.g:4800:1: ( (lv_name_3_0= RULE_ID ) )
                    // InternalDmodel.g:4801:1: (lv_name_3_0= RULE_ID )
                    {
                    // InternalDmodel.g:4801:1: (lv_name_3_0= RULE_ID )
                    // InternalDmodel.g:4802:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_57); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,74,FOLLOW_120); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_2());
                        
                    // InternalDmodel.g:4822:1: ( (lv_statements_5_0= ruleStatement ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==RULE_ID||LA110_0==124||(LA110_0>=128 && LA110_0<=130)||LA110_0==132||LA110_0==134||(LA110_0>=139 && LA110_0<=140)) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalDmodel.g:4823:1: (lv_statements_5_0= ruleStatement )
                    	    {
                    	    // InternalDmodel.g:4823:1: (lv_statements_5_0= ruleStatement )
                    	    // InternalDmodel.g:4824:3: lv_statements_5_0= ruleStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatementsStatementParserRuleCall_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_120);
                    	    lv_statements_5_0=ruleStatement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"statements",
                    	            		lv_statements_5_0, 
                    	            		"datasemModeller.Dmodel.Statement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:4852:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalDmodel.g:4853:2: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalDmodel.g:4854:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
             newCompositeNode(grammarAccess.getIfExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;

             current =iv_ruleIfExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4861:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? ) ;
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
            // InternalDmodel.g:4864:28: ( (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? ) )
            // InternalDmodel.g:4865:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? )
            {
            // InternalDmodel.g:4865:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )? )
            // InternalDmodel.g:4865:3: otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )?
            {
            otherlv_0=(Token)match(input,119,FOLLOW_121); 

                	newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_0());
                
            // InternalDmodel.g:4869:1: ( (lv_condition_1_0= ruleCondition ) )
            // InternalDmodel.g:4870:1: (lv_condition_1_0= ruleCondition )
            {
            // InternalDmodel.g:4870:1: (lv_condition_1_0= ruleCondition )
            // InternalDmodel.g:4871:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_122);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"datasemModeller.Dmodel.Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,120,FOLLOW_57); 

                	newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_120); 

                	newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDmodel.g:4895:1: ( (lv_statements_4_0= ruleStatement ) )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==RULE_ID||LA112_0==124||(LA112_0>=128 && LA112_0<=130)||LA112_0==132||LA112_0==134||(LA112_0>=139 && LA112_0<=140)) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalDmodel.g:4896:1: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalDmodel.g:4896:1: (lv_statements_4_0= ruleStatement )
            	    // InternalDmodel.g:4897:3: lv_statements_4_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfExpressionAccess().getStatementsStatementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_120);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_4_0, 
            	            		"datasemModeller.Dmodel.Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);

            otherlv_5=(Token)match(input,77,FOLLOW_123); 

                	newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_5());
                
            // InternalDmodel.g:4917:1: (otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==123) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalDmodel.g:4917:3: otherlv_6= 'else' ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) )
                    {
                    otherlv_6=(Token)match(input,123,FOLLOW_124); 

                        	newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getElseKeyword_6_0());
                        
                    // InternalDmodel.g:4921:1: ( ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) ) | (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' ) )
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==124) ) {
                        alt114=1;
                    }
                    else if ( (LA114_0==74) ) {
                        alt114=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 114, 0, input);

                        throw nvae;
                    }
                    switch (alt114) {
                        case 1 :
                            // InternalDmodel.g:4921:2: ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) )
                            {
                            // InternalDmodel.g:4921:2: ( ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) ) )
                            // InternalDmodel.g:4921:3: ( (lv_hasElseIf_7_0= 'if' ) ) ( (lv_elseIf_8_0= ruleIfExpression ) )
                            {
                            // InternalDmodel.g:4921:3: ( (lv_hasElseIf_7_0= 'if' ) )
                            // InternalDmodel.g:4922:1: (lv_hasElseIf_7_0= 'if' )
                            {
                            // InternalDmodel.g:4922:1: (lv_hasElseIf_7_0= 'if' )
                            // InternalDmodel.g:4923:3: lv_hasElseIf_7_0= 'if'
                            {
                            lv_hasElseIf_7_0=(Token)match(input,124,FOLLOW_116); 

                                    newLeafNode(lv_hasElseIf_7_0, grammarAccess.getIfExpressionAccess().getHasElseIfIfKeyword_6_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getIfExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "hasElseIf", true, "if");
                            	    

                            }


                            }

                            // InternalDmodel.g:4936:2: ( (lv_elseIf_8_0= ruleIfExpression ) )
                            // InternalDmodel.g:4937:1: (lv_elseIf_8_0= ruleIfExpression )
                            {
                            // InternalDmodel.g:4937:1: (lv_elseIf_8_0= ruleIfExpression )
                            // InternalDmodel.g:4938:3: lv_elseIf_8_0= ruleIfExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseIfIfExpressionParserRuleCall_6_1_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_2);
                            lv_elseIf_8_0=ruleIfExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"elseIf",
                                    		lv_elseIf_8_0, 
                                    		"datasemModeller.Dmodel.IfExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDmodel.g:4955:6: (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' )
                            {
                            // InternalDmodel.g:4955:6: (otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}' )
                            // InternalDmodel.g:4955:8: otherlv_9= '{' ( (lv_elses_10_0= ruleStatement ) )* otherlv_11= '}'
                            {
                            otherlv_9=(Token)match(input,74,FOLLOW_120); 

                                	newLeafNode(otherlv_9, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_6_1_1_0());
                                
                            // InternalDmodel.g:4959:1: ( (lv_elses_10_0= ruleStatement ) )*
                            loop113:
                            do {
                                int alt113=2;
                                int LA113_0 = input.LA(1);

                                if ( (LA113_0==RULE_ID||LA113_0==124||(LA113_0>=128 && LA113_0<=130)||LA113_0==132||LA113_0==134||(LA113_0>=139 && LA113_0<=140)) ) {
                                    alt113=1;
                                }


                                switch (alt113) {
                            	case 1 :
                            	    // InternalDmodel.g:4960:1: (lv_elses_10_0= ruleStatement )
                            	    {
                            	    // InternalDmodel.g:4960:1: (lv_elses_10_0= ruleStatement )
                            	    // InternalDmodel.g:4961:3: lv_elses_10_0= ruleStatement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElsesStatementParserRuleCall_6_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_120);
                            	    lv_elses_10_0=ruleStatement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"elses",
                            	            		lv_elses_10_0, 
                            	            		"datasemModeller.Dmodel.Statement");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop113;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:4989:1: entryRuleForExpression returns [EObject current=null] : iv_ruleForExpression= ruleForExpression EOF ;
    public final EObject entryRuleForExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForExpression = null;


        try {
            // InternalDmodel.g:4990:2: (iv_ruleForExpression= ruleForExpression EOF )
            // InternalDmodel.g:4991:2: iv_ruleForExpression= ruleForExpression EOF
            {
             newCompositeNode(grammarAccess.getForExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForExpression=ruleForExpression();

            state._fsp--;

             current =iv_ruleForExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:4998:1: ruleForExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) ;
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
            // InternalDmodel.g:5001:28: ( (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) )
            // InternalDmodel.g:5002:1: (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            {
            // InternalDmodel.g:5002:1: (otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            // InternalDmodel.g:5002:3: otherlv_0= '(' ( (lv_object_1_0= ruleVarExpression ) ) otherlv_2= 'in' ( (lv_set_3_0= ruleVarExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_125); 

                	newLeafNode(otherlv_0, grammarAccess.getForExpressionAccess().getLeftParenthesisKeyword_0());
                
            // InternalDmodel.g:5006:1: ( (lv_object_1_0= ruleVarExpression ) )
            // InternalDmodel.g:5007:1: (lv_object_1_0= ruleVarExpression )
            {
            // InternalDmodel.g:5007:1: (lv_object_1_0= ruleVarExpression )
            // InternalDmodel.g:5008:3: lv_object_1_0= ruleVarExpression
            {
             
            	        newCompositeNode(grammarAccess.getForExpressionAccess().getObjectVarExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_126);
            lv_object_1_0=ruleVarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"object",
                    		lv_object_1_0, 
                    		"datasemModeller.Dmodel.VarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,125,FOLLOW_125); 

                	newLeafNode(otherlv_2, grammarAccess.getForExpressionAccess().getInKeyword_2());
                
            // InternalDmodel.g:5028:1: ( (lv_set_3_0= ruleVarExpression ) )
            // InternalDmodel.g:5029:1: (lv_set_3_0= ruleVarExpression )
            {
            // InternalDmodel.g:5029:1: (lv_set_3_0= ruleVarExpression )
            // InternalDmodel.g:5030:3: lv_set_3_0= ruleVarExpression
            {
             
            	        newCompositeNode(grammarAccess.getForExpressionAccess().getSetVarExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_122);
            lv_set_3_0=ruleVarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"set",
                    		lv_set_3_0, 
                    		"datasemModeller.Dmodel.VarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,120,FOLLOW_57); 

                	newLeafNode(otherlv_4, grammarAccess.getForExpressionAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,74,FOLLOW_120); 

                	newLeafNode(otherlv_5, grammarAccess.getForExpressionAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalDmodel.g:5054:1: ( (lv_statements_6_0= ruleStatement ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==RULE_ID||LA116_0==124||(LA116_0>=128 && LA116_0<=130)||LA116_0==132||LA116_0==134||(LA116_0>=139 && LA116_0<=140)) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalDmodel.g:5055:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalDmodel.g:5055:1: (lv_statements_6_0= ruleStatement )
            	    // InternalDmodel.g:5056:3: lv_statements_6_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForExpressionAccess().getStatementsStatementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_120);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_6_0, 
            	            		"datasemModeller.Dmodel.Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            otherlv_7=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:5084:1: entryRuleWhileExpression returns [EObject current=null] : iv_ruleWhileExpression= ruleWhileExpression EOF ;
    public final EObject entryRuleWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileExpression = null;


        try {
            // InternalDmodel.g:5085:2: (iv_ruleWhileExpression= ruleWhileExpression EOF )
            // InternalDmodel.g:5086:2: iv_ruleWhileExpression= ruleWhileExpression EOF
            {
             newCompositeNode(grammarAccess.getWhileExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileExpression=ruleWhileExpression();

            state._fsp--;

             current =iv_ruleWhileExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5093:1: ruleWhileExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
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
            // InternalDmodel.g:5096:28: ( (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // InternalDmodel.g:5097:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // InternalDmodel.g:5097:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}' )
            // InternalDmodel.g:5097:3: otherlv_0= '(' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_121); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileExpressionAccess().getLeftParenthesisKeyword_0());
                
            // InternalDmodel.g:5101:1: ( (lv_condition_1_0= ruleCondition ) )
            // InternalDmodel.g:5102:1: (lv_condition_1_0= ruleCondition )
            {
            // InternalDmodel.g:5102:1: (lv_condition_1_0= ruleCondition )
            // InternalDmodel.g:5103:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getWhileExpressionAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_122);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"datasemModeller.Dmodel.Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,120,FOLLOW_57); 

                	newLeafNode(otherlv_2, grammarAccess.getWhileExpressionAccess().getRightParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_120); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileExpressionAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDmodel.g:5127:1: ( (lv_statements_4_0= ruleStatement ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==RULE_ID||LA117_0==124||(LA117_0>=128 && LA117_0<=130)||LA117_0==132||LA117_0==134||(LA117_0>=139 && LA117_0<=140)) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalDmodel.g:5128:1: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalDmodel.g:5128:1: (lv_statements_4_0= ruleStatement )
            	    // InternalDmodel.g:5129:3: lv_statements_4_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhileExpressionAccess().getStatementsStatementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_120);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_4_0, 
            	            		"datasemModeller.Dmodel.Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            otherlv_5=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDmodel.g:5157:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalDmodel.g:5158:2: (iv_ruleCondition= ruleCondition EOF )
            // InternalDmodel.g:5159:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5166:1: ruleCondition returns [EObject current=null] : ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? ) ;
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
            // InternalDmodel.g:5169:28: ( ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? ) )
            // InternalDmodel.g:5170:1: ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? )
            {
            // InternalDmodel.g:5170:1: ( ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )? )
            // InternalDmodel.g:5170:2: ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) ) ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )?
            {
            // InternalDmodel.g:5170:2: ( ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) | (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==RULE_ID||(LA118_0>=139 && LA118_0<=140)) ) {
                alt118=1;
            }
            else if ( (LA118_0==119) ) {
                alt118=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalDmodel.g:5170:3: ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) )
                    {
                    // InternalDmodel.g:5170:3: ( ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) )
                    // InternalDmodel.g:5170:4: ( (lv_subjective_0_0= ruleVarExpression ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) )
                    {
                    // InternalDmodel.g:5170:4: ( (lv_subjective_0_0= ruleVarExpression ) )
                    // InternalDmodel.g:5171:1: (lv_subjective_0_0= ruleVarExpression )
                    {
                    // InternalDmodel.g:5171:1: (lv_subjective_0_0= ruleVarExpression )
                    // InternalDmodel.g:5172:3: lv_subjective_0_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getSubjectiveVarExpressionParserRuleCall_0_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_127);
                    lv_subjective_0_0=ruleVarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"subjective",
                            		lv_subjective_0_0, 
                            		"datasemModeller.Dmodel.VarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:5188:2: ( (lv_operator_1_0= ruleOperator ) )
                    // InternalDmodel.g:5189:1: (lv_operator_1_0= ruleOperator )
                    {
                    // InternalDmodel.g:5189:1: (lv_operator_1_0= ruleOperator )
                    // InternalDmodel.g:5190:3: lv_operator_1_0= ruleOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_128);
                    lv_operator_1_0=ruleOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_1_0, 
                            		"datasemModeller.Dmodel.Operator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:5206:2: ( (lv_objective_2_0= ruleExpression ) )
                    // InternalDmodel.g:5207:1: (lv_objective_2_0= ruleExpression )
                    {
                    // InternalDmodel.g:5207:1: (lv_objective_2_0= ruleExpression )
                    // InternalDmodel.g:5208:3: lv_objective_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_129);
                    lv_objective_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"objective",
                            		lv_objective_2_0, 
                            		"datasemModeller.Dmodel.Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:5225:6: (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' )
                    {
                    // InternalDmodel.g:5225:6: (otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')' )
                    // InternalDmodel.g:5225:8: otherlv_3= '(' ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) ) otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,119,FOLLOW_125); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_1_0());
                        
                    // InternalDmodel.g:5229:1: ( ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) ) )
                    // InternalDmodel.g:5229:2: ( (lv_subjective_4_0= ruleVarExpression ) ) ( (lv_operator_5_0= ruleOperator ) ) ( (lv_objective_6_0= ruleExpression ) )
                    {
                    // InternalDmodel.g:5229:2: ( (lv_subjective_4_0= ruleVarExpression ) )
                    // InternalDmodel.g:5230:1: (lv_subjective_4_0= ruleVarExpression )
                    {
                    // InternalDmodel.g:5230:1: (lv_subjective_4_0= ruleVarExpression )
                    // InternalDmodel.g:5231:3: lv_subjective_4_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getSubjectiveVarExpressionParserRuleCall_0_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_127);
                    lv_subjective_4_0=ruleVarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"subjective",
                            		lv_subjective_4_0, 
                            		"datasemModeller.Dmodel.VarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:5247:2: ( (lv_operator_5_0= ruleOperator ) )
                    // InternalDmodel.g:5248:1: (lv_operator_5_0= ruleOperator )
                    {
                    // InternalDmodel.g:5248:1: (lv_operator_5_0= ruleOperator )
                    // InternalDmodel.g:5249:3: lv_operator_5_0= ruleOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_128);
                    lv_operator_5_0=ruleOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_5_0, 
                            		"datasemModeller.Dmodel.Operator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:5265:2: ( (lv_objective_6_0= ruleExpression ) )
                    // InternalDmodel.g:5266:1: (lv_objective_6_0= ruleExpression )
                    {
                    // InternalDmodel.g:5266:1: (lv_objective_6_0= ruleExpression )
                    // InternalDmodel.g:5267:3: lv_objective_6_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_122);
                    lv_objective_6_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"objective",
                            		lv_objective_6_0, 
                            		"datasemModeller.Dmodel.Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,120,FOLLOW_129); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_1_2());
                        

                    }


                    }
                    break;

            }

            // InternalDmodel.g:5287:3: ( ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' ) | ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' ) )?
            int alt119=3;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==126) ) {
                alt119=1;
            }
            else if ( (LA119_0==127) ) {
                alt119=2;
            }
            switch (alt119) {
                case 1 :
                    // InternalDmodel.g:5287:4: ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' )
                    {
                    // InternalDmodel.g:5287:4: ( ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')' )
                    // InternalDmodel.g:5287:5: ( (lv_hasAnd_8_0= 'and' ) ) otherlv_9= '(' ( (lv_andCondition_10_0= ruleCondition ) ) otherlv_11= ')'
                    {
                    // InternalDmodel.g:5287:5: ( (lv_hasAnd_8_0= 'and' ) )
                    // InternalDmodel.g:5288:1: (lv_hasAnd_8_0= 'and' )
                    {
                    // InternalDmodel.g:5288:1: (lv_hasAnd_8_0= 'and' )
                    // InternalDmodel.g:5289:3: lv_hasAnd_8_0= 'and'
                    {
                    lv_hasAnd_8_0=(Token)match(input,126,FOLLOW_116); 

                            newLeafNode(lv_hasAnd_8_0, grammarAccess.getConditionAccess().getHasAndAndKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionRule());
                    	        }
                           		setWithLastConsumed(current, "hasAnd", true, "and");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,119,FOLLOW_121); 

                        	newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_0_1());
                        
                    // InternalDmodel.g:5306:1: ( (lv_andCondition_10_0= ruleCondition ) )
                    // InternalDmodel.g:5307:1: (lv_andCondition_10_0= ruleCondition )
                    {
                    // InternalDmodel.g:5307:1: (lv_andCondition_10_0= ruleCondition )
                    // InternalDmodel.g:5308:3: lv_andCondition_10_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getAndConditionConditionParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_122);
                    lv_andCondition_10_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"andCondition",
                            		lv_andCondition_10_0, 
                            		"datasemModeller.Dmodel.Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,120,FOLLOW_2); 

                        	newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getRightParenthesisKeyword_1_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:5329:6: ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' )
                    {
                    // InternalDmodel.g:5329:6: ( ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')' )
                    // InternalDmodel.g:5329:7: ( (lv_hasOr_12_0= 'or' ) ) otherlv_13= '(' ( (lv_orCondition_14_0= ruleCondition ) ) otherlv_15= ')'
                    {
                    // InternalDmodel.g:5329:7: ( (lv_hasOr_12_0= 'or' ) )
                    // InternalDmodel.g:5330:1: (lv_hasOr_12_0= 'or' )
                    {
                    // InternalDmodel.g:5330:1: (lv_hasOr_12_0= 'or' )
                    // InternalDmodel.g:5331:3: lv_hasOr_12_0= 'or'
                    {
                    lv_hasOr_12_0=(Token)match(input,127,FOLLOW_116); 

                            newLeafNode(lv_hasOr_12_0, grammarAccess.getConditionAccess().getHasOrOrKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionRule());
                    	        }
                           		setWithLastConsumed(current, "hasOr", true, "or");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,119,FOLLOW_121); 

                        	newLeafNode(otherlv_13, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_1_1());
                        
                    // InternalDmodel.g:5348:1: ( (lv_orCondition_14_0= ruleCondition ) )
                    // InternalDmodel.g:5349:1: (lv_orCondition_14_0= ruleCondition )
                    {
                    // InternalDmodel.g:5349:1: (lv_orCondition_14_0= ruleCondition )
                    // InternalDmodel.g:5350:3: lv_orCondition_14_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getOrConditionConditionParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_122);
                    lv_orCondition_14_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"orCondition",
                            		lv_orCondition_14_0, 
                            		"datasemModeller.Dmodel.Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,120,FOLLOW_2); 

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
    // InternalDmodel.g:5378:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDmodel.g:5379:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalDmodel.g:5380:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5387:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) ) ;
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
            // InternalDmodel.g:5390:28: ( ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) ) )
            // InternalDmodel.g:5391:1: ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) )
            {
            // InternalDmodel.g:5391:1: ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) ) | ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' ) | ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' ) | ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' ) | ( (lv_assertStatement_15_0= ruleAssertStatement ) ) )
            int alt120=7;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt120=1;
                }
                break;
            case 129:
                {
                alt120=2;
                }
                break;
            case 130:
                {
                alt120=3;
                }
                break;
            case 124:
                {
                alt120=4;
                }
                break;
            case 132:
                {
                alt120=5;
                }
                break;
            case 134:
                {
                alt120=6;
                }
                break;
            case RULE_ID:
            case 139:
            case 140:
                {
                alt120=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // InternalDmodel.g:5391:2: ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) )
                    {
                    // InternalDmodel.g:5391:2: ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) )
                    // InternalDmodel.g:5391:3: ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) )
                    {
                    // InternalDmodel.g:5391:3: ( (lv_isAction_0_0= 'Do' ) )
                    // InternalDmodel.g:5392:1: (lv_isAction_0_0= 'Do' )
                    {
                    // InternalDmodel.g:5392:1: (lv_isAction_0_0= 'Do' )
                    // InternalDmodel.g:5393:3: lv_isAction_0_0= 'Do'
                    {
                    lv_isAction_0_0=(Token)match(input,128,FOLLOW_3); 

                            newLeafNode(lv_isAction_0_0, grammarAccess.getStatementAccess().getIsActionDoKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isAction", true, "Do");
                    	    

                    }


                    }

                    // InternalDmodel.g:5406:2: ( (lv_actionStatement_1_0= ruleActionStatement ) )
                    // InternalDmodel.g:5407:1: (lv_actionStatement_1_0= ruleActionStatement )
                    {
                    // InternalDmodel.g:5407:1: (lv_actionStatement_1_0= ruleActionStatement )
                    // InternalDmodel.g:5408:3: lv_actionStatement_1_0= ruleActionStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getActionStatementActionStatementParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_actionStatement_1_0=ruleActionStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"actionStatement",
                            		lv_actionStatement_1_0, 
                            		"datasemModeller.Dmodel.ActionStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:5425:6: ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) )
                    {
                    // InternalDmodel.g:5425:6: ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) )
                    // InternalDmodel.g:5425:7: ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) )
                    {
                    // InternalDmodel.g:5425:7: ( (lv_isChangeState_2_0= '->' ) )
                    // InternalDmodel.g:5426:1: (lv_isChangeState_2_0= '->' )
                    {
                    // InternalDmodel.g:5426:1: (lv_isChangeState_2_0= '->' )
                    // InternalDmodel.g:5427:3: lv_isChangeState_2_0= '->'
                    {
                    lv_isChangeState_2_0=(Token)match(input,129,FOLLOW_130); 

                            newLeafNode(lv_isChangeState_2_0, grammarAccess.getStatementAccess().getIsChangeStateHyphenMinusGreaterThanSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isChangeState", true, "->");
                    	    

                    }


                    }

                    // InternalDmodel.g:5440:2: ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) )
                    // InternalDmodel.g:5441:1: (lv_changeStateStatement_3_0= ruleChangeStateStatement )
                    {
                    // InternalDmodel.g:5441:1: (lv_changeStateStatement_3_0= ruleChangeStateStatement )
                    // InternalDmodel.g:5442:3: lv_changeStateStatement_3_0= ruleChangeStateStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getChangeStateStatementChangeStateStatementParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_changeStateStatement_3_0=ruleChangeStateStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"changeStateStatement",
                            		lv_changeStateStatement_3_0, 
                            		"datasemModeller.Dmodel.ChangeStateStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDmodel.g:5459:6: ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) )
                    {
                    // InternalDmodel.g:5459:6: ( ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) ) )
                    // InternalDmodel.g:5459:7: ( (lv_isDeclaration_4_0= 'var' ) ) ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) )
                    {
                    // InternalDmodel.g:5459:7: ( (lv_isDeclaration_4_0= 'var' ) )
                    // InternalDmodel.g:5460:1: (lv_isDeclaration_4_0= 'var' )
                    {
                    // InternalDmodel.g:5460:1: (lv_isDeclaration_4_0= 'var' )
                    // InternalDmodel.g:5461:3: lv_isDeclaration_4_0= 'var'
                    {
                    lv_isDeclaration_4_0=(Token)match(input,130,FOLLOW_119); 

                            newLeafNode(lv_isDeclaration_4_0, grammarAccess.getStatementAccess().getIsDeclarationVarKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isDeclaration", true, "var");
                    	    

                    }


                    }

                    // InternalDmodel.g:5474:2: ( (lv_declarationStatement_5_0= ruleDeclarationStatement ) )
                    // InternalDmodel.g:5475:1: (lv_declarationStatement_5_0= ruleDeclarationStatement )
                    {
                    // InternalDmodel.g:5475:1: (lv_declarationStatement_5_0= ruleDeclarationStatement )
                    // InternalDmodel.g:5476:3: lv_declarationStatement_5_0= ruleDeclarationStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getDeclarationStatementDeclarationStatementParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_declarationStatement_5_0=ruleDeclarationStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"declarationStatement",
                            		lv_declarationStatement_5_0, 
                            		"datasemModeller.Dmodel.DeclarationStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDmodel.g:5493:6: ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' )
                    {
                    // InternalDmodel.g:5493:6: ( ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if' )
                    // InternalDmodel.g:5493:7: ( (lv_isIfExpression_6_0= 'if' ) ) ( (lv_ifExpression_7_0= ruleIfExpression ) ) otherlv_8= 'end if'
                    {
                    // InternalDmodel.g:5493:7: ( (lv_isIfExpression_6_0= 'if' ) )
                    // InternalDmodel.g:5494:1: (lv_isIfExpression_6_0= 'if' )
                    {
                    // InternalDmodel.g:5494:1: (lv_isIfExpression_6_0= 'if' )
                    // InternalDmodel.g:5495:3: lv_isIfExpression_6_0= 'if'
                    {
                    lv_isIfExpression_6_0=(Token)match(input,124,FOLLOW_116); 

                            newLeafNode(lv_isIfExpression_6_0, grammarAccess.getStatementAccess().getIsIfExpressionIfKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isIfExpression", true, "if");
                    	    

                    }


                    }

                    // InternalDmodel.g:5508:2: ( (lv_ifExpression_7_0= ruleIfExpression ) )
                    // InternalDmodel.g:5509:1: (lv_ifExpression_7_0= ruleIfExpression )
                    {
                    // InternalDmodel.g:5509:1: (lv_ifExpression_7_0= ruleIfExpression )
                    // InternalDmodel.g:5510:3: lv_ifExpression_7_0= ruleIfExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getIfExpressionIfExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_131);
                    lv_ifExpression_7_0=ruleIfExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"ifExpression",
                            		lv_ifExpression_7_0, 
                            		"datasemModeller.Dmodel.IfExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,131,FOLLOW_2); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getEndIfKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalDmodel.g:5531:6: ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' )
                    {
                    // InternalDmodel.g:5531:6: ( ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for' )
                    // InternalDmodel.g:5531:7: ( (lv_isForExpression_9_0= 'for' ) ) ( (lv_forExpression_10_0= ruleForExpression ) ) otherlv_11= 'end for'
                    {
                    // InternalDmodel.g:5531:7: ( (lv_isForExpression_9_0= 'for' ) )
                    // InternalDmodel.g:5532:1: (lv_isForExpression_9_0= 'for' )
                    {
                    // InternalDmodel.g:5532:1: (lv_isForExpression_9_0= 'for' )
                    // InternalDmodel.g:5533:3: lv_isForExpression_9_0= 'for'
                    {
                    lv_isForExpression_9_0=(Token)match(input,132,FOLLOW_116); 

                            newLeafNode(lv_isForExpression_9_0, grammarAccess.getStatementAccess().getIsForExpressionForKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isForExpression", true, "for");
                    	    

                    }


                    }

                    // InternalDmodel.g:5546:2: ( (lv_forExpression_10_0= ruleForExpression ) )
                    // InternalDmodel.g:5547:1: (lv_forExpression_10_0= ruleForExpression )
                    {
                    // InternalDmodel.g:5547:1: (lv_forExpression_10_0= ruleForExpression )
                    // InternalDmodel.g:5548:3: lv_forExpression_10_0= ruleForExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getForExpressionForExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_132);
                    lv_forExpression_10_0=ruleForExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"forExpression",
                            		lv_forExpression_10_0, 
                            		"datasemModeller.Dmodel.ForExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,133,FOLLOW_2); 

                        	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getEndForKeyword_4_2());
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalDmodel.g:5569:6: ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' )
                    {
                    // InternalDmodel.g:5569:6: ( ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while' )
                    // InternalDmodel.g:5569:7: ( (lv_isWhileExpression_12_0= 'while' ) ) ( (lv_whileExpression_13_0= ruleWhileExpression ) ) otherlv_14= 'end while'
                    {
                    // InternalDmodel.g:5569:7: ( (lv_isWhileExpression_12_0= 'while' ) )
                    // InternalDmodel.g:5570:1: (lv_isWhileExpression_12_0= 'while' )
                    {
                    // InternalDmodel.g:5570:1: (lv_isWhileExpression_12_0= 'while' )
                    // InternalDmodel.g:5571:3: lv_isWhileExpression_12_0= 'while'
                    {
                    lv_isWhileExpression_12_0=(Token)match(input,134,FOLLOW_116); 

                            newLeafNode(lv_isWhileExpression_12_0, grammarAccess.getStatementAccess().getIsWhileExpressionWhileKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(current, "isWhileExpression", true, "while");
                    	    

                    }


                    }

                    // InternalDmodel.g:5584:2: ( (lv_whileExpression_13_0= ruleWhileExpression ) )
                    // InternalDmodel.g:5585:1: (lv_whileExpression_13_0= ruleWhileExpression )
                    {
                    // InternalDmodel.g:5585:1: (lv_whileExpression_13_0= ruleWhileExpression )
                    // InternalDmodel.g:5586:3: lv_whileExpression_13_0= ruleWhileExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getWhileExpressionWhileExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_133);
                    lv_whileExpression_13_0=ruleWhileExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"whileExpression",
                            		lv_whileExpression_13_0, 
                            		"datasemModeller.Dmodel.WhileExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,135,FOLLOW_2); 

                        	newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getEndWhileKeyword_5_2());
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalDmodel.g:5607:6: ( (lv_assertStatement_15_0= ruleAssertStatement ) )
                    {
                    // InternalDmodel.g:5607:6: ( (lv_assertStatement_15_0= ruleAssertStatement ) )
                    // InternalDmodel.g:5608:1: (lv_assertStatement_15_0= ruleAssertStatement )
                    {
                    // InternalDmodel.g:5608:1: (lv_assertStatement_15_0= ruleAssertStatement )
                    // InternalDmodel.g:5609:3: lv_assertStatement_15_0= ruleAssertStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getAssertStatementAssertStatementParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_assertStatement_15_0=ruleAssertStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"assertStatement",
                            		lv_assertStatement_15_0, 
                            		"datasemModeller.Dmodel.AssertStatement");
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
    // InternalDmodel.g:5633:1: entryRuleDeclarationStatement returns [EObject current=null] : iv_ruleDeclarationStatement= ruleDeclarationStatement EOF ;
    public final EObject entryRuleDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationStatement = null;


        try {
            // InternalDmodel.g:5634:2: (iv_ruleDeclarationStatement= ruleDeclarationStatement EOF )
            // InternalDmodel.g:5635:2: iv_ruleDeclarationStatement= ruleDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getDeclarationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarationStatement=ruleDeclarationStatement();

            state._fsp--;

             current =iv_ruleDeclarationStatement; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5642:1: ruleDeclarationStatement returns [EObject current=null] : (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:5645:28: ( (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? ) )
            // InternalDmodel.g:5646:1: (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? )
            {
            // InternalDmodel.g:5646:1: (this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )? )
            // InternalDmodel.g:5647:5: this_Variable_0= ruleVariable () (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getDeclarationStatementAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_134);
            this_Variable_0=ruleVariable();

            state._fsp--;

             
                    current = this_Variable_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalDmodel.g:5655:1: ()
            // InternalDmodel.g:5656:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getDeclarationStatementAccess().getDeclarationStatementVariableAction_1(),
                        current);
                

            }

            // InternalDmodel.g:5661:2: (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==82) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalDmodel.g:5661:4: otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,82,FOLLOW_128); 

                        	newLeafNode(otherlv_2, grammarAccess.getDeclarationStatementAccess().getEqualsSignKeyword_2_0());
                        
                    // InternalDmodel.g:5665:1: ( (lv_value_3_0= ruleExpression ) )
                    // InternalDmodel.g:5666:1: (lv_value_3_0= ruleExpression )
                    {
                    // InternalDmodel.g:5666:1: (lv_value_3_0= ruleExpression )
                    // InternalDmodel.g:5667:3: lv_value_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationStatementAccess().getValueExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"datasemModeller.Dmodel.Expression");
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
    // InternalDmodel.g:5691:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // InternalDmodel.g:5692:2: (iv_ruleActionStatement= ruleActionStatement EOF )
            // InternalDmodel.g:5693:2: iv_ruleActionStatement= ruleActionStatement EOF
            {
             newCompositeNode(grammarAccess.getActionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionStatement=ruleActionStatement();

            state._fsp--;

             current =iv_ruleActionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5700:1: ruleActionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')' ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputs_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:5703:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')' ) )
            // InternalDmodel.g:5704:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')' )
            {
            // InternalDmodel.g:5704:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')' )
            // InternalDmodel.g:5704:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleVarExpression ) )+ otherlv_3= ')'
            {
            // InternalDmodel.g:5704:2: ( (otherlv_0= RULE_ID ) )
            // InternalDmodel.g:5705:1: (otherlv_0= RULE_ID )
            {
            // InternalDmodel.g:5705:1: (otherlv_0= RULE_ID )
            // InternalDmodel.g:5706:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_116); 

            		newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getActionActionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,119,FOLLOW_125); 

                	newLeafNode(otherlv_1, grammarAccess.getActionStatementAccess().getLeftParenthesisKeyword_1());
                
            // InternalDmodel.g:5721:1: ( (lv_inputs_2_0= ruleVarExpression ) )+
            int cnt122=0;
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==RULE_ID||(LA122_0>=139 && LA122_0<=140)) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // InternalDmodel.g:5722:1: (lv_inputs_2_0= ruleVarExpression )
            	    {
            	    // InternalDmodel.g:5722:1: (lv_inputs_2_0= ruleVarExpression )
            	    // InternalDmodel.g:5723:3: lv_inputs_2_0= ruleVarExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionStatementAccess().getInputsVarExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_135);
            	    lv_inputs_2_0=ruleVarExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inputs",
            	            		lv_inputs_2_0, 
            	            		"datasemModeller.Dmodel.VarExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt122 >= 1 ) break loop122;
                        EarlyExitException eee =
                            new EarlyExitException(122, input);
                        throw eee;
                }
                cnt122++;
            } while (true);

            otherlv_3=(Token)match(input,120,FOLLOW_2); 

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
    // InternalDmodel.g:5751:1: entryRuleAssertStatement returns [EObject current=null] : iv_ruleAssertStatement= ruleAssertStatement EOF ;
    public final EObject entryRuleAssertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertStatement = null;


        try {
            // InternalDmodel.g:5752:2: (iv_ruleAssertStatement= ruleAssertStatement EOF )
            // InternalDmodel.g:5753:2: iv_ruleAssertStatement= ruleAssertStatement EOF
            {
             newCompositeNode(grammarAccess.getAssertStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertStatement=ruleAssertStatement();

            state._fsp--;

             current =iv_ruleAssertStatement; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5760:1: ruleAssertStatement returns [EObject current=null] : ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_input_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:5763:28: ( ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalDmodel.g:5764:1: ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalDmodel.g:5764:1: ( ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalDmodel.g:5764:2: ( (lv_input_0_0= ruleVarExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalDmodel.g:5764:2: ( (lv_input_0_0= ruleVarExpression ) )
            // InternalDmodel.g:5765:1: (lv_input_0_0= ruleVarExpression )
            {
            // InternalDmodel.g:5765:1: (lv_input_0_0= ruleVarExpression )
            // InternalDmodel.g:5766:3: lv_input_0_0= ruleVarExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssertStatementAccess().getInputVarExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_71);
            lv_input_0_0=ruleVarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertStatementRule());
            	        }
                   		set(
                   			current, 
                   			"input",
                    		lv_input_0_0, 
                    		"datasemModeller.Dmodel.VarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,82,FOLLOW_128); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertStatementAccess().getEqualsSignKeyword_1());
                
            // InternalDmodel.g:5786:1: ( (lv_value_2_0= ruleExpression ) )
            // InternalDmodel.g:5787:1: (lv_value_2_0= ruleExpression )
            {
            // InternalDmodel.g:5787:1: (lv_value_2_0= ruleExpression )
            // InternalDmodel.g:5788:3: lv_value_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssertStatementAccess().getValueExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertStatementRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"datasemModeller.Dmodel.Expression");
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
    // InternalDmodel.g:5812:1: entryRuleChangeStateStatement returns [EObject current=null] : iv_ruleChangeStateStatement= ruleChangeStateStatement EOF ;
    public final EObject entryRuleChangeStateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeStateStatement = null;


        try {
            // InternalDmodel.g:5813:2: (iv_ruleChangeStateStatement= ruleChangeStateStatement EOF )
            // InternalDmodel.g:5814:2: iv_ruleChangeStateStatement= ruleChangeStateStatement EOF
            {
             newCompositeNode(grammarAccess.getChangeStateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeStateStatement=ruleChangeStateStatement();

            state._fsp--;

             current =iv_ruleChangeStateStatement; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5821:1: ruleChangeStateStatement returns [EObject current=null] : (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleChangeStateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:5824:28: ( (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDmodel.g:5825:1: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDmodel.g:5825:1: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            // InternalDmodel.g:5825:3: otherlv_0= 'state' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,122,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeStateStatementAccess().getStateKeyword_0());
                
            // InternalDmodel.g:5829:1: ( (otherlv_1= RULE_ID ) )
            // InternalDmodel.g:5830:1: (otherlv_1= RULE_ID )
            {
            // InternalDmodel.g:5830:1: (otherlv_1= RULE_ID )
            // InternalDmodel.g:5831:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChangeStateStatementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalDmodel.g:5850:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDmodel.g:5851:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalDmodel.g:5852:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5859:1: ruleExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:5862:28: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // InternalDmodel.g:5863:1: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // InternalDmodel.g:5863:1: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // InternalDmodel.g:5864:5: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_136);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalDmodel.g:5872:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( ((LA124_0>=136 && LA124_0<=137)) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalDmodel.g:5872:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // InternalDmodel.g:5872:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==136) ) {
            	        alt123=1;
            	    }
            	    else if ( (LA123_0==137) ) {
            	        alt123=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 123, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // InternalDmodel.g:5872:3: ( () otherlv_2= '+' )
            	            {
            	            // InternalDmodel.g:5872:3: ( () otherlv_2= '+' )
            	            // InternalDmodel.g:5872:4: () otherlv_2= '+'
            	            {
            	            // InternalDmodel.g:5872:4: ()
            	            // InternalDmodel.g:5873:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,136,FOLLOW_128); 

            	                	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDmodel.g:5883:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalDmodel.g:5883:6: ( () otherlv_4= '-' )
            	            // InternalDmodel.g:5883:7: () otherlv_4= '-'
            	            {
            	            // InternalDmodel.g:5883:7: ()
            	            // InternalDmodel.g:5884:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,137,FOLLOW_128); 

            	                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDmodel.g:5893:3: ( (lv_right_5_0= ruleTerm ) )
            	    // InternalDmodel.g:5894:1: (lv_right_5_0= ruleTerm )
            	    {
            	    // InternalDmodel.g:5894:1: (lv_right_5_0= ruleTerm )
            	    // InternalDmodel.g:5895:3: lv_right_5_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_136);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"datasemModeller.Dmodel.Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
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
    // InternalDmodel.g:5919:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalDmodel.g:5920:2: (iv_ruleTerm= ruleTerm EOF )
            // InternalDmodel.g:5921:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5928:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:5931:28: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalDmodel.g:5932:1: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalDmodel.g:5932:1: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalDmodel.g:5933:5: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_137);
            this_Factor_0=ruleFactor();

            state._fsp--;

             
                    current = this_Factor_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalDmodel.g:5941:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==106||LA126_0==138) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalDmodel.g:5941:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalDmodel.g:5941:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt125=2;
            	    int LA125_0 = input.LA(1);

            	    if ( (LA125_0==106) ) {
            	        alt125=1;
            	    }
            	    else if ( (LA125_0==138) ) {
            	        alt125=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 125, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt125) {
            	        case 1 :
            	            // InternalDmodel.g:5941:3: ( () otherlv_2= '*' )
            	            {
            	            // InternalDmodel.g:5941:3: ( () otherlv_2= '*' )
            	            // InternalDmodel.g:5941:4: () otherlv_2= '*'
            	            {
            	            // InternalDmodel.g:5941:4: ()
            	            // InternalDmodel.g:5942:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,106,FOLLOW_128); 

            	                	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDmodel.g:5952:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalDmodel.g:5952:6: ( () otherlv_4= '/' )
            	            // InternalDmodel.g:5952:7: () otherlv_4= '/'
            	            {
            	            // InternalDmodel.g:5952:7: ()
            	            // InternalDmodel.g:5953:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,138,FOLLOW_128); 

            	                	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDmodel.g:5962:3: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalDmodel.g:5963:1: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalDmodel.g:5963:1: (lv_right_5_0= ruleFactor )
            	    // InternalDmodel.g:5964:3: lv_right_5_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_137);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"datasemModeller.Dmodel.Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop126;
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
    // InternalDmodel.g:5988:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalDmodel.g:5989:2: (iv_ruleFactor= ruleFactor EOF )
            // InternalDmodel.g:5990:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:5997:1: ruleFactor returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ;
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
            // InternalDmodel.g:6000:28: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) )
            // InternalDmodel.g:6001:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            {
            // InternalDmodel.g:6001:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleVarExpression ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            int alt127=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt127=1;
                }
                break;
            case RULE_ID:
            case 139:
            case 140:
                {
                alt127=2;
                }
                break;
            case RULE_STRING:
                {
                alt127=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt127=4;
                }
                break;
            case 119:
                {
                alt127=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // InternalDmodel.g:6001:2: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // InternalDmodel.g:6001:2: ( (lv_number_0_0= ruleNumber ) )
                    // InternalDmodel.g:6002:1: (lv_number_0_0= ruleNumber )
                    {
                    // InternalDmodel.g:6002:1: (lv_number_0_0= ruleNumber )
                    // InternalDmodel.g:6003:3: lv_number_0_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_number_0_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"datasemModeller.Dmodel.Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:6020:6: ( (lv_variable_1_0= ruleVarExpression ) )
                    {
                    // InternalDmodel.g:6020:6: ( (lv_variable_1_0= ruleVarExpression ) )
                    // InternalDmodel.g:6021:1: (lv_variable_1_0= ruleVarExpression )
                    {
                    // InternalDmodel.g:6021:1: (lv_variable_1_0= ruleVarExpression )
                    // InternalDmodel.g:6022:3: lv_variable_1_0= ruleVarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getVariableVarExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=ruleVarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_1_0, 
                            		"datasemModeller.Dmodel.VarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDmodel.g:6039:6: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalDmodel.g:6039:6: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalDmodel.g:6040:1: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalDmodel.g:6040:1: (lv_string_2_0= RULE_STRING )
                    // InternalDmodel.g:6041:3: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDmodel.g:6058:6: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalDmodel.g:6058:6: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    // InternalDmodel.g:6059:1: (lv_boolean_3_0= RULE_BOOLEAN )
                    {
                    // InternalDmodel.g:6059:1: (lv_boolean_3_0= RULE_BOOLEAN )
                    // InternalDmodel.g:6060:3: lv_boolean_3_0= RULE_BOOLEAN
                    {
                    lv_boolean_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    			newLeafNode(lv_boolean_3_0, grammarAccess.getFactorAccess().getBooleanBOOLEANTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"boolean",
                            		lv_boolean_3_0, 
                            		"datasemModeller.Dmodel.BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDmodel.g:6077:6: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    {
                    // InternalDmodel.g:6077:6: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    // InternalDmodel.g:6077:8: otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,119,FOLLOW_128); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_4_0());
                        
                    // InternalDmodel.g:6081:1: ( (lv_expression_5_0= ruleExpression ) )
                    // InternalDmodel.g:6082:1: (lv_expression_5_0= ruleExpression )
                    {
                    // InternalDmodel.g:6082:1: (lv_expression_5_0= ruleExpression )
                    // InternalDmodel.g:6083:3: lv_expression_5_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_122);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"datasemModeller.Dmodel.Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,120,FOLLOW_2); 

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
    // InternalDmodel.g:6111:1: entryRuleVarExpression returns [EObject current=null] : iv_ruleVarExpression= ruleVarExpression EOF ;
    public final EObject entryRuleVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpression = null;


        try {
            // InternalDmodel.g:6112:2: (iv_ruleVarExpression= ruleVarExpression EOF )
            // InternalDmodel.g:6113:2: iv_ruleVarExpression= ruleVarExpression EOF
            {
             newCompositeNode(grammarAccess.getVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarExpression=ruleVarExpression();

            state._fsp--;

             current =iv_ruleVarExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:6120:1: ruleVarExpression returns [EObject current=null] : ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* ) ;
    public final EObject ruleVarExpression() throws RecognitionException {
        EObject current = null;

        Token lv_self_0_0=null;
        Token lv_context_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_variable_2_0 = null;

        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:6123:28: ( ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* ) )
            // InternalDmodel.g:6124:1: ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* )
            {
            // InternalDmodel.g:6124:1: ( ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )* )
            // InternalDmodel.g:6124:2: ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) ) (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )*
            {
            // InternalDmodel.g:6124:2: ( ( (lv_self_0_0= 'self' ) ) | ( (lv_context_1_0= 'context' ) ) | ( (lv_variable_2_0= ruleQualifiedName ) ) )
            int alt128=3;
            switch ( input.LA(1) ) {
            case 139:
                {
                alt128=1;
                }
                break;
            case 140:
                {
                alt128=2;
                }
                break;
            case RULE_ID:
                {
                alt128=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // InternalDmodel.g:6124:3: ( (lv_self_0_0= 'self' ) )
                    {
                    // InternalDmodel.g:6124:3: ( (lv_self_0_0= 'self' ) )
                    // InternalDmodel.g:6125:1: (lv_self_0_0= 'self' )
                    {
                    // InternalDmodel.g:6125:1: (lv_self_0_0= 'self' )
                    // InternalDmodel.g:6126:3: lv_self_0_0= 'self'
                    {
                    lv_self_0_0=(Token)match(input,139,FOLLOW_44); 

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
                    // InternalDmodel.g:6140:6: ( (lv_context_1_0= 'context' ) )
                    {
                    // InternalDmodel.g:6140:6: ( (lv_context_1_0= 'context' ) )
                    // InternalDmodel.g:6141:1: (lv_context_1_0= 'context' )
                    {
                    // InternalDmodel.g:6141:1: (lv_context_1_0= 'context' )
                    // InternalDmodel.g:6142:3: lv_context_1_0= 'context'
                    {
                    lv_context_1_0=(Token)match(input,140,FOLLOW_44); 

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
                    // InternalDmodel.g:6156:6: ( (lv_variable_2_0= ruleQualifiedName ) )
                    {
                    // InternalDmodel.g:6156:6: ( (lv_variable_2_0= ruleQualifiedName ) )
                    // InternalDmodel.g:6157:1: (lv_variable_2_0= ruleQualifiedName )
                    {
                    // InternalDmodel.g:6157:1: (lv_variable_2_0= ruleQualifiedName )
                    // InternalDmodel.g:6158:3: lv_variable_2_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarExpressionAccess().getVariableQualifiedNameParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_44);
                    lv_variable_2_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_2_0, 
                            		"datasemModeller.Dmodel.QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:6174:3: (otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) ) )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==50) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // InternalDmodel.g:6174:5: otherlv_3= '.' ( (lv_methods_4_0= ruleMethod ) )
            	    {
            	    otherlv_3=(Token)match(input,50,FOLLOW_3); 

            	        	newLeafNode(otherlv_3, grammarAccess.getVarExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // InternalDmodel.g:6178:1: ( (lv_methods_4_0= ruleMethod ) )
            	    // InternalDmodel.g:6179:1: (lv_methods_4_0= ruleMethod )
            	    {
            	    // InternalDmodel.g:6179:1: (lv_methods_4_0= ruleMethod )
            	    // InternalDmodel.g:6180:3: lv_methods_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVarExpressionAccess().getMethodsMethodParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_44);
            	    lv_methods_4_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVarExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_4_0, 
            	            		"datasemModeller.Dmodel.Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop129;
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
    // InternalDmodel.g:6204:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalDmodel.g:6205:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalDmodel.g:6206:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDmodel.g:6213:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' ) ;
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
            // InternalDmodel.g:6216:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' ) )
            // InternalDmodel.g:6217:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' )
            {
            // InternalDmodel.g:6217:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')' )
            // InternalDmodel.g:6217:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_functionMethod_1_0= '(' ) ) ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* ) otherlv_5= ')'
            {
            // InternalDmodel.g:6217:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:6218:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:6218:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:6219:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_116); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalDmodel.g:6235:2: ( (lv_functionMethod_1_0= '(' ) )
            // InternalDmodel.g:6236:1: (lv_functionMethod_1_0= '(' )
            {
            // InternalDmodel.g:6236:1: (lv_functionMethod_1_0= '(' )
            // InternalDmodel.g:6237:3: lv_functionMethod_1_0= '('
            {
            lv_functionMethod_1_0=(Token)match(input,119,FOLLOW_138); 

                    newLeafNode(lv_functionMethod_1_0, grammarAccess.getMethodAccess().getFunctionMethodLeftParenthesisKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(current, "functionMethod", true, "(");
            	    

            }


            }

            // InternalDmodel.g:6250:2: ( ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )* )
            // InternalDmodel.g:6250:3: ( (lv_inputs_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )*
            {
            // InternalDmodel.g:6250:3: ( (lv_inputs_2_0= ruleParameter ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=RULE_ID && LA130_0<=RULE_BOOLEAN)) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalDmodel.g:6251:1: (lv_inputs_2_0= ruleParameter )
                    {
                    // InternalDmodel.g:6251:1: (lv_inputs_2_0= ruleParameter )
                    // InternalDmodel.g:6252:3: lv_inputs_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getInputsParameterParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_118);
                    lv_inputs_2_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"inputs",
                            		lv_inputs_2_0, 
                            		"datasemModeller.Dmodel.Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalDmodel.g:6268:3: (otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) ) )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==68) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // InternalDmodel.g:6268:5: otherlv_3= ',' ( (lv_inputs_4_0= ruleParameter ) )
            	    {
            	    otherlv_3=(Token)match(input,68,FOLLOW_52); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_2_1_0());
            	        
            	    // InternalDmodel.g:6272:1: ( (lv_inputs_4_0= ruleParameter ) )
            	    // InternalDmodel.g:6273:1: (lv_inputs_4_0= ruleParameter )
            	    {
            	    // InternalDmodel.g:6273:1: (lv_inputs_4_0= ruleParameter )
            	    // InternalDmodel.g:6274:3: lv_inputs_4_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getInputsParameterParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_118);
            	    lv_inputs_4_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inputs",
            	            		lv_inputs_4_0, 
            	            		"datasemModeller.Dmodel.Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,120,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xF010000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001A00L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x5000000000000000L,0x001FF00000008000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0040000000002000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0600000000002000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000004000L,0x0000000000026000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000026000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000004000L,0x0000000000082000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000082000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000004000L,0x0000000000202000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000202000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000004000L,0x0000000000400000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000004000L,0x0000000FFF802000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000FFF802000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000FFF002000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000FF2002000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000FF0002000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x000000000A000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x00080000000001F0L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000FE0002000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000FC0002000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000F80002000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000F00002000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x00100000000000C0L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00002000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00002000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000800002000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000004000L,0x0000001000002000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000001000002000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000004000L,0x0000006000002000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000006000002000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000004000002000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000400L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000038000202000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000038000002000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000030000002000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000020000002000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x5000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x5000000000000000L,0x011FF00000000010L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000010L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x5000000000000000L,0x001FF00000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000010L,0x1000000000002000L,0x0000000000001857L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000010L,0x1080000000000000L,0x0000000000001857L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000400L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000010L,0x1000000000000000L,0x0000000000001857L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x00000000000001F0L,0x1080000000000000L,0x0000000000001857L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000010L,0x1100000000000000L,0x0000000000001857L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x00000000000001F0L,0x0100000000000010L});

}