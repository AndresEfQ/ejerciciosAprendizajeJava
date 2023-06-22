package entidades;

import java.util.Scanner;

public class Ej05_Cuenta {

    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    private int interes;

    public Ej05_Cuenta() {
    }

    public Ej05_Cuenta(int numeroCuenta, long dni, double saldoActual, int interes) {
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

    public double getSaldoActual() {
        return this.saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
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
