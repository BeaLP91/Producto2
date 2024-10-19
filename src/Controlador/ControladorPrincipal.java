package Controlador;

import Modelo.*;
import Vistas.*;
import java.util.List;
import java.util.Scanner;


public class ControladorPrincipal {
    private CentroExcursionista centro;
    private VistaSocio vistaSocio;
    private VistaExcursion vistaExcursion;
    private VistaInscripcion vistaInscripcion;

    public ControladorPrincipal(CentroExcursionista centro, VistaSocio vistaSocio, VistaExcursion vistaExcursion, VistaInscripcion vistaInscripcion) {
        this.centro = centro;
        this.vistaSocio = vistaSocio;
        this.vistaExcursion = vistaExcursion;
        this.vistaInscripcion = vistaInscripcion;
    }

    // Punto de entrada principal
    public static void main(String[] args) {
        // Crear las vistas
        VistaSocio vistaSocio = new VistaSocio();
        VistaExcursion vistaExcursion = new VistaExcursion();
        VistaInscripcion vistaInscripcion = new VistaInscripcion();

        // Crear el centro excursionista (modelo) con listas vacías inicialmente
        CentroExcursionista centro = new CentroExcursionista(new ListaSocios(), new ListaExcursiones(), new ListaInscripciones());

        // Crear el controlador principal
        ControladorPrincipal controlador = new ControladorPrincipal(centro, vistaSocio, vistaExcursion, vistaInscripcion);

        // Cargar los datos iniciales
        controlador.cargarDatosIniciales();

        // Mostrar el menú principal
        controlador.mostrarMenu();
    }

    // Método para cargar datos iniciales
    public void cargarDatosIniciales() {
        Datos.cargarDatos(centro);
    }

    // Menú principal para interactuar con el usuario
    private void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n------ Menú Principal ------");
            System.out.println("1. Gestionar Socios");
            System.out.println("2. Gestionar Excursiones");
            System.out.println("3. Gestionar Inscripciones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionarSocios();
                    break;
                case 2:
                    gestionarExcursiones();
                    break;
                case 3:
                    gestionarInscripciones();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    // Métodos para gestionar Socios
    private void gestionarSocios() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Socios ---");
            System.out.println("1. Registrar Socio");
            System.out.println("2. Mostrar Todos los Socios");
            System.out.println("3. Eliminar Socio");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarSocio();
                    break;
                case 2:
                    mostrarTodosLosSocios();
                    break;
                case 3:
                    eliminarSocio();
                    break;
                case 4:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    // Métodos para gestionar Excursiones
    private void gestionarExcursiones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Excursiones ---");
            System.out.println("1. Registrar Excursión");
            System.out.println("2. Mostrar Todas las Excursiones");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarExcursion();
                    break;
                case 2:
                    mostrarTodasLasExcursiones();
                    break;
                case 3:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    // Métodos para gestionar Inscripciones
    private void gestionarInscripciones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Inscripciones ---");
            System.out.println("1. Registrar Inscripción");
            System.out.println("2. Mostrar Todas las Inscripciones");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarInscripcion();
                    break;
                case 2:
                    mostrarTodasLasInscripciones();
                    break;
                case 3:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    // Métodos para gestionar Socios
    public void registrarSocio() {
        Socio nuevoSocio = vistaSocio.solicitarDatosSocio();
        centro.getSocios().agregar(nuevoSocio); // Cambiado
        vistaSocio.mostrarMensaje("Socio registrado con éxito: " + nuevoSocio);
    }

    public void mostrarTodosLosSocios() {
        List<Socio> socios = centro.getSocios().obtenerTodos();  // Usa el método de obtener todos
        vistaSocio.mostrarListaSocios(socios);
    }

    public void eliminarSocio() {
        int numSocio = vistaSocio.solicitarNumeroSocio();
        centro.getSocios().eliminar(centro.getSocios().buscarPorNumero(numSocio)); // Cambiado
        vistaSocio.mostrarMensaje("Socio eliminado con éxito.");
    }

    // Métodos para gestionar Excursiones
    public void registrarExcursion() {
        Excursion nuevaExcursion = vistaExcursion.solicitarDatosExcursion();
        centro.getExcursiones().agregar(nuevaExcursion); // Cambiado
        vistaExcursion.mostrarMensaje("Excursión registrada con éxito: " + nuevaExcursion);
    }

    public void mostrarTodasLasExcursiones() {
        List<Excursion> excursiones = centro.getExcursiones().obtenerTodos();  // Usa el método de obtener todos
        vistaExcursion.mostrarListaExcursiones(excursiones);
    }

    // Métodos para gestionar Inscripciones
    public void registrarInscripcion() {
        Inscripcion nuevaInscripcion = vistaInscripcion.solicitarDatosInscripcion(
                centro.getSocios().obtenerTodos(),
                centro.getExcursiones().obtenerTodos()
        );
        centro.getInscripciones().agregar(nuevaInscripcion);
        vistaInscripcion.mostrarMensaje("Inscripción registrada con éxito: " + nuevaInscripcion);
    }

    public void mostrarTodasLasInscripciones() {
        List<Inscripcion> inscripciones = centro.getInscripciones().obtenerTodos();
        vistaInscripcion.mostrarListaInscripciones(inscripciones);
    }
}




/*package Controlador;

import java.util.Scanner;

public class Main {


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
}*/
