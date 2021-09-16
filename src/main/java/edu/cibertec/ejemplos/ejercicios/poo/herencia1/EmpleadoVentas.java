package edu.cibertec.ejemplos.ejercicios.poo.herencia1;

public class EmpleadoVentas extends Empleado {
    private double comision;
    private char categoria;

    public EmpleadoVentas(double comision, char categoria, String dni, String nombre, String apellido, double tarifa, int horas) {
        super(dni, nombre, apellido, tarifa, horas);
        this.comision = comision;
        this.categoria = categoria;
    }

    @Override
    public double calcularSueldoBase() {
        double incremento = 0.0;
        switch(categoria) {
            case 'A':
            case 'a': incremento = (super.calcularSueldoBase()*0.10);
                    break;
            case 'B':
            case 'b': incremento = (super.calcularSueldoBase()*0.05);
                    break;
            default: System.out.println("Categoría invalida, no hay incremento");
        }
        return super.calcularSueldoBase() + comision + incremento;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    
    
}
