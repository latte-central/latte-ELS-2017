
Require Import Coq.Logic.Classical_Prop.

Theorem fitch:
  forall P Q R : Prop,
    (P -> Q) /\ (~R -> ~Q)
    -> (P -> R).

Proof.
  (* This is a manual proof. *)
  intros P Q R H.
  inversion_clear H.
  intro HP.
  assert (HQ: Q).
  { apply H0. exact HP. }
  assert (HRcut: R \/ ~R).
  { apply classic. }
  inversion HRcut.
  - exact H.
  - assert (HnQ: ~Q).
    { apply H1. exact H. }
    contradiction.
  (* The same proof can be done automatically *)
  (* intros ; tauto. *)
Qed.


