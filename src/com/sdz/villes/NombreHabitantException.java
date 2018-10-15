package com.sdz.villes;

class NombreHabitantException extends Exception{
	
  public NombreHabitantException(){
    System.out.println("Vous essayez d'instancier une classe com.sdz.villes.Ville avec un nombre d'habitants n�gatif !");
  }  
  public NombreHabitantException(int nbre)
  {
    System.out.println("Instanciation avec un nombre d'habitants n�gatif.");
    System.out.println("\t => " + nbre);
  }
}