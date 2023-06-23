package clasesMain;

import java.util.Date;
import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese una fecha");
        System.out.print("Día: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Año: ");
        int anio = sc.nextInt();

        Date fecha = new Date(dia, mes + 1, anio + 1900);
        Date fechaActual = new Date();
    }
}
