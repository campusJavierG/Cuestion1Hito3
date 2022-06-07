package com.herencia;

public class Main {
    public static void main(String[] args) {
        Persona persona1= new Persona("09567123R",32,"Paco Fiestas");
        System.out.println(persona1.sacarInfo());
        Alumno alumno1= new Alumno("876627389E",45,"Perico","2º primaria");
        System.out.println(alumno1.sacarInfo());
    }


}
