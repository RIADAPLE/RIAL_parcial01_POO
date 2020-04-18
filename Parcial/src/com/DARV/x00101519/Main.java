package com.DARV.x00101519;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        ArrayList<PlazaFija> Datos = new ArrayList<>();
        ArrayList<ServicioProfesional> Dato = new ArrayList<>();
        byte buf = 0;

        do {
            printMenu();
            buf = info.nextByte();
            info.nextLine();
            switch (buf) {
                case 1:

                    System.out.println("Digite el nombre del empleado:");
                    String name = info.nextLine();

                    System.out.println("Ingrese su puesto de trabajo:");
                    String position = info.nextLine();

                    System.out.println("Digite su salario: ");
                    Double ingre = info.nextDouble();

                    System.out.println("Digite su documento: ");
                    String docu = info.nextLine();

                    System.out.println("Digite su documento: ");
                    String num = info.nextLine();

                    Datos.add(new Empleado(name,position,ingre));

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