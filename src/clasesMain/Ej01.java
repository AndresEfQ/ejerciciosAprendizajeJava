package clasesMain;

import entidades.Ej01_Libro;
import servicios.Ej01_servicioLibro;

public class Ej01 {

    public static void main(String[] args) {

        Ej01_servicioLibro sl1 = new Ej01_servicioLibro();
        Ej01_servicioLibro sl2 = new Ej01_servicioLibro();

        sl1.cargarLibro();
        sl2.cargarLibro();

        System.out.print("Libro 1: ");
        sl1.mostrarLibro();
        System.out.print("Libro 2: ");
        sl2.mostrarLibro();

    }
}
