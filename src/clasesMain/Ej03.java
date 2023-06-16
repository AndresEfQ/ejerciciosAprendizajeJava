package clasesMain;

import entidades.Ej03_Operacion;
import servicios.Ej03_servicioOperacion;

public class Ej03 {

    public static void main(String[] args) {

        Ej03_servicioOperacion so = new Ej03_servicioOperacion();

        System.out.println("Crear la operación 1");
        Ej03_Operacion op1 = so.crearOperacion();

        System.out.println("Crear la operación 2");
        Ej03_Operacion op2 = so.crearOperacion();

        System.out.println("Crear la operación 3");
        Ej03_Operacion op3 = so.crearOperacion();

        System.out.println(op1.getNumero1() + " + " + op1.getNumero2() + " = " + so.sumar(op1));
        System.out.println(op2.getNumero1() + " - " + op2.getNumero2() + " = " + so.restar(op2));
        System.out.println(op3.getNumero1() + " / " + op3.getNumero2() + " = " + so.dividir(op3));
    }
}
