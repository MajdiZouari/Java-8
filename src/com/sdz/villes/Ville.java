package com.sdz.villes;

import java.util.Objects;

public class Ville{   

  protected String nomVille;
  protected String nomPays;
  protected int nbreHabitants;
  protected char categorie;
  
 
  //Variable privée qui comptera aussi les instances
  protected static int nbreInstancesBis = 0;      
  //Variables publiques sans encapsulation qui comptent les instances
  public static  int nbreInstances = 0;
  

  //Constructeur par défaut
  public Ville(){

	//On incrémente nos variables à chaque appel aux constructeurs
	nbreInstances++;
	nbreInstancesBis++;
    System.out.println("Création d'une ville !");      
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
    this.setCategorie();
//    System.out.println(this.decrisToi());


  }

  public Ville(String pNom, int pNbre, String pPays) 
		  throws  NombreHabitantException,NomVilleException
		  {  
		    if(pNbre < 0)
		      throw new NombreHabitantException(pNbre); 
		    if(pNom.length() < 3)
		        throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);
		      else
		    {
		        nbreInstances++;
		        nbreInstancesBis++;
		        System.out.println("Création d'une ville avec des paramètres !");
		        nomVille = pNom;
		        nomPays = pPays;
		        nbreHabitants = pNbre;
		        this.setCategorie();
                System.out.println("Le nombre d'instances de la classe com.sdz.villes.Ville est : " + Ville.nbreInstances);
                System.out.println("Le nombre d'instances de la classe com.sdz.villes.Ville est : " + Ville.getNombreInstancesBis());
		    }
		  }
  
//  @Override
//public int hashCode() {
//	final int prime = 31;
//	int result = 1;
//	result = prime * result + categorie;
//	result = prime * result + nbreHabitants;
//	result = prime * result + ((nomPays == null) ? 0 : nomPays.hashCode());
//	result = prime * result + ((nomVille == null) ? 0 : nomVille.hashCode());
//	return result;
//}
  public int hashCode() {
	  return Objects.hash(categorie, nbreHabitants, nomPays, nomVille);
	}
  public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ville other = (Ville) obj;
	  return Objects.equals(other.getCategorie(), this.getCategorie()) &&
				 Objects.equals(other.getNom(), this.getNom()) &&
				 Objects.equals(other.getNombreHabitants(), this.getNombreHabitants()) &&
				 Objects.equals(other.getNomPays(), this.getNomPays());
}

//*************   Getters   *************
  public String getNom()  {  
    return nomVille;
  }

  public String getNomPays(){
    return nomPays;
  }
  
  public int getNombreHabitants(){
    return nbreHabitants;
  } 
 
  public char getCategorie(){
    return categorie;
  } 
  //*************   Setters   *************

  public void setNom(String pNom){
    nomVille = pNom;
  }

  public void setNomPays(String pPays){
    nomPays = pPays;
  }

  public void setNombreHabitants(int nbre){
    nbreHabitants = nbre;
  }  
  
  protected static int getNombreInstancesBis(){
    return nbreInstancesBis;
  }
  
  private void setCategorie() {
	  
	    int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
	    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

	    int i = 0;
	    while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
	      i++;

	    this.categorie = categories[i];
	  }
  
  
  //Retourne la description de la ville
  protected String decrisToi(){
      return  "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
  }

  public String toString(){
	  return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "+this.nbreHabitants+" => elle est donc de catégorie : "+this.categorie;
	  }
    //Retourne une chaîne de caractères selon le résultat de la comparaison
    public String comparer(Ville v1){
        String str = new String();

        if (v1.getNombreHabitants() > this.nbreHabitants)
            str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;

        else
            str = this.nomVille+" est une ville plus peuplée que "+v1.getNom();

        return str;
    }
}