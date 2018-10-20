package com.sdz.annotations.annotationOverride;

public class ExempleOverride {
    @Override
    public String toString() {
        return "ExempleOverride [getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
