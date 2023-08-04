package ejercicio3extracolecciones;

import Entidad.Libro;
import Servicio.LibroServicio;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio3ExtraColecciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        LibroServicio ls = new LibroServicio();
        HashSet<Libro> libros = new HashSet();

        System.out.println("--Ingreso de libros--");
        String response;
        do {
            System.out.print("Título: ");
            String titulo = leer.nextLine();
            System.out.print("Autor: ");
            String autor = leer.nextLine();
            System.out.print("Cantidad de ejemplares: ");
            int numeroDeEjemplares = leer.nextInt();
            leer.nextLine();
            Libro libro = new Libro();
            libro.setAutor(autor);
            libro.setTitulo(titulo);
            libro.setNumeroDeEjemplares(numeroDeEjemplares);
            libros.add(libro);
            System.out.println("¿Quieres ingresar otro libro? S/N");
            response = leer.nextLine();
        } while (response.equalsIgnoreCase("S"));

        int option;
        do {
            System.out.println("1) Prestar libro");
            System.out.println("2) Devolver libro");
            System.out.println("3) Mostrar libros");
            System.out.println("4) Salir");
            option = leer.nextInt();
            leer.nextLine();

            switch (option) {
                case 1:
                    System.out.println("--Prestar libro--");
                    System.out.print("Ingresa nombre del libro que quieres prestar:");
                    String libroPrestamo = leer.nextLine();
                    for (Libro libro : libros) {
                        if (libro.getTitulo().equalsIgnoreCase(libroPrestamo)) {
                            ls.prestamo(libro);
                        }
                    }
                    break;
                case 2:

                    System.out.println("--Devolver libro--");
                    System.out.print("Ingresa nombre del libro que quieres devolver:");
                    String libroDevuelto = leer.nextLine();
                    for (Libro libro : libros) {
                        if (libro.getTitulo().equalsIgnoreCase(libroDevuelto)) {
                            ls.devolucion(libro);
                        }
                    }
                    break;
                case 3:
                    ls.mostrarDatosLibros(libros);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error: Intenta con otro opción");
            }
        } while (option != 4);

    }

}
