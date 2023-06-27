package clasesMain;

import servicios.Ej03_servicioOperacion;

public class Ej03 {

    public static void main(String[] args) {

        Ej03_servicioOperacion so1 = new Ej03_servicioOperacion();
        Ej03_servicioOperacion so2 = new Ej03_servicioOperacion();
        Ej03_servicioOperacion so3 = new Ej03_servicioOperacion();

        System.out.println("Crear la operación 1");
        so1.crearOperacion();

        System.out.println("Crear la operación 2");
        so2.crearOperacion();

        System.out.println("Crear la operación 3");
        so3.crearOperacion();

        System.out.println(so1.mostrarNum1() + " + " + so1.mostrarNum2() + " = " + so1.sumar());
        System.out.println(so2.mostrarNum1() + " - " + so2.mostrarNum2() + " = " + so2.restar());
        System.out.println(so3.mostrarNum1() + " / " + so3.mostrarNum2() + " = " + so3.dividir());
    }
}
