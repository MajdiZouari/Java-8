package com.sdz.comportement;
/**
 * Created by MZouari on 18/01/2019.
 */
public class AucunSoin implements Soin {
    @Override
    public void soigne() {
        System.out.println("Je ne donne AUCUN soin !");
    }
}
