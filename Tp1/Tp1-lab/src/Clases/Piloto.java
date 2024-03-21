package Clases;

public class Piloto extends Persona implements Volador{
    private String titulo;

    public Piloto() {
    }

    public Piloto(String nombre, String apellido, int dni, String titulo) {
        super(nombre, apellido, dni);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public void Volar(){
        System.out.println("El piloto esta listo para volar");
    }

    @Override
    public String toString() {
        return " ("+super.toString()+" Titulo: "+titulo+" )";
    }
}
