package clasesMain;

import servicios.Ej06_servicioCafetera;

public class Ej06 {

    public static void main(String[] args) {

        Ej06_servicioCafetera sc = new Ej06_servicioCafetera();

        System.out.println("Llenar cafetera");
        sc.llenarCafetera();

        System.out.println("Servir 15 tazas de 70 mL");
        for (int i = 0; i < 15; i++) {
            System.out.print((i+1) + ": ");
            sc.servirTaza(70);
        }

        System.out.println("Volver a llenar la cafetera");
        sc.llenarCafetera();
        System.out.println("Servir una taza de 70 mL");
        sc.servirTaza(70);

        System.out.println("Agregar 100 mL de café");
        sc.agregarCafe(100);

        System.out.println("Servir 10 tazas de 70 mL");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ": ");
            sc.servirTaza(70);
        }

        System.out.println("Vaciar la cafetera");
        sc.vaciarCafetera();
    }
}
