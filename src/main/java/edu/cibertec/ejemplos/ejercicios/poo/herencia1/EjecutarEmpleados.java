package edu.cibertec.ejemplos.ejercicios.poo.herencia1;

public class EjecutarEmpleados {
    public static void main(String[] args) {
        EmpleadoAdministrativo admin01 = new EmpleadoAdministrativo(10, 100.0, "1234567", "Mariana", "Estellar", 50.0, 30);
        admin01.imprimirDatos("ADMINISTRATIVO");
        
        System.out.println("El sueldo básico de " + admin01.getNombre() + " es " + admin01.calcularSueldoBase());
        
        EmpleadoVentas ventas01 = new EmpleadoVentas(200.0, 'A', "12345678", "Sandra", "Carrillo", 240.4, 20);
        ventas01.imprimirDatos("VENTAS");
        System.out.println("El sueldo básico de " + ventas01.getNombre() + " es de " + ventas01.calcularSueldoBase());
        
        EmpleadoTI empT01 = new EmpleadoTI(10, "1234567", "Sebastian", "Caceres", 2400, 30);
        empT01.imprimirDatos("TI");
        System.out.println("El sueldo básico de " + empT01.getNombre() + " es de " + empT01.calcularSueldoBase());
                
    }
}
