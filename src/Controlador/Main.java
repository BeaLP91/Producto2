package Controlador;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mostramos al usuario el menu con las distintas opciones
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("\n===============================================");
        System.out.println("    PROGRAMA DE GESTION SENDEROS Y MONTAÑAS    ");
        System.out.println("===============================================");

        do {
            System.out.println("");
            System.out.println("| MENU PRINCIPAL\n");
            System.out.println("1. Gestión Excursiones");
            System.out.println("2. Gestión de socios");
            System.out.println("3. Gestión de inscripsiones");
            System.out.println("4. Salir de la aplicación");
            System.out.println("\n_____________________________________________\n");
            System.out.print("Selecciones una opción: ");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("-------------------------------------------------");
                    System.out.println("              Gestión de Excursiones             ");
                    System.out.println("-------------------------------------------------");
                    do {
                        System.out.println("");
                        System.out.println("| MENU PRINCIPAL\n");
                        System.out.println("1. Añadir Excursión");
                        System.out.println("2. Mostrar Excursiones con filtro entre fechas");
                        System.out.println("\n_____________________________________________\n");
                        System.out.print("Selecciones una opción: ");

                        opcion = scanner.nextInt();
                        switch (opcion) {
                            case 1:

                        }
                    } while (opcion != 2);
            }

        } while (opcion != 4);
    }
}