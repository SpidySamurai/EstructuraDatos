package model;

import java.util.LinkedList;

public class Equipo {

    private String nombreEquipo;
    private int precioPropuesto;
    private int tiempoRespuesta;
    private int difPrecio;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;

    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setPrecioPropuesto(int precioPropuesto) {
        this.precioPropuesto = precioPropuesto;
    }

    public void setTiempoRespuesta(int tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public void setDifPrecio(int difPrecio) {
        this.difPrecio = difPrecio;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getPrecioPropuesto() {
        return precioPropuesto;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public int getDifPrecio() {
        return this.difPrecio;
    }

    public static void printEquipos(LinkedList<Equipo> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Equipo 1: " + a.get(i).getNombreEquipo() + " Precio propuesto: " + a.get(i).getPrecioPropuesto() + " Tiempo: " + a.get(i).getTiempoRespuesta() + " dif; " + a.get(i).getDifPrecio());
        }
    }

}
