/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public abstract class Menu {
    
    public static int printMenu(){
        int opc;
        Scanner rd =new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.- Pocion magica");
        System.out.println("2.- Procesos");
        System.out.print("Escoge una opcion : ");
        opc = rd.nextInt();
        
        return opc;
    }
    
}
