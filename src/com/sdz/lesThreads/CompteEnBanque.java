package com.sdz.lesThreads;
/**
 * Created by MZouari on 18/01/2019.
 */
public class CompteEnBanque {
    private int solde = 100;

    public int getSolde(){
        if(this.solde < 0)
            System.out.println("Vous etes a decouvert !");

        return this.solde;
    }

    public synchronized void retraitArgent(int retrait){
        solde = solde - retrait;
        System.out.println("Solde = " + solde);
    }
}