package Modelo;


public class Seguro {

    private TipoSeguro tipoSeguro;
    private Double precioSeguro;


    public Seguro(TipoSeguro tipoSeguro, Double precioSeguro) {
        this.tipoSeguro = tipoSeguro;
        this.precioSeguro = precioSeguro;
    }

    public TipoSeguro getTipoSeguro() {
        return tipoSeguro;
    }


    public Double getPrecioSeguro() {
        return precioSeguro;
    }


    @Override
    public String toString() {
        return "modelo.Seguro{" +
                "tipoSeguro=" + tipoSeguro +
                ", precioSeguro=" + precioSeguro +
                '}';
    }
}
