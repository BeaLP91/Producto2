package Vistas;

import Modelo.Socio;
import Modelo.Estandar;
import Modelo.Seguro;
import Modelo.TipoSeguro;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaSocio {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarListaSocios(ArrayList<Socio> socios) {
        System.out.println("Lista de socios:");
        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }

    public Socio solicitarDatosSocio() {
        System.out.println("Introduce el número de socio:");
        int numSocio = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        System.out.println("Introduce el nombre del socio:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el NIF:");
        String nif = scanner.nextLine();
        System.out.println("Introduce el precio del seguro:");
        double precioSeguro = scanner.nextDouble();

        return new Estandar(numSocio, nombre, nif, new Seguro(TipoSeguro.SEGUROBASICO, precioSeguro));
    }

    public int solicitarNumeroSocio() {
        System.out.println("Introduce el número del socio a eliminar:");
        return scanner.nextInt();
    }
}
