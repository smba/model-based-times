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
	 *     (rule start) (ambiguity) 'date' date=Date
	 *     (rule start) (ambiguity) 'font size' fontSize=FontSize
	 *     (rule start) (ambiguity) 'format' format=Format
	 *     (rule start) (ambiguity) 'language' language=Language
	 *     (rule start) (ambiguity) 'location' location=STRING
	 *     (rule start) (ambiguity) 'newspaper' name=ID
	 *     (rule start) (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     (rule start) (ambiguity) 'number of columns' columnsCnt=INT
	 *     (rule start) (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     (rule start) (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     (rule start) (ambiguity) 'price' price=Price
	 *     (rule start) (ambiguity) 'title' title=STRING
	 *     (rule start) (ambiguity) 'topics' '{' topics+=Topic
	 *     (rule start) (ambiguity) 'volume' volume=INT
	 *     (rule start) (ambiguity) (rule start)
	 *     articleCnt=INT (ambiguity) 'date' date=Date
	 *     articleCnt=INT (ambiguity) 'font size' fontSize=FontSize
	 *     articleCnt=INT (ambiguity) 'format' format=Format
	 *     articleCnt=INT (ambiguity) 'language' language=Language
	 *     articleCnt=INT (ambiguity) 'location' location=STRING
	 *     articleCnt=INT (ambiguity) 'newspaper' name=ID
	 *     articleCnt=INT (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     articleCnt=INT (ambiguity) 'number of columns' columnsCnt=INT
	 *     articleCnt=INT (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     articleCnt=INT (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     articleCnt=INT (ambiguity) 'price' price=Price
	 *     articleCnt=INT (ambiguity) 'title' title=STRING
	 *     articleCnt=INT (ambiguity) 'topics' '{' topics+=Topic
	 *     articleCnt=INT (ambiguity) 'volume' volume=INT
	 *     articleCnt=INT (ambiguity) (rule end)
	 *     articleWordsMax=INT (ambiguity) 'date' date=Date
	 *     articleWordsMax=INT (ambiguity) 'font size' fontSize=FontSize
	 *     articleWordsMax=INT (ambiguity) 'format' format=Format
	 *     articleWordsMax=INT (ambiguity) 'language' language=Language
	 *     articleWordsMax=INT (ambiguity) 'location' location=STRING
	 *     articleWordsMax=INT (ambiguity) 'newspaper' name=ID
	 *     articleWordsMax=INT (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     articleWordsMax=INT (ambiguity) 'number of columns' columnsCnt=INT
	 *     articleWordsMax=INT (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     articleWordsMax=INT (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     articleWordsMax=INT (ambiguity) 'price' price=Price
	 *     articleWordsMax=INT (ambiguity) 'title' title=STRING
	 *     articleWordsMax=INT (ambiguity) 'topics' '{' topics+=Topic
	 *     articleWordsMax=INT (ambiguity) 'volume' volume=INT
	 *     articleWordsMax=INT (ambiguity) (rule end)
	 *     columnsCnt=INT (ambiguity) 'date' date=Date
	 *     columnsCnt=INT (ambiguity) 'font size' fontSize=FontSize
	 *     columnsCnt=INT (ambiguity) 'format' format=Format
	 *     columnsCnt=INT (ambiguity) 'language' language=Language
	 *     columnsCnt=INT (ambiguity) 'location' location=STRING
	 *     columnsCnt=INT (ambiguity) 'newspaper' name=ID
	 *     columnsCnt=INT (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     columnsCnt=INT (ambiguity) 'number of columns' columnsCnt=INT
	 *     columnsCnt=INT (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     columnsCnt=INT (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     columnsCnt=INT (ambiguity) 'price' price=Price
	 *     columnsCnt=INT (ambiguity) 'title' title=STRING
	 *     columnsCnt=INT (ambiguity) 'topics' '{' topics+=Topic
	 *     columnsCnt=INT (ambiguity) 'volume' volume=INT
	 *     columnsCnt=INT (ambiguity) (rule end)
	 *     date=Date (ambiguity) 'date' date=Date
	 *     date=Date (ambiguity) 'font size' fontSize=FontSize
	 *     date=Date (ambiguity) 'format' format=Format
	 *     date=Date (ambiguity) 'language' language=Language
	 *     date=Date (ambiguity) 'location' location=STRING
	 *     date=Date (ambiguity) 'newspaper' name=ID
	 *     date=Date (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     date=Date (ambiguity) 'number of columns' columnsCnt=INT
	 *     date=Date (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     date=Date (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     date=Date (ambiguity) 'price' price=Price
	 *     date=Date (ambiguity) 'title' title=STRING
	 *     date=Date (ambiguity) 'topics' '{' topics+=Topic
	 *     date=Date (ambiguity) 'volume' volume=INT
	 *     date=Date (ambiguity) (rule end)
	 *     feedlinks+=Pair '}' (ambiguity) 'date' date=Date
	 *     feedlinks+=Pair '}' (ambiguity) 'font size' fontSize=FontSize
	 *     feedlinks+=Pair '}' (ambiguity) 'format' format=Format
	 *     feedlinks+=Pair '}' (ambiguity) 'language' language=Language
	 *     feedlinks+=Pair '}' (ambiguity) 'location' location=STRING
	 *     feedlinks+=Pair '}' (ambiguity) 'newspaper' name=ID
	 *     feedlinks+=Pair '}' (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     feedlinks+=Pair '}' (ambiguity) 'number of columns' columnsCnt=INT
	 *     feedlinks+=Pair '}' (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     feedlinks+=Pair '}' (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     feedlinks+=Pair '}' (ambiguity) 'price' price=Price
	 *     feedlinks+=Pair '}' (ambiguity) 'title' title=STRING
	 *     feedlinks+=Pair '}' (ambiguity) 'topics' '{' topics+=Topic
	 *     feedlinks+=Pair '}' (ambiguity) 'volume' volume=INT
	 *     feedlinks+=Pair '}' (ambiguity) (rule end)
	 *     fontSize=FontSize (ambiguity) 'date' date=Date
	 *     fontSize=FontSize (ambiguity) 'font size' fontSize=FontSize
	 *     fontSize=FontSize (ambiguity) 'format' format=Format
	 *     fontSize=FontSize (ambiguity) 'language' language=Language
	 *     fontSize=FontSize (ambiguity) 'location' location=STRING
	 *     fontSize=FontSize (ambiguity) 'newspaper' name=ID
	 *     fontSize=FontSize (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     fontSize=FontSize (ambiguity) 'number of columns' columnsCnt=INT
	 *     fontSize=FontSize (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     fontSize=FontSize (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     fontSize=FontSize (ambiguity) 'price' price=Price
	 *     fontSize=FontSize (ambiguity) 'title' title=STRING
	 *     fontSize=FontSize (ambiguity) 'topics' '{' topics+=Topic
	 *     fontSize=FontSize (ambiguity) 'volume' volume=INT
	 *     fontSize=FontSize (ambiguity) (rule end)
	 *     format=Format (ambiguity) 'date' date=Date
	 *     format=Format (ambiguity) 'font size' fontSize=FontSize
	 *     format=Format (ambiguity) 'format' format=Format
	 *     format=Format (ambiguity) 'language' language=Language
	 *     format=Format (ambiguity) 'location' location=STRING
	 *     format=Format (ambiguity) 'newspaper' name=ID
	 *     format=Format (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     format=Format (ambiguity) 'number of columns' columnsCnt=INT
	 *     format=Format (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     format=Format (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     format=Format (ambiguity) 'price' price=Price
	 *     format=Format (ambiguity) 'title' title=STRING
	 *     format=Format (ambiguity) 'topics' '{' topics+=Topic
	 *     format=Format (ambiguity) 'volume' volume=INT
	 *     format=Format (ambiguity) (rule end)
	 *     imagesCnt=ImagesCount (ambiguity) 'date' date=Date
	 *     imagesCnt=ImagesCount (ambiguity) 'font size' fontSize=FontSize
	 *     imagesCnt=ImagesCount (ambiguity) 'format' format=Format
	 *     imagesCnt=ImagesCount (ambiguity) 'language' language=Language
	 *     imagesCnt=ImagesCount (ambiguity) 'location' location=STRING
	 *     imagesCnt=ImagesCount (ambiguity) 'newspaper' name=ID
	 *     imagesCnt=ImagesCount (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     imagesCnt=ImagesCount (ambiguity) 'number of columns' columnsCnt=INT
	 *     imagesCnt=ImagesCount (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     imagesCnt=ImagesCount (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     imagesCnt=ImagesCount (ambiguity) 'price' price=Price
	 *     imagesCnt=ImagesCount (ambiguity) 'title' title=STRING
	 *     imagesCnt=ImagesCount (ambiguity) 'topics' '{' topics+=Topic
	 *     imagesCnt=ImagesCount (ambiguity) 'volume' volume=INT
	 *     imagesCnt=ImagesCount (ambiguity) (rule end)
	 *     language=Language (ambiguity) 'date' date=Date
	 *     language=Language (ambiguity) 'font size' fontSize=FontSize
	 *     language=Language (ambiguity) 'format' format=Format
	 *     language=Language (ambiguity) 'language' language=Language
	 *     language=Language (ambiguity) 'location' location=STRING
	 *     language=Language (ambiguity) 'newspaper' name=ID
	 *     language=Language (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     language=Language (ambiguity) 'number of columns' columnsCnt=INT
	 *     language=Language (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     language=Language (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     language=Language (ambiguity) 'price' price=Price
	 *     language=Language (ambiguity) 'title' title=STRING
	 *     language=Language (ambiguity) 'topics' '{' topics+=Topic
	 *     language=Language (ambiguity) 'volume' volume=INT
	 *     language=Language (ambiguity) (rule end)
	 *     location=STRING (ambiguity) 'date' date=Date
	 *     location=STRING (ambiguity) 'font size' fontSize=FontSize
	 *     location=STRING (ambiguity) 'format' format=Format
	 *     location=STRING (ambiguity) 'language' language=Language
	 *     location=STRING (ambiguity) 'location' location=STRING
	 *     location=STRING (ambiguity) 'newspaper' name=ID
	 *     location=STRING (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     location=STRING (ambiguity) 'number of columns' columnsCnt=INT
	 *     location=STRING (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     location=STRING (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     location=STRING (ambiguity) 'price' price=Price
	 *     location=STRING (ambiguity) 'title' title=STRING
	 *     location=STRING (ambiguity) 'topics' '{' topics+=Topic
	 *     location=STRING (ambiguity) 'volume' volume=INT
	 *     location=STRING (ambiguity) (rule end)
	 *     name=ID '{' (ambiguity) 'date' date=Date
	 *     name=ID '{' (ambiguity) 'font size' fontSize=FontSize
	 *     name=ID '{' (ambiguity) 'format' format=Format
	 *     name=ID '{' (ambiguity) 'language' language=Language
	 *     name=ID '{' (ambiguity) 'location' location=STRING
	 *     name=ID '{' (ambiguity) 'newspaper' name=ID
	 *     name=ID '{' (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     name=ID '{' (ambiguity) 'number of columns' columnsCnt=INT
	 *     name=ID '{' (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     name=ID '{' (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     name=ID '{' (ambiguity) 'price' price=Price
	 *     name=ID '{' (ambiguity) 'title' title=STRING
	 *     name=ID '{' (ambiguity) 'topics' '{' topics+=Topic
	 *     name=ID '{' (ambiguity) 'volume' volume=INT
	 *     name=ID '{' (ambiguity) (rule end)
	 *     number=INT (ambiguity) 'date' date=Date
	 *     number=INT (ambiguity) 'font size' fontSize=FontSize
	 *     number=INT (ambiguity) 'format' format=Format
	 *     number=INT (ambiguity) 'language' language=Language
	 *     number=INT (ambiguity) 'location' location=STRING
	 *     number=INT (ambiguity) 'newspaper' name=ID
	 *     number=INT (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     number=INT (ambiguity) 'number of columns' columnsCnt=INT
	 *     number=INT (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     number=INT (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     number=INT (ambiguity) 'price' price=Price
	 *     number=INT (ambiguity) 'title' title=STRING
	 *     number=INT (ambiguity) 'topics' '{' topics+=Topic
	 *     number=INT (ambiguity) 'volume' volume=INT
	 *     number=INT (ambiguity) (rule end)
	 *     price=Price (ambiguity) 'date' date=Date
	 *     price=Price (ambiguity) 'font size' fontSize=FontSize
	 *     price=Price (ambiguity) 'format' format=Format
	 *     price=Price (ambiguity) 'language' language=Language
	 *     price=Price (ambiguity) 'location' location=STRING
	 *     price=Price (ambiguity) 'newspaper' name=ID
	 *     price=Price (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     price=Price (ambiguity) 'number of columns' columnsCnt=INT
	 *     price=Price (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     price=Price (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     price=Price (ambiguity) 'price' price=Price
	 *     price=Price (ambiguity) 'title' title=STRING
	 *     price=Price (ambiguity) 'topics' '{' topics+=Topic
	 *     price=Price (ambiguity) 'volume' volume=INT
	 *     price=Price (ambiguity) (rule end)
	 *     topics+=Topic '}' (ambiguity) 'date' date=Date
	 *     topics+=Topic '}' (ambiguity) 'font size' fontSize=FontSize
	 *     topics+=Topic '}' (ambiguity) 'format' format=Format
	 *     topics+=Topic '}' (ambiguity) 'language' language=Language
	 *     topics+=Topic '}' (ambiguity) 'location' location=STRING
	 *     topics+=Topic '}' (ambiguity) 'newspaper' name=ID
	 *     topics+=Topic '}' (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     topics+=Topic '}' (ambiguity) 'number of columns' columnsCnt=INT
	 *     topics+=Topic '}' (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     topics+=Topic '}' (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     topics+=Topic '}' (ambiguity) 'price' price=Price
	 *     topics+=Topic '}' (ambiguity) 'title' title=STRING
	 *     topics+=Topic '}' (ambiguity) 'topics' '{' topics+=Topic
	 *     topics+=Topic '}' (ambiguity) 'volume' volume=INT
	 *     topics+=Topic '}' (ambiguity) (rule end)
	 *     volume=INT (ambiguity) 'date' date=Date
	 *     volume=INT (ambiguity) 'font size' fontSize=FontSize
	 *     volume=INT (ambiguity) 'format' format=Format
	 *     volume=INT (ambiguity) 'language' language=Language
	 *     volume=INT (ambiguity) 'location' location=STRING
	 *     volume=INT (ambiguity) 'newspaper' name=ID
	 *     volume=INT (ambiguity) 'number of articles per topic' articleCnt=INT
	 *     volume=INT (ambiguity) 'number of columns' columnsCnt=INT
	 *     volume=INT (ambiguity) 'number of images per article' imagesCnt=ImagesCount
	 *     volume=INT (ambiguity) 'number of words per article' articleWordsMin=INT
	 *     volume=INT (ambiguity) 'price' price=Price
	 *     volume=INT (ambiguity) 'title' title=STRING
	 *     volume=INT (ambiguity) 'topics' '{' topics+=Topic
	 *     volume=INT (ambiguity) 'volume' volume=INT
	 *     volume=INT (ambiguity) (rule end)
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
