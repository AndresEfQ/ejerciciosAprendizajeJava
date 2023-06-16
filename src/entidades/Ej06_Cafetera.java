package entidades;

public class Ej06_Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Ej06_Cafetera() {
    }

    public Ej06_Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        this.setCantidadActual(this.getCapacidadMaxima());
        System.out.println("La cafetera está llena :)");
    }

    public void servirTaza(int tamTaza) {
        if (tamTaza > this.getCantidadActual()) {
            System.out.println("Sólo se pudo llenar " + this.getCantidadActual() + " mL de la taza");
            this.setCantidadActual(0);
        } else {
            this.setCantidadActual(this.getCantidadActual() - tamTaza);
            System.out.println("Se llenó la taza");
        }
    }

    public void vaciarCafetera() {
        System.out.println("Se botaron " + this.getCantidadActual() + " mL de café :(");
        this.setCantidadActual(0);
    }

    public void agregarCafe(int cantCafe) {
        if (cantCafe + this.getCantidadActual() > this.getCapacidadMaxima()) {
            System.out.println("Se alcanzó la cantidad máxima de la cafetera y sobraron " + (cantCafe + this.getCantidadActual() - this.getCapacidadMaxima()) + " mL");
            this.setCantidadActual(this.getCapacidadMaxima());
        } else {
            System.out.println("Se adicionó + " + cantCafe + " mL de café a la cafetera.");
            this.setCantidadActual(this.getCantidadActual() + cantCafe);
        }
    }
}
