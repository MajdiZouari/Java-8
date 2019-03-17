package com.sdz.animals;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Lion extends Felin {
	 
	  public Lion(){

	  }

	  public Lion(String couleur, int poids){
	    this.couleur = couleur;
	    this.poids = poids;
	  }       
	 
	  void crier() {
	    System.out.println("Je rugis dans la savane !");
	  } 
	}