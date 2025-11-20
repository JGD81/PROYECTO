

public class Producto {
    
    //Nombre del producto
    private String nombre;
    //Precio base del producto
    private double precio;

    //Constructor vacío (evita errores si inicializamos sin parámetros)
    public Producto(){
        
    }
    
    //Constructor con parámetros
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }



}
