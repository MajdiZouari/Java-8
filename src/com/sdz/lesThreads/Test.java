package com.sdz.lesThreads;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Test {
    /*
    public static void main(String[] args) {
        TestThread t = new TestThread("A");
        TestThread t2 = new TestThread("  B");
        t.start();
        t2.start();
    }
    */

    /****************      Afficher les états des Threads        ****************/
    /*
    public static void main(String[] args) {
        TestThread t = new TestThread("A");
        TestThread t2 = new TestThread("  B", t);
        try {
            System.out.println("Debut Sleep");
            Thread.sleep(10000);
            System.out.println("Fin Sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Test : statut du thread " + t.getName() + " = " + t.getState());
        System.out.println("Test : statut du thread " + t2.getName() + " = " + t2.getState());

    }
    */
    /****************      Threads avec implementation de l'interface Runnable       ****************/
    public static void main(String[] args) {
        CompteEnBanque cb = new CompteEnBanque();
        CompteEnBanque cb2 = new CompteEnBanque();

        Thread t = new Thread(new RunImpl(cb, "Cysboy"));
        Thread t2 = new Thread(new RunImpl(cb2, "Zero"));
        t.start();
        t2.start();
    }

}
