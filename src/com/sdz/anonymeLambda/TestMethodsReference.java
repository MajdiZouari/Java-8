package com.sdz.anonymeLambda;

import java.util.function.Consumer;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
/**
 * Created by MZouari on 18/01/2019.
 */
public class TestMethodsReference {

    public static void main(String[] args) {

        //Conversion d'un String en Double avec une référence à une méthode statique
        ToDoubleFunction<String> stringToDoubleLambda = (s) -> Double.parseDouble(s);
        ToDoubleFunction<String> stringToDoubleRef = Double::parseDouble;
        System.out.println(stringToDoubleLambda.applyAsDouble("0.1234567"));
        System.out.println(stringToDoubleRef.applyAsDouble("0.1234567"));

        //Utilisation d'une référence à une méthode d'instance (println)
        //de l'instance out de la classe 'System'
        Consumer<String> stringPrinterLambda = (s) -> System.out.println(s);
        Consumer<String> stringPrinterRef = System.out::println;
        stringPrinterLambda.accept("Bonjour stringPrinterLambda.accept !");
        stringPrinterRef.accept("Bonjour stringPrinterRef.accept !");

        //Ici, nous utilisons carrément un constructeur
        //Notre interface fonctionnelle devient une fabrique d'Integer !
        ToIntFunction<String> testNew = Integer::new;
        Integer i = testNew.applyAsInt("1235");
        System.out.println("New Integer created : " + i + " de la Classe :  "+ i.getClass());
    }
}
