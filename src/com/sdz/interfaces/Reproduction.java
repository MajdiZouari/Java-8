package com.sdz.interfaces;
/**
 * Created by MZouari on 18/01/2019.
 */
public interface Reproduction {

    public static void description() {
        System.out.println("Méthode description statique dans une interface");
    }
    default void  parlement() {
        System.out.println("Méthode parlement statique dans une interface");
    }


    default void reproduire(){
        System.out.println("Méthode reproduire statique dans une interface");
    }
}
