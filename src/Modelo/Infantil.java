package Modelo;

public class Infantil extends Socio {

    private int descuentoCuota50;
    private int numSocioTutor;

    public Infantil(int numSocio, String nombre, int descuentoCuota50, int numSocioTutor) {
        super(numSocio, nombre);
        this.descuentoCuota50 = descuentoCuota50;
        this.numSocioTutor = numSocioTutor;
    }

    public int getDescuentoCuota50() {
        return descuentoCuota50;
    }

    public void setDescuentoCuota50(int descuentoCuota50) {
        this.descuentoCuota50 = descuentoCuota50;
    }

    public int getNumSocioTutor() {
        return numSocioTutor;
    }

    public void setNumSocioTutor(int numSocioTutor) {
        this.numSocioTutor = numSocioTutor;
    }

    @Override
    public String toString() {
        return "Infantil{" +
                "descuentoCuota50=" + descuentoCuota50 +
                ", numSocioTutor=" + numSocioTutor +
                '}';
    }
}
