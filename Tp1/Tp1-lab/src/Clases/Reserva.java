package Clases;

public class Reserva {
    private int precio;

    public Reserva() {
    }

    public Reserva(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
                " precio=" + precio;
    }
}
