package edu.cibertec.ejemplos.ejercicios.poo.herencia1;

public abstract class Empleado {
    
    private String dni;
    private String nombre;
    private String apellido;
    private double tarifa;
    private int horas;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellido, double tarifa, int horas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarifa = tarifa;
        this.horas = horas;
    }
    
    //Add método sueldo base
    public double calcularSueldoBase() {
        return tarifa*horas;
    }
    
    public void imprimirDatos() {
        String mensaje = String.format("El empleado %s %s con dni %s tiene una tarifa de %.2f por %d horas ", nombre, apellido, dni, tarifa, horas );
        System.out.println(mensaje);
    }
    public void imprimirDatos(String tipoEmpleado) {
        System.out.println("Tipo de empleado: " + tipoEmpleado);
        imprimirDatos();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
}
