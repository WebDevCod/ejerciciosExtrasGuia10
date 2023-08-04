package ejercicio2extracolecciones;

import Entidad.CantanteFamoso;
import Servicio.CantanteFamosoServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2ExtraColecciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<CantanteFamoso> cantantesList = new ArrayList();
        CantanteFamosoServicio cfs = new CantanteFamosoServicio();

        for (int i = 1; i < 6; i++) {
            CantanteFamoso cantante = new CantanteFamoso("Cantante " + i, "Disco " + i);
            cantantesList.add(cantante);
        }

        cantantesList.forEach((e) -> System.out.println(e));

        System.out.println("-----------------------------");
        int opcion;
        do {
            System.out.println("1) Agregar cantante");
            System.out.println("2) Mostrar cantantes");
            System.out.println("3) Eliminar cantante");
            System.out.println("4) Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cfs.agregarCantante(cantantesList);
                    break;
                case 2:
                    cfs.mostrarCantantes(cantantesList);
                    break;
                case 3:
                    cfs.eliminarCantante(cantantesList);
                    break;
                case 4:
                    System.out.println("Hasta la próxima!");
                    break;
                default:
                    System.out.println("No existe esa opción, intenta nuevamente.");
            }
        } while (opcion != 4);

    }

}
