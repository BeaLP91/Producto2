package Modelo;

import java.util.ArrayList;

public class CentroExcursionista {

    private ArrayList<Socio> socios; //Un centro tiene una lista de socios
    private ArrayList<Excursion> excursiones; // el centro hace varias excursiones
    private ArrayList<Inscripcion> inscripciones; // el centro hace las inscripciones

    public CentroExcursionista(ArrayList<Socio> socios, ArrayList<Excursion> excursiones, ArrayList<Inscripcion> inscripciones) {
        this.socios = socios;
        this.excursiones = excursiones;
        this.inscripciones = inscripciones;
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

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    @Override
    public String toString() {
        return "CentroExcursionista{" +
                "socios=" + socios +
                ", excursiones=" + excursiones +
                ", inscripciones=" + inscripciones +
                '}';
    }
}
