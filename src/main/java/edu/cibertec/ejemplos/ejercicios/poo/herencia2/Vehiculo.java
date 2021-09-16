package edu.cibertec.ejemplos.ejercicios.poo.herencia2;

import java.util.UUID;

public abstract class Vehiculo {
    private String nroSerie;
    private String placa;
    private char transmision;
    private int numMotor;
    private String marca;
    private String modelo;
    
    public Vehiculo() {
        
    }
    
    public Vehiculo(String placa, char transmision, int numMotor, String marca, String modelo) {
        //Crear un número de serie random y convertirlo a string
        nroSerie = UUID.randomUUID().toString();
        this.placa = placa;
        this.transmision = transmision;
        this.numMotor = numMotor;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void imprimirDatos() {
        String mensaje = String.format("El vehiculo tiene número de serie de %s con una placa %s y una transmision %c, con un motor %d, marca %s y model %s", nroSerie, placa, transmision, numMotor, marca, modelo);
        System.out.println(mensaje);
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public char getTransmision() {
        return transmision;
    }

    public void setTransmision(char transmision) {
        this.transmision = transmision;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
}
