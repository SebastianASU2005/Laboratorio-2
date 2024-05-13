public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        // Añadir algunos productos al almacén
        Producto alimento = new Producto("Manzanas", 2.5);
        Producto electronico = new Producto("Smartphone", 699.99);
        Producto mueble = new Producto("Silla", 49.99);

        almacen.añadirProducto(alimento);
        almacen.añadirProducto(electronico);
        almacen.añadirProducto(mueble);

        // Imprimir los productos almacenados
        System.out.println("Productos en el almacén:");
        almacen.imprimirProductos();
    }
}