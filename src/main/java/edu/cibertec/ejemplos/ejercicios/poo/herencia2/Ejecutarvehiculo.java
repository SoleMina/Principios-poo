package edu.cibertec.ejemplos.ejercicios.poo.herencia2;

public class Ejecutarvehiculo {
    public static void main(String[] args) {
        
        VehiculoAutomovil auto01 = new VehiculoAutomovil(5, "ABC-007", 'S', 2500, "BMW", "3251");
        auto01.imprimirDatos();
        
        VehiculoMotocicleta moto01 = new VehiculoMotocicleta(true, "FGH-123", 'M', 1600, "Kawasaki", "Ninja");
        moto01.imprimirDatos();
        
        
        
    }
}
