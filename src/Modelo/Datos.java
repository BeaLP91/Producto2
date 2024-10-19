package Modelo;


public class Datos {
    public static void cargarDatos(CentroExcursionista centro) {
        ListaSocios socios = new ListaSocios();
        ListaExcursiones excursiones = new ListaExcursiones();
        ListaInscripciones inscripciones = new ListaInscripciones();

        // Cargar datos de seguros
        Seguro seguroBasico = new Seguro(TipoSeguro.SEGUROBASICO, 50.0);
        Seguro seguroCompleto = new Seguro(TipoSeguro.SEGUROCOMPLETO, 100.0);

        // Cargar datos de federaciones
        Federacion federacionNacional = new Federacion("FED01", "Federación Nacional");

        // Crear algunos datos ficticios
        Socio socio1 = new Estandar(1, "Juan Pérez", "12345678A", seguroBasico);
        Socio socio2 = new Federado(2, "Ana García", "87654321B", federacionNacional);
        socios.agregar(socio1);
        socios.agregar(socio2);

        Excursion excursion1 = new Excursion("EX01", "Excursión a la montaña", java.time.LocalDate.now(), 1, 100.0);
        excursiones.agregar(excursion1);

        // Asignar datos al centro
        centro.setSocios(socios);
        centro.setExcursiones(excursiones);
        centro.setInscripciones(inscripciones);
    }
}


