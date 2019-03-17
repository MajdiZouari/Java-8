package com.sdz.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
/**
 * Created by MZouari on 18/01/2019.
 */
public class TestTask {

    /**************************   Service de terminaison : ExecutorCompletionService   **********************************/
    public static void main(String[] args) {
        //Notre liste qui va contenir toutes les tâches
        List<Callable<Integer>> taches = new
                ArrayList<Callable<Integer>>();
        //On créé 4 tâches avec un paramètre pour le Thread.sleep() différent.
        Callable<Integer> tache1 = new Task(1);
        Callable<Integer> tache2 = new Task(5);
        Callable<Integer> tache3 = new Task(10);
        Callable<Integer> tache4 = new Task(2);
        //On ajoute ces taches à la liste
        taches.add(tache1);
        taches.add(tache2);
        taches.add(tache3);
        taches.add(tache4);
        //On instancie un executor contenant 10 threads pour pouvoir exécuter nos actions en parallèles
        ExecutorService executor = Executors.newFixedThreadPool(10);
        resoudre(executor, taches);
    }

    public static void resoudre(final ExecutorService executor,
                                List<Callable<Integer>> taches) {
        //Le service de terminaison
        CompletionService<Integer> completionService = new
                ExecutorCompletionService<Integer>(executor);
        //une liste de Future pour récupérer les résultats
        List<Future<Integer>> futures = new ArrayList<Future<Integer>>();

        Integer res = null;
        try {
            //On soumet toutes les tâches à l'executor
            for(Callable<Integer> t : taches){
                futures.add(completionService.submit(t));
            }

            for (int i = 0; i < taches.size(); ++i) {

                try {

                    //On récupère le premier résultat disponible
                    //sous la forme d'un Future avec take(). Puis l'appel
                    //à get() nous donne le résultat du Callable.
                    res = completionService.take().get();
                    if (res != null) {

                        //On affiche le resultat de la tâche
                        System.out.println(res);
                    }
                }
                catch(ExecutionException ignore) {}
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }
    }
}

