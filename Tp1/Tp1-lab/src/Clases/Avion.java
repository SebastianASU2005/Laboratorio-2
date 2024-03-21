package Clases;

public class Avion {
    private int kg;
    private Vuelo vuelo;
    private Piloto piloto;
    private Flota flota;
    private Azafata azafata;


    public Avion() {
    }

    public Avion(int kg, Piloto piloto, Flota flota) {
        this.kg = kg;
        this.piloto = piloto;
        this.flota = flota;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
    public void ReservarVuelo(Vuelo v1){
        this.vuelo=v1;
    }
    public void AsignarAzafata(Azafata az1){
        this.azafata=az1;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "kg=" + kg +
                ", vuelo=" + vuelo +
                ", piloto=" + piloto +
                ", flota=" + flota +
                ", azafata=" + azafata +
                '}';
    }
}
