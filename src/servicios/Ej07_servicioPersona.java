package servicios;

import entidades.Ej07_Persona;

import java.util.Scanner;

public class Ej07_servicioPersona {

    public Ej07_Persona crearPersona() {
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

    public Ej07_Persona crearPersona(String nombre, int edad, String sexo, int peso, int altura) {

        String sexoValido = sexo;
        if (!sexoValido.equalsIgnoreCase("H") && !sexoValido.equalsIgnoreCase("M")) {
            System.out.println("Se asiganará el sexo 'O'");
            sexoValido = "O";
        }

        return new Ej07_Persona(nombre, edad, sexoValido, peso, altura);
    }

    public int calcularIMC(Ej07_Persona persona) {
        int peso = persona.getPeso();
        double altura = (double) persona.getAltura() / 100;

        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return -1;
        } else if (imc > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean esMayorDeEdad(Ej07_Persona persona) {
        return persona.getEdad() >= 18;
    }
}
