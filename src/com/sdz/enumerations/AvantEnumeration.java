package com.sdz.enumerations;

public class AvantEnumeration {

	
	/********** Sans Enum *********************/
	public static final int PARAM1 = 1;
	public static final int PARAM2 = 2;
	   
	public void fait(int param){
	    if(param == PARAM1)
	      System.out.println("Fait à la façon N°1");
	    if(param == PARAM2)
	    	System.out.println("Fait à la façon N°2");
	}
		  
	  /************* Avec Enum *******************/
	public void faitEnum(Langage param){
		if(param.equals(Langage.JAVA))
		    System.out.println("Fait à la façon N°1");
		if(param.equals(Langage.PHP))
			System.out.println("Fait à la façon N°2");
	  }

	}