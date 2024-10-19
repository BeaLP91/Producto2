package Modelo;


public class CentroExcursionista {
    private ListaSocios socios;
    private ListaExcursiones excursiones;
    private ListaInscripciones inscripciones;

    // Constructor
    public CentroExcursionista(ListaSocios socios, ListaExcursiones excursiones, ListaInscripciones inscripciones) {
        this.socios = socios;
        this.excursiones = excursiones;
        this.inscripciones = inscripciones;
    }

    // Getters
    public ListaSocios getSocios() {
        return socios;
    }

    public ListaExcursiones getExcursiones() {
        return excursiones;
    }

    public ListaInscripciones getInscripciones() {
        return inscripciones;
    }

    // Setters
    public void setSocios(ListaSocios socios) {
        this.socios = socios;
    }

    public void setExcursiones(ListaExcursiones excursiones) {
        this.excursiones = excursiones;
    }

    public void setInscripciones(ListaInscripciones inscripciones) {
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



