package clasesMain;

import entidades.Ej06_Cafetera;

public class Ej06 {

    public static void main(String[] args) {

        Ej06_Cafetera cafetera = new Ej06_Cafetera(1000, 0);

        System.out.println("Llenar cafetera");
        cafetera.llenarCafetera();

        System.out.println("Servir 15 tazas de 70 mL");
        for (int i = 0; i < 15; i++) {
            System.out.print((i+1) + ": ");
            cafetera.servirTaza(70);
        }

        System.out.println("Volver a llenar la cafetera");
        cafetera.llenarCafetera();
        System.out.println("Servir una taza de 70 mL");
        cafetera.servirTaza(70);

        System.out.println("Agregar 100 mL de café");
        cafetera.agregarCafe(100);

        System.out.println("Servir 10 tazas de 70 mL");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ": ");
            cafetera.servirTaza(70);
        }

        System.out.println("Vaciar la cafetera");
        cafetera.vaciarCafetera();
    }
}
