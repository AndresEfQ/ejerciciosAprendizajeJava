package servicios;

import entidades.Ej03_Operacion;

import java.util.Scanner;

public class Ej03_servicioOperacion {

    public Ej03_Operacion crearOperacion() {

        Scanner sc = new Scanner(System.in);

        Ej03_Operacion operacion = new Ej03_Operacion();

        System.out.print("Número 1: ");
        operacion.setNumero1(sc.nextInt());

        System.out.print("Número 2: ");
        operacion.setNumero2(sc.nextInt());

        return operacion;
    }

    public int sumar(Ej03_Operacion operacion) {
        return operacion.getNumero1() + operacion.getNumero2();
    }

    public int restar(Ej03_Operacion operacion) {
        return operacion.getNumero1() - operacion.getNumero2();
    }

    public int multipicar(Ej03_Operacion operacion) {

        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("ERROR: Multipicación por 0 no soportada");
            return 0;
        }

        return operacion.getNumero1() * operacion.getNumero2();
    }

    public int dividir(Ej03_Operacion operacion) {

        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("ERROR: División por 0 no soportada");
            return 0;
        }

        return operacion.getNumero1() / operacion.getNumero2();
    }
}
