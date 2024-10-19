package Modelo;

public class Estandar extends Socio {

    private String nif;
    private Seguro seguro;//tiene un seguro

    public Estandar(int numSocio, String nombre, String nif, Seguro seguro) {
        super(numSocio, nombre);
        this.nif = nif;
        this.seguro = seguro;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "Estandar{" +
                "nif='" + nif + '\'' +
                ", seguro=" + seguro +
                '}';
    }
}
