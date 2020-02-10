/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Menu.Menu;
import Modelo.Pila;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int opc;
        int size;
        int value;
        

        opc = Menu.printMenu();
  
        while (opc != 3) {
            switch (opc) {
                case 1:
                    System.out.println("Opcion 1");
                    System.out.print("Ingrese el tamaño de la pila: ");
                    size = rd.nextInt();
                    Pila a = new Pila(size);
                    a.maximun();
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    System.out.println("Ingrese el tamaño de la pila 1: ");
                    size = rd.nextInt();
                    Pila p1 = new Pila(size);
                    for (int i = 0; i < size; i++) {
                        value = rd.nextInt();
                        p1.Push(value);
                    }
                    System.out.println("Ingrese el tamaño de la pila 2: ");
                    size = rd.nextInt();
                    Pila p2 = new Pila(size);
                    for (int i = 0; i < size; i++) {
                        value = rd.nextInt();
                        p2.Push(value);
                    }
                    System.out.println("Ingrese el tamaño de la pila 3: ");
                    size = rd.nextInt();
                    Pila p3 = new Pila(size);
                    for (int i = 0; i < size; i++) {
                        value = rd.nextInt();
                        p3.Push(value);
                    }
                    Pila.equalStack(p1, p2, p3);
                    break;
                default:
                    break;

            }
            opc = Menu.printMenu();
        }
    }

}
