package servicios;

import entidades.Ej14_Movil;

import java.util.Scanner;

public class Ej14_servicioMovil {

    Ej14_Movil movil = new Ej14_Movil();

    private int[] cargarCodigo() {
        Scanner sc = new Scanner(System.in);
        int[] codigo = new int[7];

        System.out.println("Por favor ingresa los 7 números que conforman el código");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i+1) + ": ");
            codigo[i] = Integer.parseInt(sc.nextLine());
        }
        return codigo;
    }

    public void cargarCelular() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingresa los datos del móvil");

        System.out.print("Marca: ");
        this.movil.setMarca(sc.nextLine());

        System.out.print("Precio: ");
        this.movil.setPrecio(Double.parseDouble(sc.nextLine()));

        System.out.print("Modelo: ");
        this.movil.setModelo(sc.nextLine());

        System.out.print("Memoria RAM: ");
        this.movil.setMemoriaRam(Integer.parseInt(sc.nextLine()));

        System.out.print("Almacenamiento: ");
        this.movil.setAlmacenamiento(Integer.parseInt(sc.nextLine()));

        this.movil.setCodigo(this.cargarCodigo());
    }

    public void mostrarCelular() {
        System.out.println(this.movil);
    }
}
