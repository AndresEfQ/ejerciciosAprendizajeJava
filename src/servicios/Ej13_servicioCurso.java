package servicios;

import entidades.Ej13_Curso;

import java.util.Scanner;

public class Ej13_servicioCurso {

    Ej13_Curso curso = new Ej13_Curso();

    private String[] cargarAlumnos() {
        Scanner sc = new Scanner(System.in);

        String[] alumnos = new String[5];
        System.out.println("Por favor ingresa el nombre de los alumnos, máximo 5 alumnos.");
        System.out.println("Deja el nombre vacío para finalizar la carga");

        int i = 0;
        String alumno;
        do {
            System.out.print("Alumno " + (i+1) + ": ");
            alumno = sc.nextLine();
            if (!alumno.equals("")) {
                alumnos[i] = alumno;
            } else {
                this.curso.setCantidadAlumnos(i);
            }
            i++;
        } while (!alumno.equals("") && i<5);

        if (i == 5) {
            this.curso.setCantidadAlumnos(i);
        }
        return alumnos;
    }

    public void crearCurso() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingresa los datos del curso");

        System.out.print("Nombre del curso: ");
        this.curso.setNombreCurso(sc.nextLine());

        System.out.print("Cantidad de horas por día: ");
        this.curso.setCantidadHorasPorDia(Integer.parseInt(sc.nextLine()));

        System.out.print("Cantidad de días por semana: ");
        this.curso.setCantidadDiasPorSemana(Integer.parseInt(sc.nextLine()));

        String turno;
        do {
            System.out.print("Turno: ");
            turno = sc.nextLine();
            if (!turno.equals("Mañana") && !turno.equals("Tarde")) {
                System.out.println("Turno inválido, por favor ingrese 'Mañana' o 'Tarde'");
            }
        } while (!turno.equals("Mañana") && !turno.equals("Tarde"));

        System.out.print("Precio por hora: ");
        this.curso.setPrecioHora(Integer.parseInt(sc.nextLine()));

        this.curso.setAlumnos(this.cargarAlumnos());
    }

    public double calcularGananciasSemana() {
        return this.curso.getCantidadHorasPorDia() * this.curso.getCantidadDiasPorSemana() * this.curso.getCantidadAlumnos() * this.curso.getPrecioHora();
    }
}
