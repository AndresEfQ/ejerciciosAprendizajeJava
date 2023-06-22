package entidades;

import java.util.Scanner;

public class Ej07_Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private int altura;

    public Ej07_Persona() {
    }

    public Ej07_Persona(String nombre, int edad, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M")) {
            this.sexo = "O";
        } else {
            this.sexo = sexo.toUpperCase();
        }
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M")) {
            this.sexo = "O";
        } else {
            this.sexo = sexo.toUpperCase();
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
