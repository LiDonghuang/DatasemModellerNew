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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class KanbanmodelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KanbanmodelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Requirement_ProcessKeyword_4_0_q;
	protected AbstractElementAlias match_Task_ProcessKeyword_4_0_q;
	protected AbstractElementAlias match_Team_GroupKeyword_0_1_or_TeamKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KanbanmodelGrammarAccess) access;
		match_Requirement_ProcessKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getRequirementAccess().getProcessKeyword_4_0());
		match_Task_ProcessKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getTaskAccess().getProcessKeyword_4_0());
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
			if(match_Requirement_ProcessKeyword_4_0_q.equals(syntax))
				emit_Requirement_ProcessKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task_ProcessKeyword_4_0_q.equals(syntax))
				emit_Task_ProcessKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Team_GroupKeyword_0_1_or_TeamKeyword_0_0.equals(syntax))
				emit_Team_GroupKeyword_0_1_or_TeamKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'process'?
	 */
	protected void emit_Requirement_ProcessKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'process'?
	 */
	protected void emit_Task_ProcessKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
