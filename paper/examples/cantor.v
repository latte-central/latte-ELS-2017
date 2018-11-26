
Definition surjective {A B : Type} (f: A -> B) : Prop :=
  forall y : B, exists x : A, (f x) = y.

Definition powerset (A : Type) := A -> Prop.

Theorem cantor:
  forall A : Type, forall f : A -> (powerset A),
    not (surjective f).
  
Proof.
  intros A f H1.
  unfold surjective in H1.
  assert (H2: exists x : A, f x = fun x:A => not (f x x)).
  { apply H1 with (y:= fun x:A => not (f x x)).
  }
  inversion H2.
  assert (H3: (fun x0 : A => ~ f x0 x0) x = ~ f x x).
  { reflexivity. }
  rewrite <- H in H3.
  assert (H4: f x x <-> ~ f x x).
  {
    rewrite <- H3.
    tauto.
  }
  tauto.
Qed.

Print cantor.