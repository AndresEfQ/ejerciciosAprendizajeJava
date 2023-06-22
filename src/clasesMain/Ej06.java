package clasesMain;

import entidades.Ej06_Cafetera;
import servicios.Ej06_servicioCafetera;

public class Ej06 {

    public static void main(String[] args) {

        Ej06_servicioCafetera sc = new Ej06_servicioCafetera();

        Ej06_Cafetera cafetera = sc.crearCafetera();

        System.out.println("Llenar cafetera");
        sc.llenarCafetera(cafetera);

        System.out.println("Servir 15 tazas de 70 mL");
        for (int i = 0; i < 15; i++) {
            System.out.print((i+1) + ": ");
            sc.servirTaza(cafetera, 70);
        }

        System.out.println("Volver a llenar la cafetera");
        sc.llenarCafetera(cafetera);
        System.out.println("Servir una taza de 70 mL");
        sc.servirTaza(cafetera, 70);

        System.out.println("Agregar 100 mL de café");
        sc.agregarCafe(cafetera,100);

        System.out.println("Servir 10 tazas de 70 mL");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ": ");
            sc.servirTaza(cafetera,70);
        }

        System.out.println("Vaciar la cafetera");
        sc.vaciarCafetera(cafetera);
    }
}
