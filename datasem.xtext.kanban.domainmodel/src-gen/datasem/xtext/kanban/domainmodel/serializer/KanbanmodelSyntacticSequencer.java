/*
 * generated by Xtext
 */
package datasem.xtext.kanban.domainmodel.serializer;

import com.google.inject.Inject;
import datasem.xtext.kanban.domainmodel.services.KanbanmodelGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class KanbanmodelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KanbanmodelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_IfExpression___ElseKeyword_6_0_LeftCurlyBracketKeyword_6_1_1_0_RightCurlyBracketKeyword_6_1_1_2__q;
	protected AbstractElementAlias match_Service___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KanbanmodelGrammarAccess) access;
		match_IfExpression___ElseKeyword_6_0_LeftCurlyBracketKeyword_6_1_1_0_RightCurlyBracketKeyword_6_1_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIfExpressionAccess().getElseKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_6_1_1_0()), new TokenAlias(false, false, grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_6_1_1_2()));
		match_Service___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_1_3()));
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
			if(match_IfExpression___ElseKeyword_6_0_LeftCurlyBracketKeyword_6_1_1_0_RightCurlyBracketKeyword_6_1_1_2__q.equals(syntax))
				emit_IfExpression___ElseKeyword_6_0_LeftCurlyBracketKeyword_6_1_1_0_RightCurlyBracketKeyword_6_1_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Service___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q.equals(syntax))
				emit_Service___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('else' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     condition=Condition ')' '{' '}' (ambiguity) (rule end)
	 *     statements+=Statement '}' (ambiguity) (rule end)
	 */
	protected void emit_IfExpression___ElseKeyword_6_0_LeftCurlyBracketKeyword_6_1_1_0_RightCurlyBracketKeyword_6_1_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 *     name=ID (ambiguity) id=INT
	 */
	protected void emit_Service___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
