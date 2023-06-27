package clasesMain;

import servicios.Ej05_servicioCuenta;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {

        Ej05_servicioCuenta sc = new Ej05_servicioCuenta();
        Scanner scan = new Scanner(System.in);

        sc.crearCuenta();

        sc.consultarDatos();

        sc.consultarSaldo();

        System.out.println("Ingrese saldo en la cuenta");
        System.out.print("Cantidad a ingresar: $");
        sc.ingresar(scan.nextDouble());

        System.out.println();
        System.out.println("Retire saldo de la cuenta");
        System.out.print("Cantidad a retirar: $");
        sc.retirar(scan.nextDouble());

        System.out.println();
        System.out.println("Realice una extracción rápida de la cuenta");
        System.out.print("Cantidad a retirar: $");
        sc.extraccionRapida(scan.nextDouble());

        System.out.println();
        sc.consultarSaldo();
    }
}
