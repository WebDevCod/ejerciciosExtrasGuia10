package servicio;

import entidad.Ciudad;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CiudadServicio {

    Scanner scan = new Scanner(System.in);
    HashMap<String, Ciudad> ciudades = new HashMap();

    public void crearCiudad() {

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

    }

    public void mostrarCiudadesIngresadas() {
        System.out.println("-------------------------");
        System.out.println("--Ciudades ingresadas--");
        for (Map.Entry<String, Ciudad> ciudad : ciudades.entrySet()) {
            String key = ciudad.getKey();
            Ciudad value = ciudad.getValue();
            System.out.println("Ciudad: " + value.getNombre() + " - " + "Cód. Postal: " + key);
        }
        System.out.println("-------------------------");
    }

    public void buscarCiudadPorCodPostal() {
        System.out.println("-------------------------");
        System.out.println("--Buscar ciudad--");
        System.out.print("Ingresar código postal para buscar ciudad: ");

        String keyCodPostal = scan.nextLine();
        if (ciudades.containsKey(keyCodPostal)) {
            String valueCiudad = ciudades.get(keyCodPostal).getNombre();
            System.out.println("Ciudad: " + valueCiudad + " - " + "Cód. Postal: " + keyCodPostal);
        } else {
            System.out.println("No se encuentra ciudad con el código ingresado.");
        }

        System.out.println("-------------------------");
    }

    public void eliminarCiudad() {

        System.out.println("-------------------------");
        System.out.println("--Eliminar ciudad--");
        System.out.print("Nombre de ciudad para eliminar: ");

        String nombreCiudad = scan.nextLine();
        String codigoPostal = null;

        for (Map.Entry<String, Ciudad> ciudad : ciudades.entrySet()) {
            if (ciudad.getValue().getNombre().equalsIgnoreCase(nombreCiudad)) {
                codigoPostal = ciudad.getKey();
                break;
            }
        }

        if (codigoPostal != null) {
            ciudades.remove(codigoPostal);
            System.out.println("Ciudad eliminada con éxito.");
        } else {
            System.out.println("No se pudo eliminar la ciudad");
        }

        System.out.println("-------------------------");

    }

}
