package clasesMain;

import entidades.Ej07_Persona;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {

        // Instanciado con constructor con todas las variables:
        Ej07_Persona p1 = new Ej07_Persona("Andrés", 34, "h", 86, 165);
        Ej07_Persona p2 = new Ej07_Persona("Sofía", 5, "m", 25, 110);

        // Instanciado con constructor vacío y luego asignado atributos con los setter.
        Ej07_Persona p3 = new Ej07_Persona();
        p2.setNombre("Carol");
        p2.setEdad(36);
        p2.setSexo("m");
        p2.setPeso(67);
        p2.setAltura(163);

        // Creado con el método crear persona
        Ej07_Persona p4 = Ej07_Persona.crearPersona();

        Ej07_Persona[] personas = new Ej07_Persona[4];
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;

        int[] imcArray = new int[4];
        for (int i = 0; i < personas.length; i++) {
            imcArray[i] = personas[i].calcularIMC();
        }

        boolean[] sonMayores = new boolean[4];
        for (int i = 0; i < personas.length; i++) {
            sonMayores[i] = personas[i].esMayorDeEdad();
        }

        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        for (int i = 0; i < imcArray.length; i++) {
            if (imcArray[i] < 0) {
                bajoPeso++;
            } else if (imcArray[i] > 0) {
                sobrePeso++;
            } else {
                pesoIdeal++;
            }
        }
        System.out.println("Personas con bajo peso: " + bajoPeso);
        System.out.println("Personas con peso ideal: " + pesoIdeal);
        System.out.println("Personas con sobrepeso: " + sobrePeso);

        int mayores = 0;
        for (int i = 0; i < sonMayores.length; i++) {
            if (sonMayores[i]) {
                mayores++;
            }
        }
        double porcentaje = (double)mayores / sonMayores.length;
        System.out.println("El " + (porcentaje * 100) + "% de las personas son mayores de edad");

        // System.out.println("El " + (mayores / sonMayores.length * 100) + "% de las personas son mayores de edad");
        // System.out.println("El " + (double)(mayores / sonMayores.length * 100) + "% de las personas son mayores de edad");
        // System.out.println("El " + ((double)(mayores / sonMayores.length) * 100) + "% de las personas son mayores de edad");
    }
}
