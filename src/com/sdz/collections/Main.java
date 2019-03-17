package com.sdz.collections;
import java.util.*;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Main {
 
  public static void main(String[] args) {
	    /************************    LinkedList   ***************************************/
	System.out.println("-------------------   LinkedList                   ----------------");
	List l = new LinkedList();
    l.add(12);
    l.add("toto ! !");
    l.add(12.20f);

    for(int i = 0; i < l.size(); i++)
      System.out.println("�l�ment � l'index " + i + " = " + l.get(i));

    System.out.println("\n \tParcours avec un it�rateur ");
    System.out.println("-----------------------------------");
    ListIterator li = l.listIterator();

    while(li.hasNext())
      System.out.println(li.next());
    
    
    /************************    ArrayList   (accepte null)     ***************************************/
    System.out.println("-------------------   ArrayList                   ----------------");
    ArrayList al = new ArrayList();
    al.add(12);
    al.add("Une cha�ne de caract�res !");
    al.add(12.20f);
    al.add('d');
    al.add(null);
                
    for(int i = 0; i < al.size(); i++)
    {
      System.out.println("donn�e � l'indice " + i + " = " + al.get(i));
    }  
    
    /************************    HashTable     ***************************************/
    System.out.println("----------------     HashTable    -------------------");
    Hashtable ht = new Hashtable();
    ht.put(1, "printemps");
    ht.put(10, "�t�");
    ht.put(12, "automne");
    ht.put(45, "hiver");
    

    Enumeration e = ht.elements();

    while(e.hasMoreElements())
      System.out.println(e.nextElement());

    /************************    HashSet    ***************************************/
    System.out.println("----------------     HashSet    -------------------");
    HashSet hs = new HashSet();
    hs.add("toto");
    hs.add(12);
    hs.add('d');

    Iterator it = hs.iterator();
    while(it.hasNext())
      System.out.println(it.next());
 
    System.out.println("\nParcours avec un tableau d'objet");
    System.out.println("-----------------------------------");
                
    Object[] obj = hs.toArray();
    for(Object o : obj)
      System.out.println(o);


    /************************    HashMap    ***************************************/
    System.out.println("----------------     HashMap    -------------------");
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("France", "Paris");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");

    for (String i : capitalCities.keySet()) {
      System.out.println("key: " + i + " value: " + capitalCities.get(i));
    }
    capitalCities.get("England");


  }
}