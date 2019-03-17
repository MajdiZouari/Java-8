package com.sdz.executor;

import java.util.concurrent.Callable;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Task implements Callable<Integer> {

    private final int sleepTime;

    public Task(int n) {
        sleepTime = n;
    }

    @Override
    public Integer call() throws Exception {

        Thread.sleep(1000 * sleepTime);
        return sleepTime;
    }

}