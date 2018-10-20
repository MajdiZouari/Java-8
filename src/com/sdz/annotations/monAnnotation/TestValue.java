package com.sdz.annotations.monAnnotation;

public class TestValue {

    //Annotation avec un élément value de type enum
    //----------------------------------------------
    @Test(value = NIVEAU.CRITIQUE)
    public void methode1(){ }

    @Test(NIVEAU.BUG)//Ecriture courte
    public void methode2(){ }

    //Annotation avec un élément value de type double
    //----------------------------------------------
    @TestBis(value = 51.45687d)
    public void methode3(){ }

    @TestBis(12.34d)//Ecriture courte
    public void methode4(){ }

    //Annotation avec un élément value de type Class
    //----------------------------------------------
    @TestTer(value = Boolean.class)
    public void methode5(){ }

    @TestTer(Double.class)//Ecriture courte
    public void methode6(){ }
}
