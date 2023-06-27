package clasesMain;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese una fecha en formato 'DD MM AAAA'");
        int dia = Integer.parseInt(sc.next());
        int mes = Integer.parseInt(sc.next());
        int anio = Integer.parseInt(sc.next());

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();

        System.out.println("La fecha ingresada es " + fecha);

        int anios = Math.abs(fecha.getYear() - fechaActual.getYear());
        System.out.println("y hay " + anios + " años de diferencia entre la fecha ingresada y la fecha actual.");

    }
}
