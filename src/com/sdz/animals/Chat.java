package com.sdz.animals;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Chat extends Felin {
	 
	  public Chat(){

	  }
	  public Chat(String couleur, int poids){
	    this.couleur = couleur;
	    this.poids = poids;
	  }
	        
	  void crier() {
	    System.out.println("Je miaule sur les toits !");
	  } 
	}