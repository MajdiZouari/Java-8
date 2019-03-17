package com.sdz.anonymeLambda;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Personne {
    private int age;
    private String nom;
    Personne(){

    }

    Personne(int age, String nom){
        this.age = age;
        this.nom = nom;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
