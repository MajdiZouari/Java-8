package com.sdz.stream;
/**
 * Created by MZouari on 18/01/2019.
 */
public enum Couleur {
    MARRON("marron"),
    BLEU("bleu"),
    VERT("vert"),
    VERRON("verron"),
    INCONNU("non déterminé"),
    ROUGE("rouge mais j'avais piscine...");

    private String name = "";

    Couleur(String n){name = n;}
    public String toString() {return name;}
}