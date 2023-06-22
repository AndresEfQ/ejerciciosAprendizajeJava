package clasesMain;

import entidades.Ej04_Rectangulo;
import servicios.Ej04_servicioRectangulo;

public class Ej04 {

    public static void main(String[] args) {

        Ej04_servicioRectangulo sr = new Ej04_servicioRectangulo();
        Ej04_Rectangulo r1 = sr.crearRectangulo();

        System.out.println("La superficie de un rectángulo con base " + r1.getBase() + " y altura " + r1.getAltura() + " es " + r1.calcularSuperficie());
        System.out.println("El perímetro de un rectángulo con base " + r1.getBase() + " y altura " + r1.getAltura() + " es " + r1.calcularPerimetro());
        System.out.println();
        System.out.println("y se ve de la siguiente forma:");
        r1.dibujarRectangulo();
    }
}
