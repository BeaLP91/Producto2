package Modelo;

public class Basico extends Seguro {
    private double precio;

    public Basico(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Basico{" +
                "precio=" + precio +
                '}';
    }
}
