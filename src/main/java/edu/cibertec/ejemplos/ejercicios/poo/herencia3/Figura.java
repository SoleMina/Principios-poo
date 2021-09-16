package edu.cibertec.ejemplos.ejercicios.poo.herencia3;

public abstract class Figura {
    
    private String color;
    
    public Figura() {
        
    }
    public abstract double calcularArea();

    public Figura(String color) {
        this.color = color;
    }
    public void imprimirDatos() {
        String mensaje = String.format("El color de la figura es %s", color);
        System.out.println(mensaje);
    }
    public void imprimirDatos(String tipoFigura) {
        System.out.println("La figura es: " + tipoFigura);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
