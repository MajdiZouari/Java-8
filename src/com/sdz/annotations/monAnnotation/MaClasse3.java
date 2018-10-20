package com.sdz.annotations.monAnnotation;

public class MaClasse3 {

    public void doSomething(
            @Todo(
                    niveau = NIVEAU.BUG,
                    commentaire = "Vérifier le contenu de ce paramètre",
                    destinataire = "cysboy"
            )
                    String str){
        //....
    }
}
