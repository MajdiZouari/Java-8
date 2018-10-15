package com.sdz.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class Main {
/*
    public static void main(String[] args) {

        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(new MonRunnable());

        ScheduledExecutorService execute = Executors.newSingleThreadScheduledExecutor();

        //Execute MonRunnable toutes les secondes
        execute.scheduleAtFixedRate(new MonRunnable(), 0, 1, TimeUnit.SECONDS);


    }*/
    public static void main(String[] args) {

        //La liste qui va stocker les taches à effectuer
        List<Runnable> runnables = new ArrayList<Runnable>();

        //On créer 4 taches (instance de MonRunnable)
        runnables.add(new MonRunnable());
        runnables.add(new MonRunnable());
        runnables.add(new MonRunnable());
        runnables.add(new MonRunnable());

        /********************* Mono-thread *************************/
/*
        //Notre executor mono-thread
        ExecutorService execute = Executors.newSingleThreadExecutor();

        //La méthode qui se charge de l'exécution des tâches
        executeRunnables(execute, runnables);
*/


        /********************* Exécution de tâches en parallèles *************************/

        //Cette fois on créer un pool de 10 threads maximum
/*      ExecutorService execute = Executors.newFixedThreadPool(10);

        executeRunnables(execute, runnables);
*/
        /********************* Callable *************************/
/*      ExecutorService execute = Executors.newSingleThreadExecutor();
        execute.submit(new MonCallable());

        System.out.println("Apres submit");

        execute.shutdown();


        */
        /********************* Future *************************/
        ExecutorService execute = Executors.newSingleThreadExecutor();
        //On récupère un objet Future<V>
        Future<Integer> future = execute.submit(new MonCallable());

        try {
            //future.get() est bloquant, l'exécution attend le resultat
            //et on l'affiche dans la console.
            System.out.println("Resultat du Callable " + future.get());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Apres submit");

        execute.shutdown();


    }

    public static void executeRunnables(final ExecutorService service, List<Runnable> runnables){

        for(Runnable r : runnables){
            service.execute(r);
        }
        //On ferme l'executor une fois les taches finies
        //En effet shutdown va attendre la fin d'exécution des tâches
        service.shutdown();
    }

}