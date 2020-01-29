/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Menu.Menu;
import Model.LinkedList;
import java.util.Scanner;

/**
 *
 * @author A13003975
 */
public class Main {
    public static void main(String[] args) {   
        Scanner read = new Scanner(System.in);
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        LinkedList ab = new LinkedList();
        int opc;
        int value;
        int tamanio;
        
        opc = Menu.PrintMenu();
        
        while(opc != 4){
            switch(opc){
                case 1:
                    System.out.print("Ingrese el tamanio de la lista 1: ");
                    tamanio = read.nextInt();
                    for(int i = 0;i< tamanio;i++){
                        value = read.nextInt();
                        a.addOrder(value);
                    }

                    a.printList();

                    System.out.print("Ingrese el tamanio de la lista 2: ");
                    tamanio = read.nextInt();
                    for(int i = 0;i< tamanio;i++){
                        value = read.nextInt();
                        b.addOrder(value);
                    }
                    b.printList();
                    break;
                case 2:
                    System.out.println("Eliminando datos repetidos....");
                    System.out.println("Lista 1:");                   
                    a.deleteRep();
                    a.printList();
                    System.out.println("Lista 2:");       
                    b.deleteRep();
                    b.printList();
                    break;
                case 3:
                    System.out.println("Concatenando datos listas y eliminando datos repetidos");
                    ab = ab.concat(a, b);
                    ab.deleteRep();
                    ab.printList();
                    break;
                default: 
                    System.out.println("Ingrese una opcion valida.");
                    break;
        }  
            opc = Menu.PrintMenu();
        }
    }  
}
