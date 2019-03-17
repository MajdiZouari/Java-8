package com.sdz.personnages;
/**
 * Created by MZouari on 18/01/2019.
 */
class Test{
    public static void main(String[] args) {
        Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};

        for(int i = 0; i < tPers.length; i++){
            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("*****************************************");
            tPers[i].combattre();
            tPers[i].seDeplacer();
            tPers[i].soigner();
        }
    }
}