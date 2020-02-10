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

        opc = Menu.printMenu();

        while (opc != 4) {
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el tamaño de la pila: ");
                    size = rd.nextInt();
                    Pila a = new Pila(size);
                    a.maximun();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;

            }
            opc = Menu.printMenu();
        }
    }

}
