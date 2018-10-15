package com.sdz.villes;

class NombreHabitantException extends Exception{
	
  public NombreHabitantException(){
    System.out.println("Vous essayez d'instancier une classe com.sdz.villes.Ville avec un nombre d'habitants négatif !");
  }  
  public NombreHabitantException(int nbre)
  {
    System.out.println("Instanciation avec un nombre d'habitants négatif.");
    System.out.println("\t => " + nbre);
  }
}