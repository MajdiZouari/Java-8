package com.sdz.personnages;

import com.sdz.comportement.*;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Civil extends Personnage{
    public Civil() {}

    public Civil(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}