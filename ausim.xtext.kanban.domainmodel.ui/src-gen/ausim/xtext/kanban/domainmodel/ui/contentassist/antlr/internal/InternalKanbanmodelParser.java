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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'team'", "'group'", "'=>'", "'->'", "'KSSWorkFlowModel'", "'Organization'", "'end Organization'", "'WorkItems'", "'end WorkItems'", "'end KSSWorkFlowModel'", "'{'", "'}'", "'sourceUnits'", "'targetUnits'", "'contains'", "'resources'", "'services'", "'service'", "'resource'", "'skills'", "'requirement'", "'workItems'", "'workItemNetwork'", "'workItem'", "'subtasks'", "'taskDependencies'", "'servicesRequired'", "'base value'", "'classOfService'", "'TaskModel'", "'end TaskModel'", "'capability'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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


    // $ANTLR start "rule__Team__Alternatives_0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:340:1: rule__Team__Alternatives_0 : ( ( 'team' ) | ( 'group' ) );
    public final void rule__Team__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:344:1: ( ( 'team' ) | ( 'group' ) )
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
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:345:1: ( 'team' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:345:1: ( 'team' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:346:1: 'team'
                    {
                     before(grammarAccess.getTeamAccess().getTeamKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Team__Alternatives_0671); 
                     after(grammarAccess.getTeamAccess().getTeamKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:353:6: ( 'group' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:353:6: ( 'group' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:354:1: 'group'
                    {
                     before(grammarAccess.getTeamAccess().getGroupKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Team__Alternatives_0691); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:366:1: rule__Dependency__Alternatives_1 : ( ( '=>' ) | ( '->' ) );
    public final void rule__Dependency__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:370:1: ( ( '=>' ) | ( '->' ) )
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
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:371:1: ( '=>' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:371:1: ( '=>' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:372:1: '=>'
                    {
                     before(grammarAccess.getDependencyAccess().getEqualsSignGreaterThanSignKeyword_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__Dependency__Alternatives_1726); 
                     after(grammarAccess.getDependencyAccess().getEqualsSignGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:379:6: ( '->' )
                    {
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:379:6: ( '->' )
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:380:1: '->'
                    {
                     before(grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__Dependency__Alternatives_1746); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:394:1: rule__KanbanSchedulingSystem__Group__0 : rule__KanbanSchedulingSystem__Group__0__Impl rule__KanbanSchedulingSystem__Group__1 ;
    public final void rule__KanbanSchedulingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:398:1: ( rule__KanbanSchedulingSystem__Group__0__Impl rule__KanbanSchedulingSystem__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:399:2: rule__KanbanSchedulingSystem__Group__0__Impl rule__KanbanSchedulingSystem__Group__1
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__0__Impl_in_rule__KanbanSchedulingSystem__Group__0778);
            rule__KanbanSchedulingSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__1_in_rule__KanbanSchedulingSystem__Group__0781);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:406:1: rule__KanbanSchedulingSystem__Group__0__Impl : ( 'KSSWorkFlowModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:410:1: ( ( 'KSSWorkFlowModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:411:1: ( 'KSSWorkFlowModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:411:1: ( 'KSSWorkFlowModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:412:1: 'KSSWorkFlowModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKSSWorkFlowModelKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__KanbanSchedulingSystem__Group__0__Impl809); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getKSSWorkFlowModelKeyword_0()); 

            }


            }

        }
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:425:1: rule__KanbanSchedulingSystem__Group__1 : rule__KanbanSchedulingSystem__Group__1__Impl rule__KanbanSchedulingSystem__Group__2 ;
    public final void rule__KanbanSchedulingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:429:1: ( rule__KanbanSchedulingSystem__Group__1__Impl rule__KanbanSchedulingSystem__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:430:2: rule__KanbanSchedulingSystem__Group__1__Impl rule__KanbanSchedulingSystem__Group__2
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__1__Impl_in_rule__KanbanSchedulingSystem__Group__1840);
            rule__KanbanSchedulingSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__2_in_rule__KanbanSchedulingSystem__Group__1843);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:437:1: rule__KanbanSchedulingSystem__Group__1__Impl : ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:441:1: ( ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:442:1: ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:442:1: ( ( rule__KanbanSchedulingSystem__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:443:1: ( rule__KanbanSchedulingSystem__NameAssignment_1 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:444:1: ( rule__KanbanSchedulingSystem__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:444:2: rule__KanbanSchedulingSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__NameAssignment_1_in_rule__KanbanSchedulingSystem__Group__1__Impl870);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:454:1: rule__KanbanSchedulingSystem__Group__2 : rule__KanbanSchedulingSystem__Group__2__Impl rule__KanbanSchedulingSystem__Group__3 ;
    public final void rule__KanbanSchedulingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:458:1: ( rule__KanbanSchedulingSystem__Group__2__Impl rule__KanbanSchedulingSystem__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:459:2: rule__KanbanSchedulingSystem__Group__2__Impl rule__KanbanSchedulingSystem__Group__3
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__2__Impl_in_rule__KanbanSchedulingSystem__Group__2900);
            rule__KanbanSchedulingSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__3_in_rule__KanbanSchedulingSystem__Group__2903);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:466:1: rule__KanbanSchedulingSystem__Group__2__Impl : ( 'Organization' ) ;
    public final void rule__KanbanSchedulingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:470:1: ( ( 'Organization' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:471:1: ( 'Organization' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:471:1: ( 'Organization' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:472:1: 'Organization'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__KanbanSchedulingSystem__Group__2__Impl931); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationKeyword_2()); 

            }


            }

        }
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:485:1: rule__KanbanSchedulingSystem__Group__3 : rule__KanbanSchedulingSystem__Group__3__Impl rule__KanbanSchedulingSystem__Group__4 ;
    public final void rule__KanbanSchedulingSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:489:1: ( rule__KanbanSchedulingSystem__Group__3__Impl rule__KanbanSchedulingSystem__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:490:2: rule__KanbanSchedulingSystem__Group__3__Impl rule__KanbanSchedulingSystem__Group__4
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__3__Impl_in_rule__KanbanSchedulingSystem__Group__3962);
            rule__KanbanSchedulingSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__4_in_rule__KanbanSchedulingSystem__Group__3965);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:497:1: rule__KanbanSchedulingSystem__Group__3__Impl : ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:501:1: ( ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:502:1: ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:502:1: ( ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:503:1: ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) ) ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:503:1: ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:504:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:505:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:505:2: rule__KanbanSchedulingSystem__OrgUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl994);
            rule__KanbanSchedulingSystem__OrgUnitsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:508:1: ( ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:509:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )*
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:510:1: ( rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:510:2: rule__KanbanSchedulingSystem__OrgUnitsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1006);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:521:1: rule__KanbanSchedulingSystem__Group__4 : rule__KanbanSchedulingSystem__Group__4__Impl rule__KanbanSchedulingSystem__Group__5 ;
    public final void rule__KanbanSchedulingSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:525:1: ( rule__KanbanSchedulingSystem__Group__4__Impl rule__KanbanSchedulingSystem__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:526:2: rule__KanbanSchedulingSystem__Group__4__Impl rule__KanbanSchedulingSystem__Group__5
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__4__Impl_in_rule__KanbanSchedulingSystem__Group__41039);
            rule__KanbanSchedulingSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__5_in_rule__KanbanSchedulingSystem__Group__41042);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:533:1: rule__KanbanSchedulingSystem__Group__4__Impl : ( 'end Organization' ) ;
    public final void rule__KanbanSchedulingSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:537:1: ( ( 'end Organization' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:538:1: ( 'end Organization' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:538:1: ( 'end Organization' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:539:1: 'end Organization'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__KanbanSchedulingSystem__Group__4__Impl1070); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationKeyword_4()); 

            }


            }

        }
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:552:1: rule__KanbanSchedulingSystem__Group__5 : rule__KanbanSchedulingSystem__Group__5__Impl rule__KanbanSchedulingSystem__Group__6 ;
    public final void rule__KanbanSchedulingSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:556:1: ( rule__KanbanSchedulingSystem__Group__5__Impl rule__KanbanSchedulingSystem__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:557:2: rule__KanbanSchedulingSystem__Group__5__Impl rule__KanbanSchedulingSystem__Group__6
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__5__Impl_in_rule__KanbanSchedulingSystem__Group__51101);
            rule__KanbanSchedulingSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__6_in_rule__KanbanSchedulingSystem__Group__51104);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:564:1: rule__KanbanSchedulingSystem__Group__5__Impl : ( 'WorkItems' ) ;
    public final void rule__KanbanSchedulingSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:568:1: ( ( 'WorkItems' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:569:1: ( 'WorkItems' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:569:1: ( 'WorkItems' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:570:1: 'WorkItems'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__KanbanSchedulingSystem__Group__5__Impl1132); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsKeyword_5()); 

            }


            }

        }
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:583:1: rule__KanbanSchedulingSystem__Group__6 : rule__KanbanSchedulingSystem__Group__6__Impl rule__KanbanSchedulingSystem__Group__7 ;
    public final void rule__KanbanSchedulingSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:587:1: ( rule__KanbanSchedulingSystem__Group__6__Impl rule__KanbanSchedulingSystem__Group__7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:588:2: rule__KanbanSchedulingSystem__Group__6__Impl rule__KanbanSchedulingSystem__Group__7
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__6__Impl_in_rule__KanbanSchedulingSystem__Group__61163);
            rule__KanbanSchedulingSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__7_in_rule__KanbanSchedulingSystem__Group__61166);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:595:1: rule__KanbanSchedulingSystem__Group__6__Impl : ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:599:1: ( ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:600:1: ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:600:1: ( ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:601:1: ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) ) ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:601:1: ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:602:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:603:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:603:2: rule__KanbanSchedulingSystem__KssTasksAssignment_6
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1195);
            rule__KanbanSchedulingSystem__KssTasksAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:606:1: ( ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:607:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )*
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:608:1: ( rule__KanbanSchedulingSystem__KssTasksAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:608:2: rule__KanbanSchedulingSystem__KssTasksAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1207);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:619:1: rule__KanbanSchedulingSystem__Group__7 : rule__KanbanSchedulingSystem__Group__7__Impl rule__KanbanSchedulingSystem__Group__8 ;
    public final void rule__KanbanSchedulingSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:623:1: ( rule__KanbanSchedulingSystem__Group__7__Impl rule__KanbanSchedulingSystem__Group__8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:624:2: rule__KanbanSchedulingSystem__Group__7__Impl rule__KanbanSchedulingSystem__Group__8
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__7__Impl_in_rule__KanbanSchedulingSystem__Group__71240);
            rule__KanbanSchedulingSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__8_in_rule__KanbanSchedulingSystem__Group__71243);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:631:1: rule__KanbanSchedulingSystem__Group__7__Impl : ( 'end WorkItems' ) ;
    public final void rule__KanbanSchedulingSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:635:1: ( ( 'end WorkItems' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:636:1: ( 'end WorkItems' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:636:1: ( 'end WorkItems' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:637:1: 'end WorkItems'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemsKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__KanbanSchedulingSystem__Group__7__Impl1271); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemsKeyword_7()); 

            }


            }

        }
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:650:1: rule__KanbanSchedulingSystem__Group__8 : rule__KanbanSchedulingSystem__Group__8__Impl rule__KanbanSchedulingSystem__Group__9 ;
    public final void rule__KanbanSchedulingSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:654:1: ( rule__KanbanSchedulingSystem__Group__8__Impl rule__KanbanSchedulingSystem__Group__9 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:655:2: rule__KanbanSchedulingSystem__Group__8__Impl rule__KanbanSchedulingSystem__Group__9
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__8__Impl_in_rule__KanbanSchedulingSystem__Group__81302);
            rule__KanbanSchedulingSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__9_in_rule__KanbanSchedulingSystem__Group__81305);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:662:1: rule__KanbanSchedulingSystem__Group__8__Impl : ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8 ) ) ;
    public final void rule__KanbanSchedulingSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:666:1: ( ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:667:1: ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:667:1: ( ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:668:1: ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8 )
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowAssignment_8()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:669:1: ( rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:669:2: rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8_in_rule__KanbanSchedulingSystem__Group__8__Impl1332);
            rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowAssignment_8()); 

            }


            }

        }
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:679:1: rule__KanbanSchedulingSystem__Group__9 : rule__KanbanSchedulingSystem__Group__9__Impl ;
    public final void rule__KanbanSchedulingSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:683:1: ( rule__KanbanSchedulingSystem__Group__9__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:684:2: rule__KanbanSchedulingSystem__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__KanbanSchedulingSystem__Group__9__Impl_in_rule__KanbanSchedulingSystem__Group__91362);
            rule__KanbanSchedulingSystem__Group__9__Impl();

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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:690:1: rule__KanbanSchedulingSystem__Group__9__Impl : ( 'end KSSWorkFlowModel' ) ;
    public final void rule__KanbanSchedulingSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:694:1: ( ( 'end KSSWorkFlowModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:695:1: ( 'end KSSWorkFlowModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:695:1: ( 'end KSSWorkFlowModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:696:1: 'end KSSWorkFlowModel'
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSWorkFlowModelKeyword_9()); 
            match(input,20,FOLLOW_20_in_rule__KanbanSchedulingSystem__Group__9__Impl1390); 
             after(grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSWorkFlowModelKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Team__Group__0"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:729:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:733:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:734:2: rule__Team__Group__0__Impl rule__Team__Group__1
            {
            pushFollow(FOLLOW_rule__Team__Group__0__Impl_in_rule__Team__Group__01441);
            rule__Team__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__1_in_rule__Team__Group__01444);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:741:1: rule__Team__Group__0__Impl : ( ( rule__Team__Alternatives_0 ) ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:745:1: ( ( ( rule__Team__Alternatives_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:746:1: ( ( rule__Team__Alternatives_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:746:1: ( ( rule__Team__Alternatives_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:747:1: ( rule__Team__Alternatives_0 )
            {
             before(grammarAccess.getTeamAccess().getAlternatives_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:748:1: ( rule__Team__Alternatives_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:748:2: rule__Team__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Team__Alternatives_0_in_rule__Team__Group__0__Impl1471);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:758:1: rule__Team__Group__1 : rule__Team__Group__1__Impl rule__Team__Group__2 ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:762:1: ( rule__Team__Group__1__Impl rule__Team__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:763:2: rule__Team__Group__1__Impl rule__Team__Group__2
            {
            pushFollow(FOLLOW_rule__Team__Group__1__Impl_in_rule__Team__Group__11501);
            rule__Team__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__2_in_rule__Team__Group__11504);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:770:1: rule__Team__Group__1__Impl : ( ( rule__Team__NameAssignment_1 ) ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:774:1: ( ( ( rule__Team__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:775:1: ( ( rule__Team__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:775:1: ( ( rule__Team__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:776:1: ( rule__Team__NameAssignment_1 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:777:1: ( rule__Team__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:777:2: rule__Team__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Team__NameAssignment_1_in_rule__Team__Group__1__Impl1531);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:787:1: rule__Team__Group__2 : rule__Team__Group__2__Impl rule__Team__Group__3 ;
    public final void rule__Team__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:791:1: ( rule__Team__Group__2__Impl rule__Team__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:792:2: rule__Team__Group__2__Impl rule__Team__Group__3
            {
            pushFollow(FOLLOW_rule__Team__Group__2__Impl_in_rule__Team__Group__21561);
            rule__Team__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__3_in_rule__Team__Group__21564);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:799:1: rule__Team__Group__2__Impl : ( '{' ) ;
    public final void rule__Team__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:803:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:804:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:804:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:805:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Team__Group__2__Impl1592); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:818:1: rule__Team__Group__3 : rule__Team__Group__3__Impl rule__Team__Group__4 ;
    public final void rule__Team__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:822:1: ( rule__Team__Group__3__Impl rule__Team__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:823:2: rule__Team__Group__3__Impl rule__Team__Group__4
            {
            pushFollow(FOLLOW_rule__Team__Group__3__Impl_in_rule__Team__Group__31623);
            rule__Team__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__4_in_rule__Team__Group__31626);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:830:1: rule__Team__Group__3__Impl : ( ( rule__Team__Group_3__0 )? ) ;
    public final void rule__Team__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:834:1: ( ( ( rule__Team__Group_3__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:835:1: ( ( rule__Team__Group_3__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:835:1: ( ( rule__Team__Group_3__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:836:1: ( rule__Team__Group_3__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:837:1: ( rule__Team__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:837:2: rule__Team__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_3__0_in_rule__Team__Group__3__Impl1653);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:847:1: rule__Team__Group__4 : rule__Team__Group__4__Impl rule__Team__Group__5 ;
    public final void rule__Team__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:851:1: ( rule__Team__Group__4__Impl rule__Team__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:852:2: rule__Team__Group__4__Impl rule__Team__Group__5
            {
            pushFollow(FOLLOW_rule__Team__Group__4__Impl_in_rule__Team__Group__41684);
            rule__Team__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__5_in_rule__Team__Group__41687);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:859:1: rule__Team__Group__4__Impl : ( ( rule__Team__Group_4__0 )? ) ;
    public final void rule__Team__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:863:1: ( ( ( rule__Team__Group_4__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:864:1: ( ( rule__Team__Group_4__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:864:1: ( ( rule__Team__Group_4__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:865:1: ( rule__Team__Group_4__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:866:1: ( rule__Team__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:866:2: rule__Team__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_4__0_in_rule__Team__Group__4__Impl1714);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:876:1: rule__Team__Group__5 : rule__Team__Group__5__Impl rule__Team__Group__6 ;
    public final void rule__Team__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:880:1: ( rule__Team__Group__5__Impl rule__Team__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:881:2: rule__Team__Group__5__Impl rule__Team__Group__6
            {
            pushFollow(FOLLOW_rule__Team__Group__5__Impl_in_rule__Team__Group__51745);
            rule__Team__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__6_in_rule__Team__Group__51748);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:888:1: rule__Team__Group__5__Impl : ( ( rule__Team__Group_5__0 )? ) ;
    public final void rule__Team__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:892:1: ( ( ( rule__Team__Group_5__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:893:1: ( ( rule__Team__Group_5__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:893:1: ( ( rule__Team__Group_5__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:894:1: ( rule__Team__Group_5__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_5()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:895:1: ( rule__Team__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:895:2: rule__Team__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_5__0_in_rule__Team__Group__5__Impl1775);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:905:1: rule__Team__Group__6 : rule__Team__Group__6__Impl rule__Team__Group__7 ;
    public final void rule__Team__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:909:1: ( rule__Team__Group__6__Impl rule__Team__Group__7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:910:2: rule__Team__Group__6__Impl rule__Team__Group__7
            {
            pushFollow(FOLLOW_rule__Team__Group__6__Impl_in_rule__Team__Group__61806);
            rule__Team__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__7_in_rule__Team__Group__61809);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:917:1: rule__Team__Group__6__Impl : ( ( rule__Team__Group_6__0 )? ) ;
    public final void rule__Team__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:921:1: ( ( ( rule__Team__Group_6__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:922:1: ( ( rule__Team__Group_6__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:922:1: ( ( rule__Team__Group_6__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:923:1: ( rule__Team__Group_6__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:924:1: ( rule__Team__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:924:2: rule__Team__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_6__0_in_rule__Team__Group__6__Impl1836);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:934:1: rule__Team__Group__7 : rule__Team__Group__7__Impl rule__Team__Group__8 ;
    public final void rule__Team__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:938:1: ( rule__Team__Group__7__Impl rule__Team__Group__8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:939:2: rule__Team__Group__7__Impl rule__Team__Group__8
            {
            pushFollow(FOLLOW_rule__Team__Group__7__Impl_in_rule__Team__Group__71867);
            rule__Team__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group__8_in_rule__Team__Group__71870);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:946:1: rule__Team__Group__7__Impl : ( ( rule__Team__Group_7__0 )? ) ;
    public final void rule__Team__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:950:1: ( ( ( rule__Team__Group_7__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:951:1: ( ( rule__Team__Group_7__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:951:1: ( ( rule__Team__Group_7__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:952:1: ( rule__Team__Group_7__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_7()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:953:1: ( rule__Team__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:953:2: rule__Team__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Team__Group_7__0_in_rule__Team__Group__7__Impl1897);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:963:1: rule__Team__Group__8 : rule__Team__Group__8__Impl ;
    public final void rule__Team__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:967:1: ( rule__Team__Group__8__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:968:2: rule__Team__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group__8__Impl_in_rule__Team__Group__81928);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:974:1: rule__Team__Group__8__Impl : ( '}' ) ;
    public final void rule__Team__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:978:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:979:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:979:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:980:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_22_in_rule__Team__Group__8__Impl1956); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1011:1: rule__Team__Group_3__0 : rule__Team__Group_3__0__Impl rule__Team__Group_3__1 ;
    public final void rule__Team__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1015:1: ( rule__Team__Group_3__0__Impl rule__Team__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1016:2: rule__Team__Group_3__0__Impl rule__Team__Group_3__1
            {
            pushFollow(FOLLOW_rule__Team__Group_3__0__Impl_in_rule__Team__Group_3__02005);
            rule__Team__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_3__1_in_rule__Team__Group_3__02008);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1023:1: rule__Team__Group_3__0__Impl : ( 'sourceUnits' ) ;
    public final void rule__Team__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1027:1: ( ( 'sourceUnits' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1028:1: ( 'sourceUnits' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1028:1: ( 'sourceUnits' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1029:1: 'sourceUnits'
            {
             before(grammarAccess.getTeamAccess().getSourceUnitsKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Team__Group_3__0__Impl2036); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1042:1: rule__Team__Group_3__1 : rule__Team__Group_3__1__Impl rule__Team__Group_3__2 ;
    public final void rule__Team__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1046:1: ( rule__Team__Group_3__1__Impl rule__Team__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1047:2: rule__Team__Group_3__1__Impl rule__Team__Group_3__2
            {
            pushFollow(FOLLOW_rule__Team__Group_3__1__Impl_in_rule__Team__Group_3__12067);
            rule__Team__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_3__2_in_rule__Team__Group_3__12070);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1054:1: rule__Team__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1058:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1059:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1059:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1060:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,21,FOLLOW_21_in_rule__Team__Group_3__1__Impl2098); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1073:1: rule__Team__Group_3__2 : rule__Team__Group_3__2__Impl rule__Team__Group_3__3 ;
    public final void rule__Team__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1077:1: ( rule__Team__Group_3__2__Impl rule__Team__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1078:2: rule__Team__Group_3__2__Impl rule__Team__Group_3__3
            {
            pushFollow(FOLLOW_rule__Team__Group_3__2__Impl_in_rule__Team__Group_3__22129);
            rule__Team__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_3__3_in_rule__Team__Group_3__22132);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1085:1: rule__Team__Group_3__2__Impl : ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) ) ;
    public final void rule__Team__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1089:1: ( ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1090:1: ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1090:1: ( ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1091:1: ( ( rule__Team__DemandUnitsAssignment_3_2 ) ) ( ( rule__Team__DemandUnitsAssignment_3_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1091:1: ( ( rule__Team__DemandUnitsAssignment_3_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1092:1: ( rule__Team__DemandUnitsAssignment_3_2 )
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1093:1: ( rule__Team__DemandUnitsAssignment_3_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1093:2: rule__Team__DemandUnitsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2161);
            rule__Team__DemandUnitsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1096:1: ( ( rule__Team__DemandUnitsAssignment_3_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1097:1: ( rule__Team__DemandUnitsAssignment_3_2 )*
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1098:1: ( rule__Team__DemandUnitsAssignment_3_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1098:2: rule__Team__DemandUnitsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2173);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1109:1: rule__Team__Group_3__3 : rule__Team__Group_3__3__Impl ;
    public final void rule__Team__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1113:1: ( rule__Team__Group_3__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1114:2: rule__Team__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_3__3__Impl_in_rule__Team__Group_3__32206);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1120:1: rule__Team__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1124:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1125:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1125:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1126:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,22,FOLLOW_22_in_rule__Team__Group_3__3__Impl2234); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1147:1: rule__Team__Group_4__0 : rule__Team__Group_4__0__Impl rule__Team__Group_4__1 ;
    public final void rule__Team__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1151:1: ( rule__Team__Group_4__0__Impl rule__Team__Group_4__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1152:2: rule__Team__Group_4__0__Impl rule__Team__Group_4__1
            {
            pushFollow(FOLLOW_rule__Team__Group_4__0__Impl_in_rule__Team__Group_4__02273);
            rule__Team__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_4__1_in_rule__Team__Group_4__02276);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1159:1: rule__Team__Group_4__0__Impl : ( 'targetUnits' ) ;
    public final void rule__Team__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1163:1: ( ( 'targetUnits' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1164:1: ( 'targetUnits' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1164:1: ( 'targetUnits' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1165:1: 'targetUnits'
            {
             before(grammarAccess.getTeamAccess().getTargetUnitsKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__Team__Group_4__0__Impl2304); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1178:1: rule__Team__Group_4__1 : rule__Team__Group_4__1__Impl rule__Team__Group_4__2 ;
    public final void rule__Team__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1182:1: ( rule__Team__Group_4__1__Impl rule__Team__Group_4__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1183:2: rule__Team__Group_4__1__Impl rule__Team__Group_4__2
            {
            pushFollow(FOLLOW_rule__Team__Group_4__1__Impl_in_rule__Team__Group_4__12335);
            rule__Team__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_4__2_in_rule__Team__Group_4__12338);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1190:1: rule__Team__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1194:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1195:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1195:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1196:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,21,FOLLOW_21_in_rule__Team__Group_4__1__Impl2366); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1209:1: rule__Team__Group_4__2 : rule__Team__Group_4__2__Impl rule__Team__Group_4__3 ;
    public final void rule__Team__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1213:1: ( rule__Team__Group_4__2__Impl rule__Team__Group_4__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1214:2: rule__Team__Group_4__2__Impl rule__Team__Group_4__3
            {
            pushFollow(FOLLOW_rule__Team__Group_4__2__Impl_in_rule__Team__Group_4__22397);
            rule__Team__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_4__3_in_rule__Team__Group_4__22400);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1221:1: rule__Team__Group_4__2__Impl : ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) ) ;
    public final void rule__Team__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1225:1: ( ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1226:1: ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1226:1: ( ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1227:1: ( ( rule__Team__SourcedUnitsAssignment_4_2 ) ) ( ( rule__Team__SourcedUnitsAssignment_4_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1227:1: ( ( rule__Team__SourcedUnitsAssignment_4_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1228:1: ( rule__Team__SourcedUnitsAssignment_4_2 )
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1229:1: ( rule__Team__SourcedUnitsAssignment_4_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1229:2: rule__Team__SourcedUnitsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl2429);
            rule__Team__SourcedUnitsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1232:1: ( ( rule__Team__SourcedUnitsAssignment_4_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1233:1: ( rule__Team__SourcedUnitsAssignment_4_2 )*
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1234:1: ( rule__Team__SourcedUnitsAssignment_4_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1234:2: rule__Team__SourcedUnitsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl2441);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1245:1: rule__Team__Group_4__3 : rule__Team__Group_4__3__Impl ;
    public final void rule__Team__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1249:1: ( rule__Team__Group_4__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1250:2: rule__Team__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_4__3__Impl_in_rule__Team__Group_4__32474);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1256:1: rule__Team__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1260:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1261:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1261:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1262:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,22,FOLLOW_22_in_rule__Team__Group_4__3__Impl2502); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1283:1: rule__Team__Group_5__0 : rule__Team__Group_5__0__Impl rule__Team__Group_5__1 ;
    public final void rule__Team__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1287:1: ( rule__Team__Group_5__0__Impl rule__Team__Group_5__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1288:2: rule__Team__Group_5__0__Impl rule__Team__Group_5__1
            {
            pushFollow(FOLLOW_rule__Team__Group_5__0__Impl_in_rule__Team__Group_5__02541);
            rule__Team__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_5__1_in_rule__Team__Group_5__02544);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1295:1: rule__Team__Group_5__0__Impl : ( 'contains' ) ;
    public final void rule__Team__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1299:1: ( ( 'contains' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1300:1: ( 'contains' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1300:1: ( 'contains' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1301:1: 'contains'
            {
             before(grammarAccess.getTeamAccess().getContainsKeyword_5_0()); 
            match(input,25,FOLLOW_25_in_rule__Team__Group_5__0__Impl2572); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1314:1: rule__Team__Group_5__1 : rule__Team__Group_5__1__Impl rule__Team__Group_5__2 ;
    public final void rule__Team__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1318:1: ( rule__Team__Group_5__1__Impl rule__Team__Group_5__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1319:2: rule__Team__Group_5__1__Impl rule__Team__Group_5__2
            {
            pushFollow(FOLLOW_rule__Team__Group_5__1__Impl_in_rule__Team__Group_5__12603);
            rule__Team__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_5__2_in_rule__Team__Group_5__12606);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1326:1: rule__Team__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1330:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1331:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1331:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1332:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FOLLOW_21_in_rule__Team__Group_5__1__Impl2634); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1345:1: rule__Team__Group_5__2 : rule__Team__Group_5__2__Impl rule__Team__Group_5__3 ;
    public final void rule__Team__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1349:1: ( rule__Team__Group_5__2__Impl rule__Team__Group_5__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1350:2: rule__Team__Group_5__2__Impl rule__Team__Group_5__3
            {
            pushFollow(FOLLOW_rule__Team__Group_5__2__Impl_in_rule__Team__Group_5__22665);
            rule__Team__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_5__3_in_rule__Team__Group_5__22668);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1357:1: rule__Team__Group_5__2__Impl : ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) ) ;
    public final void rule__Team__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1361:1: ( ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1362:1: ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1362:1: ( ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1363:1: ( ( rule__Team__GroupmembersAssignment_5_2 ) ) ( ( rule__Team__GroupmembersAssignment_5_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1363:1: ( ( rule__Team__GroupmembersAssignment_5_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1364:1: ( rule__Team__GroupmembersAssignment_5_2 )
            {
             before(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1365:1: ( rule__Team__GroupmembersAssignment_5_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1365:2: rule__Team__GroupmembersAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl2697);
            rule__Team__GroupmembersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1368:1: ( ( rule__Team__GroupmembersAssignment_5_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1369:1: ( rule__Team__GroupmembersAssignment_5_2 )*
            {
             before(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1370:1: ( rule__Team__GroupmembersAssignment_5_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1370:2: rule__Team__GroupmembersAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl2709);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1381:1: rule__Team__Group_5__3 : rule__Team__Group_5__3__Impl ;
    public final void rule__Team__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1385:1: ( rule__Team__Group_5__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1386:2: rule__Team__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_5__3__Impl_in_rule__Team__Group_5__32742);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1392:1: rule__Team__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1396:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1397:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1397:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1398:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,22,FOLLOW_22_in_rule__Team__Group_5__3__Impl2770); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1419:1: rule__Team__Group_6__0 : rule__Team__Group_6__0__Impl rule__Team__Group_6__1 ;
    public final void rule__Team__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1423:1: ( rule__Team__Group_6__0__Impl rule__Team__Group_6__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1424:2: rule__Team__Group_6__0__Impl rule__Team__Group_6__1
            {
            pushFollow(FOLLOW_rule__Team__Group_6__0__Impl_in_rule__Team__Group_6__02809);
            rule__Team__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_6__1_in_rule__Team__Group_6__02812);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1431:1: rule__Team__Group_6__0__Impl : ( 'resources' ) ;
    public final void rule__Team__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1435:1: ( ( 'resources' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1436:1: ( 'resources' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1436:1: ( 'resources' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1437:1: 'resources'
            {
             before(grammarAccess.getTeamAccess().getResourcesKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__Team__Group_6__0__Impl2840); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1450:1: rule__Team__Group_6__1 : rule__Team__Group_6__1__Impl rule__Team__Group_6__2 ;
    public final void rule__Team__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1454:1: ( rule__Team__Group_6__1__Impl rule__Team__Group_6__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1455:2: rule__Team__Group_6__1__Impl rule__Team__Group_6__2
            {
            pushFollow(FOLLOW_rule__Team__Group_6__1__Impl_in_rule__Team__Group_6__12871);
            rule__Team__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_6__2_in_rule__Team__Group_6__12874);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1462:1: rule__Team__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1466:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1467:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1467:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1468:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,21,FOLLOW_21_in_rule__Team__Group_6__1__Impl2902); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1481:1: rule__Team__Group_6__2 : rule__Team__Group_6__2__Impl rule__Team__Group_6__3 ;
    public final void rule__Team__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1485:1: ( rule__Team__Group_6__2__Impl rule__Team__Group_6__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1486:2: rule__Team__Group_6__2__Impl rule__Team__Group_6__3
            {
            pushFollow(FOLLOW_rule__Team__Group_6__2__Impl_in_rule__Team__Group_6__22933);
            rule__Team__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_6__3_in_rule__Team__Group_6__22936);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1493:1: rule__Team__Group_6__2__Impl : ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) ) ;
    public final void rule__Team__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1497:1: ( ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1498:1: ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1498:1: ( ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1499:1: ( ( rule__Team__ResourcesAssignment_6_2 ) ) ( ( rule__Team__ResourcesAssignment_6_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1499:1: ( ( rule__Team__ResourcesAssignment_6_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1500:1: ( rule__Team__ResourcesAssignment_6_2 )
            {
             before(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1501:1: ( rule__Team__ResourcesAssignment_6_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1501:2: rule__Team__ResourcesAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl2965);
            rule__Team__ResourcesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1504:1: ( ( rule__Team__ResourcesAssignment_6_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1505:1: ( rule__Team__ResourcesAssignment_6_2 )*
            {
             before(grammarAccess.getTeamAccess().getResourcesAssignment_6_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1506:1: ( rule__Team__ResourcesAssignment_6_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1506:2: rule__Team__ResourcesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl2977);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1517:1: rule__Team__Group_6__3 : rule__Team__Group_6__3__Impl ;
    public final void rule__Team__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1521:1: ( rule__Team__Group_6__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1522:2: rule__Team__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_6__3__Impl_in_rule__Team__Group_6__33010);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1528:1: rule__Team__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1532:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1533:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1533:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1534:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,22,FOLLOW_22_in_rule__Team__Group_6__3__Impl3038); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1555:1: rule__Team__Group_7__0 : rule__Team__Group_7__0__Impl rule__Team__Group_7__1 ;
    public final void rule__Team__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1559:1: ( rule__Team__Group_7__0__Impl rule__Team__Group_7__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1560:2: rule__Team__Group_7__0__Impl rule__Team__Group_7__1
            {
            pushFollow(FOLLOW_rule__Team__Group_7__0__Impl_in_rule__Team__Group_7__03077);
            rule__Team__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_7__1_in_rule__Team__Group_7__03080);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1567:1: rule__Team__Group_7__0__Impl : ( 'services' ) ;
    public final void rule__Team__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1571:1: ( ( 'services' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1572:1: ( 'services' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1572:1: ( 'services' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1573:1: 'services'
            {
             before(grammarAccess.getTeamAccess().getServicesKeyword_7_0()); 
            match(input,27,FOLLOW_27_in_rule__Team__Group_7__0__Impl3108); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1586:1: rule__Team__Group_7__1 : rule__Team__Group_7__1__Impl rule__Team__Group_7__2 ;
    public final void rule__Team__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1590:1: ( rule__Team__Group_7__1__Impl rule__Team__Group_7__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1591:2: rule__Team__Group_7__1__Impl rule__Team__Group_7__2
            {
            pushFollow(FOLLOW_rule__Team__Group_7__1__Impl_in_rule__Team__Group_7__13139);
            rule__Team__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_7__2_in_rule__Team__Group_7__13142);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1598:1: rule__Team__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Team__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1602:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1603:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1603:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1604:1: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,21,FOLLOW_21_in_rule__Team__Group_7__1__Impl3170); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1617:1: rule__Team__Group_7__2 : rule__Team__Group_7__2__Impl rule__Team__Group_7__3 ;
    public final void rule__Team__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1621:1: ( rule__Team__Group_7__2__Impl rule__Team__Group_7__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1622:2: rule__Team__Group_7__2__Impl rule__Team__Group_7__3
            {
            pushFollow(FOLLOW_rule__Team__Group_7__2__Impl_in_rule__Team__Group_7__23201);
            rule__Team__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Team__Group_7__3_in_rule__Team__Group_7__23204);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1629:1: rule__Team__Group_7__2__Impl : ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) ) ;
    public final void rule__Team__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1633:1: ( ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1634:1: ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1634:1: ( ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1635:1: ( ( rule__Team__ServicesAssignment_7_2 ) ) ( ( rule__Team__ServicesAssignment_7_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1635:1: ( ( rule__Team__ServicesAssignment_7_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1636:1: ( rule__Team__ServicesAssignment_7_2 )
            {
             before(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1637:1: ( rule__Team__ServicesAssignment_7_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1637:2: rule__Team__ServicesAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl3233);
            rule__Team__ServicesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1640:1: ( ( rule__Team__ServicesAssignment_7_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1641:1: ( rule__Team__ServicesAssignment_7_2 )*
            {
             before(grammarAccess.getTeamAccess().getServicesAssignment_7_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1642:1: ( rule__Team__ServicesAssignment_7_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1642:2: rule__Team__ServicesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl3245);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1653:1: rule__Team__Group_7__3 : rule__Team__Group_7__3__Impl ;
    public final void rule__Team__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1657:1: ( rule__Team__Group_7__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1658:2: rule__Team__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Team__Group_7__3__Impl_in_rule__Team__Group_7__33278);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1664:1: rule__Team__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Team__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1668:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1669:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1669:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1670:1: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,22,FOLLOW_22_in_rule__Team__Group_7__3__Impl3306); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1691:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1695:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1696:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__03345);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__03348);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1703:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1707:1: ( ( 'service' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1708:1: ( 'service' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1708:1: ( 'service' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1709:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Service__Group__0__Impl3376); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1722:1: rule__Service__Group__1 : rule__Service__Group__1__Impl ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1726:1: ( rule__Service__Group__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1727:2: rule__Service__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__13407);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1733:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1737:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1738:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1738:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1739:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1740:1: ( rule__Service__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1740:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl3434);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1754:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1758:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1759:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03468);
            rule__Asset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03471);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1766:1: rule__Asset__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1770:1: ( ( 'resource' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1771:1: ( 'resource' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1771:1: ( 'resource' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1772:1: 'resource'
            {
             before(grammarAccess.getAssetAccess().getResourceKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Asset__Group__0__Impl3499); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1785:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl rule__Asset__Group__2 ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1789:1: ( rule__Asset__Group__1__Impl rule__Asset__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1790:2: rule__Asset__Group__1__Impl rule__Asset__Group__2
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13530);
            rule__Asset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13533);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1797:1: rule__Asset__Group__1__Impl : ( ( rule__Asset__NameAssignment_1 ) ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1801:1: ( ( ( rule__Asset__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1802:1: ( ( rule__Asset__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1802:1: ( ( rule__Asset__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1803:1: ( rule__Asset__NameAssignment_1 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1804:1: ( rule__Asset__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1804:2: rule__Asset__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl3560);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1814:1: rule__Asset__Group__2 : rule__Asset__Group__2__Impl ;
    public final void rule__Asset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1818:1: ( rule__Asset__Group__2__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1819:2: rule__Asset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23590);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1825:1: rule__Asset__Group__2__Impl : ( ( rule__Asset__Group_2__0 )? ) ;
    public final void rule__Asset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1829:1: ( ( ( rule__Asset__Group_2__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1830:1: ( ( rule__Asset__Group_2__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1830:1: ( ( rule__Asset__Group_2__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1831:1: ( rule__Asset__Group_2__0 )?
            {
             before(grammarAccess.getAssetAccess().getGroup_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1832:1: ( rule__Asset__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1832:2: rule__Asset__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl3617);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1848:1: rule__Asset__Group_2__0 : rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 ;
    public final void rule__Asset__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1852:1: ( rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1853:2: rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__03654);
            rule__Asset__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__03657);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1860:1: rule__Asset__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Asset__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1864:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1865:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1865:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1866:1: '{'
            {
             before(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Asset__Group_2__0__Impl3685); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1879:1: rule__Asset__Group_2__1 : rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2 ;
    public final void rule__Asset__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1883:1: ( rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1884:2: rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__13716);
            rule__Asset__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__2_in_rule__Asset__Group_2__13719);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1891:1: rule__Asset__Group_2__1__Impl : ( 'skills' ) ;
    public final void rule__Asset__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1895:1: ( ( 'skills' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1896:1: ( 'skills' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1896:1: ( 'skills' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1897:1: 'skills'
            {
             before(grammarAccess.getAssetAccess().getSkillsKeyword_2_1()); 
            match(input,30,FOLLOW_30_in_rule__Asset__Group_2__1__Impl3747); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1910:1: rule__Asset__Group_2__2 : rule__Asset__Group_2__2__Impl rule__Asset__Group_2__3 ;
    public final void rule__Asset__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1914:1: ( rule__Asset__Group_2__2__Impl rule__Asset__Group_2__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1915:2: rule__Asset__Group_2__2__Impl rule__Asset__Group_2__3
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__2__Impl_in_rule__Asset__Group_2__23778);
            rule__Asset__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__3_in_rule__Asset__Group_2__23781);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1922:1: rule__Asset__Group_2__2__Impl : ( '{' ) ;
    public final void rule__Asset__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1926:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1927:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1927:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1928:1: '{'
            {
             before(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,21,FOLLOW_21_in_rule__Asset__Group_2__2__Impl3809); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1941:1: rule__Asset__Group_2__3 : rule__Asset__Group_2__3__Impl rule__Asset__Group_2__4 ;
    public final void rule__Asset__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1945:1: ( rule__Asset__Group_2__3__Impl rule__Asset__Group_2__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1946:2: rule__Asset__Group_2__3__Impl rule__Asset__Group_2__4
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__3__Impl_in_rule__Asset__Group_2__33840);
            rule__Asset__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__4_in_rule__Asset__Group_2__33843);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1953:1: rule__Asset__Group_2__3__Impl : ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) ) ;
    public final void rule__Asset__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1957:1: ( ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1958:1: ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1958:1: ( ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1959:1: ( ( rule__Asset__HasSkillsAssignment_2_3 ) ) ( ( rule__Asset__HasSkillsAssignment_2_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1959:1: ( ( rule__Asset__HasSkillsAssignment_2_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1960:1: ( rule__Asset__HasSkillsAssignment_2_3 )
            {
             before(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1961:1: ( rule__Asset__HasSkillsAssignment_2_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1961:2: rule__Asset__HasSkillsAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl3872);
            rule__Asset__HasSkillsAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1964:1: ( ( rule__Asset__HasSkillsAssignment_2_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1965:1: ( rule__Asset__HasSkillsAssignment_2_3 )*
            {
             before(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1966:1: ( rule__Asset__HasSkillsAssignment_2_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1966:2: rule__Asset__HasSkillsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl3884);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1977:1: rule__Asset__Group_2__4 : rule__Asset__Group_2__4__Impl rule__Asset__Group_2__5 ;
    public final void rule__Asset__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1981:1: ( rule__Asset__Group_2__4__Impl rule__Asset__Group_2__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1982:2: rule__Asset__Group_2__4__Impl rule__Asset__Group_2__5
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__4__Impl_in_rule__Asset__Group_2__43917);
            rule__Asset__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__5_in_rule__Asset__Group_2__43920);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1989:1: rule__Asset__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Asset__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1993:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1994:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1994:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:1995:1: '}'
            {
             before(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,22,FOLLOW_22_in_rule__Asset__Group_2__4__Impl3948); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2008:1: rule__Asset__Group_2__5 : rule__Asset__Group_2__5__Impl ;
    public final void rule__Asset__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2012:1: ( rule__Asset__Group_2__5__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2013:2: rule__Asset__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__5__Impl_in_rule__Asset__Group_2__53979);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2019:1: rule__Asset__Group_2__5__Impl : ( '}' ) ;
    public final void rule__Asset__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2023:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2024:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2024:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2025:1: '}'
            {
             before(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,22,FOLLOW_22_in_rule__Asset__Group_2__5__Impl4007); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2050:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2054:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2055:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__04050);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__04053);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2062:1: rule__Dependency__Group__0__Impl : ( ( rule__Dependency__SourceTaskAssignment_0 ) ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2066:1: ( ( ( rule__Dependency__SourceTaskAssignment_0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2067:1: ( ( rule__Dependency__SourceTaskAssignment_0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2067:1: ( ( rule__Dependency__SourceTaskAssignment_0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2068:1: ( rule__Dependency__SourceTaskAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getSourceTaskAssignment_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2069:1: ( rule__Dependency__SourceTaskAssignment_0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2069:2: rule__Dependency__SourceTaskAssignment_0
            {
            pushFollow(FOLLOW_rule__Dependency__SourceTaskAssignment_0_in_rule__Dependency__Group__0__Impl4080);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2079:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2083:1: ( rule__Dependency__Group__1__Impl rule__Dependency__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2084:2: rule__Dependency__Group__1__Impl rule__Dependency__Group__2
            {
            pushFollow(FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__14110);
            rule__Dependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__14113);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2091:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__Alternatives_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2095:1: ( ( ( rule__Dependency__Alternatives_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2096:1: ( ( rule__Dependency__Alternatives_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2096:1: ( ( rule__Dependency__Alternatives_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2097:1: ( rule__Dependency__Alternatives_1 )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2098:1: ( rule__Dependency__Alternatives_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2098:2: rule__Dependency__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Dependency__Alternatives_1_in_rule__Dependency__Group__1__Impl4140);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2108:1: rule__Dependency__Group__2 : rule__Dependency__Group__2__Impl ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2112:1: ( rule__Dependency__Group__2__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2113:2: rule__Dependency__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__24170);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2119:1: rule__Dependency__Group__2__Impl : ( ( rule__Dependency__TargetTaskAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2123:1: ( ( ( rule__Dependency__TargetTaskAssignment_2 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2124:1: ( ( rule__Dependency__TargetTaskAssignment_2 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2124:1: ( ( rule__Dependency__TargetTaskAssignment_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2125:1: ( rule__Dependency__TargetTaskAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getTargetTaskAssignment_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2126:1: ( rule__Dependency__TargetTaskAssignment_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2126:2: rule__Dependency__TargetTaskAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__TargetTaskAssignment_2_in_rule__Dependency__Group__2__Impl4197);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2142:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2146:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2147:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__04233);
            rule__Requirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__04236);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2154:1: rule__Requirement__Group__0__Impl : ( 'requirement' ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2158:1: ( ( 'requirement' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2159:1: ( 'requirement' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2159:1: ( 'requirement' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2160:1: 'requirement'
            {
             before(grammarAccess.getRequirementAccess().getRequirementKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Requirement__Group__0__Impl4264); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2173:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2177:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2178:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__14295);
            rule__Requirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__14298);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2185:1: rule__Requirement__Group__1__Impl : ( ( rule__Requirement__NameAssignment_1 ) ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2189:1: ( ( ( rule__Requirement__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2190:1: ( ( rule__Requirement__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2190:1: ( ( rule__Requirement__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2191:1: ( rule__Requirement__NameAssignment_1 )
            {
             before(grammarAccess.getRequirementAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2192:1: ( rule__Requirement__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2192:2: rule__Requirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Requirement__NameAssignment_1_in_rule__Requirement__Group__1__Impl4325);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2202:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl rule__Requirement__Group__3 ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2206:1: ( rule__Requirement__Group__2__Impl rule__Requirement__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2207:2: rule__Requirement__Group__2__Impl rule__Requirement__Group__3
            {
            pushFollow(FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__24355);
            rule__Requirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__24358);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2214:1: rule__Requirement__Group__2__Impl : ( '{' ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2218:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2219:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2219:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2220:1: '{'
            {
             before(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Requirement__Group__2__Impl4386); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2233:1: rule__Requirement__Group__3 : rule__Requirement__Group__3__Impl rule__Requirement__Group__4 ;
    public final void rule__Requirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2237:1: ( rule__Requirement__Group__3__Impl rule__Requirement__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2238:2: rule__Requirement__Group__3__Impl rule__Requirement__Group__4
            {
            pushFollow(FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__34417);
            rule__Requirement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__4_in_rule__Requirement__Group__34420);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2245:1: rule__Requirement__Group__3__Impl : ( ( rule__Requirement__Group_3__0 ) ) ;
    public final void rule__Requirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2249:1: ( ( ( rule__Requirement__Group_3__0 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2250:1: ( ( rule__Requirement__Group_3__0 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2250:1: ( ( rule__Requirement__Group_3__0 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2251:1: ( rule__Requirement__Group_3__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2252:1: ( rule__Requirement__Group_3__0 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2252:2: rule__Requirement__Group_3__0
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl4447);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2262:1: rule__Requirement__Group__4 : rule__Requirement__Group__4__Impl rule__Requirement__Group__5 ;
    public final void rule__Requirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2266:1: ( rule__Requirement__Group__4__Impl rule__Requirement__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2267:2: rule__Requirement__Group__4__Impl rule__Requirement__Group__5
            {
            pushFollow(FOLLOW_rule__Requirement__Group__4__Impl_in_rule__Requirement__Group__44477);
            rule__Requirement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__5_in_rule__Requirement__Group__44480);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2274:1: rule__Requirement__Group__4__Impl : ( ( rule__Requirement__Group_4__0 )? ) ;
    public final void rule__Requirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2278:1: ( ( ( rule__Requirement__Group_4__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2279:1: ( ( rule__Requirement__Group_4__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2279:1: ( ( rule__Requirement__Group_4__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2280:1: ( rule__Requirement__Group_4__0 )?
            {
             before(grammarAccess.getRequirementAccess().getGroup_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2281:1: ( rule__Requirement__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2281:2: rule__Requirement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Requirement__Group_4__0_in_rule__Requirement__Group__4__Impl4507);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2291:1: rule__Requirement__Group__5 : rule__Requirement__Group__5__Impl ;
    public final void rule__Requirement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2295:1: ( rule__Requirement__Group__5__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2296:2: rule__Requirement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group__5__Impl_in_rule__Requirement__Group__54538);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2302:1: rule__Requirement__Group__5__Impl : ( '}' ) ;
    public final void rule__Requirement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2306:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2307:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2307:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2308:1: '}'
            {
             before(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Requirement__Group__5__Impl4566); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2333:1: rule__Requirement__Group_3__0 : rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 ;
    public final void rule__Requirement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2337:1: ( rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2338:2: rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__04609);
            rule__Requirement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__04612);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2345:1: rule__Requirement__Group_3__0__Impl : ( 'workItems' ) ;
    public final void rule__Requirement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2349:1: ( ( 'workItems' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2350:1: ( 'workItems' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2350:1: ( 'workItems' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2351:1: 'workItems'
            {
             before(grammarAccess.getRequirementAccess().getWorkItemsKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__Requirement__Group_3__0__Impl4640); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2364:1: rule__Requirement__Group_3__1 : rule__Requirement__Group_3__1__Impl rule__Requirement__Group_3__2 ;
    public final void rule__Requirement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2368:1: ( rule__Requirement__Group_3__1__Impl rule__Requirement__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2369:2: rule__Requirement__Group_3__1__Impl rule__Requirement__Group_3__2
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__14671);
            rule__Requirement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__2_in_rule__Requirement__Group_3__14674);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2376:1: rule__Requirement__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Requirement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2380:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2381:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2381:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2382:1: '{'
            {
             before(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,21,FOLLOW_21_in_rule__Requirement__Group_3__1__Impl4702); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2395:1: rule__Requirement__Group_3__2 : rule__Requirement__Group_3__2__Impl rule__Requirement__Group_3__3 ;
    public final void rule__Requirement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2399:1: ( rule__Requirement__Group_3__2__Impl rule__Requirement__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2400:2: rule__Requirement__Group_3__2__Impl rule__Requirement__Group_3__3
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__2__Impl_in_rule__Requirement__Group_3__24733);
            rule__Requirement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__3_in_rule__Requirement__Group_3__24736);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2407:1: rule__Requirement__Group_3__2__Impl : ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) ) ;
    public final void rule__Requirement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2411:1: ( ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2412:1: ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2412:1: ( ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2413:1: ( ( rule__Requirement__RTasksAssignment_3_2 ) ) ( ( rule__Requirement__RTasksAssignment_3_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2413:1: ( ( rule__Requirement__RTasksAssignment_3_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2414:1: ( rule__Requirement__RTasksAssignment_3_2 )
            {
             before(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2415:1: ( rule__Requirement__RTasksAssignment_3_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2415:2: rule__Requirement__RTasksAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl4765);
            rule__Requirement__RTasksAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2418:1: ( ( rule__Requirement__RTasksAssignment_3_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2419:1: ( rule__Requirement__RTasksAssignment_3_2 )*
            {
             before(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2420:1: ( rule__Requirement__RTasksAssignment_3_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2420:2: rule__Requirement__RTasksAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl4777);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2431:1: rule__Requirement__Group_3__3 : rule__Requirement__Group_3__3__Impl ;
    public final void rule__Requirement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2435:1: ( rule__Requirement__Group_3__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2436:2: rule__Requirement__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__3__Impl_in_rule__Requirement__Group_3__34810);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2442:1: rule__Requirement__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Requirement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2446:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2447:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2447:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2448:1: '}'
            {
             before(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,22,FOLLOW_22_in_rule__Requirement__Group_3__3__Impl4838); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2469:1: rule__Requirement__Group_4__0 : rule__Requirement__Group_4__0__Impl rule__Requirement__Group_4__1 ;
    public final void rule__Requirement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2473:1: ( rule__Requirement__Group_4__0__Impl rule__Requirement__Group_4__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2474:2: rule__Requirement__Group_4__0__Impl rule__Requirement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group_4__0__Impl_in_rule__Requirement__Group_4__04877);
            rule__Requirement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_4__1_in_rule__Requirement__Group_4__04880);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2481:1: rule__Requirement__Group_4__0__Impl : ( 'workItemNetwork' ) ;
    public final void rule__Requirement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2485:1: ( ( 'workItemNetwork' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2486:1: ( 'workItemNetwork' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2486:1: ( 'workItemNetwork' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2487:1: 'workItemNetwork'
            {
             before(grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__Requirement__Group_4__0__Impl4908); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2500:1: rule__Requirement__Group_4__1 : rule__Requirement__Group_4__1__Impl ;
    public final void rule__Requirement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2504:1: ( rule__Requirement__Group_4__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2505:2: rule__Requirement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group_4__1__Impl_in_rule__Requirement__Group_4__14939);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2511:1: rule__Requirement__Group_4__1__Impl : ( ( rule__Requirement__DependenciesAssignment_4_1 )* ) ;
    public final void rule__Requirement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2515:1: ( ( ( rule__Requirement__DependenciesAssignment_4_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2516:1: ( ( rule__Requirement__DependenciesAssignment_4_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2516:1: ( ( rule__Requirement__DependenciesAssignment_4_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2517:1: ( rule__Requirement__DependenciesAssignment_4_1 )*
            {
             before(grammarAccess.getRequirementAccess().getDependenciesAssignment_4_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2518:1: ( rule__Requirement__DependenciesAssignment_4_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2518:2: rule__Requirement__DependenciesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Requirement__DependenciesAssignment_4_1_in_rule__Requirement__Group_4__1__Impl4966);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2532:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2536:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2537:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__05001);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05004);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2544:1: rule__Task__Group__0__Impl : ( 'workItem' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2548:1: ( ( 'workItem' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2549:1: ( 'workItem' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2549:1: ( 'workItem' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2550:1: 'workItem'
            {
             before(grammarAccess.getTaskAccess().getWorkItemKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Task__Group__0__Impl5032); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2563:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2567:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2568:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__15063);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__2_in_rule__Task__Group__15066);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2575:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2579:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2580:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2580:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2581:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2582:1: ( rule__Task__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2582:2: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl5093);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2592:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2596:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2597:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_rule__Task__Group__2__Impl_in_rule__Task__Group__25123);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__3_in_rule__Task__Group__25126);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2604:1: rule__Task__Group__2__Impl : ( '{' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2608:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2609:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2609:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2610:1: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Task__Group__2__Impl5154); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2623:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2627:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2628:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_rule__Task__Group__3__Impl_in_rule__Task__Group__35185);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__4_in_rule__Task__Group__35188);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2635:1: rule__Task__Group__3__Impl : ( ( rule__Task__Group_3__0 )? ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2639:1: ( ( ( rule__Task__Group_3__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2640:1: ( ( rule__Task__Group_3__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2640:1: ( ( rule__Task__Group_3__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2641:1: ( rule__Task__Group_3__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2642:1: ( rule__Task__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2642:2: rule__Task__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_3__0_in_rule__Task__Group__3__Impl5215);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2652:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2656:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2657:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_rule__Task__Group__4__Impl_in_rule__Task__Group__45246);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__5_in_rule__Task__Group__45249);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2664:1: rule__Task__Group__4__Impl : ( ( rule__Task__Group_4__0 )? ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2668:1: ( ( ( rule__Task__Group_4__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2669:1: ( ( rule__Task__Group_4__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2669:1: ( ( rule__Task__Group_4__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2670:1: ( rule__Task__Group_4__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_4()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2671:1: ( rule__Task__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2671:2: rule__Task__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_4__0_in_rule__Task__Group__4__Impl5276);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2681:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2685:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2686:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_rule__Task__Group__5__Impl_in_rule__Task__Group__55307);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__6_in_rule__Task__Group__55310);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2693:1: rule__Task__Group__5__Impl : ( ( rule__Task__Group_5__0 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2697:1: ( ( ( rule__Task__Group_5__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2698:1: ( ( rule__Task__Group_5__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2698:1: ( ( rule__Task__Group_5__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2699:1: ( rule__Task__Group_5__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_5()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2700:1: ( rule__Task__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2700:2: rule__Task__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_5__0_in_rule__Task__Group__5__Impl5337);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2710:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2714:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2715:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_rule__Task__Group__6__Impl_in_rule__Task__Group__65368);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__7_in_rule__Task__Group__65371);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2722:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2726:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2727:1: ( ( rule__Task__Group_6__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2727:1: ( ( rule__Task__Group_6__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2728:1: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2729:1: ( rule__Task__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2729:2: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_6__0_in_rule__Task__Group__6__Impl5398);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2739:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2743:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2744:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_rule__Task__Group__7__Impl_in_rule__Task__Group__75429);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group__8_in_rule__Task__Group__75432);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2751:1: rule__Task__Group__7__Impl : ( ( rule__Task__Group_7__0 )? ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2755:1: ( ( ( rule__Task__Group_7__0 )? ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2756:1: ( ( rule__Task__Group_7__0 )? )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2756:1: ( ( rule__Task__Group_7__0 )? )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2757:1: ( rule__Task__Group_7__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_7()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2758:1: ( rule__Task__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2758:2: rule__Task__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Task__Group_7__0_in_rule__Task__Group__7__Impl5459);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2768:1: rule__Task__Group__8 : rule__Task__Group__8__Impl ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2772:1: ( rule__Task__Group__8__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2773:2: rule__Task__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group__8__Impl_in_rule__Task__Group__85490);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2779:1: rule__Task__Group__8__Impl : ( '}' ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2783:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2784:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2784:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2785:1: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_22_in_rule__Task__Group__8__Impl5518); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2816:1: rule__Task__Group_3__0 : rule__Task__Group_3__0__Impl rule__Task__Group_3__1 ;
    public final void rule__Task__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2820:1: ( rule__Task__Group_3__0__Impl rule__Task__Group_3__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2821:2: rule__Task__Group_3__0__Impl rule__Task__Group_3__1
            {
            pushFollow(FOLLOW_rule__Task__Group_3__0__Impl_in_rule__Task__Group_3__05567);
            rule__Task__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_3__1_in_rule__Task__Group_3__05570);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2828:1: rule__Task__Group_3__0__Impl : ( 'subtasks' ) ;
    public final void rule__Task__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2832:1: ( ( 'subtasks' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2833:1: ( 'subtasks' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2833:1: ( 'subtasks' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2834:1: 'subtasks'
            {
             before(grammarAccess.getTaskAccess().getSubtasksKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__Task__Group_3__0__Impl5598); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2847:1: rule__Task__Group_3__1 : rule__Task__Group_3__1__Impl rule__Task__Group_3__2 ;
    public final void rule__Task__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2851:1: ( rule__Task__Group_3__1__Impl rule__Task__Group_3__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2852:2: rule__Task__Group_3__1__Impl rule__Task__Group_3__2
            {
            pushFollow(FOLLOW_rule__Task__Group_3__1__Impl_in_rule__Task__Group_3__15629);
            rule__Task__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_3__2_in_rule__Task__Group_3__15632);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2859:1: rule__Task__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Task__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2863:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2864:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2864:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2865:1: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,21,FOLLOW_21_in_rule__Task__Group_3__1__Impl5660); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2878:1: rule__Task__Group_3__2 : rule__Task__Group_3__2__Impl rule__Task__Group_3__3 ;
    public final void rule__Task__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2882:1: ( rule__Task__Group_3__2__Impl rule__Task__Group_3__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2883:2: rule__Task__Group_3__2__Impl rule__Task__Group_3__3
            {
            pushFollow(FOLLOW_rule__Task__Group_3__2__Impl_in_rule__Task__Group_3__25691);
            rule__Task__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_3__3_in_rule__Task__Group_3__25694);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2890:1: rule__Task__Group_3__2__Impl : ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) ) ;
    public final void rule__Task__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2894:1: ( ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2895:1: ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2895:1: ( ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2896:1: ( ( rule__Task__STasksAssignment_3_2 ) ) ( ( rule__Task__STasksAssignment_3_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2896:1: ( ( rule__Task__STasksAssignment_3_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2897:1: ( rule__Task__STasksAssignment_3_2 )
            {
             before(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2898:1: ( rule__Task__STasksAssignment_3_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2898:2: rule__Task__STasksAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl5723);
            rule__Task__STasksAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2901:1: ( ( rule__Task__STasksAssignment_3_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2902:1: ( rule__Task__STasksAssignment_3_2 )*
            {
             before(grammarAccess.getTaskAccess().getSTasksAssignment_3_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2903:1: ( rule__Task__STasksAssignment_3_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2903:2: rule__Task__STasksAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl5735);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2914:1: rule__Task__Group_3__3 : rule__Task__Group_3__3__Impl ;
    public final void rule__Task__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2918:1: ( rule__Task__Group_3__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2919:2: rule__Task__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_3__3__Impl_in_rule__Task__Group_3__35768);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2925:1: rule__Task__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Task__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2929:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2930:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2930:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2931:1: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,22,FOLLOW_22_in_rule__Task__Group_3__3__Impl5796); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2952:1: rule__Task__Group_4__0 : rule__Task__Group_4__0__Impl rule__Task__Group_4__1 ;
    public final void rule__Task__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2956:1: ( rule__Task__Group_4__0__Impl rule__Task__Group_4__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2957:2: rule__Task__Group_4__0__Impl rule__Task__Group_4__1
            {
            pushFollow(FOLLOW_rule__Task__Group_4__0__Impl_in_rule__Task__Group_4__05835);
            rule__Task__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_4__1_in_rule__Task__Group_4__05838);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2964:1: rule__Task__Group_4__0__Impl : ( 'taskDependencies' ) ;
    public final void rule__Task__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2968:1: ( ( 'taskDependencies' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2969:1: ( 'taskDependencies' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2969:1: ( 'taskDependencies' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2970:1: 'taskDependencies'
            {
             before(grammarAccess.getTaskAccess().getTaskDependenciesKeyword_4_0()); 
            match(input,36,FOLLOW_36_in_rule__Task__Group_4__0__Impl5866); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2983:1: rule__Task__Group_4__1 : rule__Task__Group_4__1__Impl ;
    public final void rule__Task__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2987:1: ( rule__Task__Group_4__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2988:2: rule__Task__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_4__1__Impl_in_rule__Task__Group_4__15897);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2994:1: rule__Task__Group_4__1__Impl : ( ( rule__Task__TaskDependenciesAssignment_4_1 )* ) ;
    public final void rule__Task__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2998:1: ( ( ( rule__Task__TaskDependenciesAssignment_4_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2999:1: ( ( rule__Task__TaskDependenciesAssignment_4_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:2999:1: ( ( rule__Task__TaskDependenciesAssignment_4_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3000:1: ( rule__Task__TaskDependenciesAssignment_4_1 )*
            {
             before(grammarAccess.getTaskAccess().getTaskDependenciesAssignment_4_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3001:1: ( rule__Task__TaskDependenciesAssignment_4_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3001:2: rule__Task__TaskDependenciesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__TaskDependenciesAssignment_4_1_in_rule__Task__Group_4__1__Impl5924);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3015:1: rule__Task__Group_5__0 : rule__Task__Group_5__0__Impl rule__Task__Group_5__1 ;
    public final void rule__Task__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3019:1: ( rule__Task__Group_5__0__Impl rule__Task__Group_5__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3020:2: rule__Task__Group_5__0__Impl rule__Task__Group_5__1
            {
            pushFollow(FOLLOW_rule__Task__Group_5__0__Impl_in_rule__Task__Group_5__05959);
            rule__Task__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_5__1_in_rule__Task__Group_5__05962);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3027:1: rule__Task__Group_5__0__Impl : ( 'servicesRequired' ) ;
    public final void rule__Task__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3031:1: ( ( 'servicesRequired' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3032:1: ( 'servicesRequired' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3032:1: ( 'servicesRequired' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3033:1: 'servicesRequired'
            {
             before(grammarAccess.getTaskAccess().getServicesRequiredKeyword_5_0()); 
            match(input,37,FOLLOW_37_in_rule__Task__Group_5__0__Impl5990); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3046:1: rule__Task__Group_5__1 : rule__Task__Group_5__1__Impl ;
    public final void rule__Task__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3050:1: ( rule__Task__Group_5__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3051:2: rule__Task__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_5__1__Impl_in_rule__Task__Group_5__16021);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3057:1: rule__Task__Group_5__1__Impl : ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) ) ;
    public final void rule__Task__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3061:1: ( ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3062:1: ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3062:1: ( ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3063:1: ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) ) ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3063:1: ( ( rule__Task__ReqSpecialtiesAssignment_5_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3064:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3065:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3065:2: rule__Task__ReqSpecialtiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6050);
            rule__Task__ReqSpecialtiesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3068:1: ( ( rule__Task__ReqSpecialtiesAssignment_5_1 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3069:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )*
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3070:1: ( rule__Task__ReqSpecialtiesAssignment_5_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3070:2: rule__Task__ReqSpecialtiesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6062);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3085:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3089:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3090:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_rule__Task__Group_6__0__Impl_in_rule__Task__Group_6__06099);
            rule__Task__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_6__1_in_rule__Task__Group_6__06102);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3097:1: rule__Task__Group_6__0__Impl : ( 'base value' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3101:1: ( ( 'base value' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3102:1: ( 'base value' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3102:1: ( 'base value' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3103:1: 'base value'
            {
             before(grammarAccess.getTaskAccess().getBaseValueKeyword_6_0()); 
            match(input,38,FOLLOW_38_in_rule__Task__Group_6__0__Impl6130); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3116:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3120:1: ( rule__Task__Group_6__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3121:2: rule__Task__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_6__1__Impl_in_rule__Task__Group_6__16161);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3127:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__BvalueAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3131:1: ( ( ( rule__Task__BvalueAssignment_6_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3132:1: ( ( rule__Task__BvalueAssignment_6_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3132:1: ( ( rule__Task__BvalueAssignment_6_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3133:1: ( rule__Task__BvalueAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getBvalueAssignment_6_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3134:1: ( rule__Task__BvalueAssignment_6_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3134:2: rule__Task__BvalueAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Task__BvalueAssignment_6_1_in_rule__Task__Group_6__1__Impl6188);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3148:1: rule__Task__Group_7__0 : rule__Task__Group_7__0__Impl rule__Task__Group_7__1 ;
    public final void rule__Task__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3152:1: ( rule__Task__Group_7__0__Impl rule__Task__Group_7__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3153:2: rule__Task__Group_7__0__Impl rule__Task__Group_7__1
            {
            pushFollow(FOLLOW_rule__Task__Group_7__0__Impl_in_rule__Task__Group_7__06222);
            rule__Task__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Task__Group_7__1_in_rule__Task__Group_7__06225);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3160:1: rule__Task__Group_7__0__Impl : ( 'classOfService' ) ;
    public final void rule__Task__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3164:1: ( ( 'classOfService' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3165:1: ( 'classOfService' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3165:1: ( 'classOfService' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3166:1: 'classOfService'
            {
             before(grammarAccess.getTaskAccess().getClassOfServiceKeyword_7_0()); 
            match(input,39,FOLLOW_39_in_rule__Task__Group_7__0__Impl6253); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3179:1: rule__Task__Group_7__1 : rule__Task__Group_7__1__Impl ;
    public final void rule__Task__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3183:1: ( rule__Task__Group_7__1__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3184:2: rule__Task__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Task__Group_7__1__Impl_in_rule__Task__Group_7__16284);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3190:1: rule__Task__Group_7__1__Impl : ( ( rule__Task__COSAssignment_7_1 ) ) ;
    public final void rule__Task__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3194:1: ( ( ( rule__Task__COSAssignment_7_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3195:1: ( ( rule__Task__COSAssignment_7_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3195:1: ( ( rule__Task__COSAssignment_7_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3196:1: ( rule__Task__COSAssignment_7_1 )
            {
             before(grammarAccess.getTaskAccess().getCOSAssignment_7_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3197:1: ( rule__Task__COSAssignment_7_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3197:2: rule__Task__COSAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Task__COSAssignment_7_1_in_rule__Task__Group_7__1__Impl6311);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3211:1: rule__KanbanTaskModel__Group__0 : rule__KanbanTaskModel__Group__0__Impl rule__KanbanTaskModel__Group__1 ;
    public final void rule__KanbanTaskModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3215:1: ( rule__KanbanTaskModel__Group__0__Impl rule__KanbanTaskModel__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3216:2: rule__KanbanTaskModel__Group__0__Impl rule__KanbanTaskModel__Group__1
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__0__Impl_in_rule__KanbanTaskModel__Group__06345);
            rule__KanbanTaskModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__1_in_rule__KanbanTaskModel__Group__06348);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3223:1: rule__KanbanTaskModel__Group__0__Impl : ( 'TaskModel' ) ;
    public final void rule__KanbanTaskModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3227:1: ( ( 'TaskModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3228:1: ( 'TaskModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3228:1: ( 'TaskModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3229:1: 'TaskModel'
            {
             before(grammarAccess.getKanbanTaskModelAccess().getTaskModelKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__KanbanTaskModel__Group__0__Impl6376); 
             after(grammarAccess.getKanbanTaskModelAccess().getTaskModelKeyword_0()); 

            }


            }

        }
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3242:1: rule__KanbanTaskModel__Group__1 : rule__KanbanTaskModel__Group__1__Impl rule__KanbanTaskModel__Group__2 ;
    public final void rule__KanbanTaskModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3246:1: ( rule__KanbanTaskModel__Group__1__Impl rule__KanbanTaskModel__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3247:2: rule__KanbanTaskModel__Group__1__Impl rule__KanbanTaskModel__Group__2
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__1__Impl_in_rule__KanbanTaskModel__Group__16407);
            rule__KanbanTaskModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__2_in_rule__KanbanTaskModel__Group__16410);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3254:1: rule__KanbanTaskModel__Group__1__Impl : ( ( rule__KanbanTaskModel__NameAssignment_1 ) ) ;
    public final void rule__KanbanTaskModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3258:1: ( ( ( rule__KanbanTaskModel__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3259:1: ( ( rule__KanbanTaskModel__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3259:1: ( ( rule__KanbanTaskModel__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3260:1: ( rule__KanbanTaskModel__NameAssignment_1 )
            {
             before(grammarAccess.getKanbanTaskModelAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3261:1: ( rule__KanbanTaskModel__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3261:2: rule__KanbanTaskModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__NameAssignment_1_in_rule__KanbanTaskModel__Group__1__Impl6437);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3271:1: rule__KanbanTaskModel__Group__2 : rule__KanbanTaskModel__Group__2__Impl rule__KanbanTaskModel__Group__3 ;
    public final void rule__KanbanTaskModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3275:1: ( rule__KanbanTaskModel__Group__2__Impl rule__KanbanTaskModel__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3276:2: rule__KanbanTaskModel__Group__2__Impl rule__KanbanTaskModel__Group__3
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__2__Impl_in_rule__KanbanTaskModel__Group__26467);
            rule__KanbanTaskModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__3_in_rule__KanbanTaskModel__Group__26470);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3283:1: rule__KanbanTaskModel__Group__2__Impl : ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) ) ;
    public final void rule__KanbanTaskModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3287:1: ( ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3288:1: ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3288:1: ( ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3289:1: ( ( rule__KanbanTaskModel__CapsAssignment_2 ) ) ( ( rule__KanbanTaskModel__CapsAssignment_2 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3289:1: ( ( rule__KanbanTaskModel__CapsAssignment_2 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3290:1: ( rule__KanbanTaskModel__CapsAssignment_2 )
            {
             before(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3291:1: ( rule__KanbanTaskModel__CapsAssignment_2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3291:2: rule__KanbanTaskModel__CapsAssignment_2
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl6499);
            rule__KanbanTaskModel__CapsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3294:1: ( ( rule__KanbanTaskModel__CapsAssignment_2 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3295:1: ( rule__KanbanTaskModel__CapsAssignment_2 )*
            {
             before(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3296:1: ( rule__KanbanTaskModel__CapsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3296:2: rule__KanbanTaskModel__CapsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl6511);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3307:1: rule__KanbanTaskModel__Group__3 : rule__KanbanTaskModel__Group__3__Impl ;
    public final void rule__KanbanTaskModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3311:1: ( rule__KanbanTaskModel__Group__3__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3312:2: rule__KanbanTaskModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KanbanTaskModel__Group__3__Impl_in_rule__KanbanTaskModel__Group__36544);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3318:1: rule__KanbanTaskModel__Group__3__Impl : ( 'end TaskModel' ) ;
    public final void rule__KanbanTaskModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3322:1: ( ( 'end TaskModel' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3323:1: ( 'end TaskModel' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3323:1: ( 'end TaskModel' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3324:1: 'end TaskModel'
            {
             before(grammarAccess.getKanbanTaskModelAccess().getEndTaskModelKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__KanbanTaskModel__Group__3__Impl6572); 
             after(grammarAccess.getKanbanTaskModelAccess().getEndTaskModelKeyword_3()); 

            }


            }

        }
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3345:1: rule__Capability__Group__0 : rule__Capability__Group__0__Impl rule__Capability__Group__1 ;
    public final void rule__Capability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3349:1: ( rule__Capability__Group__0__Impl rule__Capability__Group__1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3350:2: rule__Capability__Group__0__Impl rule__Capability__Group__1
            {
            pushFollow(FOLLOW_rule__Capability__Group__0__Impl_in_rule__Capability__Group__06611);
            rule__Capability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__1_in_rule__Capability__Group__06614);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3357:1: rule__Capability__Group__0__Impl : ( 'capability' ) ;
    public final void rule__Capability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3361:1: ( ( 'capability' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3362:1: ( 'capability' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3362:1: ( 'capability' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3363:1: 'capability'
            {
             before(grammarAccess.getCapabilityAccess().getCapabilityKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Capability__Group__0__Impl6642); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3376:1: rule__Capability__Group__1 : rule__Capability__Group__1__Impl rule__Capability__Group__2 ;
    public final void rule__Capability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3380:1: ( rule__Capability__Group__1__Impl rule__Capability__Group__2 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3381:2: rule__Capability__Group__1__Impl rule__Capability__Group__2
            {
            pushFollow(FOLLOW_rule__Capability__Group__1__Impl_in_rule__Capability__Group__16673);
            rule__Capability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__2_in_rule__Capability__Group__16676);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3388:1: rule__Capability__Group__1__Impl : ( ( rule__Capability__NameAssignment_1 ) ) ;
    public final void rule__Capability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3392:1: ( ( ( rule__Capability__NameAssignment_1 ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3393:1: ( ( rule__Capability__NameAssignment_1 ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3393:1: ( ( rule__Capability__NameAssignment_1 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3394:1: ( rule__Capability__NameAssignment_1 )
            {
             before(grammarAccess.getCapabilityAccess().getNameAssignment_1()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3395:1: ( rule__Capability__NameAssignment_1 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3395:2: rule__Capability__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Capability__NameAssignment_1_in_rule__Capability__Group__1__Impl6703);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3405:1: rule__Capability__Group__2 : rule__Capability__Group__2__Impl rule__Capability__Group__3 ;
    public final void rule__Capability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3409:1: ( rule__Capability__Group__2__Impl rule__Capability__Group__3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3410:2: rule__Capability__Group__2__Impl rule__Capability__Group__3
            {
            pushFollow(FOLLOW_rule__Capability__Group__2__Impl_in_rule__Capability__Group__26733);
            rule__Capability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__3_in_rule__Capability__Group__26736);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3417:1: rule__Capability__Group__2__Impl : ( '{' ) ;
    public final void rule__Capability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3421:1: ( ( '{' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3422:1: ( '{' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3422:1: ( '{' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3423:1: '{'
            {
             before(grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Capability__Group__2__Impl6764); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3436:1: rule__Capability__Group__3 : rule__Capability__Group__3__Impl rule__Capability__Group__4 ;
    public final void rule__Capability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3440:1: ( rule__Capability__Group__3__Impl rule__Capability__Group__4 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3441:2: rule__Capability__Group__3__Impl rule__Capability__Group__4
            {
            pushFollow(FOLLOW_rule__Capability__Group__3__Impl_in_rule__Capability__Group__36795);
            rule__Capability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Capability__Group__4_in_rule__Capability__Group__36798);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3448:1: rule__Capability__Group__3__Impl : ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) ) ;
    public final void rule__Capability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3452:1: ( ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3453:1: ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3453:1: ( ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3454:1: ( ( rule__Capability__ReqsAssignment_3 ) ) ( ( rule__Capability__ReqsAssignment_3 )* )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3454:1: ( ( rule__Capability__ReqsAssignment_3 ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3455:1: ( rule__Capability__ReqsAssignment_3 )
            {
             before(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3456:1: ( rule__Capability__ReqsAssignment_3 )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3456:2: rule__Capability__ReqsAssignment_3
            {
            pushFollow(FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl6827);
            rule__Capability__ReqsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 

            }

            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3459:1: ( ( rule__Capability__ReqsAssignment_3 )* )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3460:1: ( rule__Capability__ReqsAssignment_3 )*
            {
             before(grammarAccess.getCapabilityAccess().getReqsAssignment_3()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3461:1: ( rule__Capability__ReqsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3461:2: rule__Capability__ReqsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl6839);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3472:1: rule__Capability__Group__4 : rule__Capability__Group__4__Impl ;
    public final void rule__Capability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3476:1: ( rule__Capability__Group__4__Impl )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3477:2: rule__Capability__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Capability__Group__4__Impl_in_rule__Capability__Group__46872);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3483:1: rule__Capability__Group__4__Impl : ( '}' ) ;
    public final void rule__Capability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3487:1: ( ( '}' ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3488:1: ( '}' )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3488:1: ( '}' )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3489:1: '}'
            {
             before(grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Capability__Group__4__Impl6900); 
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


    // $ANTLR start "rule__KanbanSchedulingSystem__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3513:1: rule__KanbanSchedulingSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KanbanSchedulingSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3517:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3518:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3518:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3519:1: RULE_ID
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KanbanSchedulingSystem__NameAssignment_16946); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3528:1: rule__KanbanSchedulingSystem__OrgUnitsAssignment_3 : ( ruleTeam ) ;
    public final void rule__KanbanSchedulingSystem__OrgUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3532:1: ( ( ruleTeam ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3533:1: ( ruleTeam )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3533:1: ( ruleTeam )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3534:1: ruleTeam
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsTeamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTeam_in_rule__KanbanSchedulingSystem__OrgUnitsAssignment_36977);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3543:1: rule__KanbanSchedulingSystem__KssTasksAssignment_6 : ( ruleTask ) ;
    public final void rule__KanbanSchedulingSystem__KssTasksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3547:1: ( ( ruleTask ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3548:1: ( ruleTask )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3548:1: ( ruleTask )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3549:1: ruleTask
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksTaskParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTask_in_rule__KanbanSchedulingSystem__KssTasksAssignment_67008);
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


    // $ANTLR start "rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3558:1: rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8 : ( ruleKanbanTaskModel ) ;
    public final void rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3562:1: ( ( ruleKanbanTaskModel ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3563:1: ( ruleKanbanTaskModel )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3563:1: ( ruleKanbanTaskModel )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3564:1: ruleKanbanTaskModel
            {
             before(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowKanbanTaskModelParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleKanbanTaskModel_in_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_87039);
            ruleKanbanTaskModel();

            state._fsp--;

             after(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowKanbanTaskModelParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8"


    // $ANTLR start "rule__Team__NameAssignment_1"
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3573:1: rule__Team__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Team__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3577:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3578:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3578:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3579:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__NameAssignment_17070); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3588:1: rule__Team__DemandUnitsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Team__DemandUnitsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3592:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3593:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3593:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3594:1: ( RULE_ID )
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsTeamCrossReference_3_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3595:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3596:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getDemandUnitsTeamIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__DemandUnitsAssignment_3_27105); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3607:1: rule__Team__SourcedUnitsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Team__SourcedUnitsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3611:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3612:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3612:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3613:1: ( RULE_ID )
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsTeamCrossReference_4_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3614:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3615:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getSourcedUnitsTeamIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__SourcedUnitsAssignment_4_27144); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3626:1: rule__Team__GroupmembersAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Team__GroupmembersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3630:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3631:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3631:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3632:1: ( RULE_ID )
            {
             before(grammarAccess.getTeamAccess().getGroupmembersTeamCrossReference_5_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3633:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3634:1: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getGroupmembersTeamIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Team__GroupmembersAssignment_5_27183); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3645:1: rule__Team__ResourcesAssignment_6_2 : ( ruleAsset ) ;
    public final void rule__Team__ResourcesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3649:1: ( ( ruleAsset ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3650:1: ( ruleAsset )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3650:1: ( ruleAsset )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3651:1: ruleAsset
            {
             before(grammarAccess.getTeamAccess().getResourcesAssetParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Team__ResourcesAssignment_6_27218);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3660:1: rule__Team__ServicesAssignment_7_2 : ( ruleService ) ;
    public final void rule__Team__ServicesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3664:1: ( ( ruleService ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3665:1: ( ruleService )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3665:1: ( ruleService )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3666:1: ruleService
            {
             before(grammarAccess.getTeamAccess().getServicesServiceParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Team__ServicesAssignment_7_27249);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3675:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3679:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3680:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3680:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3681:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_17280); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3690:1: rule__Asset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3694:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3695:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3695:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3696:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_17311); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3705:1: rule__Asset__HasSkillsAssignment_2_3 : ( ruleSkill ) ;
    public final void rule__Asset__HasSkillsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3709:1: ( ( ruleSkill ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3710:1: ( ruleSkill )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3710:1: ( ruleSkill )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3711:1: ruleSkill
            {
             before(grammarAccess.getAssetAccess().getHasSkillsSkillParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleSkill_in_rule__Asset__HasSkillsAssignment_2_37342);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3720:1: rule__Skill__NameAssignment : ( RULE_ID ) ;
    public final void rule__Skill__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3724:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3725:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3725:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3726:1: RULE_ID
            {
             before(grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Skill__NameAssignment7373); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3735:1: rule__Dependency__SourceTaskAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__SourceTaskAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3739:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3740:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3740:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3741:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getSourceTaskTaskCrossReference_0_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3742:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3743:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getSourceTaskTaskIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__SourceTaskAssignment_07408); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3754:1: rule__Dependency__TargetTaskAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__TargetTaskAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3758:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3759:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3759:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3760:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getTargetTaskTaskCrossReference_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3761:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3762:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getTargetTaskTaskIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__TargetTaskAssignment_27447); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3773:1: rule__Requirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Requirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3777:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3778:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3778:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3779:1: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_17482); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3788:1: rule__Requirement__RTasksAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Requirement__RTasksAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3792:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3793:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3793:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3794:1: ( RULE_ID )
            {
             before(grammarAccess.getRequirementAccess().getRTasksTaskCrossReference_3_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3795:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3796:1: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getRTasksTaskIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__RTasksAssignment_3_27517); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3807:1: rule__Requirement__DependenciesAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__Requirement__DependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3811:1: ( ( ruleDependency ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3812:1: ( ruleDependency )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3812:1: ( ruleDependency )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3813:1: ruleDependency
            {
             before(grammarAccess.getRequirementAccess().getDependenciesDependencyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Requirement__DependenciesAssignment_4_17552);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3822:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3826:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3827:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3827:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3828:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__NameAssignment_17583); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3837:1: rule__Task__STasksAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Task__STasksAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3841:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3842:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3842:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3843:1: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getSTasksTaskCrossReference_3_2_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3844:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3845:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getSTasksTaskIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__STasksAssignment_3_27618); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3856:1: rule__Task__TaskDependenciesAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__Task__TaskDependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3860:1: ( ( ruleDependency ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3861:1: ( ruleDependency )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3861:1: ( ruleDependency )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3862:1: ruleDependency
            {
             before(grammarAccess.getTaskAccess().getTaskDependenciesDependencyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Task__TaskDependenciesAssignment_4_17653);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3871:1: rule__Task__ReqSpecialtiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Task__ReqSpecialtiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3875:1: ( ( ( RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3876:1: ( ( RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3876:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3877:1: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesServiceCrossReference_5_1_0()); 
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3878:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3879:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getReqSpecialtiesServiceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__ReqSpecialtiesAssignment_5_17688); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3890:1: rule__Task__BvalueAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Task__BvalueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3894:1: ( ( RULE_INT ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3895:1: ( RULE_INT )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3895:1: ( RULE_INT )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3896:1: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBvalueINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Task__BvalueAssignment_6_17723); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3905:1: rule__Task__COSAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Task__COSAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3909:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3910:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3910:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3911:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getCOSIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__COSAssignment_7_17754); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3920:1: rule__KanbanTaskModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KanbanTaskModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3924:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3925:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3925:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3926:1: RULE_ID
            {
             before(grammarAccess.getKanbanTaskModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KanbanTaskModel__NameAssignment_17785); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3935:1: rule__KanbanTaskModel__CapsAssignment_2 : ( ruleCapability ) ;
    public final void rule__KanbanTaskModel__CapsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3939:1: ( ( ruleCapability ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3940:1: ( ruleCapability )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3940:1: ( ruleCapability )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3941:1: ruleCapability
            {
             before(grammarAccess.getKanbanTaskModelAccess().getCapsCapabilityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCapability_in_rule__KanbanTaskModel__CapsAssignment_27816);
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3950:1: rule__Capability__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Capability__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3954:1: ( ( RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3955:1: ( RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3955:1: ( RULE_ID )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3956:1: RULE_ID
            {
             before(grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Capability__NameAssignment_17847); 
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
    // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3965:1: rule__Capability__ReqsAssignment_3 : ( ruleRequirement ) ;
    public final void rule__Capability__ReqsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3969:1: ( ( ruleRequirement ) )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3970:1: ( ruleRequirement )
            {
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3970:1: ( ruleRequirement )
            // ../ausim.xtext.kanban.domainmodel.ui/src-gen/ausim/xtext/kanban/domainmodel/ui/contentassist/antlr/internal/InternalKanbanmodel.g:3971:1: ruleRequirement
            {
             before(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRequirement_in_rule__Capability__ReqsAssignment_37878);
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
    public static final BitSet FOLLOW_11_in_rule__Team__Alternatives_0671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Team__Alternatives_0691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Dependency__Alternatives_1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Dependency__Alternatives_1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__0__Impl_in_rule__KanbanSchedulingSystem__Group__0778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__1_in_rule__KanbanSchedulingSystem__Group__0781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__KanbanSchedulingSystem__Group__0__Impl809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__1__Impl_in_rule__KanbanSchedulingSystem__Group__1840 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__2_in_rule__KanbanSchedulingSystem__Group__1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__NameAssignment_1_in_rule__KanbanSchedulingSystem__Group__1__Impl870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__2__Impl_in_rule__KanbanSchedulingSystem__Group__2900 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__3_in_rule__KanbanSchedulingSystem__Group__2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__KanbanSchedulingSystem__Group__2__Impl931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__3__Impl_in_rule__KanbanSchedulingSystem__Group__3962 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__4_in_rule__KanbanSchedulingSystem__Group__3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl994 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__OrgUnitsAssignment_3_in_rule__KanbanSchedulingSystem__Group__3__Impl1006 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__4__Impl_in_rule__KanbanSchedulingSystem__Group__41039 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__5_in_rule__KanbanSchedulingSystem__Group__41042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__KanbanSchedulingSystem__Group__4__Impl1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__5__Impl_in_rule__KanbanSchedulingSystem__Group__51101 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__6_in_rule__KanbanSchedulingSystem__Group__51104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__KanbanSchedulingSystem__Group__5__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__6__Impl_in_rule__KanbanSchedulingSystem__Group__61163 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__7_in_rule__KanbanSchedulingSystem__Group__61166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1195 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssTasksAssignment_6_in_rule__KanbanSchedulingSystem__Group__6__Impl1207 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__7__Impl_in_rule__KanbanSchedulingSystem__Group__71240 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__8_in_rule__KanbanSchedulingSystem__Group__71243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__KanbanSchedulingSystem__Group__7__Impl1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__8__Impl_in_rule__KanbanSchedulingSystem__Group__81302 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__9_in_rule__KanbanSchedulingSystem__Group__81305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_8_in_rule__KanbanSchedulingSystem__Group__8__Impl1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanSchedulingSystem__Group__9__Impl_in_rule__KanbanSchedulingSystem__Group__91362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__KanbanSchedulingSystem__Group__9__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__0__Impl_in_rule__Team__Group__01441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group__1_in_rule__Team__Group__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Alternatives_0_in_rule__Team__Group__0__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__1__Impl_in_rule__Team__Group__11501 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Team__Group__2_in_rule__Team__Group__11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__NameAssignment_1_in_rule__Team__Group__1__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__2__Impl_in_rule__Team__Group__21561 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_rule__Team__Group__3_in_rule__Team__Group__21564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Team__Group__2__Impl1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__3__Impl_in_rule__Team__Group__31623 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_rule__Team__Group__4_in_rule__Team__Group__31626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__0_in_rule__Team__Group__3__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__4__Impl_in_rule__Team__Group__41684 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_rule__Team__Group__5_in_rule__Team__Group__41687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__0_in_rule__Team__Group__4__Impl1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__5__Impl_in_rule__Team__Group__51745 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_rule__Team__Group__6_in_rule__Team__Group__51748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__0_in_rule__Team__Group__5__Impl1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__6__Impl_in_rule__Team__Group__61806 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_rule__Team__Group__7_in_rule__Team__Group__61809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__0_in_rule__Team__Group__6__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__7__Impl_in_rule__Team__Group__71867 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_rule__Team__Group__8_in_rule__Team__Group__71870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__0_in_rule__Team__Group__7__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group__8__Impl_in_rule__Team__Group__81928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Team__Group__8__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__0__Impl_in_rule__Team__Group_3__02005 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Team__Group_3__1_in_rule__Team__Group_3__02008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Team__Group_3__0__Impl2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__1__Impl_in_rule__Team__Group_3__12067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group_3__2_in_rule__Team__Group_3__12070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Team__Group_3__1__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_3__2__Impl_in_rule__Team__Group_3__22129 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Team__Group_3__3_in_rule__Team__Group_3__22132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2161 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__DemandUnitsAssignment_3_2_in_rule__Team__Group_3__2__Impl2173 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__Group_3__3__Impl_in_rule__Team__Group_3__32206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Team__Group_3__3__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__0__Impl_in_rule__Team__Group_4__02273 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Team__Group_4__1_in_rule__Team__Group_4__02276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Team__Group_4__0__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__1__Impl_in_rule__Team__Group_4__12335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group_4__2_in_rule__Team__Group_4__12338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Team__Group_4__1__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_4__2__Impl_in_rule__Team__Group_4__22397 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Team__Group_4__3_in_rule__Team__Group_4__22400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl2429 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__SourcedUnitsAssignment_4_2_in_rule__Team__Group_4__2__Impl2441 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__Group_4__3__Impl_in_rule__Team__Group_4__32474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Team__Group_4__3__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__0__Impl_in_rule__Team__Group_5__02541 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Team__Group_5__1_in_rule__Team__Group_5__02544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Team__Group_5__0__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__1__Impl_in_rule__Team__Group_5__12603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Team__Group_5__2_in_rule__Team__Group_5__12606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Team__Group_5__1__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_5__2__Impl_in_rule__Team__Group_5__22665 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Team__Group_5__3_in_rule__Team__Group_5__22668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl2697 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__GroupmembersAssignment_5_2_in_rule__Team__Group_5__2__Impl2709 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Team__Group_5__3__Impl_in_rule__Team__Group_5__32742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Team__Group_5__3__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__0__Impl_in_rule__Team__Group_6__02809 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Team__Group_6__1_in_rule__Team__Group_6__02812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Team__Group_6__0__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__1__Impl_in_rule__Team__Group_6__12871 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Team__Group_6__2_in_rule__Team__Group_6__12874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Team__Group_6__1__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__2__Impl_in_rule__Team__Group_6__22933 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Team__Group_6__3_in_rule__Team__Group_6__22936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl2965 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Team__ResourcesAssignment_6_2_in_rule__Team__Group_6__2__Impl2977 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Team__Group_6__3__Impl_in_rule__Team__Group_6__33010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Team__Group_6__3__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__0__Impl_in_rule__Team__Group_7__03077 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Team__Group_7__1_in_rule__Team__Group_7__03080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Team__Group_7__0__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__1__Impl_in_rule__Team__Group_7__13139 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Team__Group_7__2_in_rule__Team__Group_7__13142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Team__Group_7__1__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__2__Impl_in_rule__Team__Group_7__23201 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Team__Group_7__3_in_rule__Team__Group_7__23204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl3233 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Team__ServicesAssignment_7_2_in_rule__Team__Group_7__2__Impl3245 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Team__Group_7__3__Impl_in_rule__Team__Group_7__33278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Team__Group_7__3__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__03345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__03348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Service__Group__0__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__13407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Asset__Group__0__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13530 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__03654 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__03657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Asset__Group_2__0__Impl3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__13716 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__2_in_rule__Asset__Group_2__13719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Asset__Group_2__1__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__2__Impl_in_rule__Asset__Group_2__23778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__3_in_rule__Asset__Group_2__23781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Asset__Group_2__2__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__3__Impl_in_rule__Asset__Group_2__33840 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__4_in_rule__Asset__Group_2__33843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl3872 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Asset__HasSkillsAssignment_2_3_in_rule__Asset__Group_2__3__Impl3884 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__4__Impl_in_rule__Asset__Group_2__43917 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__5_in_rule__Asset__Group_2__43920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Asset__Group_2__4__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__5__Impl_in_rule__Asset__Group_2__53979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Asset__Group_2__5__Impl4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__04050 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__04053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__SourceTaskAssignment_0_in_rule__Dependency__Group__0__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__14110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__14113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Alternatives_1_in_rule__Dependency__Group__1__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__24170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__TargetTaskAssignment_2_in_rule__Dependency__Group__2__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__04233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__04236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Requirement__Group__0__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__14295 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__14298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__NameAssignment_1_in_rule__Requirement__Group__1__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__24355 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__24358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Requirement__Group__2__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__34417 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__4_in_rule__Requirement__Group__34420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__4__Impl_in_rule__Requirement__Group__44477 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__5_in_rule__Requirement__Group__44480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__0_in_rule__Requirement__Group__4__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__5__Impl_in_rule__Requirement__Group__54538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Requirement__Group__5__Impl4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__04609 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__04612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Requirement__Group_3__0__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__14671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__2_in_rule__Requirement__Group_3__14674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Requirement__Group_3__1__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__2__Impl_in_rule__Requirement__Group_3__24733 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__3_in_rule__Requirement__Group_3__24736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl4765 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Requirement__RTasksAssignment_3_2_in_rule__Requirement__Group_3__2__Impl4777 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__3__Impl_in_rule__Requirement__Group_3__34810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Requirement__Group_3__3__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__0__Impl_in_rule__Requirement__Group_4__04877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__1_in_rule__Requirement__Group_4__04880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Requirement__Group_4__0__Impl4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_4__1__Impl_in_rule__Requirement__Group_4__14939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__DependenciesAssignment_4_1_in_rule__Requirement__Group_4__1__Impl4966 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__05001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Task__Group__0__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__15063 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Task__Group__2_in_rule__Task__Group__15066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__2__Impl_in_rule__Task__Group__25123 = new BitSet(new long[]{0x000000F800400000L});
    public static final BitSet FOLLOW_rule__Task__Group__3_in_rule__Task__Group__25126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Task__Group__2__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__3__Impl_in_rule__Task__Group__35185 = new BitSet(new long[]{0x000000F800400000L});
    public static final BitSet FOLLOW_rule__Task__Group__4_in_rule__Task__Group__35188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__0_in_rule__Task__Group__3__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__4__Impl_in_rule__Task__Group__45246 = new BitSet(new long[]{0x000000F800400000L});
    public static final BitSet FOLLOW_rule__Task__Group__5_in_rule__Task__Group__45249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__0_in_rule__Task__Group__4__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__5__Impl_in_rule__Task__Group__55307 = new BitSet(new long[]{0x000000F800400000L});
    public static final BitSet FOLLOW_rule__Task__Group__6_in_rule__Task__Group__55310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_5__0_in_rule__Task__Group__5__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__6__Impl_in_rule__Task__Group__65368 = new BitSet(new long[]{0x000000F800400000L});
    public static final BitSet FOLLOW_rule__Task__Group__7_in_rule__Task__Group__65371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_6__0_in_rule__Task__Group__6__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__7__Impl_in_rule__Task__Group__75429 = new BitSet(new long[]{0x000000F800400000L});
    public static final BitSet FOLLOW_rule__Task__Group__8_in_rule__Task__Group__75432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__0_in_rule__Task__Group__7__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__8__Impl_in_rule__Task__Group__85490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Task__Group__8__Impl5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__0__Impl_in_rule__Task__Group_3__05567 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Task__Group_3__1_in_rule__Task__Group_3__05570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Task__Group_3__0__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__1__Impl_in_rule__Task__Group_3__15629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_3__2_in_rule__Task__Group_3__15632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Task__Group_3__1__Impl5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_3__2__Impl_in_rule__Task__Group_3__25691 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Task__Group_3__3_in_rule__Task__Group_3__25694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl5723 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__STasksAssignment_3_2_in_rule__Task__Group_3__2__Impl5735 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_3__3__Impl_in_rule__Task__Group_3__35768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Task__Group_3__3__Impl5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__0__Impl_in_rule__Task__Group_4__05835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_4__1_in_rule__Task__Group_4__05838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Task__Group_4__0__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_4__1__Impl_in_rule__Task__Group_4__15897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__TaskDependenciesAssignment_4_1_in_rule__Task__Group_4__1__Impl5924 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_5__0__Impl_in_rule__Task__Group_5__05959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_5__1_in_rule__Task__Group_5__05962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Task__Group_5__0__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_5__1__Impl_in_rule__Task__Group_5__16021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6050 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__ReqSpecialtiesAssignment_5_1_in_rule__Task__Group_5__1__Impl6062 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Task__Group_6__0__Impl_in_rule__Task__Group_6__06099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Task__Group_6__1_in_rule__Task__Group_6__06102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Task__Group_6__0__Impl6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_6__1__Impl_in_rule__Task__Group_6__16161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__BvalueAssignment_6_1_in_rule__Task__Group_6__1__Impl6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__0__Impl_in_rule__Task__Group_7__06222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group_7__1_in_rule__Task__Group_7__06225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Task__Group_7__0__Impl6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group_7__1__Impl_in_rule__Task__Group_7__16284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__COSAssignment_7_1_in_rule__Task__Group_7__1__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__0__Impl_in_rule__KanbanTaskModel__Group__06345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__1_in_rule__KanbanTaskModel__Group__06348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__KanbanTaskModel__Group__0__Impl6376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__1__Impl_in_rule__KanbanTaskModel__Group__16407 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__2_in_rule__KanbanTaskModel__Group__16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__NameAssignment_1_in_rule__KanbanTaskModel__Group__1__Impl6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__2__Impl_in_rule__KanbanTaskModel__Group__26467 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__3_in_rule__KanbanTaskModel__Group__26470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl6499 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__CapsAssignment_2_in_rule__KanbanTaskModel__Group__2__Impl6511 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__KanbanTaskModel__Group__3__Impl_in_rule__KanbanTaskModel__Group__36544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__KanbanTaskModel__Group__3__Impl6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__0__Impl_in_rule__Capability__Group__06611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Capability__Group__1_in_rule__Capability__Group__06614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Capability__Group__0__Impl6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__1__Impl_in_rule__Capability__Group__16673 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Capability__Group__2_in_rule__Capability__Group__16676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__NameAssignment_1_in_rule__Capability__Group__1__Impl6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__2__Impl_in_rule__Capability__Group__26733 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Capability__Group__3_in_rule__Capability__Group__26736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Capability__Group__2__Impl6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__3__Impl_in_rule__Capability__Group__36795 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Capability__Group__4_in_rule__Capability__Group__36798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl6827 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Capability__ReqsAssignment_3_in_rule__Capability__Group__3__Impl6839 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Capability__Group__4__Impl_in_rule__Capability__Group__46872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Capability__Group__4__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KanbanSchedulingSystem__NameAssignment_16946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeam_in_rule__KanbanSchedulingSystem__OrgUnitsAssignment_36977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__KanbanSchedulingSystem__KssTasksAssignment_67008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanTaskModel_in_rule__KanbanSchedulingSystem__KssWorkFlowAssignment_87039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__NameAssignment_17070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__DemandUnitsAssignment_3_27105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__SourcedUnitsAssignment_4_27144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Team__GroupmembersAssignment_5_27183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Team__ResourcesAssignment_6_27218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Team__ServicesAssignment_7_27249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_17280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_17311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_rule__Asset__HasSkillsAssignment_2_37342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Skill__NameAssignment7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__SourceTaskAssignment_07408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__TargetTaskAssignment_27447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_17482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__RTasksAssignment_3_27517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Requirement__DependenciesAssignment_4_17552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_17583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__STasksAssignment_3_27618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Task__TaskDependenciesAssignment_4_17653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__ReqSpecialtiesAssignment_5_17688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Task__BvalueAssignment_6_17723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__COSAssignment_7_17754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KanbanTaskModel__NameAssignment_17785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_rule__KanbanTaskModel__CapsAssignment_27816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Capability__NameAssignment_17847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_rule__Capability__ReqsAssignment_37878 = new BitSet(new long[]{0x0000000000000002L});

}