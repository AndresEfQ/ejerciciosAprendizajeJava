package servicios;

import entidades.Ej06_Cafetera;

import java.util.Scanner;

public class Ej06_servicioCafetera {

    private final Ej06_Cafetera cafetera = new Ej06_Cafetera();

    public void crearCafetera() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al servicio de creación de cafeteras");
        System.out.println("Por favor ingrese");

        System.out.print("Capacidad máxima: ");
        this.cafetera.setCapacidadMaxima(sc.nextInt());

        System.out.print("Cantidad actual: ");
        this.cafetera.setCantidadActual(sc.nextInt());
    }

    public void llenarCafetera() {
        this.cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera está llena :)");
    }

    public void servirTaza(int tamTaza) {
        if (tamTaza > cafetera.getCantidadActual()) {
            System.out.println("Sólo se pudo llenar " + cafetera.getCantidadActual() + " mL de la taza");
            this.cafetera.setCantidadActual(0);
        } else {
            this.cafetera.setCantidadActual(cafetera.getCantidadActual() - tamTaza);
            System.out.println("Se llenó la taza");
        }
    }

    public void vaciarCafetera() {
        System.out.println("Se botaron " + cafetera.getCantidadActual() + " mL de café :(");
        this.cafetera.setCantidadActual(0);
    }

    public void agregarCafe(int cantCafe) {
        if (cantCafe + this.cafetera.getCantidadActual() > this.cafetera.getCapacidadMaxima()) {
            System.out.println("Se alcanzó la cantidad máxima de la cafetera y sobraron " + (cantCafe + this.cafetera.getCantidadActual() - this.cafetera.getCapacidadMaxima()) + " mL");
            cafetera.setCantidadActual(this.cafetera.getCapacidadMaxima());
        } else {
            System.out.println("Se adicionó + " + cantCafe + " mL de café a la cafetera.");
            this.cafetera.setCantidadActual(this.cafetera.getCantidadActual() + cantCafe);
        }
    }
}
