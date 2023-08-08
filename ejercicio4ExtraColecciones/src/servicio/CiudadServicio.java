package servicio;

import entidad.Ciudad;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CiudadServicio {

    Scanner scan = new Scanner(System.in);
    HashMap<String, Ciudad> ciudades = new HashMap();

    public void crearCiudad() {
        System.out.println("-------------------------");
        System.out.println("--Ingresar ciudad--");
        String response;
        do {

            Ciudad ciudad = new Ciudad();
            System.out.print("Ciudad: ");
            String nombre = scan.nextLine();
            ciudad.setNombre(nombre);
            System.out.print("Cód. Postal: ");
            String codPostal = scan.nextLine();
            ciudad.setCodPostal(codPostal);
            ciudades.put(codPostal, ciudad);
            System.out.println("¿Quieres ingresar otra ciudad? (S/N) ");
            response = scan.nextLine();

        } while (response.equalsIgnoreCase("S"));
        mostrarCiudadesIngresadas();
        System.out.println("-------------------------");
    }

    public void mostrarCiudadesIngresadas() {
        System.out.println("-------------------------");
        System.out.println("--Ciudades ingresadas--");
        for (Map.Entry<String, Ciudad> entry : ciudades.entrySet()) {
            String key = entry.getKey();
            Ciudad value = entry.getValue();
            System.out.println("Ciudad: " + value.getNombre() + " - " + "Cód. Postal: " + key);
        }
        System.out.println("-------------------------");
    }

    public void buscarCiudadPorCodPostal() {
        System.out.println("-------------------------");
        System.out.println("--Buscar ciudad--");
        System.out.print("Ingresar código postal para buscar ciudad: ");
        String codPostalAbuscar = scan.nextLine();

        for (Map.Entry<String, Ciudad> entry : ciudades.entrySet()) {
            String key = entry.getKey();
            Ciudad value = entry.getValue();
            if (codPostalAbuscar.equalsIgnoreCase(key)) {
                System.out.println("Ciudad: " + value.getNombre() + " - " + "Cód. Postal: " + key);
                System.out.println("-------------------------");
                return;
            }
        }
        System.out.println("No se encuentra ciudad con el código ingresado.");
        System.out.println("-------------------------");
    }

    public void eliminarCiudad() {

        System.out.println("-------------------------");
        System.out.println("--Eliminar ciudad--");
        System.out.print("Nombre de ciudad para eliminar: ");
        String ciudadAbuscar = scan.nextLine();

        for (Map.Entry<String, Ciudad> entry : ciudades.entrySet()) {
            String key = entry.getKey();
            Ciudad value = entry.getValue();
            if (ciudadAbuscar.equalsIgnoreCase(value.getNombre())) {
                ciudades.remove(key);
                System.out.println("Ciudad eliminada con éxito.");
                System.out.println("-------------------------");
                return;
            }
        }
        System.out.println("No se pudo eliminar la ciudad.");
        System.out.println("-------------------------");
    }

}
