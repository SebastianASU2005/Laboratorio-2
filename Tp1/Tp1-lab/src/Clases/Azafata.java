package Clases;

public class Azafata extends Persona{
    private int experiencia;
    private int vuelosrealizados;

    public Azafata() {
    }

    public Azafata(String nombre, String apellido, int dni, int experiencia, int vuelosrealizados) {
        super(nombre, apellido, dni);
        this.experiencia = experiencia;
        this.vuelosrealizados = vuelosrealizados;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVuelosrealizados() {
        return vuelosrealizados;
    }

    public void setVuelosrealizados(int vuelosrealizados) {
        this.vuelosrealizados = vuelosrealizados;
    }

    @Override
    public String toString() {
        return "Azafata{" +
                "experiencia=" + experiencia + " años"+
                ", vuelosrealizados=" + vuelosrealizados +
                '}';
    }
}
