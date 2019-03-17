package com.sdz.animals;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Loup extends Canin {
	 
	  public Loup(){
	                
	  }

	  public Loup(String couleur, int poids){
	    this.couleur = couleur;
	    this.poids = poids;
	  }       
	 
	  void crier() {
	    System.out.println("Je hurle à la Lune en faisant ouhouh !"); 
	  }
	}