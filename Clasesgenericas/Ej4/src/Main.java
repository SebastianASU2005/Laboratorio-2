public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        // Añadir algunos elementos al almacén
        Producto producto1 = new Producto("Manzanas", 2.5);
        Producto producto2 = new Producto("Smartphone", 699.99);
        Producto producto3 = new Producto("Silla", 49.99);

        almacen.añadirElemento(producto1);
        almacen.añadirElemento(producto2);
        almacen.añadirElemento(producto3);

        // Imprimir los elementos almacenados
        System.out.println("Elementos en el almacén:");
        almacen.imprimirElementos();
    }
}