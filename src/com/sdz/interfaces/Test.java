package com.sdz.interfaces;

public class Test {

	public static void main(String[] args){
		  //Avec cette r�f�rence, vous pouvez utiliser les m�thodes de l'interface I
		  I var = new X();
		  //Avec cette r�f�rence, vous pouvez utiliser les m�thodes de l'interface I2
		  I2 var2 = new X();
		  var.A();
		  var2.C();   
		  
		  X x = new X();
		
		  System.out.println("x.s "+x.s);
		  System.out.println("var.s "+var.s);
		}

}
