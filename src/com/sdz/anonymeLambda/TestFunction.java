package com.sdz.anonymeLambda;
import com.sdz.comportement.*;
import com.sdz.personnages.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
/**
 * Created by MZouari on 18/01/2019.
 */
public class TestFunction {
    public static void main(String[] args) {

        List<Personne> lPersonne = Arrays.asList(
                new Personne(10, "toto"),
                new Personne(20, "titi"),
                new Personne(30, "tata"),
                new Personne(40, "tutu")
        );

        Function<Personne, String> f1 = (Personne p) -> p.getNom();
       /* for (Personne p : lPersonne) {
            f1.apply(p);
            //func.apply(p) retournera ici le nom de l'objet Personne
        }*/
        Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2;
        for (Personne p : lPersonne) {
            f2.apply(p);
            //func.apply(p) retournera ici le nom de l'objet Personne
        }
        System.out.println(lPersonne);

        System.out.println(transformToListString(lPersonne, f1));
        System.out.println(transformToListInt(lPersonne, f2));


        // Nous définissons un traitement supplémentaire sur l'âge
        Function<Integer, Integer> f3 = (Integer a) -> a * 2;
        System.out.println(transformToListString(lPersonne, f1));
        System.out.println(transformToListInt(lPersonne, f2.andThen(f3)));
    }


    public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func){
        List<String> ls = new ArrayList<>();
        for (Personne p : list) {
            ls.add(func.apply(p));
            //func.apply(p) retournera ici le nom de l'objet Personne
        }
        return ls;
    }
    public static List<Integer> transformToListInt(List<Personne> list, Function<Personne, Integer> func){
        List<Integer> ls = new ArrayList<>();
        for (Personne p : list) {
            ls.add(func.apply(p));
            //func.apply(p) retournera ici l'âge multiplié par 2 de l'objet Personne
        }
        return ls;
    }
}
