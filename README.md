# Sistema de Gestión de Pedidos

Proyecto desarrollado para la asignatura de Programación Orientada a Objetos.  
El objetivo es implementar un sistema capaz de gestionar clientes, productos y pedidos, aplicando herencia, agregación/asociación y encapsulación, además de representar el diseño mediante diagramas UML.

## Getting Started

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en un IDE compatible con Java (Eclipse, IntelliJ, NetBeans o VS Code con extensión Java).
3. Asegurarse de que el proyecto contiene la estructura de paquetes y los archivos `.java`.
4. Ejecutar la clase `Main`:
   - Botón derecho → **Run**
   - o ejecutar desde la consola con:
     ```sh
     javac *.java
     java Main
     ```

## Folder Structure

/src
├── Producto.java
├── ProductoFisico.java
├── ProductoDigital.java
├── Cliente.java
├── Pedido.java
└── Main.java

/uml
├── diagrama_inicial.png
└── diagrama_ingenieria_inversa.png

README.md

## Resumen Funcionamiento

 **Producto** es la clase base abstracta con atributos comunes: `nombre` y `precio`.
- **ProductoFisico** y **ProductoDigital** extienden a Producto implementando su propia lógica de `calcularPrecioFinal()`.
- **Cliente** almacena la información básica de cada comprador.
- **Pedido** contiene:
  - un cliente asociado  
  - una lista de productos  
  - métodos para agregar productos, calcular total y mostrar un resumen del pedido.
- La clase **Main** crea clientes, productos, pedidos y muestra el funcionamiento completo del sistema.
