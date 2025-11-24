
public abstract class Producto {
    
    //Nombre del producto
    private String nombre;
    //Precio base del producto
    private double precio;

    //Constructor vacío (permite iniciar objetos sin pasar parámetros)
    public Producto(){
        
    }
    
    //Constructor con parámetros
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0;
        }else{
            this.precio = precio;
        }
    }

    //Métodos
    public double calcularPrecioFinal() {
        return precio + (precio * 0.21);
    }

}
