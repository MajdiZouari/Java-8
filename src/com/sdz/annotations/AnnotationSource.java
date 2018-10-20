package com.sdz.annotations;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
//Ici, nous spécifions un seul emplacement possible pour cette annotation
@Target(ElementType.METHOD)
public @interface AnnotationSource { }