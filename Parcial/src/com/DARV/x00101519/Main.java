package com.DARV.x00101519;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        ArrayList<PlazaFija> Datos = new ArrayList<>();
        ArrayList<ServicioProfesional> Dato = new ArrayList<>();
        byte buf = 0;
        byte buf1 = 0;

        do {
            printMenu();
            buf = info.nextByte();
            info.nextLine();
            switch (buf) {
                case 1:
                    printMenu1();
                    buf1 = info.nextByte(); info.nextLine();
                    switch(buf1){
                        case 1:
                            System.out.println("Digite el nombre del empleado:");
                            String name = info.nextLine();

                            String position = "Plaza Fija";

                            System.out.println("Digite su salario: ");
                            Double ingre = info.nextDouble(); info.nextLine();

                            System.out.println("Digite su extensión: ");
                            int ext = info.nextInt(); info.nextLine();

                            System.out.println("Digite su documento: ");
                            String docu = info.nextLine();

                            System.out.println("Digite su número de documento: ");
                            String num = info.nextLine();

                            Datos.add(new PlazaFija(name,position,ingre,docu,num,ext));
                            break;
                        case 2:
                            System.out.println("Digite el nombre del empleado:");
                            String name1 = info.nextLine();

                            String position1 = "Servicio Profesional";

                            System.out.println("Digite su salario: ");
                            Double ingre1 = info.nextDouble(); info.nextLine();

                            System.out.println("Digite sus meses de contrato: ");
                            int mes = info.nextInt(); info.nextLine();

                            System.out.println("Digite su documento: ");
                            String docu1 = info.nextLine();

                            System.out.println("Digite su número de documento: ");
                            String num1 = info.nextLine();

                            Dato.add(new ServicioProfesional(name1,position1,ingre1,docu1,num1,mes));
                            break;
                        default:
                            System.out.println("Opción errónea!");
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Introduzca el nombre del empleado que quiere eliminar:");
                    String name = info.nextLine();
                    Datos.removeIf(s -> s.getNombre().equals(name));
                    Dato.removeIf(s -> s.getNombre().equals(name));
                    System.out.println("Eliminando...");
                    break;
                case 3:
                    Datos.forEach(PlazaFija -> System.out.println(PlazaFija.toString()));
                    Dato.forEach(ServicioProfesional -> System.out.println(ServicioProfesional.toString()));
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

    static void printMenu1(){
        System.out.println("\n¿Qué puesto tiene el empleado que desea ingresar?");
        System.out.println("1.Plaza fija");
        System.out.println("2.Servicio profesional");
        System.out.print("Su opción elegida es: ");
    }
}