package com.sdz.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {

        //Nous pouvons récupérer les différentes annotations
        //grâce à la méthode getAnnotations() de l'objet Class
        System.out.println("Annotation utilisables pour la classe ClasseMere : ");
        for(Annotation a : ClasseMere.class.getAnnotations())
            System.out.println("\t * " + a.annotationType());


        System.out.println("---------------------------------------------------");
        System.out.println("Annotation utilisables pour la classe ClasseFille : ");
        //Une autre manière de faire, avec une instance cette fois
        ClasseFille cFille = new ClasseFille();
        for(Annotation a : cFille.getClass().getAnnotations())
            System.out.println("\t * " + a.annotationType());

        //Nous récupérons la liste des méthodes définies
        Method[] methods = cFille.getClass().getDeclaredMethods();
        for(Method m : methods){
            //Pour chaque méthode, nous récupérons ses annotations
            Annotation[] annotations = m.getAnnotations();
            System.out.println("\nAnnotation sur la méthode " + m.toString() + " de la classe " + cFille.getClass().toString());
            for(Annotation a : annotations)
                System.out.println("\t -> " + a.annotationType());
        }


    }
}