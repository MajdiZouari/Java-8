package com.sdz.testsUnitaires.main.implem;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Address {
    private String street;
    private String name;
    private int nb;
    private int zip;
    private String town;

    public Address(String street, String name, int nb, int zip, String town) {
        super();
        this.street = street;
        this.name = name;
        this.nb = nb;
        this.zip = zip;
        this.town = town;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNb() {
        return nb;
    }
    public void setNb(int nb) {
        this.nb = nb;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }



}

