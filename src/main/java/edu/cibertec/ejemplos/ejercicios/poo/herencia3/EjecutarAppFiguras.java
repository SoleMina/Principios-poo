package edu.cibertec.ejemplos.ejercicios.poo.herencia3;

public class EjecutarAppFiguras {
    
    public static void main(String[] args) {
        //Creamos un objeto del cuadrado
        Cuadrado c01 = new Cuadrado(14.5, "rojo");
        c01.imprimirDatos("CUADRADO");
       
        System.out.println("El área del cuadrado es: " + c01.calcularArea());
        
        //Creamos un objeto del circulo
        Circulo cir01 = new Circulo("red", 26.5);
        cir01.imprimirDatos("CIRCULO");
        
        System.out.println("El área del circulo es " + cir01.calcularArea());
        
        
        //Crear objeto con clase padre pero especificando objeto
        Figura f1= new Cuadrado(23.3, "blanco");
        cir01.imprimirDatos("CUADRADO");
        System.out.println("El área del cuadrado es " + f1.calcularArea());
        
        Figura f2 = new Circulo("amarillo", 34.6);
        f2.imprimirDatos("CIRCULO");
        System.out.println("El área del circulo es " + f2.calcularArea());
        
    }
    
}
