package com.sdz.anonymeLambda;

import java.util.function.Supplier;
/**
 * Created by MZouari on 18/01/2019.
 */
public class TestSupplier {
    public static void main(String[] args) {
        Supplier<String> s1 = () -> new String("hello !");
        System.out.println(s1.get());
        Supplier<Personne> s2 = () -> new Personne(50, "Dédé");
        System.out.println(s2.get());
    }
}