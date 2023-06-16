package clasesMain;

import entidades.Ej02_Circunferencia;
import servicios.Ej02_servicioCircunferencia;

public class Ej02 {

    public static void main(String[] args) {

        Ej02_servicioCircunferencia sc = new Ej02_servicioCircunferencia();

        System.out.println("Crear circunferencia 1");
        Ej02_Circunferencia circunferencia1 = sc.crearCircunferencia();

        System.out.println("Crear circunferencia 2");
        Ej02_Circunferencia circunferencia2 = sc.crearCircunferencia();

        System.out.println("Crear circunferencia 3");
        Ej02_Circunferencia circunferencia3 = sc.crearCircunferencia();

        System.out.println("El area de la circunferencia 1 es: " +  sc.area(circunferencia1));
        System.out.println("El area de la circunferencia 2 es: " +  sc.area(circunferencia2));
        System.out.println("El area de la circunferencia 3 es: " +  sc.area(circunferencia3));

        System.out.println("El perimetro de la circunferencia 1 es: " +  sc.perimetro(circunferencia1));
        System.out.println("El perimetro de la circunferencia 2 es: " +  sc.perimetro(circunferencia2));
        System.out.println("El perimetro de la circunferencia 3 es: " +  sc.perimetro(circunferencia3));
    }
}
