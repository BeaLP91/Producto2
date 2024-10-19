package Modelo;

import java.util.ArrayList;

public abstract class Lista<T> {
    protected ArrayList<T> elementos;

    public Lista() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public void eliminar(T elemento) {
        elementos.remove(elemento);
    }

    public ArrayList<T> getElementos() {
        return elementos;
    }
}
