    package com.DARV.x00101519;

    public class ServicioProfesional extends Empleado {

    private int mesesContrato;

        public ServicioProfesional(String nombre, String puesto, double salario, String tipodoc, String numdoc, int mesesContrato) {
            super(nombre, puesto, salario, tipodoc, numdoc);
            this.mesesContrato = mesesContrato;
        }

        public int getmesesContrato() {
            return mesesContrato;
        }

        public void setmesesContrato(int mesesContrato) {
            this.mesesContrato = mesesContrato;
        }

        @Override
        public String toString() {
            return "\nServicio Profesional" +
                    "\n Meses de Contrato: " + mesesContrato +
                    "\n nombre: " + nombre +
                    "\n puesto: " + puesto +
                    "\n Documento: " + Documento +
                    "\n salario: $" + salario + "\n";
             }
        }

<<<<<<< HEAD
=======
    public void setmesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    @Override
    public String toString() {
        return "\nServicio Profesional" +
                "\n Meses de Contrato: " + mesesContrato +
                "\n nombre: " + nombre +
                "\n puesto: " + puesto +
                "\n Documento: " + Documento +
                "\n salario: $" + salario + "\n";
         }
    }

>>>>>>> 5adb82d1978f7c8c2934321797008164166704c6
