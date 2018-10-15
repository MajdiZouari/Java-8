package com.sdz.anonymeLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {

        List<Personne> lPersonne = Arrays.asList(
                new Personne(10, "toto"),
                new Personne(20, "titi"),
                new Personne(30, "tata"),
                new Personne(40, "tutu")
        );

        Predicate<Personne> predicate = (Personne p) -> p.getAge() > 20;
        for (Personne p : lPersonne) {
            if(predicate.test(p))
                System.out.println(p.getNom() + " a l'âge requis !");
        }
    }
}