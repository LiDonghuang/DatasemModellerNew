package ausim.xtext.kanban.domainmodel.serializer;

import ausim.xtext.kanban.domainmodel.services.KanbanmodelGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class KanbanmodelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KanbanmodelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Dependency_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1;
	protected AbstractElementAlias match_Requirement_WorkItemNetworkKeyword_5_0_q;
	protected AbstractElementAlias match_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Skill___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Task_TaskDependenciesKeyword_7_0_q;
	protected AbstractElementAlias match_Team_GroupKeyword_0_1_or_TeamKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KanbanmodelGrammarAccess) access;
		match_Dependency_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDependencyAccess().getEqualsSignGreaterThanSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1_1()));
		match_Requirement_WorkItemNetworkKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_5_0());
		match_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_2_2()));
		match_Skill___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSkillAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSkillAccess().getRightCurlyBracketKeyword_1_2()));
		match_Task_TaskDependenciesKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getTaskAccess().getTaskDependenciesKeyword_7_0());
		match_Team_GroupKeyword_0_1_or_TeamKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTeamAccess().getGroupKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getTeamAccess().getTeamKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Dependency_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1.equals(syntax))
				emit_Dependency_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement_WorkItemNetworkKeyword_5_0_q.equals(syntax))
				emit_Requirement_WorkItemNetworkKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Skill___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_Skill___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_TaskDependenciesKeyword_7_0_q.equals(syntax))
				emit_Task_TaskDependenciesKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Team_GroupKeyword_0_1_or_TeamKeyword_0_0.equals(syntax))
				emit_Team_GroupKeyword_0_1_or_TeamKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '=>' | '->'
	 */
	protected void emit_Dependency_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'workItemNetwork'?
	 */
	protected void emit_Requirement_WorkItemNetworkKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Skill___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'taskDependencies'?
	 */
	protected void emit_Task_TaskDependenciesKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'team' | 'group'
	 */
	protected void emit_Team_GroupKeyword_0_1_or_TeamKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
