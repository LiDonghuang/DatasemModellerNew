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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelBuilder'", "'UserLibraries'", "'ServiceProviderTypes'", "'end ServiceProviderTypes'", "'WorkItemTypes'", "'end WorkItemTypes'", "'Services'", "'end Services'", "'GovernanceStrategies'", "'end GovernanceStrategies'", "'end UserLibraries'", "'ExperimentModel'", "'Variables'", "'end Variables'", "'OrganizationalModel'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkItemNetworks'", "'end WorkItemNetworks'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'WINReplications'", "'end WINReplications'", "'ExperimentParameters'", "'end ExperimentParameters'", "'end ExperimentSettings'", "'end ExperimentModel'", "'var:'", "'Random.'", "'Normal'", "'Uniform'", "'Exponential'", "'['", "','", "']'", "'type'", "':'", "'pull'", "'{'", "'}'", "'push'", "'mechanisms'", "'='", "'hierarchy'", "'WorkItemNetwork'", "'WorkItems'", "'prerequisites'", "'decomposesTo'", "'analysisPhases'", "'efforts'", "'impacts'", "'value'", "'arrival'", "'duration'", "'assignTo'", "'strategy'", "'resources'", "'*'", "'skills'", "'boolean'", "'num'", "'string'", "'GovernanceStrategy'", "'create'", "'at'", "'interArrival'"
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
    public static final int T__80=80;
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
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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

                if ( (LA4_0==RULE_ID||LA4_0==53) ) {
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
    // InternalDmodel.g:288:1: ruleExperimentModel returns [EObject current=null] : (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'ExperimentParameters' ( (lv_ExperimentParameters_20_0= ruleMechanism ) ) otherlv_21= 'end ExperimentParameters' otherlv_22= 'end ExperimentSettings' otherlv_23= 'end ExperimentModel' ) ;
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
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_ExperimentVariables_3_0 = null;

        EObject lv_ServiceProviders_7_0 = null;

        EObject lv_WorkItemNetworks_12_0 = null;

        EObject lv_WINReplications_17_0 = null;

        EObject lv_ExperimentParameters_20_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:291:28: ( (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'ExperimentParameters' ( (lv_ExperimentParameters_20_0= ruleMechanism ) ) otherlv_21= 'end ExperimentParameters' otherlv_22= 'end ExperimentSettings' otherlv_23= 'end ExperimentModel' ) )
            // InternalDmodel.g:292:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'ExperimentParameters' ( (lv_ExperimentParameters_20_0= ruleMechanism ) ) otherlv_21= 'end ExperimentParameters' otherlv_22= 'end ExperimentSettings' otherlv_23= 'end ExperimentModel' )
            {
            // InternalDmodel.g:292:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'ExperimentParameters' ( (lv_ExperimentParameters_20_0= ruleMechanism ) ) otherlv_21= 'end ExperimentParameters' otherlv_22= 'end ExperimentSettings' otherlv_23= 'end ExperimentModel' )
            // InternalDmodel.g:292:3: otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Variables' ( (lv_ExperimentVariables_3_0= ruleExperimentVariable ) )* otherlv_4= 'end Variables' otherlv_5= 'OrganizationalModel' otherlv_6= 'ServiceProviders' ( (lv_ServiceProviders_7_0= ruleServiceProvider ) )+ otherlv_8= 'end ServiceProviders' otherlv_9= 'end OrganizationalModel' otherlv_10= 'WorkItemNetworkModel' otherlv_11= 'WorkItemNetworks' ( (lv_WorkItemNetworks_12_0= ruleWorkItemNetwork ) )+ otherlv_13= 'end WorkItemNetworks' otherlv_14= 'end WorkItemNetworkModel' otherlv_15= 'ExperimentSettings' otherlv_16= 'WINReplications' ( (lv_WINReplications_17_0= ruleWINReplication ) )+ otherlv_18= 'end WINReplications' otherlv_19= 'ExperimentParameters' ( (lv_ExperimentParameters_20_0= ruleMechanism ) ) otherlv_21= 'end ExperimentParameters' otherlv_22= 'end ExperimentSettings' otherlv_23= 'end ExperimentModel'
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

                if ( (LA7_0==59) ) {
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
                
            otherlv_16=(Token)match(input,36,FOLLOW_29); 

                	newLeafNode(otherlv_16, grammarAccess.getExperimentModelAccess().getWINReplicationsKeyword_16());
                
            // InternalDmodel.g:416:1: ( (lv_WINReplications_17_0= ruleWINReplication ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==78) ) {
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
            	    	    
            	    pushFollow(FOLLOW_30);
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

            otherlv_18=(Token)match(input,37,FOLLOW_31); 

                	newLeafNode(otherlv_18, grammarAccess.getExperimentModelAccess().getEndWINReplicationsKeyword_18());
                
            otherlv_19=(Token)match(input,38,FOLLOW_3); 

                	newLeafNode(otherlv_19, grammarAccess.getExperimentModelAccess().getExperimentParametersKeyword_19());
                
            // InternalDmodel.g:442:1: ( (lv_ExperimentParameters_20_0= ruleMechanism ) )
            // InternalDmodel.g:443:1: (lv_ExperimentParameters_20_0= ruleMechanism )
            {
            // InternalDmodel.g:443:1: (lv_ExperimentParameters_20_0= ruleMechanism )
            // InternalDmodel.g:444:3: lv_ExperimentParameters_20_0= ruleMechanism
            {
             
            	        newCompositeNode(grammarAccess.getExperimentModelAccess().getExperimentParametersMechanismParserRuleCall_20_0()); 
            	    
            pushFollow(FOLLOW_32);
            lv_ExperimentParameters_20_0=ruleMechanism();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	        }
                   		set(
                   			current, 
                   			"ExperimentParameters",
                    		lv_ExperimentParameters_20_0, 
                    		"datasemModeller.Dmodel.Mechanism");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_21=(Token)match(input,39,FOLLOW_33); 

                	newLeafNode(otherlv_21, grammarAccess.getExperimentModelAccess().getEndExperimentParametersKeyword_21());
                
            otherlv_22=(Token)match(input,40,FOLLOW_34); 

                	newLeafNode(otherlv_22, grammarAccess.getExperimentModelAccess().getEndExperimentSettingsKeyword_22());
                
            otherlv_23=(Token)match(input,41,FOLLOW_2); 

                	newLeafNode(otherlv_23, grammarAccess.getExperimentModelAccess().getEndExperimentModelKeyword_23());
                

            }


            }

             leaveRule(); 
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
    // InternalDmodel.g:480:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalDmodel.g:481:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalDmodel.g:482:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalDmodel.g:489:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;

         enterRule(); 
            
        try {
            // InternalDmodel.g:492:28: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalDmodel.g:493:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalDmodel.g:493:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
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
                    // InternalDmodel.g:493:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDmodel.g:501:10: this_DOUBLE_1= RULE_DOUBLE
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
    // InternalDmodel.g:516:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // InternalDmodel.g:517:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalDmodel.g:518:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalDmodel.g:525:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_ID_2=null;
        Token this_BOOLEAN_3=null;
        AntlrDatatypeRuleToken this_Number_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:528:28: ( (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // InternalDmodel.g:529:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // InternalDmodel.g:529:1: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
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
                    // InternalDmodel.g:530:5: this_Number_0= ruleNumber
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
                    // InternalDmodel.g:541:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getParameterAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDmodel.g:549:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getParameterAccess().getIDTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalDmodel.g:557:10: this_BOOLEAN_3= RULE_BOOLEAN
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
    // InternalDmodel.g:572:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalDmodel.g:573:2: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalDmodel.g:574:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
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
    // InternalDmodel.g:581:1: ruleAbstractParameter returns [EObject current=null] : ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        Token lv_isVariable_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:584:28: ( ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) ) )
            // InternalDmodel.g:585:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
            {
            // InternalDmodel.g:585:1: ( ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_value_2_0= ruleParameter ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
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
                    // InternalDmodel.g:585:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalDmodel.g:585:2: ( ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) ) )
                    // InternalDmodel.g:585:3: ( (lv_isVariable_0_0= 'var:' ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDmodel.g:585:3: ( (lv_isVariable_0_0= 'var:' ) )
                    // InternalDmodel.g:586:1: (lv_isVariable_0_0= 'var:' )
                    {
                    // InternalDmodel.g:586:1: (lv_isVariable_0_0= 'var:' )
                    // InternalDmodel.g:587:3: lv_isVariable_0_0= 'var:'
                    {
                    lv_isVariable_0_0=(Token)match(input,42,FOLLOW_3); 

                            newLeafNode(lv_isVariable_0_0, grammarAccess.getAbstractParameterAccess().getIsVariableVarKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAbstractParameterRule());
                    	        }
                           		setWithLastConsumed(current, "isVariable", true, "var:");
                    	    

                    }


                    }

                    // InternalDmodel.g:600:2: ( (otherlv_1= RULE_ID ) )
                    // InternalDmodel.g:601:1: (otherlv_1= RULE_ID )
                    {
                    // InternalDmodel.g:601:1: (otherlv_1= RULE_ID )
                    // InternalDmodel.g:602:3: otherlv_1= RULE_ID
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
                    // InternalDmodel.g:614:6: ( (lv_value_2_0= ruleParameter ) )
                    {
                    // InternalDmodel.g:614:6: ( (lv_value_2_0= ruleParameter ) )
                    // InternalDmodel.g:615:1: (lv_value_2_0= ruleParameter )
                    {
                    // InternalDmodel.g:615:1: (lv_value_2_0= ruleParameter )
                    // InternalDmodel.g:616:3: lv_value_2_0= ruleParameter
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
    // InternalDmodel.g:640:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // InternalDmodel.g:641:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // InternalDmodel.g:642:2: iv_ruleNumExpression= ruleNumExpression EOF
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
    // InternalDmodel.g:649:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_distribution_1_0=null;
        AntlrDatatypeRuleToken lv_numValue_0_0 = null;

        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:652:28: ( ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) )
            // InternalDmodel.g:653:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            {
            // InternalDmodel.g:653:1: ( ( (lv_numValue_0_0= ruleNumber ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_DOUBLE)) ) {
                alt12=1;
            }
            else if ( (LA12_0==43) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDmodel.g:653:2: ( (lv_numValue_0_0= ruleNumber ) )
                    {
                    // InternalDmodel.g:653:2: ( (lv_numValue_0_0= ruleNumber ) )
                    // InternalDmodel.g:654:1: (lv_numValue_0_0= ruleNumber )
                    {
                    // InternalDmodel.g:654:1: (lv_numValue_0_0= ruleNumber )
                    // InternalDmodel.g:655:3: lv_numValue_0_0= ruleNumber
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
                    // InternalDmodel.g:672:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    {
                    // InternalDmodel.g:672:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    // InternalDmodel.g:672:7: ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // InternalDmodel.g:672:7: ( (lv_distribution_1_0= 'Random.' ) )
                    // InternalDmodel.g:673:1: (lv_distribution_1_0= 'Random.' )
                    {
                    // InternalDmodel.g:673:1: (lv_distribution_1_0= 'Random.' )
                    // InternalDmodel.g:674:3: lv_distribution_1_0= 'Random.'
                    {
                    lv_distribution_1_0=(Token)match(input,43,FOLLOW_35); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionRandomKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // InternalDmodel.g:687:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // InternalDmodel.g:688:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // InternalDmodel.g:688:1: (lv_numDist_2_0= ruleDistribution )
                    // InternalDmodel.g:689:3: lv_numDist_2_0= ruleDistribution
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
    // InternalDmodel.g:713:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // InternalDmodel.g:714:2: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalDmodel.g:715:2: iv_ruleDistribution= ruleDistribution EOF
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
    // InternalDmodel.g:722:1: ruleDistribution returns [EObject current=null] : ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) ;
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
            // InternalDmodel.g:725:28: ( ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' ) )
            // InternalDmodel.g:726:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            {
            // InternalDmodel.g:726:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']' )
            // InternalDmodel.g:726:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ']'
            {
            // InternalDmodel.g:726:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt13=1;
                }
                break;
            case 45:
                {
                alt13=2;
                }
                break;
            case 46:
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
                    // InternalDmodel.g:726:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    {
                    // InternalDmodel.g:726:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    // InternalDmodel.g:727:1: (lv_isNormal_0_0= 'Normal' )
                    {
                    // InternalDmodel.g:727:1: (lv_isNormal_0_0= 'Normal' )
                    // InternalDmodel.g:728:3: lv_isNormal_0_0= 'Normal'
                    {
                    lv_isNormal_0_0=(Token)match(input,44,FOLLOW_36); 

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
                    // InternalDmodel.g:742:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    {
                    // InternalDmodel.g:742:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    // InternalDmodel.g:743:1: (lv_isUniform_1_0= 'Uniform' )
                    {
                    // InternalDmodel.g:743:1: (lv_isUniform_1_0= 'Uniform' )
                    // InternalDmodel.g:744:3: lv_isUniform_1_0= 'Uniform'
                    {
                    lv_isUniform_1_0=(Token)match(input,45,FOLLOW_36); 

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
                    // InternalDmodel.g:758:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    {
                    // InternalDmodel.g:758:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    // InternalDmodel.g:759:1: (lv_isExponential_2_0= 'Exponential' )
                    {
                    // InternalDmodel.g:759:1: (lv_isExponential_2_0= 'Exponential' )
                    // InternalDmodel.g:760:3: lv_isExponential_2_0= 'Exponential'
                    {
                    lv_isExponential_2_0=(Token)match(input,46,FOLLOW_36); 

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

            otherlv_3=(Token)match(input,47,FOLLOW_37); 

                	newLeafNode(otherlv_3, grammarAccess.getDistributionAccess().getLeftSquareBracketKeyword_1());
                
            // InternalDmodel.g:777:1: ( (lv_parameters_4_0= ruleParameter ) )
            // InternalDmodel.g:778:1: (lv_parameters_4_0= ruleParameter )
            {
            // InternalDmodel.g:778:1: (lv_parameters_4_0= ruleParameter )
            // InternalDmodel.g:779:3: lv_parameters_4_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_38);
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

            // InternalDmodel.g:795:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==48) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDmodel.g:795:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,48,FOLLOW_37); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDistributionAccess().getCommaKeyword_3_0());
            	        
            	    // InternalDmodel.g:799:1: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalDmodel.g:800:1: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalDmodel.g:800:1: (lv_parameters_6_0= ruleParameter )
            	    // InternalDmodel.g:801:3: lv_parameters_6_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
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

            otherlv_7=(Token)match(input,49,FOLLOW_2); 

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
    // InternalDmodel.g:829:1: entryRuleGovernanceStrategy returns [EObject current=null] : iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF ;
    public final EObject entryRuleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceStrategy = null;


        try {
            // InternalDmodel.g:830:2: (iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF )
            // InternalDmodel.g:831:2: iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF
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
    // InternalDmodel.g:838:1: ruleGovernanceStrategy returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) ) ) ) | (otherlv_11= '{' ( (lv_pushStrategy_12_0= rulePushStrategy ) ) otherlv_13= '}' ) ) ;
    public final EObject ruleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pull_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_push_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_pullStrategy_5_0 = null;

        EObject lv_pushStrategy_9_0 = null;

        EObject lv_pushStrategy_12_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:841:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) ) ) ) | (otherlv_11= '{' ( (lv_pushStrategy_12_0= rulePushStrategy ) ) otherlv_13= '}' ) ) )
            // InternalDmodel.g:842:1: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) ) ) ) | (otherlv_11= '{' ( (lv_pushStrategy_12_0= rulePushStrategy ) ) otherlv_13= '}' ) )
            {
            // InternalDmodel.g:842:1: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) ) ) ) | (otherlv_11= '{' ( (lv_pushStrategy_12_0= rulePushStrategy ) ) otherlv_13= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==53) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDmodel.g:842:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) ) ) )
                    {
                    // InternalDmodel.g:842:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) ) ) )
                    // InternalDmodel.g:842:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) ) )
                    {
                    // InternalDmodel.g:842:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalDmodel.g:843:1: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDmodel.g:843:1: (lv_name_0_0= RULE_ID )
                    // InternalDmodel.g:844:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_39); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getGovernanceStrategyAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

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

                    // InternalDmodel.g:860:2: (otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) ) )
                    // InternalDmodel.g:860:4: otherlv_1= 'type' otherlv_2= ':' ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_40); 

                        	newLeafNode(otherlv_1, grammarAccess.getGovernanceStrategyAccess().getTypeKeyword_0_1_0());
                        
                    otherlv_2=(Token)match(input,51,FOLLOW_41); 

                        	newLeafNode(otherlv_2, grammarAccess.getGovernanceStrategyAccess().getColonKeyword_0_1_1());
                        
                    // InternalDmodel.g:868:1: ( ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' ) | ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==52) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==55) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDmodel.g:868:2: ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' )
                            {
                            // InternalDmodel.g:868:2: ( ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}' )
                            // InternalDmodel.g:868:3: ( (lv_pull_3_0= 'pull' ) ) otherlv_4= '{' ( (lv_pullStrategy_5_0= rulePullStrategy ) ) otherlv_6= '}'
                            {
                            // InternalDmodel.g:868:3: ( (lv_pull_3_0= 'pull' ) )
                            // InternalDmodel.g:869:1: (lv_pull_3_0= 'pull' )
                            {
                            // InternalDmodel.g:869:1: (lv_pull_3_0= 'pull' )
                            // InternalDmodel.g:870:3: lv_pull_3_0= 'pull'
                            {
                            lv_pull_3_0=(Token)match(input,52,FOLLOW_42); 

                                    newLeafNode(lv_pull_3_0, grammarAccess.getGovernanceStrategyAccess().getPullPullKeyword_0_1_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		setWithLastConsumed(current, "pull", true, "pull");
                            	    

                            }


                            }

                            otherlv_4=(Token)match(input,53,FOLLOW_43); 

                                	newLeafNode(otherlv_4, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_0_1_2_0_1());
                                
                            // InternalDmodel.g:887:1: ( (lv_pullStrategy_5_0= rulePullStrategy ) )
                            // InternalDmodel.g:888:1: (lv_pullStrategy_5_0= rulePullStrategy )
                            {
                            // InternalDmodel.g:888:1: (lv_pullStrategy_5_0= rulePullStrategy )
                            // InternalDmodel.g:889:3: lv_pullStrategy_5_0= rulePullStrategy
                            {
                             
                            	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPullStrategyPullStrategyParserRuleCall_0_1_2_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_44);
                            lv_pullStrategy_5_0=rulePullStrategy();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"pullStrategy",
                                    		lv_pullStrategy_5_0, 
                                    		"datasemModeller.Dmodel.PullStrategy");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_6=(Token)match(input,54,FOLLOW_2); 

                                	newLeafNode(otherlv_6, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_0_1_2_0_3());
                                

                            }


                            }
                            break;
                        case 2 :
                            // InternalDmodel.g:910:6: ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' )
                            {
                            // InternalDmodel.g:910:6: ( ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}' )
                            // InternalDmodel.g:910:7: ( (lv_push_7_0= 'push' ) ) otherlv_8= '{' ( (lv_pushStrategy_9_0= rulePushStrategy ) ) otherlv_10= '}'
                            {
                            // InternalDmodel.g:910:7: ( (lv_push_7_0= 'push' ) )
                            // InternalDmodel.g:911:1: (lv_push_7_0= 'push' )
                            {
                            // InternalDmodel.g:911:1: (lv_push_7_0= 'push' )
                            // InternalDmodel.g:912:3: lv_push_7_0= 'push'
                            {
                            lv_push_7_0=(Token)match(input,55,FOLLOW_42); 

                                    newLeafNode(lv_push_7_0, grammarAccess.getGovernanceStrategyAccess().getPushPushKeyword_0_1_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		setWithLastConsumed(current, "push", true, "push");
                            	    

                            }


                            }

                            otherlv_8=(Token)match(input,53,FOLLOW_43); 

                                	newLeafNode(otherlv_8, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_0_1_2_1_1());
                                
                            // InternalDmodel.g:929:1: ( (lv_pushStrategy_9_0= rulePushStrategy ) )
                            // InternalDmodel.g:930:1: (lv_pushStrategy_9_0= rulePushStrategy )
                            {
                            // InternalDmodel.g:930:1: (lv_pushStrategy_9_0= rulePushStrategy )
                            // InternalDmodel.g:931:3: lv_pushStrategy_9_0= rulePushStrategy
                            {
                             
                            	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPushStrategyPushStrategyParserRuleCall_0_1_2_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_44);
                            lv_pushStrategy_9_0=rulePushStrategy();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"pushStrategy",
                                    		lv_pushStrategy_9_0, 
                                    		"datasemModeller.Dmodel.PushStrategy");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_10=(Token)match(input,54,FOLLOW_2); 

                                	newLeafNode(otherlv_10, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_0_1_2_1_3());
                                

                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmodel.g:952:6: (otherlv_11= '{' ( (lv_pushStrategy_12_0= rulePushStrategy ) ) otherlv_13= '}' )
                    {
                    // InternalDmodel.g:952:6: (otherlv_11= '{' ( (lv_pushStrategy_12_0= rulePushStrategy ) ) otherlv_13= '}' )
                    // InternalDmodel.g:952:8: otherlv_11= '{' ( (lv_pushStrategy_12_0= rulePushStrategy ) ) otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,53,FOLLOW_43); 

                        	newLeafNode(otherlv_11, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // InternalDmodel.g:956:1: ( (lv_pushStrategy_12_0= rulePushStrategy ) )
                    // InternalDmodel.g:957:1: (lv_pushStrategy_12_0= rulePushStrategy )
                    {
                    // InternalDmodel.g:957:1: (lv_pushStrategy_12_0= rulePushStrategy )
                    // InternalDmodel.g:958:3: lv_pushStrategy_12_0= rulePushStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getPushStrategyPushStrategyParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_44);
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

                    otherlv_13=(Token)match(input,54,FOLLOW_2); 

                        	newLeafNode(otherlv_13, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleGovernanceStrategy"


    // $ANTLR start "entryRulePullStrategy"
    // InternalDmodel.g:986:1: entryRulePullStrategy returns [EObject current=null] : iv_rulePullStrategy= rulePullStrategy EOF ;
    public final EObject entryRulePullStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePullStrategy = null;


        try {
            // InternalDmodel.g:987:2: (iv_rulePullStrategy= rulePullStrategy EOF )
            // InternalDmodel.g:988:2: iv_rulePullStrategy= rulePullStrategy EOF
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
    // InternalDmodel.g:995:1: rulePullStrategy returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) ;
    public final EObject rulePullStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mechanisms_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:998:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) )
            // InternalDmodel.g:999:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            {
            // InternalDmodel.g:999:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            // InternalDmodel.g:999:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_42); 

                	newLeafNode(otherlv_0, grammarAccess.getPullStrategyAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,53,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getPullStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:1007:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDmodel.g:1008:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // InternalDmodel.g:1008:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // InternalDmodel.g:1009:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPullStrategyAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_45);
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_3=(Token)match(input,54,FOLLOW_2); 

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
    // InternalDmodel.g:1037:1: entryRulePushStrategy returns [EObject current=null] : iv_rulePushStrategy= rulePushStrategy EOF ;
    public final EObject entryRulePushStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePushStrategy = null;


        try {
            // InternalDmodel.g:1038:2: (iv_rulePushStrategy= rulePushStrategy EOF )
            // InternalDmodel.g:1039:2: iv_rulePushStrategy= rulePushStrategy EOF
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
    // InternalDmodel.g:1046:1: rulePushStrategy returns [EObject current=null] : (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) ;
    public final EObject rulePushStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mechanisms_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1049:28: ( (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' ) )
            // InternalDmodel.g:1050:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            {
            // InternalDmodel.g:1050:1: (otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}' )
            // InternalDmodel.g:1050:3: otherlv_0= 'mechanisms' otherlv_1= '{' ( (lv_mechanisms_2_0= ruleMechanism ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_42); 

                	newLeafNode(otherlv_0, grammarAccess.getPushStrategyAccess().getMechanismsKeyword_0());
                
            otherlv_1=(Token)match(input,53,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getPushStrategyAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:1058:1: ( (lv_mechanisms_2_0= ruleMechanism ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDmodel.g:1059:1: (lv_mechanisms_2_0= ruleMechanism )
            	    {
            	    // InternalDmodel.g:1059:1: (lv_mechanisms_2_0= ruleMechanism )
            	    // InternalDmodel.g:1060:3: lv_mechanisms_2_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPushStrategyAccess().getMechanismsMechanismParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_45);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_3=(Token)match(input,54,FOLLOW_2); 

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
    // InternalDmodel.g:1088:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // InternalDmodel.g:1089:2: (iv_ruleMechanism= ruleMechanism EOF )
            // InternalDmodel.g:1090:2: iv_ruleMechanism= ruleMechanism EOF
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
    // InternalDmodel.g:1097:1: ruleMechanism returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleMechanismAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )* )? otherlv_7= '}' )? ) ;
    public final EObject ruleMechanism() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_6_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1100:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleMechanismAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )* )? otherlv_7= '}' )? ) )
            // InternalDmodel.g:1101:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleMechanismAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )* )? otherlv_7= '}' )? )
            {
            // InternalDmodel.g:1101:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleMechanismAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )* )? otherlv_7= '}' )? )
            // InternalDmodel.g:1101:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleMechanismAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )* )? otherlv_7= '}' )?
            {
            // InternalDmodel.g:1101:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1102:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1102:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1103:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            otherlv_1=(Token)match(input,57,FOLLOW_37); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAccess().getEqualsSignKeyword_1());
                
            // InternalDmodel.g:1123:1: ( (lv_value_2_0= ruleParameter ) )
            // InternalDmodel.g:1124:1: (lv_value_2_0= ruleParameter )
            {
            // InternalDmodel.g:1124:1: (lv_value_2_0= ruleParameter )
            // InternalDmodel.g:1125:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_47);
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

            // InternalDmodel.g:1141:2: (otherlv_3= '{' ( ( (lv_attributes_4_0= ruleMechanismAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )* )? otherlv_7= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==53) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDmodel.g:1141:4: otherlv_3= '{' ( ( (lv_attributes_4_0= ruleMechanismAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )* )? otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_45); 

                        	newLeafNode(otherlv_3, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalDmodel.g:1145:1: ( ( (lv_attributes_4_0= ruleMechanismAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalDmodel.g:1145:2: ( (lv_attributes_4_0= ruleMechanismAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )*
                            {
                            // InternalDmodel.g:1145:2: ( (lv_attributes_4_0= ruleMechanismAttribute ) )
                            // InternalDmodel.g:1146:1: (lv_attributes_4_0= ruleMechanismAttribute )
                            {
                            // InternalDmodel.g:1146:1: (lv_attributes_4_0= ruleMechanismAttribute )
                            // InternalDmodel.g:1147:3: lv_attributes_4_0= ruleMechanismAttribute
                            {
                             
                            	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_48);
                            lv_attributes_4_0=ruleMechanismAttribute();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getMechanismRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"attributes",
                                    		lv_attributes_4_0, 
                                    		"datasemModeller.Dmodel.MechanismAttribute");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalDmodel.g:1163:2: (otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==48) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalDmodel.g:1163:4: otherlv_5= ',' ( (lv_attributes_6_0= ruleMechanismAttribute ) )
                            	    {
                            	    otherlv_5=(Token)match(input,48,FOLLOW_3); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getMechanismAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // InternalDmodel.g:1167:1: ( (lv_attributes_6_0= ruleMechanismAttribute ) )
                            	    // InternalDmodel.g:1168:1: (lv_attributes_6_0= ruleMechanismAttribute )
                            	    {
                            	    // InternalDmodel.g:1168:1: (lv_attributes_6_0= ruleMechanismAttribute )
                            	    // InternalDmodel.g:1169:3: lv_attributes_6_0= ruleMechanismAttribute
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_48);
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


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,54,FOLLOW_2); 

                        	newLeafNode(otherlv_7, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_3_2());
                        

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
    // InternalDmodel.g:1197:1: entryRuleMechanismAttribute returns [EObject current=null] : iv_ruleMechanismAttribute= ruleMechanismAttribute EOF ;
    public final EObject entryRuleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanismAttribute = null;


        try {
            // InternalDmodel.g:1198:2: (iv_ruleMechanismAttribute= ruleMechanismAttribute EOF )
            // InternalDmodel.g:1199:2: iv_ruleMechanismAttribute= ruleMechanismAttribute EOF
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
    // InternalDmodel.g:1206:1: ruleMechanismAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1209:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // InternalDmodel.g:1210:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // InternalDmodel.g:1210:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // InternalDmodel.g:1210:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // InternalDmodel.g:1210:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1211:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1211:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1212:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            otherlv_1=(Token)match(input,57,FOLLOW_37); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAttributeAccess().getEqualsSignKeyword_1());
                
            // InternalDmodel.g:1232:1: ( (lv_value_2_0= ruleParameter ) )
            // InternalDmodel.g:1233:1: (lv_value_2_0= ruleParameter )
            {
            // InternalDmodel.g:1233:1: (lv_value_2_0= ruleParameter )
            // InternalDmodel.g:1234:3: lv_value_2_0= ruleParameter
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
    // InternalDmodel.g:1258:1: entryRuleWorkItemType returns [EObject current=null] : iv_ruleWorkItemType= ruleWorkItemType EOF ;
    public final EObject entryRuleWorkItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemType = null;


        try {
            // InternalDmodel.g:1259:2: (iv_ruleWorkItemType= ruleWorkItemType EOF )
            // InternalDmodel.g:1260:2: iv_ruleWorkItemType= ruleWorkItemType EOF
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
    // InternalDmodel.g:1267:1: ruleWorkItemType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? ( (lv_Mechanisms_5_0= ruleMechanism ) )* otherlv_6= '}' ( (lv_id_7_0= RULE_INT ) )? ) ;
    public final EObject ruleWorkItemType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_hierarchy_4_0=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        EObject lv_Mechanisms_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1270:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? ( (lv_Mechanisms_5_0= ruleMechanism ) )* otherlv_6= '}' ( (lv_id_7_0= RULE_INT ) )? ) )
            // InternalDmodel.g:1271:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? ( (lv_Mechanisms_5_0= ruleMechanism ) )* otherlv_6= '}' ( (lv_id_7_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:1271:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? ( (lv_Mechanisms_5_0= ruleMechanism ) )* otherlv_6= '}' ( (lv_id_7_0= RULE_INT ) )? )
            // InternalDmodel.g:1271:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? ( (lv_Mechanisms_5_0= ruleMechanism ) )* otherlv_6= '}' ( (lv_id_7_0= RULE_INT ) )?
            {
            // InternalDmodel.g:1271:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1272:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1272:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1273:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_42); 

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

            otherlv_1=(Token)match(input,53,FOLLOW_49); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkItemTypeAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalDmodel.g:1293:1: (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDmodel.g:1293:3: otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_46); 

                        	newLeafNode(otherlv_2, grammarAccess.getWorkItemTypeAccess().getHierarchyKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,57,FOLLOW_50); 

                        	newLeafNode(otherlv_3, grammarAccess.getWorkItemTypeAccess().getEqualsSignKeyword_2_1());
                        
                    // InternalDmodel.g:1301:1: ( (lv_hierarchy_4_0= RULE_INT ) )
                    // InternalDmodel.g:1302:1: (lv_hierarchy_4_0= RULE_INT )
                    {
                    // InternalDmodel.g:1302:1: (lv_hierarchy_4_0= RULE_INT )
                    // InternalDmodel.g:1303:3: lv_hierarchy_4_0= RULE_INT
                    {
                    lv_hierarchy_4_0=(Token)match(input,RULE_INT,FOLLOW_45); 

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

            // InternalDmodel.g:1319:4: ( (lv_Mechanisms_5_0= ruleMechanism ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDmodel.g:1320:1: (lv_Mechanisms_5_0= ruleMechanism )
            	    {
            	    // InternalDmodel.g:1320:1: (lv_Mechanisms_5_0= ruleMechanism )
            	    // InternalDmodel.g:1321:3: lv_Mechanisms_5_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkItemTypeAccess().getMechanismsMechanismParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_45);
            	    lv_Mechanisms_5_0=ruleMechanism();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkItemTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Mechanisms",
            	            		lv_Mechanisms_5_0, 
            	            		"datasemModeller.Dmodel.Mechanism");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,54,FOLLOW_51); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemTypeAccess().getRightCurlyBracketKeyword_4());
                
            // InternalDmodel.g:1341:1: ( (lv_id_7_0= RULE_INT ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDmodel.g:1342:1: (lv_id_7_0= RULE_INT )
                    {
                    // InternalDmodel.g:1342:1: (lv_id_7_0= RULE_INT )
                    // InternalDmodel.g:1343:3: lv_id_7_0= RULE_INT
                    {
                    lv_id_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_7_0, grammarAccess.getWorkItemTypeAccess().getIdINTTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_7_0, 
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
    // InternalDmodel.g:1367:1: entryRuleWorkItemNetwork returns [EObject current=null] : iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF ;
    public final EObject entryRuleWorkItemNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemNetwork = null;


        try {
            // InternalDmodel.g:1368:2: (iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF )
            // InternalDmodel.g:1369:2: iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF
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
    // InternalDmodel.g:1376:1: ruleWorkItemNetwork returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? ) ;
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
            // InternalDmodel.g:1379:28: ( (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? ) )
            // InternalDmodel.g:1380:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:1380:1: (otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )? )
            // InternalDmodel.g:1380:3: otherlv_0= 'WorkItemNetwork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'WorkItems' otherlv_4= '{' ( (lv_workItems_5_0= ruleWorkItem ) )+ otherlv_6= '}' otherlv_7= '}' ( (lv_id_8_0= RULE_INT ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkItemNetworkAccess().getWorkItemNetworkKeyword_0());
                
            // InternalDmodel.g:1384:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:1385:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:1385:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:1386:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); 

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

            otherlv_2=(Token)match(input,53,FOLLOW_52); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,60,FOLLOW_42); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkItemNetworkAccess().getWorkItemsKeyword_3());
                
            otherlv_4=(Token)match(input,53,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalDmodel.g:1414:1: ( (lv_workItems_5_0= ruleWorkItem ) )+
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
            	    // InternalDmodel.g:1415:1: (lv_workItems_5_0= ruleWorkItem )
            	    {
            	    // InternalDmodel.g:1415:1: (lv_workItems_5_0= ruleWorkItem )
            	    // InternalDmodel.g:1416:3: lv_workItems_5_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkItemNetworkAccess().getWorkItemsWorkItemParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_45);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_6=(Token)match(input,54,FOLLOW_44); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,54,FOLLOW_51); 

                	newLeafNode(otherlv_7, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_7());
                
            // InternalDmodel.g:1440:1: ( (lv_id_8_0= RULE_INT ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDmodel.g:1441:1: (lv_id_8_0= RULE_INT )
                    {
                    // InternalDmodel.g:1441:1: (lv_id_8_0= RULE_INT )
                    // InternalDmodel.g:1442:3: lv_id_8_0= RULE_INT
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
    // InternalDmodel.g:1466:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // InternalDmodel.g:1467:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // InternalDmodel.g:1468:2: iv_ruleWorkItem= ruleWorkItem EOF
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
    // InternalDmodel.g:1475:1: ruleWorkItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposesTo' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' otherlv_42= '=' ( (lv_value_43_0= ruleNumExpression ) ) )? (otherlv_44= 'arrival' otherlv_45= '=' ( (lv_arrivalTime_46_0= RULE_INT ) ) )? (otherlv_47= 'duration' otherlv_48= '=' ( (lv_duration_49_0= RULE_INT ) ) )? otherlv_50= '}' ( (lv_id_51_0= RULE_INT ) )? ) ;
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
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token lv_arrivalTime_46_0=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token lv_duration_49_0=null;
        Token otherlv_50=null;
        Token lv_id_51_0=null;
        EObject lv_requiredAnalysis_19_0 = null;

        EObject lv_requiredAnalysis_21_0 = null;

        EObject lv_requiredAnalysis_25_0 = null;

        EObject lv_requiredAnalysis_27_0 = null;

        EObject lv_requiredServices_31_0 = null;

        EObject lv_requiredServices_33_0 = null;

        EObject lv_impacts_37_0 = null;

        EObject lv_impacts_39_0 = null;

        EObject lv_value_43_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1478:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposesTo' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' otherlv_42= '=' ( (lv_value_43_0= ruleNumExpression ) ) )? (otherlv_44= 'arrival' otherlv_45= '=' ( (lv_arrivalTime_46_0= RULE_INT ) ) )? (otherlv_47= 'duration' otherlv_48= '=' ( (lv_duration_49_0= RULE_INT ) ) )? otherlv_50= '}' ( (lv_id_51_0= RULE_INT ) )? ) )
            // InternalDmodel.g:1479:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposesTo' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' otherlv_42= '=' ( (lv_value_43_0= ruleNumExpression ) ) )? (otherlv_44= 'arrival' otherlv_45= '=' ( (lv_arrivalTime_46_0= RULE_INT ) ) )? (otherlv_47= 'duration' otherlv_48= '=' ( (lv_duration_49_0= RULE_INT ) ) )? otherlv_50= '}' ( (lv_id_51_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:1479:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposesTo' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' otherlv_42= '=' ( (lv_value_43_0= ruleNumExpression ) ) )? (otherlv_44= 'arrival' otherlv_45= '=' ( (lv_arrivalTime_46_0= RULE_INT ) ) )? (otherlv_47= 'duration' otherlv_48= '=' ( (lv_duration_49_0= RULE_INT ) ) )? otherlv_50= '}' ( (lv_id_51_0= RULE_INT ) )? )
            // InternalDmodel.g:1479:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? ( ( ( (lv_hasSubtasks_11_0= 'decomposesTo' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) ) ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )? (otherlv_41= 'value' otherlv_42= '=' ( (lv_value_43_0= ruleNumExpression ) ) )? (otherlv_44= 'arrival' otherlv_45= '=' ( (lv_arrivalTime_46_0= RULE_INT ) ) )? (otherlv_47= 'duration' otherlv_48= '=' ( (lv_duration_49_0= RULE_INT ) ) )? otherlv_50= '}' ( (lv_id_51_0= RULE_INT ) )?
            {
            // InternalDmodel.g:1479:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:1480:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:1480:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:1481:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_53); 

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

            // InternalDmodel.g:1497:2: (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDmodel.g:1497:4: otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_40); 

                        	newLeafNode(otherlv_1, grammarAccess.getWorkItemAccess().getTypeKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,51,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getWorkItemAccess().getColonKeyword_1_1());
                        
                    // InternalDmodel.g:1505:1: ( (otherlv_3= RULE_ID ) )
                    // InternalDmodel.g:1506:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDmodel.g:1506:1: (otherlv_3= RULE_ID )
                    // InternalDmodel.g:1507:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_42); 

                    		newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getTypeWorkItemTypeCrossReference_1_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,53,FOLLOW_54); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:1522:1: ( ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==61) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDmodel.g:1522:2: ( (lv_hasPredecessors_5_0= 'prerequisites' ) ) otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}'
                    {
                    // InternalDmodel.g:1522:2: ( (lv_hasPredecessors_5_0= 'prerequisites' ) )
                    // InternalDmodel.g:1523:1: (lv_hasPredecessors_5_0= 'prerequisites' )
                    {
                    // InternalDmodel.g:1523:1: (lv_hasPredecessors_5_0= 'prerequisites' )
                    // InternalDmodel.g:1524:3: lv_hasPredecessors_5_0= 'prerequisites'
                    {
                    lv_hasPredecessors_5_0=(Token)match(input,61,FOLLOW_42); 

                            newLeafNode(lv_hasPredecessors_5_0, grammarAccess.getWorkItemAccess().getHasPredecessorsPrerequisitesKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasPredecessors", true, "prerequisites");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,53,FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalDmodel.g:1541:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDmodel.g:1542:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDmodel.g:1542:1: (otherlv_7= RULE_ID )
                    // InternalDmodel.g:1543:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_48); 

                    		newLeafNode(otherlv_7, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // InternalDmodel.g:1554:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==48) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalDmodel.g:1554:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,48,FOLLOW_3); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getWorkItemAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalDmodel.g:1558:1: ( (otherlv_9= RULE_ID ) )
                    	    // InternalDmodel.g:1559:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalDmodel.g:1559:1: (otherlv_9= RULE_ID )
                    	    // InternalDmodel.g:1560:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_48); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,54,FOLLOW_55); 

                        	newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:1575:3: ( ( ( (lv_hasSubtasks_11_0= 'decomposesTo' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )? | ( (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54||LA37_0==62||(LA37_0>=65 && LA37_0<=68)) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=63 && LA37_0<=64)) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDmodel.g:1575:4: ( ( (lv_hasSubtasks_11_0= 'decomposesTo' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )?
                    {
                    // InternalDmodel.g:1575:4: ( ( (lv_hasSubtasks_11_0= 'decomposesTo' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )? )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==62) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalDmodel.g:1575:5: ( (lv_hasSubtasks_11_0= 'decomposesTo' ) ) otherlv_12= '{' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* otherlv_16= '}' (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )?
                            {
                            // InternalDmodel.g:1575:5: ( (lv_hasSubtasks_11_0= 'decomposesTo' ) )
                            // InternalDmodel.g:1576:1: (lv_hasSubtasks_11_0= 'decomposesTo' )
                            {
                            // InternalDmodel.g:1576:1: (lv_hasSubtasks_11_0= 'decomposesTo' )
                            // InternalDmodel.g:1577:3: lv_hasSubtasks_11_0= 'decomposesTo'
                            {
                            lv_hasSubtasks_11_0=(Token)match(input,62,FOLLOW_42); 

                                    newLeafNode(lv_hasSubtasks_11_0, grammarAccess.getWorkItemAccess().getHasSubtasksDecomposesToKeyword_4_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                   		setWithLastConsumed(current, "hasSubtasks", true, "decomposesTo");
                            	    

                            }


                            }

                            otherlv_12=(Token)match(input,53,FOLLOW_3); 

                                	newLeafNode(otherlv_12, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_0_1());
                                
                            // InternalDmodel.g:1594:1: ( (otherlv_13= RULE_ID ) )
                            // InternalDmodel.g:1595:1: (otherlv_13= RULE_ID )
                            {
                            // InternalDmodel.g:1595:1: (otherlv_13= RULE_ID )
                            // InternalDmodel.g:1596:3: otherlv_13= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	        }
                                    
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_48); 

                            		newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_4_0_2_0()); 
                            	

                            }


                            }

                            // InternalDmodel.g:1607:2: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==48) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalDmodel.g:1607:4: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                            	    {
                            	    otherlv_14=(Token)match(input,48,FOLLOW_3); 

                            	        	newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getCommaKeyword_4_0_3_0());
                            	        
                            	    // InternalDmodel.g:1611:1: ( (otherlv_15= RULE_ID ) )
                            	    // InternalDmodel.g:1612:1: (otherlv_15= RULE_ID )
                            	    {
                            	    // InternalDmodel.g:1612:1: (otherlv_15= RULE_ID )
                            	    // InternalDmodel.g:1613:3: otherlv_15= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                            	    	        }
                            	            
                            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_48); 

                            	    		newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_4_0_3_1_0()); 
                            	    	

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,54,FOLLOW_56); 

                                	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_0_4());
                                
                            // InternalDmodel.g:1628:1: (otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}' )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==63) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // InternalDmodel.g:1628:3: otherlv_17= 'analysisPhases' otherlv_18= '{' ( (lv_requiredAnalysis_19_0= ruleRequiredService ) ) (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )* otherlv_22= '}'
                                    {
                                    otherlv_17=(Token)match(input,63,FOLLOW_42); 

                                        	newLeafNode(otherlv_17, grammarAccess.getWorkItemAccess().getAnalysisPhasesKeyword_4_0_5_0());
                                        
                                    otherlv_18=(Token)match(input,53,FOLLOW_36); 

                                        	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_0_5_1());
                                        
                                    // InternalDmodel.g:1636:1: ( (lv_requiredAnalysis_19_0= ruleRequiredService ) )
                                    // InternalDmodel.g:1637:1: (lv_requiredAnalysis_19_0= ruleRequiredService )
                                    {
                                    // InternalDmodel.g:1637:1: (lv_requiredAnalysis_19_0= ruleRequiredService )
                                    // InternalDmodel.g:1638:3: lv_requiredAnalysis_19_0= ruleRequiredService
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_4_0_5_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_48);
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

                                    // InternalDmodel.g:1654:2: (otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) ) )*
                                    loop31:
                                    do {
                                        int alt31=2;
                                        int LA31_0 = input.LA(1);

                                        if ( (LA31_0==48) ) {
                                            alt31=1;
                                        }


                                        switch (alt31) {
                                    	case 1 :
                                    	    // InternalDmodel.g:1654:4: otherlv_20= ',' ( (lv_requiredAnalysis_21_0= ruleRequiredService ) )
                                    	    {
                                    	    otherlv_20=(Token)match(input,48,FOLLOW_36); 

                                    	        	newLeafNode(otherlv_20, grammarAccess.getWorkItemAccess().getCommaKeyword_4_0_5_3_0());
                                    	        
                                    	    // InternalDmodel.g:1658:1: ( (lv_requiredAnalysis_21_0= ruleRequiredService ) )
                                    	    // InternalDmodel.g:1659:1: (lv_requiredAnalysis_21_0= ruleRequiredService )
                                    	    {
                                    	    // InternalDmodel.g:1659:1: (lv_requiredAnalysis_21_0= ruleRequiredService )
                                    	    // InternalDmodel.g:1660:3: lv_requiredAnalysis_21_0= ruleRequiredService
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_4_0_5_3_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_48);
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
                                    	    break loop31;
                                        }
                                    } while (true);

                                    otherlv_22=(Token)match(input,54,FOLLOW_57); 

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
                    // InternalDmodel.g:1681:6: ( (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' )
                    {
                    // InternalDmodel.g:1681:6: ( (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}' )
                    // InternalDmodel.g:1681:7: (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )? otherlv_29= 'efforts' otherlv_30= '{' ( (lv_requiredServices_31_0= ruleRequiredService ) ) (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )* otherlv_34= '}'
                    {
                    // InternalDmodel.g:1681:7: (otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==63) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalDmodel.g:1681:9: otherlv_23= 'analysisPhases' otherlv_24= '{' ( (lv_requiredAnalysis_25_0= ruleRequiredService ) ) (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )* otherlv_28= '}'
                            {
                            otherlv_23=(Token)match(input,63,FOLLOW_42); 

                                	newLeafNode(otherlv_23, grammarAccess.getWorkItemAccess().getAnalysisPhasesKeyword_4_1_0_0());
                                
                            otherlv_24=(Token)match(input,53,FOLLOW_36); 

                                	newLeafNode(otherlv_24, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_1_0_1());
                                
                            // InternalDmodel.g:1689:1: ( (lv_requiredAnalysis_25_0= ruleRequiredService ) )
                            // InternalDmodel.g:1690:1: (lv_requiredAnalysis_25_0= ruleRequiredService )
                            {
                            // InternalDmodel.g:1690:1: (lv_requiredAnalysis_25_0= ruleRequiredService )
                            // InternalDmodel.g:1691:3: lv_requiredAnalysis_25_0= ruleRequiredService
                            {
                             
                            	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_4_1_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_48);
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

                            // InternalDmodel.g:1707:2: (otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==48) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalDmodel.g:1707:4: otherlv_26= ',' ( (lv_requiredAnalysis_27_0= ruleRequiredService ) )
                            	    {
                            	    otherlv_26=(Token)match(input,48,FOLLOW_36); 

                            	        	newLeafNode(otherlv_26, grammarAccess.getWorkItemAccess().getCommaKeyword_4_1_0_3_0());
                            	        
                            	    // InternalDmodel.g:1711:1: ( (lv_requiredAnalysis_27_0= ruleRequiredService ) )
                            	    // InternalDmodel.g:1712:1: (lv_requiredAnalysis_27_0= ruleRequiredService )
                            	    {
                            	    // InternalDmodel.g:1712:1: (lv_requiredAnalysis_27_0= ruleRequiredService )
                            	    // InternalDmodel.g:1713:3: lv_requiredAnalysis_27_0= ruleRequiredService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredAnalysisRequiredServiceParserRuleCall_4_1_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_48);
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
                            	    break loop34;
                                }
                            } while (true);

                            otherlv_28=(Token)match(input,54,FOLLOW_58); 

                                	newLeafNode(otherlv_28, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_1_0_4());
                                

                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,64,FOLLOW_42); 

                        	newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getEffortsKeyword_4_1_1());
                        
                    otherlv_30=(Token)match(input,53,FOLLOW_36); 

                        	newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_4_1_2());
                        
                    // InternalDmodel.g:1741:1: ( (lv_requiredServices_31_0= ruleRequiredService ) )
                    // InternalDmodel.g:1742:1: (lv_requiredServices_31_0= ruleRequiredService )
                    {
                    // InternalDmodel.g:1742:1: (lv_requiredServices_31_0= ruleRequiredService )
                    // InternalDmodel.g:1743:3: lv_requiredServices_31_0= ruleRequiredService
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_48);
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

                    // InternalDmodel.g:1759:2: (otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==48) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalDmodel.g:1759:4: otherlv_32= ',' ( (lv_requiredServices_33_0= ruleRequiredService ) )
                    	    {
                    	    otherlv_32=(Token)match(input,48,FOLLOW_36); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getWorkItemAccess().getCommaKeyword_4_1_4_0());
                    	        
                    	    // InternalDmodel.g:1763:1: ( (lv_requiredServices_33_0= ruleRequiredService ) )
                    	    // InternalDmodel.g:1764:1: (lv_requiredServices_33_0= ruleRequiredService )
                    	    {
                    	    // InternalDmodel.g:1764:1: (lv_requiredServices_33_0= ruleRequiredService )
                    	    // InternalDmodel.g:1765:3: lv_requiredServices_33_0= ruleRequiredService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getRequiredServicesRequiredServiceParserRuleCall_4_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_48);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,54,FOLLOW_57); 

                        	newLeafNode(otherlv_34, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_4_1_5());
                        

                    }


                    }
                    break;

            }

            // InternalDmodel.g:1785:3: ( ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==65) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDmodel.g:1785:4: ( (lv_hasImpacts_35_0= 'impacts' ) ) otherlv_36= '{' ( (lv_impacts_37_0= ruleImpact ) ) (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )* otherlv_40= '}'
                    {
                    // InternalDmodel.g:1785:4: ( (lv_hasImpacts_35_0= 'impacts' ) )
                    // InternalDmodel.g:1786:1: (lv_hasImpacts_35_0= 'impacts' )
                    {
                    // InternalDmodel.g:1786:1: (lv_hasImpacts_35_0= 'impacts' )
                    // InternalDmodel.g:1787:3: lv_hasImpacts_35_0= 'impacts'
                    {
                    lv_hasImpacts_35_0=(Token)match(input,65,FOLLOW_42); 

                            newLeafNode(lv_hasImpacts_35_0, grammarAccess.getWorkItemAccess().getHasImpactsImpactsKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasImpacts", true, "impacts");
                    	    

                    }


                    }

                    otherlv_36=(Token)match(input,53,FOLLOW_3); 

                        	newLeafNode(otherlv_36, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // InternalDmodel.g:1804:1: ( (lv_impacts_37_0= ruleImpact ) )
                    // InternalDmodel.g:1805:1: (lv_impacts_37_0= ruleImpact )
                    {
                    // InternalDmodel.g:1805:1: (lv_impacts_37_0= ruleImpact )
                    // InternalDmodel.g:1806:3: lv_impacts_37_0= ruleImpact
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_48);
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

                    // InternalDmodel.g:1822:2: (otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==48) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalDmodel.g:1822:4: otherlv_38= ',' ( (lv_impacts_39_0= ruleImpact ) )
                    	    {
                    	    otherlv_38=(Token)match(input,48,FOLLOW_3); 

                    	        	newLeafNode(otherlv_38, grammarAccess.getWorkItemAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // InternalDmodel.g:1826:1: ( (lv_impacts_39_0= ruleImpact ) )
                    	    // InternalDmodel.g:1827:1: (lv_impacts_39_0= ruleImpact )
                    	    {
                    	    // InternalDmodel.g:1827:1: (lv_impacts_39_0= ruleImpact )
                    	    // InternalDmodel.g:1828:3: lv_impacts_39_0= ruleImpact
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getImpactsImpactParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_48);
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,54,FOLLOW_59); 

                        	newLeafNode(otherlv_40, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:1848:3: (otherlv_41= 'value' otherlv_42= '=' ( (lv_value_43_0= ruleNumExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==66) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDmodel.g:1848:5: otherlv_41= 'value' otherlv_42= '=' ( (lv_value_43_0= ruleNumExpression ) )
                    {
                    otherlv_41=(Token)match(input,66,FOLLOW_46); 

                        	newLeafNode(otherlv_41, grammarAccess.getWorkItemAccess().getValueKeyword_6_0());
                        
                    otherlv_42=(Token)match(input,57,FOLLOW_60); 

                        	newLeafNode(otherlv_42, grammarAccess.getWorkItemAccess().getEqualsSignKeyword_6_1());
                        
                    // InternalDmodel.g:1856:1: ( (lv_value_43_0= ruleNumExpression ) )
                    // InternalDmodel.g:1857:1: (lv_value_43_0= ruleNumExpression )
                    {
                    // InternalDmodel.g:1857:1: (lv_value_43_0= ruleNumExpression )
                    // InternalDmodel.g:1858:3: lv_value_43_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getValueNumExpressionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_61);
                    lv_value_43_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_43_0, 
                            		"datasemModeller.Dmodel.NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:1874:4: (otherlv_44= 'arrival' otherlv_45= '=' ( (lv_arrivalTime_46_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==67) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDmodel.g:1874:6: otherlv_44= 'arrival' otherlv_45= '=' ( (lv_arrivalTime_46_0= RULE_INT ) )
                    {
                    otherlv_44=(Token)match(input,67,FOLLOW_46); 

                        	newLeafNode(otherlv_44, grammarAccess.getWorkItemAccess().getArrivalKeyword_7_0());
                        
                    otherlv_45=(Token)match(input,57,FOLLOW_50); 

                        	newLeafNode(otherlv_45, grammarAccess.getWorkItemAccess().getEqualsSignKeyword_7_1());
                        
                    // InternalDmodel.g:1882:1: ( (lv_arrivalTime_46_0= RULE_INT ) )
                    // InternalDmodel.g:1883:1: (lv_arrivalTime_46_0= RULE_INT )
                    {
                    // InternalDmodel.g:1883:1: (lv_arrivalTime_46_0= RULE_INT )
                    // InternalDmodel.g:1884:3: lv_arrivalTime_46_0= RULE_INT
                    {
                    lv_arrivalTime_46_0=(Token)match(input,RULE_INT,FOLLOW_62); 

                    			newLeafNode(lv_arrivalTime_46_0, grammarAccess.getWorkItemAccess().getArrivalTimeINTTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arrivalTime",
                            		lv_arrivalTime_46_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:1900:4: (otherlv_47= 'duration' otherlv_48= '=' ( (lv_duration_49_0= RULE_INT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==68) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDmodel.g:1900:6: otherlv_47= 'duration' otherlv_48= '=' ( (lv_duration_49_0= RULE_INT ) )
                    {
                    otherlv_47=(Token)match(input,68,FOLLOW_46); 

                        	newLeafNode(otherlv_47, grammarAccess.getWorkItemAccess().getDurationKeyword_8_0());
                        
                    otherlv_48=(Token)match(input,57,FOLLOW_50); 

                        	newLeafNode(otherlv_48, grammarAccess.getWorkItemAccess().getEqualsSignKeyword_8_1());
                        
                    // InternalDmodel.g:1908:1: ( (lv_duration_49_0= RULE_INT ) )
                    // InternalDmodel.g:1909:1: (lv_duration_49_0= RULE_INT )
                    {
                    // InternalDmodel.g:1909:1: (lv_duration_49_0= RULE_INT )
                    // InternalDmodel.g:1910:3: lv_duration_49_0= RULE_INT
                    {
                    lv_duration_49_0=(Token)match(input,RULE_INT,FOLLOW_44); 

                    			newLeafNode(lv_duration_49_0, grammarAccess.getWorkItemAccess().getDurationINTTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duration",
                            		lv_duration_49_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_50=(Token)match(input,54,FOLLOW_51); 

                	newLeafNode(otherlv_50, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_9());
                
            // InternalDmodel.g:1930:1: ( (lv_id_51_0= RULE_INT ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDmodel.g:1931:1: (lv_id_51_0= RULE_INT )
                    {
                    // InternalDmodel.g:1931:1: (lv_id_51_0= RULE_INT )
                    // InternalDmodel.g:1932:3: lv_id_51_0= RULE_INT
                    {
                    lv_id_51_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_51_0, grammarAccess.getWorkItemAccess().getIdINTTerminalRuleCall_10_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_51_0, 
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
    // InternalDmodel.g:1956:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalDmodel.g:1957:2: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalDmodel.g:1958:2: iv_ruleRequiredService= ruleRequiredService EOF
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
    // InternalDmodel.g:1965:1: ruleRequiredService returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efforts_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:1968:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // InternalDmodel.g:1969:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // InternalDmodel.g:1969:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // InternalDmodel.g:1969:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efforts_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getLeftSquareBracketKeyword_0());
                
            // InternalDmodel.g:1973:1: ( (otherlv_1= RULE_ID ) )
            // InternalDmodel.g:1974:1: (otherlv_1= RULE_ID )
            {
            // InternalDmodel.g:1974:1: (otherlv_1= RULE_ID )
            // InternalDmodel.g:1975:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredServiceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_63); 

            		newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getServiceTypeServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_64); 

                	newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getCommaKeyword_2());
                
            // InternalDmodel.g:1990:1: ( (lv_efforts_3_0= ruleAbstractParameter ) )
            // InternalDmodel.g:1991:1: (lv_efforts_3_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:1991:1: (lv_efforts_3_0= ruleAbstractParameter )
            // InternalDmodel.g:1992:3: lv_efforts_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getRequiredServiceAccess().getEffortsAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_65);
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

            otherlv_4=(Token)match(input,49,FOLLOW_2); 

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
    // InternalDmodel.g:2020:1: entryRuleImpact returns [EObject current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final EObject entryRuleImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpact = null;


        try {
            // InternalDmodel.g:2021:2: (iv_ruleImpact= ruleImpact EOF )
            // InternalDmodel.g:2022:2: iv_ruleImpact= ruleImpact EOF
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
    // InternalDmodel.g:2029:1: ruleImpact returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) ;
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
            // InternalDmodel.g:2032:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' ) )
            // InternalDmodel.g:2033:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            {
            // InternalDmodel.g:2033:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']' )
            // InternalDmodel.g:2033:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_likelihood_2_0= ruleAbstractParameter ) ) otherlv_3= ',' ( (lv_risk_4_0= ruleAbstractParameter ) ) otherlv_5= ']'
            {
            // InternalDmodel.g:2033:2: ( (otherlv_0= RULE_ID ) )
            // InternalDmodel.g:2034:1: (otherlv_0= RULE_ID )
            {
            // InternalDmodel.g:2034:1: (otherlv_0= RULE_ID )
            // InternalDmodel.g:2035:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImpactRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            		newLeafNode(otherlv_0, grammarAccess.getImpactAccess().getImpactWIWorkItemCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_64); 

                	newLeafNode(otherlv_1, grammarAccess.getImpactAccess().getLeftSquareBracketKeyword_1());
                
            // InternalDmodel.g:2050:1: ( (lv_likelihood_2_0= ruleAbstractParameter ) )
            // InternalDmodel.g:2051:1: (lv_likelihood_2_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:2051:1: (lv_likelihood_2_0= ruleAbstractParameter )
            // InternalDmodel.g:2052:3: lv_likelihood_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getLikelihoodAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_63);
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

            otherlv_3=(Token)match(input,48,FOLLOW_64); 

                	newLeafNode(otherlv_3, grammarAccess.getImpactAccess().getCommaKeyword_3());
                
            // InternalDmodel.g:2072:1: ( (lv_risk_4_0= ruleAbstractParameter ) )
            // InternalDmodel.g:2073:1: (lv_risk_4_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:2073:1: (lv_risk_4_0= ruleAbstractParameter )
            // InternalDmodel.g:2074:3: lv_risk_4_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getImpactAccess().getRiskAbstractParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,49,FOLLOW_2); 

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
    // InternalDmodel.g:2102:1: entryRuleServiceProviderType returns [EObject current=null] : iv_ruleServiceProviderType= ruleServiceProviderType EOF ;
    public final EObject entryRuleServiceProviderType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProviderType = null;


        try {
            // InternalDmodel.g:2103:2: (iv_ruleServiceProviderType= ruleServiceProviderType EOF )
            // InternalDmodel.g:2104:2: iv_ruleServiceProviderType= ruleServiceProviderType EOF
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
    // InternalDmodel.g:2111:1: ruleServiceProviderType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}' ) ;
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
            // InternalDmodel.g:2114:28: ( ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}' ) )
            // InternalDmodel.g:2115:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            {
            // InternalDmodel.g:2115:1: ( ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            // InternalDmodel.g:2115:2: ( (lv_id_0_0= RULE_INT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )? otherlv_6= '}'
            {
            // InternalDmodel.g:2115:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDmodel.g:2116:1: (lv_id_0_0= RULE_INT )
                    {
                    // InternalDmodel.g:2116:1: (lv_id_0_0= RULE_INT )
                    // InternalDmodel.g:2117:3: lv_id_0_0= RULE_INT
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

            // InternalDmodel.g:2133:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmodel.g:2134:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDmodel.g:2134:1: (lv_name_1_0= RULE_ID )
            // InternalDmodel.g:2135:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); 

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

            otherlv_2=(Token)match(input,53,FOLLOW_66); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceProviderTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:2155:1: (otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDmodel.g:2155:3: otherlv_3= 'hierarchy' otherlv_4= '=' ( (lv_hierarchy_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_46); 

                        	newLeafNode(otherlv_3, grammarAccess.getServiceProviderTypeAccess().getHierarchyKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,57,FOLLOW_50); 

                        	newLeafNode(otherlv_4, grammarAccess.getServiceProviderTypeAccess().getEqualsSignKeyword_3_1());
                        
                    // InternalDmodel.g:2163:1: ( (lv_hierarchy_5_0= RULE_INT ) )
                    // InternalDmodel.g:2164:1: (lv_hierarchy_5_0= RULE_INT )
                    {
                    // InternalDmodel.g:2164:1: (lv_hierarchy_5_0= RULE_INT )
                    // InternalDmodel.g:2165:3: lv_hierarchy_5_0= RULE_INT
                    {
                    lv_hierarchy_5_0=(Token)match(input,RULE_INT,FOLLOW_44); 

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

            otherlv_6=(Token)match(input,54,FOLLOW_2); 

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
    // InternalDmodel.g:2193:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDmodel.g:2194:2: (iv_ruleService= ruleService EOF )
            // InternalDmodel.g:2195:2: iv_ruleService= ruleService EOF
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
    // InternalDmodel.g:2202:1: ruleService returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )? ) ;
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
            // InternalDmodel.g:2205:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )? ) )
            // InternalDmodel.g:2206:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:2206:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )? )
            // InternalDmodel.g:2206:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ( (lv_id_6_0= RULE_INT ) )?
            {
            // InternalDmodel.g:2206:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2207:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2207:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2208:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_67); 

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

            // InternalDmodel.g:2224:2: (otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDmodel.g:2224:4: otherlv_1= '{' (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )? otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_66); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // InternalDmodel.g:2228:1: (otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==58) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalDmodel.g:2228:3: otherlv_2= 'hierarchy' otherlv_3= '=' ( (lv_hierarchy_4_0= RULE_INT ) )
                            {
                            otherlv_2=(Token)match(input,58,FOLLOW_46); 

                                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getHierarchyKeyword_1_1_0());
                                
                            otherlv_3=(Token)match(input,57,FOLLOW_50); 

                                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getEqualsSignKeyword_1_1_1());
                                
                            // InternalDmodel.g:2236:1: ( (lv_hierarchy_4_0= RULE_INT ) )
                            // InternalDmodel.g:2237:1: (lv_hierarchy_4_0= RULE_INT )
                            {
                            // InternalDmodel.g:2237:1: (lv_hierarchy_4_0= RULE_INT )
                            // InternalDmodel.g:2238:3: lv_hierarchy_4_0= RULE_INT
                            {
                            lv_hierarchy_4_0=(Token)match(input,RULE_INT,FOLLOW_44); 

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

                    otherlv_5=(Token)match(input,54,FOLLOW_51); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_1_2());
                        

                    }
                    break;

            }

            // InternalDmodel.g:2258:3: ( (lv_id_6_0= RULE_INT ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDmodel.g:2259:1: (lv_id_6_0= RULE_INT )
                    {
                    // InternalDmodel.g:2259:1: (lv_id_6_0= RULE_INT )
                    // InternalDmodel.g:2260:3: lv_id_6_0= RULE_INT
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
    // InternalDmodel.g:2284:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // InternalDmodel.g:2285:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // InternalDmodel.g:2286:2: iv_ruleServiceProvider= ruleServiceProvider EOF
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
    // InternalDmodel.g:2293:1: ruleServiceProvider returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= '{' ( (lv_strategySpecs_15_0= ruleMechanismAttribute ) ) (otherlv_16= ',' ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) ) )* otherlv_18= '}' )? (otherlv_19= 'resources' otherlv_20= ':' ( (lv_resources_21_0= ruleAsset ) )+ )? otherlv_22= '}' ( (lv_id_23_0= RULE_INT ) )? ) ;
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token lv_id_23_0=null;
        EObject lv_strategySpecs_15_0 = null;

        EObject lv_strategySpecs_17_0 = null;

        EObject lv_resources_21_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:2296:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= '{' ( (lv_strategySpecs_15_0= ruleMechanismAttribute ) ) (otherlv_16= ',' ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) ) )* otherlv_18= '}' )? (otherlv_19= 'resources' otherlv_20= ':' ( (lv_resources_21_0= ruleAsset ) )+ )? otherlv_22= '}' ( (lv_id_23_0= RULE_INT ) )? ) )
            // InternalDmodel.g:2297:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= '{' ( (lv_strategySpecs_15_0= ruleMechanismAttribute ) ) (otherlv_16= ',' ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) ) )* otherlv_18= '}' )? (otherlv_19= 'resources' otherlv_20= ':' ( (lv_resources_21_0= ruleAsset ) )+ )? otherlv_22= '}' ( (lv_id_23_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:2297:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= '{' ( (lv_strategySpecs_15_0= ruleMechanismAttribute ) ) (otherlv_16= ',' ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) ) )* otherlv_18= '}' )? (otherlv_19= 'resources' otherlv_20= ':' ( (lv_resources_21_0= ruleAsset ) )+ )? otherlv_22= '}' ( (lv_id_23_0= RULE_INT ) )? )
            // InternalDmodel.g:2297:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )? (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= '{' ( (lv_strategySpecs_15_0= ruleMechanismAttribute ) ) (otherlv_16= ',' ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) ) )* otherlv_18= '}' )? (otherlv_19= 'resources' otherlv_20= ':' ( (lv_resources_21_0= ruleAsset ) )+ )? otherlv_22= '}' ( (lv_id_23_0= RULE_INT ) )?
            {
            // InternalDmodel.g:2297:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2298:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2298:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2299:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_53); 

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

            // InternalDmodel.g:2315:2: (otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDmodel.g:2315:4: otherlv_1= 'type' otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_40); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getTypeKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,51,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceProviderAccess().getColonKeyword_1_1());
                        
                    // InternalDmodel.g:2323:1: ( (otherlv_3= RULE_ID ) )
                    // InternalDmodel.g:2324:1: (otherlv_3= RULE_ID )
                    {
                    // InternalDmodel.g:2324:1: (otherlv_3= RULE_ID )
                    // InternalDmodel.g:2325:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_42); 

                    		newLeafNode(otherlv_3, grammarAccess.getServiceProviderAccess().getTypeServiceProviderTypeCrossReference_1_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,53,FOLLOW_68); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDmodel.g:2340:1: (otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==69) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDmodel.g:2340:3: otherlv_5= 'assignTo' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_42); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderAccess().getAssignToKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,53,FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalDmodel.g:2348:1: ( (otherlv_7= RULE_ID ) )
                    // InternalDmodel.g:2349:1: (otherlv_7= RULE_ID )
                    {
                    // InternalDmodel.g:2349:1: (otherlv_7= RULE_ID )
                    // InternalDmodel.g:2350:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_48); 

                    		newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // InternalDmodel.g:2361:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==48) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalDmodel.g:2361:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,48,FOLLOW_3); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalDmodel.g:2365:1: ( (otherlv_9= RULE_ID ) )
                    	    // InternalDmodel.g:2366:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalDmodel.g:2366:1: (otherlv_9= RULE_ID )
                    	    // InternalDmodel.g:2367:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_48); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,54,FOLLOW_69); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalDmodel.g:2382:3: (otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==70) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDmodel.g:2382:5: otherlv_11= 'strategy' otherlv_12= ':' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,70,FOLLOW_40); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getStrategyKeyword_4_0());
                        
                    otherlv_12=(Token)match(input,51,FOLLOW_3); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getColonKeyword_4_1());
                        
                    // InternalDmodel.g:2390:1: ( (otherlv_13= RULE_ID ) )
                    // InternalDmodel.g:2391:1: (otherlv_13= RULE_ID )
                    {
                    // InternalDmodel.g:2391:1: (otherlv_13= RULE_ID )
                    // InternalDmodel.g:2392:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_70); 

                    		newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getGovernanceStrategyGovernanceStrategyCrossReference_4_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalDmodel.g:2403:4: (otherlv_14= '{' ( (lv_strategySpecs_15_0= ruleMechanismAttribute ) ) (otherlv_16= ',' ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) ) )* otherlv_18= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDmodel.g:2403:6: otherlv_14= '{' ( (lv_strategySpecs_15_0= ruleMechanismAttribute ) ) (otherlv_16= ',' ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) ) )* otherlv_18= '}'
                    {
                    otherlv_14=(Token)match(input,53,FOLLOW_3); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // InternalDmodel.g:2407:1: ( (lv_strategySpecs_15_0= ruleMechanismAttribute ) )
                    // InternalDmodel.g:2408:1: (lv_strategySpecs_15_0= ruleMechanismAttribute )
                    {
                    // InternalDmodel.g:2408:1: (lv_strategySpecs_15_0= ruleMechanismAttribute )
                    // InternalDmodel.g:2409:3: lv_strategySpecs_15_0= ruleMechanismAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getStrategySpecsMechanismAttributeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_48);
                    lv_strategySpecs_15_0=ruleMechanismAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	        }
                           		add(
                           			current, 
                           			"strategySpecs",
                            		lv_strategySpecs_15_0, 
                            		"datasemModeller.Dmodel.MechanismAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDmodel.g:2425:2: (otherlv_16= ',' ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==48) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalDmodel.g:2425:4: otherlv_16= ',' ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) )
                    	    {
                    	    otherlv_16=(Token)match(input,48,FOLLOW_3); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // InternalDmodel.g:2429:1: ( (lv_strategySpecs_17_0= ruleMechanismAttribute ) )
                    	    // InternalDmodel.g:2430:1: (lv_strategySpecs_17_0= ruleMechanismAttribute )
                    	    {
                    	    // InternalDmodel.g:2430:1: (lv_strategySpecs_17_0= ruleMechanismAttribute )
                    	    // InternalDmodel.g:2431:3: lv_strategySpecs_17_0= ruleMechanismAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getStrategySpecsMechanismAttributeParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_48);
                    	    lv_strategySpecs_17_0=ruleMechanismAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"strategySpecs",
                    	            		lv_strategySpecs_17_0, 
                    	            		"datasemModeller.Dmodel.MechanismAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,54,FOLLOW_71); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // InternalDmodel.g:2451:3: (otherlv_19= 'resources' otherlv_20= ':' ( (lv_resources_21_0= ruleAsset ) )+ )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==71) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDmodel.g:2451:5: otherlv_19= 'resources' otherlv_20= ':' ( (lv_resources_21_0= ruleAsset ) )+
                    {
                    otherlv_19=(Token)match(input,71,FOLLOW_40); 

                        	newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getResourcesKeyword_6_0());
                        
                    otherlv_20=(Token)match(input,51,FOLLOW_3); 

                        	newLeafNode(otherlv_20, grammarAccess.getServiceProviderAccess().getColonKeyword_6_1());
                        
                    // InternalDmodel.g:2459:1: ( (lv_resources_21_0= ruleAsset ) )+
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
                    	    // InternalDmodel.g:2460:1: (lv_resources_21_0= ruleAsset )
                    	    {
                    	    // InternalDmodel.g:2460:1: (lv_resources_21_0= ruleAsset )
                    	    // InternalDmodel.g:2461:3: lv_resources_21_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_45);
                    	    lv_resources_21_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_21_0, 
                    	            		"datasemModeller.Dmodel.Asset");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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


                    }
                    break;

            }

            otherlv_22=(Token)match(input,54,FOLLOW_51); 

                	newLeafNode(otherlv_22, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_7());
                
            // InternalDmodel.g:2481:1: ( (lv_id_23_0= RULE_INT ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_INT) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDmodel.g:2482:1: (lv_id_23_0= RULE_INT )
                    {
                    // InternalDmodel.g:2482:1: (lv_id_23_0= RULE_INT )
                    // InternalDmodel.g:2483:3: lv_id_23_0= RULE_INT
                    {
                    lv_id_23_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_id_23_0, grammarAccess.getServiceProviderAccess().getIdINTTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_23_0, 
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
    // InternalDmodel.g:2507:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // InternalDmodel.g:2508:2: (iv_ruleAsset= ruleAsset EOF )
            // InternalDmodel.g:2509:2: iv_ruleAsset= ruleAsset EOF
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
    // InternalDmodel.g:2516:1: ruleAsset returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) ;
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
            // InternalDmodel.g:2519:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? ) )
            // InternalDmodel.g:2520:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            {
            // InternalDmodel.g:2520:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )? )
            // InternalDmodel.g:2520:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '*' ( (lv_number_2_0= ruleAbstractParameter ) ) otherlv_3= '{' (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )? otherlv_9= '}' ( (lv_id_10_0= RULE_INT ) )?
            {
            // InternalDmodel.g:2520:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2521:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2521:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2522:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_72); 

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

            otherlv_1=(Token)match(input,72,FOLLOW_64); 

                	newLeafNode(otherlv_1, grammarAccess.getAssetAccess().getAsteriskKeyword_1());
                
            // InternalDmodel.g:2542:1: ( (lv_number_2_0= ruleAbstractParameter ) )
            // InternalDmodel.g:2543:1: (lv_number_2_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:2543:1: (lv_number_2_0= ruleAbstractParameter )
            // InternalDmodel.g:2544:3: lv_number_2_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getAssetAccess().getNumberAbstractParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_42);
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

            otherlv_3=(Token)match(input,53,FOLLOW_73); 

                	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDmodel.g:2564:1: (otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==73) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDmodel.g:2564:3: otherlv_4= 'skills' otherlv_5= ':' ( (lv_skillSet_6_0= ruleSkill ) ) (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    {
                    otherlv_4=(Token)match(input,73,FOLLOW_40); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getSkillsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,51,FOLLOW_36); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getColonKeyword_4_1());
                        
                    // InternalDmodel.g:2572:1: ( (lv_skillSet_6_0= ruleSkill ) )
                    // InternalDmodel.g:2573:1: (lv_skillSet_6_0= ruleSkill )
                    {
                    // InternalDmodel.g:2573:1: (lv_skillSet_6_0= ruleSkill )
                    // InternalDmodel.g:2574:3: lv_skillSet_6_0= ruleSkill
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_48);
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

                    // InternalDmodel.g:2590:2: (otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==48) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalDmodel.g:2590:4: otherlv_7= ',' ( (lv_skillSet_8_0= ruleSkill ) )
                    	    {
                    	    otherlv_7=(Token)match(input,48,FOLLOW_36); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalDmodel.g:2594:1: ( (lv_skillSet_8_0= ruleSkill ) )
                    	    // InternalDmodel.g:2595:1: (lv_skillSet_8_0= ruleSkill )
                    	    {
                    	    // InternalDmodel.g:2595:1: (lv_skillSet_8_0= ruleSkill )
                    	    // InternalDmodel.g:2596:3: lv_skillSet_8_0= ruleSkill
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_48);
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
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,54,FOLLOW_51); 

                	newLeafNode(otherlv_9, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5());
                
            // InternalDmodel.g:2616:1: ( (lv_id_10_0= RULE_INT ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_INT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDmodel.g:2617:1: (lv_id_10_0= RULE_INT )
                    {
                    // InternalDmodel.g:2617:1: (lv_id_10_0= RULE_INT )
                    // InternalDmodel.g:2618:3: lv_id_10_0= RULE_INT
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
    // InternalDmodel.g:2642:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // InternalDmodel.g:2643:2: (iv_ruleSkill= ruleSkill EOF )
            // InternalDmodel.g:2644:2: iv_ruleSkill= ruleSkill EOF
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
    // InternalDmodel.g:2651:1: ruleSkill returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_efficiency_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:2654:28: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' ) )
            // InternalDmodel.g:2655:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            {
            // InternalDmodel.g:2655:1: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']' )
            // InternalDmodel.g:2655:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_efficiency_3_0= ruleAbstractParameter ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSkillAccess().getLeftSquareBracketKeyword_0());
                
            // InternalDmodel.g:2659:1: ( (otherlv_1= RULE_ID ) )
            // InternalDmodel.g:2660:1: (otherlv_1= RULE_ID )
            {
            // InternalDmodel.g:2660:1: (otherlv_1= RULE_ID )
            // InternalDmodel.g:2661:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkillRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_63); 

            		newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getServiceServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_64); 

                	newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getCommaKeyword_2());
                
            // InternalDmodel.g:2676:1: ( (lv_efficiency_3_0= ruleAbstractParameter ) )
            // InternalDmodel.g:2677:1: (lv_efficiency_3_0= ruleAbstractParameter )
            {
            // InternalDmodel.g:2677:1: (lv_efficiency_3_0= ruleAbstractParameter )
            // InternalDmodel.g:2678:3: lv_efficiency_3_0= ruleAbstractParameter
            {
             
            	        newCompositeNode(grammarAccess.getSkillAccess().getEfficiencyAbstractParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_65);
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

            otherlv_4=(Token)match(input,49,FOLLOW_2); 

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
    // InternalDmodel.g:2706:1: entryRuleExperimentVariable returns [EObject current=null] : iv_ruleExperimentVariable= ruleExperimentVariable EOF ;
    public final EObject entryRuleExperimentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentVariable = null;


        try {
            // InternalDmodel.g:2707:2: (iv_ruleExperimentVariable= ruleExperimentVariable EOF )
            // InternalDmodel.g:2708:2: iv_ruleExperimentVariable= ruleExperimentVariable EOF
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
    // InternalDmodel.g:2715:1: ruleExperimentVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) ;
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
            // InternalDmodel.g:2718:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) ) )
            // InternalDmodel.g:2719:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            {
            // InternalDmodel.g:2719:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) ) )
            // InternalDmodel.g:2719:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
            {
            // InternalDmodel.g:2719:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmodel.g:2720:1: (lv_name_0_0= RULE_ID )
            {
            // InternalDmodel.g:2720:1: (lv_name_0_0= RULE_ID )
            // InternalDmodel.g:2721:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            otherlv_1=(Token)match(input,51,FOLLOW_74); 

                	newLeafNode(otherlv_1, grammarAccess.getExperimentVariableAccess().getColonKeyword_1());
                
            // InternalDmodel.g:2741:1: ( ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) ) | ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) ) | ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) ) | ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) ) | ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) ) )
            int alt61=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt61=1;
                }
                break;
            case 75:
                {
                alt61=2;
                }
                break;
            case 43:
                {
                alt61=3;
                }
                break;
            case 76:
                {
                alt61=4;
                }
                break;
            case 77:
                {
                alt61=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalDmodel.g:2741:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalDmodel.g:2741:2: ( ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) ) )
                    // InternalDmodel.g:2741:3: ( (lv_boolean_2_0= 'boolean' ) ) ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalDmodel.g:2741:3: ( (lv_boolean_2_0= 'boolean' ) )
                    // InternalDmodel.g:2742:1: (lv_boolean_2_0= 'boolean' )
                    {
                    // InternalDmodel.g:2742:1: (lv_boolean_2_0= 'boolean' )
                    // InternalDmodel.g:2743:3: lv_boolean_2_0= 'boolean'
                    {
                    lv_boolean_2_0=(Token)match(input,74,FOLLOW_75); 

                            newLeafNode(lv_boolean_2_0, grammarAccess.getExperimentVariableAccess().getBooleanBooleanKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "boolean", true, "boolean");
                    	    

                    }


                    }

                    // InternalDmodel.g:2756:2: ( (lv_booleanValue_3_0= RULE_BOOLEAN ) )
                    // InternalDmodel.g:2757:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    {
                    // InternalDmodel.g:2757:1: (lv_booleanValue_3_0= RULE_BOOLEAN )
                    // InternalDmodel.g:2758:3: lv_booleanValue_3_0= RULE_BOOLEAN
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
                    // InternalDmodel.g:2775:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    {
                    // InternalDmodel.g:2775:6: ( ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) ) )
                    // InternalDmodel.g:2775:7: ( (lv_num_4_0= 'num' ) ) ( (lv_numValue_5_0= ruleNumber ) )
                    {
                    // InternalDmodel.g:2775:7: ( (lv_num_4_0= 'num' ) )
                    // InternalDmodel.g:2776:1: (lv_num_4_0= 'num' )
                    {
                    // InternalDmodel.g:2776:1: (lv_num_4_0= 'num' )
                    // InternalDmodel.g:2777:3: lv_num_4_0= 'num'
                    {
                    lv_num_4_0=(Token)match(input,75,FOLLOW_76); 

                            newLeafNode(lv_num_4_0, grammarAccess.getExperimentVariableAccess().getNumNumKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "num", true, "num");
                    	    

                    }


                    }

                    // InternalDmodel.g:2790:2: ( (lv_numValue_5_0= ruleNumber ) )
                    // InternalDmodel.g:2791:1: (lv_numValue_5_0= ruleNumber )
                    {
                    // InternalDmodel.g:2791:1: (lv_numValue_5_0= ruleNumber )
                    // InternalDmodel.g:2792:3: lv_numValue_5_0= ruleNumber
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
                    // InternalDmodel.g:2809:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    {
                    // InternalDmodel.g:2809:6: ( ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) ) )
                    // InternalDmodel.g:2809:7: ( (lv_distribution_6_0= 'Random.' ) ) ( (lv_numDist_7_0= ruleDistribution ) )
                    {
                    // InternalDmodel.g:2809:7: ( (lv_distribution_6_0= 'Random.' ) )
                    // InternalDmodel.g:2810:1: (lv_distribution_6_0= 'Random.' )
                    {
                    // InternalDmodel.g:2810:1: (lv_distribution_6_0= 'Random.' )
                    // InternalDmodel.g:2811:3: lv_distribution_6_0= 'Random.'
                    {
                    lv_distribution_6_0=(Token)match(input,43,FOLLOW_35); 

                            newLeafNode(lv_distribution_6_0, grammarAccess.getExperimentVariableAccess().getDistributionRandomKeyword_2_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // InternalDmodel.g:2824:2: ( (lv_numDist_7_0= ruleDistribution ) )
                    // InternalDmodel.g:2825:1: (lv_numDist_7_0= ruleDistribution )
                    {
                    // InternalDmodel.g:2825:1: (lv_numDist_7_0= ruleDistribution )
                    // InternalDmodel.g:2826:3: lv_numDist_7_0= ruleDistribution
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
                    // InternalDmodel.g:2843:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    {
                    // InternalDmodel.g:2843:6: ( ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) ) )
                    // InternalDmodel.g:2843:7: ( (lv_string_8_0= 'string' ) ) ( (lv_stringValue_9_0= RULE_STRING ) )
                    {
                    // InternalDmodel.g:2843:7: ( (lv_string_8_0= 'string' ) )
                    // InternalDmodel.g:2844:1: (lv_string_8_0= 'string' )
                    {
                    // InternalDmodel.g:2844:1: (lv_string_8_0= 'string' )
                    // InternalDmodel.g:2845:3: lv_string_8_0= 'string'
                    {
                    lv_string_8_0=(Token)match(input,76,FOLLOW_77); 

                            newLeafNode(lv_string_8_0, grammarAccess.getExperimentVariableAccess().getStringStringKeyword_2_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "string", true, "string");
                    	    

                    }


                    }

                    // InternalDmodel.g:2858:2: ( (lv_stringValue_9_0= RULE_STRING ) )
                    // InternalDmodel.g:2859:1: (lv_stringValue_9_0= RULE_STRING )
                    {
                    // InternalDmodel.g:2859:1: (lv_stringValue_9_0= RULE_STRING )
                    // InternalDmodel.g:2860:3: lv_stringValue_9_0= RULE_STRING
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
                    // InternalDmodel.g:2877:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    {
                    // InternalDmodel.g:2877:6: ( ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) ) )
                    // InternalDmodel.g:2877:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) ) ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    {
                    // InternalDmodel.g:2877:7: ( (lv_strategy_10_0= 'GovernanceStrategy' ) )
                    // InternalDmodel.g:2878:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    {
                    // InternalDmodel.g:2878:1: (lv_strategy_10_0= 'GovernanceStrategy' )
                    // InternalDmodel.g:2879:3: lv_strategy_10_0= 'GovernanceStrategy'
                    {
                    lv_strategy_10_0=(Token)match(input,77,FOLLOW_78); 

                            newLeafNode(lv_strategy_10_0, grammarAccess.getExperimentVariableAccess().getStrategyGovernanceStrategyKeyword_2_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExperimentVariableRule());
                    	        }
                           		setWithLastConsumed(current, "strategy", true, "GovernanceStrategy");
                    	    

                    }


                    }

                    // InternalDmodel.g:2892:2: ( (lv_strategyValue_11_0= ruleGovernanceStrategy ) )
                    // InternalDmodel.g:2893:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    {
                    // InternalDmodel.g:2893:1: (lv_strategyValue_11_0= ruleGovernanceStrategy )
                    // InternalDmodel.g:2894:3: lv_strategyValue_11_0= ruleGovernanceStrategy
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
    // InternalDmodel.g:2918:1: entryRuleWINReplication returns [EObject current=null] : iv_ruleWINReplication= ruleWINReplication EOF ;
    public final EObject entryRuleWINReplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWINReplication = null;


        try {
            // InternalDmodel.g:2919:2: (iv_ruleWINReplication= ruleWINReplication EOF )
            // InternalDmodel.g:2920:2: iv_ruleWINReplication= ruleWINReplication EOF
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
    // InternalDmodel.g:2927:1: ruleWINReplication returns [EObject current=null] : (otherlv_0= 'create' ( (otherlv_1= RULE_ID ) ) otherlv_2= '*' ( (lv_numReplications_3_0= RULE_INT ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'interArrival' otherlv_8= '=' ( (lv_interarrival_9_0= ruleAbstractParameter ) ) )? ) ;
    public final EObject ruleWINReplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numReplications_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_interarrival_9_0 = null;


         enterRule(); 
            
        try {
            // InternalDmodel.g:2930:28: ( (otherlv_0= 'create' ( (otherlv_1= RULE_ID ) ) otherlv_2= '*' ( (lv_numReplications_3_0= RULE_INT ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'interArrival' otherlv_8= '=' ( (lv_interarrival_9_0= ruleAbstractParameter ) ) )? ) )
            // InternalDmodel.g:2931:1: (otherlv_0= 'create' ( (otherlv_1= RULE_ID ) ) otherlv_2= '*' ( (lv_numReplications_3_0= RULE_INT ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'interArrival' otherlv_8= '=' ( (lv_interarrival_9_0= ruleAbstractParameter ) ) )? )
            {
            // InternalDmodel.g:2931:1: (otherlv_0= 'create' ( (otherlv_1= RULE_ID ) ) otherlv_2= '*' ( (lv_numReplications_3_0= RULE_INT ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'interArrival' otherlv_8= '=' ( (lv_interarrival_9_0= ruleAbstractParameter ) ) )? )
            // InternalDmodel.g:2931:3: otherlv_0= 'create' ( (otherlv_1= RULE_ID ) ) otherlv_2= '*' ( (lv_numReplications_3_0= RULE_INT ) ) otherlv_4= 'at' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'interArrival' otherlv_8= '=' ( (lv_interarrival_9_0= ruleAbstractParameter ) ) )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getWINReplicationAccess().getCreateKeyword_0());
                
            // InternalDmodel.g:2935:1: ( (otherlv_1= RULE_ID ) )
            // InternalDmodel.g:2936:1: (otherlv_1= RULE_ID )
            {
            // InternalDmodel.g:2936:1: (otherlv_1= RULE_ID )
            // InternalDmodel.g:2937:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_72); 

            		newLeafNode(otherlv_1, grammarAccess.getWINReplicationAccess().getWorkItemNetworkWorkItemNetworkCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,72,FOLLOW_50); 

                	newLeafNode(otherlv_2, grammarAccess.getWINReplicationAccess().getAsteriskKeyword_2());
                
            // InternalDmodel.g:2952:1: ( (lv_numReplications_3_0= RULE_INT ) )
            // InternalDmodel.g:2953:1: (lv_numReplications_3_0= RULE_INT )
            {
            // InternalDmodel.g:2953:1: (lv_numReplications_3_0= RULE_INT )
            // InternalDmodel.g:2954:3: lv_numReplications_3_0= RULE_INT
            {
            lv_numReplications_3_0=(Token)match(input,RULE_INT,FOLLOW_79); 

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

            otherlv_4=(Token)match(input,79,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getWINReplicationAccess().getAtKeyword_4());
                
            // InternalDmodel.g:2974:1: ( (otherlv_5= RULE_ID ) )
            // InternalDmodel.g:2975:1: (otherlv_5= RULE_ID )
            {
            // InternalDmodel.g:2975:1: (otherlv_5= RULE_ID )
            // InternalDmodel.g:2976:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_80); 

            		newLeafNode(otherlv_5, grammarAccess.getWINReplicationAccess().getAssignToServiceProviderCrossReference_5_0()); 
            	

            }


            }

            // InternalDmodel.g:2987:2: (otherlv_6= ',' otherlv_7= 'interArrival' otherlv_8= '=' ( (lv_interarrival_9_0= ruleAbstractParameter ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==48) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDmodel.g:2987:4: otherlv_6= ',' otherlv_7= 'interArrival' otherlv_8= '=' ( (lv_interarrival_9_0= ruleAbstractParameter ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_81); 

                        	newLeafNode(otherlv_6, grammarAccess.getWINReplicationAccess().getCommaKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,80,FOLLOW_46); 

                        	newLeafNode(otherlv_7, grammarAccess.getWINReplicationAccess().getInterArrivalKeyword_6_1());
                        
                    otherlv_8=(Token)match(input,57,FOLLOW_64); 

                        	newLeafNode(otherlv_8, grammarAccess.getWINReplicationAccess().getEqualsSignKeyword_6_2());
                        
                    // InternalDmodel.g:2999:1: ( (lv_interarrival_9_0= ruleAbstractParameter ) )
                    // InternalDmodel.g:3000:1: (lv_interarrival_9_0= ruleAbstractParameter )
                    {
                    // InternalDmodel.g:3000:1: (lv_interarrival_9_0= ruleAbstractParameter )
                    // InternalDmodel.g:3001:3: lv_interarrival_9_0= ruleAbstractParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getWINReplicationAccess().getInterarrivalAbstractParameterParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_interarrival_9_0=ruleAbstractParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWINReplicationRule());
                    	        }
                           		set(
                           			current, 
                           			"interarrival",
                            		lv_interarrival_9_0, 
                            		"datasemModeller.Dmodel.AbstractParameter");
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0800000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0440000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xE040000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xC040000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8040000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000080000000060L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00000400000001F0L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0020000000000022L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0060000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0060000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0060000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000080000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}