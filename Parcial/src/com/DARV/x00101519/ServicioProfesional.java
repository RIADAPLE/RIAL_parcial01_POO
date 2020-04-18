package com.DARV.x00101519;

public class ServicioProfesional extends Empleado {

private int mesesContrato;

    public ServicioProfesional(String nombre, String puesto, double salario, int mesesContrato) {
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
    }

    public int getmesesContrato() {
        return mesesContrato;
    }

    public void setmesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}
