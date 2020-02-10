/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Modelo.Pila;

/**
 *
 * @author Javier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila a = new Pila(5);
        
        a.Push(5);
        a.Push(5);
        a.Push(2);
        a.Push(7);
        a.Push(9);
        
        a.printPila();
        
        System.out.println(""+a.Pop());
        
        a.printPila();
    }
    
}
