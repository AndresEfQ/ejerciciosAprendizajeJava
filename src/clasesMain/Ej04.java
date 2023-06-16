package clasesMain;

import entidades.Ej04_Rectangulo;

public class Ej04 {

    public static void main(String[] args) {

        Ej04_Rectangulo r1 = Ej04_Rectangulo.crearRectangulo(6, 4);

        System.out.println("La superficie de un rectángulo con base " + r1.getBase() + " y altura " + r1.getAltura() + " es " + r1.calcularSuperficie());
        System.out.println("El perímetro de un rectángulo con base " + r1.getBase() + " y altura " + r1.getAltura() + " es " + r1.calcularPerimetro());

        r1.dibujarRectangulo();
    }
}
