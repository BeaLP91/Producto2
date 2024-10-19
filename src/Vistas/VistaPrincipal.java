package Vistas;

import java.util.Scanner;

public class VistaPrincipal {
    private Scanner scanner;

    public VistaPrincipal() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n------ Menú Principal ------");
        System.out.println("1. Gestionar Socios");
        System.out.println("2. Gestionar Excursiones");
        System.out.println("3. Gestionar Inscripciones");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int solicitarOpcion() {
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

/*package Vistas;

import java.util.Scanner;

public class VistaPrincipal {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Gestionar Socios");
        System.out.println("2. Gestionar Excursiones");
        System.out.println("3. Gestionar Inscripciones");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int solicitarOpcion() {
        return scanner.nextInt();
    }
}*/
