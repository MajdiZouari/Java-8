package com.sdz.annotations.monAnnotation;

import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

//Important, il faut que la (ou les) annotations traitées soient connues
//et accessibles !


//Permet de spécifier les annotations à traiter
@SupportedAnnotationTypes(value = { "com.sdz.annotation.Todo" })
//Définit quelle version de source gérer, ici je code en Java 7
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class TodoProcessor extends AbstractProcessor {

    //La fameuse méthode à redéfinir
    @Override
    public boolean process(
            Set<? extends TypeElement> annotations,
            RoundEnvironment roundEnv) {

        System.out.println("Début du traitement console !");

        //Nous parcourons toutes les annotations concernées par ce processeur
        for (TypeElement te : annotations) {
            System.out.println("Traitement annotation "
                    + te.getQualifiedName());

            //Permet de récupérer tous les éléments annotés avec l'annotation en cours
            for (Element element : roundEnv.getElementsAnnotatedWith(te)) {
                String name = element.getClass().toString();


                System.out.println("----------------------------------");
                //Permet de savoir quel type d'élément est annoté (constructeur, paramètre, classe...)
                System.out.println("\n Type d'élément annoté : " + element.getKind() + "\n");

                //retourne le nom de l'élément annoté, le nom de la variable, le nom de la classe...
                System.out.println("\t --> Traitement de l'élément : "+ element.getSimpleName() + "\n");

                //Différentes informations sur l'élément annoté
                System.out.println("enclosed elements : " + element.getEnclosedElements());
                System.out.println("as type : " + element.asType());
                System.out.println("enclosing element : " + element.getEnclosingElement() + "\n");

                //Nous récupérons notre annotation
                Todo todo = element.getAnnotation(Todo.class);

                //Si elle n'est pas null, on traite son contenu
                if (todo != null) {

                    //On récupère le contenu de l'annotation comme n'importe quel objet Java
                    System.out.println("\t\t Auteur : " + todo.auteur());
                    System.out.println("\t\t Destinataire : " + todo.destinataire());
                    System.out.println("\t\t Commentaire : " + todo.commentaire());
                    System.out.println("\t\t Niveau : " + todo.niveau());
                }
            }
        }
        return true;
    }
}