
SOURCE=latte-els-2017

all: pdf

dvi: main.dvi 

pdf: main.pdf 

ps: main.ps

LATEX=latex
BIBTEX=bibtex
PDFLATEX=pdflatex
BIBTEX=bibtex
DVIPS=dvips

main.dvi: $(SOURCE).tex
	$(LATEX) $(SOURCE).tex
	$(BIBTEX) $(SOURCE)
	$(LATEX) $(SOURCE).tex
	$(LATEX) $(SOURCE).tex

main.pdf:
	$(PDFLATEX) $(SOURCE).tex
	$(BIBTEX) $(SOURCE)
	$(PDFLATEX) $(SOURCE).tex
	$(PDFLATEX) $(SOURCE).tex

main.ps: main.dvi
	$(DVIPS) $(SOURCE).dvi -o $(SOURCE).ps

cleanall: clean
	rm -f $(SOURCE).dvi
	rm -f $(SOURCE).ps
	rm -f $(SOURCE).pdf

clean:
	rm -f *~
	rm -f *.log
	rm -f *.aux
	rm -f *.bak
	rm -f *.bbl
	rm -f *.blg
	rm -f *.toc
