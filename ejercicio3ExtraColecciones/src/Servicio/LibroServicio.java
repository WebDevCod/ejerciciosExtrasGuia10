package Servicio;

import Entidad.Libro;
import java.util.HashSet;

public class LibroServicio {

    public void prestamo(Libro libro) {
        int cantidadPrestados = libro.getNumeroDeEjemplaresPrestados();
        int cantidadEjemplares = libro.getNumeroDeEjemplares();
        if (cantidadEjemplares == 0) {
            System.out.println("No hay ejemplares para prestar");
        } else {
            libro.setNumeroDeEjemplaresPrestados(cantidadPrestados + 1);
            libro.setNumeroDeEjemplares(cantidadEjemplares - 1);
            System.out.println("Prestamos realizado");
        }

    }

    public void devolucion(Libro libro) {
        int cantidadPrestados = libro.getNumeroDeEjemplaresPrestados();
        int cantidadEjemplares = libro.getNumeroDeEjemplares();

        if (cantidadPrestados >= cantidadEjemplares) {
            libro.setNumeroDeEjemplaresPrestados(cantidadPrestados - 1);
            libro.setNumeroDeEjemplares(cantidadEjemplares + 1);
            System.out.println("Devolución realizada");
        } else {
            System.out.println("No se puede devolver, ya tienes la cantidad total de ejemplares");
        }

    }

    public void mostrarDatosLibros(HashSet<Libro> libros) {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

}
