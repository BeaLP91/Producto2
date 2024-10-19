package Modelo;

public class Inscripcion {
    private Socio socio; // la inscripción tiene un socio concreto
    private Excursion excursion; // tiene una excursión concreta
    private int numInscripcion;

    public Inscripcion(Socio socio, Excursion excursion, int numInscripcion) {
        this.socio = socio;
        this.excursion = excursion;
        this.numInscripcion = numInscripcion;
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

    public double calcularPrecioFinal() {
        double precioBase = excursion.getPrecioInscripcion();
        if (socio instanceof Federado) {
            return ((Federado) socio).aplicarDescuentoExcursion(excursion);
        } else if (socio instanceof Infantil) {
            return ((Infantil) socio).aplicarDescuentoCuota(precioBase);
        }
        return precioBase; // Sin descuento para otros tipos de socios
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "socio=" + socio +
                ", excursion=" + excursion +
                ", numInscripcion=" + numInscripcion +
                '}';
    }
}
