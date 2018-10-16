package com.sdz.executor;

public class MonRunnable implements Runnable {

    @Override
    public void run(){
        /*
        //System.out.println("Travail à effectuer");
        int proc = Runtime.getRuntime().availableProcessors();
        System.out.println("Le nombre de process est : "+ proc);
        */
        try {
            //On simule un traitement long en mettant en pause le Thread pendant 4 secondes
            Thread.sleep(4000);
            //On affiche le nom du thread où on se trouve
            System.out.println("Execution dans le thread " + Thread.currentThread().getName());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}