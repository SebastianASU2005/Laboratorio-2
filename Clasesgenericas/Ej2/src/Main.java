public class Main {
    public static void main(String[] args) {
        // Crear una pila de enteros
        PilaArray<Integer> pilaEnteros = new PilaArray<>(5);

        // Añadir algunos elementos a la pila
        pilaEnteros.añadir(1);
        pilaEnteros.añadir(2);
        pilaEnteros.añadir(3);

        // Imprimir la pila
        System.out.println("Pila de enteros:");
        while (!pilaEnteros.estaVacia()) {
            System.out.println("Elemento: " + pilaEnteros.extraer());
        }

        // Crear una pila de cadenas
        PilaArray<String> pilaCadenas = new PilaArray<>(3);

        // Añadir algunos elementos a la pila
        pilaCadenas.añadir("Hola");
        pilaCadenas.añadir("Mundo");

        // Imprimir la pila
        System.out.println("\nPila de cadenas:");
        while (!pilaCadenas.estaVacia()) {
            System.out.println("Elemento: " + pilaCadenas.extraer());
        }
    }
    }
