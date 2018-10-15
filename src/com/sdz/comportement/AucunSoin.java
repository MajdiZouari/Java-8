package com.sdz.comportement;

public class AucunSoin implements Soin {
    @Override
    public void soigne() {
        System.out.println("Je ne donne AUCUN soin !");
    }
}
