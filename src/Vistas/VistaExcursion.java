package Vistas;

import Modelo.Excursion;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaExcursion {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarListaExcursiones(ArrayList<Excursion> excursiones) {
        System.out.println("Lista de excursiones:");
        for (Excursion excursion : excursiones) {
            System.out.println(excursion);
        }
    }

    public Excursion solicitarDatosExcursion() {
        System.out.println("Introduce el código alfanumérico:");
        String codigo = scanner.nextLine();
        System.out.println("Introduce la descripción de la excursión:");
        String descripcion = scanner.nextLine();
        System.out.println("Introduce el número de días:");
        int dias = scanner.nextInt();
        System.out.println("Introduce el precio de inscripción:");
        double precio = scanner.nextDouble();

        return new Excursion(codigo, descripcion, java.time.LocalDate.now(), dias, precio);
    }
}
