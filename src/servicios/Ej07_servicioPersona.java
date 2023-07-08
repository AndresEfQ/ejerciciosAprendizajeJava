package servicios;

import entidades.Ej07_Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej07_servicioPersona {

    private ArrayList<Ej07_Persona> personas = new ArrayList<>();
    private ArrayList<Integer> IMCs = new ArrayList<>();
    private ArrayList<Boolean> mayoresEdad = new ArrayList<>();

    public void crearPersona() {

        Ej07_Persona persona = new Ej07_Persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los datos de la persona");

        System.out.print("Nombre: ");
        persona.setNombre(sc.nextLine());

        System.out.print("Edad: ");
        persona.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M")) {
            System.out.println("Se asiganará el sexo 'O'");
        }

        persona.setSexo(sexo);

        System.out.print("Peso: ");
        persona.setPeso(sc.nextInt());

        System.out.print("Altura: ");
        persona.setAltura(sc.nextInt());

        personas.add(persona);
    }

    public void crearPersona(String nombre, int edad, String sexo, int peso, int altura) {

        Ej07_Persona persona = new Ej07_Persona();

        if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
            System.out.println("Sexo inválido, se asiganará el sexo 'O'");
        }
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setSexo(sexo);
        persona.setPeso(peso);
        persona.setAltura(altura);

        personas.add(persona);
    }

    public void calcularIMCs() {

        for (Ej07_Persona persona : this.personas) {
            int peso = persona.getPeso();
            double altura = (double) persona.getAltura() / 100;
            double imc = peso / (Math.pow(altura, 2));

            if (imc < 20) {
                IMCs.add(-1);
            } else if (imc > 25) {
                IMCs.add(0);
            } else {
                IMCs.add(1);
            }
        }
        personasConBajoPeso();
        personasConPesoIdeal();
        personasConSobrepeso();
    }

    public void personasConBajoPeso() {
        int bajoPeso = 0;
        for (Integer IMC : this.IMCs) {
            if (IMC == -1) {
                bajoPeso++;
            }
        }
        System.out.println("Personas con bajo peso: " + bajoPeso);
    }

    public void personasConPesoIdeal() {
        int pesoIdeal = 0;
        for (Integer IMC : this.IMCs) {
            if (IMC == 0) {
                pesoIdeal++;
            }
        }
        System.out.println("Personas con bajo peso: " + pesoIdeal);
    }

    public void personasConSobrepeso() {
        int sobrepeso = 0;
        for (Integer IMC : this.IMCs) {
            if (IMC == 1) {
                sobrepeso++;
            }
        }
        System.out.println("Personas con bajo peso: " + sobrepeso);
    }

    public void sonMayoresDeEdad() {
        for (Ej07_Persona persona : this.personas) {
            mayoresEdad.add(persona.getEdad() >= 18);
        }
    }

    public int mayores() {
        int mayores = 0;
        for (Boolean esMayor : this.mayoresEdad) {
            if (esMayor) {
                mayores++;
            }
        }
        return mayores;
    }

    public int cantidadPersonas() {
        return mayoresEdad.size();
    }
}
