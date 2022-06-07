package com.herencia;

import java.util.Scanner;

public class Alumno extends Persona { //ha heredado todos los atributos y métodos que son públicos o protected
    private String curso;

    public Alumno(String NIF, int edad, String nombre,String curso) {
        super(NIF, edad, nombre);
        this.curso=curso;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override //indica que el método heredado ha sido modificado (sobreescritura)
    public String sacarInfo(){
        Scanner sc= new Scanner(System.in);
        String sacarInfoPersona=super.sacarInfo();
        System.out.println("Dime el curso");
        setCurso(sc.next());

        return (sacarInfoPersona+ " el curso es -->"+getCurso());
    }
    public void sumar(int a, int b) {//creo el método sumar con los parámetros a y b
        int suma=a+b;
        System.out.println("la suma es: "+suma);
    }
    public void sumar(float a, float b) {//creo el método sumar de nuevo pero modificio los parámetros para que haya una sobrecarga
        float suma=a+b;
        System.out.println("la suma es: "+suma);
    }



}
