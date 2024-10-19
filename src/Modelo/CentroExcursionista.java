package Modelo;

import java.util.ArrayList;

public class CentroExcursionista {

    private ArrayList<Socio> socios; //Un centro tiene una lista de socios
    private ArrayList<Excursion> excursiones; // el centro hace varias excursiones

    public CentroExcursionista(ArrayList<Socio> socios, ArrayList<Excursion> excursiones) {
        this.socios = socios;
        this.excursiones = excursiones;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    public ArrayList<Excursion> getExcursiones() {
        return excursiones;
    }

    public void setExcursiones(ArrayList<Excursion> excursiones) {
        this.excursiones = excursiones;
    }

}
