package com.sdz.observerPattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}