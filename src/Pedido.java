import java.time.LocalDate;
import java.util.*;

public class Pedido {
    
    private Cliente cliente; //A
    private List<Producto> productos;
    private LocalDate fecha;

    //Constructor
    public Pedido (Cliente cliente){
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = LocalDate.now();
    }

    //Getters
    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    //Métodos
    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto p : productos) {
            total = total + p.calcularPrecioFinal();
        }

        return total;
    }

    public void mostrarResumen() {
    System.out.println("----- RESUMEN DEL PEDIDO -----");
    System.out.println("Cliente: " + cliente.getNombre());
    System.out.println("Correo: " + cliente.getCorreo());
    System.out.println("Dirección: " + cliente.getDireccion());
    System.out.println("Fecha: " + fecha);

    System.out.println("\nProductos comprados:");
    for (Producto p : productos) {
        System.out.println("- " + p.getNombre() + " | Precio final: " + p.calcularPrecioFinal());
    }

    System.out.println("\nTotal del pedido: " + calcularTotal());
    }


}
