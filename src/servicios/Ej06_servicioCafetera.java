package servicios;

import entidades.Ej06_Cafetera;

import java.util.Scanner;

public class Ej06_servicioCafetera {

    public Ej06_Cafetera crearCafetera() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al servicio de creación de cafeteras");
        System.out.println("Por favor ingrese");

        System.out.print("Capacidad máxima: ");
        int max = sc.nextInt();

        System.out.print("Cantidad actual: ");
        int act = sc.nextInt();

        return new Ej06_Cafetera(max, act);
    }

    public void llenarCafetera(Ej06_Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera está llena :)");
    }

    public void servirTaza(Ej06_Cafetera cafetera, int tamTaza) {
        if (tamTaza > cafetera.getCantidadActual()) {
            System.out.println("Sólo se pudo llenar " + cafetera.getCantidadActual() + " mL de la taza");
            cafetera.setCantidadActual(0);
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamTaza);
            System.out.println("Se llenó la taza");
        }
    }

    public void vaciarCafetera(Ej06_Cafetera cafetera) {
        System.out.println("Se botaron " + cafetera.getCantidadActual() + " mL de café :(");
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Ej06_Cafetera cafetera, int cantCafe) {
        if (cantCafe + cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
            System.out.println("Se alcanzó la cantidad máxima de la cafetera y sobraron " + (cantCafe + cafetera.getCantidadActual() - cafetera.getCapacidadMaxima()) + " mL");
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        } else {
            System.out.println("Se adicionó + " + cantCafe + " mL de café a la cafetera.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantCafe);
        }
    }
}
