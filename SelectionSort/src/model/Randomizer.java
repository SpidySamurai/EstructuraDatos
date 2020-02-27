/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;


/**
 *
 * @author A13003975
 */
public abstract class Randomizer {
 
    
    public static void generarTiempo(LinkedList<Equipo> a){
        int numeroRandom;
        
        for (int i = 0; i < a.size(); i++) {
            numeroRandom = (int)(Math.random()*1000+1);
            a.get(i).setTiempoRespuesta(numeroRandom);
        }
        
//        return a;
//        
    }
    
    public static void generarPrecio(LinkedList<Equipo> a){
        int numeroRandom;
        for (int i = 0; i < a.size(); i++) {
            numeroRandom = (int) (Math.random()*1000+1);
            a.get(i).setPrecioPropuesto(numeroRandom);
            
        }
    }
    
    public static void generarDif(LinkedList<Equipo> a,int price){
        for (int i = 0; i < a.size(); i++) {
            a.get(i).setDifPrecio(Math.abs(price-a.get(i).getPrecioPropuesto()));
        }
    }
    
}
