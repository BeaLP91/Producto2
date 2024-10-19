package Modelo;

public class Federado extends Socio {
    private String nif;
    private Federacion federacion;//tiene una federacion

    public Federado(int numSocio, String nombre, String nif, Federacion federacion) {
        super(numSocio, nombre);
        this.nif = nif;
        this.federacion = federacion;
    }

    public String getNif() {
        return nif;
    }

    public Federacion getFederacion() {
        return federacion;
    }

    public double aplicarDescuentoCuota(double cuota) {
        return cuota * 0.95; // Descuento del 5%
    }

    public double aplicarDescuentoExcursion(Excursion excursion) {
        return excursion.getPrecioConDescuento(10); // Descuento del 10%
    }

    @Override
    public String toString() {
        return "Federado{" +
                "nif='" + nif + '\'' +
                ", federacion=" + federacion +
                "} " + super.toString();
    }
}
