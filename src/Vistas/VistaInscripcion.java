package Vistas;

import Modelo.Inscripcion;
import Modelo.Socio;
import Modelo.Excursion;


import java.util.List;
import java.util.Scanner;

public class VistaInscripcion {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarListaInscripciones(List<Inscripcion> inscripciones) {
        System.out.println("Lista de inscripciones:");
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println(inscripcion + " - Precio Final: " + inscripcion.calcularPrecioFinal());
        }
    }

    public Inscripcion solicitarDatosInscripcion(List<Socio> socios, List<Excursion> excursiones) {
        System.out.println("Lista de socios disponibles:");
        for (Socio socio : socios) {
            System.out.println(socio.getNumSocio() + " - " + socio.getNombre());
        }

        System.out.println("Selecciona el número de socio:");
        int numSocio = scanner.nextInt();
        Socio socioSeleccionado = socios.stream().filter(s -> s.getNumSocio() == numSocio).findFirst().orElse(null);

        System.out.println("Lista de excursiones disponibles:");
        for (Excursion excursion : excursiones) {
            System.out.println(excursion.getCodigoAlfanumerico() + " - " + excursion.getDescripcion());
        }

        System.out.println("Selecciona el código de la excursión:");
        String codigoExcursion = scanner.next();
        Excursion excursionSeleccionada = excursiones.stream().filter(e -> e.getCodigoAlfanumerico().equals(codigoExcursion)).findFirst().orElse(null);

        System.out.println("Introduce el número de inscripción:");
        int numInscripcion = scanner.nextInt();

        Inscripcion inscripcion = new Inscripcion(socioSeleccionado, excursionSeleccionada, numInscripcion);
        System.out.println("El precio final de la inscripción es: " + inscripcion.calcularPrecioFinal());

        return inscripcion;
    }
}
