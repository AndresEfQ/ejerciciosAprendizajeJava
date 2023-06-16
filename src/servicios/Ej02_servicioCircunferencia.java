package servicios;

import entidades.Ej02_Circunferencia;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Ej02_servicioCircunferencia {

    private final Scanner sc = new Scanner(System.in);

    public Ej02_Circunferencia crearCircunferencia() {

        System.out.print("Ingresa el radio de la circunferencia: ");
        return new Ej02_Circunferencia(sc.nextDouble());
    }

    public double area(@NotNull Ej02_Circunferencia circunferencia) {

        return Math.PI * Math.pow(circunferencia.getRadio(), 2);
    }

    public double perimetro(@NotNull Ej02_Circunferencia circunferencia) {

        return 2 * Math.PI * circunferencia.getRadio();
    }
}
