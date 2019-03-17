package com.sdz.villes;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Capitale extends Ville {
     
  private String monument;
    
  //Constructeur par défaut
  public Capitale(){
    //Ce mot clé appelle le constructeur de la classe mère
    super();
    monument = "Tour Eiffel";
    nomVille = "nomCapitale";
  }    
      
  //Constructeur d'initialisation de capitale
//  public com.sdz.villes.Capitale(String nom, int hab, String pays, String monument){
//    super(nom, hab, pays);
//    this.monument = monument;
//  }    
     
  /**
    * Description d'une capitale
    * @return String retourne la description de l'objet
  */
  protected String decrisToi(){
    String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument";

    return str;
    } 

  /**
    * @return le nom du monument
  */
  public String getMonument() {
    return monument;
  } 

  //Définit le nom du monument
  public void setMonument(String monument) {
    this.monument = monument;
  }

  public String toString(){
	  String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
	  return str;
	  }
}