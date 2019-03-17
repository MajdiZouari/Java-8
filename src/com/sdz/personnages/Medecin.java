package com.sdz.personnages;

import com.sdz.comportement.*;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Medecin extends Personnage{
    public Medecin() {
        this.soin = new PremierSoin();
    }
    public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}