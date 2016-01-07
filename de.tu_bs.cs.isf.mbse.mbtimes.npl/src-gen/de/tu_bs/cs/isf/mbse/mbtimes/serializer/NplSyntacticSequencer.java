/*
 * generated by Xtext
 */
package de.tu_bs.cs.isf.mbse.mbtimes.serializer;

import com.google.inject.Inject;
import de.tu_bs.cs.isf.mbse.mbtimes.services.NplGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class NplSyntacticSequencer extends AbstractSyntacticSequencer {

	protected NplGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Declaration_RightCurlyBracketKeyword_14_a;
	protected AbstractElementAlias match_Declaration_RightCurlyBracketKeyword_14_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (NplGrammarAccess) access;
		match_Declaration_RightCurlyBracketKeyword_14_a = new TokenAlias(true, true, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_14());
		match_Declaration_RightCurlyBracketKeyword_14_p = new TokenAlias(true, false, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_14());
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
			if (match_Declaration_RightCurlyBracketKeyword_14_a.equals(syntax))
				emit_Declaration_RightCurlyBracketKeyword_14_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Declaration_RightCurlyBracketKeyword_14_p.equals(syntax))
				emit_Declaration_RightCurlyBracketKeyword_14_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '}'*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'font size' fontSize=FontSize
	 *     (rule start) (ambiguity) 'format' format=Format
	 *     (rule start) (ambiguity) 'newspaper' name=ID
	 *     (rule start) (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     (rule start) (ambiguity) 'number of columns' columnsCnt=INT
	 *     (rule start) (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     (rule start) (ambiguity) 'optional: date' date=Date
	 *     (rule start) (ambiguity) 'optional: language' language=Language
	 *     (rule start) (ambiguity) 'optional: location' location=STRING
	 *     (rule start) (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     (rule start) (ambiguity) 'optional: price' price=Price
	 *     (rule start) (ambiguity) 'optional: volume' volume=INT
	 *     (rule start) (ambiguity) 'topics' '{' topics+=Topic
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) recrawl?='recrawl'
	 *     articleCnt=INT (ambiguity) 'font size' fontSize=FontSize
	 *     articleCnt=INT (ambiguity) 'format' format=Format
	 *     articleCnt=INT (ambiguity) 'newspaper' name=ID
	 *     articleCnt=INT (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     articleCnt=INT (ambiguity) 'number of columns' columnsCnt=INT
	 *     articleCnt=INT (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     articleCnt=INT (ambiguity) 'optional: date' date=Date
	 *     articleCnt=INT (ambiguity) 'optional: language' language=Language
	 *     articleCnt=INT (ambiguity) 'optional: location' location=STRING
	 *     articleCnt=INT (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     articleCnt=INT (ambiguity) 'optional: price' price=Price
	 *     articleCnt=INT (ambiguity) 'optional: volume' volume=INT
	 *     articleCnt=INT (ambiguity) 'topics' '{' topics+=Topic
	 *     articleCnt=INT (ambiguity) (rule end)
	 *     articleCnt=INT (ambiguity) recrawl?='recrawl'
	 *     articleWordsMax=INT (ambiguity) 'font size' fontSize=FontSize
	 *     articleWordsMax=INT (ambiguity) 'format' format=Format
	 *     articleWordsMax=INT (ambiguity) 'newspaper' name=ID
	 *     articleWordsMax=INT (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     articleWordsMax=INT (ambiguity) 'number of columns' columnsCnt=INT
	 *     articleWordsMax=INT (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     articleWordsMax=INT (ambiguity) 'optional: date' date=Date
	 *     articleWordsMax=INT (ambiguity) 'optional: language' language=Language
	 *     articleWordsMax=INT (ambiguity) 'optional: location' location=STRING
	 *     articleWordsMax=INT (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     articleWordsMax=INT (ambiguity) 'optional: price' price=Price
	 *     articleWordsMax=INT (ambiguity) 'optional: volume' volume=INT
	 *     articleWordsMax=INT (ambiguity) 'topics' '{' topics+=Topic
	 *     articleWordsMax=INT (ambiguity) (rule end)
	 *     articleWordsMax=INT (ambiguity) recrawl?='recrawl'
	 *     columnsCnt=INT (ambiguity) 'font size' fontSize=FontSize
	 *     columnsCnt=INT (ambiguity) 'format' format=Format
	 *     columnsCnt=INT (ambiguity) 'newspaper' name=ID
	 *     columnsCnt=INT (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     columnsCnt=INT (ambiguity) 'number of columns' columnsCnt=INT
	 *     columnsCnt=INT (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     columnsCnt=INT (ambiguity) 'optional: date' date=Date
	 *     columnsCnt=INT (ambiguity) 'optional: language' language=Language
	 *     columnsCnt=INT (ambiguity) 'optional: location' location=STRING
	 *     columnsCnt=INT (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     columnsCnt=INT (ambiguity) 'optional: price' price=Price
	 *     columnsCnt=INT (ambiguity) 'optional: volume' volume=INT
	 *     columnsCnt=INT (ambiguity) 'topics' '{' topics+=Topic
	 *     columnsCnt=INT (ambiguity) (rule end)
	 *     columnsCnt=INT (ambiguity) recrawl?='recrawl'
	 *     date=Date (ambiguity) 'font size' fontSize=FontSize
	 *     date=Date (ambiguity) 'format' format=Format
	 *     date=Date (ambiguity) 'newspaper' name=ID
	 *     date=Date (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     date=Date (ambiguity) 'number of columns' columnsCnt=INT
	 *     date=Date (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     date=Date (ambiguity) 'optional: date' date=Date
	 *     date=Date (ambiguity) 'optional: language' language=Language
	 *     date=Date (ambiguity) 'optional: location' location=STRING
	 *     date=Date (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     date=Date (ambiguity) 'optional: price' price=Price
	 *     date=Date (ambiguity) 'optional: volume' volume=INT
	 *     date=Date (ambiguity) 'topics' '{' topics+=Topic
	 *     date=Date (ambiguity) (rule end)
	 *     date=Date (ambiguity) recrawl?='recrawl'
	 *     feedlinks+=Pair '}' (ambiguity) 'font size' fontSize=FontSize
	 *     feedlinks+=Pair '}' (ambiguity) 'format' format=Format
	 *     feedlinks+=Pair '}' (ambiguity) 'newspaper' name=ID
	 *     feedlinks+=Pair '}' (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     feedlinks+=Pair '}' (ambiguity) 'number of columns' columnsCnt=INT
	 *     feedlinks+=Pair '}' (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     feedlinks+=Pair '}' (ambiguity) 'optional: date' date=Date
	 *     feedlinks+=Pair '}' (ambiguity) 'optional: language' language=Language
	 *     feedlinks+=Pair '}' (ambiguity) 'optional: location' location=STRING
	 *     feedlinks+=Pair '}' (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     feedlinks+=Pair '}' (ambiguity) 'optional: price' price=Price
	 *     feedlinks+=Pair '}' (ambiguity) 'optional: volume' volume=INT
	 *     feedlinks+=Pair '}' (ambiguity) 'topics' '{' topics+=Topic
	 *     feedlinks+=Pair '}' (ambiguity) (rule end)
	 *     feedlinks+=Pair '}' (ambiguity) recrawl?='recrawl'
	 *     fontSize=FontSize (ambiguity) 'font size' fontSize=FontSize
	 *     fontSize=FontSize (ambiguity) 'format' format=Format
	 *     fontSize=FontSize (ambiguity) 'newspaper' name=ID
	 *     fontSize=FontSize (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     fontSize=FontSize (ambiguity) 'number of columns' columnsCnt=INT
	 *     fontSize=FontSize (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     fontSize=FontSize (ambiguity) 'optional: date' date=Date
	 *     fontSize=FontSize (ambiguity) 'optional: language' language=Language
	 *     fontSize=FontSize (ambiguity) 'optional: location' location=STRING
	 *     fontSize=FontSize (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     fontSize=FontSize (ambiguity) 'optional: price' price=Price
	 *     fontSize=FontSize (ambiguity) 'optional: volume' volume=INT
	 *     fontSize=FontSize (ambiguity) 'topics' '{' topics+=Topic
	 *     fontSize=FontSize (ambiguity) (rule end)
	 *     fontSize=FontSize (ambiguity) recrawl?='recrawl'
	 *     format=Format (ambiguity) 'font size' fontSize=FontSize
	 *     format=Format (ambiguity) 'format' format=Format
	 *     format=Format (ambiguity) 'newspaper' name=ID
	 *     format=Format (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     format=Format (ambiguity) 'number of columns' columnsCnt=INT
	 *     format=Format (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     format=Format (ambiguity) 'optional: date' date=Date
	 *     format=Format (ambiguity) 'optional: language' language=Language
	 *     format=Format (ambiguity) 'optional: location' location=STRING
	 *     format=Format (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     format=Format (ambiguity) 'optional: price' price=Price
	 *     format=Format (ambiguity) 'optional: volume' volume=INT
	 *     format=Format (ambiguity) 'topics' '{' topics+=Topic
	 *     format=Format (ambiguity) (rule end)
	 *     format=Format (ambiguity) recrawl?='recrawl'
	 *     imagesCnt=ImagesCount (ambiguity) 'font size' fontSize=FontSize
	 *     imagesCnt=ImagesCount (ambiguity) 'format' format=Format
	 *     imagesCnt=ImagesCount (ambiguity) 'newspaper' name=ID
	 *     imagesCnt=ImagesCount (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     imagesCnt=ImagesCount (ambiguity) 'number of columns' columnsCnt=INT
	 *     imagesCnt=ImagesCount (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     imagesCnt=ImagesCount (ambiguity) 'optional: date' date=Date
	 *     imagesCnt=ImagesCount (ambiguity) 'optional: language' language=Language
	 *     imagesCnt=ImagesCount (ambiguity) 'optional: location' location=STRING
	 *     imagesCnt=ImagesCount (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     imagesCnt=ImagesCount (ambiguity) 'optional: price' price=Price
	 *     imagesCnt=ImagesCount (ambiguity) 'optional: volume' volume=INT
	 *     imagesCnt=ImagesCount (ambiguity) 'topics' '{' topics+=Topic
	 *     imagesCnt=ImagesCount (ambiguity) (rule end)
	 *     imagesCnt=ImagesCount (ambiguity) recrawl?='recrawl'
	 *     language=Language (ambiguity) 'font size' fontSize=FontSize
	 *     language=Language (ambiguity) 'format' format=Format
	 *     language=Language (ambiguity) 'newspaper' name=ID
	 *     language=Language (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     language=Language (ambiguity) 'number of columns' columnsCnt=INT
	 *     language=Language (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     language=Language (ambiguity) 'optional: date' date=Date
	 *     language=Language (ambiguity) 'optional: language' language=Language
	 *     language=Language (ambiguity) 'optional: location' location=STRING
	 *     language=Language (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     language=Language (ambiguity) 'optional: price' price=Price
	 *     language=Language (ambiguity) 'optional: volume' volume=INT
	 *     language=Language (ambiguity) 'topics' '{' topics+=Topic
	 *     language=Language (ambiguity) (rule end)
	 *     language=Language (ambiguity) recrawl?='recrawl'
	 *     location=STRING (ambiguity) 'font size' fontSize=FontSize
	 *     location=STRING (ambiguity) 'format' format=Format
	 *     location=STRING (ambiguity) 'newspaper' name=ID
	 *     location=STRING (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     location=STRING (ambiguity) 'number of columns' columnsCnt=INT
	 *     location=STRING (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     location=STRING (ambiguity) 'optional: date' date=Date
	 *     location=STRING (ambiguity) 'optional: language' language=Language
	 *     location=STRING (ambiguity) 'optional: location' location=STRING
	 *     location=STRING (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     location=STRING (ambiguity) 'optional: price' price=Price
	 *     location=STRING (ambiguity) 'optional: volume' volume=INT
	 *     location=STRING (ambiguity) 'topics' '{' topics+=Topic
	 *     location=STRING (ambiguity) (rule end)
	 *     location=STRING (ambiguity) recrawl?='recrawl'
	 *     name=ID '{' (ambiguity) 'font size' fontSize=FontSize
	 *     name=ID '{' (ambiguity) 'format' format=Format
	 *     name=ID '{' (ambiguity) 'newspaper' name=ID
	 *     name=ID '{' (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     name=ID '{' (ambiguity) 'number of columns' columnsCnt=INT
	 *     name=ID '{' (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     name=ID '{' (ambiguity) 'optional: date' date=Date
	 *     name=ID '{' (ambiguity) 'optional: language' language=Language
	 *     name=ID '{' (ambiguity) 'optional: location' location=STRING
	 *     name=ID '{' (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     name=ID '{' (ambiguity) 'optional: price' price=Price
	 *     name=ID '{' (ambiguity) 'optional: volume' volume=INT
	 *     name=ID '{' (ambiguity) 'topics' '{' topics+=Topic
	 *     name=ID '{' (ambiguity) (rule end)
	 *     name=ID '{' (ambiguity) recrawl?='recrawl'
	 *     number=INT (ambiguity) 'font size' fontSize=FontSize
	 *     number=INT (ambiguity) 'format' format=Format
	 *     number=INT (ambiguity) 'newspaper' name=ID
	 *     number=INT (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     number=INT (ambiguity) 'number of columns' columnsCnt=INT
	 *     number=INT (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     number=INT (ambiguity) 'optional: date' date=Date
	 *     number=INT (ambiguity) 'optional: language' language=Language
	 *     number=INT (ambiguity) 'optional: location' location=STRING
	 *     number=INT (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     number=INT (ambiguity) 'optional: price' price=Price
	 *     number=INT (ambiguity) 'optional: volume' volume=INT
	 *     number=INT (ambiguity) 'topics' '{' topics+=Topic
	 *     number=INT (ambiguity) (rule end)
	 *     number=INT (ambiguity) recrawl?='recrawl'
	 *     price=Price (ambiguity) 'font size' fontSize=FontSize
	 *     price=Price (ambiguity) 'format' format=Format
	 *     price=Price (ambiguity) 'newspaper' name=ID
	 *     price=Price (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     price=Price (ambiguity) 'number of columns' columnsCnt=INT
	 *     price=Price (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     price=Price (ambiguity) 'optional: date' date=Date
	 *     price=Price (ambiguity) 'optional: language' language=Language
	 *     price=Price (ambiguity) 'optional: location' location=STRING
	 *     price=Price (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     price=Price (ambiguity) 'optional: price' price=Price
	 *     price=Price (ambiguity) 'optional: volume' volume=INT
	 *     price=Price (ambiguity) 'topics' '{' topics+=Topic
	 *     price=Price (ambiguity) (rule end)
	 *     price=Price (ambiguity) recrawl?='recrawl'
	 *     topics+=Topic '}' (ambiguity) 'font size' fontSize=FontSize
	 *     topics+=Topic '}' (ambiguity) 'format' format=Format
	 *     topics+=Topic '}' (ambiguity) 'newspaper' name=ID
	 *     topics+=Topic '}' (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     topics+=Topic '}' (ambiguity) 'number of columns' columnsCnt=INT
	 *     topics+=Topic '}' (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     topics+=Topic '}' (ambiguity) 'optional: date' date=Date
	 *     topics+=Topic '}' (ambiguity) 'optional: language' language=Language
	 *     topics+=Topic '}' (ambiguity) 'optional: location' location=STRING
	 *     topics+=Topic '}' (ambiguity) 'optional: number of images per article' imagesCnt=ImagesCount
	 *     topics+=Topic '}' (ambiguity) 'optional: price' price=Price
	 *     topics+=Topic '}' (ambiguity) 'optional: volume' volume=INT
	 *     topics+=Topic '}' (ambiguity) 'topics' '{' topics+=Topic
	 *     topics+=Topic '}' (ambiguity) (rule end)
	 *     topics+=Topic '}' (ambiguity) recrawl?='recrawl'
	 */
	protected void emit_Declaration_RightCurlyBracketKeyword_14_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '}'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Declaration_RightCurlyBracketKeyword_14_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
