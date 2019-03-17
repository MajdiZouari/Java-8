package com.sdz.personnages;

import com.sdz.comportement.*;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Guerrier extends Personnage {
    public Guerrier(){
        this.espritCombatif = new CombatPistolet();
    }
    public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}