package com.DARV.x00101519;

import java.util.ArrayList;

public class PlazaFija extends Empleado{
private int extension;

    public PlazaFija(String nombre, String puesto, double salario, String tipodoc, String numdoc, int extension) {
        super(nombre, puesto, salario, tipodoc, numdoc);
        this.extension = extension;

    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
