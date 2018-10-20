package com.sdz.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.CLASS)
//Grâce aux accolades, nous pouvons
//spécifier plusieurs emplacement possibles pour cette annotation
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface AnnotationClass { }
