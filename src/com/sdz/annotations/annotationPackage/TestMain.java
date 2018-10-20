package com.sdz.annotations.annotationPackage;

import java.lang.annotation.Annotation;

public class TestMain {
    public static void main(String[] args) {
        //nous pouvons récupérer le package à partir d'une classe
        Package pack = Test1.class.getPackage();
        System.out.println("Annotations utilisables pour le package : " + pack.getName());

        for(Annotation a : pack.getAnnotations())
            System.out.println("\t * " + a.annotationType());

    }
}