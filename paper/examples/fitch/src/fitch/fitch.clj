(ns fitch.fitch

  (:refer-clojure :exclude [and or not])

  (:require [latte.core :as latte :refer [definition defthm defaxiom defnotation
                                          forall lambda ==>
                                          assume have proof lambda forall]]
            [latte.quant :as q :refer [exists]]
            [latte.prop :as p :refer [<=> and or not]]
            [latte.equal :as eq :refer [equal]]
            [latte.classic :as classic]))


(defthm fitch
  [[P :type] [Q :type] [R :type]]
  (==> (and (==> P Q)
            (==> (not R) (not Q)))
       (==> P R)))


(proof fitch
    :script
  (assume [H (and (==> P Q)
                  (==> (not R) (not Q)))]
    (have <a> (==> P Q) :by (p/and-elim-left% H))
          (assume [x P]
            (have <b> Q :by (<a> x))
            (have <c> (==> (not R) (not Q)) :by (p/and-elim-right% H))
            (assume [HR (not R)]
              (have <d> (not Q) :by (<c> HR))
              (have <e> p/absurd :by (<d> <b>)))
            (have <f> R :by ((classic/not-not-impl R) <e>)))
          (qed <f>)))




