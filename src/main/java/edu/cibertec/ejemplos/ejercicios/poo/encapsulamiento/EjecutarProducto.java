package edu.cibertec.ejemplos.ejercicios.poo.encapsulamiento;

public class EjecutarProducto {
    public static void main(String[] args) {
        Producto pro01 = new Producto(1, "Laptop", "Alta calidad", 20, 3000.0);
        
        //Cambiar un valor ya dado
        //pro01.setNombre("Laptop gamer");
        
        System.out.println("El producto es: " + pro01.getNombre());
        
        
        Producto pro02 = new Producto();
        pro02.setCodigo(2);
        pro02.setNombre("Celular");
        pro02.setDescripcion("Android 14");
        pro02.setStock(27);
        pro02.setPrecio(2100.0);
        
        System.out.println("El producto es: " + pro02.getNombre());
    }
}
