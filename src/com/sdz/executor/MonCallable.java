package com.sdz.executor;

import java.util.concurrent.Callable;

public class MonCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception	{

        try {
            Thread.sleep(4000);
            //Traitement....
            System.out.println("Dans le Callable");
        }
        catch(InterruptedException e){
            throw new Exception("Thread interrompu ; cause " + e.getMessage());
        }
        return 3;//On peut retourner une valeur
    }
}