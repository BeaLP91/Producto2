package Modelo;

public class Federado extends Socio {
    private String nif;
    private int descuentoExcursion10;
    private int descuentoCuota5;
    private Federacion federacion;//tiene una federacion

    public Federado(int numSocio, String nombre, String nif, int descuentoExcursion10, int descuentoCuota5, Federacion federacion) {
        super(numSocio, nombre);
        this.nif = nif;
        this.descuentoExcursion10 = descuentoExcursion10;
        this.descuentoCuota5 = descuentoCuota5;
        this.federacion = federacion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getDescuentoExcursion10() {
        return descuentoExcursion10;
    }

    public void setDescuentoExcursion10(int descuentoExcursion10) {
        this.descuentoExcursion10 = descuentoExcursion10;
    }

    public int getDescuentoCuota5() {
        return descuentoCuota5;
    }

    public void setDescuentoCuota5(int descuentoCuota5) {
        this.descuentoCuota5 = descuentoCuota5;
    }

    public Federacion getFederacion() {
        return federacion;
    }

    public void setFederacion(Federacion federacion) {
        this.federacion = federacion;
    }

    @Override
    public String toString() {
        return "Federado{" +
                "nif='" + nif + '\'' +
                ", descuentoExcursion10=" + descuentoExcursion10 +
                ", descuentoCuota5=" + descuentoCuota5 +
                ", federacion=" + federacion +
                '}';
    }
}
