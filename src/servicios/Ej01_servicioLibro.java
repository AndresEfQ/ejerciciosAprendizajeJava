package servicios;

import entidades.Ej01_Libro;

import java.util.Scanner;

public class Ej01_servicioLibro {

    private final Ej01_Libro libro = new Ej01_Libro();

    public void cargarLibro() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los datos del libro");

        System.out.print("ISBN: ");
        this.libro.setISBN(Integer.parseInt(sc.nextLine()));

        System.out.print("Título: ");
        this.libro.setTitulo(sc.nextLine());

        System.out.print("Autor: ");
        this.libro.setAutor(sc.nextLine());

        System.out.print("Número de páginas: ");
        this.libro.setPaginas(Integer.parseInt(sc.next()));
    }

    public void mostrarLibro() {
        System.out.println(this.libro);
    }
}
