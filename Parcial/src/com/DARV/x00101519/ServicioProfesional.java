package com.DARV.x00101519;

public class ServicioProfesional extends Empleado {

private int extension;

    public ServicioProfesional(String nombre, String puesto, double salario, int extension) {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}