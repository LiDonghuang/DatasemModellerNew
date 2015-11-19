/*
 * generated by Xtext
 */
package datasemModeller.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import datasemModeller.services.DmodelGrammarAccess;

public class DmodelParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DmodelGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected datasemModeller.parser.antlr.internal.InternalDmodelParser createParser(XtextTokenStream stream) {
		return new datasemModeller.parser.antlr.internal.InternalDmodelParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ModelBuilder";
	}
	
	public DmodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DmodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
