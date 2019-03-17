package com.sdz.animals;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Test {
	 
	  public static void main(String[] args) {


	    //Les méthodes d'un chien 
	    Chien c = new Chien("Gris bleuté", 20);
	    c.boire();
	    c.manger();
	    c.deplacement();
	    c.crier();
	    System.out.println(c.toString());
				
	    System.out.println("--------------------------------------------");
	    //Les méthodes de l'interface
	    c.faireCalin();
	    c.faireLeBeau();
	    c.faireLechouille();
			
	    System.out.println("--------------------------------------------");
	    //Utilisons le polymorphisme de notre interface
	    Rintintin r = new Chien();
	    r.faireLeBeau();
	    r.faireCalin();
	    r.faireLechouille();
	  } 
	}