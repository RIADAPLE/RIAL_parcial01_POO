package com.DARV.x00101519;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private  List<Empleado> Planilla=new ArrayList<Empleado>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getPlanilla() {
        return Planilla;
    }

    public void addEmplado( ) {
    }

    public void quitEmplado( ) {
    }
}
