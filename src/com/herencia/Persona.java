package com.herencia;

import java.util.Scanner;

public class Persona {// los atributos y métodos públicos pueden ser heredados pero los privados no
    public String NIF;
    public int edad;
    public String nombre;

    public Persona(String NIF, int edad, String nombre) {
        this.NIF = NIF;
        this.edad = edad;
        this.nombre = nombre;
    }


    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String sacarInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el NIF");
        setNIF(sc.next());
        System.out.println("Dime el nombre");
        setNombre(sc.next());
        return ("El nombre es -->"+getNombre()+ "    El nif es -->"+getNIF());

    }

}
