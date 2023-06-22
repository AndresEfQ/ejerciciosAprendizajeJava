package servicios;

import entidades.Ej05_Cuenta;

import java.util.Scanner;

public class Ej05_servicioCuenta {

    public Ej05_Cuenta crearCuenta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al servicio de creación de cuentas");
        System.out.println("Por favor ingrese los siguientes datos:");

        System.out.print("Número de cuenta: ");
        int cuenta = sc.nextInt();

        System.out.print("DNI cliente: ");
        long dni = sc.nextLong();

        System.out.print("Saldo inicial: $");
        int saldo = sc.nextInt();

        System.out.print("Interés de la cuenta: %");
        int interes = sc.nextInt();

        return new Ej05_Cuenta(cuenta, dni, saldo, interes);
    }

    public void ingresar(Ej05_Cuenta cuenta, double ingreso) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
        System.out.println("Se ha ingresado $" + ingreso + ". El saldo actual de la cuenta es $" + cuenta.getSaldoActual());
    }

    public void retirar(Ej05_Cuenta cuenta, double retiro) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        System.out.println("Se ha retirado " + retiro + "$. El saldo actual de la cuenta es $" + cuenta.getSaldoActual());
    }

    public void extraccionRapida(Ej05_Cuenta cuenta, double retiro) {
        if (cuenta.getSaldoActual() * 0.2 > retiro) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Se ha retirado " + retiro + "$. El saldo actual de la cuenta es $" + cuenta.getSaldoActual());
        } else {
            System.out.println("Saldo insuficiente para realizar una extracción rápida, intente retirar de forma manual");
        }
    }

    public void consultarSaldo(Ej05_Cuenta cuenta) {
        System.out.println("El saldo actual de esta cuenta es $" + cuenta.getSaldoActual());
    }

    public void consultarDatos(Ej05_Cuenta cuenta) {
        System.out.println(cuenta.toString());
    }
}
