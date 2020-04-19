package com.DARV.x00101519;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Empresa {
    private String nombre;
    private ArrayList<PlazaFija> Datos = new ArrayList<>();
    private ArrayList<ServicioProfesional> Dato = new ArrayList<>();
    Scanner info = new Scanner(System.in);

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList <PlazaFija> getPlanilla1() {
        return Datos;
    }
    public ArrayList <ServicioProfesional> getPlanilla2() {return Dato;}

    public void addEmplado( ) {
        byte buf1 = 0;
        boolean continua = false;
            try{printMenu1();
                buf1 = info.nextByte(); info.nextLine();}
            catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un número entero.");
            }

        switch(buf1){
            case 1:try{
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

                Datos.add(new PlazaFija(name,position,ingre,docu,num,ext));}
            catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un número entero en esa categoría!");
            }
                break;
            case 2:try{
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

                Dato.add(new ServicioProfesional(name1,position1,ingre1,docu1,num1,mes));}
                catch (InputMismatchException ex) {
                    System.out.println("Debe ingresar obligatoriamente un número entero en esa categoría!");
                }
                break;
            default:
                System.out.println("Opción errónea!");
                break;
        }
    }

    public void quitEmplado(String name) {
        Datos.removeIf(s -> s.getNombre().equals(name));
        Dato.removeIf(s -> s.getNombre().equals(name));
    }
    private void printMenu1(){
        System.out.println("\n¿Qué puesto tiene el empleado que desea ingresar?");
        System.out.println("1.Plaza fija");
        System.out.println("2.Servicio profesional");
        System.out.print("Su opción elegida es: ");
    }
}
