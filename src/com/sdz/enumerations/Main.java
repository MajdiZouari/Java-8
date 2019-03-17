package com.sdz.enumerations;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Main {

	  public static void main(String args[]){
		    AvantEnumeration ae = new AvantEnumeration();
		    ae.fait(AvantEnumeration.PARAM1);
		    ae.fait(AvantEnumeration.PARAM2);
		    ae.fait(4);
		    
		    for(Langage lang : Langage.values()){
		        if(Langage.JAVA.equals(lang))
		          System.out.println("J'aime le : " + lang);
		        else
		          System.out.println(lang);
		      }
		    

		    ae.faitEnum(Langage.JAVA);
		    ae.faitEnum(Langage.PHP);
		    //ae.faitEnum(4);
		    
		    Langage l1 = Langage.JAVA;
		    Langage l2 = Langage.PHP;
		      
		    l1.getEditor();
		    l2.getEditor();
		  }
}
