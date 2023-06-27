package entidades;

import java.util.Arrays;

public class Ej13_Curso {

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioHora;
    private String[] alumnos;
    private int cantidadAlumnos;

    public Ej13_Curso() {
    }

    public Ej13_Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioHora, String[] alumnos, int cantidadAlumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno.equals("Mañana") || turno.equals("Tarde")) {
            this.turno = turno;
        }
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    @Override
    public String toString() {
        return "Ej13_Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", cantidadHorasPorDia=" + cantidadHorasPorDia +
                ", cantidadDiasPorSemana=" + cantidadDiasPorSemana +
                ", turno='" + turno + '\'' +
                ", precioHora=" + precioHora +
                ", alumnos=" + Arrays.toString(alumnos) +
                ", cantidadAlumnos=" + cantidadAlumnos +
                '}';
    }
}
