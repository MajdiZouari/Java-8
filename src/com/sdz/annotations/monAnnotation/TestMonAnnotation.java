package com.sdz.annotations.monAnnotation;

import com.sdz.annotations.AnnotationZ;

public class TestMonAnnotation {

    //Seul les champs qui n'ont pas de valeurs par défaut sont renseignés ici
    @MonAnnotation(
            annotation = @AnnotationZ,
            monChamp1 = "Valeur quelconque",
            tableauEntier = { 0 }
    )
    public String sayHello(){
        return "Hello ! ";
    }


    //Cette fois nous avons renseigné tous les champs de l'annotation
    @MonAnnotation(
            niveau = NIVEAU.AMELIORATION,
            annotation = @AnnotationZ,
            tableauCaractere = {'Z', 'c'},
            monChamp1 = "Valeur de champ 1",
            tableauEntier = { 0 },
            monChamp2 = "Mon champ 2",
            uneClasse = String.class
    )
    public void doNothing(){}

}
