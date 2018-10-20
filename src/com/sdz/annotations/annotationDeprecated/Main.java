package com.sdz.annotations.annotationDeprecated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
/*
    public static void main(String[] args) {
        MaClasse mc = new MaClasse();
        MaClasse2 mc2 = new MaClasse2();
        mc2.doSomething();
    }
*/


/*
*
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        MaClasse mc = new MaClasse();
        MaClasse2 mc2 = new MaClasse2();
        mc2.doSomething();
    }
* */

/*
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        MaClasse mc = new MaClasse();
        MaClasse2 mc2 = new MaClasse2();
        mc2.doSomething();
    }
*/

    //Nous pouvons passer un tableau de valeurs pour gérer plusieurs types de warnings d'un coup
    //pas de warning sur la dépréciation et l'utilisation de type non générique
    @SuppressWarnings({ "deprecation", "unchecked" })
    public static void main(String[] args) {
        //pas de warning sur les éléments non utilisés
        @SuppressWarnings("unused")
        MaClasse mc = new MaClasse();
        MaClasse2 mc2 = new MaClasse2();
        mc2.doSomething();
        //pas de warning sur les éléments non utilisés
        @SuppressWarnings("unused")
        int i = 1, j = 2;
        //Pas de warning sur un type générique utilisé sans typage
        @SuppressWarnings("rawtypes")
        List list = new ArrayList();
        list.add("toto");
        List<String> listString = new ArrayList<String>();
        listString.addAll(list);
    }

    //Pas de warning même si la méthode n'est pas utilisée
    @SuppressWarnings("unused")
    private static void doIt(int i){
        switch(i){
            case 1:
            case 2:
                System.out.println("coucou");
            case 3 :
        }
    }

    @SuppressWarnings("serial")
    public class ExempleSerializable implements Serializable {
        //Plus de Warning en cas d'absence du serialUID
    }

}
