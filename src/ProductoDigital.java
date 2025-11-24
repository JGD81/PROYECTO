
public class ProductoDigital extends Producto {
    
    private double tamanioDescarga;

    //Constructor
    public ProductoDigital (String nombre, double precio, double tamanioDescarga){
        super(nombre, precio);
        this.tamanioDescarga = tamanioDescarga;
    }

    //Getters
    public double getTamanioDescarga() {
        return tamanioDescarga;
    }

    //Setters
    public void setTamanioDescarga(double tamanioDescarga) {
        if (tamanioDescarga < 0) {
            this.tamanioDescarga = 0;
        }else{
            this.tamanioDescarga = tamanioDescarga;
        }
    }

    //Método que sobreescribe al de Producto
    @Override
    public double calcularPrecioFinal(){
        //Suponemos un 5 % de descuento para productos digitales
        return super.calcularPrecioFinal() * 0.95;
    }
}
