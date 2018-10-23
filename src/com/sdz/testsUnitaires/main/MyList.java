package com.sdz.testsUnitaires.main;

public interface MyList<T extends Comparable<T>> {

    void add(T e);
    T removeAt(int pos);
    T removeItem(T item);
    void setAt(T item, int pos);
    T getAt(int pos);
    int getSize();
    void reset();

}