package servicios;

import entidades.Ej05_Cuenta;

import java.util.Scanner;

public class Ej05_servicioCuenta {

    private final Ej05_Cuenta cuenta = new Ej05_Cuenta();

    public void crearCuenta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al servicio de creación de cuentas");
        System.out.println("Por favor ingrese los siguientes datos:");

        System.out.print("Número de cuenta: ");
        this.cuenta.setNumeroCuenta(sc.nextInt());

        System.out.print("DNI cliente: ");
        this.cuenta.setDni(sc.nextLong());

        System.out.print("Saldo inicial: $");
        this.cuenta.setSaldoActual(sc.nextDouble());

        System.out.print("Interés de la cuenta: %");
        this.cuenta.setInteres(sc.nextInt());
    }

    public void ingresar(double ingreso) {
        this.cuenta.setSaldoActual(this.cuenta.getSaldoActual() + ingreso);
        System.out.println("Se ha ingresado $" + ingreso + ". El saldo actual de la cuenta es $" + this.cuenta.getSaldoActual());
    }

    public void retirar(double retiro) {
        this.cuenta.setSaldoActual(this.cuenta.getSaldoActual() - retiro);
        System.out.println("Se ha retirado " + retiro + "$. El saldo actual de la cuenta es $" + this.cuenta.getSaldoActual());
    }

    public void extraccionRapida(double retiro) {
        if (this.cuenta.getSaldoActual() * 0.2 > retiro) {
            this.cuenta.setSaldoActual(this.cuenta.getSaldoActual() - retiro);
            System.out.println("Se ha retirado " + retiro + "$. El saldo actual de la cuenta es $" + this.cuenta.getSaldoActual());
        } else {
            System.out.println("Saldo insuficiente para realizar una extracción rápida, intente retirar de forma manual");
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual de esta cuenta es $" + this.cuenta.getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println(this.cuenta);
    }
}
