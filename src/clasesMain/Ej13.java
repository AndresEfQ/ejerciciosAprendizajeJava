package clasesMain;

import entidades.Ej13_Curso;
import servicios.Ej13_servicioCurso;

public class Ej13 {

    public static void main(String[] args) {

        Ej13_servicioCurso curso = new Ej13_servicioCurso();

        curso.crearCurso();
        System.out.println("Las ganancias semanales por dictar el curso son " + curso.calcularGananciasSemana() + " pesos.");
    }
}
