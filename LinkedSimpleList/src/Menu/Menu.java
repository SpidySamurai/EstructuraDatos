package Menu;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEFT4
 */
public abstract class Menu {
    
    public static int PrintMenu(){
        int opc;
        Scanner read = new Scanner(System.in);
        
        System.out.println("---------------------------------");
        System.out.println("---------------MENU--------------");
        System.out.println("-Practica de Estructura de datos-");
        System.out.println("---------------------------------");
        System.out.println("1.- Ingresar listas.");
        System.out.println("2.- Eliminar datos repetidos.");
        System.out.println("3.- Concatenar listas y eliminar datos repetidos.");
        System.out.println("4.- Salir.");
        System.out.print("Ingrese opcion: ");
        opc = read.nextInt();
        return opc;
    }
    
}
