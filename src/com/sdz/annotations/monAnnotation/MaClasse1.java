package com.sdz.annotations.monAnnotation;

public class MaClasse1 {

    @Todo(
            auteur = "zozor",
            niveau = NIVEAU.AMELIORATION,
            commentaire = "Tu ferais mieux d'utiliser un double...",
            destinataire = "cysboy"
    )
    private short entier = 0;

    @Todo(
            commentaire = "Penser à faire les initialisations...",
            destinataire = "zozor"
    )
    public MaClasse1(){ }
}
