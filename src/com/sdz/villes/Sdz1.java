package com.sdz.villes;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Sdz1 {

	public static void main (String[] args) {
//		com.sdz.villes.Ville v = new com.sdz.villes.Ville();
//		String m = v.getNom();
//		System.out.println("Le nombre d'instances de la classe com.sdz.villes.Ville est : " + com.sdz.villes.Ville.nbreInstances);
//		System.out.println("Le nombre d'instances de la classe com.sdz.villes.Ville est : " + com.sdz.villes.Ville.getNombreInstancesBis());
//			                        
//		com.sdz.villes.Ville v1 = new com.sdz.villes.Ville("Marseille", 1236, "France");
//		System.out.println("Le nombre d'instances de la classe com.sdz.villes.Ville est : " + com.sdz.villes.Ville.nbreInstances);
//		System.out.println("Le nombre d'instances de la classe com.sdz.villes.Ville est : " + com.sdz.villes.Ville.getNombreInstancesBis());
//		                
//		com.sdz.villes.Ville v2 = new com.sdz.villes.Ville("Rio", 321654, "Brésil");
//		System.out.println("Le nombre d'instances de la classe com.sdz.villes.Ville est : " + com.sdz.villes.Ville.nbreInstances);
//		System.out.println("Le nombre d'instances de la classe com.sdz.villes.Ville est : " + com.sdz.villes.Ville.getNombreInstancesBis());
//	
		
		
		/**/
		Capitale capi = new Capitale();
		Capitale cap = new Capitale();
		System.out.println("++++++++++++++++++++"+cap.decrisToi());
		/*
		
		//Définition d'un tableau de villes null
		com.sdz.villes.Ville[] tableau = new com.sdz.villes.Ville[6];
		        
		//Définition d'un tableau de noms de Villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		         
		//Les trois premiers éléments du tableau seront des Villes
		//et le reste des capitales
		for(int i = 0; i < 6; i++){
		  if (i <3){
		    com.sdz.villes.Ville V = new com.sdz.villes.Ville(tab[i], tab2[i], "france");
		    tableau[i] = V;
		  }
		         
		  else{
		    com.sdz.villes.Capitale C = new com.sdz.villes.Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
		    tableau[i] = C;
		  }
		}
		                 
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Object obj : tableau){
		  System.out.println(obj.toString()+"\n");
		  System.out.println(((com.sdz.villes.Ville)obj).decrisToi()+"\n");
		}
	*/

		Ville v = null;
		  try {                   
		    v = new Ville("Rennes", 12000, "France");         
		  }

		//Gestion de l'exception sur le nombre d'habitants
		catch (NombreHabitantException e) {
		  e.printStackTrace();
		}

		//Gestion de l'exception sur le nom de la ville
		catch(NomVilleException e2){
		  System.out.println(e2.getMessage());
		}
		finally{
		  if(v == null)
		    v = new Ville();
		}
		  System.out.println(v.toString());

	}
}
