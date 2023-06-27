package servicios;

import entidades.Ej12_Persona;

import java.util.Date;
import java.util.Scanner;

public class Ej12_servicioPersona {

    Ej12_Persona p = new Ej12_Persona();

    public void crearPersona() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la utilidad para crear personas");
        System.out.println("Por favor ingrese el nombre y fecha de nacimiento de la persona");

        System.out.print("Nombre: ");
        this.p.setNombre(sc.nextLine());

        System.out.print("Fecha de nacimiento 'DD MM AAAA': ");
        int dia = Integer.parseInt(sc.next());
        int mes = Integer.parseInt(sc.next());
        int anio = Integer.parseInt(sc.next());
        this.p.setFechaDeNacimiento(new Date(anio-1900, mes-1, dia));
    }

    public int calcularEdad() {
        Date now = new Date();
        Date fechaNacimiento = this.p.getFechaDeNacimiento();

        int age = now.getYear() - fechaNacimiento.getYear();

        if (now.getMonth() < fechaNacimiento.getMonth()) {
            age--;
        }
        return age;
    }

    public boolean menorQue(int otherAge) {
        int age = this.calcularEdad();
        return age < otherAge;
    }

    public void mostrarPersona() {
        System.out.println(p);
    }
}
