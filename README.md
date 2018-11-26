# A Lisp Way to Type Theory and Formal Proof

LaTTe@EuropeanLispSymposium2017  (paper &amp; presentation)


[LaTTe](https://github.com/latte-central/LaTTe) is a proof assistant based on (a) type theory.
This repository contains the material for the paper about LaTTe at [the European Lisp Symposium, 2017](https://www.european-lisp-symposium.org/2017/index.html).

## Author

**Frederic Peschanski** - LIP6 (computer science laboratory) - Sorbonne University

## Abstract

>   In this paper we describe the LaTTe proof assistant, a software that promotes the Lisp notation for the formalization of and reasoning about
  mathematical contents. LaTTe is based on type theory and implemented as a Clojure library with top-level forms for specifying axioms, definitions, theorems and proofs. As a pure library, LaTTe can exploit the advanced interactive coding experience provided by modern development environments. Moreover, LaTTe enables a form of proving in the large by leveraging the Clojar/Maven ecosystem. It also introduces a very simple and concise domain-specific proof language
  that is deeply rooted in natural deduction proof theory. And when pure logic is not enough, the system
  allows to take advantage of the host language: a Lisp way to proof automation.


## Contents

 - The paper *"A Lisp Way to Type Theory and Formal Proof"* [[PDF]](https://github.com/latte-central/latte-ELS-2017/blob/master/paper/latte-els-2017.pdf)
   (the whole proceedings are also [available](https://www.european-lisp-symposium.org/static/proceedings/2017.pdf))
 
 - The LaTeX sources of the paper in directory `paper/` with some Coq vs. LaTTe examples in `paper/examples`
 
 - The slides of the presentation [[PDF]](https://github.com/latte-central/latte-ELS-2017/blob/master/talk/LaTTe_at_ELS2017.pdf)
 
 - The (relatively low-quality) video is also [available online](https://www.youtube.com/watch?v=J4gkBHc_xz8)

## Reference

If by any chance you would like to cite the paper in your own work, please use the following BibTeX:

```bibtex
@InProceeding{LaTTe@ELS2017,
  title = {A Lisp Way to Type Theory and Formal Proof},
  author = {Frederic Peschanski},
  booktitle = {10th European Lisp Symposium},
  year = {2017},
  pages = {20--27} 
}
```

----
Copyright (C) 2017 Frederic Peschanski, Creative Commons CC-BY-NC-ND 4.0  (cf. `legalcode.txt` file)

