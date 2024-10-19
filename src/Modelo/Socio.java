package Modelo;

public abstract class Socio {
    private int numSocio;
    private String nombre;

    public Socio(int numSocio, String nombre) {
        this.numSocio = numSocio;
        this.nombre = nombre;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "numSocio=" + numSocio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
