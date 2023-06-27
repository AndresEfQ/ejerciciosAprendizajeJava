package servicios;

import entidades.Ej03_Operacion;

import java.util.Scanner;

public class Ej03_servicioOperacion {

    private final Ej03_Operacion operacion = new Ej03_Operacion();

    public void crearOperacion() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        this.operacion.setNumero1(sc.nextInt());

        System.out.print("Número 2: ");
        this.operacion.setNumero2(sc.nextInt());
    }

    public int sumar() {
        return this.operacion.getNumero1() + this.operacion.getNumero2();
    }

    public int restar() {
        return this.operacion.getNumero1() - this.operacion.getNumero2();
    }

    public int multipicar() {

        if (this.operacion.getNumero1() == 0 || this.operacion.getNumero2() == 0) {
            System.out.println("ERROR: Multipicación por 0 no soportada");
            return 0;
        }

        return this.operacion.getNumero1() * this.operacion.getNumero2();
    }

    public int dividir() {

        if (this.operacion.getNumero1() == 0 || this.operacion.getNumero2() == 0) {
            System.out.println("ERROR: División por 0 no soportada");
            return 0;
        }

        return this.operacion.getNumero1() / this.operacion.getNumero2();
    }

    public int mostrarNum1() {
        return this.operacion.getNumero1();
    }

    public int mostrarNum2() {
        return this.operacion.getNumero2();
    }
}
