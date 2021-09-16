package edu.cibertec.ejemplos.ejercicios.poo.herencia1;

public class EmpleadoTI extends Empleado {
    
    private int horasExtras;

    @Override
    public double calcularSueldoBase() {
        return super.calcularSueldoBase() + (horasExtras*20); 
    }
    

    public EmpleadoTI(int horasExtras, String dni, String nombre, String apellido, double tarifa, int horas) {
        super(dni, nombre, apellido, tarifa, horas);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    
    
}
