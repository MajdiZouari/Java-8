package com.sdz.anonymeLambda;

import com.sdz.comportement.*;
import com.sdz.personnages.*;

class Test{

    public static void main(String[] args) {
        Personnage pers = new Guerrier();
        pers.soigner();
        pers.setSoin(new Operation());
        pers.soigner();

        //Utilisation d'une classe anonyme
        pers.setSoin(new Soin() {
            public void soigne() {
                System.out.println("Je soigne avec une classe anonyme ! ");
            }
        });

        pers.soigner();

        //Utilisation d'une classe anonyme
        Dialoguer d = new Dialoguer() {
            public void parler(String question) {
                System.out.println("Tu as dis : " + question);
            }
        };
        d.parler("Bonjour classe anonyme");


        //Utilisation d'une expression lambda
        Dialoguer dLambda = (s) -> System.out.println("Tu as dis : " + s);
        dLambda.parler("Bonjour Lambda");
    }
}