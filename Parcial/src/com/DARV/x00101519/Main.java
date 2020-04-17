package com.DARV.x00101519;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        byte buf = 0;

        do {
            printMenu();
            buf = info.nextByte();
            info.nextLine();
            switch (buf) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:

                    break;
            }
        } while (buf != 0);
    }
    static void printMenu () {
        System.out.println("----Menu---");
        System.out.println("1. Desea agregar un empleado:");
        System.out.println("2. Digite el empleado a eliminar:");
        System.out.println("3. Desea ver la lista de empleados.");
        System.out.println("4. Calcular el sueldo.");
        System.out.println("5. Mostrar totales:");
        System.out.println("0. Salir.");
        System.out.print("Su opcion elegida es: ");
    }
}