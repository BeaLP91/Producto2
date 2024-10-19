package Modelo;

public class Inscripcion {
    private Socio socio; //la inscipcion tiene un socio concreto
    private Excursion excursion;//tiene una excursion concreta
    private int numInscripcion;
    private int numSocio;

    public Inscripcion(Socio socio, Excursion excursion, int numInscripcion, int numSocio) {
        this.socio = socio;
        this.excursion = excursion;
        this.numInscripcion = numInscripcion;
        this.numSocio = numSocio;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public int getNumInscripcion() {
        return numInscripcion;
    }

    public void setNumInscripcion(int numInscripcion) {
        this.numInscripcion = numInscripcion;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "socio=" + socio +
                ", excursion=" + excursion +
                ", numInscripcion=" + numInscripcion +
                ", numSocio=" + numSocio +
                '}';
    }
}