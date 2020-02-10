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
        Scanner rd = new Scanner(System.in);
        int opc;
        
        System.out.println("Menu");
        System.out.println("1.-Maximun Element.");
        System.out.println("2.-");
        
        System.out.print("Escoga opcion: ");
        opc = rd.nextInt();
        
        return opc;
    }
}
