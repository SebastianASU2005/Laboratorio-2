import java.util.NoSuchElementException;
public class PilaArray<E> {
    private E[] array;
    private int contador;

    @SuppressWarnings("unchecked")
    public PilaArray(int capacidadMaxima) {
        array = (E[]) new Object[capacidadMaxima];
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public boolean añadir(E elemento) {
        if (contador < array.length) {
            array[contador] = elemento;
            contador++;
            return true;
        } else {
            return false; // No hay espacio libre
        }
    }

    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return array[contador - 1];
    }

    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        contador--;
        return array[contador];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < contador; i++) {
            sb.append(array[i]);
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

