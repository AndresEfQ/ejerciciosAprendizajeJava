package clasesMain;

import entidades.Ej07_Persona;
import servicios.Ej07_servicioPersona;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {

        Ej07_servicioPersona sp = new Ej07_servicioPersona();

        // Instanciado con crear persona con todas las variables:
        Ej07_Persona p1 = sp.crearPersona("Andrés", 34, "h", 86, 165);
        Ej07_Persona p2 = sp.crearPersona("Sofía", 5, "m", 25, 110);
        Ej07_Persona p3 = sp.crearPersona("Carol", 36, "m", 67, 163);


        // Creado con el método crear persona
        Ej07_Persona p4 = sp.crearPersona();

        Ej07_Persona[] personas = new Ej07_Persona[4];
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;

        int[] imcArray = new int[4];
        for (int i = 0; i < personas.length; i++) {
            imcArray[i] = sp.calcularIMC(personas[i]);
        }

        boolean[] sonMayores = new boolean[4];
        for (int i = 0; i < personas.length; i++) {
            sonMayores[i] = sp.esMayorDeEdad(personas[i]);
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
