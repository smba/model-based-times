package de.tu_bs.cs.isf.mbse.mbtimes.generator;

import UnifiedModel.Article;
import UnifiedModel.Author;
import UnifiedModel.NewsChannel;
import UnifiedModel.UnifiedModelPackage;
import com.google.common.base.Objects;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.unifiedParser.UnifiedFileParser;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.vsm.VectorSpaceModel;
import edu.ucla.sspace.vector.DoubleVector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class ContentGenerator {
  private final static String[] specialChars = { "\\", "{", "}", "%", "^", "_", "&", "#", "~", "�", "�", "�", " . ", " , " };
  
  private final static String[] changedChars = { "\\textbackslash", "\\{", "\\}", "\\%", "\\textasciicircum", "\\_", "\\&", "\\#", "\\textasciitilde", "$^\\circ$", "\\pounds", "", ". ", ", " };
  
  public Object ContentGenerator() {
    return null;
  }
  
  public static void main(final String[] args) {
    final LinkedList<String> x = new LinkedList<String>();
    x.add("berlin");
    x.add("london");
    StringBuffer topicTex = new StringBuffer();
    String _compileTopic = ContentGenerator.compileTopic(x, "Berliner News");
    topicTex.append(_compileTopic);
    String _string = topicTex.toString();
    InputOutput.<String>println(_string);
  }
  
  public static String compileTopic(final List<String> topic, final String topicName) {
    LinkedList<Article> _load = UnifiedFileParser.load();
    final ArrayList<Article> articles = new ArrayList<Article>(_load);
    final StringBuffer topicTex = new StringBuffer();
    final ArrayList<String> fulltexts = new ArrayList<String>();
    for (final Article a : articles) {
      String _content = a.getContent();
      fulltexts.add(_content);
    }
    final VectorSpaceModel vsm = new VectorSpaceModel();
    vsm.buildDocumentVectors(fulltexts);
    System.err.println("VSM computing similarities");
    DoubleVector _queryVector = vsm.getQueryVector(topic);
    final Map<Integer, Integer> ranking = vsm.computeSimilarities(_queryVector);
    System.err.println("VSM computed similarities");
    topicTex.append((("\\headline{{\\bfseries\\Huge " + topicName) + "}\\linebreak\\medskip"));
    String str = topic.get(0);
    for (int i = 1; (i < topic.size()); i++) {
      String _str = str;
      String _get = topic.get(i);
      String _plus = (", " + _get);
      str = (_str + _plus);
    }
    topicTex.append((("{\\footnotesize{\\bfseries Tags: }{\\it " + str) + "}}}"));
    topicTex.append("\\begin{multicols}{\\numberColumns}");
    int k = 5;
    for (int i = 0; ((i < k) && (i < ranking.size())); i++) {
      {
        Integer _get = ranking.get(Integer.valueOf(i));
        final Article article = articles.get((_get).intValue());
        String _content_1 = article.getContent();
        final StringTokenizer st = new StringTokenizer(_content_1);
        int _countTokens = st.countTokens();
        String _plus = ("numberWords: " + Integer.valueOf(_countTokens));
        InputOutput.<String>println(_plus);
        boolean _and = false;
        int _countTokens_1 = st.countTokens();
        boolean _greaterEqualsThan = (_countTokens_1 >= 20);
        if (!_greaterEqualsThan) {
          _and = false;
        } else {
          int _countTokens_2 = st.countTokens();
          boolean _lessEqualsThan = (_countTokens_2 <= 1000);
          _and = _lessEqualsThan;
        }
        if (_and) {
          CharSequence _compileArticle = ContentGenerator.compileArticle(article);
          topicTex.append(_compileArticle);
        } else {
          k++;
        }
      }
    }
    topicTex.append("\\end{multicols}");
    return topicTex.toString();
  }
  
  public static CharSequence compileArticle(final Article it) {
    CharSequence _xblockexpression = null;
    {
      String content = it.getContent();
      String subtitle = it.getSubtitle();
      String title = it.getTitle();
      String authors = "";
      boolean _and = false;
      EList<Author> _author = it.getAuthor();
      boolean _notEquals = (!Objects.equal(_author, null));
      if (!_notEquals) {
        _and = false;
      } else {
        EList<Author> _author_1 = it.getAuthor();
        int _size = _author_1.size();
        boolean _greaterThan = (_size > 0);
        _and = _greaterThan;
      }
      if (_and) {
        EList<Author> _author_2 = it.getAuthor();
        Author _get = _author_2.get(0);
        _get.getName();
        for (int i = 1; (i < it.getAuthor().size()); i++) {
          String _authors = authors;
          EList<Author> _author_3 = it.getAuthor();
          Author _get_1 = _author_3.get(0);
          String _name = _get_1.getName();
          String _plus = (", " + _name);
          authors = (_authors + _plus);
        }
      }
      String newschannel = "";
      NewsChannel _newschannel = it.getNewschannel();
      boolean _notEquals_1 = (!Objects.equal(_newschannel, null));
      if (_notEquals_1) {
        NewsChannel _newschannel_1 = it.getNewschannel();
        String _title = _newschannel_1.getTitle();
        newschannel = _title;
      }
      for (int i = 0; (i < ContentGenerator.specialChars.length); i++) {
        {
          CharSequence _get_1 = ContentGenerator.specialChars[i];
          CharSequence _get_2 = ContentGenerator.changedChars[i];
          String _replace = content.replace(_get_1, _get_2);
          content = _replace;
          CharSequence _get_3 = ContentGenerator.specialChars[i];
          CharSequence _get_4 = ContentGenerator.changedChars[i];
          String _replace_1 = subtitle.replace(_get_3, _get_4);
          subtitle = _replace_1;
          String _title_1 = it.getTitle();
          boolean _notEquals_2 = (!Objects.equal(_title_1, null));
          if (_notEquals_2) {
            CharSequence _get_5 = ContentGenerator.specialChars[i];
            CharSequence _get_6 = ContentGenerator.changedChars[i];
            String _replace_2 = title.replace(_get_5, _get_6);
            title = _replace_2;
          }
          CharSequence _get_7 = ContentGenerator.specialChars[i];
          CharSequence _get_8 = ContentGenerator.changedChars[i];
          String _replace_3 = authors.replace(_get_7, _get_8);
          authors = _replace_3;
          CharSequence _get_9 = ContentGenerator.specialChars[i];
          CharSequence _get_10 = ContentGenerator.changedChars[i];
          String _replace_4 = newschannel.replace(_get_9, _get_10);
          newschannel = _replace_4;
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("  \t\t");
      _builder.newLine();
      {
        boolean _and_1 = false;
        boolean _and_2 = false;
        int _length = authors.length();
        boolean _greaterThan_1 = (_length > 0);
        if (!_greaterThan_1) {
          _and_2 = false;
        } else {
          String _title_1 = it.getTitle();
          boolean _notEquals_2 = (!Objects.equal(_title_1, null));
          _and_2 = _notEquals_2;
        }
        if (!_and_2) {
          _and_1 = false;
        } else {
          int _length_1 = newschannel.length();
          boolean _greaterThan_2 = (_length_1 > 0);
          _and_1 = _greaterThan_2;
        }
        if (_and_1) {
          _builder.append("\\byline{\\it\\Large ");
          _builder.append(title, "");
          _builder.append("}{");
          _builder.append(authors, "");
          _builder.append(", ");
          _builder.append(newschannel, "");
          _builder.append("}");
          _builder.newLineIfNotEmpty();
        } else {
          boolean _and_3 = false;
          String _title_2 = it.getTitle();
          boolean _notEquals_3 = (!Objects.equal(_title_2, null));
          if (!_notEquals_3) {
            _and_3 = false;
          } else {
            int _length_2 = newschannel.length();
            boolean _greaterThan_3 = (_length_2 > 0);
            _and_3 = _greaterThan_3;
          }
          if (_and_3) {
            _builder.append("\\byline{\\it\\Large ");
            _builder.append(title, "");
            _builder.append("}{");
            _builder.append(newschannel, "");
            _builder.append("}");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _and_4 = false;
            int _length_3 = authors.length();
            boolean _greaterThan_4 = (_length_3 > 0);
            if (!_greaterThan_4) {
              _and_4 = false;
            } else {
              String _title_3 = it.getTitle();
              boolean _notEquals_4 = (!Objects.equal(_title_3, null));
              _and_4 = _notEquals_4;
            }
            if (_and_4) {
              _builder.append("\\byline{\\it\\Large ");
              _builder.append(title, "");
              _builder.append("}{");
              _builder.append(authors, "");
              _builder.append("}");
              _builder.newLineIfNotEmpty();
            } else {
              String _title_4 = it.getTitle();
              boolean _notEquals_5 = (!Objects.equal(_title_4, null));
              if (_notEquals_5) {
                _builder.append("\\headline{\\it\\Large ");
                _builder.append(title, "");
                _builder.append("}");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\\headline{\\it\\Large N.N.}");
                _builder.newLine();
              }
            }
          }
        }
      }
      _builder.append("{\\bfseries");
      _builder.newLine();
      _builder.append("\\noindent ");
      _builder.append(subtitle, "");
      _builder.newLineIfNotEmpty();
      _builder.append("} \\medskip\\newline");
      _builder.newLine();
      _builder.append(content, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\\closearticle ");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public Object doEMFSetup() {
    Object _xblockexpression = null;
    {
      String _nsURI = UnifiedModelPackage.eINSTANCE.getNsURI();
      EPackage.Registry.INSTANCE.put(_nsURI, UnifiedModelPackage.eINSTANCE);
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _xblockexpression = _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    }
    return _xblockexpression;
  }
}
