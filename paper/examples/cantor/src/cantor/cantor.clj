(ns cantor.cantor
  (:refer-clojure :exclude [and or not set])
  
  (:require
   [latte.core :as latte :refer [definition defthm defaxiom defnotation
                                 forall lambda ==>
                                 assume have pose proof lambda forall]]
   [latte.quant :as q :refer [exists]]
   [latte.prop :as p :refer [<=> and or not]]
   [latte.equal :as eq :refer [equal]]))


(definition surjective
  "Surjective function."
  [[A :type] [B :type] [f (==> A B :type)]]
  (forall [y (==> B :type)]
    (exists [x A]
      (forall [z B]
        (<=> (f x z) (y z))))))

(defthm cantor
  "Cantor's theorem."
  [[A :type] [f (==> A A :type)]]
  (not (surjective A A f)))

(proof cantor
    :script
  (pose B := (λ [x A] (not (f x x))))
  (assume [H1 (surjective A A f)]
    (have <a> (exists [x A]
                (forall [z A] (<=> (f x z) (B z))))
          :by (H1 B))
    (assume [x A
             Hx (∀ [z A] (<=> (f x z) (B z)))]
      (have <b> (<=> (f x x) (B x))
            :by (Hx x))
      (have <c> (<=> (f x x) (not (f x x)))
            :by <b>)
      (assume [H2 (f x x)]
        (have <d> (not (f x x))
              :by ((p/and-elim-left% <c>) H2))
        (have <e> p/absurd :by (<d> H2)))
      (have <f> (f x x) :by ((p/and-elim-right% <c>) <e>))
      (have <g> p/absurd :by (<e> <f>)))
    "existential elimination"
    (have <h> p/absurd :by ((q/ex-elim A (λ [x A]  (forall [z A] (<=> (f x z) (B z))))
                                       p/absurd)
                            <a> <g>)))
  (qed <h>))



