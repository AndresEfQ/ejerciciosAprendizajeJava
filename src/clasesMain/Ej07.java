package clasesMain;

import servicios.Ej07_servicioPersona;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {

        Ej07_servicioPersona sp = new Ej07_servicioPersona();

        // Crear personas con el método crear persona con con todas las variables:
        sp.crearPersona("Andrés", 34, "h", 86, 165);
        sp.crearPersona("Sofía", 5, "m", 25, 110);
        sp.crearPersona("Carol", 36, "m", 67, 163);
        sp.crearPersona("Carol", 36, "m", 67, 163);

        sp.calcularIMCs();

        sp.sonMayoresDeEdad();

        System.out.println(sp.mayores());
        System.out.println(sp.cantidadPersonas());
        System.out.println("El " + (((double) sp.mayores() / sp.cantidadPersonas()) * 100) + "% de las personas son mayores de edad");

        // System.out.println("El " + (mayores / sonMayores.length * 100) + "% de las personas son mayores de edad");
        // System.out.println("El " + (double)(mayores / sonMayores.length * 100) + "% de las personas son mayores de edad");
        // System.out.println("El " + ((double)(mayores / sonMayores.length) * 100) + "% de las personas son mayores de edad");
    }
}
