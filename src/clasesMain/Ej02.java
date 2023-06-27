package clasesMain;

import servicios.Ej02_servicioCircunferencia;

public class Ej02 {

    public static void main(String[] args) {

        Ej02_servicioCircunferencia sc1 = new Ej02_servicioCircunferencia();
        Ej02_servicioCircunferencia sc2 = new Ej02_servicioCircunferencia();
        Ej02_servicioCircunferencia sc3 = new Ej02_servicioCircunferencia();

        System.out.println("Crear circunferencia 1");
        sc1.crearCircunferencia();

        System.out.println("Crear circunferencia 2");
        sc2.crearCircunferencia();

        System.out.println("Crear circunferencia 3");
        sc3.crearCircunferencia();

        System.out.println("El area de la circunferencia 1 es: " +  sc1.area());
        System.out.println("El area de la circunferencia 2 es: " +  sc2.area());
        System.out.println("El area de la circunferencia 3 es: " +  sc3.area());

        System.out.println("El perimetro de la circunferencia 1 es: " +  sc1.perimetro());
        System.out.println("El perimetro de la circunferencia 2 es: " +  sc2.perimetro());
        System.out.println("El perimetro de la circunferencia 3 es: " +  sc3.perimetro());
    }
}
