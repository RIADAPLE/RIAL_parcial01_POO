package com.DARV.x00101519;

public class CalculadoraImpuestos {
    private double totalRenta;
    private double totalISSS;
    private double totalAFP;

    public CalculadoraImpuestos(double totalRenta, double totalISSS, double totalAFP) {
        this.totalRenta = totalRenta;
        this.totalISSS = totalISSS;
        this.totalAFP = totalAFP;
    }

    public double calcularPago(Empleado tEmpleado){
        double x = tEmpleado.getSalario();
        if(tEmpleado.getPuesto().equalsIgnoreCase("servicio profesional")){
            this.totalRenta += x*0.1;
            return x*0.9;
        }
        else{
            this.totalAFP += x*0.0625;
            x = x*0.9375;
            this.totalISSS += x*0.03;
            x = x*9075;
            if(x>=0.01 && x<=472.00){
                this.totalRenta += 0;
                return x;
            }
            else if(x>=472.01 && x<=895.24){
                this.totalRenta += 0.1*(x-472)+17.67;
                x = x-(0.1*(x-472)+17.67);
                return x;
            }
            else if(x>=895.25 && x<=2038.10){
                this.totalRenta += 0.2*(x-895.25)+60;
                x = x-(0.2*(x-895.25)+60);
                return x;
            }
            else{
                this.totalRenta += 0.3*(x-2038.10)+288.57;
                x = x-(0.3*(x-2038.10)+288.57);
                return x;
            }
        }
    }

    public void mostrarTotales(){
        System.out.println(this.totalRenta);
        System.out.println(this.totalISSS);
        System.out.println(this.totalAFP);
    }

}
