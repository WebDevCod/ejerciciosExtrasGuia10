package Servicio;

import java.util.ArrayList;
import Entidad.CantanteFamoso;
import java.util.Iterator;

import java.util.Scanner;

public class CantanteFamosoServicio {

    Scanner leer = new Scanner(System.in);

    public ArrayList<CantanteFamoso> agregarCantante(ArrayList<CantanteFamoso> cantantesList) {
        System.out.println("---------------------------");
        System.out.println("--Agregar cantante--");
        System.out.println("---------------------------");
        System.out.print("Ingresa nombre del cantante: ");
        String nombre = leer.nextLine();
        System.out.print("Ingresa disco más vendido: ");
        String discoConMasVentas = leer.nextLine();
        CantanteFamoso cantante = new CantanteFamoso(nombre, discoConMasVentas);
        cantantesList.add(cantante);
        System.out.println("---------------------------");

        return cantantesList;

    }

    public void mostrarCantantes(ArrayList<CantanteFamoso> cantantesList) {
        System.out.println("---------------------------");
        System.out.println("--Lista de cantantes--");
        System.out.println("---------------------------");
        cantantesList.forEach((e) -> System.out.println(e));
        System.out.println("---------------------------");
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> cantantesList) {
        System.out.println("---------------------------");
        System.out.println("--Eliminar cantante--");
        System.out.println("---------------------------");
        System.out.print("Ingresa nombre de cantante que quieres eliminar: ");
        String nombre = leer.nextLine();
        Iterator<CantanteFamoso> it = cantantesList.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
            }
        }
    }

}
