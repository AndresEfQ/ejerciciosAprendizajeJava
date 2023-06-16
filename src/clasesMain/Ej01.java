package clasesMain;

import entidades.Ej01_Libro;
import servicios.Ej01_servicioLibro;

public class Ej01 {

    public static void main(String[] args) {

        Ej01_servicioLibro sl = new Ej01_servicioLibro();

        Ej01_Libro libro1 = sl.cargarLibro();
        Ej01_Libro libro2 = sl.cargarLibro();

        System.out.print("Libro 1: ");
        sl.mostrarLibro(libro1);
        System.out.print("Libro 2: ");
        sl.mostrarLibro(libro2);

    }
}
