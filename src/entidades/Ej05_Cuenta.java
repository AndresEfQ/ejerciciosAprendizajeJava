package entidades;

import java.util.Scanner;

public class Ej05_Cuenta {

    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    private int interes;

    public Ej05_Cuenta() {
    }

    public Ej05_Cuenta(int numeroCuenta, long dni, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public static Ej05_Cuenta crearCuenta() {

        Scanner sc = new Scanner(System.in);

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

    public void ingresar(double ingreso) {
        this.saldoActual += ingreso;
        System.out.println("Se ha ingresado $" + ingreso + ". El saldo actual de la cuenta es $" + this.saldoActual);
    }

    public void retirar(double retiro) {
        this.saldoActual -= retiro;
        System.out.println("Se ha retirado " + retiro + "$. El saldo actual de la cuenta es $" + this.saldoActual);
    }

    public void extraccionRapida(double retiro) {
        if (this.saldoActual * 0.2 > retiro) {
            this.saldoActual -= retiro;
            System.out.println("Se ha retirado " + retiro + "$. El saldo actual de la cuenta es $" + this.saldoActual);
        } else {
            System.out.println("Saldo insuficiente para realizar una extracción rápida, intente retirar de forma manual");
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual de esta cuenta es $" + this.saldoActual);
    }

    public void consultarDatos() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Ej05_Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", dni=" + dni +
                ", saldoActual=" + saldoActual +
                ", interes=" + interes +
                '}';
    }
}
