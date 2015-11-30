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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelBuilder'", "'UserLibraries'", "'ServiceProviderTypes'", "'end ServiceProviderTypes'", "'WorkItemTypes'", "'end WorkItemTypes'", "'Services'", "'end Services'", "'GovernanceStrategies'", "'end GovernanceStrategies'", "'end UserLibraries'", "'ExperimentModel'", "'Variables'", "'end Variables'", "'OrganizationalModel'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkItemNetworks'", "'end WorkItemNetworks'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'WINReplications'", "'end WINReplications'", "'end ExperimentSettings'", "'end ExperimentModel'", "'var:'", "'Random.'", "'Normal'", "'Uniform'", "'Exponential'", "'['", "','", "']'", "'{'", "'}'", "'mechanisms'", "'='", "'attributes'", "'hierarchy'", "'WorkItemNetwork'", "'WorkItems'", "'type'", "':'", "'prerequisites'", "'decomposites'", "'analysisEfforts'", "'efforts'", "'impacts'", "'value'", "'arrival'", "'duration'", "'assignTo'", "'strategy'", "'resources'", "'*'", "'skills'", "'boolean'", "'num'", "'string'", "'GovernanceStrategy'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=8;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
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
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__74=74;
    public static final int T__73=73;

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
    // InternalDmodel.g:76:1: ruleModelBuilder returns [EObject current=null] : (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) ( (lv_UserLibraries_2_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_3_0= ruleExperimentModel ) ) ) ;
    public final EObject ruleModelBuilder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_UserLibraries_2_0 = null;

        EObject lv_ExperimentModel_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:79:28: ( (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) ( (lv_UserLibraries_2_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_3_0= ruleExperimentModel ) ) ) )
            // InternalDmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) ( (lv_UserLibraries_2_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_3_0= ruleExperimentModel ) ) )
            {
            // InternalDmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) ( (lv_UserLibraries_2_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_3_0= ruleExperimentModel ) ) )
            // InternalDmodel.g:80:3: otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) ( (lv_UserLibraries_2_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_3_0= ruleExperimentModel ) )
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

            // InternalDmodel.g:102:2: ( (lv_UserLibraries_2_0= ruleUserLibraries ) )
            // InternalDmodel.g:103:1: (lv_UserLibraries_2_0= ruleUserLibraries )
            {
            // InternalDmodel.g:103:1: (lv_UserLibraries_2_0= ruleUserLibraries )
            // InternalDmodel.g:104:3: lv_UserLibraries_2_0= ruleUserLibraries
            {
             
            	        newCompositeNode(grammarAccess.getModelBuilderAccess().getUserLibrariesUserLibrariesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_UserLibraries_2_0=ruleUserLibraries();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBuilderRule());
            	        }
                   		set(
                   			current, 
                   			"UserLibraries",
                    		lv_UserLibraries_2_0, 
                    		"datasemModeller.Dmodel.UserLibraries");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDmodel.g:120:2: ( (lv_ExperimentModel_3_0= ruleExperimentModel ) )
            // InternalDmodel.g:121:1: (lv_ExperimentModel_3_0= ruleExperimentModel )
            {
            // InternalDmodel.g:121:1: (lv_ExperimentModel_3_0= ruleExperimentModel )
            // InternalDmodel.g:122:3: lv_ExperimentModel_3_0= ruleExperimentModel
            {
             
            	        newCompositeNode(grammarAccess.getModelBuilderAccess().getExperimentModelExperimentModelParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_ExperimentModel_3_0=ruleExperimentModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBuilderRule());
            	        }
                   		set(
                   			current, 
                   			"ExperimentModel",
                    		lv_ExperimentModel_3_0, 
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
    // InternalDmodel.g:146:1: entryRuleUserLibraries returns [EObject current=null] : iv_ruleUserLibraries= ruleUserLibraries EOF ;
    public final EObject entryRuleUserLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserLibraries = null;


        try {
            // InternalDmodel.g:147:2: (iv_ruleUserLibraries= ruleUserLibraries EOF )
            // InternalDmodel.g:148:2: iv_ruleUserLibraries= ruleUserLibraries EOF
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
    // InternalDmodel.g:155:1: ruleUserLibraries returns [EObject current=null] : (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )* otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' ) ;
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
        EObject lv_ServiceProviderTypes_2_0 = null;

        EObject lv_WorkItemTypes_5_0 = null;

        EObject lv_Services_8_0 = null;

        EObject lv_GovernanceStrategies_11_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:158:28: ( (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )* otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' ) )
            // InternalDmodel.g:159:1: (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )* otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' )
            {
            // InternalDmodel.g:159:1: (otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )* otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' )
            // InternalDmodel.g:159:3: otherlv_0= 'UserLibraries' otherlv_1= 'ServiceProviderTypes' ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+ otherlv_3= 'end ServiceProviderTypes' otherlv_4= 'WorkItemTypes' ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+ otherlv_6= 'end WorkItemTypes' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )* otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getUserLibrariesAccess().getUserLibrariesKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getUserLibrariesAccess().getServiceProviderTypesKeyword_1());
                
            // InternalDmodel.g:167:1: ( (lv_ServiceProviderTypes_2_0= ruleServiceProviderType ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDmodel.g:168:1: (lv_ServiceProviderTypes_2_0= ruleServiceProviderType )
            	    {
            	    // InternalDmodel.g:168:1: (lv_ServiceProviderTypes_2_0= ruleServiceProviderType )
            	    // InternalDmodel.g:169:3: lv_ServiceProviderTypes_2_0= ruleServiceProviderType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getServiceProviderTypesServiceProviderTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_8);
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

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

                	newLeafNode(otherlv_3, grammarAccess.getUserLibrariesAccess().getEndServiceProviderTypesKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getUserLibrariesAccess().getWorkItemTypesKeyword_4());
                
            // InternalDmodel.g:193:1: ( (lv_WorkItemTypes_5_0= ruleWorkItemType ) )+
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
            	    // InternalDmodel.g:194:1: (lv_WorkItemTypes_5_0= ruleWorkItemType )
            	    {
            	    // InternalDmodel.g:194:1: (lv_WorkItemTypes_5_0= ruleWorkItemType )
            	    // InternalDmodel.g:195:3: lv_WorkItemTypes_5_0= ruleWorkItemType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getWorkItemTypesWorkItemTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
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

            otherlv_6=(Token)match(input,18,FOLLOW_11); 

                	newLeafNode(otherlv_6, grammarAccess.getUserLibrariesAccess().getEndWorkItemTypesKeyword_6());
                
            otherlv_7=(Token)match(input,19,FOLLOW_3); 

                	newLeafNode(otherlv_7, grammarAccess.getUserLibrariesAccess().getServicesKeyword_7());
                
            // InternalDmodel.g:219:1: ( (lv_Services_8_0= ruleService ) )+
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
            	    // InternalDmodel.g:220:1: (lv_Services_8_0= ruleService )
            	    {
            	    // InternalDmodel.g:220:1: (lv_Services_8_0= ruleService )
            	    // InternalDmodel.g:221:3: lv_Services_8_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getServicesServiceParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_Services_8_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Services",
            	            		lv_Services_8_0, 
            	            		"datasemModeller.Dmodel.Service");
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

            otherlv_9=(Token)match(input,20,FOLLOW_13); 

                	newLeafNode(otherlv_9, grammarAccess.getUserLibrariesAccess().getEndServicesKeyword_9());
                
            otherlv_10=(Token)match(input,21,FOLLOW_14); 

                	newLeafNode(otherlv_10, grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesKeyword_10());
                
            // InternalDmodel.g:245:1: ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDmodel.g:246:1: (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy )
            	    {
            	    // InternalDmodel.g:246:1: (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy )
            	    // InternalDmodel.g:247:3: lv_GovernanceStrategies_11_0= ruleGovernanceStrategy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesGovernanceStrategyParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_14);
            	    lv_GovernanceStrategies_11_0=ruleGovernanceStrategy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GovernanceStrategies",
            	            		lv_GovernanceStrategies_11_0, 
            	            		"datasemModeller.Dmodel.GovernanceStrategy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,22,FOLLOW_15); 

                	newLeafNode(otherlv_12, grammarAccess.getUserLibrariesAccess().getEndGovernanceStrategiesKeyword_12());
                
            otherlv_13=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExperimentModel"
    // InternalDmodel.g:279:1: entryRuleExperimentModel returns [EObject current=null] : iv_ruleExperimentModel= ruleExperimentModel EOF ;
    public final EObject entryRuleExperimentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentModel = null;


        try {
            // InternalDmodel.g:280:2: (iv_ruleExperimentModel= ruleExperimentModel EOF )
            // InternalDmodel.g:281:2: iv_ruleExperimentModel= ruleExperimentModel EOF
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
    // InternalDmodel.g:288:1: ruleExperimentModel returns [EObject current=null] : (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'end ExperimentSettings' otherlv_20= 'end ExperimentModel' ) ;
    public final EObject ruleExperimentModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_ExperimentVariables_3_0 = null;

        EObject lv_ServiceProviders_7_0 = null;

        EObject lv_WorkItemNetworks_12_0 = null;

        EObject lv_WINReplications_17_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:291:28: ( (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'end ExperimentSettings' otherlv_20= 'end ExperimentModel' ) )
            // InternalDmodel.g:292:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'end ExperimentSettings' otherlv_20= 'end ExperimentModel' )
            {
            // InternalDmodel.g:292:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'end ExperimentSettings' otherlv_20= 'end ExperimentModel' )
            // InternalDmodel.g:292:3: otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'end ExperimentSettings' otherlv_20= 'end ExperimentModel'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentModelAccess().getExperimentModelKeyword_0());
                
            // InternalDmodel.g:296:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:297:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:297:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:298:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_17); 

                	newLeafNode(otherlv_2, grammarAccess.getExperimentModelAccess().getVariablesKeyword_2());
                
            // InternalDmodel.g:318:1: ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDmodel.g:319:1: (lv_ExperimentVariables_3_0= ruleExperimentVariable )
            	    {
            	    // InternalDmodel.g:319:1: (lv_ExperimentVariables_3_0= ruleExperimentVariable )
            	    // InternalDmodel.g:320:3: lv_ExperimentVariables_3_0= ruleExperimentVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getExperimentVariablesExperimentVariableParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_17);
            	    lv_ExperimentVariables_3_0=ruleExperimentVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ExperimentVariables",
            	            		lv_ExperimentVariables_3_0, 
            	            		"datasemModeller.Dmodel.ExperimentVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_18); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentModelAccess().getEndVariablesKeyword_4());
                
            otherlv_5=(Token)match(input,27,FOLLOW_19); 

                	newLeafNode(otherlv_5, grammarAccess.getExperimentModelAccess().getOrganizationalModelKeyword_5());
                
            otherlv_6=(Token)match(input,28,FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getExperimentModelAccess().getServiceProvidersKeyword_6());
                
            // InternalDmodel.g:348:1: ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDmodel.g:349:1: (lv_ServiceProviders_7_0= ruleServiceProvider )
            	    {
            	    // InternalDmodel.g:349:1: (lv_ServiceProviders_7_0= ruleServiceProvider )
            	    // InternalDmodel.g:350:3: lv_ServiceProviders_7_0= ruleServiceProvider
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getServiceProvidersServiceProviderParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_20);
            	    lv_ServiceProviders_7_0=ruleServiceProvider();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceProviders",
            	            		lv_ServiceProviders_7_0, 
            	            		"datasemModeller.Dmodel.ServiceProvider");
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

            otherlv_8=(Token)match(input,29,FOLLOW_21); 

                	newLeafNode(otherlv_8, grammarAccess.getExperimentModelAccess().getEndServiceProvidersKeyword_8());
                
            otherlv_9=(Token)match(input,30,FOLLOW_22); 

                	newLeafNode(otherlv_9, grammarAccess.getExperimentModelAccess().getEndOrganizationalModelKeyword_9());
                
            otherlv_10=(Token)match(input,31,FOLLOW_23); 

                	newLeafNode(otherlv_10, grammarAccess.getExperimentModelAccess().getWorkItemNetworkModelKeyword_10());
                
            otherlv_11=(Token)match(input,32,FOLLOW_24); 

                	newLeafNode(otherlv_11, grammarAccess.getExperimentModelAccess().getWorkItemNetworksKeyword_11());
                
            // InternalDmodel.g:382:1: ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==54) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDmodel.g:383:1: (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork )
            	    {
            	    // InternalDmodel.g:383:1: (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork )
            	    // InternalDmodel.g:384:3: lv_WorkItemNetworks_12_0= ruleWorkItemNetwork
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWorkItemNetworksWorkItemNetworkParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_25);
            	    lv_WorkItemNetworks_12_0=ruleWorkItemNetwork();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkItemNetworks",
            	            		lv_WorkItemNetworks_12_0, 
            	            		"datasemModeller.Dmodel.WorkItemNetwork");
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

            otherlv_13=(Token)match(input,33,FOLLOW_26); 

                	newLeafNode(otherlv_13, grammarAccess.getExperimentModelAccess().getEndWorkItemNetworksKeyword_13());
                
            otherlv_14=(Token)match(input,34,FOLLOW_27); 

                	newLeafNode(otherlv_14, grammarAccess.getExperimentModelAccess().getEndWorkItemNetworkModelKeyword_14());
                
            otherlv_15=(Token)match(input,35,FOLLOW_28); 

                	newLeafNode(otherlv_15, grammarAccess.getExperimentModelAccess().getExperimentSettingsKeyword_15());
                
            otherlv_16=(Token)match(input,36,FOLLOW_3); 

                	newLeafNode(otherlv_16, grammarAccess.getExperimentModelAccess().getWINReplicationsKeyword_16());
                
            // InternalDmodel.g:416:1: ( (lv_WINReplications_17_0= ruleWINReplication ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDmodel.g:417:1: (lv_WINReplications_17_0= ruleWINReplication )
            	    {
            	    // InternalDmodel.g:417:1: (lv_WINReplications_17_0= ruleWINReplication )
            	    // InternalDmodel.g:418:3: lv_WINReplications_17_0= ruleWINReplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWINReplicationsWINReplicationParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_29);
            	    lv_WINReplications_17_0=ruleWINReplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WINReplications",
            	            		lv_WINReplications_17_0, 
            	            		"datasemModeller.Dmodel.WINReplication");
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

            otherlv_18=(Token)match(input,37,FOLLOW_30); 

                	newLeafNode(otherlv_18, grammarAccess.getExperimentModelAccess().getEndWINReplicationsKeyword_18());
                
            otherlv_19=(Token)match(input,38,FOLLOW_31); 

                	newLeafNode(otherlv_19, grammarAccess.getExperimentModelAccess().getEndExperimentSettingsKeyword_19());
                
            otherlv_20=(Token)match(input,39,FOLLOW_2); 

                	newLeafNode(otherlv_20, grammarAccess.getExperimentModelAccess().getEndExperimentModelKeyword_20());
                

            }


            }

             leaveRule(); 
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
    // InternalDmodel.g:454:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalDmodel.g:455:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalDmodel.g:456:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalDmodel.g:463:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:466:28: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalDmodel.g:467:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalDmodel.g:467:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_DOUBLE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDmodel.g:467:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDmodel.g:475:10: this_DOUBLE_1= RULE_DOUBLE
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


    // $ANTLR start "entryRuleParameter"
    // InternalDmodel.g:490:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // InternalDmodel.g:491:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalDmodel.g:492:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalDmodel.g:499:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_ID_2=null;
        Token this_BOOLEAN_3=null;
        AntlrDatatypeRuleToken this_Number_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:502:28: ( (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // InternalDmodel.g:503:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // InternalDmodel.g:503:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDmodel.g:504:5: this_Number_0= ruleNumber
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
                    // InternalDmodel.g:515:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getParameterAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDmodel.g:523:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getParameterAccess().getIDTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalDmodel.g:531:10: this_BOOLEAN_3= RULE_BOOLEAN
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
    // InternalDmodel.g:546:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalDmodel.g:547:2: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalDmodel.g:548:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
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
    // InternalDmodel.g:555:1: ruleAbstractParameter returns [EObject current=null] : ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        Token lv_isVariable_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:558:28: ( ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) )
            // InternalDmodel.g:559:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
            {
            // InternalDmodel.g:559:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_BOOLEAN)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDmodel.g:559:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalDmodel.g:559:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    // InternalDmodel.g:559:3: ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDmodel.g:559:3: ( (lv_isVariable_0_0= 'var:' ) )
                    // InternalDmodel.g:560:1: (lv_isVariable_0_0= 'var:' )
                    {
                    // InternalDmodel.g:560:1: (lv_isVariable_0_0= 'var:' )
                    // InternalDmodel.g:561:3: lv_isVariable_0_0= 'var:'
                    {
                    lv_isVariable_0_0=(Token)match(input,40,FOLLOW_3); 

                            newLeafNode(lv_isVariable_0_0, grammarAccess.getAbstractParameterAccess().getIsVariableVarKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractParameterRule());
                    	        }
                           		setWithLastConsumed(current, "isVariable", true, "var:");
                    	    

                    }


                    }

                    // InternalDmodel.g:574:2: ( (otherlv_1= RULE_ID ) )
                    // InternalDmodel.g:575:1: (otherlv_1= RULE_ID )
                    {
                    // InternalDmodel.g:575:1: (otherlv_1= RULE_ID )
                    // InternalDmodel.g:576:3: otherlv_1= RULE_ID
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
                    // InternalDmodel.g:588:6: ( (lv_value_2_0= ruleParameter ) )
                    {
                    // InternalDmodel.g:588:6: ( (lv_value_2_0= ruleParameter ) )
                    // InternalDmodel.g:589:1: (lv_value_2_0= ruleParameter )
                    {
                    // InternalDmodel.g:589:1: (lv_value_2_0= ruleParameter )
                    // InternalDmodel.g:590:3: lv_value_2_0= ruleParameter
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
    // InternalDmodel.g:614:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // InternalDmodel.g:615:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // InternalDmodel.g:616:2: iv_ruleNumExpression= ruleNumExpression EOF
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
    // InternalDmodel.g:623:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_distribution_1_0=null;
        AntlrDatatypeRuleToken lv_numValue_0_0 = null;

        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:626:28: ( ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) )
            // InternalDmodel.g:627:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            {
            // InternalDmodel.g:627:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_DOUBLE)) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDmodel.g:627:2: ( (lv_numValue_0_0= ruleNumber ) )
                    {
                    // InternalDmodel.g:627:2: ( (lv_numValue_0_0= ruleNumber ) )
                    // InternalDmodel.g:628:1: (lv_numValue_0_0= ruleNumber )
                    {
                    // InternalDmodel.g:628:1: (lv_numValue_0_0= ruleNumber )
                    // InternalDmodel.g:629:3: lv_numValue_0_0= ruleNumber
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
                    // InternalDmodel.g:646:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    {
                    // InternalDmodel.g:646:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    // InternalDmodel.g:646:7: ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // InternalDmodel.g:646:7: ( (lv_distribution_1_0= 'Random.' ) )
                    // InternalDmodel.g:647:1: (lv_distribution_1_0= 'Random.' )
                    {
                    // InternalDmodel.g:647:1: (lv_distribution_1_0= 'Random.' )
                    // InternalDmodel.g:648:3: lv_distribution_1_0= 'Random.'
                    {
                    lv_distribution_1_0=(Token)match(input,41,FOLLOW_32); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionRandomKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // InternalDmodel.g:661:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // InternalDmodel.g:662:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // InternalDmodel.g:662:1: (lv_numDist_2_0= ruleDistribution )
                    // InternalDmodel.g:663:3: lv_numDist_2_0= ruleDistribution
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


    // $ANTLR start "entryRuleDistribution"
    // InternalDmodel.g:687:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // InternalDmodel.g:688:2: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalDmodel.g:689:2: iv_ruleDistribution= ruleDistribution EOF
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
    // InternalDmodel.g:696:1: ruleDistribution returns [EObject current=null] : ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) ;
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
            // InternalDmodel.g:699:28: ( ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) )
            // InternalDmodel.g:700:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            {
            // InternalDmodel.g:700:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            // InternalDmodel.g:700:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']'
            {
            // InternalDmodel.g:700:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDmodel.g:700:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    {
                    // InternalDmodel.g:700:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    // InternalDmodel.g:701:1: (lv_isNormal_0_0= 'Normal' )
                    {
                    // InternalDmodel.g:701:1: (lv_isNormal_0_0= 'Normal' )
                    // InternalDmodel.g:702:3: lv_isNormal_0_0= 'Normal'
                    {
                    lv_isNormal_0_0=(Token)match(input,42,FOLLOW_33); 

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
                    // InternalDmodel.g:716:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    {
                    // InternalDmodel.g:716:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    // InternalDmodel.g:717:1: (lv_isUniform_1_0= 'Uniform' )
                    {
                    // InternalDmodel.g:717:1: (lv_isUniform_1_0= 'Uniform' )
                    // InternalDmodel.g:718:3: lv_isUniform_1_0= 'Uniform'
                    {
                    lv_isUniform_1_0=(Token)match(input,43,FOLLOW_33); 

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
                    // InternalDmodel.g:732:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    {
                    // InternalDmodel.g:732:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    // InternalDmodel.g:733:1: (lv_isExponential_2_0= 'Exponential' )
                    {
                    // InternalDmodel.g:733:1: (lv_isExponential_2_0= 'Exponential' )
                    // InternalDmodel.g:734:3: lv_isExponential_2_0= 'Exponential'
                    {
                    lv_isExponential_2_0=(Token)match(input,44,FOLLOW_33); 

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

            otherlv_3=(Token)match(input,45,FOLLOW_34); 

                	newLeafNode(otherlv_3, grammarAccess.getDistributionAccess().getLeftSquareBracketKeyword_1());
                
            // InternalDmodel.g:751:1: ( (lv_parameters_4_0= ruleParameter ) )
            // InternalDmodel.g:752:1: (lv_parameters_4_0= ruleParameter )
            {
            // InternalDmodel.g:752:1: (lv_parameters_4_0= ruleParameter )
            // InternalDmodel.g:753:3: lv_parameters_4_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_35);
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

            // InternalDmodel.g:769:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDmodel.g:769:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,46,FOLLOW_34); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDistributionAccess().getCommaKeyword_3_0());
            	        
            	    // InternalDmodel.g:773:1: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalDmodel.g:774:1: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalDmodel.g:774:1: (lv_parameters_6_0= ruleParameter )
            	    // InternalDmodel.g:775:3: lv_parameters_6_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_35);
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
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,47,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGovernanceStrategy"
    // InternalDmodel.g:803:1: entryRuleGovernanceStrategy returns [EObject current=null] : iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF ;
    public final EObject entryRuleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceStrategy = null;


        try {
            // InternalDmodel.g:804:2: (iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF )
            // InternalDmodel.g:805:2: iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF
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
    // InternalDmodel.g:812:1: ruleGovernanceStrategy returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pullStrategy_2_0= rulePullStrategy ) ) otherlv_3= '}' ) ;
    public final EObject ruleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pullStrategy_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:815:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pullStrategy_2_0= rulePullStrategy ) ) otherlv_3= '}' ) )
            // InternalDmodel.g:816:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pullStrategy_2_0= rulePullStrategy ) ) otherlv_3= '}' )
            {
            // InternalDmodel.g:816:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pullStrategy_2_0= rulePullStrategy ) ) otherlv_3= '}' )
            // InternalDmodel.g:816:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pullStrategy_2_0= rulePullStrategy ) ) otherlv_3= '}'
            {
            // InternalDmodel.g:816:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:817:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:817:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:818:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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

            otherlv_1=(Token)match(input,48,FOLLOW_37); 

                	newLeafNode(otherlv_1, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:838:1: ( (lv_pullStrategy_2_0= rulePullStrategy ) )
            // InternalDmodel.g:839:1: (lv_pullStrategy_2_0= rulePullStrategy )
            {
            // InternalDmodel.g:839:1: (lv_pullStrategy_2_0= rulePullStrategy )
            // InternalDmodel.g:840:3: lv_pullStrategy_2_0= rulePullStrategy
            {
             
            	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPullStrategyPullStrategyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_38);
            lv_pullStrategy_2_0=rulePullStrategy();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		set(
                   			current, 
                   			"pullStrategy",
                    		lv_pullStrategy_2_0, 
                    		"datasemModeller.Dmodel.PullStrategy");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulePullStrategy"
    // InternalDmodel.g:868:1: entryRulePullStrategy returns [EObject current=null] : iv_rulePullStrategy= rulePullStrategy EOF ;
    public final EObject entryRulePullStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePullStrategy = null;


        try {
            // InternalDmodel.g:869:2: (iv_rulePullStrategy= rulePullStrategy EOF )
            // InternalDmodel.g:870:2: iv_rulePullStrategy= rulePullStrategy EOF
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
    // InternalDmodel.g:877:1: rulePullStrategy returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) ;
    public final EObject rulePullStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mechanisms_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:880:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) )
            // InternalDmodel.g:881:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            {
            // InternalDmodel.g:881:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            // InternalDmodel.g:881:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_36); 

                	newLeafNode(otherlv_0, grammarAccess.getPullStrategyAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getPullStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:889:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDmodel.g:890:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // InternalDmodel.g:890:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // InternalDmodel.g:891:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPullStrategyAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_3=(Token)match(input,49,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMechanism"
    // InternalDmodel.g:919:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // InternalDmodel.g:920:2: (iv_ruleMechanism= ruleMechanism EOF )
            // InternalDmodel.g:921:2: iv_ruleMechanism= ruleMechanism EOF
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
    // InternalDmodel.g:928:1: ruleMechanism returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )? ) ;
    public final EObject ruleMechanism() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:931:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )? ) )
            // InternalDmodel.g:932:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )? )
            {
            // InternalDmodel.g:932:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )? )
            // InternalDmodel.g:932:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )?
            {
            // InternalDmodel.g:932:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:933:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:933:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:934:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            otherlv_1=(Token)match(input,51,FOLLOW_34); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAccess().getEqualsSignKeyword_1());
                
            // InternalDmodel.g:954:1: ( (lv_value_2_0= ruleParameter ) )
            // InternalDmodel.g:955:1: (lv_value_2_0= ruleParameter )
            {
            // InternalDmodel.g:955:1: (lv_value_2_0= ruleParameter )
            // InternalDmodel.g:956:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_41);
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

            // InternalDmodel.g:972:2: (otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDmodel.g:972:4: otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )* otherlv_9= '}' )? otherlv_10= '}'
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_42); 

                        	newLeafNode(otherlv_3, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalDmodel.g:976:1: (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )* otherlv_9= '}' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==52) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalDmodel.g:976:3: otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )* otherlv_9= '}'
                            {
                            otherlv_4=(Token)match(input,52,FOLLOW_36); 

                                	newLeafNode(otherlv_4, grammarAccess.getMechanismAccess().getAttributesKeyword_3_1_0());
                                
                            otherlv_5=(Token)match(input,48,FOLLOW_3); 

                                	newLeafNode(otherlv_5, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_3_1_1());
                                
                            // InternalDmodel.g:984:1: ( (lv_attributes_6_0= ruleMechanismAttribute ) )
                            // InternalDmodel.g:985:1: (lv_attributes_6_0= ruleMechanismAttribute )
                            {
                            // InternalDmodel.g:985:1: (lv_attributes_6_0= ruleMechanismAttribute )
                            // InternalDmodel.g:986:3: lv_attributes_6_0= ruleMechanismAttribute
                            {
                             
                            	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_3_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_43);
                            lv_attributes_6_0=ruleMechanismAttribute();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getMechanismRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"attributes",
                                    		lv_attributes_6_0, 
                                    		"datasemModeller.Dmodel.MechanismAttribute");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalDmodel.g:1002:2: (otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==46) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalDmodel.g:1002:4: otherlv_7= ',' ( (lv_attributes_8_0= ruleMechanismAttribute ) )
                            	    {
                            	    otherlv_7=(Token)match(input,46,FOLLOW_3); 

                            	        	newLeafNode(otherlv_7, grammarAccess.getMechanismAccess().getCommaKeyword_3_1_3_0());
                            	        
                            	    // InternalDmodel.g:1006:1: ( (lv_attributes_8_0= ruleMechanismAttribute ) )
                            	    // InternalDmodel.g:1007:1: (lv_attributes_8_0= ruleMechanismAttribute )
                            	    {
                            	    // InternalDmodel.g:1007:1: (lv_attributes_8_0= ruleMechanismAttribute )
                            	    // InternalDmodel.g:1008:3: lv_attributes_8_0= ruleMechanismAttribute
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_3_1_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_43);
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


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,49,FOLLOW_38); 

                                	newLeafNode(otherlv_9, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_3_1_4());
                                

                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,49,FOLLOW_2); 

                        	newLeafNode(otherlv_10, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_3_2());
                        

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
    // InternalDmodel.g:1040:1: entryRuleMechanismAttribute returns [EObject current=null] : iv_ruleMechanismAttribute= ruleMechanismAttribute EOF ;
    public final EObject entryRuleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanismAttribute = null;


        try {
            // InternalDmodel.g:1041:2: (iv_ruleMechanismAttribute= ruleMechanismAttribute EOF )
            // InternalDmodel.g:1042:2: iv_ruleMechanismAttribute= ruleMechanismAttribute EOF
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
    // InternalDmodel.g:1049:1: ruleMechanismAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1052:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // InternalDmodel.g:1053:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // InternalDmodel.g:1053:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // InternalDmodel.g:1053:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // InternalDmodel.g:1053:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1054:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1054:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1055:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            otherlv_1=(Token)match(input,51,FOLLOW_34); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAttributeAccess().getEqualsSignKeyword_1());
                
            // InternalDmodel.g:1075:1: ( (lv_value_2_0= ruleParameter ) )
            // InternalDmodel.g:1076:1: (lv_value_2_0= ruleParameter )
            {
            // InternalDmodel.g:1076:1: (lv_value_2_0= ruleParameter )
            // InternalDmodel.g:1077:3: lv_value_2_0= ruleParameter
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


    // $ANTLR start "entryRuleWorkItemType"
    // InternalDmodel.g:1101:1: entryRuleWorkItemType returns [EObject current=null] : iv_ruleWorkItemType= ruleWorkItemType EOF ;
    public final EObject entryRuleWorkItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemType = null;


        try {
            // InternalDmodel.g:1102:2: (iv_ruleWorkItemType= ruleWorkItemType EOF )
            // InternalDmodel.g:1103:2: iv_ruleWorkItemType= ruleWorkItemType EOF
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
    // InternalDmodel.g:1110:1: ruleWorkItemType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' ( (lv_id_6_0= RULE_INT ) )? ) ;
    public final EObject ruleWorkItemType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_hierarchy_4_0=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:1113:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' ( (lv_id_6_0= RULE_INT ) )? ) )
            // InternalDmodel.g:1114:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' ( (lv_id_6_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:1114:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' ( (lv_id_6_0= RULE_INT ) )? )
            // InternalDmodel.g:1114:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' ( (lv_id_6_0= RULE_INT ) )?
            {
            // InternalDmodel.g:1114:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1115:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1115:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1116:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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

            otherlv_1=(Token)match(input,48,FOLLOW_44); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkItemTypeAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:1136:1: (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDmodel.g:1136:3: otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_40); 

                        	newLeafNode(otherlv_2, grammarAccess.getWorkItemTypeAccess().getHierarchyKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,51,FOLLOW_45); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemTypeAccess().getEqualsSignKeyword_2_1());
                        
                    // InternalDmodel.g:1144:1: ( (lv_hierarchy_4_0= RULE_INT ) )
                    // InternalDmodel.g:1145:1: (lv_hierarchy_4_0= RULE_INT )
                    {
                    // InternalDmodel.g:1145:1: (lv_hierarchy_4_0= RULE_INT )
                    // InternalDmodel.g:1146:3: lv_hierarchy_4_0= RULE_INT
                    {
                    lv_hierarchy_4_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    			newLeafNode(lv_hierarchy_4_0, grammarAccess.getWorkItemTypeAccess().getHierarchyINTTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hierarchy",
                            		lv_hierarchy_4_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,49,FOLLOW_46); 

                	newLeafNode(otherlv_5, grammarAccess.getWorkItemTypeAccess().getRightCurlyBracketKeyword_3());
                
            // InternalDmodel.g:1166:1: ( (lv_id_6_0= RULE_INT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDmodel.g:1167:1: (lv_id_6_0= RULE_INT )
                    {
                    // InternalDmodel.g:1167:1: (lv_id_6_0= RULE_INT )
                    // InternalDmodel.g:1168:3: lv_id_6_0= RULE_INT
                    {
                    lv_id_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_6_0, grammarAccess.getWorkItemTypeAccess().getIdINTTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_6_0, 
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


    // $ANTLR start "entryRuleWorkItemNetwork"
    // InternalDmodel.g:1192:1: entryRuleWorkItemNetwork returns [EObject current=null] : iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF ;
    public final EObject entryRuleWorkItemNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemNetwork = null;


        try {
            // InternalDmodel.g:1193:2: (iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF )
            // InternalDmodel.g:1194:2: iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF
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
    // InternalDmodel.g:1201:1: ruleWorkItemNetwork returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? ) ;
    public final EObject ruleWorkItemNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_id_8_0=null;
        EObject lv_workItems_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1204:28: ( (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? ) )
            // InternalDmodel.g:1205:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:1205:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? )
            // InternalDmodel.g:1205:3: otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemNetworkAccess().getWorkItemNetworkKeyword_0());
                
            // InternalDmodel.g:1209:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:1210:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:1210:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:1211:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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

            otherlv_2=(Token)match(input,48,FOLLOW_47); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,55,FOLLOW_36); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkItemNetworkAccess().getWorkItemsKeyword_3());
                
            otherlv_4=(Token)match(input,48,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalDmodel.g:1239:1: ( (lv_workItems_5_0= ruleWorkItem ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDmodel.g:1240:1: (lv_workItems_5_0= ruleWorkItem )
            	    {
            	    // InternalDmodel.g:1240:1: (lv_workItems_5_0= ruleWorkItem )
            	    // InternalDmodel.g:1241:3: lv_workItems_5_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkItemNetworkAccess().getWorkItemsWorkItemParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_workItems_5_0=ruleWorkItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkItemNetworkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"workItems",
            	            		lv_workItems_5_0, 
            	            		"datasemModeller.Dmodel.WorkItem");
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

            otherlv_6=(Token)match(input,49,FOLLOW_38); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,49,FOLLOW_46); 

                	newLeafNode(otherlv_7, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_7());
                
            // InternalDmodel.g:1265:1: ( (lv_id_8_0= RULE_INT ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDmodel.g:1266:1: (lv_id_8_0= RULE_INT )
                    {
                    // InternalDmodel.g:1266:1: (lv_id_8_0= RULE_INT )
                    // InternalDmodel.g:1267:3: lv_id_8_0= RULE_INT
                    {
                    lv_id_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_8_0, grammarAccess.getWorkItemNetworkAccess().getIdINTTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
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
    // $ANTLR end "ruleWorkItemNetwork"


    // $ANTLR start "entryRuleWorkItem"
    // InternalDmodel.g:1291:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // InternalDmodel.g:1292:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // InternalDmodel.g:1293:2: iv_ruleWorkItem= ruleWorkItem EOF
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
    // InternalDmodel.g:1300:1: ruleWorkItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposites' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' ( (lv_value_42_0= ruleNumExpression ) ) )? (otherlv_43= 'arrival' ( (lv_arrivalTime_44_0= RULE_INT ) ) )? (otherlv_45= 'duration' ( (lv_duration_46_0= RULE_INT ) ) )? otherlv_47= '}' ( (lv_id_48_0= RULE_INT ) )? ) ;
    public final EObject ruleWorkItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_hasPredecessors_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_hasSubtasks_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token lv_hasImpacts_35_0=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token lv_arrivalTime_44_0=null;
        Token otherlv_45=null;
        Token lv_duration_46_0=null;
        Token otherlv_47=null;
        Token lv_id_48_0=null;
        EObject lv_requiredAnalysis_19_0 = null;

        EObject lv_requiredAnalysis_21_0 = null;

        EObject lv_requiredAnalysis_25_0 = null;

        EObject lv_requiredAnalysis_27_0 = null;

        EObject lv_requiredServices_31_0 = null;

        EObject lv_requiredServices_33_0 = null;

        EObject lv_impacts_37_0 = null;

        EObject lv_impacts_39_0 = null;

        EObject lv_value_42_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1303:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposites' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' ( (lv_value_42_0= ruleNumExpression ) ) )? (otherlv_43= 'arrival' ( (lv_arrivalTime_44_0= RULE_INT ) ) )? (otherlv_45= 'duration' ( (lv_duration_46_0= RULE_INT ) ) )? otherlv_47= '}' ( (lv_id_48_0= RULE_INT ) )? ) )
            // InternalDmodel.g:1304:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposites' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' ( (lv_value_42_0= ruleNumExpression ) ) )? (otherlv_43= 'arrival' ( (lv_arrivalTime_44_0= RULE_INT ) ) )? (otherlv_45= 'duration' ( (lv_duration_46_0= RULE_INT ) ) )? otherlv_47= '}' ( (lv_id_48_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:1304:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposites' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' ( (lv_value_42_0= ruleNumExpression ) ) )? (otherlv_43= 'arrival' ( (lv_arrivalTime_44_0= RULE_INT ) ) )? (otherlv_45= 'duration' ( (lv_duration_46_0= RULE_INT ) ) )? otherlv_47= '}' ( (lv_id_48_0= RULE_INT ) )? )
            // InternalDmodel.g:1304:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposites' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' ( (lv_value_42_0= ruleNumExpression ) ) )? (otherlv_43= 'arrival' ( (lv_arrivalTime_44_0= RULE_INT ) ) )? (otherlv_45= 'duration' ( (lv_duration_46_0= RULE_INT ) ) )? otherlv_47= '}' ( (lv_id_48_0= RULE_INT ) )?
            {
            // InternalDmodel.g:1304:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1305:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1305:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1306:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            // InternalDmodel.g:1322:2: (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDmodel.g:1322:4: otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_49); 

                        	newLeafNode(otherlv_1, grammarAccess.getWorkItemAccess().getTypeKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,57,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getColonKeyword_1_1());
                        
                    // InternalDmodel.g:1330:1: ( (otherlv_3= RULE_ID ) )
                    // InternalDmodel.g:1331:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDmodel.g:1331:1: (otherlv_3= RULE_ID )
                    // InternalDmodel.g:1332:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_36); 

                    		newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getTypeWorkItemTypeCrossReference_1_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,48,FOLLOW_50); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:1347:1: ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==58) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDmodel.g:1347:2: ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}'
                    {
                    // InternalDmodel.g:1347:2: ( (lv_hasPredecessors_5_0= 'prerequisites' ) )
                    // InternalDmodel.g:1348:1: (lv_hasPredecessors_5_0= 'prerequisites' )
                    {
                    // InternalDmodel.g:1348:1: (lv_hasPredecessors_5_0= 'prerequisites' )
                    // InternalDmodel.g:1349:3: lv_hasPredecessors_5_0= 'prerequisites'
                    {
                    lv_hasPredecessors_5_0=(Token)match(input,58,FOLLOW_36); 

                            newLeafNode(lv_hasPredecessors_5_0, grammarAccess.getWorkItemAccess().getHasPredecessorsPrerequisitesKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasPredecessors", true, "prerequisites");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalDmodel.g:1366:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDmodel.g:1367:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDmodel.g:1367:1: (otherlv_7= RULE_ID )
                    // InternalDmodel.g:1368:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_43); 

                    		newLeafNode(otherlv_7, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // InternalDmodel.g:1379:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==46) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDmodel.g:1379:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,46,FOLLOW_3); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalDmodel.g:1383:1: ( (otherlv_9= RULE_ID ) )
                    	    // InternalDmodel.g:1384:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalDmodel.g:1384:1: (otherlv_9= RULE_ID )
                    	    // InternalDmodel.g:1385:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_43); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,49,FOLLOW_51); 

                        	newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:1400:3: ( ( ( (lv_hasSubtasks_11_0= 'decomposites' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49||LA33_0==59||(LA33_0>=62 && LA33_0<=65)) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=60 && LA33_0<=61)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDmodel.g:1400:4: ( ( (lv_hasSubtasks_11_0= 'decomposites' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )?
                    {
                    // InternalDmodel.g:1400:4: ( ( (lv_hasSubtasks_11_0= 'decomposites' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==59) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalDmodel.g:1400:5: ( (lv_hasSubtasks_11_0= 'decomposites' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )?
                            {
                            // InternalDmodel.g:1400:5: ( (lv_hasSubtasks_11_0= 'decomposites' ) )
                            // InternalDmodel.g:1401:1: (lv_hasSubtasks_11_0= 'decomposites' )
                            {
                            // InternalDmodel.g:1401:1: (lv_hasSubtasks_11_0= 'decomposites' )
                            // InternalDmodel.g:1402:3: lv_hasSubtasks_11_0= 'decomposites'
                            {
                            lv_hasSubtasks_11_0=(Token)match(input,59,FOLLOW_36); 

                                    newLeafNode(lv_hasSubtasks_11_0, grammarAccess.getWorkItemAccess().getHasSubtasksDecompositesKeyword_4_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                   		setWithLastConsumed(current, "hasSubtasks", true, "decomposites");
                            	    

                            }


                            }

                            otherlv_12=(Token)match(input,48,FOLLOW_3); 

                                	newLeafNode(otherlv_12, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_0_1());
                                
                            // InternalDmodel.g:1419:1: ( (otherlv_13= RULE_ID ) )
                            // InternalDmodel.g:1420:1: (otherlv_13= RULE_ID )
                            {
                            // InternalDmodel.g:1420:1: (otherlv_13= RULE_ID )
                            // InternalDmodel.g:1421:3: otherlv_13= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                    
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_43); 

                            		newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_4_0_2_0()); 
                            	

                            }


                            }

                            // InternalDmodel.g:1432:2: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==46) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalDmodel.g:1432:4: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                            	    {
                            	    otherlv_14=(Token)match(input,46,FOLLOW_3); 

                            	        	newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getCommaKeyword_4_0_3_0());
                            	        
                            	    // InternalDmodel.g:1436:1: ( (otherlv_15= RULE_ID ) )
                            	    // InternalDmodel.g:1437:1: (otherlv_15= RULE_ID )
                            	    {
                            	    // InternalDmodel.g:1437:1: (otherlv_15= RULE_ID )
                            	    // InternalDmodel.g:1438:3: otherlv_15= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	    	        }
                            	            
                            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_43); 

                            	    		newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_4_0_3_1_0()); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,49,FOLLOW_52); 

                                	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_0_4());
                                
                            // InternalDmodel.g:1453:1: (otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==60) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // InternalDmodel.g:1453:3: otherlv_17= 'analysisEfforts' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}'
                                    {
                                    otherlv_17=(Token)match(input,60,FOLLOW_36); 

                                        	newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getAnalysisEffortsKeyword_4_0_5_0());
                                        
                                    otherlv_18=(Token)match(input,48,FOLLOW_33); 

                                        	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_0_5_1());
                                        
                                    // InternalDmodel.g:1461:1: ( (lv_requiredAnalysis_19_0= ruleRequiredService ) )
                                    // InternalDmodel.g:1462:1: (lv_requiredAnalysis_19_0= ruleRequiredService )
                                    {
                                    // InternalDmodel.g:1462:1: (lv_requiredAnalysis_19_0= ruleRequiredService )
                                    // InternalDmodel.g:1463:3: lv_requiredAnalysis_19_0= ruleRequiredService
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_4_0_5_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_43);
                                    lv_requiredAnalysis_19_0=ruleRequiredService();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"requiredAnalysis",
                                            		lv_requiredAnalysis_19_0, 
                                            		"datasemModeller.Dmodel.RequiredService");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    // InternalDmodel.g:1479:2: (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )*
                                    loop27:
                                    do {
                                        int alt27=2;
                                        int LA27_0 = input.LA(1);

                                        if ( (LA27_0==46) ) {
                                            alt27=1;
                                        }


                                        switch (alt27) {
                                    	case 1 :
                                    	    // InternalDmodel.g:1479:4: otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) )
                                    	    {
                                    	    otherlv_20=(Token)match(input,46,FOLLOW_33); 

                                    	        	newLeafNode(otherlv_20, grammarAccess.getWorkItemAccess().getCommaKeyword_4_0_5_3_0());
                                    	        
                                    	    // InternalDmodel.g:1483:1: ( (lv_requiredAnalysis_21_0= ruleRequiredService ) )
                                    	    // InternalDmodel.g:1484:1: (lv_requiredAnalysis_21_0= ruleRequiredService )
                                    	    {
                                    	    // InternalDmodel.g:1484:1: (lv_requiredAnalysis_21_0= ruleRequiredService )
                                    	    // InternalDmodel.g:1485:3: lv_requiredAnalysis_21_0= ruleRequiredService
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_4_0_5_3_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_43);
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


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop27;
                                        }
                                    } while (true);

                                    otherlv_22=(Token)match(input,49,FOLLOW_53); 

                                        	newLeafNode(otherlv_22, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_0_5_4());
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:1506:6: ( (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' )
                    {
                    // InternalDmodel.g:1506:6: ( (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' )
                    // InternalDmodel.g:1506:7: (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}'
                    {
                    // InternalDmodel.g:1506:7: (otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==60) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalDmodel.g:1506:9: otherlv_23= 'analysisEfforts' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}'
                            {
                            otherlv_23=(Token)match(input,60,FOLLOW_36); 

                                	newLeafNode(otherlv_23, grammarAccess.getWorkItemAccess().getAnalysisEffortsKeyword_4_1_0_0());
                                
                            otherlv_24=(Token)match(input,48,FOLLOW_33); 

                                	newLeafNode(otherlv_24, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_1_0_1());
                                
                            // InternalDmodel.g:1514:1: ( (lv_requiredAnalysis_25_0= ruleRequiredService ) )
                            // InternalDmodel.g:1515:1: (lv_requiredAnalysis_25_0= ruleRequiredService )
                            {
                            // InternalDmodel.g:1515:1: (lv_requiredAnalysis_25_0= ruleRequiredService )
                            // InternalDmodel.g:1516:3: lv_requiredAnalysis_25_0= ruleRequiredService
                            {
                             
                            	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_4_1_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_43);
                            lv_requiredAnalysis_25_0=ruleRequiredService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"requiredAnalysis",
                                    		lv_requiredAnalysis_25_0, 
                                    		"datasemModeller.Dmodel.RequiredService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalDmodel.g:1532:2: (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==46) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalDmodel.g:1532:4: otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) )
                            	    {
                            	    otherlv_26=(Token)match(input,46,FOLLOW_33); 

                            	        	newLeafNode(otherlv_26, grammarAccess.getWorkItemAccess().getCommaKeyword_4_1_0_3_0());
                            	        
                            	    // InternalDmodel.g:1536:1: ( (lv_requiredAnalysis_27_0= ruleRequiredService ) )
                            	    // InternalDmodel.g:1537:1: (lv_requiredAnalysis_27_0= ruleRequiredService )
                            	    {
                            	    // InternalDmodel.g:1537:1: (lv_requiredAnalysis_27_0= ruleRequiredService )
                            	    // InternalDmodel.g:1538:3: lv_requiredAnalysis_27_0= ruleRequiredService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_4_1_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_43);
                            	    lv_requiredAnalysis_27_0=ruleRequiredService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"requiredAnalysis",
                            	            		lv_requiredAnalysis_27_0, 
                            	            		"datasemModeller.Dmodel.RequiredService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);

                            otherlv_28=(Token)match(input,49,FOLLOW_54); 

                                	newLeafNode(otherlv_28, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_1_0_4());
                                

                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,61,FOLLOW_36); 

                        	newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getEffortsKeyword_4_1_1());
                        
                    otherlv_30=(Token)match(input,48,FOLLOW_33); 

                        	newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_1_2());
                        
                    // InternalDmodel.g:1566:1: ( (lv_requiredServices_31_0= ruleRequiredService ) )
                    // InternalDmodel.g:1567:1: (lv_requiredServices_31_0= ruleRequiredService )
                    {
                    // InternalDmodel.g:1567:1: (lv_requiredServices_31_0= ruleRequiredService )
                    // InternalDmodel.g:1568:3: lv_requiredServices_31_0= ruleRequiredService
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_43);
                    lv_requiredServices_31_0=ruleRequiredService();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"requiredServices",
                            		lv_requiredServices_31_0, 
                            		"datasemModeller.Dmodel.RequiredService");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:1584:2: (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==46) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDmodel.g:1584:4: otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) )
                    	    {
                    	    otherlv_32=(Token)match(input,46,FOLLOW_33); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getWorkItemAccess().getCommaKeyword_4_1_4_0());
                    	        
                    	    // InternalDmodel.g:1588:1: ( (lv_requiredServices_33_0= ruleRequiredService ) )
                    	    // InternalDmodel.g:1589:1: (lv_requiredServices_33_0= ruleRequiredService )
                    	    {
                    	    // InternalDmodel.g:1589:1: (lv_requiredServices_33_0= ruleRequiredService )
                    	    // InternalDmodel.g:1590:3: lv_requiredServices_33_0= ruleRequiredService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_43);
                    	    lv_requiredServices_33_0=ruleRequiredService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiredServices",
                    	            		lv_requiredServices_33_0, 
                    	            		"datasemModeller.Dmodel.RequiredService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,49,FOLLOW_53); 

                        	newLeafNode(otherlv_34, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_1_5());
                        

                    }


                    }
                    break;

            }

            // InternalDmodel.g:1610:3: ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==62) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDmodel.g:1610:4: ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}'
                    {
                    // InternalDmodel.g:1610:4: ( (lv_hasImpacts_35_0= 'impacts' ) )
                    // InternalDmodel.g:1611:1: (lv_hasImpacts_35_0= 'impacts' )
                    {
                    // InternalDmodel.g:1611:1: (lv_hasImpacts_35_0= 'impacts' )
                    // InternalDmodel.g:1612:3: lv_hasImpacts_35_0= 'impacts'
                    {
                    lv_hasImpacts_35_0=(Token)match(input,62,FOLLOW_36); 

                            newLeafNode(lv_hasImpacts_35_0, grammarAccess.getWorkItemAccess().getHasImpactsImpactsKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasImpacts", true, "impacts");
                    	    

                    }


                    }

                    otherlv_36=(Token)match(input,48,FOLLOW_3); 

                        	newLeafNode(otherlv_36, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // InternalDmodel.g:1629:1: ( (lv_impacts_37_0= ruleImpact ) )
                    // InternalDmodel.g:1630:1: (lv_impacts_37_0= ruleImpact )
                    {
                    // InternalDmodel.g:1630:1: (lv_impacts_37_0= ruleImpact )
                    // InternalDmodel.g:1631:3: lv_impacts_37_0= ruleImpact
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_43);
                    lv_impacts_37_0=ruleImpact();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		add(
                           			current, 
                           			"impacts",
                            		lv_impacts_37_0, 
                            		"datasemModeller.Dmodel.Impact");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:1647:2: (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==46) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalDmodel.g:1647:4: otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) )
                    	    {
                    	    otherlv_38=(Token)match(input,46,FOLLOW_3); 

                    	        	newLeafNode(otherlv_38, grammarAccess.getWorkItemAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // InternalDmodel.g:1651:1: ( (lv_impacts_39_0= ruleImpact ) )
                    	    // InternalDmodel.g:1652:1: (lv_impacts_39_0= ruleImpact )
                    	    {
                    	    // InternalDmodel.g:1652:1: (lv_impacts_39_0= ruleImpact )
                    	    // InternalDmodel.g:1653:3: lv_impacts_39_0= ruleImpact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_43);
                    	    lv_impacts_39_0=ruleImpact();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"impacts",
                    	            		lv_impacts_39_0, 
                    	            		"datasemModeller.Dmodel.Impact");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,49,FOLLOW_55); 

                        	newLeafNode(otherlv_40, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:1673:3: (otherlv_41= 'value' ( (lv_value_42_0= ruleNumExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==63) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDmodel.g:1673:5: otherlv_41= 'value' ( (lv_value_42_0= ruleNumExpression ) )
                    {
                    otherlv_41=(Token)match(input,63,FOLLOW_56); 

                        	newLeafNode(otherlv_41, grammarAccess.getWorkItemAccess().getValueKeyword_6_0());
                        
                    // InternalDmodel.g:1677:1: ( (lv_value_42_0= ruleNumExpression ) )
                    // InternalDmodel.g:1678:1: (lv_value_42_0= ruleNumExpression )
                    {
                    // InternalDmodel.g:1678:1: (lv_value_42_0= ruleNumExpression )
                    // InternalDmodel.g:1679:3: lv_value_42_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getValueNumExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_57);
                    lv_value_42_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_42_0, 
                            		"datasemModeller.Dmodel.NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:1695:4: (otherlv_43= 'arrival' ( (lv_arrivalTime_44_0= RULE_INT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==64) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDmodel.g:1695:6: otherlv_43= 'arrival' ( (lv_arrivalTime_44_0= RULE_INT ) )
                    {
                    otherlv_43=(Token)match(input,64,FOLLOW_45); 

                        	newLeafNode(otherlv_43, grammarAccess.getWorkItemAccess().getArrivalKeyword_7_0());
                        
                    // InternalDmodel.g:1699:1: ( (lv_arrivalTime_44_0= RULE_INT ) )
                    // InternalDmodel.g:1700:1: (lv_arrivalTime_44_0= RULE_INT )
                    {
                    // InternalDmodel.g:1700:1: (lv_arrivalTime_44_0= RULE_INT )
                    // InternalDmodel.g:1701:3: lv_arrivalTime_44_0= RULE_INT
                    {
                    lv_arrivalTime_44_0=(Token)match(input,RULE_INT,FOLLOW_58); 

                    			newLeafNode(lv_arrivalTime_44_0, grammarAccess.getWorkItemAccess().getArrivalTimeINTTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arrivalTime",
                            		lv_arrivalTime_44_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:1717:4: (otherlv_45= 'duration' ( (lv_duration_46_0= RULE_INT ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==65) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDmodel.g:1717:6: otherlv_45= 'duration' ( (lv_duration_46_0= RULE_INT ) )
                    {
                    otherlv_45=(Token)match(input,65,FOLLOW_45); 

                        	newLeafNode(otherlv_45, grammarAccess.getWorkItemAccess().getDurationKeyword_8_0());
                        
                    // InternalDmodel.g:1721:1: ( (lv_duration_46_0= RULE_INT ) )
                    // InternalDmodel.g:1722:1: (lv_duration_46_0= RULE_INT )
                    {
                    // InternalDmodel.g:1722:1: (lv_duration_46_0= RULE_INT )
                    // InternalDmodel.g:1723:3: lv_duration_46_0= RULE_INT
                    {
                    lv_duration_46_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    			newLeafNode(lv_duration_46_0, grammarAccess.getWorkItemAccess().getDurationINTTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duration",
                            		lv_duration_46_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_47=(Token)match(input,49,FOLLOW_46); 

                	newLeafNode(otherlv_47, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_9());
                
            // InternalDmodel.g:1743:1: ( (lv_id_48_0= RULE_INT ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDmodel.g:1744:1: (lv_id_48_0= RULE_INT )
                    {
                    // InternalDmodel.g:1744:1: (lv_id_48_0= RULE_INT )
                    // InternalDmodel.g:1745:3: lv_id_48_0= RULE_INT
                    {
                    lv_id_48_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_48_0, grammarAccess.getWorkItemAccess().getIdINTTerminalRuleCall_10_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_48_0, 
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
    // InternalDmodel.g:1769:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalDmodel.g:1770:2: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalDmodel.g:1771:2: iv_ruleRequiredService= ruleRequiredService EOF
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
    // InternalDmodel.g:1778:1: ruleRequiredService returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efforts_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1781:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // InternalDmodel.g:1782:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // InternalDmodel.g:1782:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // InternalDmodel.g:1782:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getLeftSquareBracketKeyword_0());
                
            // InternalDmodel.g:1786:1: ( (otherlv_1= RULE_ID ) )
            // InternalDmodel.g:1787:1: (otherlv_1= RULE_ID )
            {
            // InternalDmodel.g:1787:1: (otherlv_1= RULE_ID )
            // InternalDmodel.g:1788:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredServiceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_59); 

            		newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getServiceTypeServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getCommaKeyword_2());
                
            // InternalDmodel.g:1803:1: ( (lv_efforts_3_0= ruleAbstractParameter ) )
            // InternalDmodel.g:1804:1: (lv_efforts_3_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:1804:1: (lv_efforts_3_0= ruleAbstractParameter )
            // InternalDmodel.g:1805:3: lv_efforts_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getRequiredServiceAccess().getEffortsAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_61);
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

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

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
    // InternalDmodel.g:1833:1: entryRuleImpact returns [EObject current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final EObject entryRuleImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpact = null;


        try {
            // InternalDmodel.g:1834:2: (iv_ruleImpact= ruleImpact EOF )
            // InternalDmodel.g:1835:2: iv_ruleImpact= ruleImpact EOF
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
    // InternalDmodel.g:1842:1: ruleImpact returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) ;
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
            // InternalDmodel.g:1845:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) )
            // InternalDmodel.g:1846:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            {
            // InternalDmodel.g:1846:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            // InternalDmodel.g:1846:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']'
            {
            // InternalDmodel.g:1846:2: ( (otherlv_0= RULE_ID ) )
            // InternalDmodel.g:1847:1: (otherlv_0= RULE_ID )
            {
            // InternalDmodel.g:1847:1: (otherlv_0= RULE_ID )
            // InternalDmodel.g:1848:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImpactRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            		newLeafNode(otherlv_0, grammarAccess.getImpactAccess().getImpactWIWorkItemCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_60); 

                	newLeafNode(otherlv_1, grammarAccess.getImpactAccess().getLeftSquareBracketKeyword_1());
                
            // InternalDmodel.g:1863:1: ( (lv_likelihood_2_0= ruleAbstractParameter ) )
            // InternalDmodel.g:1864:1: (lv_likelihood_2_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:1864:1: (lv_likelihood_2_0= ruleAbstractParameter )
            // InternalDmodel.g:1865:3: lv_likelihood_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getLikelihoodAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_59);
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

            otherlv_3=(Token)match(input,46,FOLLOW_60); 

                	newLeafNode(otherlv_3, grammarAccess.getImpactAccess().getCommaKeyword_3());
                
            // InternalDmodel.g:1885:1: ( (lv_risk_4_0= ruleAbstractParameter ) )
            // InternalDmodel.g:1886:1: (lv_risk_4_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:1886:1: (lv_risk_4_0= ruleAbstractParameter )
            // InternalDmodel.g:1887:3: lv_risk_4_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getRiskAbstractParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_61);
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

            otherlv_5=(Token)match(input,47,FOLLOW_2); 

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


    // $ANTLR start "entryRuleServiceProviderType"
    // InternalDmodel.g:1915:1: entryRuleServiceProviderType returns [EObject current=null] : iv_ruleServiceProviderType= ruleServiceProviderType EOF ;
    public final EObject entryRuleServiceProviderType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProviderType = null;


        try {
            // InternalDmodel.g:1916:2: (iv_ruleServiceProviderType= ruleServiceProviderType EOF )
            // InternalDmodel.g:1917:2: iv_ruleServiceProviderType= ruleServiceProviderType EOF
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
    // InternalDmodel.g:1924:1: ruleServiceProviderType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleServiceProviderType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_hierarchy_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:1927:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}' ) )
            // InternalDmodel.g:1928:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            {
            // InternalDmodel.g:1928:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            // InternalDmodel.g:1928:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}'
            {
            // InternalDmodel.g:1928:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDmodel.g:1929:1: (lv_id_0_0= RULE_INT )
                    {
                    // InternalDmodel.g:1929:1: (lv_id_0_0= RULE_INT )
                    // InternalDmodel.g:1930:3: lv_id_0_0= RULE_INT
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

            // InternalDmodel.g:1946:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:1947:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:1947:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:1948:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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

            otherlv_2=(Token)match(input,48,FOLLOW_44); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceProviderTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:1968:1: (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDmodel.g:1968:3: otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_40); 

                        	newLeafNode(otherlv_3, grammarAccess.getServiceProviderTypeAccess().getHierarchyKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,51,FOLLOW_45); 

                        	newLeafNode(otherlv_4, grammarAccess.getServiceProviderTypeAccess().getEqualsSignKeyword_3_1());
                        
                    // InternalDmodel.g:1976:1: ( (lv_hierarchy_5_0= RULE_INT ) )
                    // InternalDmodel.g:1977:1: (lv_hierarchy_5_0= RULE_INT )
                    {
                    // InternalDmodel.g:1977:1: (lv_hierarchy_5_0= RULE_INT )
                    // InternalDmodel.g:1978:3: lv_hierarchy_5_0= RULE_INT
                    {
                    lv_hierarchy_5_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    			newLeafNode(lv_hierarchy_5_0, grammarAccess.getServiceProviderTypeAccess().getHierarchyINTTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hierarchy",
                            		lv_hierarchy_5_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,49,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getServiceProviderTypeAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleService"
    // InternalDmodel.g:2006:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDmodel.g:2007:2: (iv_ruleService= ruleService EOF )
            // InternalDmodel.g:2008:2: iv_ruleService= ruleService EOF
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
    // InternalDmodel.g:2015:1: ruleService returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )? ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_hierarchy_4_0=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:2018:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )? ) )
            // InternalDmodel.g:2019:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:2019:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )? )
            // InternalDmodel.g:2019:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )?
            {
            // InternalDmodel.g:2019:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2020:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2020:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2021:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_62); 

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

            // InternalDmodel.g:2037:2: (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDmodel.g:2037:4: otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_44); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // InternalDmodel.g:2041:1: (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==53) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalDmodel.g:2041:3: otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) )
                            {
                            otherlv_2=(Token)match(input,53,FOLLOW_40); 

                                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getHierarchyKeyword_1_1_0());
                                
                            otherlv_3=(Token)match(input,51,FOLLOW_45); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getEqualsSignKeyword_1_1_1());
                                
                            // InternalDmodel.g:2049:1: ( (lv_hierarchy_4_0= RULE_INT ) )
                            // InternalDmodel.g:2050:1: (lv_hierarchy_4_0= RULE_INT )
                            {
                            // InternalDmodel.g:2050:1: (lv_hierarchy_4_0= RULE_INT )
                            // InternalDmodel.g:2051:3: lv_hierarchy_4_0= RULE_INT
                            {
                            lv_hierarchy_4_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                            			newLeafNode(lv_hierarchy_4_0, grammarAccess.getServiceAccess().getHierarchyINTTerminalRuleCall_1_1_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"hierarchy",
                                    		lv_hierarchy_4_0, 
                                    		"org.eclipse.xtext.common.Terminals.INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,49,FOLLOW_46); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_1_2());
                        

                    }
                    break;

            }

            // InternalDmodel.g:2071:3: ( (lv_id_6_0= RULE_INT ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDmodel.g:2072:1: (lv_id_6_0= RULE_INT )
                    {
                    // InternalDmodel.g:2072:1: (lv_id_6_0= RULE_INT )
                    // InternalDmodel.g:2073:3: lv_id_6_0= RULE_INT
                    {
                    lv_id_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_6_0, grammarAccess.getServiceAccess().getIdINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_6_0, 
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
    // InternalDmodel.g:2097:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // InternalDmodel.g:2098:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // InternalDmodel.g:2099:2: iv_ruleServiceProvider= ruleServiceProvider EOF
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
    // InternalDmodel.g:2106:1: ruleServiceProvider returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'resources' otherlv_15= ':' ( (lv_resources_16_0= ruleAsset ) )+ )? otherlv_17= '}' ( (lv_id_18_0= RULE_INT ) )? ) ;
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
        Token otherlv_17=null;
        Token lv_id_18_0=null;
        EObject lv_resources_16_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:2109:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'resources' otherlv_15= ':' ( (lv_resources_16_0= ruleAsset ) )+ )? otherlv_17= '}' ( (lv_id_18_0= RULE_INT ) )? ) )
            // InternalDmodel.g:2110:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'resources' otherlv_15= ':' ( (lv_resources_16_0= ruleAsset ) )+ )? otherlv_17= '}' ( (lv_id_18_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:2110:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'resources' otherlv_15= ':' ( (lv_resources_16_0= ruleAsset ) )+ )? otherlv_17= '}' ( (lv_id_18_0= RULE_INT ) )? )
            // InternalDmodel.g:2110:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'resources' otherlv_15= ':' ( (lv_resources_16_0= ruleAsset ) )+ )? otherlv_17= '}' ( (lv_id_18_0= RULE_INT ) )?
            {
            // InternalDmodel.g:2110:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2111:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2111:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2112:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            // InternalDmodel.g:2128:2: (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDmodel.g:2128:4: otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_49); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getTypeKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,57,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceProviderAccess().getColonKeyword_1_1());
                        
                    // InternalDmodel.g:2136:1: ( (otherlv_3= RULE_ID ) )
                    // InternalDmodel.g:2137:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDmodel.g:2137:1: (otherlv_3= RULE_ID )
                    // InternalDmodel.g:2138:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_36); 

                    		newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getTypeServiceProviderTypeCrossReference_1_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,48,FOLLOW_63); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:2153:1: (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==66) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDmodel.g:2153:3: otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_36); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderAccess().getAssignToKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalDmodel.g:2161:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDmodel.g:2162:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDmodel.g:2162:1: (otherlv_7= RULE_ID )
                    // InternalDmodel.g:2163:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_43); 

                    		newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // InternalDmodel.g:2174:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==46) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalDmodel.g:2174:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,46,FOLLOW_3); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalDmodel.g:2178:1: ( (otherlv_9= RULE_ID ) )
                    	    // InternalDmodel.g:2179:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalDmodel.g:2179:1: (otherlv_9= RULE_ID )
                    	    // InternalDmodel.g:2180:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_43); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,49,FOLLOW_64); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:2195:3: (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==67) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDmodel.g:2195:5: otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,67,FOLLOW_49); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getStrategyKeyword_4_0());
                        
                    otherlv_12=(Token)match(input,57,FOLLOW_3); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getColonKeyword_4_1());
                        
                    // InternalDmodel.g:2203:1: ( (otherlv_13= RULE_ID ) )
                    // InternalDmodel.g:2204:1: (otherlv_13= RULE_ID )
                    {
                    // InternalDmodel.g:2204:1: (otherlv_13= RULE_ID )
                    // InternalDmodel.g:2205:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_65); 

                    		newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getGovernanceStrategyGovernanceStrategyCrossReference_4_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:2216:4: (otherlv_14= 'resources' otherlv_15= ':' ( (lv_resources_16_0= ruleAsset ) )+ )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==68) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDmodel.g:2216:6: otherlv_14= 'resources' otherlv_15= ':' ( (lv_resources_16_0= ruleAsset ) )+
                    {
                    otherlv_14=(Token)match(input,68,FOLLOW_49); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getResourcesKeyword_5_0());
                        
                    otherlv_15=(Token)match(input,57,FOLLOW_3); 

                        	newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getColonKeyword_5_1());
                        
                    // InternalDmodel.g:2224:1: ( (lv_resources_16_0= ruleAsset ) )+
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
                    	    // InternalDmodel.g:2225:1: (lv_resources_16_0= ruleAsset )
                    	    {
                    	    // InternalDmodel.g:2225:1: (lv_resources_16_0= ruleAsset )
                    	    // InternalDmodel.g:2226:3: lv_resources_16_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_39);
                    	    lv_resources_16_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_16_0, 
                    	            		"datasemModeller.Dmodel.Asset");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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


                    }
                    break;

            }

            otherlv_17=(Token)match(input,49,FOLLOW_46); 

                	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_6());
                
            // InternalDmodel.g:2246:1: ( (lv_id_18_0= RULE_INT ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDmodel.g:2247:1: (lv_id_18_0= RULE_INT )
                    {
                    // InternalDmodel.g:2247:1: (lv_id_18_0= RULE_INT )
                    // InternalDmodel.g:2248:3: lv_id_18_0= RULE_INT
                    {
                    lv_id_18_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_18_0, grammarAccess.getServiceProviderAccess().getIdINTTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_18_0, 
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


    // $ANTLR start "entryRuleAsset"
    // InternalDmodel.g:2272:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // InternalDmodel.g:2273:2: (iv_ruleAsset= ruleAsset EOF )
            // InternalDmodel.g:2274:2: iv_ruleAsset= ruleAsset EOF
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
    // InternalDmodel.g:2281:1: ruleAsset returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) ;
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
            // InternalDmodel.g:2284:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) )
            // InternalDmodel.g:2285:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:2285:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            // InternalDmodel.g:2285:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )?
            {
            // InternalDmodel.g:2285:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2286:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2286:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2287:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_66); 

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

            otherlv_1=(Token)match(input,69,FOLLOW_60); 

                	newLeafNode(otherlv_1, grammarAccess.getAssetAccess().getAsteriskKeyword_1());
                
            // InternalDmodel.g:2307:1: ( (lv_number_2_0= ruleAbstractParameter ) )
            // InternalDmodel.g:2308:1: (lv_number_2_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:2308:1: (lv_number_2_0= ruleAbstractParameter )
            // InternalDmodel.g:2309:3: lv_number_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getAssetAccess().getNumberAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_36);
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

            otherlv_3=(Token)match(input,48,FOLLOW_67); 

                	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDmodel.g:2329:1: (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==70) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDmodel.g:2329:3: otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_49); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getSkillsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,57,FOLLOW_33); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getColonKeyword_4_1());
                        
                    // InternalDmodel.g:2337:1: ( (lv_skillSet_6_0= ruleSkill ) )
                    // InternalDmodel.g:2338:1: (lv_skillSet_6_0= ruleSkill )
                    {
                    // InternalDmodel.g:2338:1: (lv_skillSet_6_0= ruleSkill )
                    // InternalDmodel.g:2339:3: lv_skillSet_6_0= ruleSkill
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_43);
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

                    // InternalDmodel.g:2355:2: (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==46) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalDmodel.g:2355:4: otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) )
                    	    {
                    	    otherlv_7=(Token)match(input,46,FOLLOW_33); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalDmodel.g:2359:1: ( (lv_skillSet_8_0= ruleSkill ) )
                    	    // InternalDmodel.g:2360:1: (lv_skillSet_8_0= ruleSkill )
                    	    {
                    	    // InternalDmodel.g:2360:1: (lv_skillSet_8_0= ruleSkill )
                    	    // InternalDmodel.g:2361:3: lv_skillSet_8_0= ruleSkill
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,49,FOLLOW_46); 

                	newLeafNode(otherlv_9, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5());
                
            // InternalDmodel.g:2381:1: ( (lv_id_10_0= RULE_INT ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDmodel.g:2382:1: (lv_id_10_0= RULE_INT )
                    {
                    // InternalDmodel.g:2382:1: (lv_id_10_0= RULE_INT )
                    // InternalDmodel.g:2383:3: lv_id_10_0= RULE_INT
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
    // InternalDmodel.g:2407:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // InternalDmodel.g:2408:2: (iv_ruleSkill= ruleSkill EOF )
            // InternalDmodel.g:2409:2: iv_ruleSkill= ruleSkill EOF
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
    // InternalDmodel.g:2416:1: ruleSkill returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efficiency_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:2419:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // InternalDmodel.g:2420:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // InternalDmodel.g:2420:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // InternalDmodel.g:2420:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSkillAccess().getLeftSquareBracketKeyword_0());
                
            // InternalDmodel.g:2424:1: ( (otherlv_1= RULE_ID ) )
            // InternalDmodel.g:2425:1: (otherlv_1= RULE_ID )
            {
            // InternalDmodel.g:2425:1: (otherlv_1= RULE_ID )
            // InternalDmodel.g:2426:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkillRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_59); 

            		newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getServiceServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getCommaKeyword_2());
                
            // InternalDmodel.g:2441:1: ( (lv_efficiency_3_0= ruleAbstractParameter ) )
            // InternalDmodel.g:2442:1: (lv_efficiency_3_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:2442:1: (lv_efficiency_3_0= ruleAbstractParameter )
            // InternalDmodel.g:2443:3: lv_efficiency_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getSkillAccess().getEfficiencyAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_61);
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

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExperimentVariable"
    // InternalDmodel.g:2471:1: entryRuleExperimentVariable returns [EObject current=null] : iv_ruleExperimentVariable= ruleExperimentVariable EOF ;
    public final EObject entryRuleExperimentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentVariable = null;


        try {
            // InternalDmodel.g:2472:2: (iv_ruleExperimentVariable= ruleExperimentVariable EOF )
            // InternalDmodel.g:2473:2: iv_ruleExperimentVariable= ruleExperimentVariable EOF
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
    // InternalDmodel.g:2480:1: ruleExperimentVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) ;
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
            // InternalDmodel.g:2483:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) )
            // InternalDmodel.g:2484:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            {
            // InternalDmodel.g:2484:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            // InternalDmodel.g:2484:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
            {
            // InternalDmodel.g:2484:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2485:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2485:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2486:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_49); 

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

            otherlv_1=(Token)match(input,57,FOLLOW_68); 

                	newLeafNode(otherlv_1, grammarAccess.getExperimentVariableAccess().getColonKeyword_1());
                
            // InternalDmodel.g:2506:1: ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
            int alt55=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt55=1;
                }
                break;
            case 72:
                {
                alt55=2;
                }
                break;
            case 41:
                {
                alt55=3;
                }
                break;
            case 73:
                {
                alt55=4;
                }
                break;
            case 74:
                {
                alt55=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalDmodel.g:2506:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalDmodel.g:2506:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    // InternalDmodel.g:2506:3: ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalDmodel.g:2506:3: ( (lv_boolean_2_0= 'boolean' ) )
                    // InternalDmodel.g:2507:1: (lv_boolean_2_0= 'boolean' )
                    {
                    // InternalDmodel.g:2507:1: (lv_boolean_2_0= 'boolean' )
                    // InternalDmodel.g:2508:3: lv_boolean_2_0= 'boolean'
                    {
                    lv_boolean_2_0=(Token)match(input,71,FOLLOW_69); 

                            newLeafNode(lv_boolean_2_0, grammarAccess.getExperimentVariableAccess().getBooleanBooleanKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "boolean", true, "boolean");
                    	    

                    }


                    }

                    // InternalDmodel.g:2521:2: ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    // InternalDmodel.g:2522:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    {
                    // InternalDmodel.g:2522:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    // InternalDmodel.g:2523:3: lv_booleanValue_3_0= RULE_BOOLEAN
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
                    // InternalDmodel.g:2540:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    {
                    // InternalDmodel.g:2540:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    // InternalDmodel.g:2540:7: ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) )
                    {
                    // InternalDmodel.g:2540:7: ( (lv_num_4_0= 'num' ) )
                    // InternalDmodel.g:2541:1: (lv_num_4_0= 'num' )
                    {
                    // InternalDmodel.g:2541:1: (lv_num_4_0= 'num' )
                    // InternalDmodel.g:2542:3: lv_num_4_0= 'num'
                    {
                    lv_num_4_0=(Token)match(input,72,FOLLOW_70); 

                            newLeafNode(lv_num_4_0, grammarAccess.getExperimentVariableAccess().getNumNumKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "num", true, "num");
                    	    

                    }


                    }

                    // InternalDmodel.g:2555:2: ( (lv_numValue_5_0= ruleNumber ) )
                    // InternalDmodel.g:2556:1: (lv_numValue_5_0= ruleNumber )
                    {
                    // InternalDmodel.g:2556:1: (lv_numValue_5_0= ruleNumber )
                    // InternalDmodel.g:2557:3: lv_numValue_5_0= ruleNumber
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
                    // InternalDmodel.g:2574:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    {
                    // InternalDmodel.g:2574:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    // InternalDmodel.g:2574:7: ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) )
                    {
                    // InternalDmodel.g:2574:7: ( (lv_distribution_6_0= 'Random.' ) )
                    // InternalDmodel.g:2575:1: (lv_distribution_6_0= 'Random.' )
                    {
                    // InternalDmodel.g:2575:1: (lv_distribution_6_0= 'Random.' )
                    // InternalDmodel.g:2576:3: lv_distribution_6_0= 'Random.'
                    {
                    lv_distribution_6_0=(Token)match(input,41,FOLLOW_32); 

                            newLeafNode(lv_distribution_6_0, grammarAccess.getExperimentVariableAccess().getDistributionRandomKeyword_2_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // InternalDmodel.g:2589:2: ( (lv_numDist_7_0= ruleDistribution ) )
                    // InternalDmodel.g:2590:1: (lv_numDist_7_0= ruleDistribution )
                    {
                    // InternalDmodel.g:2590:1: (lv_numDist_7_0= ruleDistribution )
                    // InternalDmodel.g:2591:3: lv_numDist_7_0= ruleDistribution
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
                    // InternalDmodel.g:2608:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    {
                    // InternalDmodel.g:2608:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    // InternalDmodel.g:2608:7: ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) )
                    {
                    // InternalDmodel.g:2608:7: ( (lv_string_8_0= 'string' ) )
                    // InternalDmodel.g:2609:1: (lv_string_8_0= 'string' )
                    {
                    // InternalDmodel.g:2609:1: (lv_string_8_0= 'string' )
                    // InternalDmodel.g:2610:3: lv_string_8_0= 'string'
                    {
                    lv_string_8_0=(Token)match(input,73,FOLLOW_71); 

                            newLeafNode(lv_string_8_0, grammarAccess.getExperimentVariableAccess().getStringStringKeyword_2_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "string", true, "string");
                    	    

                    }


                    }

                    // InternalDmodel.g:2623:2: ( (lv_stringValue_9_0= RULE_STRING ) )
                    // InternalDmodel.g:2624:1: (lv_stringValue_9_0= RULE_STRING )
                    {
                    // InternalDmodel.g:2624:1: (lv_stringValue_9_0= RULE_STRING )
                    // InternalDmodel.g:2625:3: lv_stringValue_9_0= RULE_STRING
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
                    // InternalDmodel.g:2642:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    {
                    // InternalDmodel.g:2642:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    // InternalDmodel.g:2642:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    {
                    // InternalDmodel.g:2642:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) )
                    // InternalDmodel.g:2643:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    {
                    // InternalDmodel.g:2643:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    // InternalDmodel.g:2644:3: lv_strategy_10_0= 'GovernanceStrategy'
                    {
                    lv_strategy_10_0=(Token)match(input,74,FOLLOW_3); 

                            newLeafNode(lv_strategy_10_0, grammarAccess.getExperimentVariableAccess().getStrategyGovernanceStrategyKeyword_2_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "strategy", true, "GovernanceStrategy");
                    	    

                    }


                    }

                    // InternalDmodel.g:2657:2: ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    // InternalDmodel.g:2658:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    {
                    // InternalDmodel.g:2658:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    // InternalDmodel.g:2659:3: lv_strategyValue_11_0= ruleGovernanceStrategy
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


    // $ANTLR start "entryRuleWINReplication"
    // InternalDmodel.g:2683:1: entryRuleWINReplication returns [EObject current=null] : iv_ruleWINReplication= ruleWINReplication EOF ;
    public final EObject entryRuleWINReplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWINReplication = null;


        try {
            // InternalDmodel.g:2684:2: (iv_ruleWINReplication= ruleWINReplication EOF )
            // InternalDmodel.g:2685:2: iv_ruleWINReplication= ruleWINReplication EOF
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
    // InternalDmodel.g:2692:1: ruleWINReplication returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_numReplications_2_0= RULE_INT ) ) ) ;
    public final EObject ruleWINReplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_numReplications_2_0=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:2695:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_numReplications_2_0= RULE_INT ) ) ) )
            // InternalDmodel.g:2696:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_numReplications_2_0= RULE_INT ) ) )
            {
            // InternalDmodel.g:2696:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_numReplications_2_0= RULE_INT ) ) )
            // InternalDmodel.g:2696:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_numReplications_2_0= RULE_INT ) )
            {
            // InternalDmodel.g:2696:2: ( (otherlv_0= RULE_ID ) )
            // InternalDmodel.g:2697:1: (otherlv_0= RULE_ID )
            {
            // InternalDmodel.g:2697:1: (otherlv_0= RULE_ID )
            // InternalDmodel.g:2698:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_66); 

            		newLeafNode(otherlv_0, grammarAccess.getWINReplicationAccess().getWorkItemNetworkWorkItemNetworkCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_45); 

                	newLeafNode(otherlv_1, grammarAccess.getWINReplicationAccess().getAsteriskKeyword_1());
                
            // InternalDmodel.g:2713:1: ( (lv_numReplications_2_0= RULE_INT ) )
            // InternalDmodel.g:2714:1: (lv_numReplications_2_0= RULE_INT )
            {
            // InternalDmodel.g:2714:1: (lv_numReplications_2_0= RULE_INT )
            // InternalDmodel.g:2715:3: lv_numReplications_2_0= RULE_INT
            {
            lv_numReplications_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_numReplications_2_0, grammarAccess.getWINReplicationAccess().getNumReplicationsINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"numReplications",
                    		lv_numReplications_2_0, 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xFC02000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xF802000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xD002000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xC002000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x8002000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000020000000060L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00000100000001F0L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0001000000000022L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0002000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000080L});

}