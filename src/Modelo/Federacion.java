package Modelo;

public class Federacion {

    private String codigoAlfanumerico;
    private String nombreFederacion;

    public Federacion(String codigoAlfanumerico, String nombreFederacion) {
        this.codigoAlfanumerico = codigoAlfanumerico;
        this.nombreFederacion = nombreFederacion;
    }

    public String getCodigoAlfanumerico() {
        return codigoAlfanumerico;
    }

    public void setCodigoAlfanumerico(String codigoAlfanumerico) {
        this.codigoAlfanumerico = codigoAlfanumerico;
    }

    public String getNombreFederacion() {
        return nombreFederacion;
    }

    public void setNombreFederacion(String nombreFederacion) {
        this.nombreFederacion = nombreFederacion;
    }

    @Override
    public String toString() {
        return "Federacion{" +
                "codigoAlfanumerico='" + codigoAlfanumerico + '\'' +
                ", nombreFederacion='" + nombreFederacion + '\'' +
                '}';
    }
}
