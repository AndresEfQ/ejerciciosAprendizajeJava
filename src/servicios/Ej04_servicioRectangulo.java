package servicios;

import entidades.Ej04_Rectangulo;

import java.util.Scanner;

public class Ej04_servicioRectangulo {

    private final Ej04_Rectangulo rectangulo = new Ej04_Rectangulo();

    public void crearRectangulo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación para crear Rectangulos, por favor ingrese");
        System.out.print("Base: ");
        this.rectangulo.setBase(sc.nextInt());
        System.out.print("Altura: ");
        this.rectangulo.setAltura(sc.nextInt());
    }

    public int calcularSuperficie() {
        return this.rectangulo.getAltura() * this.rectangulo.getBase();
    }

    public int calcularPerimetro() {
        return (this.rectangulo.getAltura() + this.rectangulo.getBase()) * 2;
    }

    public int mostrarBase() {
        return this.rectangulo.getBase();
    }

    public int mostrarAltura() {
        return this.rectangulo.getAltura();
    }

    public void dibujarRectangulo() {
        int altura = this.rectangulo.getAltura();
        int base = this.rectangulo.getBase();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
