package com.sdz.annotations.monAnnotation;

public enum NIVEAU {
    MINEUR("Action mineure", 0),
    AMELIORATION("Amélioration possible", 1),
    BUG("Bug à corriger rapidement", 2),
    CRITIQUE("Bug critique à corriger d'urgence !", 3);

    private int level = -1;
    private String description;
    NIVEAU(String desc, int lev){
        description = desc;
        level = lev;
    }

    public String toString(){
        return description;
    }

    public int getLevel(){
        return level;
    }
}