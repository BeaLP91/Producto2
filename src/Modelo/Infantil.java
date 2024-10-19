package Modelo;

public class Infantil extends Socio {
    private int descuentoCuota50;
    private int numSocioTutor;

    public Infantil(int numSocio, String nombre, int numSocioTutor) {
        super(numSocio, nombre);
        this.descuentoCuota50 = 50; // 50% de descuento
        this.numSocioTutor = numSocioTutor;
    }

    public int getDescuentoCuota50() {
        return descuentoCuota50;
    }

    public int getNumSocioTutor() {
        return numSocioTutor;
    }

    public double aplicarDescuentoCuota(double cuota) {
        return cuota * (1 - (descuentoCuota50 / 100.0)); // Descuento del 50%
    }

    @Override
    public String toString() {
        return "Infantil{" +
                "descuentoCuota50=" + descuentoCuota50 +
                ", numSocioTutor=" + numSocioTutor +
                "} " + super.toString();
    }
}

