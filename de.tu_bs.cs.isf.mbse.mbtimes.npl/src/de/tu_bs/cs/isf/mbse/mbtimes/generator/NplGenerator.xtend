/*
 * generated by Xtext
 */
package de.tu_bs.cs.isf.mbse.mbtimes.generator

import de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class NplGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {

		resource.getAllContents.filter(typeof(Declaration)).forEach[declaration|
			System.err.println(declaration.name)
			
			declaration.feedlinks.forEach[fl|
				System.err.println(fl.type + " feed " + fl.key + " at " + fl.value)
			]
			declaration.topics.forEach[t|
				System.err.println("Topic " + t.name + " with tags " + t.tags)
			]
			
		]
		
		  for(d: resource.allContents.toIterable.filter(Declaration)) {
    		fsa.generateFile(	d.name + ".tex", d.compileLayout)
  }
		
	}
	private def small(int x) {
		System.err.println(x)
		val r = (0.00277777777777911 * x**6) + (-0.0583333333333484 * x**5) + (0.486111111111176 * x**4) + (-2.04166666666683 * x**3) + (5.51111111111132 * x**2) + (-15.9000000000001 * x) + 40
		System.err.println(r)
		return r
	}
	private def medium(int x) {
		System.err.println(x)
		val r = (0.0361111111111134 * x**6) + (-0.691666666666697 * x**5) + (5.06944444444462 * x**4) + (-17.7083333333339 * x**3) + (30.8944444444452 * x**2) + (-33.6000000000004 * x) + 48
		System.err.println(r)
		return r
	}
	private def large(int x) {
		System.err.println(x)
		val r = -0.019444444444443 * x**6 + 0.341666666666656 * x**5 + -2.23611111111109 * x**4 + 6.62499999999998 * x**3 + -6.74444444444453 * x**2 + -13.9666666666666 * x + 56
		System.err.println(r)
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
		System.err.println(c)
		val Integer format = Integer.parseInt(c)
		System.err.println(format)
		var date = "";
		if (d.date == null) {
			date = "\\today"
		} else {
			date = d.date.day + "." + d.date.month + "." + d.date.year
		}
		
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
			price = d.price.value + " " + d.price.currency.value
		}
		
		/*
		var volume = ""
		if (d.volume == null) {
			volume = ""
		} else {
			price = d.price.value + " " + d.price.currency.value
		}
		*
		*/
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
		//«»
		'''
		\newcommand{\textsize}{«fontSizeMap.get(d.fontSize.value).get(format)»pt}
		\newcommand{\numberColumns}{«d.columnsCnt»}
		
		\documentclass[\textsize]{scrartcl}
		
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
		
		% Needed packages for this newspaper
		
		\usepackage[a«format»paper]{geometry}
		\usepackage[ngerman]{babel}
		\usepackage[T1]{fontenc}    
		\usepackage[utf8]{inputenc}
		\usepackage{newspaper}
		\usepackage{times}
		\usepackage{graphicx}
		\usepackage{multicol}
		\usepackage{calc}
		\usepackage{wrapfig}
		\usepackage{picinpar}
		
		% Change geometry and dimensions
		
		\setlength\headheight{\textsize}
		\setlength\headsep{\textsize/2+\textsize}
		\setlength\textwidth{0.9\paperwidth}
		\setlength\textheight{0.9\paperheight}
		\setlength\topmargin{(\paperheight-\textheight
			-\headheight-\footskip)/2 - 0.75in}
		\setlength\oddsidemargin{(\paperwidth-\textwidth)/2 - 1in}
		
		% Redefine \maketitle. Delete elements do not needed from the newspaper package 
		
		\makeatletter
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
					VOL.\MakeUppercase{\roman{volume}\ldots No.\arabic{issue}} 
					\hfill \MakeUppercase{\it\@date} 
					\hfill \MakeUppercase{\@paperprice}}
				\rule[\textsize/2]{\textwidth}{1.2pt}\\
			\end{center}
			\pagestyle{plain}
		}
		\makeatother
		
		% Set data for title
		
		\date{«date»}
		\currentvolume{1}
		\currentissue{2}
		\SetPaperName{«d.name»}
		\SetHeaderName{«d.name»}
		\SetPaperLocation{«location»}
		\SetPaperPrice{«price»}
		
		\begin{document}
			\maketitle
			
			%include topic.tex's
			
		\end{document}
		'''
	}
}
