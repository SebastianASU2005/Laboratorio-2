package Clases;

public class Flota {
    private int cantidad;

    public Flota() {
    }

    public Flota(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return
                " cantidad=" + cantidad ;
    }
}
