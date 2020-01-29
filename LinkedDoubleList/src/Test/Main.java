/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Menu.Menu;
import Model.Node;
import Model.LinkedDouble;
import java.util.Scanner;

/**
 *
 * @author A13003975
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaExpo = new Scanner(System.in);
        Scanner entradaCoef = new Scanner(System.in);
        int numEL1;
        int numEL2;
        int c;
        int e;
        int opc;
        Node aux;
        LinkedDouble L1 = new LinkedDouble();
        LinkedDouble L2 = new LinkedDouble();
        LinkedDouble L3 = new LinkedDouble();
//        L1.addOrder(5,6);
//        L2.addOrder(-5,6);
//        L1.printList();
//        L1.addOrder(5,6);
//        L1.addOrder(5,7);
//        L1.addOrder(5,8);
//        L1.addOrder(2,5);
//        L1.printList();
        opc = Menu.PrintMenu();
        while (opc != 4) {
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el numero de elementos del primer polinomio: ");
                    numEL1 = entradaInt.nextInt();
                    for (int i = 0; i < numEL1; i++) {
                        System.out.print("Ingrese el coeficiente de x: ");
                        c = entradaCoef.nextInt();
                        System.out.print("Ingrese el exponente de x: ");
                        e = entradaExpo.nextInt();
                        L1.addOrder(c, e);
                    }

                    System.out.println("Ingrese el numero de elementos del segundo polinomio: ");
                    numEL2 = entradaInt.nextInt();
                    for (int i = 0; i < numEL2; i++) {
                        System.out.print("Ingrese el coeficiente de x: ");
                        c = entradaCoef.nextInt();
                        System.out.print("Ingrese el exponente de x: ");
                        e = entradaExpo.nextInt();
                        L2.addOrder(c, e);
                    }
                    System.out.println("Polinomio 1: ");
                    L1.printList();
                    System.out.println("\nPolinomio 2: ");
                    L2.printList();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Suma de polinomios: ");
                    L3 = L3.sumar(L1, L2);
                    L3.printList();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Multiplicacion de polinomios: ");
                    L3 = L3.multiplicar(L1, L2);
                    L3.printList();
                    System.out.println(" ");
                    break;
            }
            opc = Menu.PrintMenu();
        }
    }
}
