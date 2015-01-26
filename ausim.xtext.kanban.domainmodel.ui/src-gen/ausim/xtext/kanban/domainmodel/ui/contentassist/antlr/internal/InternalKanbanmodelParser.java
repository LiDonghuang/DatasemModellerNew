package ausim.xtext.kanban.domainmodel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ausim.xtext.kanban.domainmodel.services.KanbanmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKanbanmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'team'", "'group'", "'=>'", "'->'", "'KSSModel'", "'OrganizationModel'", "'end OrganizationModel'", "'WorkFlowModel'", "'end WorkFlowModel'", "'GovernanceModel'", "'end GovernanceModel'", "'end KSSModel'", "'{'", "'}'", "'sourceUnits'", "'targetUnits'", "'contains'", "'resources'", "'services'", "'service'", "'resource'", "'skills'", "'requirement'", "'workItems'", "'workItemNetwork'", "'workItem'", "'subtasks'", "'taskDependencies'", "'servicesRequired'", "'base value'", "'classOfService'", "'WorkFlow'", "'end WorkFlow'", "'capability'", "'strategy'", "'entity'", "'ServiceDirectory'", "'='", "'['", "']'", "'('", "','", "')'", "'events'", "'end'", "'activities'", "'state'", "'actions'", "'/'"
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
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
    public String getGrammarFileName() { return "../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g"; }


     
     	private KanbanmodelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KanbanmodelGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleKanbanSchedulingSystem"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:60:1: entryRuleKanbanSchedulingSystem : ruleKanbanSchedulingSystem EOF ;
    public final void entryRuleKanbanSchedulingSystem() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:61:1: ( ruleKanbanSchedulingSystem EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:62:1: ruleKanbanSchedulingSystem EOF
            {
             before(grammarAccess.getKanbanSchedulingSystemRule()); 
            pushFollow(FOLLOW_ruleKanbanSchedulingSystem_in_entryRuleKanbanSchedulingSystem61);
            ruleKanbanSchedulingSystem();

            state._fsp--;

             after(grammarAccess.getKanbanSchedulingSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKanbanSchedulingSystem68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKanbanSchedulingSystem"


    // $ANTLR start "ruleKanbanSchedulingSystem"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:69:1: ruleKanbanSchedulingSystem : ( ( rule__KanbanSchedulingSystem__Group__0 ) ) ;
    public final void ruleKanbanSchedulingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:73:2: ( ( ( rule__KanbanSchedulingSystem__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:74:1: ( ( rule__KanbanSchedulingSystem__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:74:1: ( ( rule__KanbanSchedulingSystem__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:75:1: ( rule__KanbanSchedulingSystem__Group__0 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:76:1: ( rule__KanbanSchedulingSystem__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:76:2: rule__KanbanSchedulingSystem__Group__0
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__0_in_ruleKanbanSchedulingSystem94);
            rule__KanbanSchedulingSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKanbanSchedulingSystem"


    // $ANTLR start "entryRuleTeam"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:88:1: entryRuleTeam : ruleTeam EOF ;
    public final void entryRuleTeam() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:89:1: ( ruleTeam EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:90:1: ruleTeam EOF
            {
             before(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_ruleTeam_in_entryRuleTeam121);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTeam128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:97:1: ruleTeam : ( ( rule__Team__Group__0 ) ) ;
    public final void ruleTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:101:2: ( ( ( rule__Team__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:102:1: ( ( rule__Team__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:102:1: ( ( rule__Team__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:103:1: ( rule__Team__Group__0 )
            {
             before(grammarAccess.getTeamAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:104:1: ( rule__Team__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:104:2: rule__Team__Group__0
            {
            pushFollow(FOLLOW_rule__Team__Group__0_in_ruleTeam154);
            rule__Team__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleService"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:116:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:117:1: ( ruleService EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:118:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService181);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:125:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:129:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:130:1: ( ( rule__Service__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:130:1: ( ( rule__Service__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:131:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:132:1: ( rule__Service__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:132:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService214);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleAsset"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:144:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:145:1: ( ruleAsset EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:146:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset241);
            ruleAsset();

            state._fsp--;

             after(grammarAccess.getAssetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:153:1: ruleAsset : ( ( rule__Asset__Group__0 ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:157:2: ( ( ( rule__Asset__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:158:1: ( ( rule__Asset__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:158:1: ( ( rule__Asset__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:159:1: ( rule__Asset__Group__0 )
            {
             before(grammarAccess.getAssetAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:160:1: ( rule__Asset__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:160:2: rule__Asset__Group__0
            {
            pushFollow(FOLLOW_rule__Asset__Group__0_in_ruleAsset274);
            rule__Asset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleSkill"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:172:1: entryRuleSkill : ruleSkill EOF ;
    public final void entryRuleSkill() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:173:1: ( ruleSkill EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:174:1: ruleSkill EOF
            {
             before(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_ruleSkill_in_entryRuleSkill301);
            ruleSkill();

            state._fsp--;

             after(grammarAccess.getSkillRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkill308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSkill"


    // $ANTLR start "ruleSkill"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:181:1: ruleSkill : ( ( rule__Skill__NameAssignment ) ) ;
    public final void ruleSkill() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:185:2: ( ( ( rule__Skill__NameAssignment ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:186:1: ( ( rule__Skill__NameAssignment ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:186:1: ( ( rule__Skill__NameAssignment ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:187:1: ( rule__Skill__NameAssignment )
            {
             before(grammarAccess.getSkillAccess().getNameAssignment()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:188:1: ( rule__Skill__NameAssignment )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:188:2: rule__Skill__NameAssignment
            {
            pushFollow(FOLLOW_rule__Skill__NameAssignment_in_ruleSkill334);
            rule__Skill__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSkillAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkill"


    // $ANTLR start "entryRuleDependency"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:200:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:201:1: ( ruleDependency EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:202:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency361);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:209:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:213:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:214:1: ( ( rule__Dependency__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:214:1: ( ( rule__Dependency__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:215:1: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:216:1: ( rule__Dependency__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:216:2: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0_in_ruleDependency394);
            rule__Dependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleRequirement"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:228:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:229:1: ( ruleRequirement EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:230:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement421);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:237:1: ruleRequirement : ( ( rule__Requirement__Group__0 ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:241:2: ( ( ( rule__Requirement__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:242:1: ( ( rule__Requirement__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:242:1: ( ( rule__Requirement__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:243:1: ( rule__Requirement__Group__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:244:1: ( rule__Requirement__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:244:2: rule__Requirement__Group__0
            {
            pushFollow(FOLLOW_rule__Requirement__Group__0_in_ruleRequirement454);
            rule__Requirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleTask"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:256:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:257:1: ( ruleTask EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:258:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask481);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:265:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:269:2: ( ( ( rule__Task__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:270:1: ( ( rule__Task__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:270:1: ( ( rule__Task__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:271:1: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:272:1: ( rule__Task__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:272:2: rule__Task__Group__0
            {
            pushFollow(FOLLOW_rule__Task__Group__0_in_ruleTask514);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleKanbanTaskModel"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:284:1: entryRuleKanbanTaskModel : ruleKanbanTaskModel EOF ;
    public final void entryRuleKanbanTaskModel() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:285:1: ( ruleKanbanTaskModel EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:286:1: ruleKanbanTaskModel EOF
            {
             before(grammarAccess.getKanbanTaskModelRule()); 
            pushFollow(FOLLOW_ruleKanbanTaskModel_in_entryRuleKanbanTaskModel541);
            ruleKanbanTaskModel();

            state._fsp--;

             after(grammarAccess.getKanbanTaskModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKanbanTaskModel548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKanbanTaskModel"


    // $ANTLR start "ruleKanbanTaskModel"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:293:1: ruleKanbanTaskModel : ( ( rule__KanbanTaskModel__Group__0 ) ) ;
    public final void ruleKanbanTaskModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:297:2: ( ( ( rule__KanbanTaskModel__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:298:1: ( ( rule__KanbanTaskModel__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:298:1: ( ( rule__KanbanTaskModel__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:299:1: ( rule__KanbanTaskModel__Group__0 )
            {
             before(grammarAccess.getKanbanTaskModelAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:300:1: ( rule__KanbanTaskModel__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:300:2: rule__KanbanTaskModel__Group__0
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__0_in_ruleKanbanTaskModel574);
            rule__KanbanTaskModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKanbanTaskModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKanbanTaskModel"


    // $ANTLR start "entryRuleCapability"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:312:1: entryRuleCapability : ruleCapability EOF ;
    public final void entryRuleCapability() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:313:1: ( ruleCapability EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:314:1: ruleCapability EOF
            {
             before(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_ruleCapability_in_entryRuleCapability601);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getCapabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCapability608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:321:1: ruleCapability : ( ( rule__Capability__Group__0 ) ) ;
    public final void ruleCapability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:325:2: ( ( ( rule__Capability__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:326:1: ( ( rule__Capability__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:326:1: ( ( rule__Capability__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:327:1: ( rule__Capability__Group__0 )
            {
             before(grammarAccess.getCapabilityAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:328:1: ( rule__Capability__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:328:2: rule__Capability__Group__0
            {
            pushFollow(FOLLOW_rule__Capability__Group__0_in_ruleCapability634);
            rule__Capability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleKanbanGovModel"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:340:1: entryRuleKanbanGovModel : ruleKanbanGovModel EOF ;
    public final void entryRuleKanbanGovModel() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:341:1: ( ruleKanbanGovModel EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:342:1: ruleKanbanGovModel EOF
            {
             before(grammarAccess.getKanbanGovModelRule()); 
            pushFollow(FOLLOW_ruleKanbanGovModel_in_entryRuleKanbanGovModel661);
            ruleKanbanGovModel();

            state._fsp--;

             after(grammarAccess.getKanbanGovModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKanbanGovModel668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKanbanGovModel"


    // $ANTLR start "ruleKanbanGovModel"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:349:1: ruleKanbanGovModel : ( ( rule__KanbanGovModel__StrategyAssignment ) ) ;
    public final void ruleKanbanGovModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:353:2: ( ( ( rule__KanbanGovModel__StrategyAssignment ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:354:1: ( ( rule__KanbanGovModel__StrategyAssignment ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:354:1: ( ( rule__KanbanGovModel__StrategyAssignment ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:355:1: ( rule__KanbanGovModel__StrategyAssignment )
            {
             before(grammarAccess.getKanbanGovModelAccess().getStrategyAssignment()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:356:1: ( rule__KanbanGovModel__StrategyAssignment )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:356:2: rule__KanbanGovModel__StrategyAssignment
            {
            pushFollow(FOLLOW_rule__KanbanGovModel__StrategyAssignment_in_ruleKanbanGovModel694);
            rule__KanbanGovModel__StrategyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getKanbanGovModelAccess().getStrategyAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKanbanGovModel"


    // $ANTLR start "entryRuleStrategy"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:368:1: entryRuleStrategy : ruleStrategy EOF ;
    public final void entryRuleStrategy() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:369:1: ( ruleStrategy EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:370:1: ruleStrategy EOF
            {
             before(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_ruleStrategy_in_entryRuleStrategy721);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getStrategyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategy728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:377:1: ruleStrategy : ( ( rule__Strategy__Group__0 ) ) ;
    public final void ruleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:381:2: ( ( ( rule__Strategy__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:382:1: ( ( rule__Strategy__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:382:1: ( ( rule__Strategy__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:383:1: ( rule__Strategy__Group__0 )
            {
             before(grammarAccess.getStrategyAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:384:1: ( rule__Strategy__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:384:2: rule__Strategy__Group__0
            {
            pushFollow(FOLLOW_rule__Strategy__Group__0_in_ruleStrategy754);
            rule__Strategy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStrategyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleEntity"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:396:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:397:1: ( ruleEntity EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:398:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity781);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:405:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:409:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:410:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:410:1: ( ( rule__Entity__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:411:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:412:1: ( rule__Entity__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:412:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity814);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProvision"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:424:1: entryRuleProvision : ruleProvision EOF ;
    public final void entryRuleProvision() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:425:1: ( ruleProvision EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:426:1: ruleProvision EOF
            {
             before(grammarAccess.getProvisionRule()); 
            pushFollow(FOLLOW_ruleProvision_in_entryRuleProvision841);
            ruleProvision();

            state._fsp--;

             after(grammarAccess.getProvisionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvision848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProvision"


    // $ANTLR start "ruleProvision"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:433:1: ruleProvision : ( ( rule__Provision__Group__0 ) ) ;
    public final void ruleProvision() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:437:2: ( ( ( rule__Provision__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:438:1: ( ( rule__Provision__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:438:1: ( ( rule__Provision__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:439:1: ( rule__Provision__Group__0 )
            {
             before(grammarAccess.getProvisionAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:440:1: ( rule__Provision__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:440:2: rule__Provision__Group__0
            {
            pushFollow(FOLLOW_rule__Provision__Group__0_in_ruleProvision874);
            rule__Provision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvision"


    // $ANTLR start "entryRuleStatemachine"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:452:1: entryRuleStatemachine : ruleStatemachine EOF ;
    public final void entryRuleStatemachine() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:453:1: ( ruleStatemachine EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:454:1: ruleStatemachine EOF
            {
             before(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine901);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStatemachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:461:1: ruleStatemachine : ( ( rule__Statemachine__Group__0 ) ) ;
    public final void ruleStatemachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:465:2: ( ( ( rule__Statemachine__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:466:1: ( ( rule__Statemachine__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:466:1: ( ( rule__Statemachine__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:467:1: ( rule__Statemachine__Group__0 )
            {
             before(grammarAccess.getStatemachineAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:468:1: ( rule__Statemachine__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:468:2: rule__Statemachine__Group__0
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine934);
            rule__Statemachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEvent"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:480:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:481:1: ( ruleEvent EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:482:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent961);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:489:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:493:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:494:1: ( ( rule__Event__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:494:1: ( ( rule__Event__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:495:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:496:1: ( rule__Event__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:496:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent994);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCommand"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:508:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:509:1: ( ruleCommand EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:510:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1021);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:517:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:521:2: ( ( ( rule__Command__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:522:1: ( ( rule__Command__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:522:1: ( ( rule__Command__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:523:1: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:524:1: ( rule__Command__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:524:2: rule__Command__Group__0
            {
            pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand1054);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleState"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:536:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:537:1: ( ruleState EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:538:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1081);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:545:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:549:2: ( ( ( rule__State__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:550:1: ( ( rule__State__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:550:1: ( ( rule__State__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:551:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:552:1: ( rule__State__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:552:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState1114);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:564:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:565:1: ( ruleTransition EOF )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:566:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1141);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:573:1: ruleTransition : ( ( rule__Transition__Alternatives ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:577:2: ( ( ( rule__Transition__Alternatives ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:578:1: ( ( rule__Transition__Alternatives ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:578:1: ( ( rule__Transition__Alternatives ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:579:1: ( rule__Transition__Alternatives )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:580:1: ( rule__Transition__Alternatives )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:580:2: rule__Transition__Alternatives
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_in_ruleTransition1174);
            rule__Transition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__Team__Alternatives_0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:592:1: rule__Team__Alternatives_0 : ( ( 'team' ) | ( 'group' ) );
    public final void rule__Team__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:596:1: ( ( 'team' ) | ( 'group' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:597:1: ( 'team' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:597:1: ( 'team' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:598:1: 'team'
                    {
                     before(grammarAccess.getTeamAccess().getTeamKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Team__Alternatives_01211); 
                     after(grammarAccess.getTeamAccess().getTeamKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:605:6: ( 'group' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:605:6: ( 'group' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:606:1: 'group'
                    {
                     before(grammarAccess.getTeamAccess().getGroupKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Team__Alternatives_01231); 
                     after(grammarAccess.getTeamAccess().getGroupKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Alternatives_0"


    // $ANTLR start "rule__Dependency__Alternatives_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:618:1: rule__Dependency__Alternatives_1 : ( ( '=>' ) | ( '->' ) );
    public final void rule__Dependency__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:622:1: ( ( '=>' ) | ( '->' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:623:1: ( '=>' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:623:1: ( '=>' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:624:1: '=>'
                    {
                     before(grammarAccess.getDependencyAccess().getEqualsSignGreaterThanSignKeyword_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__Dependency__Alternatives_11266); 
                     after(grammarAccess.getDependencyAccess().getEqualsSignGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:631:6: ( '->' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:631:6: ( '->' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:632:1: '->'
                    {
                     before(grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__Dependency__Alternatives_11286); 
                     after(grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Alternatives_1"


    // $ANTLR start "rule__Transition__Alternatives"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:644:1: rule__Transition__Alternatives : ( ( ( rule__Transition__Group_0__0 ) ) | ( ( rule__Transition__Group_1__0 ) ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:648:1: ( ( ( rule__Transition__Group_0__0 ) ) | ( ( rule__Transition__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==13) ) {
                    alt3=1;
                }
                else if ( (LA3_1==59) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:649:1: ( ( rule__Transition__Group_0__0 ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:649:1: ( ( rule__Transition__Group_0__0 ) )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:650:1: ( rule__Transition__Group_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0()); 
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:651:1: ( rule__Transition__Group_0__0 )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:651:2: rule__Transition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_0__0_in_rule__Transition__Alternatives1320);
                    rule__Transition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:655:6: ( ( rule__Transition__Group_1__0 ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:655:6: ( ( rule__Transition__Group_1__0 ) )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:656:1: ( rule__Transition__Group_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_1()); 
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:657:1: ( rule__Transition__Group_1__0 )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:657:2: rule__Transition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_1__0_in_rule__Transition__Alternatives1338);
                    rule__Transition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:668:1: rule__KanbanSchedulingSystem__Group__0 : rule__KanbanSchedulingSystem__Group__0__Impl rule__KanbanSchedulingSystem__Group__1 ;
    public final void rule__KanbanSchedulingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:672:1: ( rule__KanbanSchedulingSystem__Group__0__Impl rule__KanbanSchedulingSystem__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:673:2: rule__KanbanSchedulingSystem__Group__0__Impl rule__KanbanSchedulingSystem__Group__1
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__0__Impl_in_rule__KanbanSchedulingSystem__Group__01369);
            rule__KanbanSchedulingSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__1_in_rule__KanbanSchedulingSystem__Group__01372);
            rule__KanbanSchedulingSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__0"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:680:1: rule__KanbanSchedulingSystem__Group__0__Impl : ( 'KSSModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:684:1: ( ( 'KSSModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:685:1: ( 'KSSModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:685:1: ( 'KSSModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:686:1: 'KSSModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKSSModelKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__KanbanSchedulingSystem__Group__0__Impl1400); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getKSSModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__0__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:699:1: rule__KanbanSchedulingSystem__Group__1 : rule__KanbanSchedulingSystem__Group__1__Impl rule__KanbanSchedulingSystem__Group__2 ;
    public final void rule__KanbanSchedulingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:703:1: ( rule__KanbanSchedulingSystem__Group__1__Impl rule__KanbanSchedulingSystem__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:704:2: rule__KanbanSchedulingSystem__Group__1__Impl rule__KanbanSchedulingSystem__Group__2
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__1__Impl_in_rule__KanbanSchedulingSystem__Group__11431);
            rule__KanbanSchedulingSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__2_in_rule__KanbanSchedulingSystem__Group__11434);
            rule__KanbanSchedulingSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__1"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:711:1: rule__KanbanSchedulingSystem__Group__1__Impl : ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:715:1: ( ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:716:1: ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:716:1: ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:717:1: ( rule__KanbanSchedulingSystem__NameAssignment_1 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:718:1: ( rule__KanbanSchedulingSystem__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:718:2: rule__KanbanSchedulingSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__NameAssignment_1_in_rule__KanbanSchedulingSystem__Group__1__Impl1461);
            rule__KanbanSchedulingSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__1__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:728:1: rule__KanbanSchedulingSystem__Group__2 : rule__KanbanSchedulingSystem__Group__2__Impl rule__KanbanSchedulingSystem__Group__3 ;
    public final void rule__KanbanSchedulingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:732:1: ( rule__KanbanSchedulingSystem__Group__2__Impl rule__KanbanSchedulingSystem__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:733:2: rule__KanbanSchedulingSystem__Group__2__Impl rule__KanbanSchedulingSystem__Group__3
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__2__Impl_in_rule__KanbanSchedulingSystem__Group__21491);
            rule__KanbanSchedulingSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__3_in_rule__KanbanSchedulingSystem__Group__21494);
            rule__KanbanSchedulingSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__2"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:740:1: rule__KanbanSchedulingSystem__Group__2__Impl : ( 'OrganizationModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:744:1: ( ( 'OrganizationModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:745:1: ( 'OrganizationModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:745:1: ( 'OrganizationModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:746:1: 'OrganizationModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationModelKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__KanbanSchedulingSystem__Group__2__Impl1522); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationModelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__2__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:759:1: rule__KanbanSchedulingSystem__Group__3 : rule__KanbanSchedulingSystem__Group__3__Impl rule__KanbanSchedulingSystem__Group__4 ;
    public final void rule__KanbanSchedulingSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:763:1: ( rule__KanbanSchedulingSystem__Group__3__Impl rule__KanbanSchedulingSystem__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:764:2: rule__KanbanSchedulingSystem__Group__3__Impl rule__KanbanSchedulingSystem__Group__4
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__3__Impl_in_rule__KanbanSchedulingSystem__Group__31553);
            rule__KanbanSchedulingSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__4_in_rule__KanbanSchedulingSystem__Group__31556);
            rule__KanbanSchedulingSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__3"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:771:1: rule__KanbanSchedulingSystem__Group__3__Impl : ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:775:1: ( ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:776:1: ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:776:1: ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:777:1: ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:777:1: ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:778:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:779:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:779:2: rule__KanbanSchedulingSystem__OrgUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1585);
            rule__KanbanSchedulingSystem__OrgUnitsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:782:1: ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:783:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )*
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:784:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:784:2: rule__KanbanSchedulingSystem__OrgUnitsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1597);
            	    rule__KanbanSchedulingSystem__OrgUnitsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__3__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:795:1: rule__KanbanSchedulingSystem__Group__4 : rule__KanbanSchedulingSystem__Group__4__Impl rule__KanbanSchedulingSystem__Group__5 ;
    public final void rule__KanbanSchedulingSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:799:1: ( rule__KanbanSchedulingSystem__Group__4__Impl rule__KanbanSchedulingSystem__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:800:2: rule__KanbanSchedulingSystem__Group__4__Impl rule__KanbanSchedulingSystem__Group__5
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__4__Impl_in_rule__KanbanSchedulingSystem__Group__41630);
            rule__KanbanSchedulingSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__5_in_rule__KanbanSchedulingSystem__Group__41633);
            rule__KanbanSchedulingSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__4"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:807:1: rule__KanbanSchedulingSystem__Group__4__Impl : ( 'end OrganizationModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:811:1: ( ( 'end OrganizationModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:812:1: ( 'end OrganizationModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:812:1: ( 'end OrganizationModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:813:1: 'end OrganizationModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationModelKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__KanbanSchedulingSystem__Group__4__Impl1661); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationModelKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__4__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__5"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:826:1: rule__KanbanSchedulingSystem__Group__5 : rule__KanbanSchedulingSystem__Group__5__Impl rule__KanbanSchedulingSystem__Group__6 ;
    public final void rule__KanbanSchedulingSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:830:1: ( rule__KanbanSchedulingSystem__Group__5__Impl rule__KanbanSchedulingSystem__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:831:2: rule__KanbanSchedulingSystem__Group__5__Impl rule__KanbanSchedulingSystem__Group__6
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__5__Impl_in_rule__KanbanSchedulingSystem__Group__51692);
            rule__KanbanSchedulingSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__6_in_rule__KanbanSchedulingSystem__Group__51695);
            rule__KanbanSchedulingSystem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__5"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__5__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:838:1: rule__KanbanSchedulingSystem__Group__5__Impl : ( 'WorkFlowModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:842:1: ( ( 'WorkFlowModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:843:1: ( 'WorkFlowModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:843:1: ( 'WorkFlowModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:844:1: 'WorkFlowModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getWorkFlowModelKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__KanbanSchedulingSystem__Group__5__Impl1723); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getWorkFlowModelKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__5__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__6"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:857:1: rule__KanbanSchedulingSystem__Group__6 : rule__KanbanSchedulingSystem__Group__6__Impl rule__KanbanSchedulingSystem__Group__7 ;
    public final void rule__KanbanSchedulingSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:861:1: ( rule__KanbanSchedulingSystem__Group__6__Impl rule__KanbanSchedulingSystem__Group__7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:862:2: rule__KanbanSchedulingSystem__Group__6__Impl rule__KanbanSchedulingSystem__Group__7
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__6__Impl_in_rule__KanbanSchedulingSystem__Group__61754);
            rule__KanbanSchedulingSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__7_in_rule__KanbanSchedulingSystem__Group__61757);
            rule__KanbanSchedulingSystem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__6"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__6__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:869:1: rule__KanbanSchedulingSystem__Group__6__Impl : ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:873:1: ( ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:874:1: ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:874:1: ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:875:1: ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:875:1: ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:876:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:877:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:877:2: rule__KanbanSchedulingSystem__KssTasksAssignment_6
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1786);
            rule__KanbanSchedulingSystem__KssTasksAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:880:1: ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:881:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )*
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:882:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==36) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:882:2: rule__KanbanSchedulingSystem__KssTasksAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1798);
            	    rule__KanbanSchedulingSystem__KssTasksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__6__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__7"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:893:1: rule__KanbanSchedulingSystem__Group__7 : rule__KanbanSchedulingSystem__Group__7__Impl rule__KanbanSchedulingSystem__Group__8 ;
    public final void rule__KanbanSchedulingSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:897:1: ( rule__KanbanSchedulingSystem__Group__7__Impl rule__KanbanSchedulingSystem__Group__8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:898:2: rule__KanbanSchedulingSystem__Group__7__Impl rule__KanbanSchedulingSystem__Group__8
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__7__Impl_in_rule__KanbanSchedulingSystem__Group__71831);
            rule__KanbanSchedulingSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__8_in_rule__KanbanSchedulingSystem__Group__71834);
            rule__KanbanSchedulingSystem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__7"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__7__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:905:1: rule__KanbanSchedulingSystem__Group__7__Impl : ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:909:1: ( ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:910:1: ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:910:1: ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:911:1: ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowAssignment_7()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:912:1: ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:912:2: rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7_in_rule__KanbanSchedulingSystem__Group__7__Impl1861);
            rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__7__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__8"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:922:1: rule__KanbanSchedulingSystem__Group__8 : rule__KanbanSchedulingSystem__Group__8__Impl rule__KanbanSchedulingSystem__Group__9 ;
    public final void rule__KanbanSchedulingSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:926:1: ( rule__KanbanSchedulingSystem__Group__8__Impl rule__KanbanSchedulingSystem__Group__9 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:927:2: rule__KanbanSchedulingSystem__Group__8__Impl rule__KanbanSchedulingSystem__Group__9
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__8__Impl_in_rule__KanbanSchedulingSystem__Group__81891);
            rule__KanbanSchedulingSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__9_in_rule__KanbanSchedulingSystem__Group__81894);
            rule__KanbanSchedulingSystem__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__8"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__8__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:934:1: rule__KanbanSchedulingSystem__Group__8__Impl : ( 'end WorkFlowModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:938:1: ( ( 'end WorkFlowModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:939:1: ( 'end WorkFlowModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:939:1: ( 'end WorkFlowModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:940:1: 'end WorkFlowModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkFlowModelKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__KanbanSchedulingSystem__Group__8__Impl1922); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkFlowModelKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__8__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__9"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:953:1: rule__KanbanSchedulingSystem__Group__9 : rule__KanbanSchedulingSystem__Group__9__Impl rule__KanbanSchedulingSystem__Group__10 ;
    public final void rule__KanbanSchedulingSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:957:1: ( rule__KanbanSchedulingSystem__Group__9__Impl rule__KanbanSchedulingSystem__Group__10 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:958:2: rule__KanbanSchedulingSystem__Group__9__Impl rule__KanbanSchedulingSystem__Group__10
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__9__Impl_in_rule__KanbanSchedulingSystem__Group__91953);
            rule__KanbanSchedulingSystem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__10_in_rule__KanbanSchedulingSystem__Group__91956);
            rule__KanbanSchedulingSystem__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__9"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__9__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:965:1: rule__KanbanSchedulingSystem__Group__9__Impl : ( 'GovernanceModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:969:1: ( ( 'GovernanceModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:970:1: ( 'GovernanceModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:970:1: ( 'GovernanceModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:971:1: 'GovernanceModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceModelKeyword_9()); 
            match(input,20,FOLLOW_20_in_rule__KanbanSchedulingSystem__Group__9__Impl1984); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceModelKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__9__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__10"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:984:1: rule__KanbanSchedulingSystem__Group__10 : rule__KanbanSchedulingSystem__Group__10__Impl rule__KanbanSchedulingSystem__Group__11 ;
    public final void rule__KanbanSchedulingSystem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:988:1: ( rule__KanbanSchedulingSystem__Group__10__Impl rule__KanbanSchedulingSystem__Group__11 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:989:2: rule__KanbanSchedulingSystem__Group__10__Impl rule__KanbanSchedulingSystem__Group__11
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__10__Impl_in_rule__KanbanSchedulingSystem__Group__102015);
            rule__KanbanSchedulingSystem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__11_in_rule__KanbanSchedulingSystem__Group__102018);
            rule__KanbanSchedulingSystem__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__10"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__10__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:996:1: rule__KanbanSchedulingSystem__Group__10__Impl : ( ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1000:1: ( ( ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1001:1: ( ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1001:1: ( ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1002:1: ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssGovModelAssignment_10()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1003:1: ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1003:2: rule__KanbanSchedulingSystem__KssGovModelAssignment_10
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssGovModelAssignment_10_in_rule__KanbanSchedulingSystem__Group__10__Impl2045);
            rule__KanbanSchedulingSystem__KssGovModelAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssGovModelAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__10__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__11"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1013:1: rule__KanbanSchedulingSystem__Group__11 : rule__KanbanSchedulingSystem__Group__11__Impl rule__KanbanSchedulingSystem__Group__12 ;
    public final void rule__KanbanSchedulingSystem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1017:1: ( rule__KanbanSchedulingSystem__Group__11__Impl rule__KanbanSchedulingSystem__Group__12 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1018:2: rule__KanbanSchedulingSystem__Group__11__Impl rule__KanbanSchedulingSystem__Group__12
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__11__Impl_in_rule__KanbanSchedulingSystem__Group__112075);
            rule__KanbanSchedulingSystem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__12_in_rule__KanbanSchedulingSystem__Group__112078);
            rule__KanbanSchedulingSystem__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__11"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__11__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1025:1: rule__KanbanSchedulingSystem__Group__11__Impl : ( 'end GovernanceModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1029:1: ( ( 'end GovernanceModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1030:1: ( 'end GovernanceModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1030:1: ( 'end GovernanceModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1031:1: 'end GovernanceModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceModelKeyword_11()); 
            match(input,21,FOLLOW_21_in_rule__KanbanSchedulingSystem__Group__11__Impl2106); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceModelKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__11__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__12"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1044:1: rule__KanbanSchedulingSystem__Group__12 : rule__KanbanSchedulingSystem__Group__12__Impl ;
    public final void rule__KanbanSchedulingSystem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1048:1: ( rule__KanbanSchedulingSystem__Group__12__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1049:2: rule__KanbanSchedulingSystem__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__12__Impl_in_rule__KanbanSchedulingSystem__Group__122137);
            rule__KanbanSchedulingSystem__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__12"


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__12__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1055:1: rule__KanbanSchedulingSystem__Group__12__Impl : ( 'end KSSModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1059:1: ( ( 'end KSSModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1060:1: ( 'end KSSModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1060:1: ( 'end KSSModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1061:1: 'end KSSModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSModelKeyword_12()); 
            match(input,22,FOLLOW_22_in_rule__KanbanSchedulingSystem__Group__12__Impl2165); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSModelKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__Group__12__Impl"


    // $ANTLR start "rule__Team__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1100:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1104:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1105:2: rule__Team__Group__0__Impl rule__Team__Group__1
            {
            pushFollow(FOLLOW_rule__Team__Group__0__Impl_in_rule__Team__Group__02222);
            rule__Team__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__1_in_rule__Team__Group__02225);
            rule__Team__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0"


    // $ANTLR start "rule__Team__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1112:1: rule__Team__Group__0__Impl : ( ( rule__Team__Alternatives_0 ) ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1116:1: ( ( ( rule__Team__Alternatives_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1117:1: ( ( rule__Team__Alternatives_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1117:1: ( ( rule__Team__Alternatives_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1118:1: ( rule__Team__Alternatives_0 )
            {
             before(grammarAccess.getTeamAccess().getAlternatives_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1119:1: ( rule__Team__Alternatives_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1119:2: rule__Team__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Team__Alternatives_0_in_rule__Team__Group__0__Impl2252);
            rule__Team__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0__Impl"


    // $ANTLR start "rule__Team__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1129:1: rule__Team__Group__1 : rule__Team__Group__1__Impl rule__Team__Group__2 ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1133:1: ( rule__Team__Group__1__Impl rule__Team__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1134:2: rule__Team__Group__1__Impl rule__Team__Group__2
            {
            pushFollow(FOLLOW_rule__Team__Group__1__Impl_in_rule__Team__Group__12282);
            rule__Team__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__2_in_rule__Team__Group__12285);
            rule__Team__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__1"


    // $ANTLR start "rule__Team__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1141:1: rule__Team__Group__1__Impl : ( ( rule__Team__NameAssignment_1 ) ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1145:1: ( ( ( rule__Team__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1146:1: ( ( rule__Team__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1146:1: ( ( rule__Team__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1147:1: ( rule__Team__NameAssignment_1 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1148:1: ( rule__Team__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1148:2: rule__Team__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Team__NameAssignment_1_in_rule__Team__Group__1__Impl2312);
            rule__Team__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__1__Impl"


    // $ANTLR start "rule__Team__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1158:1: rule__Team__Group__2 : rule__Team__Group__2__Impl rule__Team__Group__3 ;
    public final void rule__Team__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1162:1: ( rule__Team__Group__2__Impl rule__Team__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1163:2: rule__Team__Group__2__Impl rule__Team__Group__3
            {
            pushFollow(FOLLOW_rule__Team__Group__2__Impl_in_rule__Team__Group__22342);
            rule__Team__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__3_in_rule__Team__Group__22345);
            rule__Team__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__2"


    // $ANTLR start "rule__Team__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1170:1: rule__Team__Group__2__Impl : ( '{' ) ;
    public final void rule__Team__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1174:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1175:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1175:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1176:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group__2__Impl2373); 
             after(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__2__Impl"


    // $ANTLR start "rule__Team__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1189:1: rule__Team__Group__3 : rule__Team__Group__3__Impl rule__Team__Group__4 ;
    public final void rule__Team__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1193:1: ( rule__Team__Group__3__Impl rule__Team__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1194:2: rule__Team__Group__3__Impl rule__Team__Group__4
            {
            pushFollow(FOLLOW_rule__Team__Group__3__Impl_in_rule__Team__Group__32404);
            rule__Team__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__4_in_rule__Team__Group__32407);
            rule__Team__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__3"


    // $ANTLR start "rule__Team__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1201:1: rule__Team__Group__3__Impl : ( ( rule__Team__Group_3__0 )? ) ;
    public final void rule__Team__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1205:1: ( ( ( rule__Team__Group_3__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1206:1: ( ( rule__Team__Group_3__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1206:1: ( ( rule__Team__Group_3__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1207:1: ( rule__Team__Group_3__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1208:1: ( rule__Team__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1208:2: rule__Team__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_3__0_in_rule__Team__Group__3__Impl2434);
                    rule__Team__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeamAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__3__Impl"


    // $ANTLR start "rule__Team__Group__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1218:1: rule__Team__Group__4 : rule__Team__Group__4__Impl rule__Team__Group__5 ;
    public final void rule__Team__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1222:1: ( rule__Team__Group__4__Impl rule__Team__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1223:2: rule__Team__Group__4__Impl rule__Team__Group__5
            {
            pushFollow(FOLLOW_rule__Team__Group__4__Impl_in_rule__Team__Group__42465);
            rule__Team__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__5_in_rule__Team__Group__42468);
            rule__Team__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__4"


    // $ANTLR start "rule__Team__Group__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1230:1: rule__Team__Group__4__Impl : ( ( rule__Team__Group_4__0 )? ) ;
    public final void rule__Team__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1234:1: ( ( ( rule__Team__Group_4__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1235:1: ( ( rule__Team__Group_4__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1235:1: ( ( rule__Team__Group_4__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1236:1: ( rule__Team__Group_4__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1237:1: ( rule__Team__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1237:2: rule__Team__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_4__0_in_rule__Team__Group__4__Impl2495);
                    rule__Team__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeamAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__4__Impl"


    // $ANTLR start "rule__Team__Group__5"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1247:1: rule__Team__Group__5 : rule__Team__Group__5__Impl rule__Team__Group__6 ;
    public final void rule__Team__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1251:1: ( rule__Team__Group__5__Impl rule__Team__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1252:2: rule__Team__Group__5__Impl rule__Team__Group__6
            {
            pushFollow(FOLLOW_rule__Team__Group__5__Impl_in_rule__Team__Group__52526);
            rule__Team__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__6_in_rule__Team__Group__52529);
            rule__Team__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__5"


    // $ANTLR start "rule__Team__Group__5__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1259:1: rule__Team__Group__5__Impl : ( ( rule__Team__Group_5__0 )? ) ;
    public final void rule__Team__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1263:1: ( ( ( rule__Team__Group_5__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1264:1: ( ( rule__Team__Group_5__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1264:1: ( ( rule__Team__Group_5__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1265:1: ( rule__Team__Group_5__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_5()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1266:1: ( rule__Team__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1266:2: rule__Team__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_5__0_in_rule__Team__Group__5__Impl2556);
                    rule__Team__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeamAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__5__Impl"


    // $ANTLR start "rule__Team__Group__6"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1276:1: rule__Team__Group__6 : rule__Team__Group__6__Impl rule__Team__Group__7 ;
    public final void rule__Team__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1280:1: ( rule__Team__Group__6__Impl rule__Team__Group__7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1281:2: rule__Team__Group__6__Impl rule__Team__Group__7
            {
            pushFollow(FOLLOW_rule__Team__Group__6__Impl_in_rule__Team__Group__62587);
            rule__Team__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__7_in_rule__Team__Group__62590);
            rule__Team__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__6"


    // $ANTLR start "rule__Team__Group__6__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1288:1: rule__Team__Group__6__Impl : ( ( rule__Team__Group_6__0 )? ) ;
    public final void rule__Team__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1292:1: ( ( ( rule__Team__Group_6__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1293:1: ( ( rule__Team__Group_6__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1293:1: ( ( rule__Team__Group_6__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1294:1: ( rule__Team__Group_6__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1295:1: ( rule__Team__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1295:2: rule__Team__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_6__0_in_rule__Team__Group__6__Impl2617);
                    rule__Team__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeamAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__6__Impl"


    // $ANTLR start "rule__Team__Group__7"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1305:1: rule__Team__Group__7 : rule__Team__Group__7__Impl rule__Team__Group__8 ;
    public final void rule__Team__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1309:1: ( rule__Team__Group__7__Impl rule__Team__Group__8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1310:2: rule__Team__Group__7__Impl rule__Team__Group__8
            {
            pushFollow(FOLLOW_rule__Team__Group__7__Impl_in_rule__Team__Group__72648);
            rule__Team__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__8_in_rule__Team__Group__72651);
            rule__Team__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__7"


    // $ANTLR start "rule__Team__Group__7__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1317:1: rule__Team__Group__7__Impl : ( ( rule__Team__Group_7__0 )? ) ;
    public final void rule__Team__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1321:1: ( ( ( rule__Team__Group_7__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1322:1: ( ( rule__Team__Group_7__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1322:1: ( ( rule__Team__Group_7__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1323:1: ( rule__Team__Group_7__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_7()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1324:1: ( rule__Team__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1324:2: rule__Team__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_7__0_in_rule__Team__Group__7__Impl2678);
                    rule__Team__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeamAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__7__Impl"


    // $ANTLR start "rule__Team__Group__8"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1334:1: rule__Team__Group__8 : rule__Team__Group__8__Impl ;
    public final void rule__Team__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1338:1: ( rule__Team__Group__8__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1339:2: rule__Team__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group__8__Impl_in_rule__Team__Group__82709);
            rule__Team__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__8"


    // $ANTLR start "rule__Team__Group__8__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1345:1: rule__Team__Group__8__Impl : ( '}' ) ;
    public final void rule__Team__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1349:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1350:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1350:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1351:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group__8__Impl2737); 
             after(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__8__Impl"


    // $ANTLR start "rule__Team__Group_3__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1382:1: rule__Team__Group_3__0 : rule__Team__Group_3__0__Impl rule__Team__Group_3__1 ;
    public final void rule__Team__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1386:1: ( rule__Team__Group_3__0__Impl rule__Team__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1387:2: rule__Team__Group_3__0__Impl rule__Team__Group_3__1
            {
            pushFollow(FOLLOW_rule__Team__Group_3__0__Impl_in_rule__Team__Group_3__02786);
            rule__Team__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_3__1_in_rule__Team__Group_3__02789);
            rule__Team__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__0"


    // $ANTLR start "rule__Team__Group_3__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1394:1: rule__Team__Group_3__0__Impl : ( 'sourceUnits' ) ;
    public final void rule__Team__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1398:1: ( ( 'sourceUnits' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1399:1: ( 'sourceUnits' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1399:1: ( 'sourceUnits' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1400:1: 'sourceUnits'
            {
             before(grammarAccess.getTeamAccess().getSourceUnitsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Team__Group_3__0__Impl2817); 
             after(grammarAccess.getTeamAccess().getSourceUnitsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__0__Impl"


    // $ANTLR start "rule__Team__Group_3__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1413:1: rule__Team__Group_3__1 : rule__Team__Group_3__1__Impl rule__Team__Group_3__2 ;
    public final void rule__Team__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1417:1: ( rule__Team__Group_3__1__Impl rule__Team__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1418:2: rule__Team__Group_3__1__Impl rule__Team__Group_3__2
            {
            pushFollow(FOLLOW_rule__Team__Group_3__1__Impl_in_rule__Team__Group_3__12848);
            rule__Team__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_3__2_in_rule__Team__Group_3__12851);
            rule__Team__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__1"


    // $ANTLR start "rule__Team__Group_3__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1425:1: rule__Team__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1429:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1430:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1430:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1431:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_3__1__Impl2879); 
             after(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__1__Impl"


    // $ANTLR start "rule__Team__Group_3__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1444:1: rule__Team__Group_3__2 : rule__Team__Group_3__2__Impl rule__Team__Group_3__3 ;
    public final void rule__Team__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1448:1: ( rule__Team__Group_3__2__Impl rule__Team__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1449:2: rule__Team__Group_3__2__Impl rule__Team__Group_3__3
            {
            pushFollow(FOLLOW_rule__Team__Group_3__2__Impl_in_rule__Team__Group_3__22910);
            rule__Team__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_3__3_in_rule__Team__Group_3__22913);
            rule__Team__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__2"


    // $ANTLR start "rule__Team__Group_3__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1456:1: rule__Team__Group_3__2__Impl : ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) ) ;
    public final void rule__Team__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1460:1: ( ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1461:1: ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1461:1: ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1462:1: ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1462:1: ( ( rule__Team__DemandUnitsAssignment_3_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1463:1: ( rule__Team__DemandUnitsAssignment_3_2 )
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1464:1: ( rule__Team__DemandUnitsAssignment_3_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1464:2: rule__Team__DemandUnitsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2942);
            rule__Team__DemandUnitsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1467:1: ( ( rule__Team__DemandUnitsAssignment_3_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1468:1: ( rule__Team__DemandUnitsAssignment_3_2 )*
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1469:1: ( rule__Team__DemandUnitsAssignment_3_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1469:2: rule__Team__DemandUnitsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2954);
            	    rule__Team__DemandUnitsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__2__Impl"


    // $ANTLR start "rule__Team__Group_3__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1480:1: rule__Team__Group_3__3 : rule__Team__Group_3__3__Impl ;
    public final void rule__Team__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1484:1: ( rule__Team__Group_3__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1485:2: rule__Team__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_3__3__Impl_in_rule__Team__Group_3__32987);
            rule__Team__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__3"


    // $ANTLR start "rule__Team__Group_3__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1491:1: rule__Team__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1495:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1496:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1496:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1497:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_3__3__Impl3015); 
             after(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__3__Impl"


    // $ANTLR start "rule__Team__Group_4__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1518:1: rule__Team__Group_4__0 : rule__Team__Group_4__0__Impl rule__Team__Group_4__1 ;
    public final void rule__Team__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1522:1: ( rule__Team__Group_4__0__Impl rule__Team__Group_4__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1523:2: rule__Team__Group_4__0__Impl rule__Team__Group_4__1
            {
            pushFollow(FOLLOW_rule__Team__Group_4__0__Impl_in_rule__Team__Group_4__03054);
            rule__Team__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_4__1_in_rule__Team__Group_4__03057);
            rule__Team__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__0"


    // $ANTLR start "rule__Team__Group_4__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1530:1: rule__Team__Group_4__0__Impl : ( 'targetUnits' ) ;
    public final void rule__Team__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1534:1: ( ( 'targetUnits' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1535:1: ( 'targetUnits' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1535:1: ( 'targetUnits' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1536:1: 'targetUnits'
            {
             before(grammarAccess.getTeamAccess().getTargetUnitsKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Team__Group_4__0__Impl3085); 
             after(grammarAccess.getTeamAccess().getTargetUnitsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__0__Impl"


    // $ANTLR start "rule__Team__Group_4__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1549:1: rule__Team__Group_4__1 : rule__Team__Group_4__1__Impl rule__Team__Group_4__2 ;
    public final void rule__Team__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1553:1: ( rule__Team__Group_4__1__Impl rule__Team__Group_4__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1554:2: rule__Team__Group_4__1__Impl rule__Team__Group_4__2
            {
            pushFollow(FOLLOW_rule__Team__Group_4__1__Impl_in_rule__Team__Group_4__13116);
            rule__Team__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_4__2_in_rule__Team__Group_4__13119);
            rule__Team__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__1"


    // $ANTLR start "rule__Team__Group_4__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1561:1: rule__Team__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1565:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1566:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1566:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1567:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_4__1__Impl3147); 
             after(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__1__Impl"


    // $ANTLR start "rule__Team__Group_4__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1580:1: rule__Team__Group_4__2 : rule__Team__Group_4__2__Impl rule__Team__Group_4__3 ;
    public final void rule__Team__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1584:1: ( rule__Team__Group_4__2__Impl rule__Team__Group_4__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1585:2: rule__Team__Group_4__2__Impl rule__Team__Group_4__3
            {
            pushFollow(FOLLOW_rule__Team__Group_4__2__Impl_in_rule__Team__Group_4__23178);
            rule__Team__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_4__3_in_rule__Team__Group_4__23181);
            rule__Team__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__2"


    // $ANTLR start "rule__Team__Group_4__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1592:1: rule__Team__Group_4__2__Impl : ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) ) ;
    public final void rule__Team__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1596:1: ( ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1597:1: ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1597:1: ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1598:1: ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1598:1: ( ( rule__Team__SourcedUnitsAssignment_4_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1599:1: ( rule__Team__SourcedUnitsAssignment_4_2 )
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1600:1: ( rule__Team__SourcedUnitsAssignment_4_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1600:2: rule__Team__SourcedUnitsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl3210);
            rule__Team__SourcedUnitsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1603:1: ( ( rule__Team__SourcedUnitsAssignment_4_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1604:1: ( rule__Team__SourcedUnitsAssignment_4_2 )*
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1605:1: ( rule__Team__SourcedUnitsAssignment_4_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1605:2: rule__Team__SourcedUnitsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl3222);
            	    rule__Team__SourcedUnitsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__2__Impl"


    // $ANTLR start "rule__Team__Group_4__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1616:1: rule__Team__Group_4__3 : rule__Team__Group_4__3__Impl ;
    public final void rule__Team__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1620:1: ( rule__Team__Group_4__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1621:2: rule__Team__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_4__3__Impl_in_rule__Team__Group_4__33255);
            rule__Team__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__3"


    // $ANTLR start "rule__Team__Group_4__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1627:1: rule__Team__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1631:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1632:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1632:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1633:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_4__3__Impl3283); 
             after(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__3__Impl"


    // $ANTLR start "rule__Team__Group_5__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1654:1: rule__Team__Group_5__0 : rule__Team__Group_5__0__Impl rule__Team__Group_5__1 ;
    public final void rule__Team__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1658:1: ( rule__Team__Group_5__0__Impl rule__Team__Group_5__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1659:2: rule__Team__Group_5__0__Impl rule__Team__Group_5__1
            {
            pushFollow(FOLLOW_rule__Team__Group_5__0__Impl_in_rule__Team__Group_5__03322);
            rule__Team__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_5__1_in_rule__Team__Group_5__03325);
            rule__Team__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_5__0"


    // $ANTLR start "rule__Team__Group_5__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1666:1: rule__Team__Group_5__0__Impl : ( 'contains' ) ;
    public final void rule__Team__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1670:1: ( ( 'contains' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1671:1: ( 'contains' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1671:1: ( 'contains' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1672:1: 'contains'
            {
             before(grammarAccess.getTeamAccess().getContainsKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__Team__Group_5__0__Impl3353); 
             after(grammarAccess.getTeamAccess().getContainsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_5__0__Impl"


    // $ANTLR start "rule__Team__Group_5__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1685:1: rule__Team__Group_5__1 : rule__Team__Group_5__1__Impl rule__Team__Group_5__2 ;
    public final void rule__Team__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1689:1: ( rule__Team__Group_5__1__Impl rule__Team__Group_5__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1690:2: rule__Team__Group_5__1__Impl rule__Team__Group_5__2
            {
            pushFollow(FOLLOW_rule__Team__Group_5__1__Impl_in_rule__Team__Group_5__13384);
            rule__Team__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_5__2_in_rule__Team__Group_5__13387);
            rule__Team__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_5__1"


    // $ANTLR start "rule__Team__Group_5__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1697:1: rule__Team__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1701:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1702:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1702:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1703:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_5__1__Impl3415); 
             after(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_5__1__Impl"


    // $ANTLR start "rule__Team__Group_5__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1716:1: rule__Team__Group_5__2 : rule__Team__Group_5__2__Impl rule__Team__Group_5__3 ;
    public final void rule__Team__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1720:1: ( rule__Team__Group_5__2__Impl rule__Team__Group_5__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1721:2: rule__Team__Group_5__2__Impl rule__Team__Group_5__3
            {
            pushFollow(FOLLOW_rule__Team__Group_5__2__Impl_in_rule__Team__Group_5__23446);
            rule__Team__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_5__3_in_rule__Team__Group_5__23449);
            rule__Team__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_5__2"


    // $ANTLR start "rule__Team__Group_5__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1728:1: rule__Team__Group_5__2__Impl : ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) ) ;
    public final void rule__Team__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1732:1: ( ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1733:1: ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1733:1: ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1734:1: ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1734:1: ( ( rule__Team__GroupmembersAssignment_5_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1735:1: ( rule__Team__GroupmembersAssignment_5_2 )
            {
             before(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1736:1: ( rule__Team__GroupmembersAssignment_5_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1736:2: rule__Team__GroupmembersAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl3478);
            rule__Team__GroupmembersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1739:1: ( ( rule__Team__GroupmembersAssignment_5_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1740:1: ( rule__Team__GroupmembersAssignment_5_2 )*
            {
             before(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1741:1: ( rule__Team__GroupmembersAssignment_5_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1741:2: rule__Team__GroupmembersAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl3490);
            	    rule__Team__GroupmembersAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_5__2__Impl"


    // $ANTLR start "rule__Team__Group_5__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1752:1: rule__Team__Group_5__3 : rule__Team__Group_5__3__Impl ;
    public final void rule__Team__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1756:1: ( rule__Team__Group_5__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1757:2: rule__Team__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_5__3__Impl_in_rule__Team__Group_5__33523);
            rule__Team__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_5__3"


    // $ANTLR start "rule__Team__Group_5__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1763:1: rule__Team__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1767:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1768:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1768:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1769:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_5__3__Impl3551); 
             after(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_5__3__Impl"


    // $ANTLR start "rule__Team__Group_6__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1790:1: rule__Team__Group_6__0 : rule__Team__Group_6__0__Impl rule__Team__Group_6__1 ;
    public final void rule__Team__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1794:1: ( rule__Team__Group_6__0__Impl rule__Team__Group_6__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1795:2: rule__Team__Group_6__0__Impl rule__Team__Group_6__1
            {
            pushFollow(FOLLOW_rule__Team__Group_6__0__Impl_in_rule__Team__Group_6__03590);
            rule__Team__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_6__1_in_rule__Team__Group_6__03593);
            rule__Team__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_6__0"


    // $ANTLR start "rule__Team__Group_6__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1802:1: rule__Team__Group_6__0__Impl : ( 'resources' ) ;
    public final void rule__Team__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1806:1: ( ( 'resources' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1807:1: ( 'resources' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1807:1: ( 'resources' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1808:1: 'resources'
            {
             before(grammarAccess.getTeamAccess().getResourcesKeyword_6_0()); 
            match(input,28,FOLLOW_28_in_rule__Team__Group_6__0__Impl3621); 
             after(grammarAccess.getTeamAccess().getResourcesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_6__0__Impl"


    // $ANTLR start "rule__Team__Group_6__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1821:1: rule__Team__Group_6__1 : rule__Team__Group_6__1__Impl rule__Team__Group_6__2 ;
    public final void rule__Team__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1825:1: ( rule__Team__Group_6__1__Impl rule__Team__Group_6__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1826:2: rule__Team__Group_6__1__Impl rule__Team__Group_6__2
            {
            pushFollow(FOLLOW_rule__Team__Group_6__1__Impl_in_rule__Team__Group_6__13652);
            rule__Team__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_6__2_in_rule__Team__Group_6__13655);
            rule__Team__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_6__1"


    // $ANTLR start "rule__Team__Group_6__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1833:1: rule__Team__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1837:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1838:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1838:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1839:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_6__1__Impl3683); 
             after(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_6__1__Impl"


    // $ANTLR start "rule__Team__Group_6__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1852:1: rule__Team__Group_6__2 : rule__Team__Group_6__2__Impl rule__Team__Group_6__3 ;
    public final void rule__Team__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1856:1: ( rule__Team__Group_6__2__Impl rule__Team__Group_6__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1857:2: rule__Team__Group_6__2__Impl rule__Team__Group_6__3
            {
            pushFollow(FOLLOW_rule__Team__Group_6__2__Impl_in_rule__Team__Group_6__23714);
            rule__Team__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_6__3_in_rule__Team__Group_6__23717);
            rule__Team__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_6__2"


    // $ANTLR start "rule__Team__Group_6__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1864:1: rule__Team__Group_6__2__Impl : ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) ) ;
    public final void rule__Team__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1868:1: ( ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1869:1: ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1869:1: ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1870:1: ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1870:1: ( ( rule__Team__ResourcesAssignment_6_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1871:1: ( rule__Team__ResourcesAssignment_6_2 )
            {
             before(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1872:1: ( rule__Team__ResourcesAssignment_6_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1872:2: rule__Team__ResourcesAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl3746);
            rule__Team__ResourcesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1875:1: ( ( rule__Team__ResourcesAssignment_6_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1876:1: ( rule__Team__ResourcesAssignment_6_2 )*
            {
             before(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1877:1: ( rule__Team__ResourcesAssignment_6_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1877:2: rule__Team__ResourcesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl3758);
            	    rule__Team__ResourcesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_6__2__Impl"


    // $ANTLR start "rule__Team__Group_6__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1888:1: rule__Team__Group_6__3 : rule__Team__Group_6__3__Impl ;
    public final void rule__Team__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1892:1: ( rule__Team__Group_6__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1893:2: rule__Team__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_6__3__Impl_in_rule__Team__Group_6__33791);
            rule__Team__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_6__3"


    // $ANTLR start "rule__Team__Group_6__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1899:1: rule__Team__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1903:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1904:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1904:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1905:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_6__3__Impl3819); 
             after(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_6__3__Impl"


    // $ANTLR start "rule__Team__Group_7__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1926:1: rule__Team__Group_7__0 : rule__Team__Group_7__0__Impl rule__Team__Group_7__1 ;
    public final void rule__Team__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1930:1: ( rule__Team__Group_7__0__Impl rule__Team__Group_7__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1931:2: rule__Team__Group_7__0__Impl rule__Team__Group_7__1
            {
            pushFollow(FOLLOW_rule__Team__Group_7__0__Impl_in_rule__Team__Group_7__03858);
            rule__Team__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_7__1_in_rule__Team__Group_7__03861);
            rule__Team__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_7__0"


    // $ANTLR start "rule__Team__Group_7__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1938:1: rule__Team__Group_7__0__Impl : ( 'services' ) ;
    public final void rule__Team__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1942:1: ( ( 'services' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1943:1: ( 'services' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1943:1: ( 'services' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1944:1: 'services'
            {
             before(grammarAccess.getTeamAccess().getServicesKeyword_7_0()); 
            match(input,29,FOLLOW_29_in_rule__Team__Group_7__0__Impl3889); 
             after(grammarAccess.getTeamAccess().getServicesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_7__0__Impl"


    // $ANTLR start "rule__Team__Group_7__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1957:1: rule__Team__Group_7__1 : rule__Team__Group_7__1__Impl rule__Team__Group_7__2 ;
    public final void rule__Team__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1961:1: ( rule__Team__Group_7__1__Impl rule__Team__Group_7__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1962:2: rule__Team__Group_7__1__Impl rule__Team__Group_7__2
            {
            pushFollow(FOLLOW_rule__Team__Group_7__1__Impl_in_rule__Team__Group_7__13920);
            rule__Team__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_7__2_in_rule__Team__Group_7__13923);
            rule__Team__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_7__1"


    // $ANTLR start "rule__Team__Group_7__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1969:1: rule__Team__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1973:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1974:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1974:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1975:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_7__1__Impl3951); 
             after(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_7__1__Impl"


    // $ANTLR start "rule__Team__Group_7__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1988:1: rule__Team__Group_7__2 : rule__Team__Group_7__2__Impl rule__Team__Group_7__3 ;
    public final void rule__Team__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1992:1: ( rule__Team__Group_7__2__Impl rule__Team__Group_7__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1993:2: rule__Team__Group_7__2__Impl rule__Team__Group_7__3
            {
            pushFollow(FOLLOW_rule__Team__Group_7__2__Impl_in_rule__Team__Group_7__23982);
            rule__Team__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_7__3_in_rule__Team__Group_7__23985);
            rule__Team__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_7__2"


    // $ANTLR start "rule__Team__Group_7__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2000:1: rule__Team__Group_7__2__Impl : ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) ) ;
    public final void rule__Team__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2004:1: ( ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2005:1: ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2005:1: ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2006:1: ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2006:1: ( ( rule__Team__ServicesAssignment_7_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2007:1: ( rule__Team__ServicesAssignment_7_2 )
            {
             before(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2008:1: ( rule__Team__ServicesAssignment_7_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2008:2: rule__Team__ServicesAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl4014);
            rule__Team__ServicesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2011:1: ( ( rule__Team__ServicesAssignment_7_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2012:1: ( rule__Team__ServicesAssignment_7_2 )*
            {
             before(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2013:1: ( rule__Team__ServicesAssignment_7_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2013:2: rule__Team__ServicesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl4026);
            	    rule__Team__ServicesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_7__2__Impl"


    // $ANTLR start "rule__Team__Group_7__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2024:1: rule__Team__Group_7__3 : rule__Team__Group_7__3__Impl ;
    public final void rule__Team__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2028:1: ( rule__Team__Group_7__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2029:2: rule__Team__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_7__3__Impl_in_rule__Team__Group_7__34059);
            rule__Team__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_7__3"


    // $ANTLR start "rule__Team__Group_7__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2035:1: rule__Team__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2039:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2040:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2040:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2041:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_7__3__Impl4087); 
             after(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_7__3__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2062:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2066:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2067:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__04126);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__04129);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2074:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2078:1: ( ( 'service' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2079:1: ( 'service' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2079:1: ( 'service' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2080:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Service__Group__0__Impl4157); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2093:1: rule__Service__Group__1 : rule__Service__Group__1__Impl ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2097:1: ( rule__Service__Group__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2098:2: rule__Service__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__14188);
            rule__Service__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2104:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2108:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2109:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2109:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2110:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2111:1: ( rule__Service__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2111:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl4215);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Asset__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2125:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2129:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2130:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__04249);
            rule__Asset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__04252);
            rule__Asset__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__0"


    // $ANTLR start "rule__Asset__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2137:1: rule__Asset__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2141:1: ( ( 'resource' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2142:1: ( 'resource' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2142:1: ( 'resource' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2143:1: 'resource'
            {
             before(grammarAccess.getAssetAccess().getResourceKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Asset__Group__0__Impl4280); 
             after(grammarAccess.getAssetAccess().getResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__0__Impl"


    // $ANTLR start "rule__Asset__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2156:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl rule__Asset__Group__2 ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2160:1: ( rule__Asset__Group__1__Impl rule__Asset__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2161:2: rule__Asset__Group__1__Impl rule__Asset__Group__2
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__14311);
            rule__Asset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__14314);
            rule__Asset__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__1"


    // $ANTLR start "rule__Asset__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2168:1: rule__Asset__Group__1__Impl : ( ( rule__Asset__NameAssignment_1 ) ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2172:1: ( ( ( rule__Asset__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2173:1: ( ( rule__Asset__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2173:1: ( ( rule__Asset__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2174:1: ( rule__Asset__NameAssignment_1 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2175:1: ( rule__Asset__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2175:2: rule__Asset__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl4341);
            rule__Asset__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__1__Impl"


    // $ANTLR start "rule__Asset__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2185:1: rule__Asset__Group__2 : rule__Asset__Group__2__Impl ;
    public final void rule__Asset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2189:1: ( rule__Asset__Group__2__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2190:2: rule__Asset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__24371);
            rule__Asset__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__2"


    // $ANTLR start "rule__Asset__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2196:1: rule__Asset__Group__2__Impl : ( ( rule__Asset__Group_2__0 )? ) ;
    public final void rule__Asset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2200:1: ( ( ( rule__Asset__Group_2__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2201:1: ( ( rule__Asset__Group_2__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2201:1: ( ( rule__Asset__Group_2__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2202:1: ( rule__Asset__Group_2__0 )?
            {
             before(grammarAccess.getAssetAccess().getGroup_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2203:1: ( rule__Asset__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2203:2: rule__Asset__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl4398);
                    rule__Asset__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__2__Impl"


    // $ANTLR start "rule__Asset__Group_2__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2219:1: rule__Asset__Group_2__0 : rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 ;
    public final void rule__Asset__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2223:1: ( rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2224:2: rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__04435);
            rule__Asset__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__04438);
            rule__Asset__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__0"


    // $ANTLR start "rule__Asset__Group_2__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2231:1: rule__Asset__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Asset__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2235:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2236:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2236:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2237:1: '{'
            {
             before(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Asset__Group_2__0__Impl4466); 
             after(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__0__Impl"


    // $ANTLR start "rule__Asset__Group_2__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2250:1: rule__Asset__Group_2__1 : rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2 ;
    public final void rule__Asset__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2254:1: ( rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2255:2: rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__14497);
            rule__Asset__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__2_in_rule__Asset__Group_2__14500);
            rule__Asset__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__1"


    // $ANTLR start "rule__Asset__Group_2__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2262:1: rule__Asset__Group_2__1__Impl : ( 'skills' ) ;
    public final void rule__Asset__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2266:1: ( ( 'skills' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2267:1: ( 'skills' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2267:1: ( 'skills' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2268:1: 'skills'
            {
             before(grammarAccess.getAssetAccess().getSkillsKeyword_2_1()); 
            match(input,32,FOLLOW_32_in_rule__Asset__Group_2__1__Impl4528); 
             after(grammarAccess.getAssetAccess().getSkillsKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__1__Impl"


    // $ANTLR start "rule__Asset__Group_2__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2281:1: rule__Asset__Group_2__2 : rule__Asset__Group_2__2__Impl rule__Asset__Group_2__3 ;
    public final void rule__Asset__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2285:1: ( rule__Asset__Group_2__2__Impl rule__Asset__Group_2__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2286:2: rule__Asset__Group_2__2__Impl rule__Asset__Group_2__3
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__2__Impl_in_rule__Asset__Group_2__24559);
            rule__Asset__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__3_in_rule__Asset__Group_2__24562);
            rule__Asset__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__2"


    // $ANTLR start "rule__Asset__Group_2__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2293:1: rule__Asset__Group_2__2__Impl : ( '{' ) ;
    public final void rule__Asset__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2297:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2298:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2298:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2299:1: '{'
            {
             before(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__Asset__Group_2__2__Impl4590); 
             after(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__2__Impl"


    // $ANTLR start "rule__Asset__Group_2__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2312:1: rule__Asset__Group_2__3 : rule__Asset__Group_2__3__Impl rule__Asset__Group_2__4 ;
    public final void rule__Asset__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2316:1: ( rule__Asset__Group_2__3__Impl rule__Asset__Group_2__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2317:2: rule__Asset__Group_2__3__Impl rule__Asset__Group_2__4
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__3__Impl_in_rule__Asset__Group_2__34621);
            rule__Asset__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__4_in_rule__Asset__Group_2__34624);
            rule__Asset__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__3"


    // $ANTLR start "rule__Asset__Group_2__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2324:1: rule__Asset__Group_2__3__Impl : ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) ) ;
    public final void rule__Asset__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2328:1: ( ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2329:1: ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2329:1: ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2330:1: ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2330:1: ( ( rule__Asset__HasSkillsAssignment_2_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2331:1: ( rule__Asset__HasSkillsAssignment_2_3 )
            {
             before(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2332:1: ( rule__Asset__HasSkillsAssignment_2_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2332:2: rule__Asset__HasSkillsAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl4653);
            rule__Asset__HasSkillsAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2335:1: ( ( rule__Asset__HasSkillsAssignment_2_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2336:1: ( rule__Asset__HasSkillsAssignment_2_3 )*
            {
             before(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2337:1: ( rule__Asset__HasSkillsAssignment_2_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2337:2: rule__Asset__HasSkillsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl4665);
            	    rule__Asset__HasSkillsAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__3__Impl"


    // $ANTLR start "rule__Asset__Group_2__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2348:1: rule__Asset__Group_2__4 : rule__Asset__Group_2__4__Impl rule__Asset__Group_2__5 ;
    public final void rule__Asset__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2352:1: ( rule__Asset__Group_2__4__Impl rule__Asset__Group_2__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2353:2: rule__Asset__Group_2__4__Impl rule__Asset__Group_2__5
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__4__Impl_in_rule__Asset__Group_2__44698);
            rule__Asset__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__5_in_rule__Asset__Group_2__44701);
            rule__Asset__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__4"


    // $ANTLR start "rule__Asset__Group_2__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2360:1: rule__Asset__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Asset__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2364:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2365:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2365:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2366:1: '}'
            {
             before(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,24,FOLLOW_24_in_rule__Asset__Group_2__4__Impl4729); 
             after(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__4__Impl"


    // $ANTLR start "rule__Asset__Group_2__5"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2379:1: rule__Asset__Group_2__5 : rule__Asset__Group_2__5__Impl ;
    public final void rule__Asset__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2383:1: ( rule__Asset__Group_2__5__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2384:2: rule__Asset__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__5__Impl_in_rule__Asset__Group_2__54760);
            rule__Asset__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__5"


    // $ANTLR start "rule__Asset__Group_2__5__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2390:1: rule__Asset__Group_2__5__Impl : ( '}' ) ;
    public final void rule__Asset__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2394:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2395:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2395:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2396:1: '}'
            {
             before(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,24,FOLLOW_24_in_rule__Asset__Group_2__5__Impl4788); 
             after(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_2__5__Impl"


    // $ANTLR start "rule__Dependency__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2421:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2425:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2426:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__04831);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__04834);
            rule__Dependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0"


    // $ANTLR start "rule__Dependency__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2433:1: rule__Dependency__Group__0__Impl : ( ( rule__Dependency__SourceTaskAssignment_0 ) ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2437:1: ( ( ( rule__Dependency__SourceTaskAssignment_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2438:1: ( ( rule__Dependency__SourceTaskAssignment_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2438:1: ( ( rule__Dependency__SourceTaskAssignment_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2439:1: ( rule__Dependency__SourceTaskAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getSourceTaskAssignment_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2440:1: ( rule__Dependency__SourceTaskAssignment_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2440:2: rule__Dependency__SourceTaskAssignment_0
            {
            pushFollow(FOLLOW_rule__Dependency__SourceTaskAssignment_0_in_rule__Dependency__Group__0__Impl4861);
            rule__Dependency__SourceTaskAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getSourceTaskAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0__Impl"


    // $ANTLR start "rule__Dependency__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2450:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2454:1: ( rule__Dependency__Group__1__Impl rule__Dependency__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2455:2: rule__Dependency__Group__1__Impl rule__Dependency__Group__2
            {
            pushFollow(FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__14891);
            rule__Dependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__14894);
            rule__Dependency__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1"


    // $ANTLR start "rule__Dependency__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2462:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__Alternatives_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2466:1: ( ( ( rule__Dependency__Alternatives_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2467:1: ( ( rule__Dependency__Alternatives_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2467:1: ( ( rule__Dependency__Alternatives_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2468:1: ( rule__Dependency__Alternatives_1 )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2469:1: ( rule__Dependency__Alternatives_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2469:2: rule__Dependency__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Dependency__Alternatives_1_in_rule__Dependency__Group__1__Impl4921);
            rule__Dependency__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1__Impl"


    // $ANTLR start "rule__Dependency__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2479:1: rule__Dependency__Group__2 : rule__Dependency__Group__2__Impl ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2483:1: ( rule__Dependency__Group__2__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2484:2: rule__Dependency__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__24951);
            rule__Dependency__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__2"


    // $ANTLR start "rule__Dependency__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2490:1: rule__Dependency__Group__2__Impl : ( ( rule__Dependency__TargetTaskAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2494:1: ( ( ( rule__Dependency__TargetTaskAssignment_2 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2495:1: ( ( rule__Dependency__TargetTaskAssignment_2 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2495:1: ( ( rule__Dependency__TargetTaskAssignment_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2496:1: ( rule__Dependency__TargetTaskAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getTargetTaskAssignment_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2497:1: ( rule__Dependency__TargetTaskAssignment_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2497:2: rule__Dependency__TargetTaskAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__TargetTaskAssignment_2_in_rule__Dependency__Group__2__Impl4978);
            rule__Dependency__TargetTaskAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getTargetTaskAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__2__Impl"


    // $ANTLR start "rule__Requirement__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2513:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2517:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2518:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__05014);
            rule__Requirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__05017);
            rule__Requirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0"


    // $ANTLR start "rule__Requirement__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2525:1: rule__Requirement__Group__0__Impl : ( 'requirement' ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2529:1: ( ( 'requirement' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2530:1: ( 'requirement' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2530:1: ( 'requirement' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2531:1: 'requirement'
            {
             before(grammarAccess.getRequirementAccess().getRequirementKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Requirement__Group__0__Impl5045); 
             after(grammarAccess.getRequirementAccess().getRequirementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0__Impl"


    // $ANTLR start "rule__Requirement__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2544:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2548:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2549:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__15076);
            rule__Requirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__15079);
            rule__Requirement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1"


    // $ANTLR start "rule__Requirement__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2556:1: rule__Requirement__Group__1__Impl : ( ( rule__Requirement__NameAssignment_1 ) ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2560:1: ( ( ( rule__Requirement__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2561:1: ( ( rule__Requirement__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2561:1: ( ( rule__Requirement__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2562:1: ( rule__Requirement__NameAssignment_1 )
            {
             before(grammarAccess.getRequirementAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2563:1: ( rule__Requirement__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2563:2: rule__Requirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Requirement__NameAssignment_1_in_rule__Requirement__Group__1__Impl5106);
            rule__Requirement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1__Impl"


    // $ANTLR start "rule__Requirement__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2573:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl rule__Requirement__Group__3 ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2577:1: ( rule__Requirement__Group__2__Impl rule__Requirement__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2578:2: rule__Requirement__Group__2__Impl rule__Requirement__Group__3
            {
            pushFollow(FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__25136);
            rule__Requirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__25139);
            rule__Requirement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2"


    // $ANTLR start "rule__Requirement__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2585:1: rule__Requirement__Group__2__Impl : ( '{' ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2589:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2590:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2590:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2591:1: '{'
            {
             before(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Requirement__Group__2__Impl5167); 
             after(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2__Impl"


    // $ANTLR start "rule__Requirement__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2604:1: rule__Requirement__Group__3 : rule__Requirement__Group__3__Impl rule__Requirement__Group__4 ;
    public final void rule__Requirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2608:1: ( rule__Requirement__Group__3__Impl rule__Requirement__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2609:2: rule__Requirement__Group__3__Impl rule__Requirement__Group__4
            {
            pushFollow(FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__35198);
            rule__Requirement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__4_in_rule__Requirement__Group__35201);
            rule__Requirement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__3"


    // $ANTLR start "rule__Requirement__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2616:1: rule__Requirement__Group__3__Impl : ( ( rule__Requirement__Group_3__0 ) ) ;
    public final void rule__Requirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2620:1: ( ( ( rule__Requirement__Group_3__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2621:1: ( ( rule__Requirement__Group_3__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2621:1: ( ( rule__Requirement__Group_3__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2622:1: ( rule__Requirement__Group_3__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2623:1: ( rule__Requirement__Group_3__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2623:2: rule__Requirement__Group_3__0
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl5228);
            rule__Requirement__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__3__Impl"


    // $ANTLR start "rule__Requirement__Group__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2633:1: rule__Requirement__Group__4 : rule__Requirement__Group__4__Impl rule__Requirement__Group__5 ;
    public final void rule__Requirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2637:1: ( rule__Requirement__Group__4__Impl rule__Requirement__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2638:2: rule__Requirement__Group__4__Impl rule__Requirement__Group__5
            {
            pushFollow(FOLLOW_rule__Requirement__Group__4__Impl_in_rule__Requirement__Group__45258);
            rule__Requirement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__5_in_rule__Requirement__Group__45261);
            rule__Requirement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__4"


    // $ANTLR start "rule__Requirement__Group__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2645:1: rule__Requirement__Group__4__Impl : ( ( rule__Requirement__Group_4__0 )? ) ;
    public final void rule__Requirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2649:1: ( ( ( rule__Requirement__Group_4__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2650:1: ( ( rule__Requirement__Group_4__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2650:1: ( ( rule__Requirement__Group_4__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2651:1: ( rule__Requirement__Group_4__0 )?
            {
             before(grammarAccess.getRequirementAccess().getGroup_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2652:1: ( rule__Requirement__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2652:2: rule__Requirement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Requirement__Group_4__0_in_rule__Requirement__Group__4__Impl5288);
                    rule__Requirement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequirementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__4__Impl"


    // $ANTLR start "rule__Requirement__Group__5"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2662:1: rule__Requirement__Group__5 : rule__Requirement__Group__5__Impl ;
    public final void rule__Requirement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2666:1: ( rule__Requirement__Group__5__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2667:2: rule__Requirement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group__5__Impl_in_rule__Requirement__Group__55319);
            rule__Requirement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__5"


    // $ANTLR start "rule__Requirement__Group__5__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2673:1: rule__Requirement__Group__5__Impl : ( '}' ) ;
    public final void rule__Requirement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2677:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2678:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2678:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2679:1: '}'
            {
             before(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Requirement__Group__5__Impl5347); 
             after(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__5__Impl"


    // $ANTLR start "rule__Requirement__Group_3__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2704:1: rule__Requirement__Group_3__0 : rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 ;
    public final void rule__Requirement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2708:1: ( rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2709:2: rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__05390);
            rule__Requirement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__05393);
            rule__Requirement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_3__0"


    // $ANTLR start "rule__Requirement__Group_3__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2716:1: rule__Requirement__Group_3__0__Impl : ( 'workItems' ) ;
    public final void rule__Requirement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2720:1: ( ( 'workItems' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2721:1: ( 'workItems' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2721:1: ( 'workItems' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2722:1: 'workItems'
            {
             before(grammarAccess.getRequirementAccess().getWorkItemsKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Requirement__Group_3__0__Impl5421); 
             after(grammarAccess.getRequirementAccess().getWorkItemsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_3__0__Impl"


    // $ANTLR start "rule__Requirement__Group_3__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2735:1: rule__Requirement__Group_3__1 : rule__Requirement__Group_3__1__Impl rule__Requirement__Group_3__2 ;
    public final void rule__Requirement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2739:1: ( rule__Requirement__Group_3__1__Impl rule__Requirement__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2740:2: rule__Requirement__Group_3__1__Impl rule__Requirement__Group_3__2
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__15452);
            rule__Requirement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__2_in_rule__Requirement__Group_3__15455);
            rule__Requirement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_3__1"


    // $ANTLR start "rule__Requirement__Group_3__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2747:1: rule__Requirement__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Requirement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2751:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2752:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2752:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2753:1: '{'
            {
             before(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,23,FOLLOW_23_in_rule__Requirement__Group_3__1__Impl5483); 
             after(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_3__1__Impl"


    // $ANTLR start "rule__Requirement__Group_3__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2766:1: rule__Requirement__Group_3__2 : rule__Requirement__Group_3__2__Impl rule__Requirement__Group_3__3 ;
    public final void rule__Requirement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2770:1: ( rule__Requirement__Group_3__2__Impl rule__Requirement__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2771:2: rule__Requirement__Group_3__2__Impl rule__Requirement__Group_3__3
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__2__Impl_in_rule__Requirement__Group_3__25514);
            rule__Requirement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__3_in_rule__Requirement__Group_3__25517);
            rule__Requirement__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_3__2"


    // $ANTLR start "rule__Requirement__Group_3__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2778:1: rule__Requirement__Group_3__2__Impl : ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) ) ;
    public final void rule__Requirement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2782:1: ( ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2783:1: ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2783:1: ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2784:1: ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2784:1: ( ( rule__Requirement__RTasksAssignment_3_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2785:1: ( rule__Requirement__RTasksAssignment_3_2 )
            {
             before(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2786:1: ( rule__Requirement__RTasksAssignment_3_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2786:2: rule__Requirement__RTasksAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl5546);
            rule__Requirement__RTasksAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2789:1: ( ( rule__Requirement__RTasksAssignment_3_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2790:1: ( rule__Requirement__RTasksAssignment_3_2 )*
            {
             before(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2791:1: ( rule__Requirement__RTasksAssignment_3_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2791:2: rule__Requirement__RTasksAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl5558);
            	    rule__Requirement__RTasksAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_3__2__Impl"


    // $ANTLR start "rule__Requirement__Group_3__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2802:1: rule__Requirement__Group_3__3 : rule__Requirement__Group_3__3__Impl ;
    public final void rule__Requirement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2806:1: ( rule__Requirement__Group_3__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2807:2: rule__Requirement__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__3__Impl_in_rule__Requirement__Group_3__35591);
            rule__Requirement__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_3__3"


    // $ANTLR start "rule__Requirement__Group_3__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2813:1: rule__Requirement__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Requirement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2817:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2818:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2818:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2819:1: '}'
            {
             before(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,24,FOLLOW_24_in_rule__Requirement__Group_3__3__Impl5619); 
             after(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_3__3__Impl"


    // $ANTLR start "rule__Requirement__Group_4__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2840:1: rule__Requirement__Group_4__0 : rule__Requirement__Group_4__0__Impl rule__Requirement__Group_4__1 ;
    public final void rule__Requirement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2844:1: ( rule__Requirement__Group_4__0__Impl rule__Requirement__Group_4__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2845:2: rule__Requirement__Group_4__0__Impl rule__Requirement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group_4__0__Impl_in_rule__Requirement__Group_4__05658);
            rule__Requirement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_4__1_in_rule__Requirement__Group_4__05661);
            rule__Requirement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_4__0"


    // $ANTLR start "rule__Requirement__Group_4__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2852:1: rule__Requirement__Group_4__0__Impl : ( 'workItemNetwork' ) ;
    public final void rule__Requirement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2856:1: ( ( 'workItemNetwork' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2857:1: ( 'workItemNetwork' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2857:1: ( 'workItemNetwork' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2858:1: 'workItemNetwork'
            {
             before(grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__Requirement__Group_4__0__Impl5689); 
             after(grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_4__0__Impl"


    // $ANTLR start "rule__Requirement__Group_4__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2871:1: rule__Requirement__Group_4__1 : rule__Requirement__Group_4__1__Impl ;
    public final void rule__Requirement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2875:1: ( rule__Requirement__Group_4__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2876:2: rule__Requirement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group_4__1__Impl_in_rule__Requirement__Group_4__15720);
            rule__Requirement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_4__1"


    // $ANTLR start "rule__Requirement__Group_4__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2882:1: rule__Requirement__Group_4__1__Impl : ( ( rule__Requirement__DependenciesAssignment_4_1 )* ) ;
    public final void rule__Requirement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2886:1: ( ( ( rule__Requirement__DependenciesAssignment_4_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2887:1: ( ( rule__Requirement__DependenciesAssignment_4_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2887:1: ( ( rule__Requirement__DependenciesAssignment_4_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2888:1: ( rule__Requirement__DependenciesAssignment_4_1 )*
            {
             before(grammarAccess.getRequirementAccess().getDependenciesAssignment_4_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2889:1: ( rule__Requirement__DependenciesAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2889:2: rule__Requirement__DependenciesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Requirement__DependenciesAssignment_4_1_in_rule__Requirement__Group_4__1__Impl5747);
            	    rule__Requirement__DependenciesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRequirementAccess().getDependenciesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_4__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2903:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2907:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2908:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__05782);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05785);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2915:1: rule__Task__Group__0__Impl : ( 'workItem' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2919:1: ( ( 'workItem' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2920:1: ( 'workItem' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2920:1: ( 'workItem' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2921:1: 'workItem'
            {
             before(grammarAccess.getTaskAccess().getWorkItemKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Task__Group__0__Impl5813); 
             after(grammarAccess.getTaskAccess().getWorkItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2934:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2938:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2939:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__15844);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__2_in_rule__Task__Group__15847);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2946:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2950:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2951:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2951:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2952:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2953:1: ( rule__Task__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2953:2: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl5874);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2963:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2967:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2968:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_rule__Task__Group__2__Impl_in_rule__Task__Group__25904);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__3_in_rule__Task__Group__25907);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2975:1: rule__Task__Group__2__Impl : ( '{' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2979:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2980:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2980:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2981:1: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Task__Group__2__Impl5935); 
             after(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2994:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2998:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2999:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_rule__Task__Group__3__Impl_in_rule__Task__Group__35966);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__4_in_rule__Task__Group__35969);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3006:1: rule__Task__Group__3__Impl : ( ( rule__Task__Group_3__0 )? ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3010:1: ( ( ( rule__Task__Group_3__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3011:1: ( ( rule__Task__Group_3__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3011:1: ( ( rule__Task__Group_3__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3012:1: ( rule__Task__Group_3__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3013:1: ( rule__Task__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3013:2: rule__Task__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_3__0_in_rule__Task__Group__3__Impl5996);
                    rule__Task__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3023:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3027:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3028:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_rule__Task__Group__4__Impl_in_rule__Task__Group__46027);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__5_in_rule__Task__Group__46030);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3035:1: rule__Task__Group__4__Impl : ( ( rule__Task__Group_4__0 )? ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3039:1: ( ( ( rule__Task__Group_4__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3040:1: ( ( rule__Task__Group_4__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3040:1: ( ( rule__Task__Group_4__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3041:1: ( rule__Task__Group_4__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3042:1: ( rule__Task__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3042:2: rule__Task__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_4__0_in_rule__Task__Group__4__Impl6057);
                    rule__Task__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3052:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3056:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3057:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_rule__Task__Group__5__Impl_in_rule__Task__Group__56088);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__6_in_rule__Task__Group__56091);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3064:1: rule__Task__Group__5__Impl : ( ( rule__Task__Group_5__0 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3068:1: ( ( ( rule__Task__Group_5__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3069:1: ( ( rule__Task__Group_5__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3069:1: ( ( rule__Task__Group_5__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3070:1: ( rule__Task__Group_5__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_5()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3071:1: ( rule__Task__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3071:2: rule__Task__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_5__0_in_rule__Task__Group__5__Impl6118);
                    rule__Task__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3081:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3085:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3086:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_rule__Task__Group__6__Impl_in_rule__Task__Group__66149);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__7_in_rule__Task__Group__66152);
            rule__Task__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3093:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3097:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3098:1: ( ( rule__Task__Group_6__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3098:1: ( ( rule__Task__Group_6__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3099:1: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3100:1: ( rule__Task__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3100:2: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_6__0_in_rule__Task__Group__6__Impl6179);
                    rule__Task__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3110:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3114:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3115:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_rule__Task__Group__7__Impl_in_rule__Task__Group__76210);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__8_in_rule__Task__Group__76213);
            rule__Task__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3122:1: rule__Task__Group__7__Impl : ( ( rule__Task__Group_7__0 )? ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3126:1: ( ( ( rule__Task__Group_7__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3127:1: ( ( rule__Task__Group_7__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3127:1: ( ( rule__Task__Group_7__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3128:1: ( rule__Task__Group_7__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_7()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3129:1: ( rule__Task__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3129:2: rule__Task__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_7__0_in_rule__Task__Group__7__Impl6240);
                    rule__Task__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__8"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3139:1: rule__Task__Group__8 : rule__Task__Group__8__Impl ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3143:1: ( rule__Task__Group__8__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3144:2: rule__Task__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group__8__Impl_in_rule__Task__Group__86271);
            rule__Task__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8"


    // $ANTLR start "rule__Task__Group__8__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3150:1: rule__Task__Group__8__Impl : ( '}' ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3154:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3155:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3155:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3156:1: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__Task__Group__8__Impl6299); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8__Impl"


    // $ANTLR start "rule__Task__Group_3__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3187:1: rule__Task__Group_3__0 : rule__Task__Group_3__0__Impl rule__Task__Group_3__1 ;
    public final void rule__Task__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3191:1: ( rule__Task__Group_3__0__Impl rule__Task__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3192:2: rule__Task__Group_3__0__Impl rule__Task__Group_3__1
            {
            pushFollow(FOLLOW_rule__Task__Group_3__0__Impl_in_rule__Task__Group_3__06348);
            rule__Task__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_3__1_in_rule__Task__Group_3__06351);
            rule__Task__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__0"


    // $ANTLR start "rule__Task__Group_3__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3199:1: rule__Task__Group_3__0__Impl : ( 'subtasks' ) ;
    public final void rule__Task__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3203:1: ( ( 'subtasks' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3204:1: ( 'subtasks' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3204:1: ( 'subtasks' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3205:1: 'subtasks'
            {
             before(grammarAccess.getTaskAccess().getSubtasksKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__Task__Group_3__0__Impl6379); 
             after(grammarAccess.getTaskAccess().getSubtasksKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__0__Impl"


    // $ANTLR start "rule__Task__Group_3__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3218:1: rule__Task__Group_3__1 : rule__Task__Group_3__1__Impl rule__Task__Group_3__2 ;
    public final void rule__Task__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3222:1: ( rule__Task__Group_3__1__Impl rule__Task__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3223:2: rule__Task__Group_3__1__Impl rule__Task__Group_3__2
            {
            pushFollow(FOLLOW_rule__Task__Group_3__1__Impl_in_rule__Task__Group_3__16410);
            rule__Task__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_3__2_in_rule__Task__Group_3__16413);
            rule__Task__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__1"


    // $ANTLR start "rule__Task__Group_3__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3230:1: rule__Task__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Task__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3234:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3235:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3235:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3236:1: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,23,FOLLOW_23_in_rule__Task__Group_3__1__Impl6441); 
             after(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__1__Impl"


    // $ANTLR start "rule__Task__Group_3__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3249:1: rule__Task__Group_3__2 : rule__Task__Group_3__2__Impl rule__Task__Group_3__3 ;
    public final void rule__Task__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3253:1: ( rule__Task__Group_3__2__Impl rule__Task__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3254:2: rule__Task__Group_3__2__Impl rule__Task__Group_3__3
            {
            pushFollow(FOLLOW_rule__Task__Group_3__2__Impl_in_rule__Task__Group_3__26472);
            rule__Task__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_3__3_in_rule__Task__Group_3__26475);
            rule__Task__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__2"


    // $ANTLR start "rule__Task__Group_3__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3261:1: rule__Task__Group_3__2__Impl : ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) ) ;
    public final void rule__Task__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3265:1: ( ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3266:1: ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3266:1: ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3267:1: ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3267:1: ( ( rule__Task__STasksAssignment_3_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3268:1: ( rule__Task__STasksAssignment_3_2 )
            {
             before(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3269:1: ( rule__Task__STasksAssignment_3_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3269:2: rule__Task__STasksAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl6504);
            rule__Task__STasksAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3272:1: ( ( rule__Task__STasksAssignment_3_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3273:1: ( rule__Task__STasksAssignment_3_2 )*
            {
             before(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3274:1: ( rule__Task__STasksAssignment_3_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3274:2: rule__Task__STasksAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl6516);
            	    rule__Task__STasksAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__2__Impl"


    // $ANTLR start "rule__Task__Group_3__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3285:1: rule__Task__Group_3__3 : rule__Task__Group_3__3__Impl ;
    public final void rule__Task__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3289:1: ( rule__Task__Group_3__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3290:2: rule__Task__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_3__3__Impl_in_rule__Task__Group_3__36549);
            rule__Task__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__3"


    // $ANTLR start "rule__Task__Group_3__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3296:1: rule__Task__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Task__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3300:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3301:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3301:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3302:1: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,24,FOLLOW_24_in_rule__Task__Group_3__3__Impl6577); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__3__Impl"


    // $ANTLR start "rule__Task__Group_4__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3323:1: rule__Task__Group_4__0 : rule__Task__Group_4__0__Impl rule__Task__Group_4__1 ;
    public final void rule__Task__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3327:1: ( rule__Task__Group_4__0__Impl rule__Task__Group_4__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3328:2: rule__Task__Group_4__0__Impl rule__Task__Group_4__1
            {
            pushFollow(FOLLOW_rule__Task__Group_4__0__Impl_in_rule__Task__Group_4__06616);
            rule__Task__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_4__1_in_rule__Task__Group_4__06619);
            rule__Task__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__0"


    // $ANTLR start "rule__Task__Group_4__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3335:1: rule__Task__Group_4__0__Impl : ( 'taskDependencies' ) ;
    public final void rule__Task__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3339:1: ( ( 'taskDependencies' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3340:1: ( 'taskDependencies' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3340:1: ( 'taskDependencies' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3341:1: 'taskDependencies'
            {
             before(grammarAccess.getTaskAccess().getTaskDependenciesKeyword_4_0()); 
            match(input,38,FOLLOW_38_in_rule__Task__Group_4__0__Impl6647); 
             after(grammarAccess.getTaskAccess().getTaskDependenciesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__0__Impl"


    // $ANTLR start "rule__Task__Group_4__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3354:1: rule__Task__Group_4__1 : rule__Task__Group_4__1__Impl ;
    public final void rule__Task__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3358:1: ( rule__Task__Group_4__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3359:2: rule__Task__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_4__1__Impl_in_rule__Task__Group_4__16678);
            rule__Task__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__1"


    // $ANTLR start "rule__Task__Group_4__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3365:1: rule__Task__Group_4__1__Impl : ( ( rule__Task__TaskDependenciesAssignment_4_1 )* ) ;
    public final void rule__Task__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3369:1: ( ( ( rule__Task__TaskDependenciesAssignment_4_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3370:1: ( ( rule__Task__TaskDependenciesAssignment_4_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3370:1: ( ( rule__Task__TaskDependenciesAssignment_4_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3371:1: ( rule__Task__TaskDependenciesAssignment_4_1 )*
            {
             before(grammarAccess.getTaskAccess().getTaskDependenciesAssignment_4_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3372:1: ( rule__Task__TaskDependenciesAssignment_4_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3372:2: rule__Task__TaskDependenciesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__TaskDependenciesAssignment_4_1_in_rule__Task__Group_4__1__Impl6705);
            	    rule__Task__TaskDependenciesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getTaskDependenciesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__1__Impl"


    // $ANTLR start "rule__Task__Group_5__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3386:1: rule__Task__Group_5__0 : rule__Task__Group_5__0__Impl rule__Task__Group_5__1 ;
    public final void rule__Task__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3390:1: ( rule__Task__Group_5__0__Impl rule__Task__Group_5__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3391:2: rule__Task__Group_5__0__Impl rule__Task__Group_5__1
            {
            pushFollow(FOLLOW_rule__Task__Group_5__0__Impl_in_rule__Task__Group_5__06740);
            rule__Task__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_5__1_in_rule__Task__Group_5__06743);
            rule__Task__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__0"


    // $ANTLR start "rule__Task__Group_5__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3398:1: rule__Task__Group_5__0__Impl : ( 'servicesRequired' ) ;
    public final void rule__Task__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3402:1: ( ( 'servicesRequired' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3403:1: ( 'servicesRequired' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3403:1: ( 'servicesRequired' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3404:1: 'servicesRequired'
            {
             before(grammarAccess.getTaskAccess().getServicesRequiredKeyword_5_0()); 
            match(input,39,FOLLOW_39_in_rule__Task__Group_5__0__Impl6771); 
             after(grammarAccess.getTaskAccess().getServicesRequiredKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__0__Impl"


    // $ANTLR start "rule__Task__Group_5__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3417:1: rule__Task__Group_5__1 : rule__Task__Group_5__1__Impl ;
    public final void rule__Task__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3421:1: ( rule__Task__Group_5__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3422:2: rule__Task__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_5__1__Impl_in_rule__Task__Group_5__16802);
            rule__Task__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__1"


    // $ANTLR start "rule__Task__Group_5__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3428:1: rule__Task__Group_5__1__Impl : ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) ) ;
    public final void rule__Task__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3432:1: ( ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3433:1: ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3433:1: ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3434:1: ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3434:1: ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3435:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3436:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3436:2: rule__Task__ReqSpecialtiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6831);
            rule__Task__ReqSpecialtiesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3439:1: ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3440:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )*
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3441:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3441:2: rule__Task__ReqSpecialtiesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6843);
            	    rule__Task__ReqSpecialtiesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__1__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3456:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3460:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3461:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_rule__Task__Group_6__0__Impl_in_rule__Task__Group_6__06880);
            rule__Task__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_6__1_in_rule__Task__Group_6__06883);
            rule__Task__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0"


    // $ANTLR start "rule__Task__Group_6__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3468:1: rule__Task__Group_6__0__Impl : ( 'base value' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3472:1: ( ( 'base value' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3473:1: ( 'base value' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3473:1: ( 'base value' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3474:1: 'base value'
            {
             before(grammarAccess.getTaskAccess().getBaseValueKeyword_6_0()); 
            match(input,40,FOLLOW_40_in_rule__Task__Group_6__0__Impl6911); 
             after(grammarAccess.getTaskAccess().getBaseValueKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0__Impl"


    // $ANTLR start "rule__Task__Group_6__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3487:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3491:1: ( rule__Task__Group_6__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3492:2: rule__Task__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_6__1__Impl_in_rule__Task__Group_6__16942);
            rule__Task__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1"


    // $ANTLR start "rule__Task__Group_6__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3498:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__BvalueAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3502:1: ( ( ( rule__Task__BvalueAssignment_6_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3503:1: ( ( rule__Task__BvalueAssignment_6_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3503:1: ( ( rule__Task__BvalueAssignment_6_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3504:1: ( rule__Task__BvalueAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getBvalueAssignment_6_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3505:1: ( rule__Task__BvalueAssignment_6_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3505:2: rule__Task__BvalueAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Task__BvalueAssignment_6_1_in_rule__Task__Group_6__1__Impl6969);
            rule__Task__BvalueAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getBvalueAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1__Impl"


    // $ANTLR start "rule__Task__Group_7__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3519:1: rule__Task__Group_7__0 : rule__Task__Group_7__0__Impl rule__Task__Group_7__1 ;
    public final void rule__Task__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3523:1: ( rule__Task__Group_7__0__Impl rule__Task__Group_7__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3524:2: rule__Task__Group_7__0__Impl rule__Task__Group_7__1
            {
            pushFollow(FOLLOW_rule__Task__Group_7__0__Impl_in_rule__Task__Group_7__07003);
            rule__Task__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_7__1_in_rule__Task__Group_7__07006);
            rule__Task__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__0"


    // $ANTLR start "rule__Task__Group_7__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3531:1: rule__Task__Group_7__0__Impl : ( 'classOfService' ) ;
    public final void rule__Task__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3535:1: ( ( 'classOfService' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3536:1: ( 'classOfService' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3536:1: ( 'classOfService' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3537:1: 'classOfService'
            {
             before(grammarAccess.getTaskAccess().getClassOfServiceKeyword_7_0()); 
            match(input,41,FOLLOW_41_in_rule__Task__Group_7__0__Impl7034); 
             after(grammarAccess.getTaskAccess().getClassOfServiceKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__0__Impl"


    // $ANTLR start "rule__Task__Group_7__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3550:1: rule__Task__Group_7__1 : rule__Task__Group_7__1__Impl ;
    public final void rule__Task__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3554:1: ( rule__Task__Group_7__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3555:2: rule__Task__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_7__1__Impl_in_rule__Task__Group_7__17065);
            rule__Task__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__1"


    // $ANTLR start "rule__Task__Group_7__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3561:1: rule__Task__Group_7__1__Impl : ( ( rule__Task__COSAssignment_7_1 ) ) ;
    public final void rule__Task__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3565:1: ( ( ( rule__Task__COSAssignment_7_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3566:1: ( ( rule__Task__COSAssignment_7_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3566:1: ( ( rule__Task__COSAssignment_7_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3567:1: ( rule__Task__COSAssignment_7_1 )
            {
             before(grammarAccess.getTaskAccess().getCOSAssignment_7_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3568:1: ( rule__Task__COSAssignment_7_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3568:2: rule__Task__COSAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Task__COSAssignment_7_1_in_rule__Task__Group_7__1__Impl7092);
            rule__Task__COSAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCOSAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_7__1__Impl"


    // $ANTLR start "rule__KanbanTaskModel__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3582:1: rule__KanbanTaskModel__Group__0 : rule__KanbanTaskModel__Group__0__Impl rule__KanbanTaskModel__Group__1 ;
    public final void rule__KanbanTaskModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3586:1: ( rule__KanbanTaskModel__Group__0__Impl rule__KanbanTaskModel__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3587:2: rule__KanbanTaskModel__Group__0__Impl rule__KanbanTaskModel__Group__1
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__0__Impl_in_rule__KanbanTaskModel__Group__07126);
            rule__KanbanTaskModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__1_in_rule__KanbanTaskModel__Group__07129);
            rule__KanbanTaskModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__Group__0"


    // $ANTLR start "rule__KanbanTaskModel__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3594:1: rule__KanbanTaskModel__Group__0__Impl : ( 'WorkFlow' ) ;
    public final void rule__KanbanTaskModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3598:1: ( ( 'WorkFlow' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3599:1: ( 'WorkFlow' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3599:1: ( 'WorkFlow' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3600:1: 'WorkFlow'
            {
             before(grammarAccess.getKanbanTaskModelAccess().getWorkFlowKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__KanbanTaskModel__Group__0__Impl7157); 
             after(grammarAccess.getKanbanTaskModelAccess().getWorkFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__Group__0__Impl"


    // $ANTLR start "rule__KanbanTaskModel__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3613:1: rule__KanbanTaskModel__Group__1 : rule__KanbanTaskModel__Group__1__Impl rule__KanbanTaskModel__Group__2 ;
    public final void rule__KanbanTaskModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3617:1: ( rule__KanbanTaskModel__Group__1__Impl rule__KanbanTaskModel__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3618:2: rule__KanbanTaskModel__Group__1__Impl rule__KanbanTaskModel__Group__2
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__1__Impl_in_rule__KanbanTaskModel__Group__17188);
            rule__KanbanTaskModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__2_in_rule__KanbanTaskModel__Group__17191);
            rule__KanbanTaskModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__Group__1"


    // $ANTLR start "rule__KanbanTaskModel__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3625:1: rule__KanbanTaskModel__Group__1__Impl : ( ( rule__KanbanTaskModel__NameAssignment_1 ) ) ;
    public final void rule__KanbanTaskModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3629:1: ( ( ( rule__KanbanTaskModel__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3630:1: ( ( rule__KanbanTaskModel__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3630:1: ( ( rule__KanbanTaskModel__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3631:1: ( rule__KanbanTaskModel__NameAssignment_1 )
            {
             before(grammarAccess.getKanbanTaskModelAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3632:1: ( rule__KanbanTaskModel__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3632:2: rule__KanbanTaskModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__NameAssignment_1_in_rule__KanbanTaskModel__Group__1__Impl7218);
            rule__KanbanTaskModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKanbanTaskModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__Group__1__Impl"


    // $ANTLR start "rule__KanbanTaskModel__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3642:1: rule__KanbanTaskModel__Group__2 : rule__KanbanTaskModel__Group__2__Impl rule__KanbanTaskModel__Group__3 ;
    public final void rule__KanbanTaskModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3646:1: ( rule__KanbanTaskModel__Group__2__Impl rule__KanbanTaskModel__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3647:2: rule__KanbanTaskModel__Group__2__Impl rule__KanbanTaskModel__Group__3
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__2__Impl_in_rule__KanbanTaskModel__Group__27248);
            rule__KanbanTaskModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__3_in_rule__KanbanTaskModel__Group__27251);
            rule__KanbanTaskModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__Group__2"


    // $ANTLR start "rule__KanbanTaskModel__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3654:1: rule__KanbanTaskModel__Group__2__Impl : ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) ) ;
    public final void rule__KanbanTaskModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3658:1: ( ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3659:1: ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3659:1: ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3660:1: ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3660:1: ( ( rule__KanbanTaskModel__CapsAssignment_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3661:1: ( rule__KanbanTaskModel__CapsAssignment_2 )
            {
             before(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3662:1: ( rule__KanbanTaskModel__CapsAssignment_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3662:2: rule__KanbanTaskModel__CapsAssignment_2
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl7280);
            rule__KanbanTaskModel__CapsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3665:1: ( ( rule__KanbanTaskModel__CapsAssignment_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3666:1: ( rule__KanbanTaskModel__CapsAssignment_2 )*
            {
             before(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3667:1: ( rule__KanbanTaskModel__CapsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==44) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3667:2: rule__KanbanTaskModel__CapsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl7292);
            	    rule__KanbanTaskModel__CapsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__Group__2__Impl"


    // $ANTLR start "rule__KanbanTaskModel__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3678:1: rule__KanbanTaskModel__Group__3 : rule__KanbanTaskModel__Group__3__Impl ;
    public final void rule__KanbanTaskModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3682:1: ( rule__KanbanTaskModel__Group__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3683:2: rule__KanbanTaskModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__3__Impl_in_rule__KanbanTaskModel__Group__37325);
            rule__KanbanTaskModel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__Group__3"


    // $ANTLR start "rule__KanbanTaskModel__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3689:1: rule__KanbanTaskModel__Group__3__Impl : ( 'end WorkFlow' ) ;
    public final void rule__KanbanTaskModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3693:1: ( ( 'end WorkFlow' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3694:1: ( 'end WorkFlow' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3694:1: ( 'end WorkFlow' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3695:1: 'end WorkFlow'
            {
             before(grammarAccess.getKanbanTaskModelAccess().getEndWorkFlowKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__KanbanTaskModel__Group__3__Impl7353); 
             after(grammarAccess.getKanbanTaskModelAccess().getEndWorkFlowKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__Group__3__Impl"


    // $ANTLR start "rule__Capability__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3716:1: rule__Capability__Group__0 : rule__Capability__Group__0__Impl rule__Capability__Group__1 ;
    public final void rule__Capability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3720:1: ( rule__Capability__Group__0__Impl rule__Capability__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3721:2: rule__Capability__Group__0__Impl rule__Capability__Group__1
            {
            pushFollow(FOLLOW_rule__Capability__Group__0__Impl_in_rule__Capability__Group__07392);
            rule__Capability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__1_in_rule__Capability__Group__07395);
            rule__Capability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__0"


    // $ANTLR start "rule__Capability__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3728:1: rule__Capability__Group__0__Impl : ( 'capability' ) ;
    public final void rule__Capability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3732:1: ( ( 'capability' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3733:1: ( 'capability' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3733:1: ( 'capability' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3734:1: 'capability'
            {
             before(grammarAccess.getCapabilityAccess().getCapabilityKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Capability__Group__0__Impl7423); 
             after(grammarAccess.getCapabilityAccess().getCapabilityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__0__Impl"


    // $ANTLR start "rule__Capability__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3747:1: rule__Capability__Group__1 : rule__Capability__Group__1__Impl rule__Capability__Group__2 ;
    public final void rule__Capability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3751:1: ( rule__Capability__Group__1__Impl rule__Capability__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3752:2: rule__Capability__Group__1__Impl rule__Capability__Group__2
            {
            pushFollow(FOLLOW_rule__Capability__Group__1__Impl_in_rule__Capability__Group__17454);
            rule__Capability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__2_in_rule__Capability__Group__17457);
            rule__Capability__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__1"


    // $ANTLR start "rule__Capability__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3759:1: rule__Capability__Group__1__Impl : ( ( rule__Capability__NameAssignment_1 ) ) ;
    public final void rule__Capability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3763:1: ( ( ( rule__Capability__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3764:1: ( ( rule__Capability__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3764:1: ( ( rule__Capability__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3765:1: ( rule__Capability__NameAssignment_1 )
            {
             before(grammarAccess.getCapabilityAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3766:1: ( rule__Capability__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3766:2: rule__Capability__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Capability__NameAssignment_1_in_rule__Capability__Group__1__Impl7484);
            rule__Capability__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__1__Impl"


    // $ANTLR start "rule__Capability__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3776:1: rule__Capability__Group__2 : rule__Capability__Group__2__Impl rule__Capability__Group__3 ;
    public final void rule__Capability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3780:1: ( rule__Capability__Group__2__Impl rule__Capability__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3781:2: rule__Capability__Group__2__Impl rule__Capability__Group__3
            {
            pushFollow(FOLLOW_rule__Capability__Group__2__Impl_in_rule__Capability__Group__27514);
            rule__Capability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__3_in_rule__Capability__Group__27517);
            rule__Capability__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__2"


    // $ANTLR start "rule__Capability__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3788:1: rule__Capability__Group__2__Impl : ( '{' ) ;
    public final void rule__Capability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3792:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3793:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3793:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3794:1: '{'
            {
             before(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Capability__Group__2__Impl7545); 
             after(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__2__Impl"


    // $ANTLR start "rule__Capability__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3807:1: rule__Capability__Group__3 : rule__Capability__Group__3__Impl rule__Capability__Group__4 ;
    public final void rule__Capability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3811:1: ( rule__Capability__Group__3__Impl rule__Capability__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3812:2: rule__Capability__Group__3__Impl rule__Capability__Group__4
            {
            pushFollow(FOLLOW_rule__Capability__Group__3__Impl_in_rule__Capability__Group__37576);
            rule__Capability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__4_in_rule__Capability__Group__37579);
            rule__Capability__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__3"


    // $ANTLR start "rule__Capability__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3819:1: rule__Capability__Group__3__Impl : ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) ) ;
    public final void rule__Capability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3823:1: ( ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3824:1: ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3824:1: ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3825:1: ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3825:1: ( ( rule__Capability__ReqsAssignment_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3826:1: ( rule__Capability__ReqsAssignment_3 )
            {
             before(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3827:1: ( rule__Capability__ReqsAssignment_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3827:2: rule__Capability__ReqsAssignment_3
            {
            pushFollow(FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl7608);
            rule__Capability__ReqsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3830:1: ( ( rule__Capability__ReqsAssignment_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3831:1: ( rule__Capability__ReqsAssignment_3 )*
            {
             before(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3832:1: ( rule__Capability__ReqsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3832:2: rule__Capability__ReqsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl7620);
            	    rule__Capability__ReqsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__3__Impl"


    // $ANTLR start "rule__Capability__Group__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3843:1: rule__Capability__Group__4 : rule__Capability__Group__4__Impl ;
    public final void rule__Capability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3847:1: ( rule__Capability__Group__4__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3848:2: rule__Capability__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Capability__Group__4__Impl_in_rule__Capability__Group__47653);
            rule__Capability__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__4"


    // $ANTLR start "rule__Capability__Group__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3854:1: rule__Capability__Group__4__Impl : ( '}' ) ;
    public final void rule__Capability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3858:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3859:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3859:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3860:1: '}'
            {
             before(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Capability__Group__4__Impl7681); 
             after(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__4__Impl"


    // $ANTLR start "rule__Strategy__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3883:1: rule__Strategy__Group__0 : rule__Strategy__Group__0__Impl rule__Strategy__Group__1 ;
    public final void rule__Strategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3887:1: ( rule__Strategy__Group__0__Impl rule__Strategy__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3888:2: rule__Strategy__Group__0__Impl rule__Strategy__Group__1
            {
            pushFollow(FOLLOW_rule__Strategy__Group__0__Impl_in_rule__Strategy__Group__07722);
            rule__Strategy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Strategy__Group__1_in_rule__Strategy__Group__07725);
            rule__Strategy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__0"


    // $ANTLR start "rule__Strategy__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3895:1: rule__Strategy__Group__0__Impl : ( 'strategy' ) ;
    public final void rule__Strategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3899:1: ( ( 'strategy' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3900:1: ( 'strategy' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3900:1: ( 'strategy' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3901:1: 'strategy'
            {
             before(grammarAccess.getStrategyAccess().getStrategyKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__Strategy__Group__0__Impl7753); 
             after(grammarAccess.getStrategyAccess().getStrategyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__0__Impl"


    // $ANTLR start "rule__Strategy__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3914:1: rule__Strategy__Group__1 : rule__Strategy__Group__1__Impl rule__Strategy__Group__2 ;
    public final void rule__Strategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3918:1: ( rule__Strategy__Group__1__Impl rule__Strategy__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3919:2: rule__Strategy__Group__1__Impl rule__Strategy__Group__2
            {
            pushFollow(FOLLOW_rule__Strategy__Group__1__Impl_in_rule__Strategy__Group__17784);
            rule__Strategy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Strategy__Group__2_in_rule__Strategy__Group__17787);
            rule__Strategy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__1"


    // $ANTLR start "rule__Strategy__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3926:1: rule__Strategy__Group__1__Impl : ( ( rule__Strategy__NameAssignment_1 ) ) ;
    public final void rule__Strategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3930:1: ( ( ( rule__Strategy__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3931:1: ( ( rule__Strategy__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3931:1: ( ( rule__Strategy__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3932:1: ( rule__Strategy__NameAssignment_1 )
            {
             before(grammarAccess.getStrategyAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3933:1: ( rule__Strategy__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3933:2: rule__Strategy__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Strategy__NameAssignment_1_in_rule__Strategy__Group__1__Impl7814);
            rule__Strategy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStrategyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__1__Impl"


    // $ANTLR start "rule__Strategy__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3943:1: rule__Strategy__Group__2 : rule__Strategy__Group__2__Impl rule__Strategy__Group__3 ;
    public final void rule__Strategy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3947:1: ( rule__Strategy__Group__2__Impl rule__Strategy__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3948:2: rule__Strategy__Group__2__Impl rule__Strategy__Group__3
            {
            pushFollow(FOLLOW_rule__Strategy__Group__2__Impl_in_rule__Strategy__Group__27844);
            rule__Strategy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Strategy__Group__3_in_rule__Strategy__Group__27847);
            rule__Strategy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__2"


    // $ANTLR start "rule__Strategy__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3955:1: rule__Strategy__Group__2__Impl : ( '{' ) ;
    public final void rule__Strategy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3959:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3960:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3960:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3961:1: '{'
            {
             before(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Strategy__Group__2__Impl7875); 
             after(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__2__Impl"


    // $ANTLR start "rule__Strategy__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3974:1: rule__Strategy__Group__3 : rule__Strategy__Group__3__Impl rule__Strategy__Group__4 ;
    public final void rule__Strategy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3978:1: ( rule__Strategy__Group__3__Impl rule__Strategy__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3979:2: rule__Strategy__Group__3__Impl rule__Strategy__Group__4
            {
            pushFollow(FOLLOW_rule__Strategy__Group__3__Impl_in_rule__Strategy__Group__37906);
            rule__Strategy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Strategy__Group__4_in_rule__Strategy__Group__37909);
            rule__Strategy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__3"


    // $ANTLR start "rule__Strategy__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3986:1: rule__Strategy__Group__3__Impl : ( ( rule__Strategy__EntitiesAssignment_3 )* ) ;
    public final void rule__Strategy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3990:1: ( ( ( rule__Strategy__EntitiesAssignment_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3991:1: ( ( rule__Strategy__EntitiesAssignment_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3991:1: ( ( rule__Strategy__EntitiesAssignment_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3992:1: ( rule__Strategy__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getStrategyAccess().getEntitiesAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3993:1: ( rule__Strategy__EntitiesAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3993:2: rule__Strategy__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Strategy__EntitiesAssignment_3_in_rule__Strategy__Group__3__Impl7936);
            	    rule__Strategy__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getStrategyAccess().getEntitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__3__Impl"


    // $ANTLR start "rule__Strategy__Group__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4003:1: rule__Strategy__Group__4 : rule__Strategy__Group__4__Impl ;
    public final void rule__Strategy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4007:1: ( rule__Strategy__Group__4__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4008:2: rule__Strategy__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Strategy__Group__4__Impl_in_rule__Strategy__Group__47967);
            rule__Strategy__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__4"


    // $ANTLR start "rule__Strategy__Group__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4014:1: rule__Strategy__Group__4__Impl : ( '}' ) ;
    public final void rule__Strategy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4018:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4019:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4019:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4020:1: '}'
            {
             before(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Strategy__Group__4__Impl7995); 
             after(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4043:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4047:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4048:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__08036);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__08039);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4055:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4059:1: ( ( 'entity' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4060:1: ( 'entity' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4060:1: ( 'entity' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4061:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Entity__Group__0__Impl8067); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4074:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4078:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4079:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__18098);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__18101);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4086:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4090:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4091:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4091:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4092:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4093:1: ( rule__Entity__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4093:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl8128);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4103:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4107:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4108:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__28158);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__28161);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4115:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4119:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4120:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4120:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4121:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group__2__Impl8189); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4134:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4138:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4139:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__38220);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__38223);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4146:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4150:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4151:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4151:1: ( ( rule__Entity__Group_3__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4152:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4153:1: ( rule__Entity__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4153:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl8250);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4163:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4167:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4168:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__48281);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__48284);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4175:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__EntityBehaviorAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4179:1: ( ( ( rule__Entity__EntityBehaviorAssignment_4 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4180:1: ( ( rule__Entity__EntityBehaviorAssignment_4 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4180:1: ( ( rule__Entity__EntityBehaviorAssignment_4 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4181:1: ( rule__Entity__EntityBehaviorAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getEntityBehaviorAssignment_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4182:1: ( rule__Entity__EntityBehaviorAssignment_4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4182:2: rule__Entity__EntityBehaviorAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__EntityBehaviorAssignment_4_in_rule__Entity__Group__4__Impl8311);
            rule__Entity__EntityBehaviorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getEntityBehaviorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4192:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4196:1: ( rule__Entity__Group__5__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4197:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__58341);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4203:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4207:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4208:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4208:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4209:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Entity__Group__5__Impl8369); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4234:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4238:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4239:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__08412);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__08415);
            rule__Entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4246:1: rule__Entity__Group_3__0__Impl : ( 'ServiceDirectory' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4250:1: ( ( 'ServiceDirectory' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4251:1: ( 'ServiceDirectory' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4251:1: ( 'ServiceDirectory' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4252:1: 'ServiceDirectory'
            {
             before(grammarAccess.getEntityAccess().getServiceDirectoryKeyword_3_0()); 
            match(input,47,FOLLOW_47_in_rule__Entity__Group_3__0__Impl8443); 
             after(grammarAccess.getEntityAccess().getServiceDirectoryKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4265:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4269:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4270:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__18474);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__2_in_rule__Entity__Group_3__18477);
            rule__Entity__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4277:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SdnameAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4281:1: ( ( ( rule__Entity__SdnameAssignment_3_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4282:1: ( ( rule__Entity__SdnameAssignment_3_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4282:1: ( ( rule__Entity__SdnameAssignment_3_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4283:1: ( rule__Entity__SdnameAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSdnameAssignment_3_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4284:1: ( rule__Entity__SdnameAssignment_3_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4284:2: rule__Entity__SdnameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SdnameAssignment_3_1_in_rule__Entity__Group_3__1__Impl8504);
            rule__Entity__SdnameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSdnameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4294:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4298:1: ( rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4299:2: rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__2__Impl_in_rule__Entity__Group_3__28534);
            rule__Entity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__3_in_rule__Entity__Group_3__28537);
            rule__Entity__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2"


    // $ANTLR start "rule__Entity__Group_3__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4306:1: rule__Entity__Group_3__2__Impl : ( '=' ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4310:1: ( ( '=' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4311:1: ( '=' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4311:1: ( '=' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4312:1: '='
            {
             before(grammarAccess.getEntityAccess().getEqualsSignKeyword_3_2()); 
            match(input,48,FOLLOW_48_in_rule__Entity__Group_3__2__Impl8565); 
             after(grammarAccess.getEntityAccess().getEqualsSignKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2__Impl"


    // $ANTLR start "rule__Entity__Group_3__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4325:1: rule__Entity__Group_3__3 : rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 ;
    public final void rule__Entity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4329:1: ( rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4330:2: rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__3__Impl_in_rule__Entity__Group_3__38596);
            rule__Entity__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__4_in_rule__Entity__Group_3__38599);
            rule__Entity__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__3"


    // $ANTLR start "rule__Entity__Group_3__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4337:1: rule__Entity__Group_3__3__Impl : ( '[' ) ;
    public final void rule__Entity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4341:1: ( ( '[' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4342:1: ( '[' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4342:1: ( '[' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4343:1: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3_3()); 
            match(input,49,FOLLOW_49_in_rule__Entity__Group_3__3__Impl8627); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__3__Impl"


    // $ANTLR start "rule__Entity__Group_3__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4356:1: rule__Entity__Group_3__4 : rule__Entity__Group_3__4__Impl rule__Entity__Group_3__5 ;
    public final void rule__Entity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4360:1: ( rule__Entity__Group_3__4__Impl rule__Entity__Group_3__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4361:2: rule__Entity__Group_3__4__Impl rule__Entity__Group_3__5
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__4__Impl_in_rule__Entity__Group_3__48658);
            rule__Entity__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__5_in_rule__Entity__Group_3__48661);
            rule__Entity__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__4"


    // $ANTLR start "rule__Entity__Group_3__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4368:1: rule__Entity__Group_3__4__Impl : ( ( rule__Entity__ServiceProvisionsAssignment_3_4 )* ) ;
    public final void rule__Entity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4372:1: ( ( ( rule__Entity__ServiceProvisionsAssignment_3_4 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4373:1: ( ( rule__Entity__ServiceProvisionsAssignment_3_4 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4373:1: ( ( rule__Entity__ServiceProvisionsAssignment_3_4 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4374:1: ( rule__Entity__ServiceProvisionsAssignment_3_4 )*
            {
             before(grammarAccess.getEntityAccess().getServiceProvisionsAssignment_3_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4375:1: ( rule__Entity__ServiceProvisionsAssignment_3_4 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==51) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4375:2: rule__Entity__ServiceProvisionsAssignment_3_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__ServiceProvisionsAssignment_3_4_in_rule__Entity__Group_3__4__Impl8688);
            	    rule__Entity__ServiceProvisionsAssignment_3_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getServiceProvisionsAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__4__Impl"


    // $ANTLR start "rule__Entity__Group_3__5"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4385:1: rule__Entity__Group_3__5 : rule__Entity__Group_3__5__Impl ;
    public final void rule__Entity__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4389:1: ( rule__Entity__Group_3__5__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4390:2: rule__Entity__Group_3__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__5__Impl_in_rule__Entity__Group_3__58719);
            rule__Entity__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__5"


    // $ANTLR start "rule__Entity__Group_3__5__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4396:1: rule__Entity__Group_3__5__Impl : ( ']' ) ;
    public final void rule__Entity__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4400:1: ( ( ']' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4401:1: ( ']' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4401:1: ( ']' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4402:1: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_3_5()); 
            match(input,50,FOLLOW_50_in_rule__Entity__Group_3__5__Impl8747); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__5__Impl"


    // $ANTLR start "rule__Provision__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4427:1: rule__Provision__Group__0 : rule__Provision__Group__0__Impl rule__Provision__Group__1 ;
    public final void rule__Provision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4431:1: ( rule__Provision__Group__0__Impl rule__Provision__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4432:2: rule__Provision__Group__0__Impl rule__Provision__Group__1
            {
            pushFollow(FOLLOW_rule__Provision__Group__0__Impl_in_rule__Provision__Group__08790);
            rule__Provision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Provision__Group__1_in_rule__Provision__Group__08793);
            rule__Provision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__0"


    // $ANTLR start "rule__Provision__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4439:1: rule__Provision__Group__0__Impl : ( '(' ) ;
    public final void rule__Provision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4443:1: ( ( '(' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4444:1: ( '(' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4444:1: ( '(' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4445:1: '('
            {
             before(grammarAccess.getProvisionAccess().getLeftParenthesisKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__Provision__Group__0__Impl8821); 
             after(grammarAccess.getProvisionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__0__Impl"


    // $ANTLR start "rule__Provision__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4458:1: rule__Provision__Group__1 : rule__Provision__Group__1__Impl rule__Provision__Group__2 ;
    public final void rule__Provision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4462:1: ( rule__Provision__Group__1__Impl rule__Provision__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4463:2: rule__Provision__Group__1__Impl rule__Provision__Group__2
            {
            pushFollow(FOLLOW_rule__Provision__Group__1__Impl_in_rule__Provision__Group__18852);
            rule__Provision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Provision__Group__2_in_rule__Provision__Group__18855);
            rule__Provision__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__1"


    // $ANTLR start "rule__Provision__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4470:1: rule__Provision__Group__1__Impl : ( ( rule__Provision__ServiceNameAssignment_1 ) ) ;
    public final void rule__Provision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4474:1: ( ( ( rule__Provision__ServiceNameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4475:1: ( ( rule__Provision__ServiceNameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4475:1: ( ( rule__Provision__ServiceNameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4476:1: ( rule__Provision__ServiceNameAssignment_1 )
            {
             before(grammarAccess.getProvisionAccess().getServiceNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4477:1: ( rule__Provision__ServiceNameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4477:2: rule__Provision__ServiceNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Provision__ServiceNameAssignment_1_in_rule__Provision__Group__1__Impl8882);
            rule__Provision__ServiceNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProvisionAccess().getServiceNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__1__Impl"


    // $ANTLR start "rule__Provision__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4487:1: rule__Provision__Group__2 : rule__Provision__Group__2__Impl rule__Provision__Group__3 ;
    public final void rule__Provision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4491:1: ( rule__Provision__Group__2__Impl rule__Provision__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4492:2: rule__Provision__Group__2__Impl rule__Provision__Group__3
            {
            pushFollow(FOLLOW_rule__Provision__Group__2__Impl_in_rule__Provision__Group__28912);
            rule__Provision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Provision__Group__3_in_rule__Provision__Group__28915);
            rule__Provision__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__2"


    // $ANTLR start "rule__Provision__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4499:1: rule__Provision__Group__2__Impl : ( ',' ) ;
    public final void rule__Provision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4503:1: ( ( ',' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4504:1: ( ',' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4504:1: ( ',' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4505:1: ','
            {
             before(grammarAccess.getProvisionAccess().getCommaKeyword_2()); 
            match(input,52,FOLLOW_52_in_rule__Provision__Group__2__Impl8943); 
             after(grammarAccess.getProvisionAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__2__Impl"


    // $ANTLR start "rule__Provision__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4518:1: rule__Provision__Group__3 : rule__Provision__Group__3__Impl rule__Provision__Group__4 ;
    public final void rule__Provision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4522:1: ( rule__Provision__Group__3__Impl rule__Provision__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4523:2: rule__Provision__Group__3__Impl rule__Provision__Group__4
            {
            pushFollow(FOLLOW_rule__Provision__Group__3__Impl_in_rule__Provision__Group__38974);
            rule__Provision__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Provision__Group__4_in_rule__Provision__Group__38977);
            rule__Provision__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__3"


    // $ANTLR start "rule__Provision__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4530:1: rule__Provision__Group__3__Impl : ( '{' ) ;
    public final void rule__Provision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4534:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4535:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4535:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4536:1: '{'
            {
             before(grammarAccess.getProvisionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Provision__Group__3__Impl9005); 
             after(grammarAccess.getProvisionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__3__Impl"


    // $ANTLR start "rule__Provision__Group__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4549:1: rule__Provision__Group__4 : rule__Provision__Group__4__Impl rule__Provision__Group__5 ;
    public final void rule__Provision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4553:1: ( rule__Provision__Group__4__Impl rule__Provision__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4554:2: rule__Provision__Group__4__Impl rule__Provision__Group__5
            {
            pushFollow(FOLLOW_rule__Provision__Group__4__Impl_in_rule__Provision__Group__49036);
            rule__Provision__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Provision__Group__5_in_rule__Provision__Group__49039);
            rule__Provision__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__4"


    // $ANTLR start "rule__Provision__Group__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4561:1: rule__Provision__Group__4__Impl : ( ( rule__Provision__ProvidersAssignment_4 )* ) ;
    public final void rule__Provision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4565:1: ( ( ( rule__Provision__ProvidersAssignment_4 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4566:1: ( ( rule__Provision__ProvidersAssignment_4 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4566:1: ( ( rule__Provision__ProvidersAssignment_4 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4567:1: ( rule__Provision__ProvidersAssignment_4 )*
            {
             before(grammarAccess.getProvisionAccess().getProvidersAssignment_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4568:1: ( rule__Provision__ProvidersAssignment_4 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4568:2: rule__Provision__ProvidersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Provision__ProvidersAssignment_4_in_rule__Provision__Group__4__Impl9066);
            	    rule__Provision__ProvidersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getProvisionAccess().getProvidersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__4__Impl"


    // $ANTLR start "rule__Provision__Group__5"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4578:1: rule__Provision__Group__5 : rule__Provision__Group__5__Impl rule__Provision__Group__6 ;
    public final void rule__Provision__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4582:1: ( rule__Provision__Group__5__Impl rule__Provision__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4583:2: rule__Provision__Group__5__Impl rule__Provision__Group__6
            {
            pushFollow(FOLLOW_rule__Provision__Group__5__Impl_in_rule__Provision__Group__59097);
            rule__Provision__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Provision__Group__6_in_rule__Provision__Group__59100);
            rule__Provision__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__5"


    // $ANTLR start "rule__Provision__Group__5__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4590:1: rule__Provision__Group__5__Impl : ( '}' ) ;
    public final void rule__Provision__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4594:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4595:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4595:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4596:1: '}'
            {
             before(grammarAccess.getProvisionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Provision__Group__5__Impl9128); 
             after(grammarAccess.getProvisionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__5__Impl"


    // $ANTLR start "rule__Provision__Group__6"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4609:1: rule__Provision__Group__6 : rule__Provision__Group__6__Impl ;
    public final void rule__Provision__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4613:1: ( rule__Provision__Group__6__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4614:2: rule__Provision__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Provision__Group__6__Impl_in_rule__Provision__Group__69159);
            rule__Provision__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__6"


    // $ANTLR start "rule__Provision__Group__6__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4620:1: rule__Provision__Group__6__Impl : ( ')' ) ;
    public final void rule__Provision__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4624:1: ( ( ')' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4625:1: ( ')' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4625:1: ( ')' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4626:1: ')'
            {
             before(grammarAccess.getProvisionAccess().getRightParenthesisKeyword_6()); 
            match(input,53,FOLLOW_53_in_rule__Provision__Group__6__Impl9187); 
             after(grammarAccess.getProvisionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__Group__6__Impl"


    // $ANTLR start "rule__Statemachine__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4653:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4657:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4658:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__09232);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__09235);
            rule__Statemachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0"


    // $ANTLR start "rule__Statemachine__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4665:1: rule__Statemachine__Group__0__Impl : ( () ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4669:1: ( ( () ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4670:1: ( () )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4670:1: ( () )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4671:1: ()
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4672:1: ()
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4674:1: 
            {
            }

             after(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0__Impl"


    // $ANTLR start "rule__Statemachine__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4684:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4688:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4689:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__19293);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__19296);
            rule__Statemachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1"


    // $ANTLR start "rule__Statemachine__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4696:1: rule__Statemachine__Group__1__Impl : ( ( rule__Statemachine__Group_1__0 )? ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4700:1: ( ( ( rule__Statemachine__Group_1__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4701:1: ( ( rule__Statemachine__Group_1__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4701:1: ( ( rule__Statemachine__Group_1__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4702:1: ( rule__Statemachine__Group_1__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4703:1: ( rule__Statemachine__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4703:2: rule__Statemachine__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statemachine__Group_1__0_in_rule__Statemachine__Group__1__Impl9323);
                    rule__Statemachine__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4713:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4717:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4718:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__29354);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__29357);
            rule__Statemachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2"


    // $ANTLR start "rule__Statemachine__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4725:1: rule__Statemachine__Group__2__Impl : ( ( rule__Statemachine__Group_2__0 )? ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4729:1: ( ( ( rule__Statemachine__Group_2__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4730:1: ( ( rule__Statemachine__Group_2__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4730:1: ( ( rule__Statemachine__Group_2__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4731:1: ( rule__Statemachine__Group_2__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4732:1: ( rule__Statemachine__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4732:2: rule__Statemachine__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl9384);
                    rule__Statemachine__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4742:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4746:1: ( rule__Statemachine__Group__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4747:2: rule__Statemachine__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__39415);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3"


    // $ANTLR start "rule__Statemachine__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4753:1: rule__Statemachine__Group__3__Impl : ( ( rule__Statemachine__StatesAssignment_3 )* ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4757:1: ( ( ( rule__Statemachine__StatesAssignment_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4758:1: ( ( rule__Statemachine__StatesAssignment_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4758:1: ( ( rule__Statemachine__StatesAssignment_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4759:1: ( rule__Statemachine__StatesAssignment_3 )*
            {
             before(grammarAccess.getStatemachineAccess().getStatesAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4760:1: ( rule__Statemachine__StatesAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==57) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4760:2: rule__Statemachine__StatesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__StatesAssignment_3_in_rule__Statemachine__Group__3__Impl9442);
            	    rule__Statemachine__StatesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getStatesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3__Impl"


    // $ANTLR start "rule__Statemachine__Group_1__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4778:1: rule__Statemachine__Group_1__0 : rule__Statemachine__Group_1__0__Impl rule__Statemachine__Group_1__1 ;
    public final void rule__Statemachine__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4782:1: ( rule__Statemachine__Group_1__0__Impl rule__Statemachine__Group_1__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4783:2: rule__Statemachine__Group_1__0__Impl rule__Statemachine__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_1__0__Impl_in_rule__Statemachine__Group_1__09481);
            rule__Statemachine__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_1__1_in_rule__Statemachine__Group_1__09484);
            rule__Statemachine__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__0"


    // $ANTLR start "rule__Statemachine__Group_1__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4790:1: rule__Statemachine__Group_1__0__Impl : ( 'events' ) ;
    public final void rule__Statemachine__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4794:1: ( ( 'events' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4795:1: ( 'events' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4795:1: ( 'events' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4796:1: 'events'
            {
             before(grammarAccess.getStatemachineAccess().getEventsKeyword_1_0()); 
            match(input,54,FOLLOW_54_in_rule__Statemachine__Group_1__0__Impl9512); 
             after(grammarAccess.getStatemachineAccess().getEventsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_1__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4809:1: rule__Statemachine__Group_1__1 : rule__Statemachine__Group_1__1__Impl rule__Statemachine__Group_1__2 ;
    public final void rule__Statemachine__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4813:1: ( rule__Statemachine__Group_1__1__Impl rule__Statemachine__Group_1__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4814:2: rule__Statemachine__Group_1__1__Impl rule__Statemachine__Group_1__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_1__1__Impl_in_rule__Statemachine__Group_1__19543);
            rule__Statemachine__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_1__2_in_rule__Statemachine__Group_1__19546);
            rule__Statemachine__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__1"


    // $ANTLR start "rule__Statemachine__Group_1__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4821:1: rule__Statemachine__Group_1__1__Impl : ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) ) ;
    public final void rule__Statemachine__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4825:1: ( ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4826:1: ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4826:1: ( ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4827:1: ( ( rule__Statemachine__EventsAssignment_1_1 ) ) ( ( rule__Statemachine__EventsAssignment_1_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4827:1: ( ( rule__Statemachine__EventsAssignment_1_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4828:1: ( rule__Statemachine__EventsAssignment_1_1 )
            {
             before(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4829:1: ( rule__Statemachine__EventsAssignment_1_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4829:2: rule__Statemachine__EventsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl9575);
            rule__Statemachine__EventsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4832:1: ( ( rule__Statemachine__EventsAssignment_1_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4833:1: ( rule__Statemachine__EventsAssignment_1_1 )*
            {
             before(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4834:1: ( rule__Statemachine__EventsAssignment_1_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4834:2: rule__Statemachine__EventsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl9587);
            	    rule__Statemachine__EventsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_1__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4845:1: rule__Statemachine__Group_1__2 : rule__Statemachine__Group_1__2__Impl ;
    public final void rule__Statemachine__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4849:1: ( rule__Statemachine__Group_1__2__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4850:2: rule__Statemachine__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_1__2__Impl_in_rule__Statemachine__Group_1__29620);
            rule__Statemachine__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__2"


    // $ANTLR start "rule__Statemachine__Group_1__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4856:1: rule__Statemachine__Group_1__2__Impl : ( 'end' ) ;
    public final void rule__Statemachine__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4860:1: ( ( 'end' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4861:1: ( 'end' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4861:1: ( 'end' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4862:1: 'end'
            {
             before(grammarAccess.getStatemachineAccess().getEndKeyword_1_2()); 
            match(input,55,FOLLOW_55_in_rule__Statemachine__Group_1__2__Impl9648); 
             after(grammarAccess.getStatemachineAccess().getEndKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_1__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4881:1: rule__Statemachine__Group_2__0 : rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 ;
    public final void rule__Statemachine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4885:1: ( rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4886:2: rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__09685);
            rule__Statemachine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__09688);
            rule__Statemachine__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__0"


    // $ANTLR start "rule__Statemachine__Group_2__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4893:1: rule__Statemachine__Group_2__0__Impl : ( 'activities' ) ;
    public final void rule__Statemachine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4897:1: ( ( 'activities' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4898:1: ( 'activities' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4898:1: ( 'activities' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4899:1: 'activities'
            {
             before(grammarAccess.getStatemachineAccess().getActivitiesKeyword_2_0()); 
            match(input,56,FOLLOW_56_in_rule__Statemachine__Group_2__0__Impl9716); 
             after(grammarAccess.getStatemachineAccess().getActivitiesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4912:1: rule__Statemachine__Group_2__1 : rule__Statemachine__Group_2__1__Impl rule__Statemachine__Group_2__2 ;
    public final void rule__Statemachine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4916:1: ( rule__Statemachine__Group_2__1__Impl rule__Statemachine__Group_2__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4917:2: rule__Statemachine__Group_2__1__Impl rule__Statemachine__Group_2__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__19747);
            rule__Statemachine__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group_2__2_in_rule__Statemachine__Group_2__19750);
            rule__Statemachine__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__1"


    // $ANTLR start "rule__Statemachine__Group_2__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4924:1: rule__Statemachine__Group_2__1__Impl : ( ( ( rule__Statemachine__CommandsAssignment_2_1 ) ) ( ( rule__Statemachine__CommandsAssignment_2_1 )* ) ) ;
    public final void rule__Statemachine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4928:1: ( ( ( ( rule__Statemachine__CommandsAssignment_2_1 ) ) ( ( rule__Statemachine__CommandsAssignment_2_1 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4929:1: ( ( ( rule__Statemachine__CommandsAssignment_2_1 ) ) ( ( rule__Statemachine__CommandsAssignment_2_1 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4929:1: ( ( ( rule__Statemachine__CommandsAssignment_2_1 ) ) ( ( rule__Statemachine__CommandsAssignment_2_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4930:1: ( ( rule__Statemachine__CommandsAssignment_2_1 ) ) ( ( rule__Statemachine__CommandsAssignment_2_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4930:1: ( ( rule__Statemachine__CommandsAssignment_2_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4931:1: ( rule__Statemachine__CommandsAssignment_2_1 )
            {
             before(grammarAccess.getStatemachineAccess().getCommandsAssignment_2_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4932:1: ( rule__Statemachine__CommandsAssignment_2_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4932:2: rule__Statemachine__CommandsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Statemachine__CommandsAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl9779);
            rule__Statemachine__CommandsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getCommandsAssignment_2_1()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4935:1: ( ( rule__Statemachine__CommandsAssignment_2_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4936:1: ( rule__Statemachine__CommandsAssignment_2_1 )*
            {
             before(grammarAccess.getStatemachineAccess().getCommandsAssignment_2_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4937:1: ( rule__Statemachine__CommandsAssignment_2_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4937:2: rule__Statemachine__CommandsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__CommandsAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl9791);
            	    rule__Statemachine__CommandsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getCommandsAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4948:1: rule__Statemachine__Group_2__2 : rule__Statemachine__Group_2__2__Impl ;
    public final void rule__Statemachine__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4952:1: ( rule__Statemachine__Group_2__2__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4953:2: rule__Statemachine__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_2__2__Impl_in_rule__Statemachine__Group_2__29824);
            rule__Statemachine__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__2"


    // $ANTLR start "rule__Statemachine__Group_2__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4959:1: rule__Statemachine__Group_2__2__Impl : ( 'end' ) ;
    public final void rule__Statemachine__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4963:1: ( ( 'end' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4964:1: ( 'end' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4964:1: ( 'end' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4965:1: 'end'
            {
             before(grammarAccess.getStatemachineAccess().getEndKeyword_2_2()); 
            match(input,55,FOLLOW_55_in_rule__Statemachine__Group_2__2__Impl9852); 
             after(grammarAccess.getStatemachineAccess().getEndKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__2__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4984:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4988:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4989:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__09889);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__09892);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4996:1: rule__Event__Group__0__Impl : ( ( rule__Event__NameAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5000:1: ( ( ( rule__Event__NameAssignment_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5001:1: ( ( rule__Event__NameAssignment_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5001:1: ( ( rule__Event__NameAssignment_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5002:1: ( rule__Event__NameAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5003:1: ( rule__Event__NameAssignment_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5003:2: rule__Event__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Group__0__Impl9919);
            rule__Event__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5013:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5017:1: ( rule__Event__Group__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5018:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__19949);
            rule__Event__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5024:1: rule__Event__Group__1__Impl : ( ( rule__Event__CodeAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5028:1: ( ( ( rule__Event__CodeAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5029:1: ( ( rule__Event__CodeAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5029:1: ( ( rule__Event__CodeAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5030:1: ( rule__Event__CodeAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getCodeAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5031:1: ( rule__Event__CodeAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5031:2: rule__Event__CodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__CodeAssignment_1_in_rule__Event__Group__1__Impl9976);
            rule__Event__CodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getCodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5045:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5049:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5050:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__010010);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__010013);
            rule__Command__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5057:1: rule__Command__Group__0__Impl : ( ( rule__Command__NameAssignment_0 ) ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5061:1: ( ( ( rule__Command__NameAssignment_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5062:1: ( ( rule__Command__NameAssignment_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5062:1: ( ( rule__Command__NameAssignment_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5063:1: ( rule__Command__NameAssignment_0 )
            {
             before(grammarAccess.getCommandAccess().getNameAssignment_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5064:1: ( rule__Command__NameAssignment_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5064:2: rule__Command__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__0__Impl10040);
            rule__Command__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5074:1: rule__Command__Group__1 : rule__Command__Group__1__Impl ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5078:1: ( rule__Command__Group__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5079:2: rule__Command__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__110070);
            rule__Command__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5085:1: rule__Command__Group__1__Impl : ( ( rule__Command__CodeAssignment_1 ) ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5089:1: ( ( ( rule__Command__CodeAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5090:1: ( ( rule__Command__CodeAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5090:1: ( ( rule__Command__CodeAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5091:1: ( rule__Command__CodeAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getCodeAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5092:1: ( rule__Command__CodeAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5092:2: rule__Command__CodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Command__CodeAssignment_1_in_rule__Command__Group__1__Impl10097);
            rule__Command__CodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getCodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5106:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5110:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5111:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__010131);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__010134);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5118:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5122:1: ( ( 'state' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5123:1: ( 'state' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5123:1: ( 'state' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5124:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__State__Group__0__Impl10162); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5137:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5141:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5142:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__110193);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__110196);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5149:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5153:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5154:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5154:1: ( ( rule__State__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5155:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5156:1: ( rule__State__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5156:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl10223);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5166:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5170:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5171:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__210253);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__210256);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5178:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5182:1: ( ( ( rule__State__Group_2__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5183:1: ( ( rule__State__Group_2__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5183:1: ( ( rule__State__Group_2__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5184:1: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5185:1: ( rule__State__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5185:2: rule__State__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl10283);
                    rule__State__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5195:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5199:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5200:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__310314);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__310317);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5207:1: rule__State__Group__3__Impl : ( ( rule__State__TransitionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5211:1: ( ( ( rule__State__TransitionsAssignment_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5212:1: ( ( rule__State__TransitionsAssignment_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5212:1: ( ( rule__State__TransitionsAssignment_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5213:1: ( rule__State__TransitionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5214:1: ( rule__State__TransitionsAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5214:2: rule__State__TransitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__3__Impl10344);
            	    rule__State__TransitionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5224:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5228:1: ( rule__State__Group__4__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5229:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__410375);
            rule__State__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5235:1: rule__State__Group__4__Impl : ( 'end' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5239:1: ( ( 'end' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5240:1: ( 'end' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5240:1: ( 'end' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5241:1: 'end'
            {
             before(grammarAccess.getStateAccess().getEndKeyword_4()); 
            match(input,55,FOLLOW_55_in_rule__State__Group__4__Impl10403); 
             after(grammarAccess.getStateAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group_2__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5264:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5268:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5269:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__010444);
            rule__State__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__010447);
            rule__State__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0"


    // $ANTLR start "rule__State__Group_2__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5276:1: rule__State__Group_2__0__Impl : ( 'actions' ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5280:1: ( ( 'actions' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5281:1: ( 'actions' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5281:1: ( 'actions' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5282:1: 'actions'
            {
             before(grammarAccess.getStateAccess().getActionsKeyword_2_0()); 
            match(input,58,FOLLOW_58_in_rule__State__Group_2__0__Impl10475); 
             after(grammarAccess.getStateAccess().getActionsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0__Impl"


    // $ANTLR start "rule__State__Group_2__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5295:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl rule__State__Group_2__2 ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5299:1: ( rule__State__Group_2__1__Impl rule__State__Group_2__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5300:2: rule__State__Group_2__1__Impl rule__State__Group_2__2
            {
            pushFollow(FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__110506);
            rule__State__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_2__2_in_rule__State__Group_2__110509);
            rule__State__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1"


    // $ANTLR start "rule__State__Group_2__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5307:1: rule__State__Group_2__1__Impl : ( '{' ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5311:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5312:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5312:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5313:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,23,FOLLOW_23_in_rule__State__Group_2__1__Impl10537); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1__Impl"


    // $ANTLR start "rule__State__Group_2__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5326:1: rule__State__Group_2__2 : rule__State__Group_2__2__Impl rule__State__Group_2__3 ;
    public final void rule__State__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5330:1: ( rule__State__Group_2__2__Impl rule__State__Group_2__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5331:2: rule__State__Group_2__2__Impl rule__State__Group_2__3
            {
            pushFollow(FOLLOW_rule__State__Group_2__2__Impl_in_rule__State__Group_2__210568);
            rule__State__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_2__3_in_rule__State__Group_2__210571);
            rule__State__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__2"


    // $ANTLR start "rule__State__Group_2__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5338:1: rule__State__Group_2__2__Impl : ( ( ( rule__State__ActionsAssignment_2_2 ) ) ( ( rule__State__ActionsAssignment_2_2 )* ) ) ;
    public final void rule__State__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5342:1: ( ( ( ( rule__State__ActionsAssignment_2_2 ) ) ( ( rule__State__ActionsAssignment_2_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5343:1: ( ( ( rule__State__ActionsAssignment_2_2 ) ) ( ( rule__State__ActionsAssignment_2_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5343:1: ( ( ( rule__State__ActionsAssignment_2_2 ) ) ( ( rule__State__ActionsAssignment_2_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5344:1: ( ( rule__State__ActionsAssignment_2_2 ) ) ( ( rule__State__ActionsAssignment_2_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5344:1: ( ( rule__State__ActionsAssignment_2_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5345:1: ( rule__State__ActionsAssignment_2_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5346:1: ( rule__State__ActionsAssignment_2_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5346:2: rule__State__ActionsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__State__ActionsAssignment_2_2_in_rule__State__Group_2__2__Impl10600);
            rule__State__ActionsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_2_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5349:1: ( ( rule__State__ActionsAssignment_2_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5350:1: ( rule__State__ActionsAssignment_2_2 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5351:1: ( rule__State__ActionsAssignment_2_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5351:2: rule__State__ActionsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__State__ActionsAssignment_2_2_in_rule__State__Group_2__2__Impl10612);
            	    rule__State__ActionsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getActionsAssignment_2_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__2__Impl"


    // $ANTLR start "rule__State__Group_2__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5362:1: rule__State__Group_2__3 : rule__State__Group_2__3__Impl ;
    public final void rule__State__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5366:1: ( rule__State__Group_2__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5367:2: rule__State__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_2__3__Impl_in_rule__State__Group_2__310645);
            rule__State__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__3"


    // $ANTLR start "rule__State__Group_2__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5373:1: rule__State__Group_2__3__Impl : ( '}' ) ;
    public final void rule__State__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5377:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5378:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5378:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5379:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,24,FOLLOW_24_in_rule__State__Group_2__3__Impl10673); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__3__Impl"


    // $ANTLR start "rule__Transition__Group_0__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5400:1: rule__Transition__Group_0__0 : rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 ;
    public final void rule__Transition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5404:1: ( rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5405:2: rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_0__0__Impl_in_rule__Transition__Group_0__010712);
            rule__Transition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_0__1_in_rule__Transition__Group_0__010715);
            rule__Transition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__0"


    // $ANTLR start "rule__Transition__Group_0__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5412:1: rule__Transition__Group_0__0__Impl : ( ( rule__Transition__EventAssignment_0_0 ) ) ;
    public final void rule__Transition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5416:1: ( ( ( rule__Transition__EventAssignment_0_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5417:1: ( ( rule__Transition__EventAssignment_0_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5417:1: ( ( rule__Transition__EventAssignment_0_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5418:1: ( rule__Transition__EventAssignment_0_0 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_0_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5419:1: ( rule__Transition__EventAssignment_0_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5419:2: rule__Transition__EventAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_0_0_in_rule__Transition__Group_0__0__Impl10742);
            rule__Transition__EventAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5429:1: rule__Transition__Group_0__1 : rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2 ;
    public final void rule__Transition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5433:1: ( rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5434:2: rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_0__1__Impl_in_rule__Transition__Group_0__110772);
            rule__Transition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_0__2_in_rule__Transition__Group_0__110775);
            rule__Transition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__1"


    // $ANTLR start "rule__Transition__Group_0__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5441:1: rule__Transition__Group_0__1__Impl : ( '=>' ) ;
    public final void rule__Transition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5445:1: ( ( '=>' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5446:1: ( '=>' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5446:1: ( '=>' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5447:1: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_0_1()); 
            match(input,13,FOLLOW_13_in_rule__Transition__Group_0__1__Impl10803); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_0__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5460:1: rule__Transition__Group_0__2 : rule__Transition__Group_0__2__Impl ;
    public final void rule__Transition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5464:1: ( rule__Transition__Group_0__2__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5465:2: rule__Transition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_0__2__Impl_in_rule__Transition__Group_0__210834);
            rule__Transition__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__2"


    // $ANTLR start "rule__Transition__Group_0__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5471:1: rule__Transition__Group_0__2__Impl : ( ( rule__Transition__StateAssignment_0_2 ) ) ;
    public final void rule__Transition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5475:1: ( ( ( rule__Transition__StateAssignment_0_2 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5476:1: ( ( rule__Transition__StateAssignment_0_2 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5476:1: ( ( rule__Transition__StateAssignment_0_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5477:1: ( rule__Transition__StateAssignment_0_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_0_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5478:1: ( rule__Transition__StateAssignment_0_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5478:2: rule__Transition__StateAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_0_2_in_rule__Transition__Group_0__2__Impl10861);
            rule__Transition__StateAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__2__Impl"


    // $ANTLR start "rule__Transition__Group_1__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5494:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5498:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5499:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__0__Impl_in_rule__Transition__Group_1__010897);
            rule__Transition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_1__1_in_rule__Transition__Group_1__010900);
            rule__Transition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__0"


    // $ANTLR start "rule__Transition__Group_1__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5506:1: rule__Transition__Group_1__0__Impl : ( ( rule__Transition__EventAssignment_1_0 ) ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5510:1: ( ( ( rule__Transition__EventAssignment_1_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5511:1: ( ( rule__Transition__EventAssignment_1_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5511:1: ( ( rule__Transition__EventAssignment_1_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5512:1: ( rule__Transition__EventAssignment_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_1_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5513:1: ( rule__Transition__EventAssignment_1_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5513:2: rule__Transition__EventAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_1_0_in_rule__Transition__Group_1__0__Impl10927);
            rule__Transition__EventAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_1__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5523:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5527:1: ( rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5528:2: rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__1__Impl_in_rule__Transition__Group_1__110957);
            rule__Transition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_1__2_in_rule__Transition__Group_1__110960);
            rule__Transition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__1"


    // $ANTLR start "rule__Transition__Group_1__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5535:1: rule__Transition__Group_1__1__Impl : ( '/' ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5539:1: ( ( '/' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5540:1: ( '/' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5540:1: ( '/' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5541:1: '/'
            {
             before(grammarAccess.getTransitionAccess().getSolidusKeyword_1_1()); 
            match(input,59,FOLLOW_59_in_rule__Transition__Group_1__1__Impl10988); 
             after(grammarAccess.getTransitionAccess().getSolidusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_1__2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5554:1: rule__Transition__Group_1__2 : rule__Transition__Group_1__2__Impl rule__Transition__Group_1__3 ;
    public final void rule__Transition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5558:1: ( rule__Transition__Group_1__2__Impl rule__Transition__Group_1__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5559:2: rule__Transition__Group_1__2__Impl rule__Transition__Group_1__3
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__2__Impl_in_rule__Transition__Group_1__211019);
            rule__Transition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_1__3_in_rule__Transition__Group_1__211022);
            rule__Transition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__2"


    // $ANTLR start "rule__Transition__Group_1__2__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5566:1: rule__Transition__Group_1__2__Impl : ( '[' ) ;
    public final void rule__Transition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5570:1: ( ( '[' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5571:1: ( '[' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5571:1: ( '[' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5572:1: '['
            {
             before(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_2()); 
            match(input,49,FOLLOW_49_in_rule__Transition__Group_1__2__Impl11050); 
             after(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_1__3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5585:1: rule__Transition__Group_1__3 : rule__Transition__Group_1__3__Impl rule__Transition__Group_1__4 ;
    public final void rule__Transition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5589:1: ( rule__Transition__Group_1__3__Impl rule__Transition__Group_1__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5590:2: rule__Transition__Group_1__3__Impl rule__Transition__Group_1__4
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__3__Impl_in_rule__Transition__Group_1__311081);
            rule__Transition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_1__4_in_rule__Transition__Group_1__311084);
            rule__Transition__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__3"


    // $ANTLR start "rule__Transition__Group_1__3__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5597:1: rule__Transition__Group_1__3__Impl : ( ( ( rule__Transition__EventactionsAssignment_1_3 ) ) ( ( rule__Transition__EventactionsAssignment_1_3 )* ) ) ;
    public final void rule__Transition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5601:1: ( ( ( ( rule__Transition__EventactionsAssignment_1_3 ) ) ( ( rule__Transition__EventactionsAssignment_1_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5602:1: ( ( ( rule__Transition__EventactionsAssignment_1_3 ) ) ( ( rule__Transition__EventactionsAssignment_1_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5602:1: ( ( ( rule__Transition__EventactionsAssignment_1_3 ) ) ( ( rule__Transition__EventactionsAssignment_1_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5603:1: ( ( rule__Transition__EventactionsAssignment_1_3 ) ) ( ( rule__Transition__EventactionsAssignment_1_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5603:1: ( ( rule__Transition__EventactionsAssignment_1_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5604:1: ( rule__Transition__EventactionsAssignment_1_3 )
            {
             before(grammarAccess.getTransitionAccess().getEventactionsAssignment_1_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5605:1: ( rule__Transition__EventactionsAssignment_1_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5605:2: rule__Transition__EventactionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Transition__EventactionsAssignment_1_3_in_rule__Transition__Group_1__3__Impl11113);
            rule__Transition__EventactionsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventactionsAssignment_1_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5608:1: ( ( rule__Transition__EventactionsAssignment_1_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5609:1: ( rule__Transition__EventactionsAssignment_1_3 )*
            {
             before(grammarAccess.getTransitionAccess().getEventactionsAssignment_1_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5610:1: ( rule__Transition__EventactionsAssignment_1_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5610:2: rule__Transition__EventactionsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_rule__Transition__EventactionsAssignment_1_3_in_rule__Transition__Group_1__3__Impl11125);
            	    rule__Transition__EventactionsAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getEventactionsAssignment_1_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__3__Impl"


    // $ANTLR start "rule__Transition__Group_1__4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5621:1: rule__Transition__Group_1__4 : rule__Transition__Group_1__4__Impl rule__Transition__Group_1__5 ;
    public final void rule__Transition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5625:1: ( rule__Transition__Group_1__4__Impl rule__Transition__Group_1__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5626:2: rule__Transition__Group_1__4__Impl rule__Transition__Group_1__5
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__4__Impl_in_rule__Transition__Group_1__411158);
            rule__Transition__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_1__5_in_rule__Transition__Group_1__411161);
            rule__Transition__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__4"


    // $ANTLR start "rule__Transition__Group_1__4__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5633:1: rule__Transition__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Transition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5637:1: ( ( ']' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5638:1: ( ']' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5638:1: ( ']' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5639:1: ']'
            {
             before(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,50,FOLLOW_50_in_rule__Transition__Group_1__4__Impl11189); 
             after(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__4__Impl"


    // $ANTLR start "rule__Transition__Group_1__5"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5652:1: rule__Transition__Group_1__5 : rule__Transition__Group_1__5__Impl rule__Transition__Group_1__6 ;
    public final void rule__Transition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5656:1: ( rule__Transition__Group_1__5__Impl rule__Transition__Group_1__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5657:2: rule__Transition__Group_1__5__Impl rule__Transition__Group_1__6
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__5__Impl_in_rule__Transition__Group_1__511220);
            rule__Transition__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_1__6_in_rule__Transition__Group_1__511223);
            rule__Transition__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__5"


    // $ANTLR start "rule__Transition__Group_1__5__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5664:1: rule__Transition__Group_1__5__Impl : ( '=>' ) ;
    public final void rule__Transition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5668:1: ( ( '=>' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5669:1: ( '=>' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5669:1: ( '=>' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5670:1: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_5()); 
            match(input,13,FOLLOW_13_in_rule__Transition__Group_1__5__Impl11251); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__5__Impl"


    // $ANTLR start "rule__Transition__Group_1__6"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5683:1: rule__Transition__Group_1__6 : rule__Transition__Group_1__6__Impl ;
    public final void rule__Transition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5687:1: ( rule__Transition__Group_1__6__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5688:2: rule__Transition__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__6__Impl_in_rule__Transition__Group_1__611282);
            rule__Transition__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__6"


    // $ANTLR start "rule__Transition__Group_1__6__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5694:1: rule__Transition__Group_1__6__Impl : ( ( rule__Transition__StateAssignment_1_6 ) ) ;
    public final void rule__Transition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5698:1: ( ( ( rule__Transition__StateAssignment_1_6 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5699:1: ( ( rule__Transition__StateAssignment_1_6 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5699:1: ( ( rule__Transition__StateAssignment_1_6 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5700:1: ( rule__Transition__StateAssignment_1_6 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_1_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5701:1: ( rule__Transition__StateAssignment_1_6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5701:2: rule__Transition__StateAssignment_1_6
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_1_6_in_rule__Transition__Group_1__6__Impl11309);
            rule__Transition__StateAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__6__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5726:1: rule__KanbanSchedulingSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KanbanSchedulingSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5730:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5731:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5731:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5732:1: RULE_ID
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KanbanSchedulingSystem__NameAssignment_111358); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__NameAssignment_1"


    // $ANTLR start "rule__KanbanSchedulingSystem__OrgUnitsAssignment_3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5741:1: rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 : ( ruleTeam ) ;
    public final void rule__KanbanSchedulingSystem__OrgUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5745:1: ( ( ruleTeam ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5746:1: ( ruleTeam )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5746:1: ( ruleTeam )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5747:1: ruleTeam
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsTeamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTeam_in_rule__KanbanSchedulingSystem__OrgUnitsAssignment_311389);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsTeamParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__OrgUnitsAssignment_3"


    // $ANTLR start "rule__KanbanSchedulingSystem__KssTasksAssignment_6"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5756:1: rule__KanbanSchedulingSystem__KssTasksAssignment_6 : ( ruleTask ) ;
    public final void rule__KanbanSchedulingSystem__KssTasksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5760:1: ( ( ruleTask ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5761:1: ( ruleTask )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5761:1: ( ruleTask )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5762:1: ruleTask
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksTaskParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTask_in_rule__KanbanSchedulingSystem__KssTasksAssignment_611420);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksTaskParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__KssTasksAssignment_6"


    // $ANTLR start "rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5771:1: rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 : ( ruleKanbanTaskModel ) ;
    public final void rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5775:1: ( ( ruleKanbanTaskModel ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5776:1: ( ruleKanbanTaskModel )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5776:1: ( ruleKanbanTaskModel )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5777:1: ruleKanbanTaskModel
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowKanbanTaskModelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleKanbanTaskModel_in_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_711451);
            ruleKanbanTaskModel();

            state._fsp--;

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowKanbanTaskModelParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7"


    // $ANTLR start "rule__KanbanSchedulingSystem__KssGovModelAssignment_10"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5786:1: rule__KanbanSchedulingSystem__KssGovModelAssignment_10 : ( ruleKanbanGovModel ) ;
    public final void rule__KanbanSchedulingSystem__KssGovModelAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5790:1: ( ( ruleKanbanGovModel ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5791:1: ( ruleKanbanGovModel )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5791:1: ( ruleKanbanGovModel )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5792:1: ruleKanbanGovModel
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssGovModelKanbanGovModelParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleKanbanGovModel_in_rule__KanbanSchedulingSystem__KssGovModelAssignment_1011482);
            ruleKanbanGovModel();

            state._fsp--;

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssGovModelKanbanGovModelParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__KssGovModelAssignment_10"


    // $ANTLR start "rule__Team__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5801:1: rule__Team__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Team__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5805:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5806:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5806:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5807:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__NameAssignment_111513); 
             after(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__NameAssignment_1"


    // $ANTLR start "rule__Team__DemandUnitsAssignment_3_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5816:1: rule__Team__DemandUnitsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Team__DemandUnitsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5820:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5821:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5821:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5822:1: ( RULE_ID )
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsTeamCrossReference_3_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5823:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5824:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsTeamIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__DemandUnitsAssignment_3_211548); 
             after(grammarAccess.getTeamAccess().getDemandUnitsTeamIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getTeamAccess().getDemandUnitsTeamCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__DemandUnitsAssignment_3_2"


    // $ANTLR start "rule__Team__SourcedUnitsAssignment_4_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5835:1: rule__Team__SourcedUnitsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Team__SourcedUnitsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5839:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5840:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5840:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5841:1: ( RULE_ID )
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsTeamCrossReference_4_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5842:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5843:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsTeamIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__SourcedUnitsAssignment_4_211587); 
             after(grammarAccess.getTeamAccess().getSourcedUnitsTeamIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getTeamAccess().getSourcedUnitsTeamCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__SourcedUnitsAssignment_4_2"


    // $ANTLR start "rule__Team__GroupmembersAssignment_5_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5854:1: rule__Team__GroupmembersAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Team__GroupmembersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5858:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5859:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5859:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5860:1: ( RULE_ID )
            {
             before(grammarAccess.getTeamAccess().getGroupmembersTeamCrossReference_5_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5861:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5862:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getGroupmembersTeamIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__GroupmembersAssignment_5_211626); 
             after(grammarAccess.getTeamAccess().getGroupmembersTeamIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getTeamAccess().getGroupmembersTeamCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__GroupmembersAssignment_5_2"


    // $ANTLR start "rule__Team__ResourcesAssignment_6_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5873:1: rule__Team__ResourcesAssignment_6_2 : ( ruleAsset ) ;
    public final void rule__Team__ResourcesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5877:1: ( ( ruleAsset ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5878:1: ( ruleAsset )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5878:1: ( ruleAsset )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5879:1: ruleAsset
            {
             before(grammarAccess.getTeamAccess().getResourcesAssetParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Team__ResourcesAssignment_6_211661);
            ruleAsset();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getResourcesAssetParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__ResourcesAssignment_6_2"


    // $ANTLR start "rule__Team__ServicesAssignment_7_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5888:1: rule__Team__ServicesAssignment_7_2 : ( ruleService ) ;
    public final void rule__Team__ServicesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5892:1: ( ( ruleService ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5893:1: ( ruleService )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5893:1: ( ruleService )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5894:1: ruleService
            {
             before(grammarAccess.getTeamAccess().getServicesServiceParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Team__ServicesAssignment_7_211692);
            ruleService();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getServicesServiceParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__ServicesAssignment_7_2"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5903:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5907:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5908:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5908:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5909:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_111723); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Asset__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5918:1: rule__Asset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5922:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5923:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5923:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5924:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_111754); 
             after(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__NameAssignment_1"


    // $ANTLR start "rule__Asset__HasSkillsAssignment_2_3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5933:1: rule__Asset__HasSkillsAssignment_2_3 : ( ruleSkill ) ;
    public final void rule__Asset__HasSkillsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5937:1: ( ( ruleSkill ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5938:1: ( ruleSkill )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5938:1: ( ruleSkill )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5939:1: ruleSkill
            {
             before(grammarAccess.getAssetAccess().getHasSkillsSkillParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleSkill_in_rule__Asset__HasSkillsAssignment_2_311785);
            ruleSkill();

            state._fsp--;

             after(grammarAccess.getAssetAccess().getHasSkillsSkillParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__HasSkillsAssignment_2_3"


    // $ANTLR start "rule__Skill__NameAssignment"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5948:1: rule__Skill__NameAssignment : ( RULE_ID ) ;
    public final void rule__Skill__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5952:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5953:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5953:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5954:1: RULE_ID
            {
             before(grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Skill__NameAssignment11816); 
             after(grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__NameAssignment"


    // $ANTLR start "rule__Dependency__SourceTaskAssignment_0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5963:1: rule__Dependency__SourceTaskAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__SourceTaskAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5967:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5968:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5968:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5969:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getSourceTaskTaskCrossReference_0_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5970:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5971:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getSourceTaskTaskIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__SourceTaskAssignment_011851); 
             after(grammarAccess.getDependencyAccess().getSourceTaskTaskIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getSourceTaskTaskCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__SourceTaskAssignment_0"


    // $ANTLR start "rule__Dependency__TargetTaskAssignment_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5982:1: rule__Dependency__TargetTaskAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__TargetTaskAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5986:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5987:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5987:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5988:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getTargetTaskTaskCrossReference_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5989:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:5990:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getTargetTaskTaskIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__TargetTaskAssignment_211890); 
             after(grammarAccess.getDependencyAccess().getTargetTaskTaskIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getTargetTaskTaskCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__TargetTaskAssignment_2"


    // $ANTLR start "rule__Requirement__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6001:1: rule__Requirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Requirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6005:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6006:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6006:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6007:1: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_111925); 
             after(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__NameAssignment_1"


    // $ANTLR start "rule__Requirement__RTasksAssignment_3_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6016:1: rule__Requirement__RTasksAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Requirement__RTasksAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6020:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6021:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6021:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6022:1: ( RULE_ID )
            {
             before(grammarAccess.getRequirementAccess().getRTasksTaskCrossReference_3_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6023:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6024:1: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getRTasksTaskIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__RTasksAssignment_3_211960); 
             after(grammarAccess.getRequirementAccess().getRTasksTaskIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getRequirementAccess().getRTasksTaskCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__RTasksAssignment_3_2"


    // $ANTLR start "rule__Requirement__DependenciesAssignment_4_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6035:1: rule__Requirement__DependenciesAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__Requirement__DependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6039:1: ( ( ruleDependency ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6040:1: ( ruleDependency )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6040:1: ( ruleDependency )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6041:1: ruleDependency
            {
             before(grammarAccess.getRequirementAccess().getDependenciesDependencyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Requirement__DependenciesAssignment_4_111995);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getRequirementAccess().getDependenciesDependencyParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__DependenciesAssignment_4_1"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6050:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6054:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6055:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6055:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6056:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__NameAssignment_112026); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__STasksAssignment_3_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6065:1: rule__Task__STasksAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Task__STasksAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6069:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6070:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6070:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6071:1: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getSTasksTaskCrossReference_3_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6072:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6073:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getSTasksTaskIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__STasksAssignment_3_212061); 
             after(grammarAccess.getTaskAccess().getSTasksTaskIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getSTasksTaskCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__STasksAssignment_3_2"


    // $ANTLR start "rule__Task__TaskDependenciesAssignment_4_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6084:1: rule__Task__TaskDependenciesAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__Task__TaskDependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6088:1: ( ( ruleDependency ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6089:1: ( ruleDependency )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6089:1: ( ruleDependency )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6090:1: ruleDependency
            {
             before(grammarAccess.getTaskAccess().getTaskDependenciesDependencyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Task__TaskDependenciesAssignment_4_112096);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getTaskDependenciesDependencyParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskDependenciesAssignment_4_1"


    // $ANTLR start "rule__Task__ReqSpecialtiesAssignment_5_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6099:1: rule__Task__ReqSpecialtiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Task__ReqSpecialtiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6103:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6104:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6104:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6105:1: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesServiceCrossReference_5_1_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6106:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6107:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesServiceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__ReqSpecialtiesAssignment_5_112131); 
             after(grammarAccess.getTaskAccess().getReqSpecialtiesServiceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getReqSpecialtiesServiceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ReqSpecialtiesAssignment_5_1"


    // $ANTLR start "rule__Task__BvalueAssignment_6_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6118:1: rule__Task__BvalueAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Task__BvalueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6122:1: ( ( RULE_INT ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6123:1: ( RULE_INT )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6123:1: ( RULE_INT )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6124:1: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBvalueINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Task__BvalueAssignment_6_112166); 
             after(grammarAccess.getTaskAccess().getBvalueINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__BvalueAssignment_6_1"


    // $ANTLR start "rule__Task__COSAssignment_7_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6133:1: rule__Task__COSAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Task__COSAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6137:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6138:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6138:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6139:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getCOSIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__COSAssignment_7_112197); 
             after(grammarAccess.getTaskAccess().getCOSIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__COSAssignment_7_1"


    // $ANTLR start "rule__KanbanTaskModel__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6148:1: rule__KanbanTaskModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KanbanTaskModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6152:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6153:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6153:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6154:1: RULE_ID
            {
             before(grammarAccess.getKanbanTaskModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KanbanTaskModel__NameAssignment_112228); 
             after(grammarAccess.getKanbanTaskModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__NameAssignment_1"


    // $ANTLR start "rule__KanbanTaskModel__CapsAssignment_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6163:1: rule__KanbanTaskModel__CapsAssignment_2 : ( ruleCapability ) ;
    public final void rule__KanbanTaskModel__CapsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6167:1: ( ( ruleCapability ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6168:1: ( ruleCapability )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6168:1: ( ruleCapability )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6169:1: ruleCapability
            {
             before(grammarAccess.getKanbanTaskModelAccess().getCapsCapabilityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCapability_in_rule__KanbanTaskModel__CapsAssignment_212259);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getKanbanTaskModelAccess().getCapsCapabilityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanTaskModel__CapsAssignment_2"


    // $ANTLR start "rule__Capability__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6178:1: rule__Capability__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Capability__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6182:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6183:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6183:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6184:1: RULE_ID
            {
             before(grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Capability__NameAssignment_112290); 
             after(grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__NameAssignment_1"


    // $ANTLR start "rule__Capability__ReqsAssignment_3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6193:1: rule__Capability__ReqsAssignment_3 : ( ruleRequirement ) ;
    public final void rule__Capability__ReqsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6197:1: ( ( ruleRequirement ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6198:1: ( ruleRequirement )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6198:1: ( ruleRequirement )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6199:1: ruleRequirement
            {
             before(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRequirement_in_rule__Capability__ReqsAssignment_312321);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__ReqsAssignment_3"


    // $ANTLR start "rule__KanbanGovModel__StrategyAssignment"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6208:1: rule__KanbanGovModel__StrategyAssignment : ( ruleStrategy ) ;
    public final void rule__KanbanGovModel__StrategyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6212:1: ( ( ruleStrategy ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6213:1: ( ruleStrategy )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6213:1: ( ruleStrategy )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6214:1: ruleStrategy
            {
             before(grammarAccess.getKanbanGovModelAccess().getStrategyStrategyParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStrategy_in_rule__KanbanGovModel__StrategyAssignment12352);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getKanbanGovModelAccess().getStrategyStrategyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanGovModel__StrategyAssignment"


    // $ANTLR start "rule__Strategy__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6223:1: rule__Strategy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Strategy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6227:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6228:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6228:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6229:1: RULE_ID
            {
             before(grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Strategy__NameAssignment_112383); 
             after(grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__NameAssignment_1"


    // $ANTLR start "rule__Strategy__EntitiesAssignment_3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6238:1: rule__Strategy__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Strategy__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6242:1: ( ( ruleEntity ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6243:1: ( ruleEntity )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6243:1: ( ruleEntity )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6244:1: ruleEntity
            {
             before(grammarAccess.getStrategyAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Strategy__EntitiesAssignment_312414);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getStrategyAccess().getEntitiesEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__EntitiesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6253:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6257:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6258:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6258:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6259:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_112445); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SdnameAssignment_3_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6268:1: rule__Entity__SdnameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Entity__SdnameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6272:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6273:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6273:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6274:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSdnameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SdnameAssignment_3_112476); 
             after(grammarAccess.getEntityAccess().getSdnameIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SdnameAssignment_3_1"


    // $ANTLR start "rule__Entity__ServiceProvisionsAssignment_3_4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6283:1: rule__Entity__ServiceProvisionsAssignment_3_4 : ( ruleProvision ) ;
    public final void rule__Entity__ServiceProvisionsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6287:1: ( ( ruleProvision ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6288:1: ( ruleProvision )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6288:1: ( ruleProvision )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6289:1: ruleProvision
            {
             before(grammarAccess.getEntityAccess().getServiceProvisionsProvisionParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleProvision_in_rule__Entity__ServiceProvisionsAssignment_3_412507);
            ruleProvision();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getServiceProvisionsProvisionParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ServiceProvisionsAssignment_3_4"


    // $ANTLR start "rule__Entity__EntityBehaviorAssignment_4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6298:1: rule__Entity__EntityBehaviorAssignment_4 : ( ruleStatemachine ) ;
    public final void rule__Entity__EntityBehaviorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6302:1: ( ( ruleStatemachine ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6303:1: ( ruleStatemachine )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6303:1: ( ruleStatemachine )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6304:1: ruleStatemachine
            {
             before(grammarAccess.getEntityAccess().getEntityBehaviorStatemachineParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStatemachine_in_rule__Entity__EntityBehaviorAssignment_412538);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEntityBehaviorStatemachineParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EntityBehaviorAssignment_4"


    // $ANTLR start "rule__Provision__ServiceNameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6313:1: rule__Provision__ServiceNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Provision__ServiceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6317:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6318:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6318:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6319:1: ( RULE_ID )
            {
             before(grammarAccess.getProvisionAccess().getServiceNameServiceCrossReference_1_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6320:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6321:1: RULE_ID
            {
             before(grammarAccess.getProvisionAccess().getServiceNameServiceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provision__ServiceNameAssignment_112573); 
             after(grammarAccess.getProvisionAccess().getServiceNameServiceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getProvisionAccess().getServiceNameServiceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__ServiceNameAssignment_1"


    // $ANTLR start "rule__Provision__ProvidersAssignment_4"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6332:1: rule__Provision__ProvidersAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Provision__ProvidersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6336:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6337:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6337:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6338:1: ( RULE_ID )
            {
             before(grammarAccess.getProvisionAccess().getProvidersTeamCrossReference_4_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6339:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6340:1: RULE_ID
            {
             before(grammarAccess.getProvisionAccess().getProvidersTeamIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provision__ProvidersAssignment_412612); 
             after(grammarAccess.getProvisionAccess().getProvidersTeamIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProvisionAccess().getProvidersTeamCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provision__ProvidersAssignment_4"


    // $ANTLR start "rule__Statemachine__EventsAssignment_1_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6351:1: rule__Statemachine__EventsAssignment_1_1 : ( ruleEvent ) ;
    public final void rule__Statemachine__EventsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6355:1: ( ( ruleEvent ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6356:1: ( ruleEvent )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6356:1: ( ruleEvent )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6357:1: ruleEvent
            {
             before(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statemachine__EventsAssignment_1_112647);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__EventsAssignment_1_1"


    // $ANTLR start "rule__Statemachine__CommandsAssignment_2_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6366:1: rule__Statemachine__CommandsAssignment_2_1 : ( ruleCommand ) ;
    public final void rule__Statemachine__CommandsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6370:1: ( ( ruleCommand ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6371:1: ( ruleCommand )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6371:1: ( ruleCommand )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6372:1: ruleCommand
            {
             before(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__Statemachine__CommandsAssignment_2_112678);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__CommandsAssignment_2_1"


    // $ANTLR start "rule__Statemachine__StatesAssignment_3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6381:1: rule__Statemachine__StatesAssignment_3 : ( ruleState ) ;
    public final void rule__Statemachine__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6385:1: ( ( ruleState ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6386:1: ( ruleState )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6386:1: ( ruleState )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6387:1: ruleState
            {
             before(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Statemachine__StatesAssignment_312709);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__StatesAssignment_3"


    // $ANTLR start "rule__Event__NameAssignment_0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6396:1: rule__Event__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6400:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6401:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6401:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6402:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_012740); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_0"


    // $ANTLR start "rule__Event__CodeAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6411:1: rule__Event__CodeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Event__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6415:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6416:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6416:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6417:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__CodeAssignment_112771); 
             after(grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__CodeAssignment_1"


    // $ANTLR start "rule__Command__NameAssignment_0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6426:1: rule__Command__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Command__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6430:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6431:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6431:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6432:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__NameAssignment_012802); 
             after(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NameAssignment_0"


    // $ANTLR start "rule__Command__CodeAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6441:1: rule__Command__CodeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Command__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6445:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6446:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6446:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6447:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__CodeAssignment_112833); 
             after(grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CodeAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6456:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6460:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6461:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6461:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6462:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_112864); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__ActionsAssignment_2_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6471:1: rule__State__ActionsAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__State__ActionsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6475:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6476:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6476:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6477:1: ( RULE_ID )
            {
             before(grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6478:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6479:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getActionsCommandIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__ActionsAssignment_2_212899); 
             after(grammarAccess.getStateAccess().getActionsCommandIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_2_2"


    // $ANTLR start "rule__State__TransitionsAssignment_3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6490:1: rule__State__TransitionsAssignment_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6494:1: ( ( ruleTransition ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6495:1: ( ruleTransition )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6495:1: ( ruleTransition )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6496:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_312934);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_3"


    // $ANTLR start "rule__Transition__EventAssignment_0_0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6505:1: rule__Transition__EventAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6509:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6510:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6510:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6511:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6512:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6513:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_0_012969); 
             after(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_0_0"


    // $ANTLR start "rule__Transition__StateAssignment_0_2"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6524:1: rule__Transition__StateAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6528:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6529:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6529:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6530:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_0_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6531:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6532:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_0_213008); 
             after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStateStateCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StateAssignment_0_2"


    // $ANTLR start "rule__Transition__EventAssignment_1_0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6543:1: rule__Transition__EventAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6547:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6548:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6548:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6549:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6550:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6551:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_1_013047); 
             after(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_1_0"


    // $ANTLR start "rule__Transition__EventactionsAssignment_1_3"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6562:1: rule__Transition__EventactionsAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventactionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6566:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6567:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6567:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6568:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventactionsCommandCrossReference_1_3_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6569:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6570:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getEventactionsCommandIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__EventactionsAssignment_1_313086); 
             after(grammarAccess.getTransitionAccess().getEventactionsCommandIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventactionsCommandCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventactionsAssignment_1_3"


    // $ANTLR start "rule__Transition__StateAssignment_1_6"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6581:1: rule__Transition__StateAssignment_1_6 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6585:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6586:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6586:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6587:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_1_6_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6588:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:6589:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_1_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_1_613125); 
             after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_1_6_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStateStateCrossReference_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StateAssignment_1_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleKanbanSchedulingSystem_in_entryRuleKanbanSchedulingSystem61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanSchedulingSystem68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__0_in_ruleKanbanSchedulingSystem94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeam_in_entryRuleTeam121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeam128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__0_in_ruleTeam154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0_in_ruleAsset274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_entryRuleSkill301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkill308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skill__NameAssignment_in_ruleSkill334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__0_in_ruleRequirement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__0_in_ruleTask514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanTaskModel_in_entryRuleKanbanTaskModel541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanTaskModel548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__0_in_ruleKanbanTaskModel574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCapability608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__0_in_ruleCapability634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanGovModel_in_entryRuleKanbanGovModel661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanGovModel668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanGovModel__StrategyAssignment_in_ruleKanbanGovModel694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategy728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strategy__Group__0_in_ruleStrategy754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvision_in_entryRuleProvision841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvision848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provision__Group__0_in_ruleProvision874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_in_ruleTransition1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Team__Alternatives_01211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Team__Alternatives_01231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Dependency__Alternatives_11266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Dependency__Alternatives_11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__0_in_rule__Transition__Alternatives1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__0_in_rule__Transition__Alternatives1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__0__Impl_in_rule__KanbanSchedulingSystem__Group__01369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__1_in_rule__KanbanSchedulingSystem__Group__01372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__KanbanSchedulingSystem__Group__0__Impl1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__1__Impl_in_rule__KanbanSchedulingSystem__Group__11431 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__2_in_rule__KanbanSchedulingSystem__Group__11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__NameAssignment_1_in_rule__KanbanSchedulingSystem__Group__1__Impl1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__2__Impl_in_rule__KanbanSchedulingSystem__Group__21491 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__3_in_rule__KanbanSchedulingSystem__Group__21494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__KanbanSchedulingSystem__Group__2__Impl1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__3__Impl_in_rule__KanbanSchedulingSystem__Group__31553 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__4_in_rule__KanbanSchedulingSystem__Group__31556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1585 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1597 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__4__Impl_in_rule__KanbanSchedulingSystem__Group__41630 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__5_in_rule__KanbanSchedulingSystem__Group__41633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__KanbanSchedulingSystem__Group__4__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__5__Impl_in_rule__KanbanSchedulingSystem__Group__51692 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__6_in_rule__KanbanSchedulingSystem__Group__51695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__KanbanSchedulingSystem__Group__5__Impl1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__6__Impl_in_rule__KanbanSchedulingSystem__Group__61754 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__7_in_rule__KanbanSchedulingSystem__Group__61757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1786 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1798 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__7__Impl_in_rule__KanbanSchedulingSystem__Group__71831 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__8_in_rule__KanbanSchedulingSystem__Group__71834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7_in_rule__KanbanSchedulingSystem__Group__7__Impl1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__8__Impl_in_rule__KanbanSchedulingSystem__Group__81891 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__9_in_rule__KanbanSchedulingSystem__Group__81894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__KanbanSchedulingSystem__Group__8__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__9__Impl_in_rule__KanbanSchedulingSystem__Group__91953 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__10_in_rule__KanbanSchedulingSystem__Group__91956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__KanbanSchedulingSystem__Group__9__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__10__Impl_in_rule__KanbanSchedulingSystem__Group__102015 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__11_in_rule__KanbanSchedulingSystem__Group__102018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssGovModelAssignment_10_in_rule__KanbanSchedulingSystem__Group__10__Impl2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__11__Impl_in_rule__KanbanSchedulingSystem__Group__112075 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__12_in_rule__KanbanSchedulingSystem__Group__112078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__KanbanSchedulingSystem__Group__11__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__12__Impl_in_rule__KanbanSchedulingSystem__Group__122137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__KanbanSchedulingSystem__Group__12__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__0__Impl_in_rule__Team__Group__02222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group__1_in_rule__Team__Group__02225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Alternatives_0_in_rule__Team__Group__0__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__1__Impl_in_rule__Team__Group__12282 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group__2_in_rule__Team__Group__12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__NameAssignment_1_in_rule__Team__Group__1__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__2__Impl_in_rule__Team__Group__22342 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__3_in_rule__Team__Group__22345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group__2__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__3__Impl_in_rule__Team__Group__32404 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__4_in_rule__Team__Group__32407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__0_in_rule__Team__Group__3__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__4__Impl_in_rule__Team__Group__42465 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__5_in_rule__Team__Group__42468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__0_in_rule__Team__Group__4__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__5__Impl_in_rule__Team__Group__52526 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__6_in_rule__Team__Group__52529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__0_in_rule__Team__Group__5__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__6__Impl_in_rule__Team__Group__62587 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__7_in_rule__Team__Group__62590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__0_in_rule__Team__Group__6__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__7__Impl_in_rule__Team__Group__72648 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__8_in_rule__Team__Group__72651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__0_in_rule__Team__Group__7__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__8__Impl_in_rule__Team__Group__82709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group__8__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__0__Impl_in_rule__Team__Group_3__02786 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_3__1_in_rule__Team__Group_3__02789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Team__Group_3__0__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__1__Impl_in_rule__Team__Group_3__12848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group_3__2_in_rule__Team__Group_3__12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_3__1__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__2__Impl_in_rule__Team__Group_3__22910 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_3__3_in_rule__Team__Group_3__22913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2942 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2954 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__Group_3__3__Impl_in_rule__Team__Group_3__32987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_3__3__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__0__Impl_in_rule__Team__Group_4__03054 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_4__1_in_rule__Team__Group_4__03057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Team__Group_4__0__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__1__Impl_in_rule__Team__Group_4__13116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group_4__2_in_rule__Team__Group_4__13119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_4__1__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__2__Impl_in_rule__Team__Group_4__23178 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_4__3_in_rule__Team__Group_4__23181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl3210 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl3222 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__Group_4__3__Impl_in_rule__Team__Group_4__33255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_4__3__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__0__Impl_in_rule__Team__Group_5__03322 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_5__1_in_rule__Team__Group_5__03325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Team__Group_5__0__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__1__Impl_in_rule__Team__Group_5__13384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group_5__2_in_rule__Team__Group_5__13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_5__1__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__2__Impl_in_rule__Team__Group_5__23446 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_5__3_in_rule__Team__Group_5__23449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl3478 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl3490 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__Group_5__3__Impl_in_rule__Team__Group_5__33523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_5__3__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__0__Impl_in_rule__Team__Group_6__03590 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_6__1_in_rule__Team__Group_6__03593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Team__Group_6__0__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__1__Impl_in_rule__Team__Group_6__13652 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Team__Group_6__2_in_rule__Team__Group_6__13655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_6__1__Impl3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__2__Impl_in_rule__Team__Group_6__23714 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_6__3_in_rule__Team__Group_6__23717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl3746 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl3758 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__3__Impl_in_rule__Team__Group_6__33791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_6__3__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__0__Impl_in_rule__Team__Group_7__03858 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_7__1_in_rule__Team__Group_7__03861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Team__Group_7__0__Impl3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__1__Impl_in_rule__Team__Group_7__13920 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Team__Group_7__2_in_rule__Team__Group_7__13923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_7__1__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__2__Impl_in_rule__Team__Group_7__23982 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_7__3_in_rule__Team__Group_7__23985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl4014 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl4026 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__3__Impl_in_rule__Team__Group_7__34059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_7__3__Impl4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__04126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__04129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Service__Group__0__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__04249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__04252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Asset__Group__0__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__14311 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__14314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__24371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__04435 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__04438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Asset__Group_2__0__Impl4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__14497 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__2_in_rule__Asset__Group_2__14500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Asset__Group_2__1__Impl4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__2__Impl_in_rule__Asset__Group_2__24559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__3_in_rule__Asset__Group_2__24562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Asset__Group_2__2__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__3__Impl_in_rule__Asset__Group_2__34621 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__4_in_rule__Asset__Group_2__34624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl4653 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl4665 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__4__Impl_in_rule__Asset__Group_2__44698 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__5_in_rule__Asset__Group_2__44701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Asset__Group_2__4__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__5__Impl_in_rule__Asset__Group_2__54760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Asset__Group_2__5__Impl4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__04831 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__04834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__SourceTaskAssignment_0_in_rule__Dependency__Group__0__Impl4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__14891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__14894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Alternatives_1_in_rule__Dependency__Group__1__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__24951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__TargetTaskAssignment_2_in_rule__Dependency__Group__2__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__05014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__05017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Requirement__Group__0__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__15076 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__15079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__NameAssignment_1_in_rule__Requirement__Group__1__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__25136 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__25139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Requirement__Group__2__Impl5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__35198 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__4_in_rule__Requirement__Group__35201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__4__Impl_in_rule__Requirement__Group__45258 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__5_in_rule__Requirement__Group__45261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__0_in_rule__Requirement__Group__4__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__5__Impl_in_rule__Requirement__Group__55319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Requirement__Group__5__Impl5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__05390 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__05393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Requirement__Group_3__0__Impl5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__15452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__2_in_rule__Requirement__Group_3__15455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Requirement__Group_3__1__Impl5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__2__Impl_in_rule__Requirement__Group_3__25514 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__3_in_rule__Requirement__Group_3__25517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl5546 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl5558 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__3__Impl_in_rule__Requirement__Group_3__35591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Requirement__Group_3__3__Impl5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__0__Impl_in_rule__Requirement__Group_4__05658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__1_in_rule__Requirement__Group_4__05661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Requirement__Group_4__0__Impl5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__1__Impl_in_rule__Requirement__Group_4__15720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__DependenciesAssignment_4_1_in_rule__Requirement__Group_4__1__Impl5747 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__05782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Task__Group__0__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__15844 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Task__Group__2_in_rule__Task__Group__15847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__2__Impl_in_rule__Task__Group__25904 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__3_in_rule__Task__Group__25907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Task__Group__2__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__3__Impl_in_rule__Task__Group__35966 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__4_in_rule__Task__Group__35969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__0_in_rule__Task__Group__3__Impl5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__4__Impl_in_rule__Task__Group__46027 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__5_in_rule__Task__Group__46030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__0_in_rule__Task__Group__4__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__5__Impl_in_rule__Task__Group__56088 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__6_in_rule__Task__Group__56091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_5__0_in_rule__Task__Group__5__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__6__Impl_in_rule__Task__Group__66149 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__7_in_rule__Task__Group__66152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_6__0_in_rule__Task__Group__6__Impl6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__7__Impl_in_rule__Task__Group__76210 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__8_in_rule__Task__Group__76213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__0_in_rule__Task__Group__7__Impl6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__8__Impl_in_rule__Task__Group__86271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Task__Group__8__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__0__Impl_in_rule__Task__Group_3__06348 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Task__Group_3__1_in_rule__Task__Group_3__06351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Task__Group_3__0__Impl6379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__1__Impl_in_rule__Task__Group_3__16410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_3__2_in_rule__Task__Group_3__16413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Task__Group_3__1__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__2__Impl_in_rule__Task__Group_3__26472 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Task__Group_3__3_in_rule__Task__Group_3__26475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl6504 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl6516 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_3__3__Impl_in_rule__Task__Group_3__36549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Task__Group_3__3__Impl6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__0__Impl_in_rule__Task__Group_4__06616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_4__1_in_rule__Task__Group_4__06619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Task__Group_4__0__Impl6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__1__Impl_in_rule__Task__Group_4__16678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__TaskDependenciesAssignment_4_1_in_rule__Task__Group_4__1__Impl6705 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_5__0__Impl_in_rule__Task__Group_5__06740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_5__1_in_rule__Task__Group_5__06743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Task__Group_5__0__Impl6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_5__1__Impl_in_rule__Task__Group_5__16802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6831 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6843 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_6__0__Impl_in_rule__Task__Group_6__06880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Task__Group_6__1_in_rule__Task__Group_6__06883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Task__Group_6__0__Impl6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_6__1__Impl_in_rule__Task__Group_6__16942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__BvalueAssignment_6_1_in_rule__Task__Group_6__1__Impl6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__0__Impl_in_rule__Task__Group_7__07003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_7__1_in_rule__Task__Group_7__07006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Task__Group_7__0__Impl7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__1__Impl_in_rule__Task__Group_7__17065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__COSAssignment_7_1_in_rule__Task__Group_7__1__Impl7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__0__Impl_in_rule__KanbanTaskModel__Group__07126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__1_in_rule__KanbanTaskModel__Group__07129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__KanbanTaskModel__Group__0__Impl7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__1__Impl_in_rule__KanbanTaskModel__Group__17188 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__2_in_rule__KanbanTaskModel__Group__17191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__NameAssignment_1_in_rule__KanbanTaskModel__Group__1__Impl7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__2__Impl_in_rule__KanbanTaskModel__Group__27248 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__3_in_rule__KanbanTaskModel__Group__27251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl7280 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl7292 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__3__Impl_in_rule__KanbanTaskModel__Group__37325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__KanbanTaskModel__Group__3__Impl7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__0__Impl_in_rule__Capability__Group__07392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Capability__Group__1_in_rule__Capability__Group__07395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Capability__Group__0__Impl7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__1__Impl_in_rule__Capability__Group__17454 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Capability__Group__2_in_rule__Capability__Group__17457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__NameAssignment_1_in_rule__Capability__Group__1__Impl7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__2__Impl_in_rule__Capability__Group__27514 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Capability__Group__3_in_rule__Capability__Group__27517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Capability__Group__2__Impl7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__3__Impl_in_rule__Capability__Group__37576 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Capability__Group__4_in_rule__Capability__Group__37579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl7608 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl7620 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__4__Impl_in_rule__Capability__Group__47653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Capability__Group__4__Impl7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strategy__Group__0__Impl_in_rule__Strategy__Group__07722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Strategy__Group__1_in_rule__Strategy__Group__07725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Strategy__Group__0__Impl7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strategy__Group__1__Impl_in_rule__Strategy__Group__17784 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Strategy__Group__2_in_rule__Strategy__Group__17787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strategy__NameAssignment_1_in_rule__Strategy__Group__1__Impl7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strategy__Group__2__Impl_in_rule__Strategy__Group__27844 = new BitSet(new long[]{0x0000400001000000L});
    public static final BitSet FOLLOW_rule__Strategy__Group__3_in_rule__Strategy__Group__27847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Strategy__Group__2__Impl7875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strategy__Group__3__Impl_in_rule__Strategy__Group__37906 = new BitSet(new long[]{0x0000400001000000L});
    public static final BitSet FOLLOW_rule__Strategy__Group__4_in_rule__Strategy__Group__37909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strategy__EntitiesAssignment_3_in_rule__Strategy__Group__3__Impl7936 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Strategy__Group__4__Impl_in_rule__Strategy__Group__47967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Strategy__Group__4__Impl7995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__08036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__08039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Entity__Group__0__Impl8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__18098 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__18101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__28158 = new BitSet(new long[]{0x0340800000000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__28161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__2__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__38220 = new BitSet(new long[]{0x0340800000000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__38223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__48281 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__48284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__EntityBehaviorAssignment_4_in_rule__Entity__Group__4__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__58341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group__5__Impl8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__08412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__08415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Entity__Group_3__0__Impl8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__18474 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__2_in_rule__Entity__Group_3__18477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SdnameAssignment_3_1_in_rule__Entity__Group_3__1__Impl8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__2__Impl_in_rule__Entity__Group_3__28534 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__3_in_rule__Entity__Group_3__28537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Entity__Group_3__2__Impl8565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__3__Impl_in_rule__Entity__Group_3__38596 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__4_in_rule__Entity__Group_3__38599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Entity__Group_3__3__Impl8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__4__Impl_in_rule__Entity__Group_3__48658 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__5_in_rule__Entity__Group_3__48661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ServiceProvisionsAssignment_3_4_in_rule__Entity__Group_3__4__Impl8688 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__5__Impl_in_rule__Entity__Group_3__58719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Entity__Group_3__5__Impl8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provision__Group__0__Impl_in_rule__Provision__Group__08790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provision__Group__1_in_rule__Provision__Group__08793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Provision__Group__0__Impl8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provision__Group__1__Impl_in_rule__Provision__Group__18852 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Provision__Group__2_in_rule__Provision__Group__18855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provision__ServiceNameAssignment_1_in_rule__Provision__Group__1__Impl8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provision__Group__2__Impl_in_rule__Provision__Group__28912 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Provision__Group__3_in_rule__Provision__Group__28915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Provision__Group__2__Impl8943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provision__Group__3__Impl_in_rule__Provision__Group__38974 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Provision__Group__4_in_rule__Provision__Group__38977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Provision__Group__3__Impl9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provision__Group__4__Impl_in_rule__Provision__Group__49036 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Provision__Group__5_in_rule__Provision__Group__49039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provision__ProvidersAssignment_4_in_rule__Provision__Group__4__Impl9066 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Provision__Group__5__Impl_in_rule__Provision__Group__59097 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Provision__Group__6_in_rule__Provision__Group__59100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Provision__Group__5__Impl9128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provision__Group__6__Impl_in_rule__Provision__Group__69159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Provision__Group__6__Impl9187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__09232 = new BitSet(new long[]{0x0340800000000000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__09235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__19293 = new BitSet(new long[]{0x0340800000000000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__19296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__0_in_rule__Statemachine__Group__1__Impl9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__29354 = new BitSet(new long[]{0x0340800000000000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__29357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__39415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__StatesAssignment_3_in_rule__Statemachine__Group__3__Impl9442 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__0__Impl_in_rule__Statemachine__Group_1__09481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__1_in_rule__Statemachine__Group_1__09484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Statemachine__Group_1__0__Impl9512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__1__Impl_in_rule__Statemachine__Group_1__19543 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__2_in_rule__Statemachine__Group_1__19546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl9575 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__EventsAssignment_1_1_in_rule__Statemachine__Group_1__1__Impl9587 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_1__2__Impl_in_rule__Statemachine__Group_1__29620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Statemachine__Group_1__2__Impl9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__09685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__09688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Statemachine__Group_2__0__Impl9716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__19747 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__2_in_rule__Statemachine__Group_2__19750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__CommandsAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl9779 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__CommandsAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl9791 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__2__Impl_in_rule__Statemachine__Group_2__29824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Statemachine__Group_2__2__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__09889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__09892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_0_in_rule__Event__Group__0__Impl9919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__19949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CodeAssignment_1_in_rule__Event__Group__1__Impl9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__010010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__010013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__0__Impl10040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__110070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CodeAssignment_1_in_rule__Command__Group__1__Impl10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__010131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__010134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__State__Group__0__Impl10162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__110193 = new BitSet(new long[]{0x0480000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__110196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl10223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__210253 = new BitSet(new long[]{0x0480000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__210256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl10283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__310314 = new BitSet(new long[]{0x0480000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__310317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__3__Impl10344 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__410375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__State__Group__4__Impl10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__010444 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__010447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__State__Group_2__0__Impl10475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__110506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group_2__2_in_rule__State__Group_2__110509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__Group_2__1__Impl10537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__2__Impl_in_rule__State__Group_2__210568 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__State__Group_2__3_in_rule__State__Group_2__210571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__ActionsAssignment_2_2_in_rule__State__Group_2__2__Impl10600 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__ActionsAssignment_2_2_in_rule__State__Group_2__2__Impl10612 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group_2__3__Impl_in_rule__State__Group_2__310645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__State__Group_2__3__Impl10673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__0__Impl_in_rule__Transition__Group_0__010712 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__1_in_rule__Transition__Group_0__010715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_0_0_in_rule__Transition__Group_0__0__Impl10742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__1__Impl_in_rule__Transition__Group_0__110772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__2_in_rule__Transition__Group_0__110775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transition__Group_0__1__Impl10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__2__Impl_in_rule__Transition__Group_0__210834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_0_2_in_rule__Transition__Group_0__2__Impl10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__0__Impl_in_rule__Transition__Group_1__010897 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__1_in_rule__Transition__Group_1__010900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_1_0_in_rule__Transition__Group_1__0__Impl10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__1__Impl_in_rule__Transition__Group_1__110957 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__2_in_rule__Transition__Group_1__110960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Transition__Group_1__1__Impl10988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__2__Impl_in_rule__Transition__Group_1__211019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__3_in_rule__Transition__Group_1__211022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Transition__Group_1__2__Impl11050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__3__Impl_in_rule__Transition__Group_1__311081 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__4_in_rule__Transition__Group_1__311084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventactionsAssignment_1_3_in_rule__Transition__Group_1__3__Impl11113 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Transition__EventactionsAssignment_1_3_in_rule__Transition__Group_1__3__Impl11125 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__4__Impl_in_rule__Transition__Group_1__411158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__5_in_rule__Transition__Group_1__411161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Transition__Group_1__4__Impl11189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__5__Impl_in_rule__Transition__Group_1__511220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__6_in_rule__Transition__Group_1__511223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transition__Group_1__5__Impl11251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__6__Impl_in_rule__Transition__Group_1__611282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_1_6_in_rule__Transition__Group_1__6__Impl11309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KanbanSchedulingSystem__NameAssignment_111358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeam_in_rule__KanbanSchedulingSystem__OrgUnitsAssignment_311389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__KanbanSchedulingSystem__KssTasksAssignment_611420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanTaskModel_in_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_711451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanGovModel_in_rule__KanbanSchedulingSystem__KssGovModelAssignment_1011482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__NameAssignment_111513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__DemandUnitsAssignment_3_211548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__SourcedUnitsAssignment_4_211587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__GroupmembersAssignment_5_211626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Team__ResourcesAssignment_6_211661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Team__ServicesAssignment_7_211692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_111723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_111754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_rule__Asset__HasSkillsAssignment_2_311785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Skill__NameAssignment11816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__SourceTaskAssignment_011851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__TargetTaskAssignment_211890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_111925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__RTasksAssignment_3_211960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Requirement__DependenciesAssignment_4_111995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_112026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__STasksAssignment_3_212061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Task__TaskDependenciesAssignment_4_112096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__ReqSpecialtiesAssignment_5_112131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Task__BvalueAssignment_6_112166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__COSAssignment_7_112197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KanbanTaskModel__NameAssignment_112228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_rule__KanbanTaskModel__CapsAssignment_212259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Capability__NameAssignment_112290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_rule__Capability__ReqsAssignment_312321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategy_in_rule__KanbanGovModel__StrategyAssignment12352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Strategy__NameAssignment_112383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Strategy__EntitiesAssignment_312414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_112445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SdnameAssignment_3_112476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvision_in_rule__Entity__ServiceProvisionsAssignment_3_412507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_rule__Entity__EntityBehaviorAssignment_412538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provision__ServiceNameAssignment_112573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provision__ProvidersAssignment_412612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statemachine__EventsAssignment_1_112647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Statemachine__CommandsAssignment_2_112678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Statemachine__StatesAssignment_312709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_012740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__CodeAssignment_112771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__NameAssignment_012802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__CodeAssignment_112833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_112864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__ActionsAssignment_2_212899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_312934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_0_012969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_0_213008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_1_013047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__EventactionsAssignment_1_313086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_1_613125 = new BitSet(new long[]{0x0000000000000002L});

}