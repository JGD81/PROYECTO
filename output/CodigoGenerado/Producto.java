public abstract class Producto {
    private String nombre;
    private double precio;
    public void Producto();
    public void Producto(String nombre, double precio);
    public String getNombre();
    public double getPrecio();
    public void setNombre(String nombre);
    public void setPrecio(double precio);
    public double calcularPrecioFinal();
}
