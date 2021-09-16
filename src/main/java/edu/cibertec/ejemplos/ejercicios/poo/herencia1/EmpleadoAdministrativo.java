package edu.cibertec.ejemplos.ejercicios.poo.herencia1;

public class EmpleadoAdministrativo extends Empleado {
    private int proyecto;
    private double montoProyectos;

    
    @Override
    public double calcularSueldoBase() {
        return super.calcularSueldoBase() + (proyecto*montoProyectos); //To change body of generated methods, choose Tools | Templates.
    }
    

    public EmpleadoAdministrativo(int proyecto, double montoProyectos, String dni, String nombre, String apellido, double tarifa, int horas) {
        super(dni, nombre, apellido, tarifa, horas);
        this.proyecto = proyecto;
        this.montoProyectos = montoProyectos;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    public double getMontoProyectos() {
        return montoProyectos;
    }

    public void setMontoProyectos(double montoProyectos) {
        this.montoProyectos = montoProyectos;
    }
    
    
    
    
}
