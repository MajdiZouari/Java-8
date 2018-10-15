package com.sdz.anonymeLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestConsumer {
    public static void main(String[] args) {

        List<Personne> lPersonne = Arrays.asList(
                new Personne(10, "toto"),
                new Personne(20, "titi"),
                new Personne(30, "tata"),
                new Personne(40, "tutu")
        );

        System.out.println(lPersonne);
        Consumer<Personne> c = (Personne p) -> p.setAge(p.getAge() + 13);
        for(Personne p : lPersonne)
            c.accept(p);
        System.out.println(lPersonne);


        Function<Personne, String> f1 = (Personne p) -> p.getNom();
        List<String> ls = new ArrayList<>();
        for (Personne p : lPersonne) {
            ls.add(f1.apply(p));
            //func.apply(p) retournera ici le nom de l'objet Personne
        }
        System.out.println(ls);
    }
}