package clasesMain;

import entidades.Ej05_Cuenta;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ej05_Cuenta cuenta = Ej05_Cuenta.crearCuenta();

        cuenta.consultarDatos();

        System.out.print("El saldo inicial de la cuenta es: ");
        cuenta.consultarSaldo();

        System.out.println("Ingrese saldo en la cuenta");
        System.out.print("Cantidad a ingresar: $");
        cuenta.ingresar(sc.nextDouble());

        System.out.println("Retire saldo de la cuenta");
        System.out.print("Cantidad a retirar: $");
        cuenta.retirar(sc.nextDouble());

        System.out.println("Realice una extracción rápida de la cuenta");
        System.out.print("Cantidad a retirar: $");
        cuenta.extraccionRapida(sc.nextDouble());

        cuenta.consultarSaldo();
    }
}
