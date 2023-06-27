package clasesMain;

import servicios.Ej12_servicioPersona;

public class Ej12 {

    public static void main(String[] args) {

        Ej12_servicioPersona sp = new Ej12_servicioPersona();
        sp.crearPersona();
        System.out.println(sp.calcularEdad());
        System.out.println(sp.menorQue(37));
        sp.mostrarPersona();
    }
}
