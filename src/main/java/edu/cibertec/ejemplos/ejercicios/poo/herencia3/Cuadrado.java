package edu.cibertec.ejemplos.ejercicios.poo.herencia3;

public class Cuadrado extends Figura{
    
    private double lado;
    
    
    public Cuadrado() {
        
    }

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2); //lado * lado
    }
    
    
}
