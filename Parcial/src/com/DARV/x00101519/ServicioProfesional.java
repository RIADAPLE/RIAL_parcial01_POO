package com.DARV.x00101519;

public class ServicioProfesional extends Empleado {

private int mesesContrato;

    public ServicioProfesional(String nombre, String puesto, double salario, String tipodoc, String numdoc, int mesesContrato) {
        super(nombre, puesto, salario, tipodoc, numdoc);
        this.mesesContrato = mesesContrato;
        Documento.add(new Documento(tipodoc,numdoc));
    }

    public int getmesesContrato() {
        return mesesContrato;
    }

    public void setmesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public void mostrardocu(){
        Documento.forEach(s -> System.out.println(" Documento"+s.getNombre() +"\n Nº de documento" +s.getNumero()+"\n"));
    }

    @Override
    public String toString() {
        return "\nServicio Profesional" +
                "\n Meses de Contrato: " + mesesContrato +
                "\n nombre: " + nombre +
                "\n puesto: " + puesto +
                "\n salario: $" + salario;
         }
    }

