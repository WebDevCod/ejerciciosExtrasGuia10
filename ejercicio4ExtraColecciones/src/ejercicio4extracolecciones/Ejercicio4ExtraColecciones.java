package ejercicio4extracolecciones;

import java.util.Scanner;
import servicio.CiudadServicio;

public class Ejercicio4ExtraColecciones {

    public static void main(String[] args) {

        CiudadServicio cs = new CiudadServicio();
        Scanner scan = new Scanner(System.in);

        int option;
        do {
            System.out.println("--Elije una opción--");
            System.out.println("1) Ingresar ciudad.");
            System.out.println("2) Buscar ciudad con código postal.");
            System.out.println("3) Mostrar ciudades.");
            System.out.println("4) Eliminar ciudad.");
            System.out.println("5) Salir");
            option = scan.nextInt();
            
            switch (option) {
                case 1:
                    cs.crearCiudad();
                    break;
                case 2:
                    cs.buscarCiudadPorCodPostal();
                    break;
                case 3:
                    cs.mostrarCiudadesIngresadas();
                    break;
                case 4:
                    cs.eliminarCiudad();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error: intenta con otra opción.");
            }

        } while (option != 5);

    }

}
