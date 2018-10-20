package com.sdz.annotations.monAnnotation;

import com.sdz.annotations.AnnotationZ;

public @interface MonAnnotation {
    //Définition d'un élément
    String monChamp1();

    //Définition d'un élément avec une valeur par défaut
    String monChamp2() default "valeur par défaut du champ";

    //Utilisation d'une énumération
    NIVEAU niveau() default NIVEAU.MINEUR;

    //Déclaration d'un tableau
    int[] tableauEntier();

    //Déclaration d'un tableau
    char [] tableauCaractere() default {'A', 'D'};

    //Utilisation d'une annotation déjà créée
    AnnotationZ annotation();

    //Utilisation d'un objet Class
    Class uneClasse() default Double.class;
}
