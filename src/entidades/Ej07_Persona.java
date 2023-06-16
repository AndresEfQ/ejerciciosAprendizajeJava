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

    public static Ej07_Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los datos de la persona");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M")) {
            System.out.println("Se asiganará el sexo 'O'");
        }

        System.out.print("Peso: ");
        int peso = sc.nextInt();

        System.out.print("Altura: ");
        int altura = sc.nextInt();

        return new Ej07_Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC() {
        int peso = this.getPeso();
        double altura = (double) this.getAltura() / 100;

        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return -1;
        } else if (imc > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean esMayorDeEdad() {
        return this.getEdad() >= 18;
    }
}
