/*
 * generated by Xtext
 */
package de.tu_bs.cs.isf.mbse.mbtimes.generator

import de.tu_bs.cs.isf.mbse.mbtimes.crawler.CrawlerDispatcher
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.m2m.Transformator
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic
import java.util.HashMap
import java.util.Map
import java.util.Observer
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import java.util.Observable

/**
 * Generates code from your model files on save
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class NplGenerator implements Observer, IGenerator {
	
	var Resource resource;
	var IFileSystemAccess fsa; 
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {

		this.resource = resource
		this.fsa = fsa

		val feeds = new HashMap<String, String>()
		
		resource.allContents.filter(typeof(Pair)).forEach[pair|
			feeds.put(pair.value, pair.type)
		]
		
		val cd = new CrawlerDispatcher()
		cd.initialize(feeds)
		
		val Transformator trafo = Transformator.getInstance()
		cd.addObserver(trafo);
		trafo.addObserver(this)
		
		val crawlerThread = new Thread(cd)
		crawlerThread.start
		
	}
	
	private def small(int x) {
		val r = (0.00277777777777911 * x**6) + (-0.0583333333333484 * x**5) + (0.486111111111176 * x**4) + (-2.04166666666683 * x**3) + (5.51111111111132 * x**2) + (-15.9000000000001 * x) + 40
		return r
	}
	private def medium(int x) {
		val r = (0.0361111111111134 * x**6) + (-0.691666666666697 * x**5) + (5.06944444444462 * x**4) + (-17.7083333333339 * x**3) + (30.8944444444452 * x**2) + (-33.6000000000004 * x) + 48
		return r
	}
	private def large(int x) {
		val r = -0.019444444444443 * x**6 + 0.341666666666656 * x**5 + -2.23611111111109 * x**4 + 6.62499999999998 * x**3 + -6.74444444444453 * x**2 + -13.9666666666666 * x + 56
		return r
	}
	
	def compileLayout(Declaration d) {
		/*
		%A6 small  8 medium 10 large 12
		%A5 small  8 medium 10 large 12
		%A4 small 10 medium 12 large 14
		%A3 small 14 medium 16 large 20
		%A2 small 20 medium 24 large 28
		%A1 small 28 medium 32 large 40
		%A0 small 40 medium 48 large 56
		* 
		*/
		val Map<String, HashMap<Integer, Integer>> fontSizeMap = new HashMap<String, HashMap<Integer, Integer>>()
		
		fontSizeMap.put("small", new HashMap<Integer, Integer>())
		fontSizeMap.get("small").put(0, 40)
		fontSizeMap.get("small").put(1, 28)
		fontSizeMap.get("small").put(2, 20)
		fontSizeMap.get("small").put(3, 14)
		fontSizeMap.get("small").put(4, 10)
		fontSizeMap.get("small").put(5, 8)
		fontSizeMap.get("small").put(6, 8)
		fontSizeMap.put("medium", new HashMap<Integer, Integer>())
		fontSizeMap.get("medium").put(0, 48)
		fontSizeMap.get("medium").put(1, 32)
		fontSizeMap.get("medium").put(2, 24)
		fontSizeMap.get("medium").put(3, 16)
		fontSizeMap.get("medium").put(4, 12)
		fontSizeMap.get("medium").put(5, 10)
		fontSizeMap.get("medium").put(6, 10)
		fontSizeMap.put("large", new HashMap<Integer, Integer>())
		fontSizeMap.get("large").put(0, 56)
		fontSizeMap.get("large").put(1, 40)
		fontSizeMap.get("large").put(2, 28)
		fontSizeMap.get("large").put(3, 20)
		fontSizeMap.get("large").put(4, 14)
		fontSizeMap.get("large").put(5, 12)
		fontSizeMap.get("large").put(6, 12)
		
		val c = d.format.value.charAt(5)+""
		val Integer format = Integer.parseInt(c)
		var date = "\\longdate";
		if (d.date == null) {
			date += "\\today"
		} else {
			date += "\\protect\\formatdate{" 
			date += d.date.day + "}{" + d.date.month + "}{" + d.date.year + "}"}
		
		var location = ""
		if (d.location == null) {
			location = "Braunschweig"
		} else {
			location = d.location
		}
	
		var price = ""
		if (d.price == null) {
			price = ""
		} else {
			price = String.format("%.2f", d.price.value)
			if(d.price.currency.value.equals("€")) {
				price = "\\EUR{" + price + "}"
			} else if(d.price.currency.value.equals("$")) {
				price = "\\$" + price
			} else {
				price += " " + d.price.currency.value
			}
		}

		var volumeAndIssue = ""
		if(d.volume != 0) {
			volumeAndIssue = "VOL.\\Roman{volume}"
		}
		if(d.number != 0) {
			volumeAndIssue += "\\ldots "
			if(d.language != null && d.language.value.equals("German")) {
				volumeAndIssue += "Nr."
			} else {
				volumeAndIssue += "No."
			}
			volumeAndIssue += "\\arabic{issue}"
		}
		
		var language = ""
		if(d.language != null) {
			if(d.language.value.equals("German")) {
				language = "\\usepackage[ngerman]{babel}"
			} else if(d.language.value.equals("English")) {
				language = "\\usepackage[english]{babel}"
			}
		}
		
		/*
		var Double fontSize = 0.0;
		if (d.fontSize.value.equals("small")) {
			fontSize = small(format)
		} else if (d.fontSize.value.equals("medium")) {
			fontSize = medium(format)
		} else if (d.fontSize.value.equals("large")) {
			fontSize = large(format)
		}
		* 
		*/
		
		/*
		%A6 small  8 medium 10 large 12
		%A5 small  8 medium 10 large 12
		%A4 small 10 medium 12 large 14
		%A3 small 14 medium 16 large 20
		%A2 small 20 medium 24 large 28
		%A1 small 28 medium 32 large 40
		%A0 small 40 medium 48 large 56
		
		%small  p(x) = 0,00277777777777911 * x^6 + -0,0583333333333484 * x^5 + 0,486111111111176 * x^4 + -2,04166666666683 * x^3 + 5,51111111111132 * x^2 + -15,9000000000001 * x + 40
		%medium p(x) = 0,0361111111111134 * x^6 + -0,691666666666697 * x^5 + 5,06944444444462 * x^4 + -17,7083333333339 * x^3 + 30,8944444444452 * x^2 + -33,6000000000004 * x + 48
		%large  p(x) = -0,019444444444443 * x^6 + 0,341666666666656 * x^5 + -2,23611111111109 * x^4 + 6,62499999999998 * x^3 + -6,74444444444453 * x^2 + -13,9666666666666 * x + 56
		 */
		//«»
		'''
		\newcommand{\textsize}{«fontSizeMap.get(d.fontSize.value).get(format)»pt}
		\newcommand{\numberColumns}{«d.columnsCnt»}
		
		\documentclass[\textsize]{scrartcl}
		
		% Needed packages for this newspaper
		
		\usepackage[a«format»paper]{geometry}
		«language»
		\usepackage{datetime}
		\usepackage[T1]{fontenc}    
		\usepackage[utf8x]{inputenc}
		\usepackage{newspaper}
		\usepackage{times}
		\usepackage{graphicx}
		\usepackage{multicol}
		\usepackage{calc}
		\usepackage{color}
		\usepackage{wrapfig}
		\usepackage{picinpar}
		\usepackage{eurosym}
		
		% Change geometry and dimensions
		
		\setlength\headheight{\textsize}
		\setlength\headsep{\textsize/2+\textsize}
		\setlength\textwidth{0.9\paperwidth}
		\setlength\textheight{0.9\paperheight}
		\setlength\topmargin{(\paperheight-\textheight
			-\headheight-\footskip)/2 - 0.75in}
		\setlength\oddsidemargin{(\paperwidth-\textwidth)/2 - 1in}
		
		\makeatletter
		% Redefine \maketitle. Delete elements do not needed from the newspaper package 
		
		\renewcommand{\maketitle}{\thispagestyle{empty}
			\vspace*{-40pt}
			\begin{center}
				%{\setlength\fboxsep{3mm}\raisebox{12pt}{\framebox[1.2\width]{\parbox[c]{1.15in}{\begin{center}\small \@paperslogan\end{center}}}}}\hfill%
				%\hfill%
				{\textgoth{\huge\usefont{LYG}{bigygoth}{m}{n} \@papername}}\\%
				\raisebox{12pt}{\textbf{\footnotesize \@paperlocation}}
				\vspace*{0.1in}
				\rule[0pt]{\textwidth}{0.5pt}\\
				{\small 
					«volumeAndIssue»
					\hfill \MakeUppercase{\it\@date} 
					\hfill \@paperprice}
				\rule[\textsize/2]{\textwidth}{1.2pt}\\
			\end{center}
			\pagestyle{plain}
		}
		
		% redefine plain page style
		
		\renewcommand{\ps@plain}{%
		\renewcommand\@oddfoot{}% % empty recto footer
		\let\@evenfoot\@oddfoot % empty verso footer
		\renewcommand\@evenhead
		{\parbox{\textwidth}{\vspace*{4pt}
		{\small «volumeAndIssue»}\hfill\normalfont\textbf{\@headername}\quad\MakeUppercase{\it\@date}\hfill\textrm{\thepage}\\
		\rule{\textwidth}{0.5pt}
		\vspace*{12pt}}}%
		\let\@oddhead\@evenhead}
		\makeatother
		
		
		% Redefine \byline so it is compactible with german language
		
		\renewcommand\byline[2]{\begin{center} #1 \\%
		{\footnotesize\bf «IF d.language != null && d.language.value.equals("German")»Von«ELSE»By«ENDIF» 
		\MakeUppercase{#2}} \\ %
		\rule[3pt]{0.4\hsize}{0.5pt}\\ \end{center} \par}
		
		% Set data for title
		
		
		
		«IF d.date != null»
		\newdate{newsDate}{«d.date.day»}{«d.date.month»}{«d.date.year»}
		«ELSE»
		\newdate{newsDate}{\number\day}{\number\month}{\number\year}
		«ENDIF»
		\date{\protect\dayofweekname{\getdateday{newsDate}}{\getdatemonth{newsDate}}{\getdateyear{newsDate}}, 
				\getdateday{newsDate}. \monthname[\getdatemonth{newsDate}] \getdateyear{newsDate}}
		\currentvolume{«d.volume»}
		\currentissue{«d.number»}
		\SetPaperName{«d.title»}
		\SetHeaderName{«d.title»}
		\SetPaperLocation{«location»}
		\SetPaperPrice{«price»}
		
		\begin{document}
			\maketitle
			
			%include topic.tex's
		    «FOR t:d.topics»
		    	\input{«t.name».tex}
		    	\pagebreak
			«ENDFOR»
		\end{document}
		'''
	}
	
	override update(Observable o, Object arg) {
		System.err.println("Compiling .tex s")
		/* Compiling topics */
		
		for(d: resource.allContents.toIterable.filter(Declaration)) {
    		fsa.generateFile(	d.name + ".tex", d.compileLayout)
    		
    		for(topic: d.topics) {
    			val topicText = ContentGenerator.compileTopic(topic.tags, topic.title,d)
				fsa.generateFile(topic.name + ".tex", topicText)
    		}
    	}
		
//		resource.allContents.filter(typeof(Topic)).forEach[topic|
//			val topicText = ContentGenerator.compileTopic(topic.tags, topic.title)
//			fsa.generateFile(topic.name + ".tex", topicText)
//		]
//		
//		for(d: resource.allContents.toIterable.filter(Declaration)) {
//    		fsa.generateFile(	d.name + ".tex", d.compileLayout)
//    	}
	}
	
}