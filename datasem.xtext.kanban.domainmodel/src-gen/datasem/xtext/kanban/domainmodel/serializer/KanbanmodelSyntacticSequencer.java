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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class KanbanmodelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KanbanmodelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CausalTrigger_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1;
	protected AbstractElementAlias match_Requirement_WorkItemNetworkKeyword_5_0_q;
	protected AbstractElementAlias match_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0;
	protected AbstractElementAlias match_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_WorkItem_CausalTriggersKeyword_8_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KanbanmodelGrammarAccess) access;
		match_CausalTrigger_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCausalTriggerAccess().getEqualsSignGreaterThanSignKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCausalTriggerAccess().getHyphenMinusGreaterThanSignKeyword_0_1()));
		match_Requirement_WorkItemNetworkKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_5_0());
		match_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getServiceProviderAccess().getGroupKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getServiceProviderAccess().getServiceProviderKeyword_0_0()));
		match_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_2_2()));
		match_WorkItem_CausalTriggersKeyword_8_0_q = new TokenAlias(false, true, grammarAccess.getWorkItemAccess().getCausalTriggersKeyword_8_0());
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
			if(match_CausalTrigger_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1.equals(syntax))
				emit_CausalTrigger_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement_WorkItemNetworkKeyword_5_0_q.equals(syntax))
				emit_Requirement_WorkItemNetworkKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0.equals(syntax))
				emit_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WorkItem_CausalTriggersKeyword_8_0_q.equals(syntax))
				emit_WorkItem_CausalTriggersKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '=>' | '->'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' triggered+=[WorkItem|ID]
	 */
	protected void emit_CausalTrigger_EqualsSignGreaterThanSignKeyword_0_0_or_HyphenMinusGreaterThanSignKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'workItemNetwork'?
	 *
	 * This ambiguous syntax occurs at:
	 *     rTasks+=[WorkItem|ID] '}' (ambiguity) '}' (rule end)
	 */
	protected void emit_Requirement_WorkItemNetworkKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'ServiceProvider' | 'Group'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_ServiceProvider_GroupKeyword_0_1_or_ServiceProviderKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Service___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'CausalTriggers'?
	 *
	 * This ambiguous syntax occurs at:
	 *     description=STRING (ambiguity) 'RequiredServices' '{' requiredServices+=[Service|ID]
	 *     description=STRING (ambiguity) '}' 'ArrivalTime' arrivalTime=INT
	 *     description=STRING (ambiguity) '}' 'ClassOfService' classOfService=[ClassOfService|ID]
	 *     description=STRING (ambiguity) '}' 'DueDate' dueDate=INT
	 *     description=STRING (ambiguity) '}' 'Efforts' efforts=INT
	 *     description=STRING (ambiguity) '}' 'Value' value=INT
	 *     description=STRING (ambiguity) '}' 'WorkSource' workSource=[WorkSource|ID]
	 *     description=STRING (ambiguity) '}' '}' (rule end)
	 *     name=ID '{' (ambiguity) 'RequiredServices' '{' requiredServices+=[Service|ID]
	 *     name=ID '{' (ambiguity) '}' 'ArrivalTime' arrivalTime=INT
	 *     name=ID '{' (ambiguity) '}' 'ClassOfService' classOfService=[ClassOfService|ID]
	 *     name=ID '{' (ambiguity) '}' 'DueDate' dueDate=INT
	 *     name=ID '{' (ambiguity) '}' 'Efforts' efforts=INT
	 *     name=ID '{' (ambiguity) '}' 'Value' value=INT
	 *     name=ID '{' (ambiguity) '}' 'WorkSource' workSource=[WorkSource|ID]
	 *     name=ID '{' (ambiguity) '}' '}' (rule end)
	 *     pTasks+=[WorkItem|ID] '}' (ambiguity) 'RequiredServices' '{' requiredServices+=[Service|ID]
	 *     pTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'ArrivalTime' arrivalTime=INT
	 *     pTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'ClassOfService' classOfService=[ClassOfService|ID]
	 *     pTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'DueDate' dueDate=INT
	 *     pTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'Efforts' efforts=INT
	 *     pTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'Value' value=INT
	 *     pTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'WorkSource' workSource=[WorkSource|ID]
	 *     pTasks+=[WorkItem|ID] '}' (ambiguity) '}' '}' (rule end)
	 *     profile=[WorkItemProfile|ID] (ambiguity) 'RequiredServices' '{' requiredServices+=[Service|ID]
	 *     profile=[WorkItemProfile|ID] (ambiguity) '}' 'ArrivalTime' arrivalTime=INT
	 *     profile=[WorkItemProfile|ID] (ambiguity) '}' 'ClassOfService' classOfService=[ClassOfService|ID]
	 *     profile=[WorkItemProfile|ID] (ambiguity) '}' 'DueDate' dueDate=INT
	 *     profile=[WorkItemProfile|ID] (ambiguity) '}' 'Efforts' efforts=INT
	 *     profile=[WorkItemProfile|ID] (ambiguity) '}' 'Value' value=INT
	 *     profile=[WorkItemProfile|ID] (ambiguity) '}' 'WorkSource' workSource=[WorkSource|ID]
	 *     profile=[WorkItemProfile|ID] (ambiguity) '}' '}' (rule end)
	 *     sTasks+=[WorkItem|ID] '}' (ambiguity) 'RequiredServices' '{' requiredServices+=[Service|ID]
	 *     sTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'ArrivalTime' arrivalTime=INT
	 *     sTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'ClassOfService' classOfService=[ClassOfService|ID]
	 *     sTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'DueDate' dueDate=INT
	 *     sTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'Efforts' efforts=INT
	 *     sTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'Value' value=INT
	 *     sTasks+=[WorkItem|ID] '}' (ambiguity) '}' 'WorkSource' workSource=[WorkSource|ID]
	 *     sTasks+=[WorkItem|ID] '}' (ambiguity) '}' '}' (rule end)
	 *     type=[TaskType|ID] (ambiguity) 'RequiredServices' '{' requiredServices+=[Service|ID]
	 *     type=[TaskType|ID] (ambiguity) '}' 'ArrivalTime' arrivalTime=INT
	 *     type=[TaskType|ID] (ambiguity) '}' 'ClassOfService' classOfService=[ClassOfService|ID]
	 *     type=[TaskType|ID] (ambiguity) '}' 'DueDate' dueDate=INT
	 *     type=[TaskType|ID] (ambiguity) '}' 'Efforts' efforts=INT
	 *     type=[TaskType|ID] (ambiguity) '}' 'Value' value=INT
	 *     type=[TaskType|ID] (ambiguity) '}' 'WorkSource' workSource=[WorkSource|ID]
	 *     type=[TaskType|ID] (ambiguity) '}' '}' (rule end)
	 */
	protected void emit_WorkItem_CausalTriggersKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
