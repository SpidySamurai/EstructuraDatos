/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javier.demo;

import Menu.Menu;
import com.javier.model.Hashtable;
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
        int element;
        int size;
        int opc;
        System.out.print("Ingrese el tamaño de la HashTable: ");
        size = rd.nextInt();

        size = Main.primoCercano(size);

        Hashtable hash = new Hashtable(size);
        //Rellenamos la Hash :)
        for (int i = 0; i < 10; i++) {
            element = (int) (Math.random() * 100 + 1);
            hash.insertChained(element);
        }
        hash.printHash();
        opc = Menu.printMenu();
        while (opc != 4) {
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el numero a insertar en la Hash Table: ");
                    element = rd.nextInt();
                    hash.insertChained(element);
                    break;
                case 2:
                    System.out.print("Ingrese el numero a eliminar de la Hash Tabble: ");
                    element = rd.nextInt();
                    hash.deleteChained(element);
                    break;
                case 3:
                    System.out.print("Ingrese el elemnto a buscar : ");
                    element = rd.nextInt();
                    hash.searchChained(element);
                    break;

                default:
                    System.out.println("Ingrese una opción valida:)");
                    break;
            }
            hash.printHash();
            opc = Menu.printMenu();
        }
        hash.printHash();
    }

    public static boolean esPrimo(int numero) {
        int aux = numero - 1;

        while (numero % aux != 0) {
//            System.out.println(aux);

            aux--;
        }
        if (aux == 1) {
            return true;
        } else {
            return false;
        }

    }

    public static int primoCercano(int size) {
        while (!Main.esPrimo(size)) {
            size++;
        }
        System.out.println("Se asigno el numero primo mas cercano: " + size);
        return size;
    }
}
