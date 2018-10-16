package com.sdz.lesThreads;

public class TestThread extends Thread {
    /*
    public TestThread(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i < 10; i++)
            System.out.println(this.getName());
    }
    */
    /****************      Afficher les états des Threads        ****************/
    Thread t;
    public TestThread(String name){
        super(name);
        System.out.println("Constructeur 1 : statut du thread " + name + " = " +this.getState());
        this.start();
        System.out.println("Constructeur 1 : statut du thread " + name + " = " +this.getState());
    }

    public TestThread(String name, Thread t){
        super(name);
        this.t = t;
        System.out.println("Constructeur 2 : statut du thread " + name + " = " +this.getState() + " pendant le thread " + t.getName() +" = " +t.getState());
        this.start();
        System.out.println("Constructeur 2 : statut du thread " + name + " = " +this.getState() + " pendant le thread " + t.getName() +" = " +t.getState());
    }

    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Run : statut " + this.getName() + " = " +this.getState());
            if(t != null)
                System.out.println("Run : statut de " + t.getName() +" = " +t.getState()+ " pendant le thread " + this.getName() +" = " +this.getState());
        }
    }

    public void setThread(Thread t){
        this.t = t;
    }

}