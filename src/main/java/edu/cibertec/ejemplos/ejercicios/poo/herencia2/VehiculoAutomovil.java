package edu.cibertec.ejemplos.ejercicios.poo.herencia2;

public class VehiculoAutomovil extends Vehiculo {
    private int numeroPuertas;
    
    
    public VehiculoAutomovil() {
        
    }

    public VehiculoAutomovil(int numeroPuertas, String placa, char transmision, int numMotor, String marca, String modelo) {
        super(placa, transmision, numMotor, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    
    
}
