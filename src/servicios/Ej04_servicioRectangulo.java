package servicios;

import entidades.Ej04_Rectangulo;

import java.util.Scanner;

public class Ej04_servicioRectangulo {

    public Ej04_Rectangulo crearRectangulo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación para crear Rectangulos, por favor ingrese");
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Altura: ");
        int altura = sc.nextInt();

        return new Ej04_Rectangulo(base, altura);
    }

    public int calcularSuperficie(Ej04_Rectangulo rectangulo) {
        return rectangulo.getAltura() * rectangulo.getBase();
    }

    public int calcularPerimetro(Ej04_Rectangulo rectangulo) {
        return (rectangulo.getAltura() + rectangulo.getBase()) / 2;
    }
}
