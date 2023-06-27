package clasesMain;

import servicios.Ej04_servicioRectangulo;

public class Ej04 {

    public static void main(String[] args) {

        Ej04_servicioRectangulo sr = new Ej04_servicioRectangulo();
        sr.crearRectangulo();

        System.out.println("La superficie de un rectángulo con base " + sr.mostrarBase() + " y altura " + sr.mostrarAltura() + " es " + sr.calcularSuperficie());
        System.out.println("El perímetro de un rectángulo con base " + sr.mostrarBase() + " y altura " + sr.mostrarAltura() + " es " + sr.calcularPerimetro());
        System.out.println();
        System.out.println("y se ve de la siguiente forma:");
        sr.dibujarRectangulo();
    }
}
