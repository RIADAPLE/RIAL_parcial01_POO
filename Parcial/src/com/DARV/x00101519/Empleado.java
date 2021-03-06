package com.DARV.x00101519;

import java.util.ArrayList;
import java.util.List;

abstract class Empleado {
protected String nombre;
protected String puesto;
protected ArrayList<Documento> Documento=new ArrayList<>();
protected double salario;

    public Empleado(String nombre, String puesto, double salario,String tipodoc,String numdoc) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDocumento() {
        return Documento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void addDocumento ( ) {
    }

    public void removeDocumento ( ) {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
