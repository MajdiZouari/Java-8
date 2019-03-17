package com.sdz.generecite;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Garage {

    List<Voiture> list = new ArrayList<Voiture>();

    public void add(List<? extends Voiture> listVoiture){
        for(Voiture v : listVoiture)
            list.add(v);

        System.out.println("Contenu de notre garage :");
        for(Voiture v : list)
            System.out.print(v.toString()+"\n");
    }
}
