package com.DARV.x00101519;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> Planilla = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList <Empleado> getPlanilla() {
        return Planilla;
    }

    public void addEmplado( ) {
    }

    public void quitEmplado( ) {
    }
}
