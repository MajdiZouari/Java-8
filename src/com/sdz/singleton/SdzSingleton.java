package com.sdz.singleton;

public class SdzSingleton {
    /*********************************       ***********************************/
    //Le singleton
    private static SdzSingleton single;

    /* On peut instancier le Singleton à sa déclaration pour ne pas avoir de problèmes avec
    *  le Singleton et le Multi-Threading, la suite est la même.
    *  Avec ce code, c'est la machine virtuelle qui s'occupe de charger l'instance du singleton,
    *  bien avant que n'importe quel thread vienne taquiner la méthode getInstance()*/

    /*private static SdzSingleton single = new SdzSingleton();*/

    //Variable d'instance
    private String name = "";

    //Constructeur privé
    private SdzSingleton(){
        this.name = "Mon singleton";
        System.out.println("\t\tCREATION DE L'INSTANCE ! ! !");
    }

    //Méthode d'accès au singleton
    public static SdzSingleton getInstance(){
        if(single == null)
            single = new SdzSingleton();

        return single;
    }

    //Accesseur
    public String getName(){
        return this.name;
    }


    /*********************************   Signleton avec Volatile et Synchronized  ***********************************/
    /* déclarer une variable volatile permet d'assurer un accès ordonné des threads à une variable
     *(plusieurs threads peuvent accéder à cette variable), marquant ainsi le premier point de verrouillage.
     * Ensuite, la double vérification s'effectue dans la méthode getInstance() :
     * on effectue la synchronisation uniquement lorsque le singleton n'est pas créé.
     */

    /*
      private volatile static SdzSingleton single;
      private String name = "";

      private SdzSingleton(){
        this.name = "Mon singleton";
        System.out.println("\n\t\tCRÉATION DE L'INSTANCE ! ! !");
      }

      public static SdzSingleton getInstance(){
        if(single == null){
          synchronized(SdzSingleton.class){
            if(single == null)
              single = new SdzSingleton();
          }
        }
        return single;
      }

      public String getName(){
        return this.name;
      }
    */
}