package Modelo;

import java.time.LocalDate;

public class Excursion {
    private String codigoAlfanumerico;
    private String descripcion;
    private LocalDate fecha;
    private int numeroDias;
    private double precioInscripcion;

    public Excursion(String codigoAlfanumerico, String descripcion, LocalDate fecha, int numeroDias, double precioInscripcion) {
        this.codigoAlfanumerico = codigoAlfanumerico;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.numeroDias = numeroDias;
        this.precioInscripcion = precioInscripcion;
    }

    public String getCodigoAlfanumerico() {
        return codigoAlfanumerico;
    }

    public void setCodigoAlfanumerico(String codigoAlfanumerico) {
        this.codigoAlfanumerico = codigoAlfanumerico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public double getPrecioInscripcion() {
        return precioInscripcion;
    }

    public void setPrecioInscripcion(double precioInscripcion) {
        this.precioInscripcion = precioInscripcion;
    }
    public double getPrecioConDescuento(double porcentajeDescuento) {
        return precioInscripcion * (1 - (porcentajeDescuento / 100));
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "codigoAlfanumerico='" + codigoAlfanumerico + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", numeroDias=" + numeroDias +
                ", precioInscripcion=" + precioInscripcion +
                '}';
    }

}
