package com.sdz.strategyPattern;
/**
 * Created by MZouari on 18/01/2019.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}