package com.sdz.anonymeLambda;

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
