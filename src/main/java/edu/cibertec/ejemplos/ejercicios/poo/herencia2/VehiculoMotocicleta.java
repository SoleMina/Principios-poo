package edu.cibertec.ejemplos.ejercicios.poo.herencia2;

public class VehiculoMotocicleta extends Vehiculo {
    
    private boolean carenado;
    
    
    public VehiculoMotocicleta() {
        
    }

    public VehiculoMotocicleta(boolean carenado, String placa, char transmision, int numMotor, String marca, String modelo) {
        super(placa, transmision, numMotor, marca, modelo);
        this.carenado = carenado;
    }

    public boolean isCarenado() {
        return carenado;
    }

    public void setCarenado(boolean carenado) {
        this.carenado = carenado;
    }
    
    
    
    
    
    
    
}
