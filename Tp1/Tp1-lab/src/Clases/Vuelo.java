package Clases;

public class Vuelo {
    private String origen;
    private  String destino;
    private double tiempo;
    private  Reserva reserva;


    public Vuelo() {
    }

    public Vuelo(String origen, String destino, double tiempo) {
        this.origen = origen;
        this.destino = destino;
        this.tiempo = tiempo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public Reserva getReserva() {
        return reserva;
    }
    public void Reservar(Reserva r1){
        this.reserva=r1;
    }


    @Override
    public String toString() {
        return "Vuelo{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", tiempo=" + tiempo +
                ", reserva=" + reserva +
                '}';
    }
}
