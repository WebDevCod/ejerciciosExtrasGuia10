package ejercicio1extracolecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1ExtraColecciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList();

        int numEnter;
        System.out.println("Ingresa números enteros. Para salir ingresa el valor -99");
        do {
            System.out.print("Num: ");
            numEnter = leer.nextInt();
            if (numEnter != -99) {
                numList.add(numEnter);
            }
        } while (numEnter != -99);

        System.out.println("-------------------------");
        showListNumbers(numList);
        double total = addListNumbers(numList);
        averageListNumbers(numList, total);

    }

    public static void showListNumbers(ArrayList<Integer> numList) {
        System.out.println("Listado de números");
        numList.forEach((e) -> System.out.println(e));
    }

    public static int addListNumbers(ArrayList<Integer> numList) {
        System.out.println("-------------------------");
        System.out.println("Suma de los elementos de la lista");
        int total = 0;
        for (int i = 0; i < numList.size(); i++) {
            total += numList.get(i);
        }
        System.out.println(total);
        return total;
    }

    public static void averageListNumbers(ArrayList<Integer> numList, double total) {
        System.out.println("-------------------------");
        System.out.println("Promedio de los elementos de la lista");
        double average = total / numList.size();
        System.out.println(average);
    }
}
