import Clases.*;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Piloto p1=new Piloto("Sebastian","Astudillo",7655762,"Piloto experto");
        Flota f1=new Flota(100);
        Vuelo v1=new Vuelo("Bs.As","España",6);
        Reserva r1=new Reserva(1200);
        Avion a1=new Avion(8000,p1,f1);
        System.out.println("Piloto asignado");
        Azafata az1=new Azafata("Paula","Rodriguez",34567231,3,45);
        a1.AsignarAzafata(az1);
        System.out.println("Azafata asignada");
        v1.Reservar(r1);
        a1.ReservarVuelo(v1);
        System.out.println("Flota lista");
        System.out.println("Vuelo listo");
        p1.Volar();
        System.out.println(a1);
    }
}