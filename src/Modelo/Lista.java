package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Lista<T> {
    private List<T> elementos;

    public Lista() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public void eliminar(T elemento) {
        elementos.remove(elemento);
    }

    public List<T> obtenerTodos() {
        return elementos;
    }

    public T buscarPorNumero(int num) {
        for (T elemento : elementos) {
            if (elemento instanceof Socio && ((Socio) elemento).getNumSocio() == num) {
                return elemento;
            }
            // Aquí puedes agregar más lógica para otros tipos de elementos si es necesario
        }
        return null; // O lanzar una excepción si no se encuentra
    }

    public int contar() {
        return elementos.size();
    }
}
