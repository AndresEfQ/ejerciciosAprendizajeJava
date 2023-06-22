package clasesMain;

import entidades.Ej05_Cuenta;
import servicios.Ej05_servicioCuenta;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {

        Ej05_servicioCuenta sc = new Ej05_servicioCuenta();
        Scanner scan = new Scanner(System.in);

        Ej05_Cuenta cuenta = sc.crearCuenta();

        sc.consultarDatos(cuenta);

        System.out.print("El saldo inicial de la cuenta es: ");
        sc.consultarSaldo(cuenta);

        System.out.println("Ingrese saldo en la cuenta");
        System.out.print("Cantidad a ingresar: $");
        sc.ingresar(cuenta, scan.nextDouble());

        System.out.println("Retire saldo de la cuenta");
        System.out.print("Cantidad a retirar: $");
        sc.retirar(cuenta, scan.nextDouble());

        System.out.println("Realice una extracción rápida de la cuenta");
        System.out.print("Cantidad a retirar: $");
        sc.extraccionRapida(cuenta, scan.nextDouble());

        sc.consultarSaldo(cuenta);
    }
}
