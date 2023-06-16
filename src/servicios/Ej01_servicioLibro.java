package servicios;

import entidades.Ej01_Libro;

import java.util.Scanner;

public class Ej01_servicioLibro {

    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Ej01_Libro cargarLibro() {

        System.out.println("Ingresa los datos del libro");

        System.out.print("ISBN: ");
        int ISBN = Integer.parseInt(sc.next());

        System.out.print("Título: ");
        String titulo = sc.next();

        System.out.print("Autor: ");
        String autor = sc.next();

        System.out.print("Número de páginas: ");
        int paginas = Integer.parseInt(sc.next());

        return new Ej01_Libro(ISBN, titulo, autor, paginas);
    }

    public void mostrarLibro(Ej01_Libro libro) {
        System.out.println("Libro: {ISBN='" + libro.ISBN + "', Titulo:='" + libro.titulo + "', Autor='" + libro.autor + "', Páginas='" + libro.paginas + "'}");
    }
}
