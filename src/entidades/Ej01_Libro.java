package entidades;

public class Ej01_Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Ej01_Libro() {

    }
    public Ej01_Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
}
