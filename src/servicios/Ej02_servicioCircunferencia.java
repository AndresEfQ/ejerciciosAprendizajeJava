package servicios;

import entidades.Ej02_Circunferencia;

import java.util.Scanner;

public class Ej02_servicioCircunferencia {

    private final Ej02_Circunferencia circunferencia = new Ej02_Circunferencia();

    public void crearCircunferencia() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio de la circunferencia: ");
        this.circunferencia.setRadio(sc.nextDouble());
    }

    public double area() {

        return Math.PI * Math.pow(this.circunferencia.getRadio(), 2);
    }

    public double perimetro() {

        return 2 * Math.PI * this.circunferencia.getRadio();
    }
}
