
public class ProductoFisico extends Producto {
    
    private double costeEnvio;

    //Constructor con parámetros de la clase
    public ProductoFisico(String nombre, double precio, double costeEnvio){
        super(nombre, precio);
        this.costeEnvio = costeEnvio;
    }

    //Getters 
    public double getCosteEnvio() {
        return costeEnvio;
    }

    //Setters
    public void setCosteEnvio(double costeEnvio) {
        if(costeEnvio < 0){
            this.costeEnvio = 0;
        }else{
            this.costeEnvio = costeEnvio;
        }        
    }

    //Método de Producto sobreescrito con la suma de los gastos de envío
    @Override
    public double calcularPrecioFinal(){
        double precioIVA = super.calcularPrecioFinal();
        return precioIVA + costeEnvio;
    }

}
