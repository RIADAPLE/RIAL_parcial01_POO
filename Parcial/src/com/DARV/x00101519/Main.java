package com.DARV.x00101519;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        ArrayList<PlazaFija> Datos = new ArrayList<>();
        ArrayList<ServicioProfesional> Dato = new ArrayList<>();
        CalculadoraImpuestos calcu = new CalculadoraImpuestos(0,0,0);
        System.out.println("Introduzca el nombre de la empresa");
        String Empresita = info.nextLine();
        Empresa Empres = new Empresa(Empresita);
        boolean continuar = true;


        do {
            try {
                System.out.println("----" + Empres.getNombre() + "----");
                printMenu();
                String buf = info.nextLine();
                byte buf1 = Byte.parseByte(buf);

                switch (buf1) {
                    case 1:
                        Empres.addEmplado();
                        break;
                    case 2:
                        System.out.println("Introduzca el nombre del empleado que quiere eliminar:");
                        String name = info.nextLine();
                        Empres.quitEmplado(name);
                        System.out.println("Eliminando...");
                        break;
                    case 3:
                        Datos = Empres.getPlanilla1();
                        Dato = Empres.getPlanilla2();
                        Datos.forEach(PlazaFija -> {
                            System.out.println(PlazaFija.toString());
                            PlazaFija.mostrardocu();
                        });
                        Dato.forEach(ServicioProfesional -> {
                            System.out.println(ServicioProfesional.toString());
                            ServicioProfesional.mostrardocu();
                        });
                        break;
                    case 4:
                        System.out.println("Introduzca el nombre del empleado al cual le quiere calcular el sueldo: ");
                        String name1 = info.nextLine();
                        Datos = Empres.getPlanilla1();
                        Dato = Empres.getPlanilla2();
                        Datos.forEach(s -> {
                            if (name1.equalsIgnoreCase(s.getNombre())) {
                                System.out.println("$" + calcu.calcularPago(s));
                            }
                        });
                        Dato.forEach(s -> {
                            if (name1.equalsIgnoreCase(s.getNombre())) {
                                System.out.println("$" + calcu.calcularPago(s));
                            }
                        });
                        break;
                    case 5:
                        System.out.println("Mostrando totales: ");
                        calcu.mostrarTotales();
                        break;
                    case 0:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción errónea!");
                        break;
                }
            }catch (NumberFormatException exc) {
                System.out.println("La opción debe ser un número");
            }
        } while (continuar);
    }
    static void printMenu () {
        System.out.println("1. Desea agregar un empleado:");
        System.out.println("2. Digite el empleado a eliminar:");
        System.out.println("3. Desea ver la lista de empleados.");
        System.out.println("4. Calcular el sueldo.");
        System.out.println("5. Mostrar totales:");
        System.out.println("0. Salir.");
        System.out.print("Su opcion elegida es: ");
    }



}