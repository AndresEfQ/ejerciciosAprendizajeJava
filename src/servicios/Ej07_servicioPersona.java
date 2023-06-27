package servicios;

import entidades.Ej07_Persona;

import java.util.Scanner;

public class Ej07_servicioPersona {

    private final Ej07_Persona persona = new Ej07_Persona();

    public void crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los datos de la persona");

        System.out.print("Nombre: ");
        this.persona.setNombre(sc.nextLine());

        System.out.print("Edad: ");
        this.persona.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M")) {
            System.out.println("Se asiganará el sexo 'O'");
        }

        this.persona.setSexo(sexo);

        System.out.print("Peso: ");
        this.persona.setPeso(sc.nextInt());

        System.out.print("Altura: ");
        this.persona.setAltura(sc.nextInt());
    }

    public void crearPersona(String nombre, int edad, String sexo, int peso, int altura) {

        if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
            System.out.println("Sexo inválido, se asiganará el sexo 'O'");
        }
        this.persona.setNombre(nombre);
        this.persona.setEdad(edad);
        this.persona.setSexo(sexo);
        this.persona.setPeso(peso);
        this.persona.setAltura(altura);
    }

    public int calcularIMC() {
        int peso = this.persona.getPeso();
        double altura = (double) this.persona.getAltura() / 100;

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
        return this.persona.getEdad() >= 18;
    }
}
