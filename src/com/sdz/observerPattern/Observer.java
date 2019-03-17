package com.sdz.observerPattern;
/**
 * Created by MZouari on 18/01/2019.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}