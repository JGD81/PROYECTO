public class Main {
    public static void main(String[] args) {
        
        //Creación de clientes
        Cliente c1 = new Cliente(1, "Antonio Rodríguez García", "Calle Larga número 3", "77337733J", "arodrigar@gmail.com");
        Cliente c2 = new Cliente(2, "Pedro Díaz Pérez", "Calle Ancha número 43", "77337735J", "pediape@gmail.com");

        //Productos físicos y digitales
        ProductoFisico prod1 = new ProductoFisico("Teclado", 20, 3.5);
        ProductoFisico prod2 = new ProductoFisico("Monitor", 150.20, 5);
        ProductoDigital prod3 = new ProductoDigital("Tomb Raider", 45, 10.23);
        ProductoDigital prod4 = new ProductoDigital("God of war", 60, 25.40);

        //Crear pedidos
        Pedido ped1 = new Pedido(c1);
        Pedido ped2 = new Pedido(c2);

        //Agregar productos a cada pedido
        ped1.agregarProducto(prod1);
        ped1.agregarProducto(prod3);
        ped2.agregarProducto(prod2);
        ped2.agregarProducto(prod4);

        //Mostrar los pedidos
        ped1.mostrarResumen();
        ped2.mostrarResumen();
    }
}
