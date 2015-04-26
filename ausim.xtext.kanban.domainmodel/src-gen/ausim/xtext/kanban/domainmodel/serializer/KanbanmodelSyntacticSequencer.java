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
	protected AbstractElementAlias match_Causality_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1;
	protected AbstractElementAlias match_Requirement_WorkItemNetworkKeyword_5_0_q;
	protected AbstractElementAlias match_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0;
	protected AbstractElementAlias match_ServiceProvider___SpecifiedKeyword_9_4_0_LeftCurlyBracketKeyword_9_4_1_RightCurlyBracketKeyword_9_4_7__q;
	protected AbstractElementAlias match_ServiceType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Skill___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_WorkItem_CausalityKeyword_8_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KanbanmodelGrammarAccess) access;
		match_Causality_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCausalityAccess().getEqualsSignGreaterThanSignKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCausalityAccess().getHyphenMinusGreaterThanSignKeyword_0_1()));
		match_Requirement_WorkItemNetworkKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_5_0());
		match_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getServiceProviderAccess().getGroupKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getServiceProviderAccess().getServiceProviderKeyword_0_0()));
		match_ServiceProvider___SpecifiedKeyword_9_4_0_LeftCurlyBracketKeyword_9_4_1_RightCurlyBracketKeyword_9_4_7__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getServiceProviderAccess().getSpecifiedKeyword_9_4_0()), new TokenAlias(false, false, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_9_4_1()), new TokenAlias(false, false, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_9_4_7()));
		match_ServiceType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getServiceTypeAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getServiceTypeAccess().getRightCurlyBracketKeyword_2_2()));
		match_Skill___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSkillAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSkillAccess().getRightCurlyBracketKeyword_1_2()));
		match_WorkItem_CausalityKeyword_8_0_q = new TokenAlias(false, true, grammarAccess.getWorkItemAccess().getCausalityKeyword_8_0());
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
			if(match_Causality_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1.equals(syntax))
				emit_Causality_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement_WorkItemNetworkKeyword_5_0_q.equals(syntax))
				emit_Requirement_WorkItemNetworkKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0.equals(syntax))
				emit_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ServiceProvider___SpecifiedKeyword_9_4_0_LeftCurlyBracketKeyword_9_4_1_RightCurlyBracketKeyword_9_4_7__q.equals(syntax))
				emit_ServiceProvider___SpecifiedKeyword_9_4_0_LeftCurlyBracketKeyword_9_4_1_RightCurlyBracketKeyword_9_4_7__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ServiceType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_ServiceType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Skill___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_Skill___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WorkItem_CausalityKeyword_8_0_q.equals(syntax))
				emit_WorkItem_CausalityKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '=>' | '->'
	 */
	protected void emit_Causality_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'serviceProvider' | 'group'
	 */
	protected void emit_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('specified' '{' '}')?
	 */
	protected void emit_ServiceProvider___SpecifiedKeyword_9_4_0_LeftCurlyBracketKeyword_9_4_1_RightCurlyBracketKeyword_9_4_7__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_ServiceType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'causality'?
	 */
	protected void emit_WorkItem_CausalityKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
