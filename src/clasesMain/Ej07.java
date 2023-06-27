package clasesMain;

import servicios.Ej07_servicioPersona;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {

        Ej07_servicioPersona sp1 = new Ej07_servicioPersona();
        Ej07_servicioPersona sp2 = new Ej07_servicioPersona();
        Ej07_servicioPersona sp3 = new Ej07_servicioPersona();
        Ej07_servicioPersona sp4 = new Ej07_servicioPersona();

        // Crear personas con el método crear persona con con todas las variables:
        sp1.crearPersona("Andrés", 34, "h", 86, 165);
        sp2.crearPersona("Sofía", 5, "m", 25, 110);
        sp3.crearPersona("Carol", 36, "m", 67, 163);


        // Crear personas con el método crear persona sin variables.
        sp4.crearPersona();

        Ej07_servicioPersona[] serviciosPersona = new Ej07_servicioPersona[4];
        serviciosPersona[0] = sp1;
        serviciosPersona[1] = sp2;
        serviciosPersona[2] = sp3;
        serviciosPersona[3] = sp4;

        int[] imcArray = new int[4];
        for (int i = 0; i < serviciosPersona.length; i++) {
            imcArray[i] = serviciosPersona[i].calcularIMC();
        }

        boolean[] sonMayores = new boolean[4];
        for (int i = 0; i < serviciosPersona.length; i++) {
            sonMayores[i] = serviciosPersona[i].esMayorDeEdad();
        }

        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        for (int j : imcArray) {
            if (j < 0) {
                bajoPeso++;
            } else if (j > 0) {
                sobrePeso++;
            } else {
                pesoIdeal++;
            }
        }
        System.out.println("Personas con bajo peso: " + bajoPeso);
        System.out.println("Personas con peso ideal: " + pesoIdeal);
        System.out.println("Personas con sobrepeso: " + sobrePeso);

        int mayores = 0;
        for (boolean esMayor : sonMayores) {
            if (esMayor) {
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
