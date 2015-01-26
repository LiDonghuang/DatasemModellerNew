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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'team'", "'group'", "'=>'", "'->'", "'KSSModel'", "'OrganizationModel'", "'end OrganizationModel'", "'WorkFlowModel'", "'end WorkFlowModel'", "'GovernanceModel'", "'end GovernanceModel'", "'end KSSModel'", "'{'", "'}'", "'sourceUnits'", "'targetUnits'", "'contains'", "'resources'", "'services'", "'service'", "'resource'", "'skills'", "'requirement'", "'workItems'", "'workItemNetwork'", "'workItem'", "'subtasks'", "'taskDependencies'", "'servicesRequired'", "'base value'", "'classOfService'", "'WorkFlow'", "'end WorkFlow'", "'capability'", "'strategy'"
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
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:349:1: ruleKanbanGovModel : ( ( rule__KanbanGovModel__Group__0 ) ) ;
    public final void ruleKanbanGovModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:353:2: ( ( ( rule__KanbanGovModel__Group__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:354:1: ( ( rule__KanbanGovModel__Group__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:354:1: ( ( rule__KanbanGovModel__Group__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:355:1: ( rule__KanbanGovModel__Group__0 )
            {
             before(grammarAccess.getKanbanGovModelAccess().getGroup()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:356:1: ( rule__KanbanGovModel__Group__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:356:2: rule__KanbanGovModel__Group__0
            {
            pushFollow(FOLLOW_rule__KanbanGovModel__Group__0_in_ruleKanbanGovModel694);
            rule__KanbanGovModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKanbanGovModelAccess().getGroup()); 

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


    // $ANTLR start "rule__Team__Alternatives_0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:368:1: rule__Team__Alternatives_0 : ( ( 'team' ) | ( 'group' ) );
    public final void rule__Team__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:372:1: ( ( 'team' ) | ( 'group' ) )
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
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:373:1: ( 'team' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:373:1: ( 'team' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:374:1: 'team'
                    {
                     before(grammarAccess.getTeamAccess().getTeamKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Team__Alternatives_0731); 
                     after(grammarAccess.getTeamAccess().getTeamKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:381:6: ( 'group' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:381:6: ( 'group' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:382:1: 'group'
                    {
                     before(grammarAccess.getTeamAccess().getGroupKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Team__Alternatives_0751); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:394:1: rule__Dependency__Alternatives_1 : ( ( '=>' ) | ( '->' ) );
    public final void rule__Dependency__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:398:1: ( ( '=>' ) | ( '->' ) )
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
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:399:1: ( '=>' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:399:1: ( '=>' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:400:1: '=>'
                    {
                     before(grammarAccess.getDependencyAccess().getEqualsSignGreaterThanSignKeyword_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__Dependency__Alternatives_1786); 
                     after(grammarAccess.getDependencyAccess().getEqualsSignGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:407:6: ( '->' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:407:6: ( '->' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:408:1: '->'
                    {
                     before(grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__Dependency__Alternatives_1806); 
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


    // $ANTLR start "rule__KanbanSchedulingSystem__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:422:1: rule__KanbanSchedulingSystem__Group__0 : rule__KanbanSchedulingSystem__Group__0__Impl rule__KanbanSchedulingSystem__Group__1 ;
    public final void rule__KanbanSchedulingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:426:1: ( rule__KanbanSchedulingSystem__Group__0__Impl rule__KanbanSchedulingSystem__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:427:2: rule__KanbanSchedulingSystem__Group__0__Impl rule__KanbanSchedulingSystem__Group__1
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__0__Impl_in_rule__KanbanSchedulingSystem__Group__0838);
            rule__KanbanSchedulingSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__1_in_rule__KanbanSchedulingSystem__Group__0841);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:434:1: rule__KanbanSchedulingSystem__Group__0__Impl : ( 'KSSModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:438:1: ( ( 'KSSModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:439:1: ( 'KSSModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:439:1: ( 'KSSModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:440:1: 'KSSModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKSSModelKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__KanbanSchedulingSystem__Group__0__Impl869); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:453:1: rule__KanbanSchedulingSystem__Group__1 : rule__KanbanSchedulingSystem__Group__1__Impl rule__KanbanSchedulingSystem__Group__2 ;
    public final void rule__KanbanSchedulingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:457:1: ( rule__KanbanSchedulingSystem__Group__1__Impl rule__KanbanSchedulingSystem__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:458:2: rule__KanbanSchedulingSystem__Group__1__Impl rule__KanbanSchedulingSystem__Group__2
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__1__Impl_in_rule__KanbanSchedulingSystem__Group__1900);
            rule__KanbanSchedulingSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__2_in_rule__KanbanSchedulingSystem__Group__1903);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:465:1: rule__KanbanSchedulingSystem__Group__1__Impl : ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:469:1: ( ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:470:1: ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:470:1: ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:471:1: ( rule__KanbanSchedulingSystem__NameAssignment_1 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:472:1: ( rule__KanbanSchedulingSystem__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:472:2: rule__KanbanSchedulingSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__NameAssignment_1_in_rule__KanbanSchedulingSystem__Group__1__Impl930);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:482:1: rule__KanbanSchedulingSystem__Group__2 : rule__KanbanSchedulingSystem__Group__2__Impl rule__KanbanSchedulingSystem__Group__3 ;
    public final void rule__KanbanSchedulingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:486:1: ( rule__KanbanSchedulingSystem__Group__2__Impl rule__KanbanSchedulingSystem__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:487:2: rule__KanbanSchedulingSystem__Group__2__Impl rule__KanbanSchedulingSystem__Group__3
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__2__Impl_in_rule__KanbanSchedulingSystem__Group__2960);
            rule__KanbanSchedulingSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__3_in_rule__KanbanSchedulingSystem__Group__2963);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:494:1: rule__KanbanSchedulingSystem__Group__2__Impl : ( 'OrganizationModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:498:1: ( ( 'OrganizationModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:499:1: ( 'OrganizationModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:499:1: ( 'OrganizationModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:500:1: 'OrganizationModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationModelKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__KanbanSchedulingSystem__Group__2__Impl991); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:513:1: rule__KanbanSchedulingSystem__Group__3 : rule__KanbanSchedulingSystem__Group__3__Impl rule__KanbanSchedulingSystem__Group__4 ;
    public final void rule__KanbanSchedulingSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:517:1: ( rule__KanbanSchedulingSystem__Group__3__Impl rule__KanbanSchedulingSystem__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:518:2: rule__KanbanSchedulingSystem__Group__3__Impl rule__KanbanSchedulingSystem__Group__4
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__3__Impl_in_rule__KanbanSchedulingSystem__Group__31022);
            rule__KanbanSchedulingSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__4_in_rule__KanbanSchedulingSystem__Group__31025);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:525:1: rule__KanbanSchedulingSystem__Group__3__Impl : ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:529:1: ( ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:530:1: ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:530:1: ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:531:1: ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:531:1: ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:532:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:533:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:533:2: rule__KanbanSchedulingSystem__OrgUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1054);
            rule__KanbanSchedulingSystem__OrgUnitsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:536:1: ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:537:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )*
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:538:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:538:2: rule__KanbanSchedulingSystem__OrgUnitsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1066);
            	    rule__KanbanSchedulingSystem__OrgUnitsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:549:1: rule__KanbanSchedulingSystem__Group__4 : rule__KanbanSchedulingSystem__Group__4__Impl rule__KanbanSchedulingSystem__Group__5 ;
    public final void rule__KanbanSchedulingSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:553:1: ( rule__KanbanSchedulingSystem__Group__4__Impl rule__KanbanSchedulingSystem__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:554:2: rule__KanbanSchedulingSystem__Group__4__Impl rule__KanbanSchedulingSystem__Group__5
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__4__Impl_in_rule__KanbanSchedulingSystem__Group__41099);
            rule__KanbanSchedulingSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__5_in_rule__KanbanSchedulingSystem__Group__41102);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:561:1: rule__KanbanSchedulingSystem__Group__4__Impl : ( 'end OrganizationModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:565:1: ( ( 'end OrganizationModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:566:1: ( 'end OrganizationModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:566:1: ( 'end OrganizationModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:567:1: 'end OrganizationModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationModelKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__KanbanSchedulingSystem__Group__4__Impl1130); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:580:1: rule__KanbanSchedulingSystem__Group__5 : rule__KanbanSchedulingSystem__Group__5__Impl rule__KanbanSchedulingSystem__Group__6 ;
    public final void rule__KanbanSchedulingSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:584:1: ( rule__KanbanSchedulingSystem__Group__5__Impl rule__KanbanSchedulingSystem__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:585:2: rule__KanbanSchedulingSystem__Group__5__Impl rule__KanbanSchedulingSystem__Group__6
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__5__Impl_in_rule__KanbanSchedulingSystem__Group__51161);
            rule__KanbanSchedulingSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__6_in_rule__KanbanSchedulingSystem__Group__51164);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:592:1: rule__KanbanSchedulingSystem__Group__5__Impl : ( 'WorkFlowModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:596:1: ( ( 'WorkFlowModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:597:1: ( 'WorkFlowModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:597:1: ( 'WorkFlowModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:598:1: 'WorkFlowModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getWorkFlowModelKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__KanbanSchedulingSystem__Group__5__Impl1192); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:611:1: rule__KanbanSchedulingSystem__Group__6 : rule__KanbanSchedulingSystem__Group__6__Impl rule__KanbanSchedulingSystem__Group__7 ;
    public final void rule__KanbanSchedulingSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:615:1: ( rule__KanbanSchedulingSystem__Group__6__Impl rule__KanbanSchedulingSystem__Group__7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:616:2: rule__KanbanSchedulingSystem__Group__6__Impl rule__KanbanSchedulingSystem__Group__7
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__6__Impl_in_rule__KanbanSchedulingSystem__Group__61223);
            rule__KanbanSchedulingSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__7_in_rule__KanbanSchedulingSystem__Group__61226);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:623:1: rule__KanbanSchedulingSystem__Group__6__Impl : ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:627:1: ( ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:628:1: ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:628:1: ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:629:1: ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:629:1: ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:630:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:631:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:631:2: rule__KanbanSchedulingSystem__KssTasksAssignment_6
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1255);
            rule__KanbanSchedulingSystem__KssTasksAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:634:1: ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:635:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )*
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:636:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:636:2: rule__KanbanSchedulingSystem__KssTasksAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1267);
            	    rule__KanbanSchedulingSystem__KssTasksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:647:1: rule__KanbanSchedulingSystem__Group__7 : rule__KanbanSchedulingSystem__Group__7__Impl rule__KanbanSchedulingSystem__Group__8 ;
    public final void rule__KanbanSchedulingSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:651:1: ( rule__KanbanSchedulingSystem__Group__7__Impl rule__KanbanSchedulingSystem__Group__8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:652:2: rule__KanbanSchedulingSystem__Group__7__Impl rule__KanbanSchedulingSystem__Group__8
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__7__Impl_in_rule__KanbanSchedulingSystem__Group__71300);
            rule__KanbanSchedulingSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__8_in_rule__KanbanSchedulingSystem__Group__71303);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:659:1: rule__KanbanSchedulingSystem__Group__7__Impl : ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:663:1: ( ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:664:1: ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:664:1: ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:665:1: ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowAssignment_7()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:666:1: ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:666:2: rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7_in_rule__KanbanSchedulingSystem__Group__7__Impl1330);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:676:1: rule__KanbanSchedulingSystem__Group__8 : rule__KanbanSchedulingSystem__Group__8__Impl rule__KanbanSchedulingSystem__Group__9 ;
    public final void rule__KanbanSchedulingSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:680:1: ( rule__KanbanSchedulingSystem__Group__8__Impl rule__KanbanSchedulingSystem__Group__9 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:681:2: rule__KanbanSchedulingSystem__Group__8__Impl rule__KanbanSchedulingSystem__Group__9
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__8__Impl_in_rule__KanbanSchedulingSystem__Group__81360);
            rule__KanbanSchedulingSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__9_in_rule__KanbanSchedulingSystem__Group__81363);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:688:1: rule__KanbanSchedulingSystem__Group__8__Impl : ( 'end WorkFlowModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:692:1: ( ( 'end WorkFlowModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:693:1: ( 'end WorkFlowModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:693:1: ( 'end WorkFlowModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:694:1: 'end WorkFlowModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkFlowModelKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__KanbanSchedulingSystem__Group__8__Impl1391); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:707:1: rule__KanbanSchedulingSystem__Group__9 : rule__KanbanSchedulingSystem__Group__9__Impl rule__KanbanSchedulingSystem__Group__10 ;
    public final void rule__KanbanSchedulingSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:711:1: ( rule__KanbanSchedulingSystem__Group__9__Impl rule__KanbanSchedulingSystem__Group__10 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:712:2: rule__KanbanSchedulingSystem__Group__9__Impl rule__KanbanSchedulingSystem__Group__10
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__9__Impl_in_rule__KanbanSchedulingSystem__Group__91422);
            rule__KanbanSchedulingSystem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__10_in_rule__KanbanSchedulingSystem__Group__91425);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:719:1: rule__KanbanSchedulingSystem__Group__9__Impl : ( 'GovernanceModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:723:1: ( ( 'GovernanceModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:724:1: ( 'GovernanceModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:724:1: ( 'GovernanceModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:725:1: 'GovernanceModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceModelKeyword_9()); 
            match(input,20,FOLLOW_20_in_rule__KanbanSchedulingSystem__Group__9__Impl1453); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:738:1: rule__KanbanSchedulingSystem__Group__10 : rule__KanbanSchedulingSystem__Group__10__Impl rule__KanbanSchedulingSystem__Group__11 ;
    public final void rule__KanbanSchedulingSystem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:742:1: ( rule__KanbanSchedulingSystem__Group__10__Impl rule__KanbanSchedulingSystem__Group__11 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:743:2: rule__KanbanSchedulingSystem__Group__10__Impl rule__KanbanSchedulingSystem__Group__11
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__10__Impl_in_rule__KanbanSchedulingSystem__Group__101484);
            rule__KanbanSchedulingSystem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__11_in_rule__KanbanSchedulingSystem__Group__101487);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:750:1: rule__KanbanSchedulingSystem__Group__10__Impl : ( ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:754:1: ( ( ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:755:1: ( ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:755:1: ( ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:756:1: ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssGovModelAssignment_10()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:757:1: ( rule__KanbanSchedulingSystem__KssGovModelAssignment_10 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:757:2: rule__KanbanSchedulingSystem__KssGovModelAssignment_10
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssGovModelAssignment_10_in_rule__KanbanSchedulingSystem__Group__10__Impl1514);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:767:1: rule__KanbanSchedulingSystem__Group__11 : rule__KanbanSchedulingSystem__Group__11__Impl rule__KanbanSchedulingSystem__Group__12 ;
    public final void rule__KanbanSchedulingSystem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:771:1: ( rule__KanbanSchedulingSystem__Group__11__Impl rule__KanbanSchedulingSystem__Group__12 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:772:2: rule__KanbanSchedulingSystem__Group__11__Impl rule__KanbanSchedulingSystem__Group__12
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__11__Impl_in_rule__KanbanSchedulingSystem__Group__111544);
            rule__KanbanSchedulingSystem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__12_in_rule__KanbanSchedulingSystem__Group__111547);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:779:1: rule__KanbanSchedulingSystem__Group__11__Impl : ( 'end GovernanceModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:783:1: ( ( 'end GovernanceModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:784:1: ( 'end GovernanceModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:784:1: ( 'end GovernanceModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:785:1: 'end GovernanceModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceModelKeyword_11()); 
            match(input,21,FOLLOW_21_in_rule__KanbanSchedulingSystem__Group__11__Impl1575); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:798:1: rule__KanbanSchedulingSystem__Group__12 : rule__KanbanSchedulingSystem__Group__12__Impl ;
    public final void rule__KanbanSchedulingSystem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:802:1: ( rule__KanbanSchedulingSystem__Group__12__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:803:2: rule__KanbanSchedulingSystem__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__12__Impl_in_rule__KanbanSchedulingSystem__Group__121606);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:809:1: rule__KanbanSchedulingSystem__Group__12__Impl : ( 'end KSSModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:813:1: ( ( 'end KSSModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:814:1: ( 'end KSSModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:814:1: ( 'end KSSModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:815:1: 'end KSSModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSModelKeyword_12()); 
            match(input,22,FOLLOW_22_in_rule__KanbanSchedulingSystem__Group__12__Impl1634); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:854:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:858:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:859:2: rule__Team__Group__0__Impl rule__Team__Group__1
            {
            pushFollow(FOLLOW_rule__Team__Group__0__Impl_in_rule__Team__Group__01691);
            rule__Team__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__1_in_rule__Team__Group__01694);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:866:1: rule__Team__Group__0__Impl : ( ( rule__Team__Alternatives_0 ) ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:870:1: ( ( ( rule__Team__Alternatives_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:871:1: ( ( rule__Team__Alternatives_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:871:1: ( ( rule__Team__Alternatives_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:872:1: ( rule__Team__Alternatives_0 )
            {
             before(grammarAccess.getTeamAccess().getAlternatives_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:873:1: ( rule__Team__Alternatives_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:873:2: rule__Team__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Team__Alternatives_0_in_rule__Team__Group__0__Impl1721);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:883:1: rule__Team__Group__1 : rule__Team__Group__1__Impl rule__Team__Group__2 ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:887:1: ( rule__Team__Group__1__Impl rule__Team__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:888:2: rule__Team__Group__1__Impl rule__Team__Group__2
            {
            pushFollow(FOLLOW_rule__Team__Group__1__Impl_in_rule__Team__Group__11751);
            rule__Team__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__2_in_rule__Team__Group__11754);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:895:1: rule__Team__Group__1__Impl : ( ( rule__Team__NameAssignment_1 ) ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:899:1: ( ( ( rule__Team__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:900:1: ( ( rule__Team__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:900:1: ( ( rule__Team__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:901:1: ( rule__Team__NameAssignment_1 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:902:1: ( rule__Team__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:902:2: rule__Team__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Team__NameAssignment_1_in_rule__Team__Group__1__Impl1781);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:912:1: rule__Team__Group__2 : rule__Team__Group__2__Impl rule__Team__Group__3 ;
    public final void rule__Team__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:916:1: ( rule__Team__Group__2__Impl rule__Team__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:917:2: rule__Team__Group__2__Impl rule__Team__Group__3
            {
            pushFollow(FOLLOW_rule__Team__Group__2__Impl_in_rule__Team__Group__21811);
            rule__Team__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__3_in_rule__Team__Group__21814);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:924:1: rule__Team__Group__2__Impl : ( '{' ) ;
    public final void rule__Team__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:928:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:929:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:929:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:930:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group__2__Impl1842); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:943:1: rule__Team__Group__3 : rule__Team__Group__3__Impl rule__Team__Group__4 ;
    public final void rule__Team__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:947:1: ( rule__Team__Group__3__Impl rule__Team__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:948:2: rule__Team__Group__3__Impl rule__Team__Group__4
            {
            pushFollow(FOLLOW_rule__Team__Group__3__Impl_in_rule__Team__Group__31873);
            rule__Team__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__4_in_rule__Team__Group__31876);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:955:1: rule__Team__Group__3__Impl : ( ( rule__Team__Group_3__0 )? ) ;
    public final void rule__Team__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:959:1: ( ( ( rule__Team__Group_3__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:960:1: ( ( rule__Team__Group_3__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:960:1: ( ( rule__Team__Group_3__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:961:1: ( rule__Team__Group_3__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:962:1: ( rule__Team__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:962:2: rule__Team__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_3__0_in_rule__Team__Group__3__Impl1903);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:972:1: rule__Team__Group__4 : rule__Team__Group__4__Impl rule__Team__Group__5 ;
    public final void rule__Team__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:976:1: ( rule__Team__Group__4__Impl rule__Team__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:977:2: rule__Team__Group__4__Impl rule__Team__Group__5
            {
            pushFollow(FOLLOW_rule__Team__Group__4__Impl_in_rule__Team__Group__41934);
            rule__Team__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__5_in_rule__Team__Group__41937);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:984:1: rule__Team__Group__4__Impl : ( ( rule__Team__Group_4__0 )? ) ;
    public final void rule__Team__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:988:1: ( ( ( rule__Team__Group_4__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:989:1: ( ( rule__Team__Group_4__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:989:1: ( ( rule__Team__Group_4__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:990:1: ( rule__Team__Group_4__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:991:1: ( rule__Team__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:991:2: rule__Team__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_4__0_in_rule__Team__Group__4__Impl1964);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1001:1: rule__Team__Group__5 : rule__Team__Group__5__Impl rule__Team__Group__6 ;
    public final void rule__Team__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1005:1: ( rule__Team__Group__5__Impl rule__Team__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1006:2: rule__Team__Group__5__Impl rule__Team__Group__6
            {
            pushFollow(FOLLOW_rule__Team__Group__5__Impl_in_rule__Team__Group__51995);
            rule__Team__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__6_in_rule__Team__Group__51998);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1013:1: rule__Team__Group__5__Impl : ( ( rule__Team__Group_5__0 )? ) ;
    public final void rule__Team__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1017:1: ( ( ( rule__Team__Group_5__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1018:1: ( ( rule__Team__Group_5__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1018:1: ( ( rule__Team__Group_5__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1019:1: ( rule__Team__Group_5__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_5()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1020:1: ( rule__Team__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1020:2: rule__Team__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_5__0_in_rule__Team__Group__5__Impl2025);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1030:1: rule__Team__Group__6 : rule__Team__Group__6__Impl rule__Team__Group__7 ;
    public final void rule__Team__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1034:1: ( rule__Team__Group__6__Impl rule__Team__Group__7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1035:2: rule__Team__Group__6__Impl rule__Team__Group__7
            {
            pushFollow(FOLLOW_rule__Team__Group__6__Impl_in_rule__Team__Group__62056);
            rule__Team__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__7_in_rule__Team__Group__62059);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1042:1: rule__Team__Group__6__Impl : ( ( rule__Team__Group_6__0 )? ) ;
    public final void rule__Team__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1046:1: ( ( ( rule__Team__Group_6__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1047:1: ( ( rule__Team__Group_6__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1047:1: ( ( rule__Team__Group_6__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1048:1: ( rule__Team__Group_6__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1049:1: ( rule__Team__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1049:2: rule__Team__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_6__0_in_rule__Team__Group__6__Impl2086);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1059:1: rule__Team__Group__7 : rule__Team__Group__7__Impl rule__Team__Group__8 ;
    public final void rule__Team__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1063:1: ( rule__Team__Group__7__Impl rule__Team__Group__8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1064:2: rule__Team__Group__7__Impl rule__Team__Group__8
            {
            pushFollow(FOLLOW_rule__Team__Group__7__Impl_in_rule__Team__Group__72117);
            rule__Team__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__8_in_rule__Team__Group__72120);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1071:1: rule__Team__Group__7__Impl : ( ( rule__Team__Group_7__0 )? ) ;
    public final void rule__Team__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1075:1: ( ( ( rule__Team__Group_7__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1076:1: ( ( rule__Team__Group_7__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1076:1: ( ( rule__Team__Group_7__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1077:1: ( rule__Team__Group_7__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_7()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1078:1: ( rule__Team__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1078:2: rule__Team__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_7__0_in_rule__Team__Group__7__Impl2147);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1088:1: rule__Team__Group__8 : rule__Team__Group__8__Impl ;
    public final void rule__Team__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1092:1: ( rule__Team__Group__8__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1093:2: rule__Team__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group__8__Impl_in_rule__Team__Group__82178);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1099:1: rule__Team__Group__8__Impl : ( '}' ) ;
    public final void rule__Team__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1103:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1104:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1104:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1105:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group__8__Impl2206); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1136:1: rule__Team__Group_3__0 : rule__Team__Group_3__0__Impl rule__Team__Group_3__1 ;
    public final void rule__Team__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1140:1: ( rule__Team__Group_3__0__Impl rule__Team__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1141:2: rule__Team__Group_3__0__Impl rule__Team__Group_3__1
            {
            pushFollow(FOLLOW_rule__Team__Group_3__0__Impl_in_rule__Team__Group_3__02255);
            rule__Team__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_3__1_in_rule__Team__Group_3__02258);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1148:1: rule__Team__Group_3__0__Impl : ( 'sourceUnits' ) ;
    public final void rule__Team__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1152:1: ( ( 'sourceUnits' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1153:1: ( 'sourceUnits' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1153:1: ( 'sourceUnits' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1154:1: 'sourceUnits'
            {
             before(grammarAccess.getTeamAccess().getSourceUnitsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Team__Group_3__0__Impl2286); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1167:1: rule__Team__Group_3__1 : rule__Team__Group_3__1__Impl rule__Team__Group_3__2 ;
    public final void rule__Team__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1171:1: ( rule__Team__Group_3__1__Impl rule__Team__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1172:2: rule__Team__Group_3__1__Impl rule__Team__Group_3__2
            {
            pushFollow(FOLLOW_rule__Team__Group_3__1__Impl_in_rule__Team__Group_3__12317);
            rule__Team__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_3__2_in_rule__Team__Group_3__12320);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1179:1: rule__Team__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1183:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1184:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1184:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1185:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_3__1__Impl2348); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1198:1: rule__Team__Group_3__2 : rule__Team__Group_3__2__Impl rule__Team__Group_3__3 ;
    public final void rule__Team__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1202:1: ( rule__Team__Group_3__2__Impl rule__Team__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1203:2: rule__Team__Group_3__2__Impl rule__Team__Group_3__3
            {
            pushFollow(FOLLOW_rule__Team__Group_3__2__Impl_in_rule__Team__Group_3__22379);
            rule__Team__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_3__3_in_rule__Team__Group_3__22382);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1210:1: rule__Team__Group_3__2__Impl : ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) ) ;
    public final void rule__Team__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1214:1: ( ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1215:1: ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1215:1: ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1216:1: ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1216:1: ( ( rule__Team__DemandUnitsAssignment_3_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1217:1: ( rule__Team__DemandUnitsAssignment_3_2 )
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1218:1: ( rule__Team__DemandUnitsAssignment_3_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1218:2: rule__Team__DemandUnitsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2411);
            rule__Team__DemandUnitsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1221:1: ( ( rule__Team__DemandUnitsAssignment_3_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1222:1: ( rule__Team__DemandUnitsAssignment_3_2 )*
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1223:1: ( rule__Team__DemandUnitsAssignment_3_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1223:2: rule__Team__DemandUnitsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2423);
            	    rule__Team__DemandUnitsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1234:1: rule__Team__Group_3__3 : rule__Team__Group_3__3__Impl ;
    public final void rule__Team__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1238:1: ( rule__Team__Group_3__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1239:2: rule__Team__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_3__3__Impl_in_rule__Team__Group_3__32456);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1245:1: rule__Team__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1249:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1250:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1250:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1251:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_3__3__Impl2484); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1272:1: rule__Team__Group_4__0 : rule__Team__Group_4__0__Impl rule__Team__Group_4__1 ;
    public final void rule__Team__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1276:1: ( rule__Team__Group_4__0__Impl rule__Team__Group_4__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1277:2: rule__Team__Group_4__0__Impl rule__Team__Group_4__1
            {
            pushFollow(FOLLOW_rule__Team__Group_4__0__Impl_in_rule__Team__Group_4__02523);
            rule__Team__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_4__1_in_rule__Team__Group_4__02526);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1284:1: rule__Team__Group_4__0__Impl : ( 'targetUnits' ) ;
    public final void rule__Team__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1288:1: ( ( 'targetUnits' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1289:1: ( 'targetUnits' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1289:1: ( 'targetUnits' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1290:1: 'targetUnits'
            {
             before(grammarAccess.getTeamAccess().getTargetUnitsKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Team__Group_4__0__Impl2554); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1303:1: rule__Team__Group_4__1 : rule__Team__Group_4__1__Impl rule__Team__Group_4__2 ;
    public final void rule__Team__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1307:1: ( rule__Team__Group_4__1__Impl rule__Team__Group_4__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1308:2: rule__Team__Group_4__1__Impl rule__Team__Group_4__2
            {
            pushFollow(FOLLOW_rule__Team__Group_4__1__Impl_in_rule__Team__Group_4__12585);
            rule__Team__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_4__2_in_rule__Team__Group_4__12588);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1315:1: rule__Team__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1319:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1320:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1320:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1321:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_4__1__Impl2616); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1334:1: rule__Team__Group_4__2 : rule__Team__Group_4__2__Impl rule__Team__Group_4__3 ;
    public final void rule__Team__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1338:1: ( rule__Team__Group_4__2__Impl rule__Team__Group_4__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1339:2: rule__Team__Group_4__2__Impl rule__Team__Group_4__3
            {
            pushFollow(FOLLOW_rule__Team__Group_4__2__Impl_in_rule__Team__Group_4__22647);
            rule__Team__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_4__3_in_rule__Team__Group_4__22650);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1346:1: rule__Team__Group_4__2__Impl : ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) ) ;
    public final void rule__Team__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1350:1: ( ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1351:1: ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1351:1: ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1352:1: ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1352:1: ( ( rule__Team__SourcedUnitsAssignment_4_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1353:1: ( rule__Team__SourcedUnitsAssignment_4_2 )
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1354:1: ( rule__Team__SourcedUnitsAssignment_4_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1354:2: rule__Team__SourcedUnitsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl2679);
            rule__Team__SourcedUnitsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1357:1: ( ( rule__Team__SourcedUnitsAssignment_4_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1358:1: ( rule__Team__SourcedUnitsAssignment_4_2 )*
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1359:1: ( rule__Team__SourcedUnitsAssignment_4_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1359:2: rule__Team__SourcedUnitsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl2691);
            	    rule__Team__SourcedUnitsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1370:1: rule__Team__Group_4__3 : rule__Team__Group_4__3__Impl ;
    public final void rule__Team__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1374:1: ( rule__Team__Group_4__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1375:2: rule__Team__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_4__3__Impl_in_rule__Team__Group_4__32724);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1381:1: rule__Team__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1385:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1386:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1386:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1387:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_4__3__Impl2752); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1408:1: rule__Team__Group_5__0 : rule__Team__Group_5__0__Impl rule__Team__Group_5__1 ;
    public final void rule__Team__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1412:1: ( rule__Team__Group_5__0__Impl rule__Team__Group_5__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1413:2: rule__Team__Group_5__0__Impl rule__Team__Group_5__1
            {
            pushFollow(FOLLOW_rule__Team__Group_5__0__Impl_in_rule__Team__Group_5__02791);
            rule__Team__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_5__1_in_rule__Team__Group_5__02794);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1420:1: rule__Team__Group_5__0__Impl : ( 'contains' ) ;
    public final void rule__Team__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1424:1: ( ( 'contains' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1425:1: ( 'contains' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1425:1: ( 'contains' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1426:1: 'contains'
            {
             before(grammarAccess.getTeamAccess().getContainsKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__Team__Group_5__0__Impl2822); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1439:1: rule__Team__Group_5__1 : rule__Team__Group_5__1__Impl rule__Team__Group_5__2 ;
    public final void rule__Team__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1443:1: ( rule__Team__Group_5__1__Impl rule__Team__Group_5__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1444:2: rule__Team__Group_5__1__Impl rule__Team__Group_5__2
            {
            pushFollow(FOLLOW_rule__Team__Group_5__1__Impl_in_rule__Team__Group_5__12853);
            rule__Team__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_5__2_in_rule__Team__Group_5__12856);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1451:1: rule__Team__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1455:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1456:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1456:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1457:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_5__1__Impl2884); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1470:1: rule__Team__Group_5__2 : rule__Team__Group_5__2__Impl rule__Team__Group_5__3 ;
    public final void rule__Team__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1474:1: ( rule__Team__Group_5__2__Impl rule__Team__Group_5__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1475:2: rule__Team__Group_5__2__Impl rule__Team__Group_5__3
            {
            pushFollow(FOLLOW_rule__Team__Group_5__2__Impl_in_rule__Team__Group_5__22915);
            rule__Team__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_5__3_in_rule__Team__Group_5__22918);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1482:1: rule__Team__Group_5__2__Impl : ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) ) ;
    public final void rule__Team__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1486:1: ( ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1487:1: ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1487:1: ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1488:1: ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1488:1: ( ( rule__Team__GroupmembersAssignment_5_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1489:1: ( rule__Team__GroupmembersAssignment_5_2 )
            {
             before(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1490:1: ( rule__Team__GroupmembersAssignment_5_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1490:2: rule__Team__GroupmembersAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl2947);
            rule__Team__GroupmembersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1493:1: ( ( rule__Team__GroupmembersAssignment_5_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1494:1: ( rule__Team__GroupmembersAssignment_5_2 )*
            {
             before(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1495:1: ( rule__Team__GroupmembersAssignment_5_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1495:2: rule__Team__GroupmembersAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl2959);
            	    rule__Team__GroupmembersAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1506:1: rule__Team__Group_5__3 : rule__Team__Group_5__3__Impl ;
    public final void rule__Team__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1510:1: ( rule__Team__Group_5__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1511:2: rule__Team__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_5__3__Impl_in_rule__Team__Group_5__32992);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1517:1: rule__Team__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1521:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1522:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1522:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1523:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_5__3__Impl3020); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1544:1: rule__Team__Group_6__0 : rule__Team__Group_6__0__Impl rule__Team__Group_6__1 ;
    public final void rule__Team__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1548:1: ( rule__Team__Group_6__0__Impl rule__Team__Group_6__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1549:2: rule__Team__Group_6__0__Impl rule__Team__Group_6__1
            {
            pushFollow(FOLLOW_rule__Team__Group_6__0__Impl_in_rule__Team__Group_6__03059);
            rule__Team__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_6__1_in_rule__Team__Group_6__03062);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1556:1: rule__Team__Group_6__0__Impl : ( 'resources' ) ;
    public final void rule__Team__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1560:1: ( ( 'resources' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1561:1: ( 'resources' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1561:1: ( 'resources' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1562:1: 'resources'
            {
             before(grammarAccess.getTeamAccess().getResourcesKeyword_6_0()); 
            match(input,28,FOLLOW_28_in_rule__Team__Group_6__0__Impl3090); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1575:1: rule__Team__Group_6__1 : rule__Team__Group_6__1__Impl rule__Team__Group_6__2 ;
    public final void rule__Team__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1579:1: ( rule__Team__Group_6__1__Impl rule__Team__Group_6__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1580:2: rule__Team__Group_6__1__Impl rule__Team__Group_6__2
            {
            pushFollow(FOLLOW_rule__Team__Group_6__1__Impl_in_rule__Team__Group_6__13121);
            rule__Team__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_6__2_in_rule__Team__Group_6__13124);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1587:1: rule__Team__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1591:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1592:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1592:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1593:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_6__1__Impl3152); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1606:1: rule__Team__Group_6__2 : rule__Team__Group_6__2__Impl rule__Team__Group_6__3 ;
    public final void rule__Team__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1610:1: ( rule__Team__Group_6__2__Impl rule__Team__Group_6__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1611:2: rule__Team__Group_6__2__Impl rule__Team__Group_6__3
            {
            pushFollow(FOLLOW_rule__Team__Group_6__2__Impl_in_rule__Team__Group_6__23183);
            rule__Team__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_6__3_in_rule__Team__Group_6__23186);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1618:1: rule__Team__Group_6__2__Impl : ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) ) ;
    public final void rule__Team__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1622:1: ( ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1623:1: ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1623:1: ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1624:1: ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1624:1: ( ( rule__Team__ResourcesAssignment_6_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1625:1: ( rule__Team__ResourcesAssignment_6_2 )
            {
             before(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1626:1: ( rule__Team__ResourcesAssignment_6_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1626:2: rule__Team__ResourcesAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl3215);
            rule__Team__ResourcesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1629:1: ( ( rule__Team__ResourcesAssignment_6_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1630:1: ( rule__Team__ResourcesAssignment_6_2 )*
            {
             before(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1631:1: ( rule__Team__ResourcesAssignment_6_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1631:2: rule__Team__ResourcesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl3227);
            	    rule__Team__ResourcesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1642:1: rule__Team__Group_6__3 : rule__Team__Group_6__3__Impl ;
    public final void rule__Team__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1646:1: ( rule__Team__Group_6__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1647:2: rule__Team__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_6__3__Impl_in_rule__Team__Group_6__33260);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1653:1: rule__Team__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1657:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1658:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1658:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1659:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_6__3__Impl3288); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1680:1: rule__Team__Group_7__0 : rule__Team__Group_7__0__Impl rule__Team__Group_7__1 ;
    public final void rule__Team__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1684:1: ( rule__Team__Group_7__0__Impl rule__Team__Group_7__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1685:2: rule__Team__Group_7__0__Impl rule__Team__Group_7__1
            {
            pushFollow(FOLLOW_rule__Team__Group_7__0__Impl_in_rule__Team__Group_7__03327);
            rule__Team__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_7__1_in_rule__Team__Group_7__03330);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1692:1: rule__Team__Group_7__0__Impl : ( 'services' ) ;
    public final void rule__Team__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1696:1: ( ( 'services' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1697:1: ( 'services' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1697:1: ( 'services' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1698:1: 'services'
            {
             before(grammarAccess.getTeamAccess().getServicesKeyword_7_0()); 
            match(input,29,FOLLOW_29_in_rule__Team__Group_7__0__Impl3358); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1711:1: rule__Team__Group_7__1 : rule__Team__Group_7__1__Impl rule__Team__Group_7__2 ;
    public final void rule__Team__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1715:1: ( rule__Team__Group_7__1__Impl rule__Team__Group_7__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1716:2: rule__Team__Group_7__1__Impl rule__Team__Group_7__2
            {
            pushFollow(FOLLOW_rule__Team__Group_7__1__Impl_in_rule__Team__Group_7__13389);
            rule__Team__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_7__2_in_rule__Team__Group_7__13392);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1723:1: rule__Team__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1727:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1728:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1728:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1729:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_7__1__Impl3420); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1742:1: rule__Team__Group_7__2 : rule__Team__Group_7__2__Impl rule__Team__Group_7__3 ;
    public final void rule__Team__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1746:1: ( rule__Team__Group_7__2__Impl rule__Team__Group_7__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1747:2: rule__Team__Group_7__2__Impl rule__Team__Group_7__3
            {
            pushFollow(FOLLOW_rule__Team__Group_7__2__Impl_in_rule__Team__Group_7__23451);
            rule__Team__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_7__3_in_rule__Team__Group_7__23454);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1754:1: rule__Team__Group_7__2__Impl : ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) ) ;
    public final void rule__Team__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1758:1: ( ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1759:1: ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1759:1: ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1760:1: ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1760:1: ( ( rule__Team__ServicesAssignment_7_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1761:1: ( rule__Team__ServicesAssignment_7_2 )
            {
             before(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1762:1: ( rule__Team__ServicesAssignment_7_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1762:2: rule__Team__ServicesAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl3483);
            rule__Team__ServicesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1765:1: ( ( rule__Team__ServicesAssignment_7_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1766:1: ( rule__Team__ServicesAssignment_7_2 )*
            {
             before(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1767:1: ( rule__Team__ServicesAssignment_7_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1767:2: rule__Team__ServicesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl3495);
            	    rule__Team__ServicesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1778:1: rule__Team__Group_7__3 : rule__Team__Group_7__3__Impl ;
    public final void rule__Team__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1782:1: ( rule__Team__Group_7__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1783:2: rule__Team__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_7__3__Impl_in_rule__Team__Group_7__33528);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1789:1: rule__Team__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1793:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1794:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1794:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1795:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_7__3__Impl3556); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1816:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1820:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1821:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__03595);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__03598);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1828:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1832:1: ( ( 'service' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1833:1: ( 'service' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1833:1: ( 'service' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1834:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Service__Group__0__Impl3626); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1847:1: rule__Service__Group__1 : rule__Service__Group__1__Impl ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1851:1: ( rule__Service__Group__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1852:2: rule__Service__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__13657);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1858:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1862:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1863:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1863:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1864:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1865:1: ( rule__Service__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1865:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl3684);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1879:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1883:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1884:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03718);
            rule__Asset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03721);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1891:1: rule__Asset__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1895:1: ( ( 'resource' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1896:1: ( 'resource' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1896:1: ( 'resource' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1897:1: 'resource'
            {
             before(grammarAccess.getAssetAccess().getResourceKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Asset__Group__0__Impl3749); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1910:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl rule__Asset__Group__2 ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1914:1: ( rule__Asset__Group__1__Impl rule__Asset__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1915:2: rule__Asset__Group__1__Impl rule__Asset__Group__2
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13780);
            rule__Asset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13783);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1922:1: rule__Asset__Group__1__Impl : ( ( rule__Asset__NameAssignment_1 ) ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1926:1: ( ( ( rule__Asset__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1927:1: ( ( rule__Asset__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1927:1: ( ( rule__Asset__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1928:1: ( rule__Asset__NameAssignment_1 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1929:1: ( rule__Asset__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1929:2: rule__Asset__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl3810);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1939:1: rule__Asset__Group__2 : rule__Asset__Group__2__Impl ;
    public final void rule__Asset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1943:1: ( rule__Asset__Group__2__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1944:2: rule__Asset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23840);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1950:1: rule__Asset__Group__2__Impl : ( ( rule__Asset__Group_2__0 )? ) ;
    public final void rule__Asset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1954:1: ( ( ( rule__Asset__Group_2__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1955:1: ( ( rule__Asset__Group_2__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1955:1: ( ( rule__Asset__Group_2__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1956:1: ( rule__Asset__Group_2__0 )?
            {
             before(grammarAccess.getAssetAccess().getGroup_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1957:1: ( rule__Asset__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1957:2: rule__Asset__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl3867);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1973:1: rule__Asset__Group_2__0 : rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 ;
    public final void rule__Asset__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1977:1: ( rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1978:2: rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__03904);
            rule__Asset__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__03907);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1985:1: rule__Asset__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Asset__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1989:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1990:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1990:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1991:1: '{'
            {
             before(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Asset__Group_2__0__Impl3935); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2004:1: rule__Asset__Group_2__1 : rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2 ;
    public final void rule__Asset__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2008:1: ( rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2009:2: rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__13966);
            rule__Asset__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__2_in_rule__Asset__Group_2__13969);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2016:1: rule__Asset__Group_2__1__Impl : ( 'skills' ) ;
    public final void rule__Asset__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2020:1: ( ( 'skills' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2021:1: ( 'skills' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2021:1: ( 'skills' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2022:1: 'skills'
            {
             before(grammarAccess.getAssetAccess().getSkillsKeyword_2_1()); 
            match(input,32,FOLLOW_32_in_rule__Asset__Group_2__1__Impl3997); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2035:1: rule__Asset__Group_2__2 : rule__Asset__Group_2__2__Impl rule__Asset__Group_2__3 ;
    public final void rule__Asset__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2039:1: ( rule__Asset__Group_2__2__Impl rule__Asset__Group_2__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2040:2: rule__Asset__Group_2__2__Impl rule__Asset__Group_2__3
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__2__Impl_in_rule__Asset__Group_2__24028);
            rule__Asset__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__3_in_rule__Asset__Group_2__24031);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2047:1: rule__Asset__Group_2__2__Impl : ( '{' ) ;
    public final void rule__Asset__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2051:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2052:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2052:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2053:1: '{'
            {
             before(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__Asset__Group_2__2__Impl4059); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2066:1: rule__Asset__Group_2__3 : rule__Asset__Group_2__3__Impl rule__Asset__Group_2__4 ;
    public final void rule__Asset__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2070:1: ( rule__Asset__Group_2__3__Impl rule__Asset__Group_2__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2071:2: rule__Asset__Group_2__3__Impl rule__Asset__Group_2__4
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__3__Impl_in_rule__Asset__Group_2__34090);
            rule__Asset__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__4_in_rule__Asset__Group_2__34093);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2078:1: rule__Asset__Group_2__3__Impl : ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) ) ;
    public final void rule__Asset__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2082:1: ( ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2083:1: ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2083:1: ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2084:1: ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2084:1: ( ( rule__Asset__HasSkillsAssignment_2_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2085:1: ( rule__Asset__HasSkillsAssignment_2_3 )
            {
             before(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2086:1: ( rule__Asset__HasSkillsAssignment_2_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2086:2: rule__Asset__HasSkillsAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl4122);
            rule__Asset__HasSkillsAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2089:1: ( ( rule__Asset__HasSkillsAssignment_2_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2090:1: ( rule__Asset__HasSkillsAssignment_2_3 )*
            {
             before(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2091:1: ( rule__Asset__HasSkillsAssignment_2_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2091:2: rule__Asset__HasSkillsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl4134);
            	    rule__Asset__HasSkillsAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2102:1: rule__Asset__Group_2__4 : rule__Asset__Group_2__4__Impl rule__Asset__Group_2__5 ;
    public final void rule__Asset__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2106:1: ( rule__Asset__Group_2__4__Impl rule__Asset__Group_2__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2107:2: rule__Asset__Group_2__4__Impl rule__Asset__Group_2__5
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__4__Impl_in_rule__Asset__Group_2__44167);
            rule__Asset__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__5_in_rule__Asset__Group_2__44170);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2114:1: rule__Asset__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Asset__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2118:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2119:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2119:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2120:1: '}'
            {
             before(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,24,FOLLOW_24_in_rule__Asset__Group_2__4__Impl4198); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2133:1: rule__Asset__Group_2__5 : rule__Asset__Group_2__5__Impl ;
    public final void rule__Asset__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2137:1: ( rule__Asset__Group_2__5__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2138:2: rule__Asset__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__5__Impl_in_rule__Asset__Group_2__54229);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2144:1: rule__Asset__Group_2__5__Impl : ( '}' ) ;
    public final void rule__Asset__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2148:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2149:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2149:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2150:1: '}'
            {
             before(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,24,FOLLOW_24_in_rule__Asset__Group_2__5__Impl4257); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2175:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2179:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2180:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__04300);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__04303);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2187:1: rule__Dependency__Group__0__Impl : ( ( rule__Dependency__SourceTaskAssignment_0 ) ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2191:1: ( ( ( rule__Dependency__SourceTaskAssignment_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2192:1: ( ( rule__Dependency__SourceTaskAssignment_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2192:1: ( ( rule__Dependency__SourceTaskAssignment_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2193:1: ( rule__Dependency__SourceTaskAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getSourceTaskAssignment_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2194:1: ( rule__Dependency__SourceTaskAssignment_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2194:2: rule__Dependency__SourceTaskAssignment_0
            {
            pushFollow(FOLLOW_rule__Dependency__SourceTaskAssignment_0_in_rule__Dependency__Group__0__Impl4330);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2204:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2208:1: ( rule__Dependency__Group__1__Impl rule__Dependency__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2209:2: rule__Dependency__Group__1__Impl rule__Dependency__Group__2
            {
            pushFollow(FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__14360);
            rule__Dependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__14363);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2216:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__Alternatives_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2220:1: ( ( ( rule__Dependency__Alternatives_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2221:1: ( ( rule__Dependency__Alternatives_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2221:1: ( ( rule__Dependency__Alternatives_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2222:1: ( rule__Dependency__Alternatives_1 )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2223:1: ( rule__Dependency__Alternatives_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2223:2: rule__Dependency__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Dependency__Alternatives_1_in_rule__Dependency__Group__1__Impl4390);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2233:1: rule__Dependency__Group__2 : rule__Dependency__Group__2__Impl ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2237:1: ( rule__Dependency__Group__2__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2238:2: rule__Dependency__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__24420);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2244:1: rule__Dependency__Group__2__Impl : ( ( rule__Dependency__TargetTaskAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2248:1: ( ( ( rule__Dependency__TargetTaskAssignment_2 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2249:1: ( ( rule__Dependency__TargetTaskAssignment_2 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2249:1: ( ( rule__Dependency__TargetTaskAssignment_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2250:1: ( rule__Dependency__TargetTaskAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getTargetTaskAssignment_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2251:1: ( rule__Dependency__TargetTaskAssignment_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2251:2: rule__Dependency__TargetTaskAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__TargetTaskAssignment_2_in_rule__Dependency__Group__2__Impl4447);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2267:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2271:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2272:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__04483);
            rule__Requirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__04486);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2279:1: rule__Requirement__Group__0__Impl : ( 'requirement' ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2283:1: ( ( 'requirement' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2284:1: ( 'requirement' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2284:1: ( 'requirement' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2285:1: 'requirement'
            {
             before(grammarAccess.getRequirementAccess().getRequirementKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Requirement__Group__0__Impl4514); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2298:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2302:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2303:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__14545);
            rule__Requirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__14548);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2310:1: rule__Requirement__Group__1__Impl : ( ( rule__Requirement__NameAssignment_1 ) ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2314:1: ( ( ( rule__Requirement__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2315:1: ( ( rule__Requirement__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2315:1: ( ( rule__Requirement__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2316:1: ( rule__Requirement__NameAssignment_1 )
            {
             before(grammarAccess.getRequirementAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2317:1: ( rule__Requirement__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2317:2: rule__Requirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Requirement__NameAssignment_1_in_rule__Requirement__Group__1__Impl4575);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2327:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl rule__Requirement__Group__3 ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2331:1: ( rule__Requirement__Group__2__Impl rule__Requirement__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2332:2: rule__Requirement__Group__2__Impl rule__Requirement__Group__3
            {
            pushFollow(FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__24605);
            rule__Requirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__24608);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2339:1: rule__Requirement__Group__2__Impl : ( '{' ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2343:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2344:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2344:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2345:1: '{'
            {
             before(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Requirement__Group__2__Impl4636); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2358:1: rule__Requirement__Group__3 : rule__Requirement__Group__3__Impl rule__Requirement__Group__4 ;
    public final void rule__Requirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2362:1: ( rule__Requirement__Group__3__Impl rule__Requirement__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2363:2: rule__Requirement__Group__3__Impl rule__Requirement__Group__4
            {
            pushFollow(FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__34667);
            rule__Requirement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__4_in_rule__Requirement__Group__34670);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2370:1: rule__Requirement__Group__3__Impl : ( ( rule__Requirement__Group_3__0 ) ) ;
    public final void rule__Requirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2374:1: ( ( ( rule__Requirement__Group_3__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2375:1: ( ( rule__Requirement__Group_3__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2375:1: ( ( rule__Requirement__Group_3__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2376:1: ( rule__Requirement__Group_3__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2377:1: ( rule__Requirement__Group_3__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2377:2: rule__Requirement__Group_3__0
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl4697);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2387:1: rule__Requirement__Group__4 : rule__Requirement__Group__4__Impl rule__Requirement__Group__5 ;
    public final void rule__Requirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2391:1: ( rule__Requirement__Group__4__Impl rule__Requirement__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2392:2: rule__Requirement__Group__4__Impl rule__Requirement__Group__5
            {
            pushFollow(FOLLOW_rule__Requirement__Group__4__Impl_in_rule__Requirement__Group__44727);
            rule__Requirement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__5_in_rule__Requirement__Group__44730);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2399:1: rule__Requirement__Group__4__Impl : ( ( rule__Requirement__Group_4__0 )? ) ;
    public final void rule__Requirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2403:1: ( ( ( rule__Requirement__Group_4__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2404:1: ( ( rule__Requirement__Group_4__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2404:1: ( ( rule__Requirement__Group_4__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2405:1: ( rule__Requirement__Group_4__0 )?
            {
             before(grammarAccess.getRequirementAccess().getGroup_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2406:1: ( rule__Requirement__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2406:2: rule__Requirement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Requirement__Group_4__0_in_rule__Requirement__Group__4__Impl4757);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2416:1: rule__Requirement__Group__5 : rule__Requirement__Group__5__Impl ;
    public final void rule__Requirement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2420:1: ( rule__Requirement__Group__5__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2421:2: rule__Requirement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group__5__Impl_in_rule__Requirement__Group__54788);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2427:1: rule__Requirement__Group__5__Impl : ( '}' ) ;
    public final void rule__Requirement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2431:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2432:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2432:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2433:1: '}'
            {
             before(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Requirement__Group__5__Impl4816); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2458:1: rule__Requirement__Group_3__0 : rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 ;
    public final void rule__Requirement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2462:1: ( rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2463:2: rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__04859);
            rule__Requirement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__04862);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2470:1: rule__Requirement__Group_3__0__Impl : ( 'workItems' ) ;
    public final void rule__Requirement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2474:1: ( ( 'workItems' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2475:1: ( 'workItems' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2475:1: ( 'workItems' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2476:1: 'workItems'
            {
             before(grammarAccess.getRequirementAccess().getWorkItemsKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Requirement__Group_3__0__Impl4890); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2489:1: rule__Requirement__Group_3__1 : rule__Requirement__Group_3__1__Impl rule__Requirement__Group_3__2 ;
    public final void rule__Requirement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2493:1: ( rule__Requirement__Group_3__1__Impl rule__Requirement__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2494:2: rule__Requirement__Group_3__1__Impl rule__Requirement__Group_3__2
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__14921);
            rule__Requirement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__2_in_rule__Requirement__Group_3__14924);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2501:1: rule__Requirement__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Requirement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2505:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2506:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2506:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2507:1: '{'
            {
             before(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,23,FOLLOW_23_in_rule__Requirement__Group_3__1__Impl4952); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2520:1: rule__Requirement__Group_3__2 : rule__Requirement__Group_3__2__Impl rule__Requirement__Group_3__3 ;
    public final void rule__Requirement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2524:1: ( rule__Requirement__Group_3__2__Impl rule__Requirement__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2525:2: rule__Requirement__Group_3__2__Impl rule__Requirement__Group_3__3
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__2__Impl_in_rule__Requirement__Group_3__24983);
            rule__Requirement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__3_in_rule__Requirement__Group_3__24986);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2532:1: rule__Requirement__Group_3__2__Impl : ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) ) ;
    public final void rule__Requirement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2536:1: ( ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2537:1: ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2537:1: ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2538:1: ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2538:1: ( ( rule__Requirement__RTasksAssignment_3_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2539:1: ( rule__Requirement__RTasksAssignment_3_2 )
            {
             before(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2540:1: ( rule__Requirement__RTasksAssignment_3_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2540:2: rule__Requirement__RTasksAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl5015);
            rule__Requirement__RTasksAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2543:1: ( ( rule__Requirement__RTasksAssignment_3_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2544:1: ( rule__Requirement__RTasksAssignment_3_2 )*
            {
             before(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2545:1: ( rule__Requirement__RTasksAssignment_3_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2545:2: rule__Requirement__RTasksAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl5027);
            	    rule__Requirement__RTasksAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2556:1: rule__Requirement__Group_3__3 : rule__Requirement__Group_3__3__Impl ;
    public final void rule__Requirement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2560:1: ( rule__Requirement__Group_3__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2561:2: rule__Requirement__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__3__Impl_in_rule__Requirement__Group_3__35060);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2567:1: rule__Requirement__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Requirement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2571:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2572:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2572:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2573:1: '}'
            {
             before(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,24,FOLLOW_24_in_rule__Requirement__Group_3__3__Impl5088); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2594:1: rule__Requirement__Group_4__0 : rule__Requirement__Group_4__0__Impl rule__Requirement__Group_4__1 ;
    public final void rule__Requirement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2598:1: ( rule__Requirement__Group_4__0__Impl rule__Requirement__Group_4__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2599:2: rule__Requirement__Group_4__0__Impl rule__Requirement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group_4__0__Impl_in_rule__Requirement__Group_4__05127);
            rule__Requirement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_4__1_in_rule__Requirement__Group_4__05130);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2606:1: rule__Requirement__Group_4__0__Impl : ( 'workItemNetwork' ) ;
    public final void rule__Requirement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2610:1: ( ( 'workItemNetwork' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2611:1: ( 'workItemNetwork' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2611:1: ( 'workItemNetwork' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2612:1: 'workItemNetwork'
            {
             before(grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__Requirement__Group_4__0__Impl5158); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2625:1: rule__Requirement__Group_4__1 : rule__Requirement__Group_4__1__Impl ;
    public final void rule__Requirement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2629:1: ( rule__Requirement__Group_4__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2630:2: rule__Requirement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group_4__1__Impl_in_rule__Requirement__Group_4__15189);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2636:1: rule__Requirement__Group_4__1__Impl : ( ( rule__Requirement__DependenciesAssignment_4_1 )* ) ;
    public final void rule__Requirement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2640:1: ( ( ( rule__Requirement__DependenciesAssignment_4_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2641:1: ( ( rule__Requirement__DependenciesAssignment_4_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2641:1: ( ( rule__Requirement__DependenciesAssignment_4_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2642:1: ( rule__Requirement__DependenciesAssignment_4_1 )*
            {
             before(grammarAccess.getRequirementAccess().getDependenciesAssignment_4_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2643:1: ( rule__Requirement__DependenciesAssignment_4_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2643:2: rule__Requirement__DependenciesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Requirement__DependenciesAssignment_4_1_in_rule__Requirement__Group_4__1__Impl5216);
            	    rule__Requirement__DependenciesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2657:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2661:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2662:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__05251);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05254);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2669:1: rule__Task__Group__0__Impl : ( 'workItem' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2673:1: ( ( 'workItem' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2674:1: ( 'workItem' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2674:1: ( 'workItem' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2675:1: 'workItem'
            {
             before(grammarAccess.getTaskAccess().getWorkItemKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Task__Group__0__Impl5282); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2688:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2692:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2693:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__15313);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__2_in_rule__Task__Group__15316);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2700:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2704:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2705:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2705:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2706:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2707:1: ( rule__Task__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2707:2: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl5343);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2717:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2721:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2722:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_rule__Task__Group__2__Impl_in_rule__Task__Group__25373);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__3_in_rule__Task__Group__25376);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2729:1: rule__Task__Group__2__Impl : ( '{' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2733:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2734:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2734:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2735:1: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Task__Group__2__Impl5404); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2748:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2752:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2753:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_rule__Task__Group__3__Impl_in_rule__Task__Group__35435);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__4_in_rule__Task__Group__35438);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2760:1: rule__Task__Group__3__Impl : ( ( rule__Task__Group_3__0 )? ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2764:1: ( ( ( rule__Task__Group_3__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2765:1: ( ( rule__Task__Group_3__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2765:1: ( ( rule__Task__Group_3__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2766:1: ( rule__Task__Group_3__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2767:1: ( rule__Task__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2767:2: rule__Task__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_3__0_in_rule__Task__Group__3__Impl5465);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2777:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2781:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2782:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_rule__Task__Group__4__Impl_in_rule__Task__Group__45496);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__5_in_rule__Task__Group__45499);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2789:1: rule__Task__Group__4__Impl : ( ( rule__Task__Group_4__0 )? ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2793:1: ( ( ( rule__Task__Group_4__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2794:1: ( ( rule__Task__Group_4__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2794:1: ( ( rule__Task__Group_4__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2795:1: ( rule__Task__Group_4__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2796:1: ( rule__Task__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2796:2: rule__Task__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_4__0_in_rule__Task__Group__4__Impl5526);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2806:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2810:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2811:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_rule__Task__Group__5__Impl_in_rule__Task__Group__55557);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__6_in_rule__Task__Group__55560);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2818:1: rule__Task__Group__5__Impl : ( ( rule__Task__Group_5__0 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2822:1: ( ( ( rule__Task__Group_5__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2823:1: ( ( rule__Task__Group_5__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2823:1: ( ( rule__Task__Group_5__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2824:1: ( rule__Task__Group_5__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_5()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2825:1: ( rule__Task__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2825:2: rule__Task__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_5__0_in_rule__Task__Group__5__Impl5587);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2835:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2839:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2840:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_rule__Task__Group__6__Impl_in_rule__Task__Group__65618);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__7_in_rule__Task__Group__65621);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2847:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2851:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2852:1: ( ( rule__Task__Group_6__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2852:1: ( ( rule__Task__Group_6__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2853:1: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2854:1: ( rule__Task__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2854:2: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_6__0_in_rule__Task__Group__6__Impl5648);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2864:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2868:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2869:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_rule__Task__Group__7__Impl_in_rule__Task__Group__75679);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__8_in_rule__Task__Group__75682);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2876:1: rule__Task__Group__7__Impl : ( ( rule__Task__Group_7__0 )? ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2880:1: ( ( ( rule__Task__Group_7__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2881:1: ( ( rule__Task__Group_7__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2881:1: ( ( rule__Task__Group_7__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2882:1: ( rule__Task__Group_7__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_7()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2883:1: ( rule__Task__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2883:2: rule__Task__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_7__0_in_rule__Task__Group__7__Impl5709);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2893:1: rule__Task__Group__8 : rule__Task__Group__8__Impl ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2897:1: ( rule__Task__Group__8__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2898:2: rule__Task__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group__8__Impl_in_rule__Task__Group__85740);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2904:1: rule__Task__Group__8__Impl : ( '}' ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2908:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2909:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2909:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2910:1: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__Task__Group__8__Impl5768); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2941:1: rule__Task__Group_3__0 : rule__Task__Group_3__0__Impl rule__Task__Group_3__1 ;
    public final void rule__Task__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2945:1: ( rule__Task__Group_3__0__Impl rule__Task__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2946:2: rule__Task__Group_3__0__Impl rule__Task__Group_3__1
            {
            pushFollow(FOLLOW_rule__Task__Group_3__0__Impl_in_rule__Task__Group_3__05817);
            rule__Task__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_3__1_in_rule__Task__Group_3__05820);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2953:1: rule__Task__Group_3__0__Impl : ( 'subtasks' ) ;
    public final void rule__Task__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2957:1: ( ( 'subtasks' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2958:1: ( 'subtasks' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2958:1: ( 'subtasks' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2959:1: 'subtasks'
            {
             before(grammarAccess.getTaskAccess().getSubtasksKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__Task__Group_3__0__Impl5848); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2972:1: rule__Task__Group_3__1 : rule__Task__Group_3__1__Impl rule__Task__Group_3__2 ;
    public final void rule__Task__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2976:1: ( rule__Task__Group_3__1__Impl rule__Task__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2977:2: rule__Task__Group_3__1__Impl rule__Task__Group_3__2
            {
            pushFollow(FOLLOW_rule__Task__Group_3__1__Impl_in_rule__Task__Group_3__15879);
            rule__Task__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_3__2_in_rule__Task__Group_3__15882);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2984:1: rule__Task__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Task__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2988:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2989:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2989:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2990:1: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,23,FOLLOW_23_in_rule__Task__Group_3__1__Impl5910); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3003:1: rule__Task__Group_3__2 : rule__Task__Group_3__2__Impl rule__Task__Group_3__3 ;
    public final void rule__Task__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3007:1: ( rule__Task__Group_3__2__Impl rule__Task__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3008:2: rule__Task__Group_3__2__Impl rule__Task__Group_3__3
            {
            pushFollow(FOLLOW_rule__Task__Group_3__2__Impl_in_rule__Task__Group_3__25941);
            rule__Task__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_3__3_in_rule__Task__Group_3__25944);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3015:1: rule__Task__Group_3__2__Impl : ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) ) ;
    public final void rule__Task__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3019:1: ( ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3020:1: ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3020:1: ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3021:1: ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3021:1: ( ( rule__Task__STasksAssignment_3_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3022:1: ( rule__Task__STasksAssignment_3_2 )
            {
             before(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3023:1: ( rule__Task__STasksAssignment_3_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3023:2: rule__Task__STasksAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl5973);
            rule__Task__STasksAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3026:1: ( ( rule__Task__STasksAssignment_3_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3027:1: ( rule__Task__STasksAssignment_3_2 )*
            {
             before(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3028:1: ( rule__Task__STasksAssignment_3_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3028:2: rule__Task__STasksAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl5985);
            	    rule__Task__STasksAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3039:1: rule__Task__Group_3__3 : rule__Task__Group_3__3__Impl ;
    public final void rule__Task__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3043:1: ( rule__Task__Group_3__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3044:2: rule__Task__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_3__3__Impl_in_rule__Task__Group_3__36018);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3050:1: rule__Task__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Task__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3054:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3055:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3055:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3056:1: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,24,FOLLOW_24_in_rule__Task__Group_3__3__Impl6046); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3077:1: rule__Task__Group_4__0 : rule__Task__Group_4__0__Impl rule__Task__Group_4__1 ;
    public final void rule__Task__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3081:1: ( rule__Task__Group_4__0__Impl rule__Task__Group_4__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3082:2: rule__Task__Group_4__0__Impl rule__Task__Group_4__1
            {
            pushFollow(FOLLOW_rule__Task__Group_4__0__Impl_in_rule__Task__Group_4__06085);
            rule__Task__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_4__1_in_rule__Task__Group_4__06088);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3089:1: rule__Task__Group_4__0__Impl : ( 'taskDependencies' ) ;
    public final void rule__Task__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3093:1: ( ( 'taskDependencies' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3094:1: ( 'taskDependencies' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3094:1: ( 'taskDependencies' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3095:1: 'taskDependencies'
            {
             before(grammarAccess.getTaskAccess().getTaskDependenciesKeyword_4_0()); 
            match(input,38,FOLLOW_38_in_rule__Task__Group_4__0__Impl6116); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3108:1: rule__Task__Group_4__1 : rule__Task__Group_4__1__Impl ;
    public final void rule__Task__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3112:1: ( rule__Task__Group_4__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3113:2: rule__Task__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_4__1__Impl_in_rule__Task__Group_4__16147);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3119:1: rule__Task__Group_4__1__Impl : ( ( rule__Task__TaskDependenciesAssignment_4_1 )* ) ;
    public final void rule__Task__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3123:1: ( ( ( rule__Task__TaskDependenciesAssignment_4_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3124:1: ( ( rule__Task__TaskDependenciesAssignment_4_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3124:1: ( ( rule__Task__TaskDependenciesAssignment_4_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3125:1: ( rule__Task__TaskDependenciesAssignment_4_1 )*
            {
             before(grammarAccess.getTaskAccess().getTaskDependenciesAssignment_4_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3126:1: ( rule__Task__TaskDependenciesAssignment_4_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3126:2: rule__Task__TaskDependenciesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__TaskDependenciesAssignment_4_1_in_rule__Task__Group_4__1__Impl6174);
            	    rule__Task__TaskDependenciesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3140:1: rule__Task__Group_5__0 : rule__Task__Group_5__0__Impl rule__Task__Group_5__1 ;
    public final void rule__Task__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3144:1: ( rule__Task__Group_5__0__Impl rule__Task__Group_5__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3145:2: rule__Task__Group_5__0__Impl rule__Task__Group_5__1
            {
            pushFollow(FOLLOW_rule__Task__Group_5__0__Impl_in_rule__Task__Group_5__06209);
            rule__Task__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_5__1_in_rule__Task__Group_5__06212);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3152:1: rule__Task__Group_5__0__Impl : ( 'servicesRequired' ) ;
    public final void rule__Task__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3156:1: ( ( 'servicesRequired' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3157:1: ( 'servicesRequired' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3157:1: ( 'servicesRequired' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3158:1: 'servicesRequired'
            {
             before(grammarAccess.getTaskAccess().getServicesRequiredKeyword_5_0()); 
            match(input,39,FOLLOW_39_in_rule__Task__Group_5__0__Impl6240); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3171:1: rule__Task__Group_5__1 : rule__Task__Group_5__1__Impl ;
    public final void rule__Task__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3175:1: ( rule__Task__Group_5__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3176:2: rule__Task__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_5__1__Impl_in_rule__Task__Group_5__16271);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3182:1: rule__Task__Group_5__1__Impl : ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) ) ;
    public final void rule__Task__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3186:1: ( ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3187:1: ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3187:1: ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3188:1: ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3188:1: ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3189:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3190:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3190:2: rule__Task__ReqSpecialtiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6300);
            rule__Task__ReqSpecialtiesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3193:1: ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3194:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )*
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3195:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3195:2: rule__Task__ReqSpecialtiesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6312);
            	    rule__Task__ReqSpecialtiesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3210:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3214:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3215:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_rule__Task__Group_6__0__Impl_in_rule__Task__Group_6__06349);
            rule__Task__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_6__1_in_rule__Task__Group_6__06352);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3222:1: rule__Task__Group_6__0__Impl : ( 'base value' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3226:1: ( ( 'base value' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3227:1: ( 'base value' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3227:1: ( 'base value' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3228:1: 'base value'
            {
             before(grammarAccess.getTaskAccess().getBaseValueKeyword_6_0()); 
            match(input,40,FOLLOW_40_in_rule__Task__Group_6__0__Impl6380); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3241:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3245:1: ( rule__Task__Group_6__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3246:2: rule__Task__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_6__1__Impl_in_rule__Task__Group_6__16411);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3252:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__BvalueAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3256:1: ( ( ( rule__Task__BvalueAssignment_6_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3257:1: ( ( rule__Task__BvalueAssignment_6_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3257:1: ( ( rule__Task__BvalueAssignment_6_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3258:1: ( rule__Task__BvalueAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getBvalueAssignment_6_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3259:1: ( rule__Task__BvalueAssignment_6_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3259:2: rule__Task__BvalueAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Task__BvalueAssignment_6_1_in_rule__Task__Group_6__1__Impl6438);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3273:1: rule__Task__Group_7__0 : rule__Task__Group_7__0__Impl rule__Task__Group_7__1 ;
    public final void rule__Task__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3277:1: ( rule__Task__Group_7__0__Impl rule__Task__Group_7__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3278:2: rule__Task__Group_7__0__Impl rule__Task__Group_7__1
            {
            pushFollow(FOLLOW_rule__Task__Group_7__0__Impl_in_rule__Task__Group_7__06472);
            rule__Task__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_7__1_in_rule__Task__Group_7__06475);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3285:1: rule__Task__Group_7__0__Impl : ( 'classOfService' ) ;
    public final void rule__Task__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3289:1: ( ( 'classOfService' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3290:1: ( 'classOfService' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3290:1: ( 'classOfService' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3291:1: 'classOfService'
            {
             before(grammarAccess.getTaskAccess().getClassOfServiceKeyword_7_0()); 
            match(input,41,FOLLOW_41_in_rule__Task__Group_7__0__Impl6503); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3304:1: rule__Task__Group_7__1 : rule__Task__Group_7__1__Impl ;
    public final void rule__Task__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3308:1: ( rule__Task__Group_7__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3309:2: rule__Task__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_7__1__Impl_in_rule__Task__Group_7__16534);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3315:1: rule__Task__Group_7__1__Impl : ( ( rule__Task__COSAssignment_7_1 ) ) ;
    public final void rule__Task__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3319:1: ( ( ( rule__Task__COSAssignment_7_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3320:1: ( ( rule__Task__COSAssignment_7_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3320:1: ( ( rule__Task__COSAssignment_7_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3321:1: ( rule__Task__COSAssignment_7_1 )
            {
             before(grammarAccess.getTaskAccess().getCOSAssignment_7_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3322:1: ( rule__Task__COSAssignment_7_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3322:2: rule__Task__COSAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Task__COSAssignment_7_1_in_rule__Task__Group_7__1__Impl6561);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3336:1: rule__KanbanTaskModel__Group__0 : rule__KanbanTaskModel__Group__0__Impl rule__KanbanTaskModel__Group__1 ;
    public final void rule__KanbanTaskModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3340:1: ( rule__KanbanTaskModel__Group__0__Impl rule__KanbanTaskModel__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3341:2: rule__KanbanTaskModel__Group__0__Impl rule__KanbanTaskModel__Group__1
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__0__Impl_in_rule__KanbanTaskModel__Group__06595);
            rule__KanbanTaskModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__1_in_rule__KanbanTaskModel__Group__06598);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3348:1: rule__KanbanTaskModel__Group__0__Impl : ( 'WorkFlow' ) ;
    public final void rule__KanbanTaskModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3352:1: ( ( 'WorkFlow' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3353:1: ( 'WorkFlow' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3353:1: ( 'WorkFlow' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3354:1: 'WorkFlow'
            {
             before(grammarAccess.getKanbanTaskModelAccess().getWorkFlowKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__KanbanTaskModel__Group__0__Impl6626); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3367:1: rule__KanbanTaskModel__Group__1 : rule__KanbanTaskModel__Group__1__Impl rule__KanbanTaskModel__Group__2 ;
    public final void rule__KanbanTaskModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3371:1: ( rule__KanbanTaskModel__Group__1__Impl rule__KanbanTaskModel__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3372:2: rule__KanbanTaskModel__Group__1__Impl rule__KanbanTaskModel__Group__2
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__1__Impl_in_rule__KanbanTaskModel__Group__16657);
            rule__KanbanTaskModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__2_in_rule__KanbanTaskModel__Group__16660);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3379:1: rule__KanbanTaskModel__Group__1__Impl : ( ( rule__KanbanTaskModel__NameAssignment_1 ) ) ;
    public final void rule__KanbanTaskModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3383:1: ( ( ( rule__KanbanTaskModel__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3384:1: ( ( rule__KanbanTaskModel__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3384:1: ( ( rule__KanbanTaskModel__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3385:1: ( rule__KanbanTaskModel__NameAssignment_1 )
            {
             before(grammarAccess.getKanbanTaskModelAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3386:1: ( rule__KanbanTaskModel__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3386:2: rule__KanbanTaskModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__NameAssignment_1_in_rule__KanbanTaskModel__Group__1__Impl6687);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3396:1: rule__KanbanTaskModel__Group__2 : rule__KanbanTaskModel__Group__2__Impl rule__KanbanTaskModel__Group__3 ;
    public final void rule__KanbanTaskModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3400:1: ( rule__KanbanTaskModel__Group__2__Impl rule__KanbanTaskModel__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3401:2: rule__KanbanTaskModel__Group__2__Impl rule__KanbanTaskModel__Group__3
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__2__Impl_in_rule__KanbanTaskModel__Group__26717);
            rule__KanbanTaskModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__3_in_rule__KanbanTaskModel__Group__26720);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3408:1: rule__KanbanTaskModel__Group__2__Impl : ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) ) ;
    public final void rule__KanbanTaskModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3412:1: ( ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3413:1: ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3413:1: ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3414:1: ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3414:1: ( ( rule__KanbanTaskModel__CapsAssignment_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3415:1: ( rule__KanbanTaskModel__CapsAssignment_2 )
            {
             before(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3416:1: ( rule__KanbanTaskModel__CapsAssignment_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3416:2: rule__KanbanTaskModel__CapsAssignment_2
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl6749);
            rule__KanbanTaskModel__CapsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3419:1: ( ( rule__KanbanTaskModel__CapsAssignment_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3420:1: ( rule__KanbanTaskModel__CapsAssignment_2 )*
            {
             before(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3421:1: ( rule__KanbanTaskModel__CapsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3421:2: rule__KanbanTaskModel__CapsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl6761);
            	    rule__KanbanTaskModel__CapsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3432:1: rule__KanbanTaskModel__Group__3 : rule__KanbanTaskModel__Group__3__Impl ;
    public final void rule__KanbanTaskModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3436:1: ( rule__KanbanTaskModel__Group__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3437:2: rule__KanbanTaskModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__3__Impl_in_rule__KanbanTaskModel__Group__36794);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3443:1: rule__KanbanTaskModel__Group__3__Impl : ( 'end WorkFlow' ) ;
    public final void rule__KanbanTaskModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3447:1: ( ( 'end WorkFlow' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3448:1: ( 'end WorkFlow' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3448:1: ( 'end WorkFlow' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3449:1: 'end WorkFlow'
            {
             before(grammarAccess.getKanbanTaskModelAccess().getEndWorkFlowKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__KanbanTaskModel__Group__3__Impl6822); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3470:1: rule__Capability__Group__0 : rule__Capability__Group__0__Impl rule__Capability__Group__1 ;
    public final void rule__Capability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3474:1: ( rule__Capability__Group__0__Impl rule__Capability__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3475:2: rule__Capability__Group__0__Impl rule__Capability__Group__1
            {
            pushFollow(FOLLOW_rule__Capability__Group__0__Impl_in_rule__Capability__Group__06861);
            rule__Capability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__1_in_rule__Capability__Group__06864);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3482:1: rule__Capability__Group__0__Impl : ( 'capability' ) ;
    public final void rule__Capability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3486:1: ( ( 'capability' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3487:1: ( 'capability' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3487:1: ( 'capability' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3488:1: 'capability'
            {
             before(grammarAccess.getCapabilityAccess().getCapabilityKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Capability__Group__0__Impl6892); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3501:1: rule__Capability__Group__1 : rule__Capability__Group__1__Impl rule__Capability__Group__2 ;
    public final void rule__Capability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3505:1: ( rule__Capability__Group__1__Impl rule__Capability__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3506:2: rule__Capability__Group__1__Impl rule__Capability__Group__2
            {
            pushFollow(FOLLOW_rule__Capability__Group__1__Impl_in_rule__Capability__Group__16923);
            rule__Capability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__2_in_rule__Capability__Group__16926);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3513:1: rule__Capability__Group__1__Impl : ( ( rule__Capability__NameAssignment_1 ) ) ;
    public final void rule__Capability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3517:1: ( ( ( rule__Capability__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3518:1: ( ( rule__Capability__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3518:1: ( ( rule__Capability__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3519:1: ( rule__Capability__NameAssignment_1 )
            {
             before(grammarAccess.getCapabilityAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3520:1: ( rule__Capability__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3520:2: rule__Capability__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Capability__NameAssignment_1_in_rule__Capability__Group__1__Impl6953);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3530:1: rule__Capability__Group__2 : rule__Capability__Group__2__Impl rule__Capability__Group__3 ;
    public final void rule__Capability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3534:1: ( rule__Capability__Group__2__Impl rule__Capability__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3535:2: rule__Capability__Group__2__Impl rule__Capability__Group__3
            {
            pushFollow(FOLLOW_rule__Capability__Group__2__Impl_in_rule__Capability__Group__26983);
            rule__Capability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__3_in_rule__Capability__Group__26986);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3542:1: rule__Capability__Group__2__Impl : ( '{' ) ;
    public final void rule__Capability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3546:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3547:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3547:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3548:1: '{'
            {
             before(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Capability__Group__2__Impl7014); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3561:1: rule__Capability__Group__3 : rule__Capability__Group__3__Impl rule__Capability__Group__4 ;
    public final void rule__Capability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3565:1: ( rule__Capability__Group__3__Impl rule__Capability__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3566:2: rule__Capability__Group__3__Impl rule__Capability__Group__4
            {
            pushFollow(FOLLOW_rule__Capability__Group__3__Impl_in_rule__Capability__Group__37045);
            rule__Capability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__4_in_rule__Capability__Group__37048);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3573:1: rule__Capability__Group__3__Impl : ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) ) ;
    public final void rule__Capability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3577:1: ( ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3578:1: ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3578:1: ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3579:1: ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3579:1: ( ( rule__Capability__ReqsAssignment_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3580:1: ( rule__Capability__ReqsAssignment_3 )
            {
             before(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3581:1: ( rule__Capability__ReqsAssignment_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3581:2: rule__Capability__ReqsAssignment_3
            {
            pushFollow(FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl7077);
            rule__Capability__ReqsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3584:1: ( ( rule__Capability__ReqsAssignment_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3585:1: ( rule__Capability__ReqsAssignment_3 )*
            {
             before(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3586:1: ( rule__Capability__ReqsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3586:2: rule__Capability__ReqsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl7089);
            	    rule__Capability__ReqsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3597:1: rule__Capability__Group__4 : rule__Capability__Group__4__Impl ;
    public final void rule__Capability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3601:1: ( rule__Capability__Group__4__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3602:2: rule__Capability__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Capability__Group__4__Impl_in_rule__Capability__Group__47122);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3608:1: rule__Capability__Group__4__Impl : ( '}' ) ;
    public final void rule__Capability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3612:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3613:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3613:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3614:1: '}'
            {
             before(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Capability__Group__4__Impl7150); 
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


    // $ANTLR start "rule__KanbanGovModel__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3637:1: rule__KanbanGovModel__Group__0 : rule__KanbanGovModel__Group__0__Impl rule__KanbanGovModel__Group__1 ;
    public final void rule__KanbanGovModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3641:1: ( rule__KanbanGovModel__Group__0__Impl rule__KanbanGovModel__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3642:2: rule__KanbanGovModel__Group__0__Impl rule__KanbanGovModel__Group__1
            {
            pushFollow(FOLLOW_rule__KanbanGovModel__Group__0__Impl_in_rule__KanbanGovModel__Group__07191);
            rule__KanbanGovModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanGovModel__Group__1_in_rule__KanbanGovModel__Group__07194);
            rule__KanbanGovModel__Group__1();

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
    // $ANTLR end "rule__KanbanGovModel__Group__0"


    // $ANTLR start "rule__KanbanGovModel__Group__0__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3649:1: rule__KanbanGovModel__Group__0__Impl : ( 'strategy' ) ;
    public final void rule__KanbanGovModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3653:1: ( ( 'strategy' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3654:1: ( 'strategy' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3654:1: ( 'strategy' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3655:1: 'strategy'
            {
             before(grammarAccess.getKanbanGovModelAccess().getStrategyKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__KanbanGovModel__Group__0__Impl7222); 
             after(grammarAccess.getKanbanGovModelAccess().getStrategyKeyword_0()); 

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
    // $ANTLR end "rule__KanbanGovModel__Group__0__Impl"


    // $ANTLR start "rule__KanbanGovModel__Group__1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3668:1: rule__KanbanGovModel__Group__1 : rule__KanbanGovModel__Group__1__Impl ;
    public final void rule__KanbanGovModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3672:1: ( rule__KanbanGovModel__Group__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3673:2: rule__KanbanGovModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__KanbanGovModel__Group__1__Impl_in_rule__KanbanGovModel__Group__17253);
            rule__KanbanGovModel__Group__1__Impl();

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
    // $ANTLR end "rule__KanbanGovModel__Group__1"


    // $ANTLR start "rule__KanbanGovModel__Group__1__Impl"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3679:1: rule__KanbanGovModel__Group__1__Impl : ( ( rule__KanbanGovModel__NameAssignment_1 ) ) ;
    public final void rule__KanbanGovModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3683:1: ( ( ( rule__KanbanGovModel__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3684:1: ( ( rule__KanbanGovModel__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3684:1: ( ( rule__KanbanGovModel__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3685:1: ( rule__KanbanGovModel__NameAssignment_1 )
            {
             before(grammarAccess.getKanbanGovModelAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3686:1: ( rule__KanbanGovModel__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3686:2: rule__KanbanGovModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KanbanGovModel__NameAssignment_1_in_rule__KanbanGovModel__Group__1__Impl7280);
            rule__KanbanGovModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKanbanGovModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__KanbanGovModel__Group__1__Impl"


    // $ANTLR start "rule__KanbanSchedulingSystem__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3701:1: rule__KanbanSchedulingSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KanbanSchedulingSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3705:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3706:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3706:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3707:1: RULE_ID
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KanbanSchedulingSystem__NameAssignment_17319); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3716:1: rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 : ( ruleTeam ) ;
    public final void rule__KanbanSchedulingSystem__OrgUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3720:1: ( ( ruleTeam ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3721:1: ( ruleTeam )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3721:1: ( ruleTeam )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3722:1: ruleTeam
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsTeamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTeam_in_rule__KanbanSchedulingSystem__OrgUnitsAssignment_37350);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3731:1: rule__KanbanSchedulingSystem__KssTasksAssignment_6 : ( ruleTask ) ;
    public final void rule__KanbanSchedulingSystem__KssTasksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3735:1: ( ( ruleTask ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3736:1: ( ruleTask )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3736:1: ( ruleTask )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3737:1: ruleTask
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksTaskParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTask_in_rule__KanbanSchedulingSystem__KssTasksAssignment_67381);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3746:1: rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7 : ( ruleKanbanTaskModel ) ;
    public final void rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3750:1: ( ( ruleKanbanTaskModel ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3751:1: ( ruleKanbanTaskModel )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3751:1: ( ruleKanbanTaskModel )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3752:1: ruleKanbanTaskModel
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowKanbanTaskModelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleKanbanTaskModel_in_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_77412);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3761:1: rule__KanbanSchedulingSystem__KssGovModelAssignment_10 : ( ruleKanbanGovModel ) ;
    public final void rule__KanbanSchedulingSystem__KssGovModelAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3765:1: ( ( ruleKanbanGovModel ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3766:1: ( ruleKanbanGovModel )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3766:1: ( ruleKanbanGovModel )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3767:1: ruleKanbanGovModel
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssGovModelKanbanGovModelParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleKanbanGovModel_in_rule__KanbanSchedulingSystem__KssGovModelAssignment_107443);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3776:1: rule__Team__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Team__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3780:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3781:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3781:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3782:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__NameAssignment_17474); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3791:1: rule__Team__DemandUnitsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Team__DemandUnitsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3795:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3796:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3796:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3797:1: ( RULE_ID )
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsTeamCrossReference_3_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3798:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3799:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsTeamIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__DemandUnitsAssignment_3_27509); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3810:1: rule__Team__SourcedUnitsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Team__SourcedUnitsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3814:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3815:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3815:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3816:1: ( RULE_ID )
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsTeamCrossReference_4_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3817:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3818:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsTeamIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__SourcedUnitsAssignment_4_27548); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3829:1: rule__Team__GroupmembersAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Team__GroupmembersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3833:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3834:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3834:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3835:1: ( RULE_ID )
            {
             before(grammarAccess.getTeamAccess().getGroupmembersTeamCrossReference_5_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3836:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3837:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getGroupmembersTeamIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__GroupmembersAssignment_5_27587); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3848:1: rule__Team__ResourcesAssignment_6_2 : ( ruleAsset ) ;
    public final void rule__Team__ResourcesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3852:1: ( ( ruleAsset ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3853:1: ( ruleAsset )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3853:1: ( ruleAsset )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3854:1: ruleAsset
            {
             before(grammarAccess.getTeamAccess().getResourcesAssetParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Team__ResourcesAssignment_6_27622);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3863:1: rule__Team__ServicesAssignment_7_2 : ( ruleService ) ;
    public final void rule__Team__ServicesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3867:1: ( ( ruleService ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3868:1: ( ruleService )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3868:1: ( ruleService )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3869:1: ruleService
            {
             before(grammarAccess.getTeamAccess().getServicesServiceParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Team__ServicesAssignment_7_27653);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3878:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3882:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3883:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3883:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3884:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_17684); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3893:1: rule__Asset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3897:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3898:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3898:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3899:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_17715); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3908:1: rule__Asset__HasSkillsAssignment_2_3 : ( ruleSkill ) ;
    public final void rule__Asset__HasSkillsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3912:1: ( ( ruleSkill ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3913:1: ( ruleSkill )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3913:1: ( ruleSkill )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3914:1: ruleSkill
            {
             before(grammarAccess.getAssetAccess().getHasSkillsSkillParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleSkill_in_rule__Asset__HasSkillsAssignment_2_37746);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3923:1: rule__Skill__NameAssignment : ( RULE_ID ) ;
    public final void rule__Skill__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3927:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3928:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3928:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3929:1: RULE_ID
            {
             before(grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Skill__NameAssignment7777); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3938:1: rule__Dependency__SourceTaskAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__SourceTaskAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3942:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3943:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3943:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3944:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getSourceTaskTaskCrossReference_0_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3945:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3946:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getSourceTaskTaskIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__SourceTaskAssignment_07812); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3957:1: rule__Dependency__TargetTaskAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__TargetTaskAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3961:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3962:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3962:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3963:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getTargetTaskTaskCrossReference_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3964:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3965:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getTargetTaskTaskIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__TargetTaskAssignment_27851); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3976:1: rule__Requirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Requirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3980:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3981:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3981:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3982:1: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_17886); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3991:1: rule__Requirement__RTasksAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Requirement__RTasksAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3995:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3996:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3996:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3997:1: ( RULE_ID )
            {
             before(grammarAccess.getRequirementAccess().getRTasksTaskCrossReference_3_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3998:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3999:1: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getRTasksTaskIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__RTasksAssignment_3_27921); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4010:1: rule__Requirement__DependenciesAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__Requirement__DependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4014:1: ( ( ruleDependency ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4015:1: ( ruleDependency )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4015:1: ( ruleDependency )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4016:1: ruleDependency
            {
             before(grammarAccess.getRequirementAccess().getDependenciesDependencyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Requirement__DependenciesAssignment_4_17956);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4025:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4029:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4030:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4030:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4031:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__NameAssignment_17987); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4040:1: rule__Task__STasksAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Task__STasksAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4044:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4045:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4045:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4046:1: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getSTasksTaskCrossReference_3_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4047:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4048:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getSTasksTaskIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__STasksAssignment_3_28022); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4059:1: rule__Task__TaskDependenciesAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__Task__TaskDependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4063:1: ( ( ruleDependency ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4064:1: ( ruleDependency )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4064:1: ( ruleDependency )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4065:1: ruleDependency
            {
             before(grammarAccess.getTaskAccess().getTaskDependenciesDependencyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Task__TaskDependenciesAssignment_4_18057);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4074:1: rule__Task__ReqSpecialtiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Task__ReqSpecialtiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4078:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4079:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4079:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4080:1: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesServiceCrossReference_5_1_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4081:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4082:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesServiceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__ReqSpecialtiesAssignment_5_18092); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4093:1: rule__Task__BvalueAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Task__BvalueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4097:1: ( ( RULE_INT ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4098:1: ( RULE_INT )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4098:1: ( RULE_INT )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4099:1: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBvalueINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Task__BvalueAssignment_6_18127); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4108:1: rule__Task__COSAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Task__COSAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4112:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4113:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4113:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4114:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getCOSIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__COSAssignment_7_18158); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4123:1: rule__KanbanTaskModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KanbanTaskModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4127:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4128:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4128:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4129:1: RULE_ID
            {
             before(grammarAccess.getKanbanTaskModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KanbanTaskModel__NameAssignment_18189); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4138:1: rule__KanbanTaskModel__CapsAssignment_2 : ( ruleCapability ) ;
    public final void rule__KanbanTaskModel__CapsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4142:1: ( ( ruleCapability ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4143:1: ( ruleCapability )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4143:1: ( ruleCapability )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4144:1: ruleCapability
            {
             before(grammarAccess.getKanbanTaskModelAccess().getCapsCapabilityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCapability_in_rule__KanbanTaskModel__CapsAssignment_28220);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4153:1: rule__Capability__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Capability__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4157:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4158:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4158:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4159:1: RULE_ID
            {
             before(grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Capability__NameAssignment_18251); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4168:1: rule__Capability__ReqsAssignment_3 : ( ruleRequirement ) ;
    public final void rule__Capability__ReqsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4172:1: ( ( ruleRequirement ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4173:1: ( ruleRequirement )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4173:1: ( ruleRequirement )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4174:1: ruleRequirement
            {
             before(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRequirement_in_rule__Capability__ReqsAssignment_38282);
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


    // $ANTLR start "rule__KanbanGovModel__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4183:1: rule__KanbanGovModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KanbanGovModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4187:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4188:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4188:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:4189:1: RULE_ID
            {
             before(grammarAccess.getKanbanGovModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KanbanGovModel__NameAssignment_18313); 
             after(grammarAccess.getKanbanGovModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__KanbanGovModel__NameAssignment_1"

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
    public static final BitSet FOLLOW_rule__KanbanGovModel__Group__0_in_ruleKanbanGovModel694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Team__Alternatives_0731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Team__Alternatives_0751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Dependency__Alternatives_1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Dependency__Alternatives_1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__0__Impl_in_rule__KanbanSchedulingSystem__Group__0838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__1_in_rule__KanbanSchedulingSystem__Group__0841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__KanbanSchedulingSystem__Group__0__Impl869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__1__Impl_in_rule__KanbanSchedulingSystem__Group__1900 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__2_in_rule__KanbanSchedulingSystem__Group__1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__NameAssignment_1_in_rule__KanbanSchedulingSystem__Group__1__Impl930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__2__Impl_in_rule__KanbanSchedulingSystem__Group__2960 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__3_in_rule__KanbanSchedulingSystem__Group__2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__KanbanSchedulingSystem__Group__2__Impl991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__3__Impl_in_rule__KanbanSchedulingSystem__Group__31022 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__4_in_rule__KanbanSchedulingSystem__Group__31025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1054 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1066 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__4__Impl_in_rule__KanbanSchedulingSystem__Group__41099 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__5_in_rule__KanbanSchedulingSystem__Group__41102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__KanbanSchedulingSystem__Group__4__Impl1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__5__Impl_in_rule__KanbanSchedulingSystem__Group__51161 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__6_in_rule__KanbanSchedulingSystem__Group__51164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__KanbanSchedulingSystem__Group__5__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__6__Impl_in_rule__KanbanSchedulingSystem__Group__61223 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__7_in_rule__KanbanSchedulingSystem__Group__61226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1255 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1267 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__7__Impl_in_rule__KanbanSchedulingSystem__Group__71300 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__8_in_rule__KanbanSchedulingSystem__Group__71303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7_in_rule__KanbanSchedulingSystem__Group__7__Impl1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__8__Impl_in_rule__KanbanSchedulingSystem__Group__81360 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__9_in_rule__KanbanSchedulingSystem__Group__81363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__KanbanSchedulingSystem__Group__8__Impl1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__9__Impl_in_rule__KanbanSchedulingSystem__Group__91422 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__10_in_rule__KanbanSchedulingSystem__Group__91425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__KanbanSchedulingSystem__Group__9__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__10__Impl_in_rule__KanbanSchedulingSystem__Group__101484 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__11_in_rule__KanbanSchedulingSystem__Group__101487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssGovModelAssignment_10_in_rule__KanbanSchedulingSystem__Group__10__Impl1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__11__Impl_in_rule__KanbanSchedulingSystem__Group__111544 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__12_in_rule__KanbanSchedulingSystem__Group__111547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__KanbanSchedulingSystem__Group__11__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__12__Impl_in_rule__KanbanSchedulingSystem__Group__121606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__KanbanSchedulingSystem__Group__12__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__0__Impl_in_rule__Team__Group__01691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group__1_in_rule__Team__Group__01694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Alternatives_0_in_rule__Team__Group__0__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__1__Impl_in_rule__Team__Group__11751 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group__2_in_rule__Team__Group__11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__NameAssignment_1_in_rule__Team__Group__1__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__2__Impl_in_rule__Team__Group__21811 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__3_in_rule__Team__Group__21814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group__2__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__3__Impl_in_rule__Team__Group__31873 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__4_in_rule__Team__Group__31876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__0_in_rule__Team__Group__3__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__4__Impl_in_rule__Team__Group__41934 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__5_in_rule__Team__Group__41937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__0_in_rule__Team__Group__4__Impl1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__5__Impl_in_rule__Team__Group__51995 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__6_in_rule__Team__Group__51998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__0_in_rule__Team__Group__5__Impl2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__6__Impl_in_rule__Team__Group__62056 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__7_in_rule__Team__Group__62059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__0_in_rule__Team__Group__6__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__7__Impl_in_rule__Team__Group__72117 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__Team__Group__8_in_rule__Team__Group__72120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__0_in_rule__Team__Group__7__Impl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__8__Impl_in_rule__Team__Group__82178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group__8__Impl2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__0__Impl_in_rule__Team__Group_3__02255 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_3__1_in_rule__Team__Group_3__02258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Team__Group_3__0__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__1__Impl_in_rule__Team__Group_3__12317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group_3__2_in_rule__Team__Group_3__12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_3__1__Impl2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__2__Impl_in_rule__Team__Group_3__22379 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_3__3_in_rule__Team__Group_3__22382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2411 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2423 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__Group_3__3__Impl_in_rule__Team__Group_3__32456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_3__3__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__0__Impl_in_rule__Team__Group_4__02523 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_4__1_in_rule__Team__Group_4__02526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Team__Group_4__0__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__1__Impl_in_rule__Team__Group_4__12585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group_4__2_in_rule__Team__Group_4__12588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_4__1__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__2__Impl_in_rule__Team__Group_4__22647 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_4__3_in_rule__Team__Group_4__22650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl2679 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl2691 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__Group_4__3__Impl_in_rule__Team__Group_4__32724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_4__3__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__0__Impl_in_rule__Team__Group_5__02791 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_5__1_in_rule__Team__Group_5__02794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Team__Group_5__0__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__1__Impl_in_rule__Team__Group_5__12853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group_5__2_in_rule__Team__Group_5__12856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_5__1__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__2__Impl_in_rule__Team__Group_5__22915 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_5__3_in_rule__Team__Group_5__22918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl2947 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl2959 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__Group_5__3__Impl_in_rule__Team__Group_5__32992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_5__3__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__0__Impl_in_rule__Team__Group_6__03059 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_6__1_in_rule__Team__Group_6__03062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Team__Group_6__0__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__1__Impl_in_rule__Team__Group_6__13121 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Team__Group_6__2_in_rule__Team__Group_6__13124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_6__1__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__2__Impl_in_rule__Team__Group_6__23183 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_6__3_in_rule__Team__Group_6__23186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl3215 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl3227 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__3__Impl_in_rule__Team__Group_6__33260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_6__3__Impl3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__0__Impl_in_rule__Team__Group_7__03327 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Team__Group_7__1_in_rule__Team__Group_7__03330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Team__Group_7__0__Impl3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__1__Impl_in_rule__Team__Group_7__13389 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Team__Group_7__2_in_rule__Team__Group_7__13392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_7__1__Impl3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__2__Impl_in_rule__Team__Group_7__23451 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Team__Group_7__3_in_rule__Team__Group_7__23454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl3483 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl3495 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__3__Impl_in_rule__Team__Group_7__33528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_7__3__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__03595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__03598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Service__Group__0__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__13657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Asset__Group__0__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13780 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__03904 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__03907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Asset__Group_2__0__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__13966 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__2_in_rule__Asset__Group_2__13969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Asset__Group_2__1__Impl3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__2__Impl_in_rule__Asset__Group_2__24028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__3_in_rule__Asset__Group_2__24031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Asset__Group_2__2__Impl4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__3__Impl_in_rule__Asset__Group_2__34090 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__4_in_rule__Asset__Group_2__34093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl4122 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl4134 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__4__Impl_in_rule__Asset__Group_2__44167 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__5_in_rule__Asset__Group_2__44170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Asset__Group_2__4__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__5__Impl_in_rule__Asset__Group_2__54229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Asset__Group_2__5__Impl4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__04300 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__04303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__SourceTaskAssignment_0_in_rule__Dependency__Group__0__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__14360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__14363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Alternatives_1_in_rule__Dependency__Group__1__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__24420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__TargetTaskAssignment_2_in_rule__Dependency__Group__2__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__04483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__04486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Requirement__Group__0__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__14545 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__14548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__NameAssignment_1_in_rule__Requirement__Group__1__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__24605 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__24608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Requirement__Group__2__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__34667 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__4_in_rule__Requirement__Group__34670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__4__Impl_in_rule__Requirement__Group__44727 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__5_in_rule__Requirement__Group__44730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__0_in_rule__Requirement__Group__4__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__5__Impl_in_rule__Requirement__Group__54788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Requirement__Group__5__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__04859 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__04862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Requirement__Group_3__0__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__14921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__2_in_rule__Requirement__Group_3__14924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Requirement__Group_3__1__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__2__Impl_in_rule__Requirement__Group_3__24983 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__3_in_rule__Requirement__Group_3__24986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl5015 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl5027 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__3__Impl_in_rule__Requirement__Group_3__35060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Requirement__Group_3__3__Impl5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__0__Impl_in_rule__Requirement__Group_4__05127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__1_in_rule__Requirement__Group_4__05130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Requirement__Group_4__0__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__1__Impl_in_rule__Requirement__Group_4__15189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__DependenciesAssignment_4_1_in_rule__Requirement__Group_4__1__Impl5216 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__05251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Task__Group__0__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__15313 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Task__Group__2_in_rule__Task__Group__15316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__2__Impl_in_rule__Task__Group__25373 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__3_in_rule__Task__Group__25376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Task__Group__2__Impl5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__3__Impl_in_rule__Task__Group__35435 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__4_in_rule__Task__Group__35438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__0_in_rule__Task__Group__3__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__4__Impl_in_rule__Task__Group__45496 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__5_in_rule__Task__Group__45499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__0_in_rule__Task__Group__4__Impl5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__5__Impl_in_rule__Task__Group__55557 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__6_in_rule__Task__Group__55560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_5__0_in_rule__Task__Group__5__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__6__Impl_in_rule__Task__Group__65618 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__7_in_rule__Task__Group__65621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_6__0_in_rule__Task__Group__6__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__7__Impl_in_rule__Task__Group__75679 = new BitSet(new long[]{0x000003E001000000L});
    public static final BitSet FOLLOW_rule__Task__Group__8_in_rule__Task__Group__75682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__0_in_rule__Task__Group__7__Impl5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__8__Impl_in_rule__Task__Group__85740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Task__Group__8__Impl5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__0__Impl_in_rule__Task__Group_3__05817 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Task__Group_3__1_in_rule__Task__Group_3__05820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Task__Group_3__0__Impl5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__1__Impl_in_rule__Task__Group_3__15879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_3__2_in_rule__Task__Group_3__15882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Task__Group_3__1__Impl5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__2__Impl_in_rule__Task__Group_3__25941 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Task__Group_3__3_in_rule__Task__Group_3__25944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl5973 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl5985 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_3__3__Impl_in_rule__Task__Group_3__36018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Task__Group_3__3__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__0__Impl_in_rule__Task__Group_4__06085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_4__1_in_rule__Task__Group_4__06088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Task__Group_4__0__Impl6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__1__Impl_in_rule__Task__Group_4__16147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__TaskDependenciesAssignment_4_1_in_rule__Task__Group_4__1__Impl6174 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_5__0__Impl_in_rule__Task__Group_5__06209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_5__1_in_rule__Task__Group_5__06212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Task__Group_5__0__Impl6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_5__1__Impl_in_rule__Task__Group_5__16271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6300 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6312 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_6__0__Impl_in_rule__Task__Group_6__06349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Task__Group_6__1_in_rule__Task__Group_6__06352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Task__Group_6__0__Impl6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_6__1__Impl_in_rule__Task__Group_6__16411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__BvalueAssignment_6_1_in_rule__Task__Group_6__1__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__0__Impl_in_rule__Task__Group_7__06472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_7__1_in_rule__Task__Group_7__06475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Task__Group_7__0__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__1__Impl_in_rule__Task__Group_7__16534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__COSAssignment_7_1_in_rule__Task__Group_7__1__Impl6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__0__Impl_in_rule__KanbanTaskModel__Group__06595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__1_in_rule__KanbanTaskModel__Group__06598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__KanbanTaskModel__Group__0__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__1__Impl_in_rule__KanbanTaskModel__Group__16657 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__2_in_rule__KanbanTaskModel__Group__16660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__NameAssignment_1_in_rule__KanbanTaskModel__Group__1__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__2__Impl_in_rule__KanbanTaskModel__Group__26717 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__3_in_rule__KanbanTaskModel__Group__26720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl6749 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl6761 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__3__Impl_in_rule__KanbanTaskModel__Group__36794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__KanbanTaskModel__Group__3__Impl6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__0__Impl_in_rule__Capability__Group__06861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Capability__Group__1_in_rule__Capability__Group__06864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Capability__Group__0__Impl6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__1__Impl_in_rule__Capability__Group__16923 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Capability__Group__2_in_rule__Capability__Group__16926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__NameAssignment_1_in_rule__Capability__Group__1__Impl6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__2__Impl_in_rule__Capability__Group__26983 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Capability__Group__3_in_rule__Capability__Group__26986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Capability__Group__2__Impl7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__3__Impl_in_rule__Capability__Group__37045 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Capability__Group__4_in_rule__Capability__Group__37048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl7077 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl7089 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__4__Impl_in_rule__Capability__Group__47122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Capability__Group__4__Impl7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanGovModel__Group__0__Impl_in_rule__KanbanGovModel__Group__07191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__KanbanGovModel__Group__1_in_rule__KanbanGovModel__Group__07194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__KanbanGovModel__Group__0__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanGovModel__Group__1__Impl_in_rule__KanbanGovModel__Group__17253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanGovModel__NameAssignment_1_in_rule__KanbanGovModel__Group__1__Impl7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KanbanSchedulingSystem__NameAssignment_17319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeam_in_rule__KanbanSchedulingSystem__OrgUnitsAssignment_37350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__KanbanSchedulingSystem__KssTasksAssignment_67381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanTaskModel_in_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_77412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanGovModel_in_rule__KanbanSchedulingSystem__KssGovModelAssignment_107443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__NameAssignment_17474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__DemandUnitsAssignment_3_27509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__SourcedUnitsAssignment_4_27548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__GroupmembersAssignment_5_27587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Team__ResourcesAssignment_6_27622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Team__ServicesAssignment_7_27653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_17684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_17715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_rule__Asset__HasSkillsAssignment_2_37746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Skill__NameAssignment7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__SourceTaskAssignment_07812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__TargetTaskAssignment_27851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_17886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__RTasksAssignment_3_27921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Requirement__DependenciesAssignment_4_17956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_17987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__STasksAssignment_3_28022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Task__TaskDependenciesAssignment_4_18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__ReqSpecialtiesAssignment_5_18092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Task__BvalueAssignment_6_18127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__COSAssignment_7_18158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KanbanTaskModel__NameAssignment_18189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_rule__KanbanTaskModel__CapsAssignment_28220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Capability__NameAssignment_18251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_rule__Capability__ReqsAssignment_38282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KanbanGovModel__NameAssignment_18313 = new BitSet(new long[]{0x0000000000000002L});

}