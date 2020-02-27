package model;

import java.util.Scanner;

public abstract class Menu {

    public static int printMenu() {
        int opc;
        Scanner rd = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.- Ingresar lista de premios");
        System.out.println("2.- Registrar equipos");
        System.out.println("3.- Generar rondas");
        System.out.println("4.- Salir\n");
        System.out.print("Ingrese opcion: ");
        opc = rd.nextInt();

        return opc;
    }
}
