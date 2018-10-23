package com.sdz.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<Personne> listP = Arrays.asList(
                new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
                new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
                new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
                new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
                new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
                new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
                new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
        );

        Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        Stream.iterate(2d, (x) -> x + 1).limit(100).forEach(System.out::println);

        /*
        * Opérations intermédiaires sur les streams
        *
        * */
        /***************  Filtrage *******************/
        sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\nApres le filtre");
        sp = listP.stream();
        sp.	filter(x -> x.getPoids() > 50)
                .forEach(System.out::println);

        /***************  L'operation map *******************/
        sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\nApres le filtre et le map");
        sp = listP.stream();
        sp.	filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .forEach(System.out::println);

        /*
         * Opérations terminales sur les streams
         *
         * */
        /***************  L'operation Reduce *******************/
        sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\nApres le filtre et le map et reduce");
        sp = listP.stream();

        Double sum = sp	.filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .reduce(0.0d, (x,y) -> x+y);
        System.out.println(sum);

        /***************  L'objet Optional *******************/
        System.out.println("\nObjet Optional apres le filtre et le map et reduce");
        sp = listP.stream();

        Optional<Double> sumOptional = sp	.filter(x -> x.getPoids() > 250)
                .map(x -> x.getPoids())
                .reduce((x,y) -> x+y);

        if(sumOptional.isPresent())
            System.out.println(sumOptional.get());
        else
            System.out.println("Aucun aggrégat de poids...");

        //Permet de gérer le cas d'erreur en renvoyant 0.0 si isPresent() == false
        System.out.println("orElse " + sumOptional.orElse(0.0));

        /***************  L'operation count *******************/
        sp = listP.stream();

        long count = sp	.filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .count();

        System.out.println("Nombre d'elements : " + count);

        /***************  L'operation collect *******************/
        sp = listP.stream();

        List<Double> ld = sp.filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .collect(Collectors.toList());
        System.out.println("collect : "+ld);



        /*
         * Utiliser les stream avec NIO2
         *
         * */
        String fileName = "StreamNIO2.sh";
        try(Stream<String> sf = Files.lines(Paths.get(fileName))){
            sf.forEach(System.out::println);
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}