/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author A13003975
 */
public abstract class Menu {

    public static int PrintMenu() {
        int opc;
        Scanner read = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("---------------MENU--------------");
        System.out.println("-Practica de Estructura de datos-");
        System.out.println("---------------------------------");
        System.out.println("1.- Ingresar polinomios.");
        System.out.println("2.- Sumar polinomios.");
        System.out.println("3.- Multiplicar polinomios.");
        System.out.println("4.- Salir.");
        System.out.print("Ingrese opcion: ");
        opc = read.nextInt();
        return opc;
    }
}
