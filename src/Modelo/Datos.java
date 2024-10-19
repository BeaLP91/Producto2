package Modelo;

import java.util.ArrayList;

public class Datos {
    public static void cargarDatos(CentroExcursionista centro) {
        ArrayList<Socio> socios = new ArrayList<>();
        ArrayList<Excursion> excursiones = new ArrayList<>();
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        // Cargar datos de seguros
        Seguro seguroBasico = new Seguro(TipoSeguro.SEGUROBASICO, 50.0);
        Seguro seguroCompleto = new Seguro(TipoSeguro.SEGUROCOMPLETO, 100.0);

        // Cargar datos de federaciones
        Federacion federacionNacional = new Federacion("FED01", "Federación Nacional");

        // Crear algunos datos ficticios
        Socio socio1 = new Estandar(1, "Juan Pérez", "12345678A", seguroBasico);
        Socio socio2 = new Federado(2, "Ana García", "87654321B", federacionNacional);
        socios.add(socio1);
        socios.add(socio2);

        Excursion excursion1 = new Excursion("EX01", "Excursión a la montaña", java.time.LocalDate.now(), 1, 100.0);
        excursiones.add(excursion1);

        // Asignar datos al centro
        centro.setSocios(socios);
        centro.setExcursiones(excursiones);
        centro.setInscripciones(inscripciones);
    }
}

